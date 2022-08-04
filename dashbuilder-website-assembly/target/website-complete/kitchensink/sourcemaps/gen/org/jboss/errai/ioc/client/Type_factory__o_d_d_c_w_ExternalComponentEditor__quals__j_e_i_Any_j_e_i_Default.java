package org.jboss.errai.ioc.client;

import com.google.gwt.user.client.ui.IsWidget;
import javax.enterprise.context.Dependent;
import org.dashbuilder.displayer.client.widgets.ExternalComponentEditor;
import org.dashbuilder.displayer.client.widgets.ExternalComponentEditor.View;
import org.dashbuilder.displayer.client.widgets.ExternalComponentEditorView;
import org.dashbuilder.displayer.client.widgets.ExternalComponentPresenter;
import org.dashbuilder.displayer.client.widgets.ExternalComponentPropertiesEditor;
import org.dashbuilder.displayer.external.ExternalComponentMessageHelper;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class Type_factory__o_d_d_c_w_ExternalComponentEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<ExternalComponentEditor> { public Type_factory__o_d_d_c_w_ExternalComponentEditor__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(ExternalComponentEditor.class, "Type_factory__o_d_d_c_w_ExternalComponentEditor__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { ExternalComponentEditor.class, Object.class, IsWidget.class });
  }

  public ExternalComponentEditor createInstance(final ContextManager contextManager) {
    final ExternalComponentEditor instance = new ExternalComponentEditor();
    setIncompleteInstance(instance);
    final ExternalComponentPropertiesEditor ExternalComponentEditor_propertiesEditor = (ExternalComponentPropertiesEditor) contextManager.getInstance("Type_factory__o_d_d_c_w_ExternalComponentPropertiesEditor__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ExternalComponentEditor_propertiesEditor);
    ExternalComponentEditor_ExternalComponentPropertiesEditor_propertiesEditor(instance, ExternalComponentEditor_propertiesEditor);
    final ExternalComponentPresenter ExternalComponentEditor_externalComponentPresenter = (ExternalComponentPresenter) contextManager.getInstance("Type_factory__o_d_d_c_w_ExternalComponentPresenter__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ExternalComponentEditor_externalComponentPresenter);
    ExternalComponentEditor_ExternalComponentPresenter_externalComponentPresenter(instance, ExternalComponentEditor_externalComponentPresenter);
    final ExternalComponentEditorView ExternalComponentEditor_view = (ExternalComponentEditorView) contextManager.getInstance("Type_factory__o_d_d_c_w_ExternalComponentEditorView__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ExternalComponentEditor_view);
    ExternalComponentEditor_View_view(instance, ExternalComponentEditor_view);
    final ExternalComponentMessageHelper ExternalComponentEditor_messageHelper = (ExternalComponentMessageHelper) contextManager.getInstance("Producer_factory__o_d_d_e_ExternalComponentMessageHelper__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ExternalComponentEditor_messageHelper);
    ExternalComponentEditor_ExternalComponentMessageHelper_messageHelper(instance, ExternalComponentEditor_messageHelper);
    setIncompleteInstance(null);
    return instance;
  }

  public void invokePostConstructs(final ExternalComponentEditor instance) {
    instance.init();
  }

  native static ExternalComponentMessageHelper ExternalComponentEditor_ExternalComponentMessageHelper_messageHelper(ExternalComponentEditor instance) /*-{
    return instance.@org.dashbuilder.displayer.client.widgets.ExternalComponentEditor::messageHelper;
  }-*/;

  native static void ExternalComponentEditor_ExternalComponentMessageHelper_messageHelper(ExternalComponentEditor instance, ExternalComponentMessageHelper value) /*-{
    instance.@org.dashbuilder.displayer.client.widgets.ExternalComponentEditor::messageHelper = value;
  }-*/;

  native static View ExternalComponentEditor_View_view(ExternalComponentEditor instance) /*-{
    return instance.@org.dashbuilder.displayer.client.widgets.ExternalComponentEditor::view;
  }-*/;

  native static void ExternalComponentEditor_View_view(ExternalComponentEditor instance, View value) /*-{
    instance.@org.dashbuilder.displayer.client.widgets.ExternalComponentEditor::view = value;
  }-*/;

  native static ExternalComponentPresenter ExternalComponentEditor_ExternalComponentPresenter_externalComponentPresenter(ExternalComponentEditor instance) /*-{
    return instance.@org.dashbuilder.displayer.client.widgets.ExternalComponentEditor::externalComponentPresenter;
  }-*/;

  native static void ExternalComponentEditor_ExternalComponentPresenter_externalComponentPresenter(ExternalComponentEditor instance, ExternalComponentPresenter value) /*-{
    instance.@org.dashbuilder.displayer.client.widgets.ExternalComponentEditor::externalComponentPresenter = value;
  }-*/;

  native static ExternalComponentPropertiesEditor ExternalComponentEditor_ExternalComponentPropertiesEditor_propertiesEditor(ExternalComponentEditor instance) /*-{
    return instance.@org.dashbuilder.displayer.client.widgets.ExternalComponentEditor::propertiesEditor;
  }-*/;

  native static void ExternalComponentEditor_ExternalComponentPropertiesEditor_propertiesEditor(ExternalComponentEditor instance, ExternalComponentPropertiesEditor value) /*-{
    instance.@org.dashbuilder.displayer.client.widgets.ExternalComponentEditor::propertiesEditor = value;
  }-*/;
}