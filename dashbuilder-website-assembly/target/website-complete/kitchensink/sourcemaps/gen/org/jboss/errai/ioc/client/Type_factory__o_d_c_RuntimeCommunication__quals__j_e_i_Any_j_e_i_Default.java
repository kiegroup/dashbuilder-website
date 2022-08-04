package org.jboss.errai.ioc.client;

import java.lang.annotation.Annotation;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Event;
import org.dashbuilder.client.RuntimeCommunication;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;
import org.uberfire.workbench.events.NotificationEvent;

public class Type_factory__o_d_c_RuntimeCommunication__quals__j_e_i_Any_j_e_i_Default extends Factory<RuntimeCommunication> { private class Type_factory__o_d_c_RuntimeCommunication__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends RuntimeCommunication implements Proxy<RuntimeCommunication> {
    private final ProxyHelper<RuntimeCommunication> proxyHelper = new ProxyHelperImpl<RuntimeCommunication>("Type_factory__o_d_c_RuntimeCommunication__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final RuntimeCommunication instance) {

    }

    public RuntimeCommunication asBeanType() {
      return this;
    }

    public void setInstance(final RuntimeCommunication instance) {
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

    @Override public void showError(String message) {
      if (proxyHelper != null) {
        final RuntimeCommunication proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.showError(message);
      } else {
        super.showError(message);
      }
    }

    @Override public void showError(String message, Object error) {
      if (proxyHelper != null) {
        final RuntimeCommunication proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.showError(message, error);
      } else {
        super.showError(message, error);
      }
    }

    @Override public void showWarning(String message) {
      if (proxyHelper != null) {
        final RuntimeCommunication proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.showWarning(message);
      } else {
        super.showWarning(message);
      }
    }

    @Override public void showWarning(String message, Object error) {
      if (proxyHelper != null) {
        final RuntimeCommunication proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.showWarning(message, error);
      } else {
        super.showWarning(message, error);
      }
    }

    @Override public void showSuccess(String message) {
      if (proxyHelper != null) {
        final RuntimeCommunication proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.showSuccess(message);
      } else {
        super.showSuccess(message);
      }
    }

    @Override public void showSuccess(String message, Object error) {
      if (proxyHelper != null) {
        final RuntimeCommunication proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.showSuccess(message, error);
      } else {
        super.showSuccess(message, error);
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final RuntimeCommunication proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_d_c_RuntimeCommunication__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(RuntimeCommunication.class, "Type_factory__o_d_c_RuntimeCommunication__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { RuntimeCommunication.class, Object.class });
  }

  public RuntimeCommunication createInstance(final ContextManager contextManager) {
    final RuntimeCommunication instance = new RuntimeCommunication();
    setIncompleteInstance(instance);
    final Event RuntimeCommunication_wbNotification = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { NotificationEvent.class }, new Annotation[] { });
    registerDependentScopedReference(instance, RuntimeCommunication_wbNotification);
    RuntimeCommunication_Event_wbNotification(instance, RuntimeCommunication_wbNotification);
    setIncompleteInstance(null);
    return instance;
  }

  public Proxy createProxy(final Context context) {
    final Proxy<RuntimeCommunication> proxyImpl = new Type_factory__o_d_c_RuntimeCommunication__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }

  native static Event RuntimeCommunication_Event_wbNotification(RuntimeCommunication instance) /*-{
    return instance.@org.dashbuilder.client.RuntimeCommunication::wbNotification;
  }-*/;

  native static void RuntimeCommunication_Event_wbNotification(RuntimeCommunication instance, Event<NotificationEvent> value) /*-{
    instance.@org.dashbuilder.client.RuntimeCommunication::wbNotification = value;
  }-*/;
}