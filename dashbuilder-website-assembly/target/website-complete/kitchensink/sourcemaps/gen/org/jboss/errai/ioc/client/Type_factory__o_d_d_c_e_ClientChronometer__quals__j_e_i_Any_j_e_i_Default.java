package org.jboss.errai.ioc.client;

import javax.enterprise.context.Dependent;
import org.dashbuilder.dataset.client.engine.ClientChronometer;
import org.dashbuilder.dataset.engine.Chronometer;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class Type_factory__o_d_d_c_e_ClientChronometer__quals__j_e_i_Any_j_e_i_Default extends Factory<ClientChronometer> { public Type_factory__o_d_d_c_e_ClientChronometer__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(ClientChronometer.class, "Type_factory__o_d_d_c_e_ClientChronometer__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { ClientChronometer.class, Object.class, Chronometer.class });
  }

  public ClientChronometer createInstance(final ContextManager contextManager) {
    final ClientChronometer instance = new ClientChronometer();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }
}