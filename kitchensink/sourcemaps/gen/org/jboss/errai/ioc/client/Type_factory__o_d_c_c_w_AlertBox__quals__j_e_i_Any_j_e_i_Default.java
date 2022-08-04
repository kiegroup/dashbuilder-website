package org.jboss.errai.ioc.client;

import javax.enterprise.context.Dependent;
import org.dashbuilder.common.client.widgets.AlertBox;
import org.dashbuilder.common.client.widgets.AlertBox.View;
import org.dashbuilder.common.client.widgets.AlertBoxView;
import org.jboss.errai.common.client.api.IsElement;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class Type_factory__o_d_c_c_w_AlertBox__quals__j_e_i_Any_j_e_i_Default extends Factory<AlertBox> { public Type_factory__o_d_c_c_w_AlertBox__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(AlertBox.class, "Type_factory__o_d_c_c_w_AlertBox__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { AlertBox.class, Object.class, IsElement.class });
  }

  public AlertBox createInstance(final ContextManager contextManager) {
    final View _view_0 = (AlertBoxView) contextManager.getInstance("Type_factory__o_d_c_c_w_AlertBoxView__quals__j_e_i_Any_j_e_i_Default");
    final AlertBox instance = new AlertBox(_view_0);
    registerDependentScopedReference(instance, _view_0);
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }
}