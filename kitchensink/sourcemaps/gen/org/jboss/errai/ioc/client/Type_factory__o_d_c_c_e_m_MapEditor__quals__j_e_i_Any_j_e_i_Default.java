package org.jboss.errai.ioc.client;

import com.google.gwt.editor.client.Editor;
import com.google.gwt.editor.client.HasEditorErrors;
import com.google.gwt.editor.client.LeafValueEditor;
import com.google.gwt.user.client.TakesValue;
import com.google.gwt.user.client.ui.IsWidget;
import java.lang.annotation.Annotation;
import java.util.Map;
import javax.enterprise.context.Dependent;
import javax.enterprise.event.Event;
import org.dashbuilder.common.client.editor.LeafAttributeEditor;
import org.dashbuilder.common.client.editor.map.MapEditor;
import org.dashbuilder.common.client.editor.map.MapEditor.View;
import org.dashbuilder.common.client.editor.map.MapEditorView;
import org.dashbuilder.common.client.event.ValueChangeEvent;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class Type_factory__o_d_c_c_e_m_MapEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<MapEditor> { public Type_factory__o_d_c_c_e_m_MapEditor__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(MapEditor.class, "Type_factory__o_d_c_c_e_m_MapEditor__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { MapEditor.class, Object.class, IsWidget.class, LeafAttributeEditor.class, HasEditorErrors.class, Editor.class, LeafValueEditor.class, TakesValue.class });
  }

  public MapEditor createInstance(final ContextManager contextManager) {
    final View _view_0 = (MapEditorView) contextManager.getInstance("Type_factory__o_d_c_c_e_m_MapEditorView__quals__j_e_i_Any_j_e_i_Default");
    final Event<ValueChangeEvent<Map<String, String>>> _valueChangeEvent_1 = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { ValueChangeEvent.class }, new Annotation[] { });
    final MapEditor instance = new MapEditor(_view_0, _valueChangeEvent_1);
    registerDependentScopedReference(instance, _view_0);
    registerDependentScopedReference(instance, _valueChangeEvent_1);
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void invokePostConstructs(final MapEditor instance) {
    instance.init();
  }
}