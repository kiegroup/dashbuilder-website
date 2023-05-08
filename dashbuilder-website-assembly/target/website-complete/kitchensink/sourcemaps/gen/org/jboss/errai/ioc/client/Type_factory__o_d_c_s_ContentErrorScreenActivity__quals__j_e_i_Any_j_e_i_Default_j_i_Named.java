package org.jboss.errai.ioc.client;

import java.lang.annotation.Annotation;
import javax.enterprise.context.Dependent;
import org.dashbuilder.client.screens.ContentErrorScreen;
import org.dashbuilder.client.screens.ContentErrorScreenActivity;
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

public class Type_factory__o_d_c_s_ContentErrorScreenActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<ContentErrorScreenActivity> { public Type_factory__o_d_c_s_ContentErrorScreenActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named() {
    super(new FactoryHandleImpl(ContentErrorScreenActivity.class, "Type_factory__o_d_c_s_ContentErrorScreenActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named", Dependent.class, false, "ContentErrorScreen", true));
    handle.setAssignableTypes(new Class[] { ContentErrorScreenActivity.class, AbstractWorkbenchScreenActivity.class, AbstractWorkbenchActivity.class, AbstractActivity.class, Object.class, Activity.class, WorkbenchActivity.class, ContextSensitiveActivity.class, WorkbenchScreenActivity.class });
    handle.setQualifiers(new Annotation[] { QualifierUtil.ANY_ANNOTATION, QualifierUtil.DEFAULT_ANNOTATION, QualifierUtil.createNamed("ContentErrorScreen") });
  }

  public ContentErrorScreenActivity createInstance(final ContextManager contextManager) {
    final PlaceManager _placeManager_0 = (PlaceManagerImpl) contextManager.getInstance("Type_factory__o_u_c_m_PlaceManagerImpl__quals__j_e_i_Any_j_e_i_Default");
    final ContentErrorScreenActivity instance = new ContentErrorScreenActivity(_placeManager_0);
    setIncompleteInstance(instance);
    final ContentErrorScreen ContentErrorScreenActivity_realPresenter = (ContentErrorScreen) contextManager.getInstance("Type_factory__o_d_c_s_ContentErrorScreen__quals__j_e_i_Any_j_e_i_Default");
    ContentErrorScreenActivity_ContentErrorScreen_realPresenter(instance, ContentErrorScreenActivity_realPresenter);
    setIncompleteInstance(null);
    return instance;
  }

  native static ContentErrorScreen ContentErrorScreenActivity_ContentErrorScreen_realPresenter(ContentErrorScreenActivity instance) /*-{
    return instance.@org.dashbuilder.client.screens.ContentErrorScreenActivity::realPresenter;
  }-*/;

  native static void ContentErrorScreenActivity_ContentErrorScreen_realPresenter(ContentErrorScreenActivity instance, ContentErrorScreen value) /*-{
    instance.@org.dashbuilder.client.screens.ContentErrorScreenActivity::realPresenter = value;
  }-*/;
}