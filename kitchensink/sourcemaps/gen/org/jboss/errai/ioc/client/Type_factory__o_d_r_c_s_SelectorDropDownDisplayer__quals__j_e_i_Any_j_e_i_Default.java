package org.jboss.errai.ioc.client;

import com.google.gwt.user.client.ui.IsWidget;
import javax.enterprise.context.Dependent;
import org.dashbuilder.displayer.client.AbstractDisplayer;
import org.dashbuilder.displayer.client.AbstractErraiDisplayer;
import org.dashbuilder.displayer.client.Displayer;
import org.dashbuilder.displayer.client.DisplayerListener;
import org.dashbuilder.renderer.client.selector.SelectorDropDownDisplayer;
import org.dashbuilder.renderer.client.selector.SelectorDropDownDisplayer.View;
import org.dashbuilder.renderer.client.selector.SelectorDropDownDisplayerView;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.SyncBeanManager;

public class Type_factory__o_d_r_c_s_SelectorDropDownDisplayer__quals__j_e_i_Any_j_e_i_Default extends Factory<SelectorDropDownDisplayer> { public Type_factory__o_d_r_c_s_SelectorDropDownDisplayer__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(SelectorDropDownDisplayer.class, "Type_factory__o_d_r_c_s_SelectorDropDownDisplayer__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { SelectorDropDownDisplayer.class, AbstractErraiDisplayer.class, AbstractDisplayer.class, Object.class, Displayer.class, DisplayerListener.class, IsWidget.class });
  }

  public SelectorDropDownDisplayer createInstance(final ContextManager contextManager) {
    final View _view_0 = (SelectorDropDownDisplayerView) contextManager.getInstance("Type_factory__o_d_r_c_s_SelectorDropDownDisplayerView__quals__j_e_i_Any_j_e_i_Default");
    final SyncBeanManager _beanManager_1 = (SyncBeanManager) contextManager.getInstance("Producer_factory__o_j_e_i_c_c_SyncBeanManager__quals__j_e_i_Any_j_e_i_Default");
    final SelectorDropDownDisplayer instance = new SelectorDropDownDisplayer(_view_0, _beanManager_1);
    registerDependentScopedReference(instance, _view_0);
    registerDependentScopedReference(instance, _beanManager_1);
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }
}