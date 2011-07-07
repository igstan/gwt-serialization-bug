package ro.igstan.gwt.server.rpc;

import java.util.Map;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import ro.igstan.gwt.client.rpc.ExampleService;
import ro.igstan.gwt.shared.Columns;
import ro.igstan.gwt.shared.Order;
import ro.igstan.gwt.shared.OrderingMap;

public class ExampleServiceImpl extends RemoteServiceServlet implements ExampleService {

  private static final long serialVersionUID = -970694017584304874L;

  @Override
  public String hello(OrderingMap<Columns> map, int n) {
    return map.get(Columns.NAME).toString();
  }

  @Override
  public String hello(Map<Columns, Order> map, int n) {
    return map.get(Columns.NAME).toString();
  }
}
