package org.jboss.errai.ioc.client;

import javax.enterprise.context.Dependent;
import org.dashbuilder.client.navigation.plugin.PerspectivePluginManager;
import org.dashbuilder.client.navigation.widget.NavItemTileWidget;
import org.dashbuilder.client.navigation.widget.NavItemTileWidget.View;
import org.dashbuilder.client.navigation.widget.NavItemTileWidgetView;
import org.dashbuilder.client.plugins.RuntimePerspectivePluginManager;
import org.jboss.errai.common.client.api.IsElement;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class Type_factory__o_d_c_n_w_NavItemTileWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<NavItemTileWidget> { public Type_factory__o_d_c_n_w_NavItemTileWidget__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(NavItemTileWidget.class, "Type_factory__o_d_c_n_w_NavItemTileWidget__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { NavItemTileWidget.class, Object.class, IsElement.class });
  }

  public NavItemTileWidget createInstance(final ContextManager contextManager) {
    final View _view_0 = (NavItemTileWidgetView) contextManager.getInstance("Type_factory__o_d_c_n_w_NavItemTileWidgetView__quals__j_e_i_Any_j_e_i_Default");
    final PerspectivePluginManager _perspectivePluginManager_1 = (RuntimePerspectivePluginManager) contextManager.getInstance("Type_factory__o_d_c_p_RuntimePerspectivePluginManager__quals__j_e_i_Any_j_e_i_Default");
    final NavItemTileWidget instance = new NavItemTileWidget(_view_0, _perspectivePluginManager_1);
    registerDependentScopedReference(instance, _view_0);
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }
}