package org.jboss.errai.ioc.client;

import javax.enterprise.context.Dependent;
import org.dashbuilder.client.error.DefaultRuntimeErrorCallback;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.uberfire.ext.widgets.common.client.common.BusyIndicatorView;

public class Type_factory__o_d_c_e_DefaultRuntimeErrorCallback__quals__j_e_i_Any_j_e_i_Default extends Factory<DefaultRuntimeErrorCallback> { public Type_factory__o_d_c_e_DefaultRuntimeErrorCallback__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(DefaultRuntimeErrorCallback.class, "Type_factory__o_d_c_e_DefaultRuntimeErrorCallback__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { DefaultRuntimeErrorCallback.class, Object.class });
  }

  public DefaultRuntimeErrorCallback createInstance(final ContextManager contextManager) {
    final DefaultRuntimeErrorCallback instance = new DefaultRuntimeErrorCallback();
    setIncompleteInstance(instance);
    final BusyIndicatorView DefaultRuntimeErrorCallback_loading = (BusyIndicatorView) contextManager.getInstance("Type_factory__o_u_e_w_c_c_c_BusyIndicatorView__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, DefaultRuntimeErrorCallback_loading);
    DefaultRuntimeErrorCallback_BusyIndicatorView_loading(instance, DefaultRuntimeErrorCallback_loading);
    setIncompleteInstance(null);
    return instance;
  }

  native static BusyIndicatorView DefaultRuntimeErrorCallback_BusyIndicatorView_loading(DefaultRuntimeErrorCallback instance) /*-{
    return instance.@org.dashbuilder.client.error.DefaultRuntimeErrorCallback::loading;
  }-*/;

  native static void DefaultRuntimeErrorCallback_BusyIndicatorView_loading(DefaultRuntimeErrorCallback instance, BusyIndicatorView value) /*-{
    instance.@org.dashbuilder.client.error.DefaultRuntimeErrorCallback::loading = value;
  }-*/;
}