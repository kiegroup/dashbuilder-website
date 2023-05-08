package org.jboss.errai.ioc.client;

import javax.enterprise.context.ApplicationScoped;
import org.dashbuilder.client.RuntimeClientLoader;
import org.dashbuilder.client.RuntimeCommunication;
import org.dashbuilder.client.screens.ContentErrorScreen;
import org.dashbuilder.client.screens.DashboardsListScreen;
import org.dashbuilder.client.screens.RouterScreen;
import org.dashbuilder.client.screens.RouterScreen.View;
import org.dashbuilder.client.screens.RuntimeScreen;
import org.dashbuilder.client.screens.SamplesScreen;
import org.dashbuilder.client.screens.view.RouterScreenView;
import org.dashbuilder.shared.event.UpdatedRuntimeModelEvent;
import org.dashbuilder.shared.model.RuntimeServiceResponse;
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
import org.uberfire.client.mvp.PlaceManager;
import org.uberfire.client.mvp.PlaceManagerImpl;

public class Type_factory__o_d_c_s_RouterScreen__quals__j_e_i_Any_j_e_i_Default extends Factory<RouterScreen> { private class Type_factory__o_d_c_s_RouterScreen__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends RouterScreen implements Proxy<RouterScreen> {
    private final ProxyHelper<RouterScreen> proxyHelper = new ProxyHelperImpl<RouterScreen>("Type_factory__o_d_c_s_RouterScreen__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final RouterScreen instance) {

    }

    public RouterScreen asBeanType() {
      return this;
    }

