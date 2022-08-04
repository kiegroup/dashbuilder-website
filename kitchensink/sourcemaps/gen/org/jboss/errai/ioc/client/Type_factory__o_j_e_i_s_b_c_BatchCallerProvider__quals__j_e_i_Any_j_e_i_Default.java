package org.jboss.errai.ioc.client;

import javax.inject.Provider;
import javax.inject.Singleton;
import org.jboss.errai.ioc.client.api.Disposer;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.support.bus.client.BatchCallerProvider;

public class Type_factory__o_j_e_i_s_b_c_BatchCallerProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<BatchCallerProvider> { public Type_factory__o_j_e_i_s_b_c_BatchCallerProvider__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(BatchCallerProvider.class, "Type_factory__o_j_e_i_s_b_c_BatchCallerProvider__quals__j_e_i_Any_j_e_i_Default", Singleton.class, false, null, true));
    handle.setAssignableTypes(new Class[] { BatchCallerProvider.class, Object.class, Provider.class, Disposer.class });
  }

  public BatchCallerProvider createInstance(final ContextManager contextManager) {
    final BatchCallerProvider instance = new BatchCallerProvider();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }
}