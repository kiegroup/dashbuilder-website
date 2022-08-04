package org.jboss.errai.ioc.client;

import com.google.gwt.user.client.ui.IsWidget;
import javax.enterprise.context.Dependent;
import org.dashbuilder.displayer.client.widgets.DisplayerHtmlEditor;
import org.dashbuilder.displayer.client.widgets.DisplayerHtmlEditor.View;
import org.dashbuilder.displayer.client.widgets.DisplayerHtmlEditorView;
import org.dashbuilder.displayer.client.widgets.sourcecode.SourceCodeEditor;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class Type_factory__o_d_d_c_w_DisplayerHtmlEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<DisplayerHtmlEditor> { public Type_factory__o_d_d_c_w_DisplayerHtmlEditor__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(DisplayerHtmlEditor.class, "Type_factory__o_d_d_c_w_DisplayerHtmlEditor__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { DisplayerHtmlEditor.class, Object.class, IsWidget.class });
  }

  public DisplayerHtmlEditor createInstance(final ContextManager contextManager) {
    final SourceCodeEditor _sourceCodeEditor_1 = (SourceCodeEditor) contextManager.getInstance("Type_factory__o_d_d_c_w_s_SourceCodeEditor__quals__j_e_i_Any_j_e_i_Default");
    final View _view_0 = (DisplayerHtmlEditorView) contextManager.getInstance("Type_factory__o_d_d_c_w_DisplayerHtmlEditorView__quals__j_e_i_Any_j_e_i_Default");
    final DisplayerHtmlEditor instance = new DisplayerHtmlEditor(_view_0, _sourceCodeEditor_1);
    registerDependentScopedReference(instance, _sourceCodeEditor_1);
    registerDependentScopedReference(instance, _view_0);
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }
}