package org.jboss.errai.ioc.client;

import java.lang.annotation.Annotation;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import org.dashbuilder.client.screens.DashboardsListScreen;
import org.dashbuilder.client.screens.DashboardsListScreen.View;
import org.dashbuilder.client.screens.RouterScreen;
import org.dashbuilder.client.screens.view.DashboardsListScreenView;
import org.dashbuilder.client.widgets.DashboardCard;
import org.dashbuilder.shared.event.RemovedRuntimeModelEvent;
import org.dashbuilder.shared.event.UpdatedRuntimeModelEvent;
import org.jboss.errai.bus.client.ErraiBus;
import org.jboss.errai.enterprise.client.cdi.AbstractCDIEventCallback;
import org.jboss.errai.enterprise.client.cdi.api.CDI;
import org.jboss.errai.ioc.client.api.ManagedInstance;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;
import org.uberfire.client.mvp.PerspectiveManager;
import org.uberfire.client.mvp.PerspectiveManagerImpl;

public class Type_factory__o_d_c_s_DashboardsListScreen__quals__j_e_i_Any_j_e_i_Default extends Factory<DashboardsListScreen> { private class Type_factory__o_d_c_s_DashboardsListScreen__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends DashboardsListScreen implements Proxy<DashboardsListScreen> {
    private final ProxyHelper<DashboardsListScreen> proxyHelper = new ProxyHelperImpl<DashboardsListScreen>("Type_factory__o_d_c_s_DashboardsListScreen__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final DashboardsListScreen instance) {

    }

    public DashboardsListScreen asBeanType() {
      return this;
    }

    public void setInstance(final DashboardsListScreen instance) {
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
        final DashboardsListScreen proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.init();
      } else {
        super.init();
      }
    }

    @Override public void loadList(List dashboardsNames) {
      if (proxyHelper != null) {
        final DashboardsListScreen proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.loadList(dashboardsNames);
      } else {
        super.loadList(dashboardsNames);
      }
    }

    @Override public String getScreenTitle() {
      if (proxyHelper != null) {
        final DashboardsListScreen proxiedInstance = proxyHelper.getInstance(this);
        final String retVal = proxiedInstance.getScreenTitle();
        return retVal;
      } else {
        return super.getScreenTitle();
      }
    }

    @Override public View workbenchPart() {
      if (proxyHelper != null) {
        final DashboardsListScreen proxiedInstance = proxyHelper.getInstance(this);
        final View retVal = proxiedInstance.workbenchPart();
        return retVal;
      } else {
        return super.workbenchPart();
      }
    }

    @Override public void clear() {
      if (proxyHelper != null) {
        final DashboardsListScreen proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.clear();
      } else {
        super.clear();
      }
    }

    @Override public void onModelUpdated(UpdatedRuntimeModelEvent event) {
      if (proxyHelper != null) {
        final DashboardsListScreen proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.onModelUpdated(event);
      } else {
        super.onModelUpdated(event);
      }
    }

    @Override public void onModelRemoved(RemovedRuntimeModelEvent event) {
      if (proxyHelper != null) {
        final DashboardsListScreen proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.onModelRemoved(event);
      } else {
        super.onModelRemoved(event);
      }
    }

