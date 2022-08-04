package org.jboss.errai.ioc.client;

import javax.enterprise.context.Dependent;
import org.dashbuilder.dataset.engine.group.IntervalBuilder;
import org.dashbuilder.dataset.engine.group.IntervalBuilderDynamicLabel;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class Type_factory__o_d_d_e_g_IntervalBuilderDynamicLabel__quals__j_e_i_Any_j_e_i_Default extends Factory<IntervalBuilderDynamicLabel> { public Type_factory__o_d_d_e_g_IntervalBuilderDynamicLabel__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(IntervalBuilderDynamicLabel.class, "Type_factory__o_d_d_e_g_IntervalBuilderDynamicLabel__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { IntervalBuilderDynamicLabel.class, Object.class, IntervalBuilder.class });
  }

  public IntervalBuilderDynamicLabel createInstance(final ContextManager contextManager) {
    final IntervalBuilderDynamicLabel instance = new IntervalBuilderDynamicLabel();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }
}