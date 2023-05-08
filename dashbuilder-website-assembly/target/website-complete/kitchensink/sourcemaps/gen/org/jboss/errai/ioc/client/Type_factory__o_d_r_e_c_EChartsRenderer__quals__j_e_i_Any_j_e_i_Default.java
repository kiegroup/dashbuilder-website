package org.jboss.errai.ioc.client;

import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import org.dashbuilder.displayer.DisplayerSettings;
import org.dashbuilder.displayer.DisplayerType;
import org.dashbuilder.displayer.client.AbstractRendererLibrary;
import org.dashbuilder.displayer.client.Displayer;
import org.dashbuilder.displayer.client.RendererLibrary;
import org.dashbuilder.renderer.echarts.client.EChartsRenderer;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;
import org.jboss.errai.ioc.client.container.SyncBeanManager;

public class Type_factory__o_d_r_e_c_EChartsRenderer__quals__j_e_i_Any_j_e_i_Default extends Factory<EChartsRenderer> { private class Type_factory__o_d_r_e_c_EChartsRenderer__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends EChartsRenderer implements Proxy<EChartsRenderer> {
    private final ProxyHelper<EChartsRenderer> proxyHelper = new ProxyHelperImpl<EChartsRenderer>("Type_factory__o_d_r_e_c_EChartsRenderer__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final EChartsRenderer instance) {

    }

    public EChartsRenderer asBeanType() {
      return this;
    }

    public void setInstance(final EChartsRenderer instance) {
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

    @Override public void prepare() {
      if (proxyHelper != null) {
        final EChartsRenderer proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.prepare();
      } else {
        super.prepare();
      }
    }

    @Override public String getUUID() {
      if (proxyHelper != null) {
        final EChartsRenderer proxiedInstance = proxyHelper.getInstance(this);
        final String retVal = proxiedInstance.getUUID();
        return retVal;
      } else {
        return super.getUUID();
      }
    }

    @Override public String getName() {
      if (proxyHelper != null) {
        final EChartsRenderer proxiedInstance = proxyHelper.getInstance(this);
        final String retVal = proxiedInstance.getName();
        return retVal;
      } else {
        return super.getName();
      }
    }

    @Override public List getSupportedSubtypes(DisplayerType type) {
      if (proxyHelper != null) {
        final EChartsRenderer proxiedInstance = proxyHelper.getInstance(this);
        final List retVal = proxiedInstance.getSupportedSubtypes(type);
        return retVal;
      } else {
        return super.getSupportedSubtypes(type);
      }
    }

    @Override public Displayer lookupDisplayer(DisplayerSettings displayerSettings) {
      if (proxyHelper != null) {
        final EChartsRenderer proxiedInstance = proxyHelper.getInstance(this);
        final Displayer retVal = proxiedInstance.lookupDisplayer(displayerSettings);
        return retVal;
      } else {
        return super.lookupDisplayer(displayerSettings);
      }
    }

    @Override public List getSupportedTypes() {
      if (proxyHelper != null) {
        final EChartsRenderer proxiedInstance = proxyHelper.getInstance(this);
        final List retVal = proxiedInstance.getSupportedTypes();
        return retVal;
      } else {
        return super.getSupportedTypes();
      }
    }

    @Override public boolean isDefault(DisplayerType type) {
      if (proxyHelper != null) {
        final EChartsRenderer proxiedInstance = proxyHelper.getInstance(this);
        final boolean retVal = proxiedInstance.isDefault(type);
        return retVal;
      } else {
        return super.isDefault(type);
      }
    }

    @Override public void draw(List displayerList) {
      if (proxyHelper != null) {
        final EChartsRenderer proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.draw(displayerList);
      } else {
        super.draw(displayerList);
      }
    }

    @Override public void redraw(List displayerList) {
      if (proxyHelper != null) {
        final EChartsRenderer proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.redraw(displayerList);
      } else {
        super.redraw(displayerList);
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final EChartsRenderer proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_d_r_e_c_EChartsRenderer__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(EChartsRenderer.class, "Type_factory__o_d_r_e_c_EChartsRenderer__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { EChartsRenderer.class, AbstractRendererLibrary.class, Object.class, RendererLibrary.class });
  }

  public EChartsRenderer createInstance(final ContextManager contextManager) {
    final EChartsRenderer instance = new EChartsRenderer();
    setIncompleteInstance(instance);
    final SyncBeanManager EChartsRenderer_beanManager = (SyncBeanManager) contextManager.getInstance("Producer_factory__o_j_e_i_c_c_SyncBeanManager__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, EChartsRenderer_beanManager);
    EChartsRenderer_SyncBeanManager_beanManager(instance, EChartsRenderer_beanManager);
    setIncompleteInstance(null);
    return instance;
  }

  public void invokePostConstructs(final EChartsRenderer instance) {
    instance.prepare();
  }

  public Proxy createProxy(final Context context) {
    final Proxy<EChartsRenderer> proxyImpl = new Type_factory__o_d_r_e_c_EChartsRenderer__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }

  native static SyncBeanManager EChartsRenderer_SyncBeanManager_beanManager(EChartsRenderer instance) /*-{
    return instance.@org.dashbuilder.renderer.echarts.client.EChartsRenderer::beanManager;
  }-*/;

  native static void EChartsRenderer_SyncBeanManager_beanManager(EChartsRenderer instance, SyncBeanManager value) /*-{
    instance.@org.dashbuilder.renderer.echarts.client.EChartsRenderer::beanManager = value;
  }-*/;
}