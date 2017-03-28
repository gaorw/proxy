package ref.proxy.pub;

import ref.proxy.itf.IWorkMachine;

/**
 * 静态代理实现示例
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
