package org.jboss.errai.ioc.client;

import java.lang.annotation.Annotation;
import javax.enterprise.context.ApplicationScoped;
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
import org.uberfire.client.mvp.ActivityManager;
import org.uberfire.client.mvp.ActivityManagerImpl;
import org.uberfire.client.mvp.PerspectiveManager;
import org.uberfire.client.mvp.PerspectiveManagerImpl;
import org.uberfire.client.mvp.PlaceManager;
import org.uberfire.client.mvp.PlaceManagerImpl;
import org.uberfire.client.views.pfly.menu.megamenu.WorkbenchMegaMenuView;
import org.uberfire.client.workbench.Workbench;
import org.uberfire.client.workbench.events.PerspectiveChange;
import org.uberfire.client.workbench.widgets.menu.AbstractWorkbenchMenuProducer;
import org.uberfire.client.workbench.widgets.menu.events.PerspectiveVisibiltiyChangeEvent;
import org.uberfire.client.workbench.widgets.menu.megamenu.WorkbenchMegaMenuPresenter;
import org.uberfire.client.workbench.widgets.menu.megamenu.WorkbenchMegaMenuPresenter.View;
import org.uberfire.client.workbench.widgets.menu.megamenu.WorkbenchMegaMenuProducer;
import org.uberfire.client.workbench.widgets.menu.megamenu.WorkbenchMegaMenuStandalonePresenter;
import org.uberfire.client.workbench.widgets.menu.megamenu.brand.MegaMenuBrand;
import org.uberfire.client.workbench.widgets.menu.megamenu.contextmenuitem.ChildContextMenuItemPresenter;
import org.uberfire.client.workbench.widgets.menu.megamenu.contextmenuitem.GroupContextMenuItemPresenter;
import org.uberfire.client.workbench.widgets.menu.megamenu.menuitem.ChildMenuItemPresenter;
import org.uberfire.client.workbench.widgets.menu.megamenu.menuitem.GroupMenuItemPresenter;

public class Type_factory__o_u_c_w_w_m_m_WorkbenchMegaMenuProducer__quals__j_e_i_Any_j_e_i_Default extends Factory<WorkbenchMegaMenuProducer> { private class Type_factory__o_u_c_w_w_m_m_WorkbenchMegaMenuProducer__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends WorkbenchMegaMenuProducer implements Proxy<WorkbenchMegaMenuProducer> {
    private final ProxyHelper<WorkbenchMegaMenuProducer> proxyHelper = new ProxyHelperImpl<WorkbenchMegaMenuProducer>("Type_factory__o_u_c_w_w_m_m_WorkbenchMegaMenuProducer__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final WorkbenchMegaMenuProducer instance) {

    }

    public WorkbenchMegaMenuProducer asBeanType() {
      return this;
    }

