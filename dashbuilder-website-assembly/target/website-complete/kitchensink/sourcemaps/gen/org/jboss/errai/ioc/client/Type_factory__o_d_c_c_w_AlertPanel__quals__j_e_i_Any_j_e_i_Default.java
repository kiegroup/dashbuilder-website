package org.jboss.errai.ioc.client;

import com.google.gwt.user.client.ui.IsWidget;
import javax.enterprise.context.Dependent;
import org.dashbuilder.common.client.widgets.AlertPanel;
import org.dashbuilder.common.client.widgets.AlertPanel.View;
import org.dashbuilder.common.client.widgets.AlertPanelView;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class Type_factory__o_d_c_c_w_AlertPanel__quals__j_e_i_Any_j_e_i_Default extends Factory<AlertPanel> { public Type_factory__o_d_c_c_w_AlertPanel__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(AlertPanel.class, "Type_factory__o_d_c_c_w_AlertPanel__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { AlertPanel.class, Object.class, IsWidget.class });
  }

  public AlertPanel createInstance(final ContextManager contextManager) {
    final View _view_0 = (AlertPanelView) contextManager.getInstance("Type_factory__o_d_c_c_w_AlertPanelView__quals__j_e_i_Any_j_e_i_Default");
    final AlertPanel instance = new AlertPanel(_view_0);
    registerDependentScopedReference(instance, _view_0);
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }
}