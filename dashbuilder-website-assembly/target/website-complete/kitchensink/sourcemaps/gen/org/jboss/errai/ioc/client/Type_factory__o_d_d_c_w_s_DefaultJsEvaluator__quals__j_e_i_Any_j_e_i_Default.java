package org.jboss.errai.ioc.client;

import javax.enterprise.context.Dependent;
import org.dashbuilder.displayer.client.widgets.sourcecode.DefaultJsEvaluator;
import org.dashbuilder.displayer.client.widgets.sourcecode.JsEvaluator;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class Type_factory__o_d_d_c_w_s_DefaultJsEvaluator__quals__j_e_i_Any_j_e_i_Default extends Factory<DefaultJsEvaluator> { public Type_factory__o_d_d_c_w_s_DefaultJsEvaluator__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(DefaultJsEvaluator.class, "Type_factory__o_d_d_c_w_s_DefaultJsEvaluator__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { DefaultJsEvaluator.class, Object.class, JsEvaluator.class });
  }

  public DefaultJsEvaluator createInstance(final ContextManager contextManager) {
    final DefaultJsEvaluator instance = new DefaultJsEvaluator();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }
}