    public void setInstance(final WorkbenchMegaMenuProducer instance) {
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

    @Override public WorkbenchMegaMenuPresenter getInstance() {
      if (proxyHelper != null) {
        final WorkbenchMegaMenuProducer proxiedInstance = proxyHelper.getInstance(this);
        final WorkbenchMegaMenuPresenter retVal = proxiedInstance.getInstance();
        return retVal;
      } else {
        return super.getInstance();
      }
    }

    @Override protected WorkbenchMegaMenuPresenter makeDefaultPresenter() {
      if (proxyHelper != null) {
        final WorkbenchMegaMenuProducer proxiedInstance = proxyHelper.getInstance(this);
        final WorkbenchMegaMenuPresenter retVal = WorkbenchMegaMenuProducer_makeDefaultPresenter(proxiedInstance);
        return retVal;
      } else {
        return super.makeDefaultPresenter();
      }
    }

    @Override protected WorkbenchMegaMenuStandalonePresenter makeStandalonePresenter() {
      if (proxyHelper != null) {
        final WorkbenchMegaMenuProducer proxiedInstance = proxyHelper.getInstance(this);
        final WorkbenchMegaMenuStandalonePresenter retVal = WorkbenchMegaMenuProducer_makeStandalonePresenter(proxiedInstance);
        return retVal;
      } else {
        return super.makeStandalonePresenter();
      }
    }

    @Override public WorkbenchMegaMenuPresenter getWorbenchMenu() {
      if (proxyHelper != null) {
        final WorkbenchMegaMenuProducer proxiedInstance = proxyHelper.getInstance(this);
        final WorkbenchMegaMenuPresenter retVal = proxiedInstance.getWorbenchMenu();
        return retVal;
      } else {
        return super.getWorbenchMenu();
      }
    }

    @Override protected void onPerspectiveChange(PerspectiveChange perspectiveChange) {
      if (proxyHelper != null) {
        final WorkbenchMegaMenuProducer proxiedInstance = proxyHelper.getInstance(this);
        AbstractWorkbenchMenuProducer_onPerspectiveChange_PerspectiveChange(proxiedInstance, perspectiveChange);
      } else {
        super.onPerspectiveChange(perspectiveChange);
      }
    }

    @Override protected void onPerspectiveHide(PerspectiveVisibiltiyChangeEvent setPerspectiveVisibleEvent) {
      if (proxyHelper != null) {
        final WorkbenchMegaMenuProducer proxiedInstance = proxyHelper.getInstance(this);
        AbstractWorkbenchMenuProducer_onPerspectiveHide_PerspectiveVisibiltiyChangeEvent(proxiedInstance, setPerspectiveVisibleEvent);
      } else {
        super.onPerspectiveHide(setPerspectiveVisibleEvent);
      }
    }

    @Override protected boolean isStandalone() {
      if (proxyHelper != null) {
        final WorkbenchMegaMenuProducer proxiedInstance = proxyHelper.getInstance(this);
        final boolean retVal = AbstractWorkbenchMenuProducer_isStandalone(proxiedInstance);
        return retVal;
      } else {
        return super.isStandalone();
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final WorkbenchMegaMenuProducer proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_u_c_w_w_m_m_WorkbenchMegaMenuProducer__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(WorkbenchMegaMenuProducer.class, "Type_factory__o_u_c_w_w_m_m_WorkbenchMegaMenuProducer__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { WorkbenchMegaMenuProducer.class, AbstractWorkbenchMenuProducer.class, Object.class });
  }

  public void init(final Context context) {
    CDI.subscribeLocal("org.uberfire.client.workbench.events.PerspectiveChange", new AbstractCDIEventCallback<PerspectiveChange>() {
      public void fireEvent(final PerspectiveChange event) {
        final WorkbenchMegaMenuProducer instance = Factory.maybeUnwrapProxy((WorkbenchMegaMenuProducer) context.getInstance("Type_factory__o_u_c_w_w_m_m_WorkbenchMegaMenuProducer__quals__j_e_i_Any_j_e_i_Default"));
        AbstractWorkbenchMenuProducer_onPerspectiveChange_PerspectiveChange(instance, event);
      }
      public String toString() {
        return "Observer: org.uberfire.client.workbench.events.PerspectiveChange []";
      }
    });
    CDI.subscribeLocal("org.uberfire.client.workbench.widgets.menu.events.PerspectiveVisibiltiyChangeEvent", new AbstractCDIEventCallback<PerspectiveVisibiltiyChangeEvent>() {
      public void fireEvent(final PerspectiveVisibiltiyChangeEvent event) {
        final WorkbenchMegaMenuProducer instance = Factory.maybeUnwrapProxy((WorkbenchMegaMenuProducer) context.getInstance("Type_factory__o_u_c_w_w_m_m_WorkbenchMegaMenuProducer__quals__j_e_i_Any_j_e_i_Default"));
        AbstractWorkbenchMenuProducer_onPerspectiveHide_PerspectiveVisibiltiyChangeEvent(instance, event);
      }
      public String toString() {
        return "Observer: org.uberfire.client.workbench.widgets.menu.events.PerspectiveVisibiltiyChangeEvent []";
      }
    });
  }

  public WorkbenchMegaMenuProducer createInstance(final ContextManager contextManager) {
    final ManagedInstance<ChildMenuItemPresenter> _childMenuItemPresenters_5 = (ManagedInstance) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_i_c_a_ManagedInstance__quals__Universal", new Class[] { ChildMenuItemPresenter.class }, new Annotation[] { });
    final PlaceManager _placeManager_4 = (PlaceManagerImpl) contextManager.getInstance("Type_factory__o_u_c_m_PlaceManagerImpl__quals__j_e_i_Any_j_e_i_Default");
    final ManagedInstance<GroupMenuItemPresenter> _groupMenuItemPresenters_6 = (ManagedInstance) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_i_c_a_ManagedInstance__quals__Universal", new Class[] { GroupMenuItemPresenter.class }, new Annotation[] { });
    final ActivityManager _activityManager_1 = (ActivityManagerImpl) contextManager.getInstance("Type_factory__o_u_c_m_ActivityManagerImpl__quals__j_e_i_Any_j_e_i_Default");
    final View _view_2 = (WorkbenchMegaMenuView) contextManager.getInstance("Type_factory__o_u_c_v_p_m_m_WorkbenchMegaMenuView__quals__j_e_i_Any_j_e_i_Default");
    final Workbench _workbench_9 = (Workbench) contextManager.getInstance("Type_factory__o_u_c_w_Workbench__quals__j_e_i_Any_j_e_i_Default");
    final PerspectiveManager _perspectiveManager_0 = (PerspectiveManagerImpl) contextManager.getInstance("Type_factory__o_u_c_m_PerspectiveManagerImpl__quals__j_e_i_Any_j_e_i_Default");
    final ManagedInstance<GroupContextMenuItemPresenter> _groupContextMenuItemPresenters_8 = (ManagedInstance) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_i_c_a_ManagedInstance__quals__Universal", new Class[] { GroupContextMenuItemPresenter.class }, new Annotation[] { });
    final ManagedInstance<MegaMenuBrand> _megaMenuBrands_3 = (ManagedInstance) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_i_c_a_ManagedInstance__quals__Universal", new Class[] { MegaMenuBrand.class }, new Annotation[] { });
    final ManagedInstance<ChildContextMenuItemPresenter> _childContextMenuItemPresenters_7 = (ManagedInstance) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_i_c_a_ManagedInstance__quals__Universal", new Class[] { ChildContextMenuItemPresenter.class }, new Annotation[] { });
    final WorkbenchMegaMenuProducer instance = new WorkbenchMegaMenuProducer(_perspectiveManager_0, _activityManager_1, _view_2, _megaMenuBrands_3, _placeManager_4, _childMenuItemPresenters_5, _groupMenuItemPresenters_6, _childContextMenuItemPresenters_7, _groupContextMenuItemPresenters_8, _workbench_9);
    registerDependentScopedReference(instance, _childMenuItemPresenters_5);
    registerDependentScopedReference(instance, _groupMenuItemPresenters_6);
    registerDependentScopedReference(instance, _view_2);
    registerDependentScopedReference(instance, _groupContextMenuItemPresenters_8);
    registerDependentScopedReference(instance, _megaMenuBrands_3);
    registerDependentScopedReference(instance, _childContextMenuItemPresenters_7);
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public Proxy createProxy(final Context context) {
    final Proxy<WorkbenchMegaMenuProducer> proxyImpl = new Type_factory__o_u_c_w_w_m_m_WorkbenchMegaMenuProducer__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }

  public native static void AbstractWorkbenchMenuProducer_onPerspectiveChange_PerspectiveChange(AbstractWorkbenchMenuProducer instance, PerspectiveChange a0) /*-{
    instance.@org.uberfire.client.workbench.widgets.menu.AbstractWorkbenchMenuProducer::onPerspectiveChange(Lorg/uberfire/client/workbench/events/PerspectiveChange;)(a0);
  }-*/;

  public native static WorkbenchMegaMenuPresenter WorkbenchMegaMenuProducer_makeDefaultPresenter(WorkbenchMegaMenuProducer instance) /*-{
    return instance.@org.uberfire.client.workbench.widgets.menu.megamenu.WorkbenchMegaMenuProducer::makeDefaultPresenter()();
  }-*/;

  public native static void AbstractWorkbenchMenuProducer_onPerspectiveHide_PerspectiveVisibiltiyChangeEvent(AbstractWorkbenchMenuProducer instance, PerspectiveVisibiltiyChangeEvent a0) /*-{
    instance.@org.uberfire.client.workbench.widgets.menu.AbstractWorkbenchMenuProducer::onPerspectiveHide(Lorg/uberfire/client/workbench/widgets/menu/events/PerspectiveVisibiltiyChangeEvent;)(a0);
  }-*/;

  public native static WorkbenchMegaMenuStandalonePresenter WorkbenchMegaMenuProducer_makeStandalonePresenter(WorkbenchMegaMenuProducer instance) /*-{
    return instance.@org.uberfire.client.workbench.widgets.menu.megamenu.WorkbenchMegaMenuProducer::makeStandalonePresenter()();
  }-*/;

  public native static boolean AbstractWorkbenchMenuProducer_isStandalone(AbstractWorkbenchMenuProducer instance) /*-{
    return instance.@org.uberfire.client.workbench.widgets.menu.AbstractWorkbenchMenuProducer::isStandalone()();
  }-*/;
}