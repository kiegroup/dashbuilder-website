package org.jboss.errai.ioc.client;

import java.util.Collection;
import java.util.Map;
import javax.enterprise.context.ApplicationScoped;
import org.dashbuilder.client.services.SamplesService;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;

public class Type_factory__o_d_c_s_SamplesService__quals__j_e_i_Any_j_e_i_Default extends Factory<SamplesService> { private class Type_factory__o_d_c_s_SamplesService__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends SamplesService implements Proxy<SamplesService> {
    private final ProxyHelper<SamplesService> proxyHelper = new ProxyHelperImpl<SamplesService>("Type_factory__o_d_c_s_SamplesService__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final SamplesService instance) {

    }

    public SamplesService asBeanType() {
      return this;
    }

    public void setInstance(final SamplesService instance) {
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

    @Override public Map samplesByCategory() {
      if (proxyHelper != null) {
        final SamplesService proxiedInstance = proxyHelper.getInstance(this);
        final Map retVal = proxiedInstance.samplesByCategory();
        return retVal;
      } else {
        return super.samplesByCategory();
      }
    }

    @Override public Collection allSamples() {
      if (proxyHelper != null) {
        final SamplesService proxiedInstance = proxyHelper.getInstance(this);
        final Collection retVal = proxiedInstance.allSamples();
        return retVal;
      } else {
        return super.allSamples();
      }
    }

    @Override public boolean isSample(String importID) {
      if (proxyHelper != null) {
        final SamplesService proxiedInstance = proxyHelper.getInstance(this);
        final boolean retVal = proxiedInstance.isSample(importID);
        return retVal;
      } else {
        return super.isSample(importID);
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final SamplesService proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_d_c_s_SamplesService__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(SamplesService.class, "Type_factory__o_d_c_s_SamplesService__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, true, null, true));
    handle.setAssignableTypes(new Class[] { SamplesService.class, Object.class });
  }

  public SamplesService createInstance(final ContextManager contextManager) {
    final SamplesService instance = new SamplesService();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void invokePostConstructs(final SamplesService instance) {
    SamplesService_init(instance);
  }

  public Proxy createProxy(final Context context) {
    final Proxy<SamplesService> proxyImpl = new Type_factory__o_d_c_s_SamplesService__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }

  public native static void SamplesService_init(SamplesService instance) /*-{
    instance.@org.dashbuilder.client.services.SamplesService::init()();
  }-*/;
}