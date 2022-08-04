package org.jboss.errai.ioc.client;

import javax.inject.Singleton;
import org.jboss.errai.ioc.client.api.ContextualTypeProvider;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.support.bus.client.SenderProvider;

public class Type_factory__o_j_e_i_s_b_c_SenderProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<SenderProvider> { public Type_factory__o_j_e_i_s_b_c_SenderProvider__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(SenderProvider.class, "Type_factory__o_j_e_i_s_b_c_SenderProvider__quals__j_e_i_Any_j_e_i_Default", Singleton.class, false, null, true));
    handle.setAssignableTypes(new Class[] { SenderProvider.class, Object.class, ContextualTypeProvider.class });
  }

  public SenderProvider createInstance(final ContextManager contextManager) {
    final SenderProvider instance = new SenderProvider();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }
}