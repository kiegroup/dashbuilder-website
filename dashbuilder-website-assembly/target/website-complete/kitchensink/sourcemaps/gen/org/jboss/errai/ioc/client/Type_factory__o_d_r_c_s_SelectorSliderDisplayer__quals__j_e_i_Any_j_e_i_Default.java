package org.jboss.errai.ioc.client;

import com.google.gwt.user.client.ui.IsWidget;
import javax.enterprise.context.Dependent;
import org.dashbuilder.displayer.client.AbstractDisplayer;
import org.dashbuilder.displayer.client.AbstractGwtDisplayer;
import org.dashbuilder.displayer.client.Displayer;
import org.dashbuilder.displayer.client.DisplayerListener;
import org.dashbuilder.displayer.client.widgets.filter.DateParameterEditor;
import org.dashbuilder.displayer.client.widgets.filter.NumberParameterEditor;
import org.dashbuilder.renderer.client.selector.SelectorSliderDisplayer;
import org.dashbuilder.renderer.client.selector.SelectorSliderDisplayer.View;
import org.dashbuilder.renderer.client.selector.SelectorSliderDisplayerView;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class Type_factory__o_d_r_c_s_SelectorSliderDisplayer__quals__j_e_i_Any_j_e_i_Default extends Factory<SelectorSliderDisplayer> { public Type_factory__o_d_r_c_s_SelectorSliderDisplayer__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(SelectorSliderDisplayer.class, "Type_factory__o_d_r_c_s_SelectorSliderDisplayer__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { SelectorSliderDisplayer.class, AbstractGwtDisplayer.class, AbstractDisplayer.class, Object.class, Displayer.class, DisplayerListener.class, IsWidget.class });
  }

  public SelectorSliderDisplayer createInstance(final ContextManager contextManager) {
    final DateParameterEditor _minDateEditor_1 = (DateParameterEditor) contextManager.getInstance("Type_factory__o_d_d_c_w_f_DateParameterEditor__quals__j_e_i_Any_j_e_i_Default");
    final View _view_0 = (SelectorSliderDisplayerView) contextManager.getInstance("Type_factory__o_d_r_c_s_SelectorSliderDisplayerView__quals__j_e_i_Any_j_e_i_Default");
    final NumberParameterEditor _minNumberEditor_3 = (NumberParameterEditor) contextManager.getInstance("Type_factory__o_d_d_c_w_f_NumberParameterEditor__quals__j_e_i_Any_j_e_i_Default");
    final DateParameterEditor _maxDateEditor_2 = (DateParameterEditor) contextManager.getInstance("Type_factory__o_d_d_c_w_f_DateParameterEditor__quals__j_e_i_Any_j_e_i_Default");
    final NumberParameterEditor _maxNumberEditor_4 = (NumberParameterEditor) contextManager.getInstance("Type_factory__o_d_d_c_w_f_NumberParameterEditor__quals__j_e_i_Any_j_e_i_Default");
    final SelectorSliderDisplayer instance = new SelectorSliderDisplayer(_view_0, _minDateEditor_1, _maxDateEditor_2, _minNumberEditor_3, _maxNumberEditor_4);
    registerDependentScopedReference(instance, _minDateEditor_1);
    registerDependentScopedReference(instance, _view_0);
    registerDependentScopedReference(instance, _minNumberEditor_3);
    registerDependentScopedReference(instance, _maxDateEditor_2);
    registerDependentScopedReference(instance, _maxNumberEditor_4);
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }
}