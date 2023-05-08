package org.jboss.errai.ioc.client;

import com.google.gwt.user.client.ui.IsWidget;
import javax.enterprise.context.Dependent;
import org.dashbuilder.displayer.client.AbstractDisplayer;
import org.dashbuilder.displayer.client.AbstractGwtDisplayer;
import org.dashbuilder.displayer.client.Displayer;
import org.dashbuilder.displayer.client.DisplayerListener;
import org.dashbuilder.renderer.client.metric.MetricDisplayer;
import org.dashbuilder.renderer.client.metric.MetricDisplayer.View;
import org.dashbuilder.renderer.client.metric.MetricView;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class Type_factory__o_d_r_c_m_MetricDisplayer__quals__j_e_i_Any_j_e_i_Default extends Factory<MetricDisplayer> { public Type_factory__o_d_r_c_m_MetricDisplayer__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(MetricDisplayer.class, "Type_factory__o_d_r_c_m_MetricDisplayer__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { MetricDisplayer.class, AbstractGwtDisplayer.class, AbstractDisplayer.class, Object.class, Displayer.class, DisplayerListener.class, IsWidget.class });
  }

  public MetricDisplayer createInstance(final ContextManager contextManager) {
    final View _view_0 = (MetricView) contextManager.getInstance("Type_factory__o_d_r_c_m_MetricView__quals__j_e_i_Any_j_e_i_Default");
    final MetricDisplayer instance = new MetricDisplayer(_view_0);
    registerDependentScopedReference(instance, _view_0);
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }
}