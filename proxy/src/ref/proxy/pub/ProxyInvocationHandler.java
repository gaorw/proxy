package ref.proxy.pub;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyInvocationHandler implements InvocationHandler {

  private IDynamicProxy dynamicProxy = new DynamicProxyImpl();

  private ComponentMate mate;

  private Object obj;

  public ProxyInvocationHandler(
      ComponentMate mate) {
    this.mate = mate;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args)
      throws Throwable {
    this.obj = this.mate.getImplementation().newInstance();
    return this.dynamicProxy.delegate(this.obj, method, args);
  }
}
