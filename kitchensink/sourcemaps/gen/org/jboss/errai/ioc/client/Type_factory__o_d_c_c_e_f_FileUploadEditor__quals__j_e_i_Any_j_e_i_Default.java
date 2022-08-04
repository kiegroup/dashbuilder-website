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
import org.dashbuilder.common.client.editor.file.FileUploadEditor;
import org.dashbuilder.common.client.editor.file.FileUploadEditor.View;
import org.dashbuilder.common.client.editor.file.FileUploadEditorView;
import org.dashbuilder.common.client.event.ValueChangeEvent;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.uberfire.workbench.events.NotificationEvent;

public class Type_factory__o_d_c_c_e_f_FileUploadEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<FileUploadEditor> { public Type_factory__o_d_c_c_e_f_FileUploadEditor__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(FileUploadEditor.class, "Type_factory__o_d_c_c_e_f_FileUploadEditor__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { FileUploadEditor.class, Object.class, IsWidget.class, LeafAttributeEditor.class, HasEditorErrors.class, Editor.class, LeafValueEditor.class, TakesValue.class });
  }

  public FileUploadEditor createInstance(final ContextManager contextManager) {
    final Event<NotificationEvent> _workbenchNotification_1 = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { NotificationEvent.class }, new Annotation[] { });
    final Event<ValueChangeEvent<String>> _valueChangeEvent_0 = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { ValueChangeEvent.class }, new Annotation[] { });
    final View _view_2 = (FileUploadEditorView) contextManager.getInstance("Type_factory__o_d_c_c_e_f_FileUploadEditorView__quals__j_e_i_Any_j_e_i_Default");
    final FileUploadEditor instance = new FileUploadEditor(_valueChangeEvent_0, _workbenchNotification_1, _view_2);
    registerDependentScopedReference(instance, _workbenchNotification_1);
    registerDependentScopedReference(instance, _valueChangeEvent_0);
    registerDependentScopedReference(instance, _view_2);
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void invokePostConstructs(final FileUploadEditor instance) {
    instance.init();
  }
}