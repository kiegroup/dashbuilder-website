package org.jboss.errai.ioc.client;

import java.lang.annotation.Annotation;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import org.dashbuilder.displayer.DisplayerSettings;
import org.dashbuilder.displayer.DisplayerSubType;
import org.dashbuilder.displayer.DisplayerType;
import org.dashbuilder.displayer.client.RendererLibrary;
import org.dashbuilder.displayer.client.RendererManager;
import org.dashbuilder.renderer.RendererSettings;
import org.dashbuilder.renderer.service.RendererSettingsService;
import org.jboss.errai.common.client.api.Caller;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;
import org.jboss.errai.ioc.client.container.SyncBeanManager;

public class Type_factory__o_d_d_c_RendererManager__quals__j_e_i_Any_j_e_i_Default extends Factory<RendererManager> { private class Type_factory__o_d_d_c_RendererManager__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends RendererManager implements Proxy<RendererManager> {
    private final ProxyHelper<RendererManager> proxyHelper = new ProxyHelperImpl<RendererManager>("Type_factory__o_d_d_c_RendererManager__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final RendererManager instance) {

    }

    public RendererManager asBeanType() {
      return this;
    }

    public void setInstance(final RendererManager instance) {
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

    @Override protected void init() {
      if (proxyHelper != null) {
        final RendererManager proxiedInstance = proxyHelper.getInstance(this);
        RendererManager_init(proxiedInstance);
      } else {
        super.init();
      }
    }

    @Override protected void lookupRenderers(RendererSettings settings) {
      if (proxyHelper != null) {
        final RendererManager proxiedInstance = proxyHelper.getInstance(this);
        RendererManager_lookupRenderers_RendererSettings(proxiedInstance, settings);
      } else {
        super.lookupRenderers(settings);
      }
    }

    @Override public List getRenderers() {
      if (proxyHelper != null) {
        final RendererManager proxiedInstance = proxyHelper.getInstance(this);
        final List retVal = proxiedInstance.getRenderers();
        return retVal;
      } else {
        return super.getRenderers();
      }
    }

    @Override public RendererLibrary getDefaultRenderer(DisplayerType displayerType) {
      if (proxyHelper != null) {
        final RendererManager proxiedInstance = proxyHelper.getInstance(this);
        final RendererLibrary retVal = proxiedInstance.getDefaultRenderer(displayerType);
        return retVal;
      } else {
        return super.getDefaultRenderer(displayerType);
      }
    }

    @Override public void setDefaultRenderer(DisplayerType displayerType, String rendererName) {
      if (proxyHelper != null) {
        final RendererManager proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.setDefaultRenderer(displayerType, rendererName);
      } else {
        super.setDefaultRenderer(displayerType, rendererName);
      }
    }

    @Override public List getRenderersForType(DisplayerType displayerType) {
      if (proxyHelper != null) {
        final RendererManager proxiedInstance = proxyHelper.getInstance(this);
        final List retVal = proxiedInstance.getRenderersForType(displayerType);
        return retVal;
      } else {
        return super.getRenderersForType(displayerType);
      }
    }

    @Override public List getRenderersForType(DisplayerType type, DisplayerSubType subType) {
      if (proxyHelper != null) {
        final RendererManager proxiedInstance = proxyHelper.getInstance(this);
        final List retVal = proxiedInstance.getRenderersForType(type, subType);
        return retVal;
      } else {
        return super.getRenderersForType(type, subType);
      }
    }

    @Override public RendererLibrary getRendererByUUID(String renderer) {
      if (proxyHelper != null) {
        final RendererManager proxiedInstance = proxyHelper.getInstance(this);
        final RendererLibrary retVal = proxiedInstance.getRendererByUUID(renderer);
        return retVal;
      } else {
        return super.getRendererByUUID(renderer);
      }
    }

    @Override public RendererLibrary getRendererByName(String renderer) {
      if (proxyHelper != null) {
        final RendererManager proxiedInstance = proxyHelper.getInstance(this);
        final RendererLibrary retVal = proxiedInstance.getRendererByName(renderer);
        return retVal;
      } else {
        return super.getRendererByName(renderer);
      }
    }

    @Override public RendererLibrary getRendererForType(DisplayerType displayerType) {
      if (proxyHelper != null) {
        final RendererManager proxiedInstance = proxyHelper.getInstance(this);
        final RendererLibrary retVal = proxiedInstance.getRendererForType(displayerType);
        return retVal;
      } else {
        return super.getRendererForType(displayerType);
      }
    }

    @Override public RendererLibrary getRendererForDisplayer(DisplayerSettings target) {
      if (proxyHelper != null) {
        final RendererManager proxiedInstance = proxyHelper.getInstance(this);
        final RendererLibrary retVal = proxiedInstance.getRendererForDisplayer(target);
        return retVal;
      } else {
        return super.getRendererForDisplayer(target);
      }
    }

    @Override public boolean isTypeSupported(DisplayerType type) {
      if (proxyHelper != null) {
        final RendererManager proxiedInstance = proxyHelper.getInstance(this);
        final boolean retVal = proxiedInstance.isTypeSupported(type);
        return retVal;
      } else {
        return super.isTypeSupported(type);
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final RendererManager proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_d_d_c_RendererManager__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(RendererManager.class, "Type_factory__o_d_d_c_RendererManager__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, true, null, true));
    handle.setAssignableTypes(new Class[] { RendererManager.class, Object.class });
  }

  public RendererManager createInstance(final ContextManager contextManager) {
    final Caller<RendererSettingsService> _rendererSettingsService_1 = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { RendererSettingsService.class }, new Annotation[] { });
    final SyncBeanManager _beanManager_0 = (SyncBeanManager) contextManager.getInstance("Producer_factory__o_j_e_i_c_c_SyncBeanManager__quals__j_e_i_Any_j_e_i_Default");
    final RendererManager instance = new RendererManager(_beanManager_0, _rendererSettingsService_1);
    registerDependentScopedReference(instance, _rendererSettingsService_1);
    registerDependentScopedReference(instance, _beanManager_0);
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void invokePostConstructs(final RendererManager instance) {
    RendererManager_init(instance);
  }

  public Proxy createProxy(final Context context) {
    final Proxy<RendererManager> proxyImpl = new Type_factory__o_d_d_c_RendererManager__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }

  public native static void RendererManager_lookupRenderers_RendererSettings(RendererManager instance, RendererSettings a0) /*-{
    instance.@org.dashbuilder.displayer.client.RendererManager::lookupRenderers(Lorg/dashbuilder/renderer/RendererSettings;)(a0);
  }-*/;

  public native static void RendererManager_init(RendererManager instance) /*-{
    instance.@org.dashbuilder.displayer.client.RendererManager::init()();
  }-*/;
}