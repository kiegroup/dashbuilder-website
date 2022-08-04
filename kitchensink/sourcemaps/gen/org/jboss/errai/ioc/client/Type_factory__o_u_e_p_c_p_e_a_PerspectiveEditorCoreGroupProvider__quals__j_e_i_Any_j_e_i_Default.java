package org.jboss.errai.ioc.client;

import javax.enterprise.context.ApplicationScoped;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;
import org.jboss.errai.ioc.client.container.SyncBeanManager;
import org.uberfire.ext.layout.editor.client.api.LayoutDragComponentGroup;
import org.uberfire.ext.layout.editor.client.widgets.LayoutComponentPaletteGroupProvider;
import org.uberfire.ext.plugin.client.perspective.editor.api.PerspectiveEditorComponentGroupProvider;
import org.uberfire.ext.plugin.client.perspective.editor.api.PerspectiveEditorCoreGroupProvider;
import org.uberfire.ext.plugin.client.resources.i18n.PerspectiveEditorPaletteI18n;
import org.uberfire.ext.plugin.client.resources.i18n.PerspectiveEditorPaletteI18nImpl;

public class Type_factory__o_u_e_p_c_p_e_a_PerspectiveEditorCoreGroupProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<PerspectiveEditorCoreGroupProvider> { private class Type_factory__o_u_e_p_c_p_e_a_PerspectiveEditorCoreGroupProvider__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends PerspectiveEditorCoreGroupProvider implements Proxy<PerspectiveEditorCoreGroupProvider> {
    private final ProxyHelper<PerspectiveEditorCoreGroupProvider> proxyHelper = new ProxyHelperImpl<PerspectiveEditorCoreGroupProvider>("Type_factory__o_u_e_p_c_p_e_a_PerspectiveEditorCoreGroupProvider__quals__j_e_i_Any_j_e_i_Default");
    public Type_factory__o_u_e_p_c_p_e_a_PerspectiveEditorCoreGroupProvider__quals__j_e_i_Any_j_e_i_DefaultProxyImpl() {
      super(null, null);
    }

    public void initProxyProperties(final PerspectiveEditorCoreGroupProvider instance) {

    }

    public PerspectiveEditorCoreGroupProvider asBeanType() {
      return this;
    }

    public void setInstance(final PerspectiveEditorCoreGroupProvider instance) {
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

    @Override public String getName() {
      if (proxyHelper != null) {
        final PerspectiveEditorCoreGroupProvider proxiedInstance = proxyHelper.getInstance(this);
        final String retVal = proxiedInstance.getName();
        return retVal;
      } else {
        return super.getName();
      }
    }

    @Override public Integer getOrder() {
      if (proxyHelper != null) {
        final PerspectiveEditorCoreGroupProvider proxiedInstance = proxyHelper.getInstance(this);
        final Integer retVal = proxiedInstance.getOrder();
        return retVal;
      } else {
        return super.getOrder();
      }
    }

    @Override public LayoutDragComponentGroup getComponentGroup() {
      if (proxyHelper != null) {
        final PerspectiveEditorCoreGroupProvider proxiedInstance = proxyHelper.getInstance(this);
        final LayoutDragComponentGroup retVal = proxiedInstance.getComponentGroup();
        return retVal;
      } else {
        return super.getComponentGroup();
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final PerspectiveEditorCoreGroupProvider proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }

    @Override public int compareTo(Object other) {
      if (proxyHelper != null) {
        final PerspectiveEditorCoreGroupProvider proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.compareTo(other);
        return retVal;
      } else {
        throw new RuntimeException("Cannot invoke public method on proxied interface before constructor completes.");
      }
    }
  }
  public Type_factory__o_u_e_p_c_p_e_a_PerspectiveEditorCoreGroupProvider__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(PerspectiveEditorCoreGroupProvider.class, "Type_factory__o_u_e_p_c_p_e_a_PerspectiveEditorCoreGroupProvider__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { PerspectiveEditorCoreGroupProvider.class, Object.class, PerspectiveEditorComponentGroupProvider.class, LayoutComponentPaletteGroupProvider.class, Comparable.class });
  }

  public PerspectiveEditorCoreGroupProvider createInstance(final ContextManager contextManager) {
    final PerspectiveEditorPaletteI18n _i18n_1 = (PerspectiveEditorPaletteI18nImpl) contextManager.getInstance("Type_factory__o_u_e_p_c_r_i_PerspectiveEditorPaletteI18nImpl__quals__j_e_i_Any_j_e_i_Default");
    final SyncBeanManager _beanManager_0 = (SyncBeanManager) contextManager.getInstance("Producer_factory__o_j_e_i_c_c_SyncBeanManager__quals__j_e_i_Any_j_e_i_Default");
    final PerspectiveEditorCoreGroupProvider instance = new PerspectiveEditorCoreGroupProvider(_beanManager_0, _i18n_1);
    registerDependentScopedReference(instance, _beanManager_0);
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  private Proxy createProxyWithErrorMessage() {
    try {
      return new Type_factory__o_u_e_p_c_p_e_a_PerspectiveEditorCoreGroupProvider__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    } catch (Throwable t) {
      throw new RuntimeException("While creating a proxy for org.uberfire.ext.plugin.client.perspective.editor.api.PerspectiveEditorCoreGroupProvider an exception was thrown from this constructor: @javax.inject.Inject()  public org.uberfire.ext.plugin.client.perspective.editor.api.PerspectiveEditorCoreGroupProvider ([org.jboss.errai.ioc.client.container.SyncBeanManager, org.uberfire.ext.plugin.client.resources.i18n.PerspectiveEditorPaletteI18n])\nTo fix this problem, add a no-argument public or protected constructor for use in proxying.", t);
    }
  }

  public Proxy createProxy(final Context context) {
    final Proxy<PerspectiveEditorCoreGroupProvider> proxyImpl = createProxyWithErrorMessage();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }
}