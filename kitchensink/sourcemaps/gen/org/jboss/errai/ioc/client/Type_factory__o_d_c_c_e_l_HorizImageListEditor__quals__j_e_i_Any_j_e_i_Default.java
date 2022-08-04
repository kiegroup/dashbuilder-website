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
import org.dashbuilder.common.client.editor.list.HorizImageListEditor;
import org.dashbuilder.common.client.editor.list.HorizImageListEditorView;
import org.dashbuilder.common.client.editor.list.ImageListEditor;
import org.dashbuilder.common.client.event.ValueChangeEvent;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class Type_factory__o_d_c_c_e_l_HorizImageListEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<HorizImageListEditor> { public Type_factory__o_d_c_c_e_l_HorizImageListEditor__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(HorizImageListEditor.class, "Type_factory__o_d_c_c_e_l_HorizImageListEditor__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { HorizImageListEditor.class, ImageListEditor.class, Object.class, IsWidget.class, LeafAttributeEditor.class, HasEditorErrors.class, Editor.class, LeafValueEditor.class, Editor.class, TakesValue.class });
  }

  public HorizImageListEditor createInstance(final ContextManager contextManager) {
    final HorizImageListEditorView _horizImageListEditorView_0 = (HorizImageListEditorView) contextManager.getInstance("Type_factory__o_d_c_c_e_l_HorizImageListEditorView__quals__j_e_i_Any_j_e_i_Default");
    final Event<ValueChangeEvent> _valueChangeEvent_1 = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { ValueChangeEvent.class }, new Annotation[] { });
    final HorizImageListEditor instance = new HorizImageListEditor(_horizImageListEditorView_0, _valueChangeEvent_1);
    registerDependentScopedReference(instance, _horizImageListEditorView_0);
    registerDependentScopedReference(instance, _valueChangeEvent_1);
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void invokePostConstructs(final HorizImageListEditor instance) {
    instance.init();
  }
}