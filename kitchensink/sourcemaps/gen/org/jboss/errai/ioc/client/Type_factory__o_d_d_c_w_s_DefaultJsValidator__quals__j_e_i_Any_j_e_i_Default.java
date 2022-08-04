package org.jboss.errai.ioc.client;

import javax.enterprise.context.Dependent;
import org.dashbuilder.displayer.client.widgets.sourcecode.DefaultJsEvaluator;
import org.dashbuilder.displayer.client.widgets.sourcecode.DefaultJsValidator;
import org.dashbuilder.displayer.client.widgets.sourcecode.JsEvaluator;
import org.dashbuilder.displayer.client.widgets.sourcecode.JsValidator;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class Type_factory__o_d_d_c_w_s_DefaultJsValidator__quals__j_e_i_Any_j_e_i_Default extends Factory<DefaultJsValidator> { public Type_factory__o_d_d_c_w_s_DefaultJsValidator__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(DefaultJsValidator.class, "Type_factory__o_d_d_c_w_s_DefaultJsValidator__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { DefaultJsValidator.class, Object.class, JsValidator.class });
  }

  public DefaultJsValidator createInstance(final ContextManager contextManager) {
    final JsEvaluator _jsEvaluator_0 = (DefaultJsEvaluator) contextManager.getInstance("Type_factory__o_d_d_c_w_s_DefaultJsEvaluator__quals__j_e_i_Any_j_e_i_Default");
    final DefaultJsValidator instance = new DefaultJsValidator(_jsEvaluator_0);
    registerDependentScopedReference(instance, _jsEvaluator_0);
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }
}