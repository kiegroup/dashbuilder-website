package org.jboss.errai.ioc.client;

import java.lang.annotation.Annotation;
import javax.enterprise.context.Dependent;
import org.dashbuilder.client.screens.DashboardsListScreen;
import org.dashbuilder.client.screens.DashboardsListScreenActivity;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.uberfire.client.mvp.AbstractActivity;
import org.uberfire.client.mvp.AbstractWorkbenchActivity;
import org.uberfire.client.mvp.AbstractWorkbenchScreenActivity;
import org.uberfire.client.mvp.Activity;
import org.uberfire.client.mvp.ContextSensitiveActivity;
import org.uberfire.client.mvp.PlaceManager;
import org.uberfire.client.mvp.PlaceManagerImpl;
import org.uberfire.client.mvp.WorkbenchActivity;
import org.uberfire.client.mvp.WorkbenchScreenActivity;

public class Type_factory__o_d_c_s_DashboardsListScreenActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<DashboardsListScreenActivity> { public Type_factory__o_d_c_s_DashboardsListScreenActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named() {
    super(new FactoryHandleImpl(DashboardsListScreenActivity.class, "Type_factory__o_d_c_s_DashboardsListScreenActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named", Dependent.class, false, "ListDashboardsScreen", true));
    handle.setAssignableTypes(new Class[] { DashboardsListScreenActivity.class, AbstractWorkbenchScreenActivity.class, AbstractWorkbenchActivity.class, AbstractActivity.class, Object.class, Activity.class, WorkbenchActivity.class, ContextSensitiveActivity.class, WorkbenchScreenActivity.class });
    handle.setQualifiers(new Annotation[] { QualifierUtil.ANY_ANNOTATION, QualifierUtil.DEFAULT_ANNOTATION, QualifierUtil.createNamed("ListDashboardsScreen") });
  }

  public DashboardsListScreenActivity createInstance(final ContextManager contextManager) {
    final PlaceManager _placeManager_0 = (PlaceManagerImpl) contextManager.getInstance("Type_factory__o_u_c_m_PlaceManagerImpl__quals__j_e_i_Any_j_e_i_Default");
    final DashboardsListScreenActivity instance = new DashboardsListScreenActivity(_placeManager_0);
    setIncompleteInstance(instance);
    final DashboardsListScreen DashboardsListScreenActivity_realPresenter = (DashboardsListScreen) contextManager.getInstance("Type_factory__o_d_c_s_DashboardsListScreen__quals__j_e_i_Any_j_e_i_Default");
    DashboardsListScreenActivity_DashboardsListScreen_realPresenter(instance, DashboardsListScreenActivity_realPresenter);
    setIncompleteInstance(null);
    return instance;
  }

  native static DashboardsListScreen DashboardsListScreenActivity_DashboardsListScreen_realPresenter(DashboardsListScreenActivity instance) /*-{
    return instance.@org.dashbuilder.client.screens.DashboardsListScreenActivity::realPresenter;
  }-*/;

  native static void DashboardsListScreenActivity_DashboardsListScreen_realPresenter(DashboardsListScreenActivity instance, DashboardsListScreen value) /*-{
    instance.@org.dashbuilder.client.screens.DashboardsListScreenActivity::realPresenter = value;
  }-*/;
}