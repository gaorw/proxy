package ref.proxy.pub;


public class ProxyLocator {

  private static ProxyLocator instance;

  private ProxyLocator() {

  }

  public static ProxyLocator getInstance() {
    if (ProxyLocator.instance == null) {
      ProxyLocator.instance = new ProxyLocator();
    }
    return ProxyLocator.instance;
  }

  public Object lookup(String name) {
    try {
      return ProxyContainer.get(name);
    }
    catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }
}
