package org.jboss.errai.ioc.client;

import javax.enterprise.context.Dependent;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.uberfire.ext.editor.commons.client.htmleditor.HtmlEditorPresenter;
import org.uberfire.ext.plugin.client.perspective.editor.layout.editor.popups.EditHTMLPresenter;
import org.uberfire.ext.plugin.client.perspective.editor.layout.editor.popups.EditHTMLPresenter.View;
import org.uberfire.ext.plugin.client.perspective.editor.layout.editor.popups.EditHTMLView;

public class Type_factory__o_u_e_p_c_p_e_l_e_p_EditHTMLPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<EditHTMLPresenter> { public Type_factory__o_u_e_p_c_p_e_l_e_p_EditHTMLPresenter__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(EditHTMLPresenter.class, "Type_factory__o_u_e_p_c_p_e_l_e_p_EditHTMLPresenter__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { EditHTMLPresenter.class, Object.class });
  }

  public EditHTMLPresenter createInstance(final ContextManager contextManager) {
    final View _view_0 = (EditHTMLView) contextManager.getInstance("Type_factory__o_u_e_p_c_p_e_l_e_p_EditHTMLView__quals__j_e_i_Any_j_e_i_Default");
    final HtmlEditorPresenter _htmlEditor_1 = (HtmlEditorPresenter) contextManager.getInstance("Type_factory__o_u_e_e_c_c_h_HtmlEditorPresenter__quals__j_e_i_Any_j_e_i_Default");
    final EditHTMLPresenter instance = new EditHTMLPresenter(_view_0, _htmlEditor_1);
    registerDependentScopedReference(instance, _view_0);
    registerDependentScopedReference(instance, _htmlEditor_1);
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }
}