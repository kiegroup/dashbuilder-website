package org.jboss.errai.ioc.client;

import javax.enterprise.context.Dependent;
import org.dashbuilder.client.widgets.SamplesCardRow;
import org.dashbuilder.client.widgets.SamplesCardRow.View;
import org.dashbuilder.client.widgets.view.SamplesCardRowView;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ui.client.local.api.elemental2.IsElement;

public class Type_factory__o_d_c_w_SamplesCardRow__quals__j_e_i_Any_j_e_i_Default extends Factory<SamplesCardRow> { public Type_factory__o_d_c_w_SamplesCardRow__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(SamplesCardRow.class, "Type_factory__o_d_c_w_SamplesCardRow__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { SamplesCardRow.class, Object.class, IsElement.class, org.jboss.errai.common.client.api.elemental2.IsElement.class });
  }

  public SamplesCardRow createInstance(final ContextManager contextManager) {
    final SamplesCardRow instance = new SamplesCardRow();
    setIncompleteInstance(instance);
    final SamplesCardRowView SamplesCardRow_view = (SamplesCardRowView) contextManager.getInstance("Type_factory__o_d_c_w_v_SamplesCardRowView__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, SamplesCardRow_view);
    SamplesCardRow_View_view(instance, SamplesCardRow_view);
    setIncompleteInstance(null);
    return instance;
  }

  public void invokePostConstructs(final SamplesCardRow instance) {
    instance.init();
  }

  native static View SamplesCardRow_View_view(SamplesCardRow instance) /*-{
    return instance.@org.dashbuilder.client.widgets.SamplesCardRow::view;
  }-*/;

  native static void SamplesCardRow_View_view(SamplesCardRow instance, View value) /*-{
    instance.@org.dashbuilder.client.widgets.SamplesCardRow::view = value;
  }-*/;
}