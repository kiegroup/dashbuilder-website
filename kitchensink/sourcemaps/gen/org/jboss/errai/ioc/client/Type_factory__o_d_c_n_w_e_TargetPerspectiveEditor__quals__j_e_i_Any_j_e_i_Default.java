package org.jboss.errai.ioc.client;

import javax.enterprise.context.Dependent;
import org.dashbuilder.client.navigation.plugin.PerspectivePluginManager;
import org.dashbuilder.client.navigation.widget.editor.TargetPerspectiveEditor;
import org.dashbuilder.client.navigation.widget.editor.TargetPerspectiveEditor.View;
import org.dashbuilder.client.navigation.widget.editor.TargetPerspectiveEditorView;
import org.dashbuilder.client.plugins.RuntimePerspectivePluginManager;
import org.jboss.errai.common.client.api.IsElement;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.uberfire.ext.widgets.common.client.dropdown.PerspectiveDropDown;
import org.uberfire.ext.widgets.common.client.dropdown.PerspectiveNameProvider;

public class Type_factory__o_d_c_n_w_e_TargetPerspectiveEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<TargetPerspectiveEditor> { public Type_factory__o_d_c_n_w_e_TargetPerspectiveEditor__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(TargetPerspectiveEditor.class, "Type_factory__o_d_c_n_w_e_TargetPerspectiveEditor__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { TargetPerspectiveEditor.class, Object.class, IsElement.class, PerspectiveNameProvider.class });
  }

  public TargetPerspectiveEditor createInstance(final ContextManager contextManager) {
    final PerspectiveDropDown _perspectiveDropDown_1 = (PerspectiveDropDown) contextManager.getInstance("Type_factory__o_u_e_w_c_c_d_PerspectiveDropDown__quals__j_e_i_Any_j_e_i_Default");
    final View _view_0 = (TargetPerspectiveEditorView) contextManager.getInstance("Type_factory__o_d_c_n_w_e_TargetPerspectiveEditorView__quals__j_e_i_Any_j_e_i_Default");
    final PerspectivePluginManager _perspectivePluginManager_2 = (RuntimePerspectivePluginManager) contextManager.getInstance("Type_factory__o_d_c_p_RuntimePerspectivePluginManager__quals__j_e_i_Any_j_e_i_Default");
    final TargetPerspectiveEditor instance = new TargetPerspectiveEditor(_view_0, _perspectiveDropDown_1, _perspectivePluginManager_2);
    registerDependentScopedReference(instance, _perspectiveDropDown_1);
    registerDependentScopedReference(instance, _view_0);
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }
}