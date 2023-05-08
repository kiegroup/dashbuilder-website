package org.jboss.errai.ioc.client;

import java.lang.annotation.Annotation;
import javax.enterprise.context.Dependent;
import org.dashbuilder.client.perspective.ContentErrorPerspective;
import org.dashbuilder.client.perspective.ContentErrorPerspectiveActivity;
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

public class Type_factory__o_d_c_p_ContentErrorPerspectiveActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<ContentErrorPerspectiveActivity> { public Type_factory__o_d_c_p_ContentErrorPerspectiveActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named() {
    super(new FactoryHandleImpl(ContentErrorPerspectiveActivity.class, "Type_factory__o_d_c_p_ContentErrorPerspectiveActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named", Dependent.class, false, "ContentErrorPerspective", true));
    handle.setAssignableTypes(new Class[] { ContentErrorPerspectiveActivity.class, AbstractWorkbenchPerspectiveActivity.class, AbstractActivity.class, Object.class, Activity.class, PerspectiveActivity.class, ContextSensitiveActivity.class });
    handle.setQualifiers(new Annotation[] { QualifierUtil.ANY_ANNOTATION, QualifierUtil.DEFAULT_ANNOTATION, QualifierUtil.createNamed("ContentErrorPerspective") });
  }

  public ContentErrorPerspectiveActivity createInstance(final ContextManager contextManager) {
    final PlaceManager _placeManager_0 = (PlaceManagerImpl) contextManager.getInstance("Type_factory__o_u_c_m_PlaceManagerImpl__quals__j_e_i_Any_j_e_i_Default");
    final ContentErrorPerspectiveActivity instance = new ContentErrorPerspectiveActivity(_placeManager_0);
    setIncompleteInstance(instance);
    final ContentErrorPerspective ContentErrorPerspectiveActivity_realPresenter = (ContentErrorPerspective) contextManager.getInstance("Type_factory__o_d_c_p_ContentErrorPerspective__quals__j_e_i_Any_j_e_i_Default");
    ContentErrorPerspectiveActivity_ContentErrorPerspective_realPresenter(instance, ContentErrorPerspectiveActivity_realPresenter);
    setIncompleteInstance(null);
    return instance;
  }

  native static ContentErrorPerspective ContentErrorPerspectiveActivity_ContentErrorPerspective_realPresenter(ContentErrorPerspectiveActivity instance) /*-{
    return instance.@org.dashbuilder.client.perspective.ContentErrorPerspectiveActivity::realPresenter;
  }-*/;

  native static void ContentErrorPerspectiveActivity_ContentErrorPerspective_realPresenter(ContentErrorPerspectiveActivity instance, ContentErrorPerspective value) /*-{
    instance.@org.dashbuilder.client.perspective.ContentErrorPerspectiveActivity::realPresenter = value;
  }-*/;
}