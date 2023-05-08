package org.jboss.errai.ioc.client;

import java.lang.annotation.Annotation;
import javax.enterprise.context.Dependent;
import org.dashbuilder.client.screens.RuntimeScreen;
import org.dashbuilder.client.screens.RuntimeScreenActivity;
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

public class Type_factory__o_d_c_s_RuntimeScreenActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<RuntimeScreenActivity> { public Type_factory__o_d_c_s_RuntimeScreenActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named() {
    super(new FactoryHandleImpl(RuntimeScreenActivity.class, "Type_factory__o_d_c_s_RuntimeScreenActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named", Dependent.class, false, "RuntimeScreen", true));
    handle.setAssignableTypes(new Class[] { RuntimeScreenActivity.class, AbstractWorkbenchScreenActivity.class, AbstractWorkbenchActivity.class, AbstractActivity.class, Object.class, Activity.class, WorkbenchActivity.class, ContextSensitiveActivity.class, WorkbenchScreenActivity.class });
    handle.setQualifiers(new Annotation[] { QualifierUtil.ANY_ANNOTATION, QualifierUtil.DEFAULT_ANNOTATION, QualifierUtil.createNamed("RuntimeScreen") });
  }

  public RuntimeScreenActivity createInstance(final ContextManager contextManager) {
    final PlaceManager _placeManager_0 = (PlaceManagerImpl) contextManager.getInstance("Type_factory__o_u_c_m_PlaceManagerImpl__quals__j_e_i_Any_j_e_i_Default");
    final RuntimeScreenActivity instance = new RuntimeScreenActivity(_placeManager_0);
    setIncompleteInstance(instance);
    final RuntimeScreen RuntimeScreenActivity_realPresenter = (RuntimeScreen) contextManager.getInstance("Type_factory__o_d_c_s_RuntimeScreen__quals__j_e_i_Any_j_e_i_Default");
    RuntimeScreenActivity_RuntimeScreen_realPresenter(instance, RuntimeScreenActivity_realPresenter);
    setIncompleteInstance(null);
    return instance;
  }

  native static RuntimeScreen RuntimeScreenActivity_RuntimeScreen_realPresenter(RuntimeScreenActivity instance) /*-{
    return instance.@org.dashbuilder.client.screens.RuntimeScreenActivity::realPresenter;
  }-*/;

  native static void RuntimeScreenActivity_RuntimeScreen_realPresenter(RuntimeScreenActivity instance, RuntimeScreen value) /*-{
    instance.@org.dashbuilder.client.screens.RuntimeScreenActivity::realPresenter = value;
  }-*/;
}