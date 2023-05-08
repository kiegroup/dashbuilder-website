package org.jboss.errai.ioc.client;

import javax.enterprise.context.Dependent;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.uberfire.ext.layout.editor.client.api.LayoutDragComponent;
import org.uberfire.ext.plugin.client.perspective.editor.layout.editor.HTMLLayoutDragComponent;

public class Type_factory__o_u_e_p_c_p_e_l_e_HTMLLayoutDragComponent__quals__j_e_i_Any_j_e_i_Default extends Factory<HTMLLayoutDragComponent> { public Type_factory__o_u_e_p_c_p_e_l_e_HTMLLayoutDragComponent__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(HTMLLayoutDragComponent.class, "Type_factory__o_u_e_p_c_p_e_l_e_HTMLLayoutDragComponent__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { HTMLLayoutDragComponent.class, Object.class, LayoutDragComponent.class });
  }

  public HTMLLayoutDragComponent createInstance(final ContextManager contextManager) {
    final HTMLLayoutDragComponent instance = new HTMLLayoutDragComponent();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }
}