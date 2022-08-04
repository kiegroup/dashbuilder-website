package org.jboss.errai.ioc.client;

import java.lang.annotation.Annotation;
import javax.enterprise.context.Dependent;
import org.dashbuilder.client.perspective.DashboardsListPerspective;
import org.dashbuilder.client.perspective.DashboardsListPerspectiveActivity;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.uberfire.client.mvp.AbstractActivity;
import org.uberfire.client.mvp.AbstractWorkbenchPerspectiveActivity;
import org.uberfire.client.mvp.Activity;
import org.uberfire.client.mvp.ContextSensitiveActivity;
import org.uberfire.client.mvp.PerspectiveActivity;
import org.uberfire.client.mvp.PlaceManager;
import org.uberfire.client.mvp.PlaceManagerImpl;
import org.uberfire.security.Resource;
import org.uberfire.security.authz.RuntimeFeatureResource;
import org.uberfire.security.authz.RuntimeResource;

public class Type_factory__o_d_c_p_DashboardsListPerspectiveActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<DashboardsListPerspectiveActivity> { public Type_factory__o_d_c_p_DashboardsListPerspectiveActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named() {
    super(new FactoryHandleImpl(DashboardsListPerspectiveActivity.class, "Type_factory__o_d_c_p_DashboardsListPerspectiveActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named", Dependent.class, false, "DashboardsListPerspective", true));
    handle.setAssignableTypes(new Class[] { DashboardsListPerspectiveActivity.class, AbstractWorkbenchPerspectiveActivity.class, AbstractActivity.class, Object.class, Activity.class, RuntimeFeatureResource.class, RuntimeResource.class, Resource.class, PerspectiveActivity.class, ContextSensitiveActivity.class });
    handle.setQualifiers(new Annotation[] { QualifierUtil.ANY_ANNOTATION, QualifierUtil.DEFAULT_ANNOTATION, QualifierUtil.createNamed("DashboardsListPerspective") });
  }

  public DashboardsListPerspectiveActivity createInstance(final ContextManager contextManager) {
    final PlaceManager _placeManager_0 = (PlaceManagerImpl) contextManager.getInstance("Type_factory__o_u_c_m_PlaceManagerImpl__quals__j_e_i_Any_j_e_i_Default");
    final DashboardsListPerspectiveActivity instance = new DashboardsListPerspectiveActivity(_placeManager_0);
    setIncompleteInstance(instance);
    final DashboardsListPerspective DashboardsListPerspectiveActivity_realPresenter = (DashboardsListPerspective) contextManager.getInstance("Type_factory__o_d_c_p_DashboardsListPerspective__quals__j_e_i_Any_j_e_i_Default");
    DashboardsListPerspectiveActivity_DashboardsListPerspective_realPresenter(instance, DashboardsListPerspectiveActivity_realPresenter);
    setIncompleteInstance(null);
    return instance;
  }

  native static DashboardsListPerspective DashboardsListPerspectiveActivity_DashboardsListPerspective_realPresenter(DashboardsListPerspectiveActivity instance) /*-{
    return instance.@org.dashbuilder.client.perspective.DashboardsListPerspectiveActivity::realPresenter;
  }-*/;

  native static void DashboardsListPerspectiveActivity_DashboardsListPerspective_realPresenter(DashboardsListPerspectiveActivity instance, DashboardsListPerspective value) /*-{
    instance.@org.dashbuilder.client.perspective.DashboardsListPerspectiveActivity::realPresenter = value;
  }-*/;
}