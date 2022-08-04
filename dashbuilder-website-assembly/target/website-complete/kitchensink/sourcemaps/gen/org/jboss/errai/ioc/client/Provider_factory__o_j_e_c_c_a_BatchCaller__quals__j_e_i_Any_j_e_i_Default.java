package org.jboss.errai.ioc.client;

import javax.enterprise.context.Dependent;
import javax.inject.Provider;
import org.jboss.errai.common.client.api.BatchCaller;
import org.jboss.errai.ioc.client.api.Disposer;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class Provider_factory__o_j_e_c_c_a_BatchCaller__quals__j_e_i_Any_j_e_i_Default extends Factory<BatchCaller> { public Provider_factory__o_j_e_c_c_a_BatchCaller__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(BatchCaller.class, "Provider_factory__o_j_e_c_c_a_BatchCaller__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { BatchCaller.class });
  }

  public BatchCaller createInstance(final ContextManager contextManager) {
    final Provider<BatchCaller> provider = (Provider<BatchCaller>) contextManager.getInstance("Type_factory__o_j_e_i_s_b_c_BatchCallerProvider__quals__j_e_i_Any_j_e_i_Default");
    final BatchCaller instance = provider.get();
    setReference(instance, "disposer", provider);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((BatchCaller) instance, contextManager);
  }

  public void destroyInstanceHelper(final BatchCaller instance, final ContextManager contextManager) {
    ((Disposer) getReferenceAs(instance, "disposer", Disposer.class)).dispose(instance);
  }
}