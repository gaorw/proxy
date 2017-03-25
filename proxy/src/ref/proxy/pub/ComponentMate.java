package ref.proxy.pub;

import java.io.Serializable;

/**
 * ҵ��ӿ���ʵ������Ϣ����(һ���ӿ�һ��ʵ��):<br>
 * 1������Ĭ��Ϊ�ӿ���ȫ����.<br>
 * 2��һ���ӿڶ��ʵ�ֱ���ָ��Ϊʵ����ȫ������<br>
 * 3��һ����ʵ�ֶ���ӿڱ�����ȻΪ�ӿ���ȫ������
 */

public class ComponentMate implements Serializable {

  private static final long serialVersionUID = 3057550583292303943L;

  /**
   * Ĭ�Ͻӿ���ȫ������
   */
  private String alais;

  /**
   * �ӿ�ʵ����
   */
  private Class implementation;

  /**
   * �ӿڷ�����(һ��ʵ���������ʾ���)
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
   *          Ҫ���õ� alais
   */
  public void setAlais(String alais) {
    this.alais = alais;
  }

  /**
   * @param implementation
   *          Ҫ���õ� implementation
   */
  public void setImplementation(Class implementation) {
    this.implementation = implementation;
  }

  /**
   * @param itfService
   *          Ҫ���õ� itfService
   */
  public void setItfService(Class itfService) {
    this.itfService = itfService;
  }
}
