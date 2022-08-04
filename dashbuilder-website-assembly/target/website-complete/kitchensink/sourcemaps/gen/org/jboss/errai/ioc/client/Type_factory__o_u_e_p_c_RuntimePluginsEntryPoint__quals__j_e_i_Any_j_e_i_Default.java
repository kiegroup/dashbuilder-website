package org.jboss.errai.ioc.client;

import org.jboss.errai.ioc.client.api.EntryPoint;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.uberfire.ext.plugin.client.RuntimePluginsEntryPoint;

public class Type_factory__o_u_e_p_c_RuntimePluginsEntryPoint__quals__j_e_i_Any_j_e_i_Default extends Factory<RuntimePluginsEntryPoint> { public Type_factory__o_u_e_p_c_RuntimePluginsEntryPoint__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(RuntimePluginsEntryPoint.class, "Type_factory__o_u_e_p_c_RuntimePluginsEntryPoint__quals__j_e_i_Any_j_e_i_Default", EntryPoint.class, true, null, true));
    handle.setAssignableTypes(new Class[] { RuntimePluginsEntryPoint.class, Object.class });
  }

  public RuntimePluginsEntryPoint createInstance(final ContextManager contextManager) {
    final RuntimePluginsEntryPoint instance = new RuntimePluginsEntryPoint();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void invokePostConstructs(final RuntimePluginsEntryPoint instance) {
    instance.init();
  }
}