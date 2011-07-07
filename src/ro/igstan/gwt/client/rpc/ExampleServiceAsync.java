package ro.igstan.gwt.client.rpc;

import java.util.Map;

import com.google.gwt.user.client.rpc.AsyncCallback;

import ro.igstan.gwt.shared.Columns;
import ro.igstan.gwt.shared.Order;
import ro.igstan.gwt.shared.OrderingMap;

public interface ExampleServiceAsync {
  void hello(OrderingMap<Columns> map, int n, AsyncCallback<String> callback);
  void hello(Map<Columns, Order> map, int n, AsyncCallback<String> callback);
}
