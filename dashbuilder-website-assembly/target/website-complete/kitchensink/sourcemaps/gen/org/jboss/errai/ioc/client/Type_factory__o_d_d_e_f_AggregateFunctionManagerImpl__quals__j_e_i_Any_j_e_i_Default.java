package org.jboss.errai.ioc.client;

import javax.enterprise.context.Dependent;
import org.dashbuilder.dataset.engine.function.AggregateFunctionManagerImpl;
import org.dashbuilder.dataset.group.AggregateFunctionManager;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class Type_factory__o_d_d_e_f_AggregateFunctionManagerImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<AggregateFunctionManagerImpl> { public Type_factory__o_d_d_e_f_AggregateFunctionManagerImpl__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(AggregateFunctionManagerImpl.class, "Type_factory__o_d_d_e_f_AggregateFunctionManagerImpl__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { AggregateFunctionManagerImpl.class, Object.class, AggregateFunctionManager.class });
  }

  public AggregateFunctionManagerImpl createInstance(final ContextManager contextManager) {
    final AggregateFunctionManagerImpl instance = new AggregateFunctionManagerImpl();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }
}