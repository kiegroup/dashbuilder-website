package org.jboss.errai.ioc.client;

import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import org.dashbuilder.displayer.DisplayerSettings;
import org.dashbuilder.displayer.GlobalDisplayerSettings;
import org.dashbuilder.displayer.client.GlobalDisplayerSettingsImpl;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;

public class Type_factory__o_d_d_c_GlobalDisplayerSettingsImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<GlobalDisplayerSettingsImpl> { private class Type_factory__o_d_d_c_GlobalDisplayerSettingsImpl__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends GlobalDisplayerSettingsImpl implements Proxy<GlobalDisplayerSettingsImpl> {
    private final ProxyHelper<GlobalDisplayerSettingsImpl> proxyHelper = new ProxyHelperImpl<GlobalDisplayerSettingsImpl>("Type_factory__o_d_d_c_GlobalDisplayerSettingsImpl__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final GlobalDisplayerSettingsImpl instance) {

    }

    public GlobalDisplayerSettingsImpl asBeanType() {
      return this;
    }

    public void setInstance(final GlobalDisplayerSettingsImpl instance) {
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

    @Override public void setDisplayerSettings(DisplayerSettings settings) {
      if (proxyHelper != null) {
        final GlobalDisplayerSettingsImpl proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.setDisplayerSettings(settings);
      } else {
        super.setDisplayerSettings(settings);
      }
    }

    @Override public Optional getSettings() {
      if (proxyHelper != null) {
        final GlobalDisplayerSettingsImpl proxiedInstance = proxyHelper.getInstance(this);
        final Optional retVal = proxiedInstance.getSettings();
        return retVal;
      } else {
        return super.getSettings();
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final GlobalDisplayerSettingsImpl proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_d_d_c_GlobalDisplayerSettingsImpl__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(GlobalDisplayerSettingsImpl.class, "Type_factory__o_d_d_c_GlobalDisplayerSettingsImpl__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { GlobalDisplayerSettingsImpl.class, Object.class, GlobalDisplayerSettings.class });
  }

  public GlobalDisplayerSettingsImpl createInstance(final ContextManager contextManager) {
    final GlobalDisplayerSettingsImpl instance = new GlobalDisplayerSettingsImpl();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public Proxy createProxy(final Context context) {
    final Proxy<GlobalDisplayerSettingsImpl> proxyImpl = new Type_factory__o_d_d_c_GlobalDisplayerSettingsImpl__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }
}