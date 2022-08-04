package org.jboss.errai.ioc.client;

import javax.enterprise.context.Dependent;
import org.dashbuilder.displayer.client.DisplayerCoordinator;
import org.dashbuilder.displayer.client.RendererManager;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class Type_factory__o_d_d_c_DisplayerCoordinator__quals__j_e_i_Any_j_e_i_Default extends Factory<DisplayerCoordinator> { public Type_factory__o_d_d_c_DisplayerCoordinator__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(DisplayerCoordinator.class, "Type_factory__o_d_d_c_DisplayerCoordinator__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { DisplayerCoordinator.class, Object.class });
  }

  public DisplayerCoordinator createInstance(final ContextManager contextManager) {
    final RendererManager _rendererManager_0 = (RendererManager) contextManager.getInstance("Type_factory__o_d_d_c_RendererManager__quals__j_e_i_Any_j_e_i_Default");
    final DisplayerCoordinator instance = new DisplayerCoordinator(_rendererManager_0);
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }
}