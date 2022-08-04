package org.jboss.errai.ioc.client;

import javax.enterprise.context.Dependent;
import org.dashbuilder.common.client.widgets.LoadingBox.View;
import org.dashbuilder.common.client.widgets.LoadingBoxView;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class Type_factory__o_d_c_c_w_LoadingBoxView__quals__j_e_i_Any_j_e_i_Default extends Factory<LoadingBoxView> { public Type_factory__o_d_c_c_w_LoadingBoxView__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(LoadingBoxView.class, "Type_factory__o_d_c_c_w_LoadingBoxView__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { LoadingBoxView.class, Object.class, View.class });
  }

  public LoadingBoxView createInstance(final ContextManager contextManager) {
    final LoadingBoxView instance = new LoadingBoxView();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }
}