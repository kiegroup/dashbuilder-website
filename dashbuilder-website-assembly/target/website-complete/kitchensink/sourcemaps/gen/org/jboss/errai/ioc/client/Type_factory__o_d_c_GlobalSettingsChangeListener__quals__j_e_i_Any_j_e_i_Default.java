package org.jboss.errai.ioc.client;

import javax.enterprise.context.ApplicationScoped;
import org.dashbuilder.client.GlobalSettingsChangeListener;
import org.dashbuilder.displayer.GlobalDisplayerSettings;
import org.dashbuilder.displayer.client.GlobalDisplayerSettingsImpl;
import org.dashbuilder.shared.event.UpdatedGlobalSettingsEvent;
import org.jboss.errai.bus.client.ErraiBus;
import org.jboss.errai.enterprise.client.cdi.AbstractCDIEventCallback;
import org.jboss.errai.enterprise.client.cdi.api.CDI;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;

public class Type_factory__o_d_c_GlobalSettingsChangeListener__quals__j_e_i_Any_j_e_i_Default extends Factory<GlobalSettingsChangeListener> { private class Type_factory__o_d_c_GlobalSettingsChangeListener__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends GlobalSettingsChangeListener implements Proxy<GlobalSettingsChangeListener> {
    private final ProxyHelper<GlobalSettingsChangeListener> proxyHelper = new ProxyHelperImpl<GlobalSettingsChangeListener>("Type_factory__o_d_c_GlobalSettingsChangeListener__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final GlobalSettingsChangeListener instance) {

    }

    public GlobalSettingsChangeListener asBeanType() {
      return this;
    }

    public void setInstance(final GlobalSettingsChangeListener instance) {
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

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final GlobalSettingsChangeListener proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_d_c_GlobalSettingsChangeListener__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(GlobalSettingsChangeListener.class, "Type_factory__o_d_c_GlobalSettingsChangeListener__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { GlobalSettingsChangeListener.class, Object.class });
  }

  public void init(final Context context) {
    CDI.subscribe("org.dashbuilder.shared.event.UpdatedGlobalSettingsEvent", new AbstractCDIEventCallback<UpdatedGlobalSettingsEvent>() {
      public void fireEvent(final UpdatedGlobalSettingsEvent event) {
        final GlobalSettingsChangeListener instance = Factory.maybeUnwrapProxy((GlobalSettingsChangeListener) context.getInstance("Type_factory__o_d_c_GlobalSettingsChangeListener__quals__j_e_i_Any_j_e_i_Default"));
        GlobalSettingsChangeListener_onNewGlobalSettings_UpdatedGlobalSettingsEvent(instance, event);
      }
      public String toString() {
        return "Observer: org.dashbuilder.shared.event.UpdatedGlobalSettingsEvent []";
      }
    });
    ErraiBus.get().subscribe("cdi.event:org.dashbuilder.shared.event.UpdatedGlobalSettingsEvent", CDI.ROUTING_CALLBACK);
  }

  public GlobalSettingsChangeListener createInstance(final ContextManager contextManager) {
    final GlobalSettingsChangeListener instance = new GlobalSettingsChangeListener();
    setIncompleteInstance(instance);
    final GlobalDisplayerSettingsImpl GlobalSettingsChangeListener_globalDisplayerSettings = (GlobalDisplayerSettingsImpl) contextManager.getInstance("Type_factory__o_d_d_c_GlobalDisplayerSettingsImpl__quals__j_e_i_Any_j_e_i_Default");
    GlobalSettingsChangeListener_GlobalDisplayerSettings_globalDisplayerSettings(instance, GlobalSettingsChangeListener_globalDisplayerSettings);
    setIncompleteInstance(null);
    return instance;
  }

  public void invokePostConstructs(final GlobalSettingsChangeListener instance) {
    GlobalSettingsChangeListener_injectDarkModeCss(instance);
  }

  public Proxy createProxy(final Context context) {
    final Proxy<GlobalSettingsChangeListener> proxyImpl = new Type_factory__o_d_c_GlobalSettingsChangeListener__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }

  native static GlobalDisplayerSettings GlobalSettingsChangeListener_GlobalDisplayerSettings_globalDisplayerSettings(GlobalSettingsChangeListener instance) /*-{
    return instance.@org.dashbuilder.client.GlobalSettingsChangeListener::globalDisplayerSettings;
  }-*/;

  native static void GlobalSettingsChangeListener_GlobalDisplayerSettings_globalDisplayerSettings(GlobalSettingsChangeListener instance, GlobalDisplayerSettings value) /*-{
    instance.@org.dashbuilder.client.GlobalSettingsChangeListener::globalDisplayerSettings = value;
  }-*/;

  public native static void GlobalSettingsChangeListener_onNewGlobalSettings_UpdatedGlobalSettingsEvent(GlobalSettingsChangeListener instance, UpdatedGlobalSettingsEvent a0) /*-{
    instance.@org.dashbuilder.client.GlobalSettingsChangeListener::onNewGlobalSettings(Lorg/dashbuilder/shared/event/UpdatedGlobalSettingsEvent;)(a0);
  }-*/;

  public native static void GlobalSettingsChangeListener_injectDarkModeCss(GlobalSettingsChangeListener instance) /*-{
    instance.@org.dashbuilder.client.GlobalSettingsChangeListener::injectDarkModeCss()();
  }-*/;
}