package org.jboss.errai.ioc.client;

import org.dashbuilder.client.editor.DisplayerEditorEntryPoint;
import org.jboss.errai.ioc.client.api.EntryPoint;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class Type_factory__o_d_c_e_DisplayerEditorEntryPoint__quals__j_e_i_Any_j_e_i_Default extends Factory<DisplayerEditorEntryPoint> { public Type_factory__o_d_c_e_DisplayerEditorEntryPoint__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(DisplayerEditorEntryPoint.class, "Type_factory__o_d_c_e_DisplayerEditorEntryPoint__quals__j_e_i_Any_j_e_i_Default", EntryPoint.class, true, null, true));
    handle.setAssignableTypes(new Class[] { DisplayerEditorEntryPoint.class, Object.class });
  }

  public DisplayerEditorEntryPoint createInstance(final ContextManager contextManager) {
    final DisplayerEditorEntryPoint instance = new DisplayerEditorEntryPoint();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void invokePostConstructs(final DisplayerEditorEntryPoint instance) {
    instance.init();
  }
}