package org.jboss.errai.ioc.client;

import javax.enterprise.context.ApplicationScoped;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;
import org.uberfire.ext.plugin.client.resources.i18n.PerspectiveEditorPaletteI18n;
import org.uberfire.ext.plugin.client.resources.i18n.PerspectiveEditorPaletteI18nImpl;

public class Type_factory__o_u_e_p_c_r_i_PerspectiveEditorPaletteI18nImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<PerspectiveEditorPaletteI18nImpl> { private class Type_factory__o_u_e_p_c_r_i_PerspectiveEditorPaletteI18nImpl__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends PerspectiveEditorPaletteI18nImpl implements Proxy<PerspectiveEditorPaletteI18nImpl> {
    private final ProxyHelper<PerspectiveEditorPaletteI18nImpl> proxyHelper = new ProxyHelperImpl<PerspectiveEditorPaletteI18nImpl>("Type_factory__o_u_e_p_c_r_i_PerspectiveEditorPaletteI18nImpl__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final PerspectiveEditorPaletteI18nImpl instance) {

    }

    public PerspectiveEditorPaletteI18nImpl asBeanType() {
      return this;
    }

    public void setInstance(final PerspectiveEditorPaletteI18nImpl instance) {
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

    @Override public String coreComponentGroupName() {
      if (proxyHelper != null) {
        final PerspectiveEditorPaletteI18nImpl proxiedInstance = proxyHelper.getInstance(this);
        final String retVal = proxiedInstance.coreComponentGroupName();
        return retVal;
      } else {
        return super.coreComponentGroupName();
      }
    }

    @Override public String navComponentGroupName() {
      if (proxyHelper != null) {
        final PerspectiveEditorPaletteI18nImpl proxiedInstance = proxyHelper.getInstance(this);
        final String retVal = proxiedInstance.navComponentGroupName();
        return retVal;
      } else {
        return super.navComponentGroupName();
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final PerspectiveEditorPaletteI18nImpl proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_u_e_p_c_r_i_PerspectiveEditorPaletteI18nImpl__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(PerspectiveEditorPaletteI18nImpl.class, "Type_factory__o_u_e_p_c_r_i_PerspectiveEditorPaletteI18nImpl__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { PerspectiveEditorPaletteI18nImpl.class, Object.class, PerspectiveEditorPaletteI18n.class });
  }

  public PerspectiveEditorPaletteI18nImpl createInstance(final ContextManager contextManager) {
    final PerspectiveEditorPaletteI18nImpl instance = new PerspectiveEditorPaletteI18nImpl();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public Proxy createProxy(final Context context) {
    final Proxy<PerspectiveEditorPaletteI18nImpl> proxyImpl = new Type_factory__o_u_e_p_c_r_i_PerspectiveEditorPaletteI18nImpl__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }
}