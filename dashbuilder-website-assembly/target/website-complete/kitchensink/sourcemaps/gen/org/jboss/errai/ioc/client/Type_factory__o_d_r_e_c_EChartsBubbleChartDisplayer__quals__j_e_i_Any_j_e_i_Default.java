package org.jboss.errai.ioc.client;

import com.google.gwt.user.client.ui.IsWidget;
import javax.enterprise.context.Dependent;
import org.dashbuilder.displayer.client.AbstractDisplayer;
import org.dashbuilder.displayer.client.AbstractGwtDisplayer;
import org.dashbuilder.displayer.client.Displayer;
import org.dashbuilder.displayer.client.DisplayerListener;
import org.dashbuilder.renderer.echarts.client.EChartsAbstractDisplayer;
import org.dashbuilder.renderer.echarts.client.EChartsBubbleChartDisplayer;
import org.dashbuilder.renderer.echarts.client.EChartsDisplayerView;
import org.dashbuilder.renderer.echarts.client.EChartsXYDisplayer;
import org.dashbuilder.renderer.echarts.client.js.EChartsTypeFactory;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class Type_factory__o_d_r_e_c_EChartsBubbleChartDisplayer__quals__j_e_i_Any_j_e_i_Default extends Factory<EChartsBubbleChartDisplayer> { public Type_factory__o_d_r_e_c_EChartsBubbleChartDisplayer__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(EChartsBubbleChartDisplayer.class, "Type_factory__o_d_r_e_c_EChartsBubbleChartDisplayer__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { EChartsBubbleChartDisplayer.class, EChartsXYDisplayer.class, EChartsAbstractDisplayer.class, AbstractGwtDisplayer.class, AbstractDisplayer.class, Object.class, Displayer.class, DisplayerListener.class, IsWidget.class });
  }

  public EChartsBubbleChartDisplayer createInstance(final ContextManager contextManager) {
    final EChartsDisplayerView _view_0 = (EChartsDisplayerView) contextManager.getInstance("Type_factory__o_d_r_e_c_EChartsDisplayerView__quals__j_e_i_Any_j_e_i_Default");
    final EChartsTypeFactory _echartsFactory_1 = (EChartsTypeFactory) contextManager.getInstance("Type_factory__o_d_r_e_c_j_EChartsTypeFactory__quals__j_e_i_Any_j_e_i_Default");
    final EChartsBubbleChartDisplayer instance = new EChartsBubbleChartDisplayer(_view_0, _echartsFactory_1);
    registerDependentScopedReference(instance, _view_0);
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void invokePostConstructs(final EChartsBubbleChartDisplayer instance) {
    instance.init();
  }
}