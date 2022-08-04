package org.jboss.errai.ioc.client;

import javax.enterprise.context.Dependent;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.uberfire.client.mvp.PerspectiveManager;
import org.uberfire.client.mvp.PerspectiveManagerImpl;
import org.uberfire.client.mvp.PlaceManager;
import org.uberfire.client.mvp.PlaceManagerImpl;
import org.uberfire.client.workbench.PanelManager;
import org.uberfire.client.workbench.PanelManagerImpl;
import org.uberfire.client.workbench.panels.DockingWorkbenchPanelPresenter;
import org.uberfire.client.workbench.panels.WorkbenchPanelPresenter;
import org.uberfire.client.workbench.panels.impl.AbstractDockingWorkbenchPanelPresenter;
import org.uberfire.client.workbench.panels.impl.AbstractWorkbenchPanelPresenter;
import org.uberfire.client.workbench.panels.impl.SimpleDnDWorkbenchPanelPresenter;
import org.uberfire.client.workbench.panels.impl.SimpleDnDWorkbenchPanelView;

public class Type_factory__o_u_c_w_p_i_SimpleDnDWorkbenchPanelPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<SimpleDnDWorkbenchPanelPresenter> { public Type_factory__o_u_c_w_p_i_SimpleDnDWorkbenchPanelPresenter__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(SimpleDnDWorkbenchPanelPresenter.class, "Type_factory__o_u_c_w_p_i_SimpleDnDWorkbenchPanelPresenter__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { SimpleDnDWorkbenchPanelPresenter.class, AbstractDockingWorkbenchPanelPresenter.class, AbstractWorkbenchPanelPresenter.class, Object.class, WorkbenchPanelPresenter.class, DockingWorkbenchPanelPresenter.class });
  }

  public SimpleDnDWorkbenchPanelPresenter createInstance(final ContextManager contextManager) {
    final PerspectiveManager _perspectiveManager_1 = (PerspectiveManagerImpl) contextManager.getInstance("Type_factory__o_u_c_m_PerspectiveManagerImpl__quals__j_e_i_Any_j_e_i_Default");
    final PlaceManager _placeManager_2 = (PlaceManagerImpl) contextManager.getInstance("Type_factory__o_u_c_m_PlaceManagerImpl__quals__j_e_i_Any_j_e_i_Default");
    final SimpleDnDWorkbenchPanelView _view_0 = (SimpleDnDWorkbenchPanelView) contextManager.getInstance("Type_factory__o_u_c_w_p_i_SimpleDnDWorkbenchPanelView__quals__j_e_i_Any_j_e_i_Default");
    final SimpleDnDWorkbenchPanelPresenter instance = new SimpleDnDWorkbenchPanelPresenter(_view_0, _perspectiveManager_1, _placeManager_2);
    registerDependentScopedReference(instance, _view_0);
    setIncompleteInstance(instance);
    final PanelManagerImpl AbstractDockingWorkbenchPanelPresenter_panelManager = (PanelManagerImpl) contextManager.getInstance("Type_factory__o_u_c_w_PanelManagerImpl__quals__j_e_i_Any_j_e_i_Default");
    AbstractDockingWorkbenchPanelPresenter_PanelManager_panelManager(instance, AbstractDockingWorkbenchPanelPresenter_panelManager);
    setIncompleteInstance(null);
    return instance;
  }

  public void invokePostConstructs(final SimpleDnDWorkbenchPanelPresenter instance) {
    AbstractWorkbenchPanelPresenter_init(instance);
  }

  native static PanelManager AbstractDockingWorkbenchPanelPresenter_PanelManager_panelManager(AbstractDockingWorkbenchPanelPresenter instance) /*-{
    return instance.@org.uberfire.client.workbench.panels.impl.AbstractDockingWorkbenchPanelPresenter::panelManager;
  }-*/;

  native static void AbstractDockingWorkbenchPanelPresenter_PanelManager_panelManager(AbstractDockingWorkbenchPanelPresenter instance, PanelManager value) /*-{
    instance.@org.uberfire.client.workbench.panels.impl.AbstractDockingWorkbenchPanelPresenter::panelManager = value;
  }-*/;

  public native static void AbstractWorkbenchPanelPresenter_init(AbstractWorkbenchPanelPresenter instance) /*-{
    instance.@org.uberfire.client.workbench.panels.impl.AbstractWorkbenchPanelPresenter::init()();
  }-*/;
}