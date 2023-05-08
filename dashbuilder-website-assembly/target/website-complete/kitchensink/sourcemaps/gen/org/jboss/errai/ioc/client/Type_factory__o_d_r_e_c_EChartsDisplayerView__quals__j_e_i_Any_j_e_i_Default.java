package org.jboss.errai.ioc.client;

import com.google.gwt.event.logical.shared.HasAttachHandlers;
import com.google.gwt.event.shared.HasHandlers;
import com.google.gwt.user.client.EventListener;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasVisibility;
import com.google.gwt.user.client.ui.IsRenderable;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.UIObject;
import com.google.gwt.user.client.ui.Widget;
import javax.enterprise.context.Dependent;
import org.dashbuilder.displayer.client.AbstractGwtDisplayer.View;
import org.dashbuilder.displayer.client.AbstractGwtDisplayerView;
import org.dashbuilder.renderer.echarts.client.EChartsDisplayerView;
import org.dashbuilder.renderer.echarts.client.EChartsResizeHandlerRegister;
import org.dashbuilder.renderer.echarts.client.js.EChartsTypeFactory;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.uberfire.client.mvp.HasPresenter;
import org.uberfire.client.mvp.UberView;

public class Type_factory__o_d_r_e_c_EChartsDisplayerView__quals__j_e_i_Any_j_e_i_Default extends Factory<EChartsDisplayerView> { public Type_factory__o_d_r_e_c_EChartsDisplayerView__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(EChartsDisplayerView.class, "Type_factory__o_d_r_e_c_EChartsDisplayerView__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { EChartsDisplayerView.class, AbstractGwtDisplayerView.class, Composite.class, Widget.class, UIObject.class, Object.class, HasVisibility.class, EventListener.class, HasAttachHandlers.class, HasHandlers.class, IsWidget.class, IsRenderable.class, View.class, org.dashbuilder.displayer.client.AbstractDisplayer.View.class, UberView.class, HasPresenter.class, org.dashbuilder.renderer.echarts.client.EChartsAbstractDisplayer.View.class, View.class, UberView.class, HasPresenter.class });
  }

  public EChartsDisplayerView createInstance(final ContextManager contextManager) {
    final EChartsDisplayerView instance = new EChartsDisplayerView();
    setIncompleteInstance(instance);
    final EChartsTypeFactory EChartsDisplayerView_echartsFactory = (EChartsTypeFactory) contextManager.getInstance("Type_factory__o_d_r_e_c_j_EChartsTypeFactory__quals__j_e_i_Any_j_e_i_Default");
    EChartsDisplayerView_EChartsTypeFactory_echartsFactory(instance, EChartsDisplayerView_echartsFactory);
    final EChartsResizeHandlerRegister EChartsDisplayerView_eChartsResizeHandlerRegister = (EChartsResizeHandlerRegister) contextManager.getInstance("Type_factory__o_d_r_e_c_EChartsResizeHandlerRegister__quals__j_e_i_Any_j_e_i_Default");
    EChartsDisplayerView_EChartsResizeHandlerRegister_eChartsResizeHandlerRegister(instance, EChartsDisplayerView_eChartsResizeHandlerRegister);
    setIncompleteInstance(null);
    return instance;
  }

  native static EChartsResizeHandlerRegister EChartsDisplayerView_EChartsResizeHandlerRegister_eChartsResizeHandlerRegister(EChartsDisplayerView instance) /*-{
    return instance.@org.dashbuilder.renderer.echarts.client.EChartsDisplayerView::eChartsResizeHandlerRegister;
  }-*/;

  native static void EChartsDisplayerView_EChartsResizeHandlerRegister_eChartsResizeHandlerRegister(EChartsDisplayerView instance, EChartsResizeHandlerRegister value) /*-{
    instance.@org.dashbuilder.renderer.echarts.client.EChartsDisplayerView::eChartsResizeHandlerRegister = value;
  }-*/;

  native static EChartsTypeFactory EChartsDisplayerView_EChartsTypeFactory_echartsFactory(EChartsDisplayerView instance) /*-{
    return instance.@org.dashbuilder.renderer.echarts.client.EChartsDisplayerView::echartsFactory;
  }-*/;

  native static void EChartsDisplayerView_EChartsTypeFactory_echartsFactory(EChartsDisplayerView instance, EChartsTypeFactory value) /*-{
    instance.@org.dashbuilder.renderer.echarts.client.EChartsDisplayerView::echartsFactory = value;
  }-*/;
}