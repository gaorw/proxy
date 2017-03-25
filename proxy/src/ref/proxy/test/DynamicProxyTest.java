package ref.proxy.test;

import ref.proxy.itf.IWorkMachine;
import ref.proxy.pub.ProxyLocator;

/**
 * ����ͬһ��������һ�ν���ؽӿڼ�ʵ�ֹ�ϵ���ص�����������ʹ�ýӿھ���̬������Ҫһ��ʵ��
 */
public class DynamicProxyTest {

  public static void main(String[] args) {
    try {
      IWorkMachine service =
          (IWorkMachine) ProxyLocator.getInstance().lookup(
              IWorkMachine.class.getName());
      System.out.println("��������>" + service.doWork());
    }
    catch (Exception e) {
      e.printStackTrace();
    }

  }
}
