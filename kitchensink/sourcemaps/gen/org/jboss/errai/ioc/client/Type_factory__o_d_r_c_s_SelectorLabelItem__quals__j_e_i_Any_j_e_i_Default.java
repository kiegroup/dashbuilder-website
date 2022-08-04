package org.jboss.errai.ioc.client;

import javax.enterprise.context.Dependent;
import org.dashbuilder.renderer.client.selector.AbstractSelectorItemPresenter;
import org.dashbuilder.renderer.client.selector.SelectorItemPresenter;
import org.dashbuilder.renderer.client.selector.SelectorLabelItem;
import org.dashbuilder.renderer.client.selector.SelectorLabelItem.View;
import org.dashbuilder.renderer.client.selector.SelectorLabelItemView;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class Type_factory__o_d_r_c_s_SelectorLabelItem__quals__j_e_i_Any_j_e_i_Default extends Factory<SelectorLabelItem> { public Type_factory__o_d_r_c_s_SelectorLabelItem__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(SelectorLabelItem.class, "Type_factory__o_d_r_c_s_SelectorLabelItem__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { SelectorLabelItem.class, AbstractSelectorItemPresenter.class, Object.class, SelectorItemPresenter.class });
  }

  public SelectorLabelItem createInstance(final ContextManager contextManager) {
    final View _view_0 = (SelectorLabelItemView) contextManager.getInstance("Type_factory__o_d_r_c_s_SelectorLabelItemView__quals__j_e_i_Any_j_e_i_Default");
    final SelectorLabelItem instance = new SelectorLabelItem(_view_0);
    registerDependentScopedReference(instance, _view_0);
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }
}