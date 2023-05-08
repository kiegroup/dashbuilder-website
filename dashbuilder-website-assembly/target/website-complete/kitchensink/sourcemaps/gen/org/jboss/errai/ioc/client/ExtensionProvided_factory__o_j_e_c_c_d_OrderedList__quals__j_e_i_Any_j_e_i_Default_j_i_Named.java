package org.jboss.errai.ioc.client;

import elemental2.dom.DomGlobal;
import java.lang.annotation.Annotation;
import javax.enterprise.context.Dependent;
import jsinterop.base.Js;
import org.jboss.errai.common.client.dom.Element;
import org.jboss.errai.common.client.dom.EventTarget;
import org.jboss.errai.common.client.dom.GlobalEventHandlers;
import org.jboss.errai.common.client.dom.HTMLElement;
import org.jboss.errai.common.client.dom.Node;
import org.jboss.errai.common.client.dom.OrderedList;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class ExtensionProvided_factory__o_j_e_c_c_d_OrderedList__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<OrderedList> { public ExtensionProvided_factory__o_j_e_c_c_d_OrderedList__quals__j_e_i_Any_j_e_i_Default_j_i_Named() {
    super(new FactoryHandleImpl(OrderedList.class, "ExtensionProvided_factory__o_j_e_c_c_d_OrderedList__quals__j_e_i_Any_j_e_i_Default_j_i_Named", Dependent.class, false, "ol", true));
    handle.setAssignableTypes(new Class[] { OrderedList.class, HTMLElement.class, Element.class, Node.class, EventTarget.class, GlobalEventHandlers.class });
    handle.setQualifiers(new Annotation[] { QualifierUtil.ANY_ANNOTATION, QualifierUtil.DEFAULT_ANNOTATION, QualifierUtil.createNamed("ol") });
  }

  public OrderedList createInstance(final ContextManager contextManager) {
    final elemental2.dom.Element element = DomGlobal.document.createElement("ol");
    final OrderedList retVal = Js.cast(element);
    return retVal;
  }
}