package ref.proxy.pub;

import java.lang.reflect.Method;

/**
 * ��̬����ӿ�
 */
public interface IDynamicProxy {

  public Object delegate(Object obj, Method method, Object[] args);

}
