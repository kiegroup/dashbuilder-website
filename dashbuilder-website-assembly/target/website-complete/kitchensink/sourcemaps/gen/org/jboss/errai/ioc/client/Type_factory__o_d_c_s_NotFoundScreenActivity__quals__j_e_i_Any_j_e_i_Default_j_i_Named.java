package org.jboss.errai.ioc.client;

import java.lang.annotation.Annotation;
import javax.enterprise.context.Dependent;
import org.dashbuilder.client.screens.NotFoundScreen;
import org.dashbuilder.client.screens.NotFoundScreenActivity;
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

public class Type_factory__o_d_c_s_NotFoundScreenActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<NotFoundScreenActivity> { public Type_factory__o_d_c_s_NotFoundScreenActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named() {
    super(new FactoryHandleImpl(NotFoundScreenActivity.class, "Type_factory__o_d_c_s_NotFoundScreenActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named", Dependent.class, false, "NotFoundScreen", true));
    handle.setAssignableTypes(new Class[] { NotFoundScreenActivity.class, AbstractWorkbenchScreenActivity.class, AbstractWorkbenchActivity.class, AbstractActivity.class, Object.class, Activity.class, WorkbenchActivity.class, ContextSensitiveActivity.class, WorkbenchScreenActivity.class });
    handle.setQualifiers(new Annotation[] { QualifierUtil.ANY_ANNOTATION, QualifierUtil.DEFAULT_ANNOTATION, QualifierUtil.createNamed("NotFoundScreen") });
  }

  public NotFoundScreenActivity createInstance(final ContextManager contextManager) {
    final PlaceManager _placeManager_0 = (PlaceManagerImpl) contextManager.getInstance("Type_factory__o_u_c_m_PlaceManagerImpl__quals__j_e_i_Any_j_e_i_Default");
    final NotFoundScreenActivity instance = new NotFoundScreenActivity(_placeManager_0);
    setIncompleteInstance(instance);
    final NotFoundScreen NotFoundScreenActivity_realPresenter = (NotFoundScreen) contextManager.getInstance("Type_factory__o_d_c_s_NotFoundScreen__quals__j_e_i_Any_j_e_i_Default");
    NotFoundScreenActivity_NotFoundScreen_realPresenter(instance, NotFoundScreenActivity_realPresenter);
    setIncompleteInstance(null);
    return instance;
  }

  native static NotFoundScreen NotFoundScreenActivity_NotFoundScreen_realPresenter(NotFoundScreenActivity instance) /*-{
    return instance.@org.dashbuilder.client.screens.NotFoundScreenActivity::realPresenter;
  }-*/;

  native static void NotFoundScreenActivity_NotFoundScreen_realPresenter(NotFoundScreenActivity instance, NotFoundScreen value) /*-{
    instance.@org.dashbuilder.client.screens.NotFoundScreenActivity::realPresenter = value;
  }-*/;
}