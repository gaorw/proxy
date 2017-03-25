package ref.proxy.pub;

import java.lang.reflect.Method;

/**
 * 动态代理接口
 */
public interface IDynamicProxy {

  public Object delegate(Object obj, Method method, Object[] args);

}
