package org.jboss.errai.ioc.client;

import com.google.gwt.editor.client.Editor;
import com.google.gwt.editor.client.HasEditorErrors;
import com.google.gwt.editor.client.LeafValueEditor;
import com.google.gwt.user.client.TakesValue;
import com.google.gwt.user.client.ui.IsWidget;
import java.lang.annotation.Annotation;
import javax.enterprise.context.Dependent;
import javax.enterprise.event.Event;
import org.dashbuilder.common.client.editor.LeafAttributeEditor;
import org.dashbuilder.common.client.editor.list.DropDownEditor;
import org.dashbuilder.common.client.editor.list.DropDownEditor.View;
import org.dashbuilder.common.client.editor.list.DropDownEditorView;
import org.dashbuilder.common.client.event.ValueChangeEvent;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.uberfire.ext.widgets.common.client.dropdown.LiveSearchDropDown;

public class Type_factory__o_d_c_c_e_l_DropDownEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<DropDownEditor> { public Type_factory__o_d_c_c_e_l_DropDownEditor__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(DropDownEditor.class, "Type_factory__o_d_c_c_e_l_DropDownEditor__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { DropDownEditor.class, Object.class, IsWidget.class, LeafAttributeEditor.class, HasEditorErrors.class, Editor.class, LeafValueEditor.class, TakesValue.class });
  }

  public DropDownEditor createInstance(final ContextManager contextManager) {
    final View _view_0 = (DropDownEditorView) contextManager.getInstance("Type_factory__o_d_c_c_e_l_DropDownEditorView__quals__j_e_i_Any_j_e_i_Default");
    final LiveSearchDropDown _dropDown_1 = (LiveSearchDropDown) contextManager.getInstance("Type_factory__o_u_e_w_c_c_d_LiveSearchDropDown__quals__j_e_i_Any_j_e_i_Default");
    final Event<ValueChangeEvent<String>> _valueChangeEvent_2 = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { ValueChangeEvent.class }, new Annotation[] { });
    final DropDownEditor instance = new DropDownEditor(_view_0, _dropDown_1, _valueChangeEvent_2);
    registerDependentScopedReference(instance, _view_0);
    registerDependentScopedReference(instance, _dropDown_1);
    registerDependentScopedReference(instance, _valueChangeEvent_2);
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void invokePostConstructs(final DropDownEditor instance) {
    instance.init();
  }
}