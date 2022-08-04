package org.jboss.errai.ioc.client;

import javax.enterprise.context.Dependent;
import org.dashbuilder.displayer.client.component.function.GWTVersion;
import org.dashbuilder.displayer.external.ExternalComponentFunction;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class Type_factory__o_d_d_c_c_f_GWTVersion__quals__j_e_i_Any_j_e_i_Default extends Factory<GWTVersion> { public Type_factory__o_d_d_c_c_f_GWTVersion__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(GWTVersion.class, "Type_factory__o_d_d_c_c_f_GWTVersion__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { GWTVersion.class, Object.class, ExternalComponentFunction.class });
  }

  public GWTVersion createInstance(final ContextManager contextManager) {
    final GWTVersion instance = new GWTVersion();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }
}