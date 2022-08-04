package org.jboss.errai.ioc.client;

import com.google.gwt.user.client.ui.IsWidget;
import javax.enterprise.context.Dependent;
import org.dashbuilder.displayer.client.widgets.sourcecode.DefaultHtmlValidator;
import org.dashbuilder.displayer.client.widgets.sourcecode.DefaultJsValidator;
import org.dashbuilder.displayer.client.widgets.sourcecode.HtmlValidator;
import org.dashbuilder.displayer.client.widgets.sourcecode.JsValidator;
import org.dashbuilder.displayer.client.widgets.sourcecode.SourceCodeEditor;
import org.dashbuilder.displayer.client.widgets.sourcecode.SourceCodeEditor.View;
import org.dashbuilder.displayer.client.widgets.sourcecode.SourceCodeEditorView;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class Type_factory__o_d_d_c_w_s_SourceCodeEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<SourceCodeEditor> { public Type_factory__o_d_d_c_w_s_SourceCodeEditor__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(SourceCodeEditor.class, "Type_factory__o_d_d_c_w_s_SourceCodeEditor__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { SourceCodeEditor.class, Object.class, IsWidget.class });
  }

  public SourceCodeEditor createInstance(final ContextManager contextManager) {
    final JsValidator _jsValidator_2 = (DefaultJsValidator) contextManager.getInstance("Type_factory__o_d_d_c_w_s_DefaultJsValidator__quals__j_e_i_Any_j_e_i_Default");
    final HtmlValidator _htmlValidator_1 = (DefaultHtmlValidator) contextManager.getInstance("Type_factory__o_d_d_c_w_s_DefaultHtmlValidator__quals__j_e_i_Any_j_e_i_Default");
    final View _view_0 = (SourceCodeEditorView) contextManager.getInstance("Type_factory__o_d_d_c_w_s_SourceCodeEditorView__quals__j_e_i_Any_j_e_i_Default");
    final SourceCodeEditor instance = new SourceCodeEditor(_view_0, _htmlValidator_1, _jsValidator_2);
    registerDependentScopedReference(instance, _jsValidator_2);
    registerDependentScopedReference(instance, _htmlValidator_1);
    registerDependentScopedReference(instance, _view_0);
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }
}