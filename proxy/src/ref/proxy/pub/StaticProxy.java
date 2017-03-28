package ref.proxy.pub;

import ref.proxy.itf.IWorkMachine;

/**
 * ��̬����ʵ��ʾ��
 */
public class StaticProxy implements IWorkMachine {

  private IWorkMachine service;

  @Override
  public String doWork() {
    return this.service.doWork();
  }

  public IWorkMachine getService() {
    return this.service;
  }

  public void setService(IWorkMachine service) {
    this.service = service;
  }

}
