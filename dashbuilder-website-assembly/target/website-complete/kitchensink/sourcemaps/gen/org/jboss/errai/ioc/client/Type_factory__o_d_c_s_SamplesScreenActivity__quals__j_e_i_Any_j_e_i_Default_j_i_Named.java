package org.jboss.errai.ioc.client;

import java.lang.annotation.Annotation;
import javax.enterprise.context.Dependent;
import org.dashbuilder.client.screens.SamplesScreen;
import org.dashbuilder.client.screens.SamplesScreenActivity;
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

public class Type_factory__o_d_c_s_SamplesScreenActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<SamplesScreenActivity> { public Type_factory__o_d_c_s_SamplesScreenActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named() {
    super(new FactoryHandleImpl(SamplesScreenActivity.class, "Type_factory__o_d_c_s_SamplesScreenActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named", Dependent.class, false, "SamplesScreen", true));
    handle.setAssignableTypes(new Class[] { SamplesScreenActivity.class, AbstractWorkbenchScreenActivity.class, AbstractWorkbenchActivity.class, AbstractActivity.class, Object.class, Activity.class, WorkbenchActivity.class, ContextSensitiveActivity.class, WorkbenchScreenActivity.class });
    handle.setQualifiers(new Annotation[] { QualifierUtil.ANY_ANNOTATION, QualifierUtil.DEFAULT_ANNOTATION, QualifierUtil.createNamed("SamplesScreen") });
  }

  public SamplesScreenActivity createInstance(final ContextManager contextManager) {
    final PlaceManager _placeManager_0 = (PlaceManagerImpl) contextManager.getInstance("Type_factory__o_u_c_m_PlaceManagerImpl__quals__j_e_i_Any_j_e_i_Default");
    final SamplesScreenActivity instance = new SamplesScreenActivity(_placeManager_0);
    setIncompleteInstance(instance);
    final SamplesScreen SamplesScreenActivity_realPresenter = (SamplesScreen) contextManager.getInstance("Type_factory__o_d_c_s_SamplesScreen__quals__j_e_i_Any_j_e_i_Default");
    SamplesScreenActivity_SamplesScreen_realPresenter(instance, SamplesScreenActivity_realPresenter);
    setIncompleteInstance(null);
    return instance;
  }

  native static SamplesScreen SamplesScreenActivity_SamplesScreen_realPresenter(SamplesScreenActivity instance) /*-{
    return instance.@org.dashbuilder.client.screens.SamplesScreenActivity::realPresenter;
  }-*/;

  native static void SamplesScreenActivity_SamplesScreen_realPresenter(SamplesScreenActivity instance, SamplesScreen value) /*-{
    instance.@org.dashbuilder.client.screens.SamplesScreenActivity::realPresenter = value;
  }-*/;
}