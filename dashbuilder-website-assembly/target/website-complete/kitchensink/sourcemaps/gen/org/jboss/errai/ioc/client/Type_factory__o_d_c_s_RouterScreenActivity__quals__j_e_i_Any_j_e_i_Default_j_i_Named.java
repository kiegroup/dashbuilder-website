package org.jboss.errai.ioc.client;

import java.lang.annotation.Annotation;
import javax.enterprise.context.Dependent;
import org.dashbuilder.client.screens.RouterScreen;
import org.dashbuilder.client.screens.RouterScreenActivity;
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

public class Type_factory__o_d_c_s_RouterScreenActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<RouterScreenActivity> { public Type_factory__o_d_c_s_RouterScreenActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named() {
    super(new FactoryHandleImpl(RouterScreenActivity.class, "Type_factory__o_d_c_s_RouterScreenActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named", Dependent.class, false, "RouterScreen", true));
    handle.setAssignableTypes(new Class[] { RouterScreenActivity.class, AbstractWorkbenchScreenActivity.class, AbstractWorkbenchActivity.class, AbstractActivity.class, Object.class, Activity.class, WorkbenchActivity.class, ContextSensitiveActivity.class, WorkbenchScreenActivity.class });
    handle.setQualifiers(new Annotation[] { QualifierUtil.ANY_ANNOTATION, QualifierUtil.DEFAULT_ANNOTATION, QualifierUtil.createNamed("RouterScreen") });
  }

  public RouterScreenActivity createInstance(final ContextManager contextManager) {
    final PlaceManager _placeManager_0 = (PlaceManagerImpl) contextManager.getInstance("Type_factory__o_u_c_m_PlaceManagerImpl__quals__j_e_i_Any_j_e_i_Default");
    final RouterScreenActivity instance = new RouterScreenActivity(_placeManager_0);
    setIncompleteInstance(instance);
    final RouterScreen RouterScreenActivity_realPresenter = (RouterScreen) contextManager.getInstance("Type_factory__o_d_c_s_RouterScreen__quals__j_e_i_Any_j_e_i_Default");
    RouterScreenActivity_RouterScreen_realPresenter(instance, RouterScreenActivity_realPresenter);
    setIncompleteInstance(null);
    return instance;
  }

  native static RouterScreen RouterScreenActivity_RouterScreen_realPresenter(RouterScreenActivity instance) /*-{
    return instance.@org.dashbuilder.client.screens.RouterScreenActivity::realPresenter;
  }-*/;

  native static void RouterScreenActivity_RouterScreen_realPresenter(RouterScreenActivity instance, RouterScreen value) /*-{
    instance.@org.dashbuilder.client.screens.RouterScreenActivity::realPresenter = value;
  }-*/;
}