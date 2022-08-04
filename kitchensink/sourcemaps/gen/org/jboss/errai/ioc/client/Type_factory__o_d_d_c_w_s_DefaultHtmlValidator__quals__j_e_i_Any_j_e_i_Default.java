package org.jboss.errai.ioc.client;

import javax.enterprise.context.Dependent;
import org.dashbuilder.displayer.client.widgets.sourcecode.DefaultHtmlValidator;
import org.dashbuilder.displayer.client.widgets.sourcecode.HtmlValidator;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class Type_factory__o_d_d_c_w_s_DefaultHtmlValidator__quals__j_e_i_Any_j_e_i_Default extends Factory<DefaultHtmlValidator> { public Type_factory__o_d_d_c_w_s_DefaultHtmlValidator__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(DefaultHtmlValidator.class, "Type_factory__o_d_d_c_w_s_DefaultHtmlValidator__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { DefaultHtmlValidator.class, Object.class, HtmlValidator.class });
  }

  public DefaultHtmlValidator createInstance(final ContextManager contextManager) {
    final DefaultHtmlValidator instance = new DefaultHtmlValidator();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }
}