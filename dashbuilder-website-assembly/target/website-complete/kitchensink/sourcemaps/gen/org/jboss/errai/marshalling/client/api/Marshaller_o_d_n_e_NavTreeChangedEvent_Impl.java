package org.jboss.errai.marshalling.client.api;

import java.util.Set;
import org.dashbuilder.navigation.NavTree;
import org.dashbuilder.navigation.event.NavTreeChangedEvent;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;
import org.jboss.errai.marshalling.client.marshallers.ObjectMarshaller;

public class Marshaller_o_d_n_e_NavTreeChangedEvent_Impl implements GeneratedMarshaller<NavTreeChangedEvent> {
  private NavTreeChangedEvent[] EMPTY_ARRAY = new NavTreeChangedEvent[0];
  private Marshaller java_lang_Object = Marshalling.getMarshaller(Object.class);
  public NavTreeChangedEvent[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  native static NavTree NavTreeChangedEvent_NavTree_navTree(NavTreeChangedEvent instance) /*-{
    return instance.@org.dashbuilder.navigation.event.NavTreeChangedEvent::navTree;
  }-*/;

  native static void NavTreeChangedEvent_NavTree_navTree(NavTreeChangedEvent instance, NavTree value) /*-{
    instance.@org.dashbuilder.navigation.event.NavTreeChangedEvent::navTree = value;
  }-*/;

  public NavTreeChangedEvent demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(NavTreeChangedEvent.class, objId);
    }
    NavTreeChangedEvent entity = new NavTreeChangedEvent();
    a1.recordObject(objId, entity);
    final Set<String> keys = obj.keySet();
    for (String key : keys) {
      if (key.equals("^EncodedType") || key.equals("^ObjectID")) {
        continue;
      }
      EJValue objVal = obj.getIfNotNull(key);
      if (objVal == null) {
        continue;
      }
      switch (key) {
        case "navTree": NavTreeChangedEvent_NavTree_navTree(entity, (NavTree) ((ObjectMarshaller) java_lang_Object).demarshall(NavTree.class, objVal, a1));
        break;
      }
    }
    return entity;
  }

  public String marshall(NavTreeChangedEvent a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.dashbuilder.navigation.event.NavTreeChangedEvent") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((("" + ",\"") + "navTree") + "\":") + java_lang_Object.marshall(a0.getNavTree(), a1)) + "}");
  }

  private void lazyInit() {

  }
}