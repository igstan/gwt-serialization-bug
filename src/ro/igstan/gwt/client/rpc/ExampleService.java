package ro.igstan.gwt.client.rpc;

import java.util.Map;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import ro.igstan.gwt.shared.Columns;
import ro.igstan.gwt.shared.Order;
import ro.igstan.gwt.shared.OrderingMap;

@RemoteServiceRelativePath("example")
public interface ExampleService extends RemoteService {
  String hello(Map<Columns, Order> map, int n);
  String hello(OrderingMap<Columns> map, int n);
}
