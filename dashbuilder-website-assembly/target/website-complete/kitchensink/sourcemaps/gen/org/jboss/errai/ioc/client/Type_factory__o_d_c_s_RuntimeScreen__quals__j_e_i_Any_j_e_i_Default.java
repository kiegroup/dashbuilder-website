package org.jboss.errai.ioc.client;

import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import org.dashbuilder.client.screens.RuntimeScreen;
import org.dashbuilder.client.screens.RuntimeScreen.View;
import org.dashbuilder.client.screens.view.RuntimeScreenView;
import org.dashbuilder.shared.model.RuntimeModel;
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
import org.uberfire.client.workbench.events.PerspectiveChange;

public class Type_factory__o_d_c_s_RuntimeScreen__quals__j_e_i_Any_j_e_i_Default extends Factory<RuntimeScreen> { private class Type_factory__o_d_c_s_RuntimeScreen__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends RuntimeScreen implements Proxy<RuntimeScreen> {
    private final ProxyHelper<RuntimeScreen> proxyHelper = new ProxyHelperImpl<RuntimeScreen>("Type_factory__o_d_c_s_RuntimeScreen__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final RuntimeScreen instance) {

    }

    public RuntimeScreen asBeanType() {
      return this;
    }

    public void setInstance(final RuntimeScreen instance) {
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

    @Override public String getScreenTitle() {
      if (proxyHelper != null) {
        final RuntimeScreen proxiedInstance = proxyHelper.getInstance(this);
        final String retVal = proxiedInstance.getScreenTitle();
        return retVal;
      } else {
        return super.getScreenTitle();
      }
    }

    @Override public View workbenchPart() {
      if (proxyHelper != null) {
        final RuntimeScreen proxiedInstance = proxyHelper.getInstance(this);
        final View retVal = proxiedInstance.workbenchPart();
        return retVal;
      } else {
        return super.workbenchPart();
      }
    }

    @Override public void loadDashboards(RuntimeModel runtimeModel) {
      if (proxyHelper != null) {
        final RuntimeScreen proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.loadDashboards(runtimeModel);
      } else {
        super.loadDashboards(runtimeModel);
      }
    }

    @Override public void goToIndex(List templates) {
      if (proxyHelper != null) {
        final RuntimeScreen proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.goToIndex(templates);
      } else {
        super.goToIndex(templates);
      }
    }

    @Override public void setKeepHistory(boolean keepHistory) {
      if (proxyHelper != null) {
        final RuntimeScreen proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.setKeepHistory(keepHistory);
      } else {
        super.setKeepHistory(keepHistory);
      }
    }

    @Override public void clearCurrentSelection() {
      if (proxyHelper != null) {
        final RuntimeScreen proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.clearCurrentSelection();
      } else {
        super.clearCurrentSelection();
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final RuntimeScreen proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_d_c_s_RuntimeScreen__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(RuntimeScreen.class, "Type_factory__o_d_c_s_RuntimeScreen__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { RuntimeScreen.class, Object.class });
  }

  public void init(final Context context) {
    CDI.subscribeLocal("org.uberfire.client.workbench.events.PerspectiveChange", new AbstractCDIEventCallback<PerspectiveChange>() {
      public void fireEvent(final PerspectiveChange event) {
        final RuntimeScreen instance = Factory.maybeUnwrapProxy((RuntimeScreen) context.getInstance("Type_factory__o_d_c_s_RuntimeScreen__quals__j_e_i_Any_j_e_i_Default"));
        RuntimeScreen_onPerspectiveChange_PerspectiveChange(instance, event);
      }
      public String toString() {
        return "Observer: org.uberfire.client.workbench.events.PerspectiveChange []";
      }
    });
  }

  public RuntimeScreen createInstance(final ContextManager contextManager) {
    final RuntimeScreen instance = new RuntimeScreen();
    setIncompleteInstance(instance);
    final RuntimeScreenView RuntimeScreen_view = (RuntimeScreenView) contextManager.getInstance("Type_factory__o_d_c_s_v_RuntimeScreenView__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, RuntimeScreen_view);
    RuntimeScreen_View_view(instance, RuntimeScreen_view);
    final PlaceManagerImpl RuntimeScreen_placeManager = (PlaceManagerImpl) contextManager.getInstance("Type_factory__o_u_c_m_PlaceManagerImpl__quals__j_e_i_Any_j_e_i_Default");
    RuntimeScreen_PlaceManager_placeManager(instance, RuntimeScreen_placeManager);
    setIncompleteInstance(null);
    return instance;
  }

  public void invokePostConstructs(final RuntimeScreen instance) {
    RuntimeScreen_setup(instance);
  }

  public Proxy createProxy(final Context context) {
    final Proxy<RuntimeScreen> proxyImpl = new Type_factory__o_d_c_s_RuntimeScreen__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }

  native static View RuntimeScreen_View_view(RuntimeScreen instance) /*-{
    return instance.@org.dashbuilder.client.screens.RuntimeScreen::view;
  }-*/;

  native static void RuntimeScreen_View_view(RuntimeScreen instance, View value) /*-{
    instance.@org.dashbuilder.client.screens.RuntimeScreen::view = value;
  }-*/;

  native static PlaceManager RuntimeScreen_PlaceManager_placeManager(RuntimeScreen instance) /*-{
    return instance.@org.dashbuilder.client.screens.RuntimeScreen::placeManager;
  }-*/;

  native static void RuntimeScreen_PlaceManager_placeManager(RuntimeScreen instance, PlaceManager value) /*-{
    instance.@org.dashbuilder.client.screens.RuntimeScreen::placeManager = value;
  }-*/;

  public native static void RuntimeScreen_setup(RuntimeScreen instance) /*-{
    instance.@org.dashbuilder.client.screens.RuntimeScreen::setup()();
  }-*/;

  public native static void RuntimeScreen_onPerspectiveChange_PerspectiveChange(RuntimeScreen instance, PerspectiveChange a0) /*-{
    instance.@org.dashbuilder.client.screens.RuntimeScreen::onPerspectiveChange(Lorg/uberfire/client/workbench/events/PerspectiveChange;)(a0);
  }-*/;
}