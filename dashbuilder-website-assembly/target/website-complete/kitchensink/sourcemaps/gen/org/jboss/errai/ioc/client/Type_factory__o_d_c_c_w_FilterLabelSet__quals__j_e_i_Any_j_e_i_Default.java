package org.jboss.errai.ioc.client;

import javax.enterprise.context.Dependent;
import org.dashbuilder.common.client.widgets.FilterLabelSet;
import org.dashbuilder.common.client.widgets.FilterLabelSet.View;
import org.dashbuilder.common.client.widgets.FilterLabelSetView;
import org.jboss.errai.common.client.api.IsElement;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.SyncBeanManager;

public class Type_factory__o_d_c_c_w_FilterLabelSet__quals__j_e_i_Any_j_e_i_Default extends Factory<FilterLabelSet> { public Type_factory__o_d_c_c_w_FilterLabelSet__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(FilterLabelSet.class, "Type_factory__o_d_c_c_w_FilterLabelSet__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { FilterLabelSet.class, Object.class, IsElement.class });
  }

  public FilterLabelSet createInstance(final ContextManager contextManager) {
    final SyncBeanManager _beanManager_1 = (SyncBeanManager) contextManager.getInstance("Producer_factory__o_j_e_i_c_c_SyncBeanManager__quals__j_e_i_Any_j_e_i_Default");
    final View _view_0 = (FilterLabelSetView) contextManager.getInstance("Type_factory__o_d_c_c_w_FilterLabelSetView__quals__j_e_i_Any_j_e_i_Default");
    final FilterLabelSet instance = new FilterLabelSet(_view_0, _beanManager_1);
    registerDependentScopedReference(instance, _beanManager_1);
    registerDependentScopedReference(instance, _view_0);
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }
}