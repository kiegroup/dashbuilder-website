package org.jboss.errai.ioc.client;

import java.lang.annotation.Annotation;
import javax.enterprise.context.Dependent;
import javax.enterprise.event.Event;
import org.dashbuilder.client.services.RuntimeDataSetClientServices;
import org.dashbuilder.dataset.client.DataSetClientServices;
import org.dashbuilder.dataset.client.uuid.ClientUUIDGenerator;
import org.dashbuilder.dataset.uuid.UUIDGenerator;
import org.dashbuilder.displayer.client.DisplayerScreenPresenter;
import org.dashbuilder.displayer.client.PerspectiveCoordinator;
import org.dashbuilder.displayer.client.widgets.DisplayerViewer;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.SyncBeanManager;
import org.uberfire.client.mvp.PerspectiveManager;
import org.uberfire.client.mvp.PerspectiveManagerImpl;
import org.uberfire.client.mvp.PlaceManager;
import org.uberfire.client.mvp.PlaceManagerImpl;
import org.uberfire.client.workbench.PanelManager;
import org.uberfire.client.workbench.PanelManagerImpl;
import org.uberfire.client.workbench.events.ChangeTitleWidgetEvent;

public class Type_factory__o_d_d_c_DisplayerScreenPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<DisplayerScreenPresenter> { public Type_factory__o_d_d_c_DisplayerScreenPresenter__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(DisplayerScreenPresenter.class, "Type_factory__o_d_d_c_DisplayerScreenPresenter__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { DisplayerScreenPresenter.class, Object.class });
  }

  public DisplayerScreenPresenter createInstance(final ContextManager contextManager) {
    final DataSetClientServices _dataSetClientServices_1 = (RuntimeDataSetClientServices) contextManager.getInstance("Type_factory__o_d_c_s_RuntimeDataSetClientServices__quals__j_e_i_Any_j_e_i_Default");
    final PerspectiveManager _perspectiveManager_3 = (PerspectiveManagerImpl) contextManager.getInstance("Type_factory__o_u_c_m_PerspectiveManagerImpl__quals__j_e_i_Any_j_e_i_Default");
    final PanelManager _panelManager_6 = (PanelManagerImpl) contextManager.getInstance("Type_factory__o_u_c_w_PanelManagerImpl__quals__j_e_i_Any_j_e_i_Default");
    final Event<ChangeTitleWidgetEvent> _changeTitleEvent_8 = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { ChangeTitleWidgetEvent.class }, new Annotation[] { });
    final SyncBeanManager _beanManager_0 = (SyncBeanManager) contextManager.getInstance("Producer_factory__o_j_e_i_c_c_SyncBeanManager__quals__j_e_i_Any_j_e_i_Default");
    final UUIDGenerator _uuidGenerator_2 = (ClientUUIDGenerator) contextManager.getInstance("Type_factory__o_d_d_c_u_ClientUUIDGenerator__quals__j_e_i_Any_j_e_i_Default");
    final DisplayerViewer _displayerViewer_5 = (DisplayerViewer) contextManager.getInstance("Type_factory__o_d_d_c_w_DisplayerViewer__quals__j_e_i_Any_j_e_i_Default");
    final PlaceManager _placeManager_4 = (PlaceManagerImpl) contextManager.getInstance("Type_factory__o_u_c_m_PlaceManagerImpl__quals__j_e_i_Any_j_e_i_Default");
    final PerspectiveCoordinator _perspectiveCoordinator_7 = (PerspectiveCoordinator) contextManager.getInstance("Type_factory__o_d_d_c_PerspectiveCoordinator__quals__j_e_i_Any_j_e_i_Default");
    final DisplayerScreenPresenter instance = new DisplayerScreenPresenter(_beanManager_0, _dataSetClientServices_1, _uuidGenerator_2, _perspectiveManager_3, _placeManager_4, _displayerViewer_5, _panelManager_6, _perspectiveCoordinator_7, _changeTitleEvent_8);
    registerDependentScopedReference(instance, _changeTitleEvent_8);
    registerDependentScopedReference(instance, _beanManager_0);
    registerDependentScopedReference(instance, _displayerViewer_5);
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }
}