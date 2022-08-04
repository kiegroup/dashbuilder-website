package org.jboss.errai.ioc.client;

import javax.inject.Singleton;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.support.bus.client.MessageBusProvider;

public class Type_factory__o_j_e_i_s_b_c_MessageBusProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<MessageBusProvider> { public Type_factory__o_j_e_i_s_b_c_MessageBusProvider__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(MessageBusProvider.class, "Type_factory__o_j_e_i_s_b_c_MessageBusProvider__quals__j_e_i_Any_j_e_i_Default", Singleton.class, false, null, true));
    handle.setAssignableTypes(new Class[] { MessageBusProvider.class, Object.class });
  }

  public MessageBusProvider createInstance(final ContextManager contextManager) {
    final MessageBusProvider instance = new MessageBusProvider();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }
}