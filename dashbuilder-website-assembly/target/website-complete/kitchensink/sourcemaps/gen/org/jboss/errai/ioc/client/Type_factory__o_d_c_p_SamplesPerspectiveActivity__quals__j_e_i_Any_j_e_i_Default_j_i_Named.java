package org.jboss.errai.ioc.client;

import java.lang.annotation.Annotation;
import javax.enterprise.context.Dependent;
import org.dashbuilder.client.perspective.SamplesPerspective;
import org.dashbuilder.client.perspective.SamplesPerspectiveActivity;
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

public class Type_factory__o_d_c_p_SamplesPerspectiveActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<SamplesPerspectiveActivity> { public Type_factory__o_d_c_p_SamplesPerspectiveActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named() {
    super(new FactoryHandleImpl(SamplesPerspectiveActivity.class, "Type_factory__o_d_c_p_SamplesPerspectiveActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named", Dependent.class, false, "SamplesPerspective", true));
    handle.setAssignableTypes(new Class[] { SamplesPerspectiveActivity.class, AbstractWorkbenchPerspectiveActivity.class, AbstractActivity.class, Object.class, Activity.class, PerspectiveActivity.class, ContextSensitiveActivity.class });
    handle.setQualifiers(new Annotation[] { QualifierUtil.ANY_ANNOTATION, QualifierUtil.DEFAULT_ANNOTATION, QualifierUtil.createNamed("SamplesPerspective") });
  }

  public SamplesPerspectiveActivity createInstance(final ContextManager contextManager) {
    final PlaceManager _placeManager_0 = (PlaceManagerImpl) contextManager.getInstance("Type_factory__o_u_c_m_PlaceManagerImpl__quals__j_e_i_Any_j_e_i_Default");
    final SamplesPerspectiveActivity instance = new SamplesPerspectiveActivity(_placeManager_0);
    setIncompleteInstance(instance);
    final SamplesPerspective SamplesPerspectiveActivity_realPresenter = (SamplesPerspective) contextManager.getInstance("Type_factory__o_d_c_p_SamplesPerspective__quals__j_e_i_Any_j_e_i_Default");
    SamplesPerspectiveActivity_SamplesPerspective_realPresenter(instance, SamplesPerspectiveActivity_realPresenter);
    setIncompleteInstance(null);
    return instance;
  }

  native static SamplesPerspective SamplesPerspectiveActivity_SamplesPerspective_realPresenter(SamplesPerspectiveActivity instance) /*-{
    return instance.@org.dashbuilder.client.perspective.SamplesPerspectiveActivity::realPresenter;
  }-*/;

  native static void SamplesPerspectiveActivity_SamplesPerspective_realPresenter(SamplesPerspectiveActivity instance, SamplesPerspective value) /*-{
    instance.@org.dashbuilder.client.perspective.SamplesPerspectiveActivity::realPresenter = value;
  }-*/;
}