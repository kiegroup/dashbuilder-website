package org.jboss.errai.ioc.client;

import com.google.gwt.user.client.ui.IsWidget;
import javax.enterprise.context.Dependent;
import org.dashbuilder.displayer.client.RendererManager;
import org.dashbuilder.displayer.client.widgets.RendererSelector;
import org.dashbuilder.displayer.client.widgets.RendererSelector.ListBoxView;
import org.dashbuilder.displayer.client.widgets.RendererSelector.RadioListView;
import org.dashbuilder.displayer.client.widgets.RendererSelector.TabListView;
import org.dashbuilder.displayer.client.widgets.RendererSelectorListBoxView;
import org.dashbuilder.displayer.client.widgets.RendererSelectorRadioListView;
import org.dashbuilder.displayer.client.widgets.RendererSelectorTabListView;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class Type_factory__o_d_d_c_w_RendererSelector__quals__j_e_i_Any_j_e_i_Default extends Factory<RendererSelector> { public Type_factory__o_d_d_c_w_RendererSelector__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(RendererSelector.class, "Type_factory__o_d_d_c_w_RendererSelector__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { RendererSelector.class, Object.class, IsWidget.class });
  }

  public RendererSelector createInstance(final ContextManager contextManager) {
    final ListBoxView _listBoxView_1 = (RendererSelectorListBoxView) contextManager.getInstance("Type_factory__o_d_d_c_w_RendererSelectorListBoxView__quals__j_e_i_Any_j_e_i_Default");
    final TabListView _tabListView_0 = (RendererSelectorTabListView) contextManager.getInstance("Type_factory__o_d_d_c_w_RendererSelectorTabListView__quals__j_e_i_Any_j_e_i_Default");
    final RadioListView _radioListView_2 = (RendererSelectorRadioListView) contextManager.getInstance("Type_factory__o_d_d_c_w_RendererSelectorRadioListView__quals__j_e_i_Any_j_e_i_Default");
    final RendererManager _rendererManager_3 = (RendererManager) contextManager.getInstance("Type_factory__o_d_d_c_RendererManager__quals__j_e_i_Any_j_e_i_Default");
    final RendererSelector instance = new RendererSelector(_tabListView_0, _listBoxView_1, _radioListView_2, _rendererManager_3);
    registerDependentScopedReference(instance, _listBoxView_1);
    registerDependentScopedReference(instance, _tabListView_0);
    registerDependentScopedReference(instance, _radioListView_2);
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }
}