    @Override public void disableUpload() {
      if (proxyHelper != null) {
        final DashboardsListScreen proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.disableUpload();
      } else {
        super.disableUpload();
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final DashboardsListScreen proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_d_c_s_DashboardsListScreen__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(DashboardsListScreen.class, "Type_factory__o_d_c_s_DashboardsListScreen__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { DashboardsListScreen.class, Object.class });
  }

  public void init(final Context context) {
    CDI.subscribe("org.dashbuilder.shared.event.UpdatedRuntimeModelEvent", new AbstractCDIEventCallback<UpdatedRuntimeModelEvent>() {
      public void fireEvent(final UpdatedRuntimeModelEvent event) {
        final DashboardsListScreen instance = Factory.maybeUnwrapProxy((DashboardsListScreen) context.getInstance("Type_factory__o_d_c_s_DashboardsListScreen__quals__j_e_i_Any_j_e_i_Default"));
        instance.onModelUpdated(event);
      }
      public String toString() {
        return "Observer: org.dashbuilder.shared.event.UpdatedRuntimeModelEvent []";
      }
    });
    ErraiBus.get().subscribe("cdi.event:org.dashbuilder.shared.event.UpdatedRuntimeModelEvent", CDI.ROUTING_CALLBACK);
    CDI.subscribe("org.dashbuilder.shared.event.RemovedRuntimeModelEvent", new AbstractCDIEventCallback<RemovedRuntimeModelEvent>() {
      public void fireEvent(final RemovedRuntimeModelEvent event) {
        final DashboardsListScreen instance = Factory.maybeUnwrapProxy((DashboardsListScreen) context.getInstance("Type_factory__o_d_c_s_DashboardsListScreen__quals__j_e_i_Any_j_e_i_Default"));
        instance.onModelRemoved(event);
      }
      public String toString() {
        return "Observer: org.dashbuilder.shared.event.RemovedRuntimeModelEvent []";
      }
    });
    ErraiBus.get().subscribe("cdi.event:org.dashbuilder.shared.event.RemovedRuntimeModelEvent", CDI.ROUTING_CALLBACK);
  }

  public DashboardsListScreen createInstance(final ContextManager contextManager) {
    final DashboardsListScreen instance = new DashboardsListScreen();
    setIncompleteInstance(instance);
    final RouterScreen DashboardsListScreen_router = (RouterScreen) contextManager.getInstance("Type_factory__o_d_c_s_RouterScreen__quals__j_e_i_Any_j_e_i_Default");
    DashboardsListScreen_RouterScreen_router(instance, DashboardsListScreen_router);
    final ManagedInstance DashboardsListScreen_dashboardCardInstance = (ManagedInstance) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_i_c_a_ManagedInstance__quals__Universal", new Class[] { DashboardCard.class }, new Annotation[] { });
    registerDependentScopedReference(instance, DashboardsListScreen_dashboardCardInstance);
    DashboardsListScreen_ManagedInstance_dashboardCardInstance(instance, DashboardsListScreen_dashboardCardInstance);
    final PerspectiveManagerImpl DashboardsListScreen_perspectiveManager = (PerspectiveManagerImpl) contextManager.getInstance("Type_factory__o_u_c_m_PerspectiveManagerImpl__quals__j_e_i_Any_j_e_i_Default");
    DashboardsListScreen_PerspectiveManager_perspectiveManager(instance, DashboardsListScreen_perspectiveManager);
    final DashboardsListScreenView DashboardsListScreen_view = (DashboardsListScreenView) contextManager.getInstance("Type_factory__o_d_c_s_v_DashboardsListScreenView__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, DashboardsListScreen_view);
    DashboardsListScreen_View_view(instance, DashboardsListScreen_view);
    setIncompleteInstance(null);
    return instance;
  }

  public void invokePostConstructs(final DashboardsListScreen instance) {
    instance.init();
  }

  public Proxy createProxy(final Context context) {
    final Proxy<DashboardsListScreen> proxyImpl = new Type_factory__o_d_c_s_DashboardsListScreen__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }

  native static PerspectiveManager DashboardsListScreen_PerspectiveManager_perspectiveManager(DashboardsListScreen instance) /*-{
    return instance.@org.dashbuilder.client.screens.DashboardsListScreen::perspectiveManager;
  }-*/;

  native static void DashboardsListScreen_PerspectiveManager_perspectiveManager(DashboardsListScreen instance, PerspectiveManager value) /*-{
    instance.@org.dashbuilder.client.screens.DashboardsListScreen::perspectiveManager = value;
  }-*/;

  native static View DashboardsListScreen_View_view(DashboardsListScreen instance) /*-{
    return instance.@org.dashbuilder.client.screens.DashboardsListScreen::view;
  }-*/;

  native static void DashboardsListScreen_View_view(DashboardsListScreen instance, View value) /*-{
    instance.@org.dashbuilder.client.screens.DashboardsListScreen::view = value;
  }-*/;

  native static RouterScreen DashboardsListScreen_RouterScreen_router(DashboardsListScreen instance) /*-{
    return instance.@org.dashbuilder.client.screens.DashboardsListScreen::router;
  }-*/;

  native static void DashboardsListScreen_RouterScreen_router(DashboardsListScreen instance, RouterScreen value) /*-{
    instance.@org.dashbuilder.client.screens.DashboardsListScreen::router = value;
  }-*/;

  native static ManagedInstance DashboardsListScreen_ManagedInstance_dashboardCardInstance(DashboardsListScreen instance) /*-{
    return instance.@org.dashbuilder.client.screens.DashboardsListScreen::dashboardCardInstance;
  }-*/;

  native static void DashboardsListScreen_ManagedInstance_dashboardCardInstance(DashboardsListScreen instance, ManagedInstance<DashboardCard> value) /*-{
    instance.@org.dashbuilder.client.screens.DashboardsListScreen::dashboardCardInstance = value;
  }-*/;
}