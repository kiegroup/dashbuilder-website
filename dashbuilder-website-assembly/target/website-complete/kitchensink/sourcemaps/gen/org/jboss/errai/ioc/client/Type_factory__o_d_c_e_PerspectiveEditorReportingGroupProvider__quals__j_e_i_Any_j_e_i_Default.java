package org.jboss.errai.ioc.client;

import javax.enterprise.context.ApplicationScoped;
import org.dashbuilder.client.editor.DisplayerDragComponent;
import org.dashbuilder.client.editor.PerspectiveEditorReportingGroupProvider;
import org.dashbuilder.displayer.client.RendererManager;
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

public class Type_factory__o_d_c_e_PerspectiveEditorReportingGroupProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<PerspectiveEditorReportingGroupProvider> { private class Type_factory__o_d_c_e_PerspectiveEditorReportingGroupProvider__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends PerspectiveEditorReportingGroupProvider implements Proxy<PerspectiveEditorReportingGroupProvider> {
    private final ProxyHelper<PerspectiveEditorReportingGroupProvider> proxyHelper = new ProxyHelperImpl<PerspectiveEditorReportingGroupProvider>("Type_factory__o_d_c_e_PerspectiveEditorReportingGroupProvider__quals__j_e_i_Any_j_e_i_Default");
    public Type_factory__o_d_c_e_PerspectiveEditorReportingGroupProvider__quals__j_e_i_Any_j_e_i_DefaultProxyImpl() {
      super(null, null);
    }

    public void initProxyProperties(final PerspectiveEditorReportingGroupProvider instance) {

    }

    public PerspectiveEditorReportingGroupProvider asBeanType() {
      return this;
    }

    public void setInstance(final PerspectiveEditorReportingGroupProvider instance) {
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
        final PerspectiveEditorReportingGroupProvider proxiedInstance = proxyHelper.getInstance(this);
        final String retVal = proxiedInstance.getName();
        return retVal;
      } else {
        return super.getName();
      }
    }

    @Override public LayoutDragComponentGroup getComponentGroup() {
      if (proxyHelper != null) {
        final PerspectiveEditorReportingGroupProvider proxiedInstance = proxyHelper.getInstance(this);
        final LayoutDragComponentGroup retVal = proxiedInstance.getComponentGroup();
        return retVal;
      } else {
        return super.getComponentGroup();
      }
    }

    @Override protected DisplayerDragComponent lookupDisplayerComponent(Class dragClass) {
      if (proxyHelper != null) {
        final PerspectiveEditorReportingGroupProvider proxiedInstance = proxyHelper.getInstance(this);
        final DisplayerDragComponent retVal = PerspectiveEditorReportingGroupProvider_lookupDisplayerComponent_Class(proxiedInstance, dragClass);
        return retVal;
      } else {
        return super.lookupDisplayerComponent(dragClass);
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final PerspectiveEditorReportingGroupProvider proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }

    @Override public int compareTo(Object other) {
      if (proxyHelper != null) {
        final PerspectiveEditorReportingGroupProvider proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.compareTo(other);
        return retVal;
      } else {
        throw new RuntimeException("Cannot invoke public method on proxied interface before constructor completes.");
      }
    }
  }
  public Type_factory__o_d_c_e_PerspectiveEditorReportingGroupProvider__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(PerspectiveEditorReportingGroupProvider.class, "Type_factory__o_d_c_e_PerspectiveEditorReportingGroupProvider__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { PerspectiveEditorReportingGroupProvider.class, Object.class, PerspectiveEditorComponentGroupProvider.class, LayoutComponentPaletteGroupProvider.class, Comparable.class });
  }

  public PerspectiveEditorReportingGroupProvider createInstance(final ContextManager contextManager) {
    final SyncBeanManager _beanManager_0 = (SyncBeanManager) contextManager.getInstance("Producer_factory__o_j_e_i_c_c_SyncBeanManager__quals__j_e_i_Any_j_e_i_Default");
    final RendererManager _rendererManager_1 = (RendererManager) contextManager.getInstance("Type_factory__o_d_d_c_RendererManager__quals__j_e_i_Any_j_e_i_Default");
    final PerspectiveEditorReportingGroupProvider instance = new PerspectiveEditorReportingGroupProvider(_beanManager_0, _rendererManager_1);
    registerDependentScopedReference(instance, _beanManager_0);
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  private Proxy createProxyWithErrorMessage() {
    try {
      return new Type_factory__o_d_c_e_PerspectiveEditorReportingGroupProvider__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    } catch (Throwable t) {
      throw new RuntimeException("While creating a proxy for org.dashbuilder.client.editor.PerspectiveEditorReportingGroupProvider an exception was thrown from this constructor: @javax.inject.Inject()  public org.dashbuilder.client.editor.PerspectiveEditorReportingGroupProvider ([org.jboss.errai.ioc.client.container.SyncBeanManager, org.dashbuilder.displayer.client.RendererManager])\nTo fix this problem, add a no-argument public or protected constructor for use in proxying.", t);
    }
  }

  public Proxy createProxy(final Context context) {
    final Proxy<PerspectiveEditorReportingGroupProvider> proxyImpl = createProxyWithErrorMessage();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }

  public native static DisplayerDragComponent PerspectiveEditorReportingGroupProvider_lookupDisplayerComponent_Class(PerspectiveEditorReportingGroupProvider instance, Class a0) /*-{
    return instance.@org.dashbuilder.client.editor.PerspectiveEditorReportingGroupProvider::lookupDisplayerComponent(Ljava/lang/Class;)(a0);
  }-*/;
}