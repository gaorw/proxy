package ref.proxy.impl;

import ref.proxy.itf.IWorkMachine;

public class WorkMachineImpl implements IWorkMachine {

  @Override
  public String doWork() {
    String working = "this is do working!";
    return working;
  }

}
