package org.jboss.errai.ioc.client;

import javax.inject.Provider;
import javax.inject.Singleton;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.support.bus.client.RequestDispatcherProvider;

public class Type_factory__o_j_e_i_s_b_c_RequestDispatcherProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<RequestDispatcherProvider> { public Type_factory__o_j_e_i_s_b_c_RequestDispatcherProvider__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(RequestDispatcherProvider.class, "Type_factory__o_j_e_i_s_b_c_RequestDispatcherProvider__quals__j_e_i_Any_j_e_i_Default", Singleton.class, false, null, true));
    handle.setAssignableTypes(new Class[] { RequestDispatcherProvider.class, Object.class, Provider.class });
  }

  public RequestDispatcherProvider createInstance(final ContextManager contextManager) {
    final RequestDispatcherProvider instance = new RequestDispatcherProvider();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }
}