    public void setInstance(final RouterScreen instance) {
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

    @Override public String title() {
      if (proxyHelper != null) {
        final RouterScreen proxiedInstance = proxyHelper.getInstance(this);
        final String retVal = proxiedInstance.title();
        return retVal;
      } else {
        return super.title();
      }
    }

    @Override public View getView() {
      if (proxyHelper != null) {
        final RouterScreen proxiedInstance = proxyHelper.getInstance(this);
        final View retVal = proxiedInstance.getView();
        return retVal;
      } else {
        return super.getView();
      }
    }

    @Override public void onOpen() {
      if (proxyHelper != null) {
        final RouterScreen proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.onOpen();
      } else {
        super.onOpen();
      }
    }

    @Override public void doRoute() {
      if (proxyHelper != null) {
        final RouterScreen proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.doRoute();
      } else {
        super.doRoute();
      }
    }

    @Override protected void route(RuntimeServiceResponse response) {
      if (proxyHelper != null) {
        final RouterScreen proxiedInstance = proxyHelper.getInstance(this);
        RouterScreen_route_RuntimeServiceResponse(proxiedInstance, response);
      } else {
        super.route(response);
      }
    }

    @Override public void afterDashboardUpload(String id) {
      if (proxyHelper != null) {
        final RouterScreen proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.afterDashboardUpload(id);
      } else {
        super.afterDashboardUpload(id);
      }
    }

    @Override public void loadDashboard(String importId) {
      if (proxyHelper != null) {
        final RouterScreen proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.loadDashboard(importId);
      } else {
        super.loadDashboard(importId);
      }
    }

    @Override public void listDashboards() {
      if (proxyHelper != null) {
        final RouterScreen proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.listDashboards();
      } else {
        super.listDashboards();
      }
    }

    @Override public void goToContentError(Throwable contentException) {
      if (proxyHelper != null) {
        final RouterScreen proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.goToContentError(contentException);
      } else {
        super.goToContentError(contentException);
      }
    }

    @Override public void onUpdatedRuntimeModelEvent(UpdatedRuntimeModelEvent updatedRuntimeModelEvent) {
      if (proxyHelper != null) {
        final RouterScreen proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.onUpdatedRuntimeModelEvent(updatedRuntimeModelEvent);
      } else {
        super.onUpdatedRuntimeModelEvent(updatedRuntimeModelEvent);
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final RouterScreen proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_d_c_s_RouterScreen__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(RouterScreen.class, "Type_factory__o_d_c_s_RouterScreen__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { RouterScreen.class, Object.class });
  }

  public void init(final Context context) {
    CDI.subscribe("org.dashbuilder.shared.event.UpdatedRuntimeModelEvent", new AbstractCDIEventCallback<UpdatedRuntimeModelEvent>() {
      public void fireEvent(final UpdatedRuntimeModelEvent event) {
        final RouterScreen instance = Factory.maybeUnwrapProxy((RouterScreen) context.getInstance("Type_factory__o_d_c_s_RouterScreen__quals__j_e_i_Any_j_e_i_Default"));
        instance.onUpdatedRuntimeModelEvent(event);
      }
      public String toString() {
        return "Observer: org.dashbuilder.shared.event.UpdatedRuntimeModelEvent []";
      }
    });
    ErraiBus.get().subscribe("cdi.event:org.dashbuilder.shared.event.UpdatedRuntimeModelEvent", CDI.ROUTING_CALLBACK);
  }

  public RouterScreen createInstance(final ContextManager contextManager) {
    final RouterScreen instance = new RouterScreen();
    setIncompleteInstance(instance);
    final DashboardsListScreen RouterScreen_dashboardsListScreen = (DashboardsListScreen) contextManager.getInstance("Type_factory__o_d_c_s_DashboardsListScreen__quals__j_e_i_Any_j_e_i_Default");
    RouterScreen_DashboardsListScreen_dashboardsListScreen(instance, RouterScreen_dashboardsListScreen);
    final SamplesScreen RouterScreen_samplesScreen = (SamplesScreen) contextManager.getInstance("Type_factory__o_d_c_s_SamplesScreen__quals__j_e_i_Any_j_e_i_Default");
    RouterScreen_SamplesScreen_samplesScreen(instance, RouterScreen_samplesScreen);
    final RouterScreenView RouterScreen_view = (RouterScreenView) contextManager.getInstance("Type_factory__o_d_c_s_v_RouterScreenView__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, RouterScreen_view);
    RouterScreen_View_view(instance, RouterScreen_view);
    final ContentErrorScreen RouterScreen_contentErrorScreen = (ContentErrorScreen) contextManager.getInstance("Type_factory__o_d_c_s_ContentErrorScreen__quals__j_e_i_Any_j_e_i_Default");
    RouterScreen_ContentErrorScreen_contentErrorScreen(instance, RouterScreen_contentErrorScreen);
    final PlaceManagerImpl RouterScreen_placeManager = (PlaceManagerImpl) contextManager.getInstance("Type_factory__o_u_c_m_PlaceManagerImpl__quals__j_e_i_Any_j_e_i_Default");
    RouterScreen_PlaceManager_placeManager(instance, RouterScreen_placeManager);
    final RuntimeClientLoader RouterScreen_clientLoader = (RuntimeClientLoader) contextManager.getInstance("Type_factory__o_d_c_RuntimeClientLoader__quals__j_e_i_Any_j_e_i_Default");
    RouterScreen_RuntimeClientLoader_clientLoader(instance, RouterScreen_clientLoader);
    final RuntimeScreen RouterScreen_runtimeScreen = (RuntimeScreen) contextManager.getInstance("Type_factory__o_d_c_s_RuntimeScreen__quals__j_e_i_Any_j_e_i_Default");
    RouterScreen_RuntimeScreen_runtimeScreen(instance, RouterScreen_runtimeScreen);
    final RuntimeCommunication RouterScreen_runtimeCommunication = (RuntimeCommunication) contextManager.getInstance("Type_factory__o_d_c_RuntimeCommunication__quals__j_e_i_Any_j_e_i_Default");
    RouterScreen_RuntimeCommunication_runtimeCommunication(instance, RouterScreen_runtimeCommunication);
    setIncompleteInstance(null);
    return instance;
  }

  public Proxy createProxy(final Context context) {
    final Proxy<RouterScreen> proxyImpl = new Type_factory__o_d_c_s_RouterScreen__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }

  native static SamplesScreen RouterScreen_SamplesScreen_samplesScreen(RouterScreen instance) /*-{
    return instance.@org.dashbuilder.client.screens.RouterScreen::samplesScreen;
  }-*/;

  native static void RouterScreen_SamplesScreen_samplesScreen(RouterScreen instance, SamplesScreen value) /*-{
    instance.@org.dashbuilder.client.screens.RouterScreen::samplesScreen = value;
  }-*/;

  native static RuntimeCommunication RouterScreen_RuntimeCommunication_runtimeCommunication(RouterScreen instance) /*-{
    return instance.@org.dashbuilder.client.screens.RouterScreen::runtimeCommunication;
  }-*/;

  native static void RouterScreen_RuntimeCommunication_runtimeCommunication(RouterScreen instance, RuntimeCommunication value) /*-{
    instance.@org.dashbuilder.client.screens.RouterScreen::runtimeCommunication = value;
  }-*/;

  native static View RouterScreen_View_view(RouterScreen instance) /*-{
    return instance.@org.dashbuilder.client.screens.RouterScreen::view;
  }-*/;

  native static void RouterScreen_View_view(RouterScreen instance, View value) /*-{
    instance.@org.dashbuilder.client.screens.RouterScreen::view = value;
  }-*/;

  native static PlaceManager RouterScreen_PlaceManager_placeManager(RouterScreen instance) /*-{
    return instance.@org.dashbuilder.client.screens.RouterScreen::placeManager;
  }-*/;

  native static void RouterScreen_PlaceManager_placeManager(RouterScreen instance, PlaceManager value) /*-{
    instance.@org.dashbuilder.client.screens.RouterScreen::placeManager = value;
  }-*/;

  native static RuntimeScreen RouterScreen_RuntimeScreen_runtimeScreen(RouterScreen instance) /*-{
    return instance.@org.dashbuilder.client.screens.RouterScreen::runtimeScreen;
  }-*/;

  native static void RouterScreen_RuntimeScreen_runtimeScreen(RouterScreen instance, RuntimeScreen value) /*-{
    instance.@org.dashbuilder.client.screens.RouterScreen::runtimeScreen = value;
  }-*/;

  native static DashboardsListScreen RouterScreen_DashboardsListScreen_dashboardsListScreen(RouterScreen instance) /*-{
    return instance.@org.dashbuilder.client.screens.RouterScreen::dashboardsListScreen;
  }-*/;

  native static void RouterScreen_DashboardsListScreen_dashboardsListScreen(RouterScreen instance, DashboardsListScreen value) /*-{
    instance.@org.dashbuilder.client.screens.RouterScreen::dashboardsListScreen = value;
  }-*/;

  native static ContentErrorScreen RouterScreen_ContentErrorScreen_contentErrorScreen(RouterScreen instance) /*-{
    return instance.@org.dashbuilder.client.screens.RouterScreen::contentErrorScreen;
  }-*/;

  native static void RouterScreen_ContentErrorScreen_contentErrorScreen(RouterScreen instance, ContentErrorScreen value) /*-{
    instance.@org.dashbuilder.client.screens.RouterScreen::contentErrorScreen = value;
  }-*/;

  native static RuntimeClientLoader RouterScreen_RuntimeClientLoader_clientLoader(RouterScreen instance) /*-{
    return instance.@org.dashbuilder.client.screens.RouterScreen::clientLoader;
  }-*/;

  native static void RouterScreen_RuntimeClientLoader_clientLoader(RouterScreen instance, RuntimeClientLoader value) /*-{
    instance.@org.dashbuilder.client.screens.RouterScreen::clientLoader = value;
  }-*/;

  public native static void RouterScreen_route_RuntimeServiceResponse(RouterScreen instance, RuntimeServiceResponse a0) /*-{
    instance.@org.dashbuilder.client.screens.RouterScreen::route(Lorg/dashbuilder/shared/model/RuntimeServiceResponse;)(a0);
  }-*/;
}