package ref.proxy.test;

import ref.proxy.itf.IWorkMachine;
import ref.proxy.pub.ProxyLocator;

/**
 * 增加同一个容器，一次将相关接口及实现关系加载到容器，我们使用接口就向动态代理类要一个实例
 */
public class DynamicProxyTest {

  public static void main(String[] args) {
    try {
      IWorkMachine service =
          (IWorkMachine) ProxyLocator.getInstance().lookup(
              IWorkMachine.class.getName());
      System.out.println("————>" + service.doWork());
    }
    catch (Exception e) {
      e.printStackTrace();
    }

  }
}
