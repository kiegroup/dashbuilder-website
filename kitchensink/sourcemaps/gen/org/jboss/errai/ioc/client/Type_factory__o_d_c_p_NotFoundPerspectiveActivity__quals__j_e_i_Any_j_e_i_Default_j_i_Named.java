package org.jboss.errai.ioc.client;

import java.lang.annotation.Annotation;
import javax.enterprise.context.Dependent;
import org.dashbuilder.client.perspective.NotFoundPerspective;
import org.dashbuilder.client.perspective.NotFoundPerspectiveActivity;
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

public class Type_factory__o_d_c_p_NotFoundPerspectiveActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<NotFoundPerspectiveActivity> { public Type_factory__o_d_c_p_NotFoundPerspectiveActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named() {
    super(new FactoryHandleImpl(NotFoundPerspectiveActivity.class, "Type_factory__o_d_c_p_NotFoundPerspectiveActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named", Dependent.class, false, "NotFoundPerspective", true));
    handle.setAssignableTypes(new Class[] { NotFoundPerspectiveActivity.class, AbstractWorkbenchPerspectiveActivity.class, AbstractActivity.class, Object.class, Activity.class, RuntimeFeatureResource.class, RuntimeResource.class, Resource.class, PerspectiveActivity.class, ContextSensitiveActivity.class });
    handle.setQualifiers(new Annotation[] { QualifierUtil.ANY_ANNOTATION, QualifierUtil.DEFAULT_ANNOTATION, QualifierUtil.createNamed("NotFoundPerspective") });
  }

  public NotFoundPerspectiveActivity createInstance(final ContextManager contextManager) {
    final PlaceManager _placeManager_0 = (PlaceManagerImpl) contextManager.getInstance("Type_factory__o_u_c_m_PlaceManagerImpl__quals__j_e_i_Any_j_e_i_Default");
    final NotFoundPerspectiveActivity instance = new NotFoundPerspectiveActivity(_placeManager_0);
    setIncompleteInstance(instance);
    final NotFoundPerspective NotFoundPerspectiveActivity_realPresenter = (NotFoundPerspective) contextManager.getInstance("Type_factory__o_d_c_p_NotFoundPerspective__quals__j_e_i_Any_j_e_i_Default");
    NotFoundPerspectiveActivity_NotFoundPerspective_realPresenter(instance, NotFoundPerspectiveActivity_realPresenter);
    setIncompleteInstance(null);
    return instance;
  }

  native static NotFoundPerspective NotFoundPerspectiveActivity_NotFoundPerspective_realPresenter(NotFoundPerspectiveActivity instance) /*-{
    return instance.@org.dashbuilder.client.perspective.NotFoundPerspectiveActivity::realPresenter;
  }-*/;

  native static void NotFoundPerspectiveActivity_NotFoundPerspective_realPresenter(NotFoundPerspectiveActivity instance, NotFoundPerspective value) /*-{
    instance.@org.dashbuilder.client.perspective.NotFoundPerspectiveActivity::realPresenter = value;
  }-*/;
}