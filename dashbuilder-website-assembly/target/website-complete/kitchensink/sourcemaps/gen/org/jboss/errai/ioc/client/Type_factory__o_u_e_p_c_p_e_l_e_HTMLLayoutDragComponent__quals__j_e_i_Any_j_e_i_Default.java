package org.jboss.errai.ioc.client;

import javax.enterprise.context.Dependent;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.uberfire.ext.layout.editor.client.api.HasConfiguration;
import org.uberfire.ext.layout.editor.client.api.HasModalConfiguration;
import org.uberfire.ext.layout.editor.client.api.LayoutDragComponent;
import org.uberfire.ext.layout.editor.client.infra.LayoutEditorCssHelper;
import org.uberfire.ext.plugin.client.perspective.editor.api.PerspectiveEditorCoreComponent;
import org.uberfire.ext.plugin.client.perspective.editor.layout.editor.HTMLLayoutDragComponent;
import org.uberfire.ext.plugin.client.perspective.editor.layout.editor.popups.EditHTMLPresenter;

public class Type_factory__o_u_e_p_c_p_e_l_e_HTMLLayoutDragComponent__quals__j_e_i_Any_j_e_i_Default extends Factory<HTMLLayoutDragComponent> { public Type_factory__o_u_e_p_c_p_e_l_e_HTMLLayoutDragComponent__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(HTMLLayoutDragComponent.class, "Type_factory__o_u_e_p_c_p_e_l_e_HTMLLayoutDragComponent__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { HTMLLayoutDragComponent.class, Object.class, PerspectiveEditorCoreComponent.class, LayoutDragComponent.class, HasModalConfiguration.class, HasConfiguration.class });
  }

  public HTMLLayoutDragComponent createInstance(final ContextManager contextManager) {
    final HTMLLayoutDragComponent instance = new HTMLLayoutDragComponent();
    setIncompleteInstance(instance);
    final EditHTMLPresenter HTMLLayoutDragComponent_htmlEditor = (EditHTMLPresenter) contextManager.getInstance("Type_factory__o_u_e_p_c_p_e_l_e_p_EditHTMLPresenter__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, HTMLLayoutDragComponent_htmlEditor);
    HTMLLayoutDragComponent_EditHTMLPresenter_htmlEditor(instance, HTMLLayoutDragComponent_htmlEditor);
    final LayoutEditorCssHelper HTMLLayoutDragComponent_layoutCssHelper = (LayoutEditorCssHelper) contextManager.getInstance("Type_factory__o_u_e_l_e_c_i_LayoutEditorCssHelper__quals__j_e_i_Any_j_e_i_Default");
    HTMLLayoutDragComponent_LayoutEditorCssHelper_layoutCssHelper(instance, HTMLLayoutDragComponent_layoutCssHelper);
    setIncompleteInstance(null);
    return instance;
  }

  native static EditHTMLPresenter HTMLLayoutDragComponent_EditHTMLPresenter_htmlEditor(HTMLLayoutDragComponent instance) /*-{
    return instance.@org.uberfire.ext.plugin.client.perspective.editor.layout.editor.HTMLLayoutDragComponent::htmlEditor;
  }-*/;

  native static void HTMLLayoutDragComponent_EditHTMLPresenter_htmlEditor(HTMLLayoutDragComponent instance, EditHTMLPresenter value) /*-{
    instance.@org.uberfire.ext.plugin.client.perspective.editor.layout.editor.HTMLLayoutDragComponent::htmlEditor = value;
  }-*/;

  native static LayoutEditorCssHelper HTMLLayoutDragComponent_LayoutEditorCssHelper_layoutCssHelper(HTMLLayoutDragComponent instance) /*-{
    return instance.@org.uberfire.ext.plugin.client.perspective.editor.layout.editor.HTMLLayoutDragComponent::layoutCssHelper;
  }-*/;

  native static void HTMLLayoutDragComponent_LayoutEditorCssHelper_layoutCssHelper(HTMLLayoutDragComponent instance, LayoutEditorCssHelper value) /*-{
    instance.@org.uberfire.ext.plugin.client.perspective.editor.layout.editor.HTMLLayoutDragComponent::layoutCssHelper = value;
  }-*/;
}