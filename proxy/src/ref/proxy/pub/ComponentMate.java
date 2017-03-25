package ref.proxy.pub;

import java.io.Serializable;

/**
 * 业务接口与实现类信息配置(一个接口一个实现):<br>
 * 1、别名默认为接口完全类名.<br>
 * 2、一个接口多个实现别名指定为实现完全类名。<br>
 * 3、一个类实现多个接口别名仍然为接口完全类名。
 */

public class ComponentMate implements Serializable {

  private static final long serialVersionUID = 3057550583292303943L;

  /**
   * 默认接口完全性类名
   */
  private String alais;

  /**
   * 接口实现类
   */
  private Class implementation;

  /**
   * 接口服务类(一个实现类可以显示多个)
   */
  private Class itfService;

  /**
   * @return alais
   */
  public String getAlais() {
    if (this.alais == null && this.itfService != null) {
      this.alais = this.itfService.getName();
    }
    return this.alais;
  }

  /**
   * @return implementation
   */
  public Class getImplementation() {
    return this.implementation;
  }

  public Class<?>[] getInterfaces() {
    return this.implementation.getInterfaces();
  }

  /**
   * @return itfService
   */
  public Class getItfService() {
    return this.itfService;
  }

  /**
   * @param alais
   *          要设置的 alais
   */
  public void setAlais(String alais) {
    this.alais = alais;
  }

  /**
   * @param implementation
   *          要设置的 implementation
   */
  public void setImplementation(Class implementation) {
    this.implementation = implementation;
  }

  /**
   * @param itfService
   *          要设置的 itfService
   */
  public void setItfService(Class itfService) {
    this.itfService = itfService;
  }
}
