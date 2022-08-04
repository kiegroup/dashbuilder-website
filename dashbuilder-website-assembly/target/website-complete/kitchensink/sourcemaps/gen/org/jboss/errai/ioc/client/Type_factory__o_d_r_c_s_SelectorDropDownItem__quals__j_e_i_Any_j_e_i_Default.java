package org.jboss.errai.ioc.client;

import javax.enterprise.context.Dependent;
import org.dashbuilder.renderer.client.selector.AbstractSelectorItemPresenter;
import org.dashbuilder.renderer.client.selector.SelectorDropDownItem;
import org.dashbuilder.renderer.client.selector.SelectorDropDownItem.View;
import org.dashbuilder.renderer.client.selector.SelectorDropDownItemView;
import org.dashbuilder.renderer.client.selector.SelectorItemPresenter;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class Type_factory__o_d_r_c_s_SelectorDropDownItem__quals__j_e_i_Any_j_e_i_Default extends Factory<SelectorDropDownItem> { public Type_factory__o_d_r_c_s_SelectorDropDownItem__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(SelectorDropDownItem.class, "Type_factory__o_d_r_c_s_SelectorDropDownItem__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { SelectorDropDownItem.class, AbstractSelectorItemPresenter.class, Object.class, SelectorItemPresenter.class });
  }

  public SelectorDropDownItem createInstance(final ContextManager contextManager) {
    final View _view_0 = (SelectorDropDownItemView) contextManager.getInstance("Type_factory__o_d_r_c_s_SelectorDropDownItemView__quals__j_e_i_Any_j_e_i_Default");
    final SelectorDropDownItem instance = new SelectorDropDownItem(_view_0);
    registerDependentScopedReference(instance, _view_0);
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }
}