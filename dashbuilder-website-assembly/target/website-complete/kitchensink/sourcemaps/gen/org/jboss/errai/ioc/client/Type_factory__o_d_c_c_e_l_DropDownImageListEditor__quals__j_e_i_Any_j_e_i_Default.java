package org.jboss.errai.ioc.client;

import com.google.gwt.editor.client.Editor;
import com.google.gwt.editor.client.HasEditorErrors;
import com.google.gwt.editor.client.LeafValueEditor;
import com.google.gwt.user.client.TakesValue;
import com.google.gwt.user.client.ui.IsWidget;
import java.lang.annotation.Annotation;
import javax.enterprise.context.Dependent;
import javax.enterprise.event.Event;
import org.dashbuilder.common.client.editor.HasEditMode;
import org.dashbuilder.common.client.editor.LeafAttributeEditor;
import org.dashbuilder.common.client.editor.list.DropDownImageListEditor;
import org.dashbuilder.common.client.editor.list.DropDownImageListEditorView;
import org.dashbuilder.common.client.editor.list.ImageListEditor;
import org.dashbuilder.common.client.event.ValueChangeEvent;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class Type_factory__o_d_c_c_e_l_DropDownImageListEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<DropDownImageListEditor> { public Type_factory__o_d_c_c_e_l_DropDownImageListEditor__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(DropDownImageListEditor.class, "Type_factory__o_d_c_c_e_l_DropDownImageListEditor__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { DropDownImageListEditor.class, ImageListEditor.class, Object.class, IsWidget.class, LeafAttributeEditor.class, HasEditorErrors.class, Editor.class, LeafValueEditor.class, Editor.class, TakesValue.class, HasEditMode.class });
  }

  public DropDownImageListEditor createInstance(final ContextManager contextManager) {
    final DropDownImageListEditorView _dropDownImageListEditorView_0 = (DropDownImageListEditorView) contextManager.getInstance("Type_factory__o_d_c_c_e_l_DropDownImageListEditorView__quals__j_e_i_Any_j_e_i_Default");
    final Event<ValueChangeEvent> _valueChangeEvent_1 = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { ValueChangeEvent.class }, new Annotation[] { });
    final DropDownImageListEditor instance = new DropDownImageListEditor(_dropDownImageListEditorView_0, _valueChangeEvent_1);
    registerDependentScopedReference(instance, _dropDownImageListEditorView_0);
    registerDependentScopedReference(instance, _valueChangeEvent_1);
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void invokePostConstructs(final DropDownImageListEditor instance) {
    instance.init();
  }
}