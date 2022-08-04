package org.jboss.errai.ioc.client;

import java.lang.annotation.Annotation;
import javax.enterprise.context.Dependent;
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
import org.uberfire.ext.layout.editor.client.LayoutEditorPropertiesScreen;
import org.uberfire.ext.layout.editor.client.LayoutEditorPropertiesScreenActivity;
import org.uberfire.security.Resource;
import org.uberfire.security.authz.RuntimeFeatureResource;
import org.uberfire.security.authz.RuntimeResource;

public class Type_factory__o_u_e_l_e_c_LayoutEditorPropertiesScreenActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<LayoutEditorPropertiesScreenActivity> { public Type_factory__o_u_e_l_e_c_LayoutEditorPropertiesScreenActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named() {
    super(new FactoryHandleImpl(LayoutEditorPropertiesScreenActivity.class, "Type_factory__o_u_e_l_e_c_LayoutEditorPropertiesScreenActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named", Dependent.class, false, "LayoutEditorPropertiesScreen", true));
    handle.setAssignableTypes(new Class[] { LayoutEditorPropertiesScreenActivity.class, AbstractWorkbenchScreenActivity.class, AbstractWorkbenchActivity.class, AbstractActivity.class, Object.class, Activity.class, RuntimeFeatureResource.class, RuntimeResource.class, Resource.class, WorkbenchActivity.class, ContextSensitiveActivity.class, WorkbenchScreenActivity.class });
    handle.setQualifiers(new Annotation[] { QualifierUtil.ANY_ANNOTATION, QualifierUtil.DEFAULT_ANNOTATION, QualifierUtil.createNamed("LayoutEditorPropertiesScreen") });
  }

  public LayoutEditorPropertiesScreenActivity createInstance(final ContextManager contextManager) {
    final PlaceManager _placeManager_0 = (PlaceManagerImpl) contextManager.getInstance("Type_factory__o_u_c_m_PlaceManagerImpl__quals__j_e_i_Any_j_e_i_Default");
    final LayoutEditorPropertiesScreenActivity instance = new LayoutEditorPropertiesScreenActivity(_placeManager_0);
    setIncompleteInstance(instance);
    final LayoutEditorPropertiesScreen LayoutEditorPropertiesScreenActivity_realPresenter = (LayoutEditorPropertiesScreen) contextManager.getInstance("Type_factory__o_u_e_l_e_c_LayoutEditorPropertiesScreen__quals__j_e_i_Any_j_e_i_Default");
    LayoutEditorPropertiesScreenActivity_LayoutEditorPropertiesScreen_realPresenter(instance, LayoutEditorPropertiesScreenActivity_realPresenter);
    setIncompleteInstance(null);
    return instance;
  }

  native static LayoutEditorPropertiesScreen LayoutEditorPropertiesScreenActivity_LayoutEditorPropertiesScreen_realPresenter(LayoutEditorPropertiesScreenActivity instance) /*-{
    return instance.@org.uberfire.ext.layout.editor.client.LayoutEditorPropertiesScreenActivity::realPresenter;
  }-*/;

  native static void LayoutEditorPropertiesScreenActivity_LayoutEditorPropertiesScreen_realPresenter(LayoutEditorPropertiesScreenActivity instance, LayoutEditorPropertiesScreen value) /*-{
    instance.@org.uberfire.ext.layout.editor.client.LayoutEditorPropertiesScreenActivity::realPresenter = value;
  }-*/;
}