package org.jboss.errai.ioc.client;

import javax.enterprise.context.ApplicationScoped;
import org.dashbuilder.displayer.client.component.ExternalComponentMessageHelperProducer;
import org.dashbuilder.displayer.external.ExternalComponentMessageHelper;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;

public class Type_factory__o_d_d_c_c_ExternalComponentMessageHelperProducer__quals__j_e_i_Any_j_e_i_Default extends Factory<ExternalComponentMessageHelperProducer> { private class Type_factory__o_d_d_c_c_ExternalComponentMessageHelperProducer__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends ExternalComponentMessageHelperProducer implements Proxy<ExternalComponentMessageHelperProducer> {
    private final ProxyHelper<ExternalComponentMessageHelperProducer> proxyHelper = new ProxyHelperImpl<ExternalComponentMessageHelperProducer>("Type_factory__o_d_d_c_c_ExternalComponentMessageHelperProducer__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final ExternalComponentMessageHelperProducer instance) {

    }

    public ExternalComponentMessageHelperProducer asBeanType() {
      return this;
    }

    public void setInstance(final ExternalComponentMessageHelperProducer instance) {
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

    @Override public ExternalComponentMessageHelper produce() {
      if (proxyHelper != null) {
        final ExternalComponentMessageHelperProducer proxiedInstance = proxyHelper.getInstance(this);
        final ExternalComponentMessageHelper retVal = proxiedInstance.produce();
        return retVal;
      } else {
        return super.produce();
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final ExternalComponentMessageHelperProducer proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_d_d_c_c_ExternalComponentMessageHelperProducer__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(ExternalComponentMessageHelperProducer.class, "Type_factory__o_d_d_c_c_ExternalComponentMessageHelperProducer__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { ExternalComponentMessageHelperProducer.class, Object.class });
  }

  public ExternalComponentMessageHelperProducer createInstance(final ContextManager contextManager) {
    final ExternalComponentMessageHelperProducer instance = new ExternalComponentMessageHelperProducer();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public Proxy createProxy(final Context context) {
    final Proxy<ExternalComponentMessageHelperProducer> proxyImpl = new Type_factory__o_d_d_c_c_ExternalComponentMessageHelperProducer__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }
}