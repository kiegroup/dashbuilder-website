package org.jboss.errai.ioc.client;

import javax.enterprise.context.Dependent;
import org.dashbuilder.common.client.widgets.FilterLabel;
import org.dashbuilder.common.client.widgets.FilterLabel.View;
import org.dashbuilder.common.client.widgets.FilterLabelView;
import org.jboss.errai.common.client.api.IsElement;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class Type_factory__o_d_c_c_w_FilterLabel__quals__j_e_i_Any_j_e_i_Default extends Factory<FilterLabel> { public Type_factory__o_d_c_c_w_FilterLabel__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(FilterLabel.class, "Type_factory__o_d_c_c_w_FilterLabel__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { FilterLabel.class, Object.class, IsElement.class });
  }

  public FilterLabel createInstance(final ContextManager contextManager) {
    final View _view_0 = (FilterLabelView) contextManager.getInstance("Type_factory__o_d_c_c_w_FilterLabelView__quals__j_e_i_Any_j_e_i_Default");
    final FilterLabel instance = new FilterLabel(_view_0);
    registerDependentScopedReference(instance, _view_0);
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }
}