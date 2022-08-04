package org.jboss.errai.ioc.client;

import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import org.dashbuilder.displayer.DisplayerSettings;
import org.dashbuilder.displayer.DisplayerType;
import org.dashbuilder.displayer.client.AbstractRendererLibrary;
import org.dashbuilder.displayer.client.Displayer;
import org.dashbuilder.displayer.client.RendererLibrary;
import org.dashbuilder.renderer.c3.client.C3Renderer;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;
import org.jboss.errai.ioc.client.container.SyncBeanManager;

public class Type_factory__o_d_r_c_c_C3Renderer__quals__j_e_i_Any_j_e_i_Default extends Factory<C3Renderer> { private class Type_factory__o_d_r_c_c_C3Renderer__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends C3Renderer implements Proxy<C3Renderer> {
    private final ProxyHelper<C3Renderer> proxyHelper = new ProxyHelperImpl<C3Renderer>("Type_factory__o_d_r_c_c_C3Renderer__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final C3Renderer instance) {

    }

    public C3Renderer asBeanType() {
      return this;
    }

    public void setInstance(final C3Renderer instance) {
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
        final C3Renderer proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.prepare();
      } else {
        super.prepare();
      }
    }

    @Override public String getUUID() {
      if (proxyHelper != null) {
        final C3Renderer proxiedInstance = proxyHelper.getInstance(this);
        final String retVal = proxiedInstance.getUUID();
        return retVal;
      } else {
        return super.getUUID();
      }
    }

    @Override public String getName() {
      if (proxyHelper != null) {
        final C3Renderer proxiedInstance = proxyHelper.getInstance(this);
        final String retVal = proxiedInstance.getName();
        return retVal;
      } else {
        return super.getName();
      }
    }

    @Override public List getSupportedSubtypes(DisplayerType displayerType) {
      if (proxyHelper != null) {
        final C3Renderer proxiedInstance = proxyHelper.getInstance(this);
        final List retVal = proxiedInstance.getSupportedSubtypes(displayerType);
        return retVal;
      } else {
        return super.getSupportedSubtypes(displayerType);
      }
    }

    @Override public Displayer lookupDisplayer(DisplayerSettings displayerSettings) {
      if (proxyHelper != null) {
        final C3Renderer proxiedInstance = proxyHelper.getInstance(this);
        final Displayer retVal = proxiedInstance.lookupDisplayer(displayerSettings);
        return retVal;
      } else {
        return super.lookupDisplayer(displayerSettings);
      }
    }

    @Override public List getSupportedTypes() {
      if (proxyHelper != null) {
        final C3Renderer proxiedInstance = proxyHelper.getInstance(this);
        final List retVal = proxiedInstance.getSupportedTypes();
        return retVal;
      } else {
        return super.getSupportedTypes();
      }
    }

    @Override public boolean isDefault(DisplayerType type) {
      if (proxyHelper != null) {
        final C3Renderer proxiedInstance = proxyHelper.getInstance(this);
        final boolean retVal = proxiedInstance.isDefault(type);
        return retVal;
      } else {
        return super.isDefault(type);
      }
    }

    @Override public void draw(List displayerList) {
      if (proxyHelper != null) {
        final C3Renderer proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.draw(displayerList);
      } else {
        super.draw(displayerList);
      }
    }

    @Override public void redraw(List displayerList) {
      if (proxyHelper != null) {
        final C3Renderer proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.redraw(displayerList);
      } else {
        super.redraw(displayerList);
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final C3Renderer proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_d_r_c_c_C3Renderer__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(C3Renderer.class, "Type_factory__o_d_r_c_c_C3Renderer__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { C3Renderer.class, AbstractRendererLibrary.class, Object.class, RendererLibrary.class });
  }

  public C3Renderer createInstance(final ContextManager contextManager) {
    final C3Renderer instance = new C3Renderer();
    setIncompleteInstance(instance);
    final SyncBeanManager C3Renderer_beanManager = (SyncBeanManager) contextManager.getInstance("Producer_factory__o_j_e_i_c_c_SyncBeanManager__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, C3Renderer_beanManager);
    C3Renderer_SyncBeanManager_beanManager(instance, C3Renderer_beanManager);
    setIncompleteInstance(null);
    return instance;
  }

  public void invokePostConstructs(final C3Renderer instance) {
    instance.prepare();
  }

  public Proxy createProxy(final Context context) {
    final Proxy<C3Renderer> proxyImpl = new Type_factory__o_d_r_c_c_C3Renderer__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }

  native static SyncBeanManager C3Renderer_SyncBeanManager_beanManager(C3Renderer instance) /*-{
    return instance.@org.dashbuilder.renderer.c3.client.C3Renderer::beanManager;
  }-*/;

  native static void C3Renderer_SyncBeanManager_beanManager(C3Renderer instance, SyncBeanManager value) /*-{
    instance.@org.dashbuilder.renderer.c3.client.C3Renderer::beanManager = value;
  }-*/;
}