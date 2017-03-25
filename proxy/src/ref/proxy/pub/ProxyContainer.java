package ref.proxy.pub;

import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

import ref.proxy.impl.WorkMachineImpl;
import ref.proxy.itf.IWorkMachine;
import ref.proxy.pub.ComponentMate;
import ref.proxy.pub.DynamicProxyImpl;
import ref.proxy.pub.ProxyInvocationHandler;

/**
 * 代理容器服务
 */
public class ProxyContainer {

  private static Map<String, ComponentMate> porxyMap;

  public static Object get(String name) throws Exception {
    if (ProxyContainer.porxyMap == null || ProxyContainer.porxyMap.size() == 0) {
      ProxyContainer.init();
    }
    ComponentMate mate = ProxyContainer.porxyMap.get(name);
    if (mate == null) {
      throw new Exception("ComponentMateNotFoundException");
    }

    ClassLoader loader = DynamicProxyImpl.class.getClassLoader();
    Class<?>[] interfaces = mate.getInterfaces();
    ProxyInvocationHandler handler = new ProxyInvocationHandler(mate);

    Object instance = Proxy.newProxyInstance(loader, interfaces, handler);
    return instance;
  }

  /**
   * 容器初始化
   */
  private static void init() {
    ProxyContainer.porxyMap = new HashMap<String, ComponentMate>(10);
    ComponentMate mate = new ComponentMate();
    mate.setItfService(IWorkMachine.class);
    mate.setImplementation(WorkMachineImpl.class);
    ProxyContainer.porxyMap.put(mate.getAlais(), mate);
  }

}
