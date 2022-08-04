package org.jboss.errai.ioc.client;

import javax.enterprise.context.ApplicationScoped;
import org.dashbuilder.client.RuntimeClientLoader;
import org.dashbuilder.client.screens.EmptyScreen;
import org.dashbuilder.client.screens.EmptyScreen.View;
import org.dashbuilder.client.screens.RouterScreen;
import org.dashbuilder.client.screens.view.EmptyScreenView;
import org.dashbuilder.shared.event.UpdatedRuntimeModelEvent;
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
import org.uberfire.client.mvp.PerspectiveManager;
import org.uberfire.client.mvp.PerspectiveManagerImpl;

public class Type_factory__o_d_c_s_EmptyScreen__quals__j_e_i_Any_j_e_i_Default extends Factory<EmptyScreen> { private class Type_factory__o_d_c_s_EmptyScreen__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends EmptyScreen implements Proxy<EmptyScreen> {
    private final ProxyHelper<EmptyScreen> proxyHelper = new ProxyHelperImpl<EmptyScreen>("Type_factory__o_d_c_s_EmptyScreen__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final EmptyScreen instance) {

    }

    public EmptyScreen asBeanType() {
      return this;
    }

    public void setInstance(final EmptyScreen instance) {
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

    @Override public void init() {
      if (proxyHelper != null) {
        final EmptyScreen proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.init();
      } else {
        super.init();
      }
    }

    @Override public String title() {
      if (proxyHelper != null) {
        final EmptyScreen proxiedInstance = proxyHelper.getInstance(this);
        final String retVal = proxiedInstance.title();
        return retVal;
      } else {
        return super.title();
      }
    }

    @Override protected View getPart() {
      if (proxyHelper != null) {
        final EmptyScreen proxiedInstance = proxyHelper.getInstance(this);
        final View retVal = EmptyScreen_getPart(proxiedInstance);
        return retVal;
      } else {
        return super.getPart();
      }
    }

    @Override protected void onOpen() {
      if (proxyHelper != null) {
        final EmptyScreen proxiedInstance = proxyHelper.getInstance(this);
        EmptyScreen_onOpen(proxiedInstance);
      } else {
        super.onOpen();
      }
    }

    @Override public void onModelUpdated(UpdatedRuntimeModelEvent event) {
      if (proxyHelper != null) {
        final EmptyScreen proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.onModelUpdated(event);
      } else {
        super.onModelUpdated(event);
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final EmptyScreen proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_d_c_s_EmptyScreen__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(EmptyScreen.class, "Type_factory__o_d_c_s_EmptyScreen__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { EmptyScreen.class, Object.class });
  }

  public void init(final Context context) {
    CDI.subscribe("org.dashbuilder.shared.event.UpdatedRuntimeModelEvent", new AbstractCDIEventCallback<UpdatedRuntimeModelEvent>() {
      public void fireEvent(final UpdatedRuntimeModelEvent event) {
        final EmptyScreen instance = Factory.maybeUnwrapProxy((EmptyScreen) context.getInstance("Type_factory__o_d_c_s_EmptyScreen__quals__j_e_i_Any_j_e_i_Default"));
        instance.onModelUpdated(event);
      }
      public String toString() {
        return "Observer: org.dashbuilder.shared.event.UpdatedRuntimeModelEvent []";
      }
    });
    ErraiBus.get().subscribe("cdi.event:org.dashbuilder.shared.event.UpdatedRuntimeModelEvent", CDI.ROUTING_CALLBACK);
  }

  public EmptyScreen createInstance(final ContextManager contextManager) {
    final EmptyScreen instance = new EmptyScreen();
    setIncompleteInstance(instance);
    final RouterScreen EmptyScreen_router = (RouterScreen) contextManager.getInstance("Type_factory__o_d_c_s_RouterScreen__quals__j_e_i_Any_j_e_i_Default");
    EmptyScreen_RouterScreen_router(instance, EmptyScreen_router);
    final EmptyScreenView EmptyScreen_view = (EmptyScreenView) contextManager.getInstance("Type_factory__o_d_c_s_v_EmptyScreenView__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, EmptyScreen_view);
    EmptyScreen_View_view(instance, EmptyScreen_view);
    final PerspectiveManagerImpl EmptyScreen_perspectiveManager = (PerspectiveManagerImpl) contextManager.getInstance("Type_factory__o_u_c_m_PerspectiveManagerImpl__quals__j_e_i_Any_j_e_i_Default");
    EmptyScreen_PerspectiveManager_perspectiveManager(instance, EmptyScreen_perspectiveManager);
    final RuntimeClientLoader EmptyScreen_loader = (RuntimeClientLoader) contextManager.getInstance("Type_factory__o_d_c_RuntimeClientLoader__quals__j_e_i_Any_j_e_i_Default");
    EmptyScreen_RuntimeClientLoader_loader(instance, EmptyScreen_loader);
    setIncompleteInstance(null);
    return instance;
  }

  public void invokePostConstructs(final EmptyScreen instance) {
    instance.init();
  }

  public Proxy createProxy(final Context context) {
    final Proxy<EmptyScreen> proxyImpl = new Type_factory__o_d_c_s_EmptyScreen__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }

  native static RouterScreen EmptyScreen_RouterScreen_router(EmptyScreen instance) /*-{
    return instance.@org.dashbuilder.client.screens.EmptyScreen::router;
  }-*/;

  native static void EmptyScreen_RouterScreen_router(EmptyScreen instance, RouterScreen value) /*-{
    instance.@org.dashbuilder.client.screens.EmptyScreen::router = value;
  }-*/;

  native static View EmptyScreen_View_view(EmptyScreen instance) /*-{
    return instance.@org.dashbuilder.client.screens.EmptyScreen::view;
  }-*/;

  native static void EmptyScreen_View_view(EmptyScreen instance, View value) /*-{
    instance.@org.dashbuilder.client.screens.EmptyScreen::view = value;
  }-*/;

  native static RuntimeClientLoader EmptyScreen_RuntimeClientLoader_loader(EmptyScreen instance) /*-{
    return instance.@org.dashbuilder.client.screens.EmptyScreen::loader;
  }-*/;

  native static void EmptyScreen_RuntimeClientLoader_loader(EmptyScreen instance, RuntimeClientLoader value) /*-{
    instance.@org.dashbuilder.client.screens.EmptyScreen::loader = value;
  }-*/;

  native static PerspectiveManager EmptyScreen_PerspectiveManager_perspectiveManager(EmptyScreen instance) /*-{
    return instance.@org.dashbuilder.client.screens.EmptyScreen::perspectiveManager;
  }-*/;

  native static void EmptyScreen_PerspectiveManager_perspectiveManager(EmptyScreen instance, PerspectiveManager value) /*-{
    instance.@org.dashbuilder.client.screens.EmptyScreen::perspectiveManager = value;
  }-*/;

  public native static View EmptyScreen_getPart(EmptyScreen instance) /*-{
    return instance.@org.dashbuilder.client.screens.EmptyScreen::getPart()();
  }-*/;

  public native static void EmptyScreen_onOpen(EmptyScreen instance) /*-{
    instance.@org.dashbuilder.client.screens.EmptyScreen::onOpen()();
  }-*/;
}