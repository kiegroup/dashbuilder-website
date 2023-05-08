package org.jboss.errai.ioc.client;

import java.lang.annotation.Annotation;
import javax.enterprise.context.Dependent;
import org.dashbuilder.client.perspective.EmptyPerspective;
import org.dashbuilder.client.perspective.EmptyPerspectiveActivity;
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

public class Type_factory__o_d_c_p_EmptyPerspectiveActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<EmptyPerspectiveActivity> { public Type_factory__o_d_c_p_EmptyPerspectiveActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named() {
    super(new FactoryHandleImpl(EmptyPerspectiveActivity.class, "Type_factory__o_d_c_p_EmptyPerspectiveActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named", Dependent.class, false, "EmptyPerspective", true));
    handle.setAssignableTypes(new Class[] { EmptyPerspectiveActivity.class, AbstractWorkbenchPerspectiveActivity.class, AbstractActivity.class, Object.class, Activity.class, PerspectiveActivity.class, ContextSensitiveActivity.class });
    handle.setQualifiers(new Annotation[] { QualifierUtil.ANY_ANNOTATION, QualifierUtil.DEFAULT_ANNOTATION, QualifierUtil.createNamed("EmptyPerspective") });
  }

  public EmptyPerspectiveActivity createInstance(final ContextManager contextManager) {
    final PlaceManager _placeManager_0 = (PlaceManagerImpl) contextManager.getInstance("Type_factory__o_u_c_m_PlaceManagerImpl__quals__j_e_i_Any_j_e_i_Default");
    final EmptyPerspectiveActivity instance = new EmptyPerspectiveActivity(_placeManager_0);
    setIncompleteInstance(instance);
    final EmptyPerspective EmptyPerspectiveActivity_realPresenter = (EmptyPerspective) contextManager.getInstance("Type_factory__o_d_c_p_EmptyPerspective__quals__j_e_i_Any_j_e_i_Default");
    EmptyPerspectiveActivity_EmptyPerspective_realPresenter(instance, EmptyPerspectiveActivity_realPresenter);
    setIncompleteInstance(null);
    return instance;
  }

  native static EmptyPerspective EmptyPerspectiveActivity_EmptyPerspective_realPresenter(EmptyPerspectiveActivity instance) /*-{
    return instance.@org.dashbuilder.client.perspective.EmptyPerspectiveActivity::realPresenter;
  }-*/;

  native static void EmptyPerspectiveActivity_EmptyPerspective_realPresenter(EmptyPerspectiveActivity instance, EmptyPerspective value) /*-{
    instance.@org.dashbuilder.client.perspective.EmptyPerspectiveActivity::realPresenter = value;
  }-*/;
}