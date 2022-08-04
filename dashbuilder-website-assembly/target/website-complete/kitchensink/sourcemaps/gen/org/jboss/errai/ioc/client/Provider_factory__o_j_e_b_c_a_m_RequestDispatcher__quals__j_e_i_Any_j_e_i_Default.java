package org.jboss.errai.ioc.client;

import javax.enterprise.context.Dependent;
import javax.inject.Provider;
import org.jboss.errai.bus.client.api.messaging.RequestDispatcher;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class Provider_factory__o_j_e_b_c_a_m_RequestDispatcher__quals__j_e_i_Any_j_e_i_Default extends Factory<RequestDispatcher> { public Provider_factory__o_j_e_b_c_a_m_RequestDispatcher__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(RequestDispatcher.class, "Provider_factory__o_j_e_b_c_a_m_RequestDispatcher__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { RequestDispatcher.class });
  }

  public RequestDispatcher createInstance(final ContextManager contextManager) {
    final Provider<RequestDispatcher> provider = (Provider<RequestDispatcher>) contextManager.getInstance("Type_factory__o_j_e_i_s_b_c_RequestDispatcherProvider__quals__j_e_i_Any_j_e_i_Default");
    final RequestDispatcher instance = provider.get();
    return instance;
  }
}