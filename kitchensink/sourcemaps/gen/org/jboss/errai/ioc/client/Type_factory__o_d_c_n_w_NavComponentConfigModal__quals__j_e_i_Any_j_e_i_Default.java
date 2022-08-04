package org.jboss.errai.ioc.client;

import com.google.gwt.user.client.ui.IsWidget;
import javax.enterprise.context.Dependent;
import org.dashbuilder.client.navigation.widget.NavComponentConfigModal;
import org.dashbuilder.client.navigation.widget.NavComponentConfigModal.View;
import org.dashbuilder.client.navigation.widget.NavComponentConfigModalView;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class Type_factory__o_d_c_n_w_NavComponentConfigModal__quals__j_e_i_Any_j_e_i_Default extends Factory<NavComponentConfigModal> { public Type_factory__o_d_c_n_w_NavComponentConfigModal__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(NavComponentConfigModal.class, "Type_factory__o_d_c_n_w_NavComponentConfigModal__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { NavComponentConfigModal.class, Object.class, IsWidget.class });
  }

  public NavComponentConfigModal createInstance(final ContextManager contextManager) {
    final View _view_0 = (NavComponentConfigModalView) contextManager.getInstance("Type_factory__o_d_c_n_w_NavComponentConfigModalView__quals__j_e_i_Any_j_e_i_Default");
    final NavComponentConfigModal instance = new NavComponentConfigModal(_view_0);
    registerDependentScopedReference(instance, _view_0);
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }
}