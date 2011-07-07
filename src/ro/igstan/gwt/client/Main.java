package ro.igstan.gwt.client;

import java.util.LinkedHashMap;
import java.util.Map;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;

import ro.igstan.gwt.client.rpc.ExampleService;
import ro.igstan.gwt.client.rpc.ExampleServiceAsync;
import ro.igstan.gwt.shared.Columns;
import ro.igstan.gwt.shared.Order;
import ro.igstan.gwt.shared.OrderingMap;

public class Main implements EntryPoint {

  @Override
  public void onModuleLoad() {
    final ExampleServiceAsync service = GWT.create(ExampleService.class);

    final OrderingMap<Columns> ordering = new OrderingMap<Columns>();
    ordering.put(Columns.NAME, Order.DESC);

    service.hello(ordering, 3, new AsyncCallback<String>() {

      @Override
      public void onSuccess(String result) {
        Window.alert(result);
      }

      @Override
      public void onFailure(Throwable caught) {
        Window.alert(caught.getMessage());
      }
    });


    final Map<Columns,Order> map = new LinkedHashMap<Columns, Order>();
    map.put(Columns.NAME, Order.DESC);

    service.hello(map, 3, new AsyncCallback<String>() {

      @Override
      public void onSuccess(String result) {
        Window.alert(result);
      }

      @Override
      public void onFailure(Throwable caught) {
        Window.alert(caught.getMessage());
      }
    });
  }
}
