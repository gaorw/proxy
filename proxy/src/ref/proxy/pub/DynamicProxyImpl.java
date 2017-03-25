package ref.proxy.pub;

import java.lang.reflect.Method;

/**
 * 动态代理接口实现
 */
public class DynamicProxyImpl implements IDynamicProxy {

  @Override
  public Object delegate(Object obj, Method method, Object[] args) {
    Object result = null;
    try {
      result = method.invoke(obj, args);
    }
    catch (Exception e) {
      e.printStackTrace();
    }
    return result;
  }
}
