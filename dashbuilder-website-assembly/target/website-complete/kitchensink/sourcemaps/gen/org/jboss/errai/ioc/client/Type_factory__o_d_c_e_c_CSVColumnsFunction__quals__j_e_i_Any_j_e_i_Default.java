package org.jboss.errai.ioc.client;

import java.util.List;
import java.util.function.Function;
import javax.enterprise.context.ApplicationScoped;
import org.dashbuilder.client.external.csv.CSVColumnsFunction;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;

public class Type_factory__o_d_c_e_c_CSVColumnsFunction__quals__j_e_i_Any_j_e_i_Default extends Factory<CSVColumnsFunction> { private class Type_factory__o_d_c_e_c_CSVColumnsFunction__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends CSVColumnsFunction implements Proxy<CSVColumnsFunction> {
    private final ProxyHelper<CSVColumnsFunction> proxyHelper = new ProxyHelperImpl<CSVColumnsFunction>("Type_factory__o_d_c_e_c_CSVColumnsFunction__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final CSVColumnsFunction instance) {

    }

    public CSVColumnsFunction asBeanType() {
      return this;
    }

    public void setInstance(final CSVColumnsFunction instance) {
      proxyHelper.setInstance(instance);
    }

    public void clearInstance() {
      proxyHelper.clearInstance();
    }

    public void setProxyContext(final Context context) {
      proxyHelper.setProxyContext(context);
    }

    public Context getProxyContext() {
      return proxyHelper.getProxyContext();
    }

    public Object unwrap() {
      return proxyHelper.getInstance(this);
    }

    public boolean equals(Object obj) {
      obj = Factory.maybeUnwrapProxy(obj);
      return proxyHelper.getInstance(this).equals(obj);
    }

    @Override public List apply(String t) {
      if (proxyHelper != null) {
        final CSVColumnsFunction proxiedInstance = proxyHelper.getInstance(this);
        final List retVal = proxiedInstance.apply(t);
        return retVal;
      } else {
        return super.apply(t);
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final CSVColumnsFunction proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_d_c_e_c_CSVColumnsFunction__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(CSVColumnsFunction.class, "Type_factory__o_d_c_e_c_CSVColumnsFunction__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { CSVColumnsFunction.class, Object.class, Function.class });
  }

  public CSVColumnsFunction createInstance(final ContextManager contextManager) {
    final CSVColumnsFunction instance = new CSVColumnsFunction();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public Proxy createProxy(final Context context) {
    final Proxy<CSVColumnsFunction> proxyImpl = new Type_factory__o_d_c_e_c_CSVColumnsFunction__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }
}