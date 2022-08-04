package org.jboss.errai.ioc.client;

import javax.enterprise.context.Dependent;
import org.dashbuilder.dataset.client.engine.ClientDateFormatter;
import org.dashbuilder.dataset.client.engine.ClientDateFormatterImpl;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class Type_factory__o_d_d_c_e_ClientDateFormatterImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<ClientDateFormatterImpl> { public Type_factory__o_d_d_c_e_ClientDateFormatterImpl__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(ClientDateFormatterImpl.class, "Type_factory__o_d_d_c_e_ClientDateFormatterImpl__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { ClientDateFormatterImpl.class, Object.class, ClientDateFormatter.class });
  }

  public ClientDateFormatterImpl createInstance(final ContextManager contextManager) {
    final ClientDateFormatterImpl instance = new ClientDateFormatterImpl();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }
}