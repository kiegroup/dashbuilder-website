package org.jboss.errai.ioc.client;

import java.lang.annotation.Annotation;
import javax.enterprise.context.Dependent;
import org.dashbuilder.client.perspective.RuntimePerspective;
import org.dashbuilder.client.perspective.RuntimePerspectiveActivity;
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

public class Type_factory__o_d_c_p_RuntimePerspectiveActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<RuntimePerspectiveActivity> { public Type_factory__o_d_c_p_RuntimePerspectiveActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named() {
    super(new FactoryHandleImpl(RuntimePerspectiveActivity.class, "Type_factory__o_d_c_p_RuntimePerspectiveActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named", Dependent.class, false, "RuntimePerspective", true));
    handle.setAssignableTypes(new Class[] { RuntimePerspectiveActivity.class, AbstractWorkbenchPerspectiveActivity.class, AbstractActivity.class, Object.class, Activity.class, RuntimeFeatureResource.class, RuntimeResource.class, Resource.class, PerspectiveActivity.class, ContextSensitiveActivity.class });
    handle.setQualifiers(new Annotation[] { QualifierUtil.ANY_ANNOTATION, QualifierUtil.DEFAULT_ANNOTATION, QualifierUtil.createNamed("RuntimePerspective") });
  }

  public RuntimePerspectiveActivity createInstance(final ContextManager contextManager) {
    final PlaceManager _placeManager_0 = (PlaceManagerImpl) contextManager.getInstance("Type_factory__o_u_c_m_PlaceManagerImpl__quals__j_e_i_Any_j_e_i_Default");
    final RuntimePerspectiveActivity instance = new RuntimePerspectiveActivity(_placeManager_0);
    setIncompleteInstance(instance);
    final RuntimePerspective RuntimePerspectiveActivity_realPresenter = (RuntimePerspective) contextManager.getInstance("Type_factory__o_d_c_p_RuntimePerspective__quals__j_e_i_Any_j_e_i_Default");
    RuntimePerspectiveActivity_RuntimePerspective_realPresenter(instance, RuntimePerspectiveActivity_realPresenter);
    setIncompleteInstance(null);
    return instance;
  }

  native static RuntimePerspective RuntimePerspectiveActivity_RuntimePerspective_realPresenter(RuntimePerspectiveActivity instance) /*-{
    return instance.@org.dashbuilder.client.perspective.RuntimePerspectiveActivity::realPresenter;
  }-*/;

  native static void RuntimePerspectiveActivity_RuntimePerspective_realPresenter(RuntimePerspectiveActivity instance, RuntimePerspective value) /*-{
    instance.@org.dashbuilder.client.perspective.RuntimePerspectiveActivity::realPresenter = value;
  }-*/;
}