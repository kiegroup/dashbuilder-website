package org.jboss.errai.ioc.client;

import javax.enterprise.context.Dependent;
import org.dashbuilder.displayer.client.component.function.ComponentFunctionLocator;
import org.dashbuilder.displayer.client.component.function.ListFunctions;
import org.dashbuilder.displayer.external.ExternalComponentFunction;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class Type_factory__o_d_d_c_c_f_ListFunctions__quals__j_e_i_Any_j_e_i_Default extends Factory<ListFunctions> { public Type_factory__o_d_d_c_c_f_ListFunctions__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(ListFunctions.class, "Type_factory__o_d_d_c_c_f_ListFunctions__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { ListFunctions.class, Object.class, ExternalComponentFunction.class });
  }

  public ListFunctions createInstance(final ContextManager contextManager) {
    final ListFunctions instance = new ListFunctions();
    setIncompleteInstance(instance);
    final ComponentFunctionLocator ListFunctions_locator = (ComponentFunctionLocator) contextManager.getInstance("Type_factory__o_d_d_c_c_f_ComponentFunctionLocator__quals__j_e_i_Any_j_e_i_Default");
    ListFunctions_ComponentFunctionLocator_locator(instance, ListFunctions_locator);
    setIncompleteInstance(null);
    return instance;
  }

  native static ComponentFunctionLocator ListFunctions_ComponentFunctionLocator_locator(ListFunctions instance) /*-{
    return instance.@org.dashbuilder.displayer.client.component.function.ListFunctions::locator;
  }-*/;

  native static void ListFunctions_ComponentFunctionLocator_locator(ListFunctions instance, ComponentFunctionLocator value) /*-{
    instance.@org.dashbuilder.displayer.client.component.function.ListFunctions::locator = value;
  }-*/;
}