package org.jboss.errai.ioc.client;

import javax.enterprise.context.Dependent;
import org.dashbuilder.dataset.engine.group.IntervalBuilder;
import org.dashbuilder.dataset.engine.group.IntervalBuilderFixedDate;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class Type_factory__o_d_d_e_g_IntervalBuilderFixedDate__quals__j_e_i_Any_j_e_i_Default extends Factory<IntervalBuilderFixedDate> { public Type_factory__o_d_d_e_g_IntervalBuilderFixedDate__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(IntervalBuilderFixedDate.class, "Type_factory__o_d_d_e_g_IntervalBuilderFixedDate__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { IntervalBuilderFixedDate.class, Object.class, IntervalBuilder.class });
  }

  public IntervalBuilderFixedDate createInstance(final ContextManager contextManager) {
    final IntervalBuilderFixedDate instance = new IntervalBuilderFixedDate();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }
}