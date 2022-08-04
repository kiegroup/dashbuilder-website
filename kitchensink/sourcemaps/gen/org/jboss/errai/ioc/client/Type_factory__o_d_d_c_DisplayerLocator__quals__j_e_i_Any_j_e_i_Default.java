package org.jboss.errai.ioc.client;

import javax.enterprise.context.ApplicationScoped;
import org.dashbuilder.client.services.RuntimeDataSetClientServices;
import org.dashbuilder.dataset.client.ClientDataSetManager;
import org.dashbuilder.dataset.client.DataSetClientServices;
import org.dashbuilder.displayer.DisplayerSettings;
import org.dashbuilder.displayer.client.Displayer;
import org.dashbuilder.displayer.client.DisplayerLocator;
import org.dashbuilder.displayer.client.RendererManager;
import org.dashbuilder.displayer.client.formatter.ValueFormatterRegistry;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;

public class Type_factory__o_d_d_c_DisplayerLocator__quals__j_e_i_Any_j_e_i_Default extends Factory<DisplayerLocator> { private class Type_factory__o_d_d_c_DisplayerLocator__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends DisplayerLocator implements Proxy<DisplayerLocator> {
    private final ProxyHelper<DisplayerLocator> proxyHelper = new ProxyHelperImpl<DisplayerLocator>("Type_factory__o_d_d_c_DisplayerLocator__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final DisplayerLocator instance) {

    }

    public DisplayerLocator asBeanType() {
      return this;
    }

    public void setInstance(final DisplayerLocator instance) {
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

    @Override public Displayer lookupDisplayer(DisplayerSettings target) {
      if (proxyHelper != null) {
        final DisplayerLocator proxiedInstance = proxyHelper.getInstance(this);
        final Displayer retVal = proxiedInstance.lookupDisplayer(target);
        return retVal;
      } else {
        return super.lookupDisplayer(target);
      }
    }

    @Override protected void setValueFormatters(Displayer displayer) {
      if (proxyHelper != null) {
        final DisplayerLocator proxiedInstance = proxyHelper.getInstance(this);
        DisplayerLocator_setValueFormatters_Displayer(proxiedInstance, displayer);
      } else {
        super.setValueFormatters(displayer);
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final DisplayerLocator proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_d_d_c_DisplayerLocator__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(DisplayerLocator.class, "Type_factory__o_d_d_c_DisplayerLocator__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { DisplayerLocator.class, Object.class });
  }

  public DisplayerLocator createInstance(final ContextManager contextManager) {
    final RendererManager _rendererManager_2 = (RendererManager) contextManager.getInstance("Type_factory__o_d_d_c_RendererManager__quals__j_e_i_Any_j_e_i_Default");
    final ClientDataSetManager _clientDataSetManager_1 = (ClientDataSetManager) contextManager.getInstance("Type_factory__o_d_d_c_ClientDataSetManager__quals__j_e_i_Any_j_e_i_Default");
    final ValueFormatterRegistry _formatterRegistry_3 = (ValueFormatterRegistry) contextManager.getInstance("Type_factory__o_d_d_c_f_ValueFormatterRegistry__quals__j_e_i_Any_j_e_i_Default");
    final DataSetClientServices _clientServices_0 = (RuntimeDataSetClientServices) contextManager.getInstance("Type_factory__o_d_c_s_RuntimeDataSetClientServices__quals__j_e_i_Any_j_e_i_Default");
    final DisplayerLocator instance = new DisplayerLocator(_clientServices_0, _clientDataSetManager_1, _rendererManager_2, _formatterRegistry_3);
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public Proxy createProxy(final Context context) {
    final Proxy<DisplayerLocator> proxyImpl = new Type_factory__o_d_d_c_DisplayerLocator__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }

  public native static void DisplayerLocator_setValueFormatters_Displayer(DisplayerLocator instance, Displayer a0) /*-{
    instance.@org.dashbuilder.displayer.client.DisplayerLocator::setValueFormatters(Lorg/dashbuilder/displayer/client/Displayer;)(a0);
  }-*/;
}