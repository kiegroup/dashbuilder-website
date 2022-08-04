package org.jboss.errai.ioc.client;

import com.google.gwt.user.client.ui.IsWidget;
import javax.enterprise.context.Dependent;
import org.dashbuilder.displayer.client.AbstractDisplayer;
import org.dashbuilder.displayer.client.AbstractGwtDisplayer;
import org.dashbuilder.displayer.client.Displayer;
import org.dashbuilder.displayer.client.DisplayerListener;
import org.dashbuilder.renderer.client.selector.SelectorDisplayer;
import org.dashbuilder.renderer.client.selector.SelectorDisplayer.View;
import org.dashbuilder.renderer.client.selector.SelectorDisplayerView;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class Type_factory__o_d_r_c_s_SelectorDisplayer__quals__j_e_i_Any_j_e_i_Default extends Factory<SelectorDisplayer> { public Type_factory__o_d_r_c_s_SelectorDisplayer__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(SelectorDisplayer.class, "Type_factory__o_d_r_c_s_SelectorDisplayer__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { SelectorDisplayer.class, AbstractGwtDisplayer.class, AbstractDisplayer.class, Object.class, Displayer.class, DisplayerListener.class, IsWidget.class });
  }

  public SelectorDisplayer createInstance(final ContextManager contextManager) {
    final View _view_0 = (SelectorDisplayerView) contextManager.getInstance("Type_factory__o_d_r_c_s_SelectorDisplayerView__quals__j_e_i_Any_j_e_i_Default");
    final SelectorDisplayer instance = new SelectorDisplayer(_view_0);
    registerDependentScopedReference(instance, _view_0);
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }
}