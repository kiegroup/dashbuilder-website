package org.jboss.errai.ioc.client;

import javax.enterprise.context.ApplicationScoped;
import org.dashbuilder.displayer.client.component.ExternalComponentDispatcher;
import org.dashbuilder.displayer.client.component.ExternalComponentListener;
import org.dashbuilder.displayer.external.ExternalComponentMessage;
import org.dashbuilder.displayer.external.ExternalComponentMessageHelper;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;

public class Type_factory__o_d_d_c_c_ExternalComponentDispatcher__quals__j_e_i_Any_j_e_i_Default extends Factory<ExternalComponentDispatcher> { private class Type_factory__o_d_d_c_c_ExternalComponentDispatcher__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends ExternalComponentDispatcher implements Proxy<ExternalComponentDispatcher> {
    private final ProxyHelper<ExternalComponentDispatcher> proxyHelper = new ProxyHelperImpl<ExternalComponentDispatcher>("Type_factory__o_d_d_c_c_ExternalComponentDispatcher__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final ExternalComponentDispatcher instance) {

    }

    public ExternalComponentDispatcher asBeanType() {
      return this;
    }

    public void setInstance(final ExternalComponentDispatcher instance) {
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

    @Override public void setup() {
      if (proxyHelper != null) {
        final ExternalComponentDispatcher proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.setup();
      } else {
        super.setup();
      }
    }

    @Override public void register(ExternalComponentListener listener) {
      if (proxyHelper != null) {
        final ExternalComponentDispatcher proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.register(listener);
      } else {
        super.register(listener);
      }
    }

    @Override public void unregister(ExternalComponentListener listener) {
      if (proxyHelper != null) {
        final ExternalComponentDispatcher proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.unregister(listener);
      } else {
        super.unregister(listener);
      }
    }

    @Override public void onMessage(ExternalComponentMessage message) {
      if (proxyHelper != null) {
        final ExternalComponentDispatcher proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.onMessage(message);
      } else {
        super.onMessage(message);
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final ExternalComponentDispatcher proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_d_d_c_c_ExternalComponentDispatcher__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(ExternalComponentDispatcher.class, "Type_factory__o_d_d_c_c_ExternalComponentDispatcher__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { ExternalComponentDispatcher.class, Object.class });
  }

  public ExternalComponentDispatcher createInstance(final ContextManager contextManager) {
    final ExternalComponentDispatcher instance = new ExternalComponentDispatcher();
    setIncompleteInstance(instance);
    final ExternalComponentMessageHelper ExternalComponentDispatcher_messageHelper = (ExternalComponentMessageHelper) contextManager.getInstance("Producer_factory__o_d_d_e_ExternalComponentMessageHelper__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ExternalComponentDispatcher_messageHelper);
    ExternalComponentDispatcher_ExternalComponentMessageHelper_messageHelper(instance, ExternalComponentDispatcher_messageHelper);
    setIncompleteInstance(null);
    return instance;
  }

  public void invokePostConstructs(final ExternalComponentDispatcher instance) {
    instance.setup();
  }

  public Proxy createProxy(final Context context) {
    final Proxy<ExternalComponentDispatcher> proxyImpl = new Type_factory__o_d_d_c_c_ExternalComponentDispatcher__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }

  native static ExternalComponentMessageHelper ExternalComponentDispatcher_ExternalComponentMessageHelper_messageHelper(ExternalComponentDispatcher instance) /*-{
    return instance.@org.dashbuilder.displayer.client.component.ExternalComponentDispatcher::messageHelper;
  }-*/;

  native static void ExternalComponentDispatcher_ExternalComponentMessageHelper_messageHelper(ExternalComponentDispatcher instance, ExternalComponentMessageHelper value) /*-{
    instance.@org.dashbuilder.displayer.client.component.ExternalComponentDispatcher::messageHelper = value;
  }-*/;
}