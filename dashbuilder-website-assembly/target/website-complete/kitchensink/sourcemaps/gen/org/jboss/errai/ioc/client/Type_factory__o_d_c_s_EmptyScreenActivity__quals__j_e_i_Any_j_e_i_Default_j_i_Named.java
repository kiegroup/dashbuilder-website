package org.jboss.errai.ioc.client;

import java.lang.annotation.Annotation;
import javax.enterprise.context.Dependent;
import org.dashbuilder.client.screens.EmptyScreen;
import org.dashbuilder.client.screens.EmptyScreenActivity;
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

public class Type_factory__o_d_c_s_EmptyScreenActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<EmptyScreenActivity> { public Type_factory__o_d_c_s_EmptyScreenActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named() {
    super(new FactoryHandleImpl(EmptyScreenActivity.class, "Type_factory__o_d_c_s_EmptyScreenActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named", Dependent.class, false, "EmptyScreen", true));
    handle.setAssignableTypes(new Class[] { EmptyScreenActivity.class, AbstractWorkbenchScreenActivity.class, AbstractWorkbenchActivity.class, AbstractActivity.class, Object.class, Activity.class, WorkbenchActivity.class, ContextSensitiveActivity.class, WorkbenchScreenActivity.class });
    handle.setQualifiers(new Annotation[] { QualifierUtil.ANY_ANNOTATION, QualifierUtil.DEFAULT_ANNOTATION, QualifierUtil.createNamed("EmptyScreen") });
  }

  public EmptyScreenActivity createInstance(final ContextManager contextManager) {
    final PlaceManager _placeManager_0 = (PlaceManagerImpl) contextManager.getInstance("Type_factory__o_u_c_m_PlaceManagerImpl__quals__j_e_i_Any_j_e_i_Default");
    final EmptyScreenActivity instance = new EmptyScreenActivity(_placeManager_0);
    setIncompleteInstance(instance);
    final EmptyScreen EmptyScreenActivity_realPresenter = (EmptyScreen) contextManager.getInstance("Type_factory__o_d_c_s_EmptyScreen__quals__j_e_i_Any_j_e_i_Default");
    EmptyScreenActivity_EmptyScreen_realPresenter(instance, EmptyScreenActivity_realPresenter);
    setIncompleteInstance(null);
    return instance;
  }

  native static EmptyScreen EmptyScreenActivity_EmptyScreen_realPresenter(EmptyScreenActivity instance) /*-{
    return instance.@org.dashbuilder.client.screens.EmptyScreenActivity::realPresenter;
  }-*/;

  native static void EmptyScreenActivity_EmptyScreen_realPresenter(EmptyScreenActivity instance, EmptyScreen value) /*-{
    instance.@org.dashbuilder.client.screens.EmptyScreenActivity::realPresenter = value;
  }-*/;
}