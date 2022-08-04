package org.jboss.errai.ioc.client;

import javax.enterprise.context.ApplicationScoped;
import org.dashbuilder.client.services.RuntimeDataSetClientServices;
import org.dashbuilder.dataset.client.DataSetClientServices;
import org.dashbuilder.displayer.DisplayerType;
import org.dashbuilder.displayer.client.ClientSettings;
import org.dashbuilder.displayer.client.RendererManager;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;

public class Type_factory__o_d_d_c_ClientSettings__quals__j_e_i_Any_j_e_i_Default extends Factory<ClientSettings> { private class Type_factory__o_d_d_c_ClientSettings__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends ClientSettings implements Proxy<ClientSettings> {
    private final ProxyHelper<ClientSettings> proxyHelper = new ProxyHelperImpl<ClientSettings>("Type_factory__o_d_d_c_ClientSettings__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final ClientSettings instance) {

    }

    public ClientSettings asBeanType() {
      return this;
    }

    public void setInstance(final ClientSettings instance) {
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

    @Override public void turnOffDataSetPush() {
      if (proxyHelper != null) {
        final ClientSettings proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.turnOffDataSetPush();
      } else {
        super.turnOffDataSetPush();
      }
    }

    @Override public void setDefaultRenderer(DisplayerType displayerType, String rendererLib) {
      if (proxyHelper != null) {
        final ClientSettings proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.setDefaultRenderer(displayerType, rendererLib);
      } else {
        super.setDefaultRenderer(displayerType, rendererLib);
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final ClientSettings proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_d_d_c_ClientSettings__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(ClientSettings.class, "Type_factory__o_d_d_c_ClientSettings__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { ClientSettings.class, Object.class });
  }

  public ClientSettings createInstance(final ContextManager contextManager) {
    final ClientSettings instance = new ClientSettings();
    setIncompleteInstance(instance);
    final RuntimeDataSetClientServices ClientSettings_dataSetClientServices = (RuntimeDataSetClientServices) contextManager.getInstance("Type_factory__o_d_c_s_RuntimeDataSetClientServices__quals__j_e_i_Any_j_e_i_Default");
    ClientSettings_DataSetClientServices_dataSetClientServices(instance, ClientSettings_dataSetClientServices);
    final RendererManager ClientSettings_rendererManager = (RendererManager) contextManager.getInstance("Type_factory__o_d_d_c_RendererManager__quals__j_e_i_Any_j_e_i_Default");
    ClientSettings_RendererManager_rendererManager(instance, ClientSettings_rendererManager);
    setIncompleteInstance(null);
    return instance;
  }

  public Proxy createProxy(final Context context) {
    final Proxy<ClientSettings> proxyImpl = new Type_factory__o_d_d_c_ClientSettings__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }

  native static RendererManager ClientSettings_RendererManager_rendererManager(ClientSettings instance) /*-{
    return instance.@org.dashbuilder.displayer.client.ClientSettings::rendererManager;
  }-*/;

  native static void ClientSettings_RendererManager_rendererManager(ClientSettings instance, RendererManager value) /*-{
    instance.@org.dashbuilder.displayer.client.ClientSettings::rendererManager = value;
  }-*/;

  native static DataSetClientServices ClientSettings_DataSetClientServices_dataSetClientServices(ClientSettings instance) /*-{
    return instance.@org.dashbuilder.displayer.client.ClientSettings::dataSetClientServices;
  }-*/;

  native static void ClientSettings_DataSetClientServices_dataSetClientServices(ClientSettings instance, DataSetClientServices value) /*-{
    instance.@org.dashbuilder.displayer.client.ClientSettings::dataSetClientServices = value;
  }-*/;
}