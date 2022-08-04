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
import org.uberfire.ext.layout.editor.client.LayoutComponentPaletteScreen;
import org.uberfire.ext.layout.editor.client.LayoutComponentPaletteScreenActivity;
import org.uberfire.security.Resource;
import org.uberfire.security.authz.RuntimeFeatureResource;
import org.uberfire.security.authz.RuntimeResource;

public class Type_factory__o_u_e_l_e_c_LayoutComponentPaletteScreenActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<LayoutComponentPaletteScreenActivity> { public Type_factory__o_u_e_l_e_c_LayoutComponentPaletteScreenActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named() {
    super(new FactoryHandleImpl(LayoutComponentPaletteScreenActivity.class, "Type_factory__o_u_e_l_e_c_LayoutComponentPaletteScreenActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named", Dependent.class, false, "LavoutComponentPaletteScreen", true));
    handle.setAssignableTypes(new Class[] { LayoutComponentPaletteScreenActivity.class, AbstractWorkbenchScreenActivity.class, AbstractWorkbenchActivity.class, AbstractActivity.class, Object.class, Activity.class, RuntimeFeatureResource.class, RuntimeResource.class, Resource.class, WorkbenchActivity.class, ContextSensitiveActivity.class, WorkbenchScreenActivity.class });
    handle.setQualifiers(new Annotation[] { QualifierUtil.ANY_ANNOTATION, QualifierUtil.DEFAULT_ANNOTATION, QualifierUtil.createNamed("LavoutComponentPaletteScreen") });
  }

  public LayoutComponentPaletteScreenActivity createInstance(final ContextManager contextManager) {
    final PlaceManager _placeManager_0 = (PlaceManagerImpl) contextManager.getInstance("Type_factory__o_u_c_m_PlaceManagerImpl__quals__j_e_i_Any_j_e_i_Default");
    final LayoutComponentPaletteScreenActivity instance = new LayoutComponentPaletteScreenActivity(_placeManager_0);
    setIncompleteInstance(instance);
    final LayoutComponentPaletteScreen LayoutComponentPaletteScreenActivity_realPresenter = (LayoutComponentPaletteScreen) contextManager.getInstance("Type_factory__o_u_e_l_e_c_LayoutComponentPaletteScreen__quals__j_e_i_Any_j_e_i_Default");
    LayoutComponentPaletteScreenActivity_LayoutComponentPaletteScreen_realPresenter(instance, LayoutComponentPaletteScreenActivity_realPresenter);
    setIncompleteInstance(null);
    return instance;
  }

  native static LayoutComponentPaletteScreen LayoutComponentPaletteScreenActivity_LayoutComponentPaletteScreen_realPresenter(LayoutComponentPaletteScreenActivity instance) /*-{
    return instance.@org.uberfire.ext.layout.editor.client.LayoutComponentPaletteScreenActivity::realPresenter;
  }-*/;

  native static void LayoutComponentPaletteScreenActivity_LayoutComponentPaletteScreen_realPresenter(LayoutComponentPaletteScreenActivity instance, LayoutComponentPaletteScreen value) /*-{
    instance.@org.uberfire.ext.layout.editor.client.LayoutComponentPaletteScreenActivity::realPresenter = value;
  }-*/;
}