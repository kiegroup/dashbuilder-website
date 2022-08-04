package org.jboss.errai.ioc.client;

import org.dashbuilder.displayer.client.DisplayerClientEntryPoint;
import org.jboss.errai.ioc.client.api.EntryPoint;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class Type_factory__o_d_d_c_DisplayerClientEntryPoint__quals__j_e_i_Any_j_e_i_Default extends Factory<DisplayerClientEntryPoint> { public Type_factory__o_d_d_c_DisplayerClientEntryPoint__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(DisplayerClientEntryPoint.class, "Type_factory__o_d_d_c_DisplayerClientEntryPoint__quals__j_e_i_Any_j_e_i_Default", EntryPoint.class, true, null, true));
    handle.setAssignableTypes(new Class[] { DisplayerClientEntryPoint.class, Object.class });
  }

  public DisplayerClientEntryPoint createInstance(final ContextManager contextManager) {
    final DisplayerClientEntryPoint instance = new DisplayerClientEntryPoint();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }
}