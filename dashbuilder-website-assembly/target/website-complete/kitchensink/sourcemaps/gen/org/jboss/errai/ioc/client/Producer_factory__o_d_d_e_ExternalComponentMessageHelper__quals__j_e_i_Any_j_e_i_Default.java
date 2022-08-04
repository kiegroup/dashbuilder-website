package org.jboss.errai.ioc.client;

import javax.enterprise.context.Dependent;
import org.dashbuilder.displayer.client.component.ExternalComponentMessageHelperProducer;
import org.dashbuilder.displayer.external.ExternalComponentMessageHelper;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class Producer_factory__o_d_d_e_ExternalComponentMessageHelper__quals__j_e_i_Any_j_e_i_Default extends Factory<ExternalComponentMessageHelper> { public Producer_factory__o_d_d_e_ExternalComponentMessageHelper__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(ExternalComponentMessageHelper.class, "Producer_factory__o_d_d_e_ExternalComponentMessageHelper__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { ExternalComponentMessageHelper.class, Object.class });
  }

  public ExternalComponentMessageHelper createInstance(final ContextManager contextManager) {
    ExternalComponentMessageHelperProducer producerInstance = contextManager.getInstance("Type_factory__o_d_d_c_c_ExternalComponentMessageHelperProducer__quals__j_e_i_Any_j_e_i_Default");
    producerInstance = Factory.maybeUnwrapProxy(producerInstance);
    final ExternalComponentMessageHelper instance = producerInstance.produce();
    thisInstance.setReference(instance, "producerInstance", producerInstance);
    return instance;
  }
}