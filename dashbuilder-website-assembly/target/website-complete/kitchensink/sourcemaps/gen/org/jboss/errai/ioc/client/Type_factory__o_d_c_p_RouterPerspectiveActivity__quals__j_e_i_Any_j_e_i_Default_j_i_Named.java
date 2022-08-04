package org.jboss.errai.ioc.client;

import java.lang.annotation.Annotation;
import javax.enterprise.context.Dependent;
import org.dashbuilder.client.perspective.RouterPerspective;
import org.dashbuilder.client.perspective.RouterPerspectiveActivity;
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

public class Type_factory__o_d_c_p_RouterPerspectiveActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<RouterPerspectiveActivity> { public Type_factory__o_d_c_p_RouterPerspectiveActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named() {
    super(new FactoryHandleImpl(RouterPerspectiveActivity.class, "Type_factory__o_d_c_p_RouterPerspectiveActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named", Dependent.class, false, "RouterPerspective", true));
    handle.setAssignableTypes(new Class[] { RouterPerspectiveActivity.class, AbstractWorkbenchPerspectiveActivity.class, AbstractActivity.class, Object.class, Activity.class, RuntimeFeatureResource.class, RuntimeResource.class, Resource.class, PerspectiveActivity.class, ContextSensitiveActivity.class });
    handle.setQualifiers(new Annotation[] { QualifierUtil.ANY_ANNOTATION, QualifierUtil.DEFAULT_ANNOTATION, QualifierUtil.createNamed("RouterPerspective") });
  }

  public RouterPerspectiveActivity createInstance(final ContextManager contextManager) {
    final PlaceManager _placeManager_0 = (PlaceManagerImpl) contextManager.getInstance("Type_factory__o_u_c_m_PlaceManagerImpl__quals__j_e_i_Any_j_e_i_Default");
    final RouterPerspectiveActivity instance = new RouterPerspectiveActivity(_placeManager_0);
    setIncompleteInstance(instance);
    final RouterPerspective RouterPerspectiveActivity_realPresenter = (RouterPerspective) contextManager.getInstance("Type_factory__o_d_c_p_RouterPerspective__quals__j_e_i_Any_j_e_i_Default");
    RouterPerspectiveActivity_RouterPerspective_realPresenter(instance, RouterPerspectiveActivity_realPresenter);
    setIncompleteInstance(null);
    return instance;
  }

  native static RouterPerspective RouterPerspectiveActivity_RouterPerspective_realPresenter(RouterPerspectiveActivity instance) /*-{
    return instance.@org.dashbuilder.client.perspective.RouterPerspectiveActivity::realPresenter;
  }-*/;

  native static void RouterPerspectiveActivity_RouterPerspective_realPresenter(RouterPerspectiveActivity instance, RouterPerspective value) /*-{
    instance.@org.dashbuilder.client.perspective.RouterPerspectiveActivity::realPresenter = value;
  }-*/;
}