package org.jboss.errai.marshalling.client.api;

import java.util.Set;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;
import org.uberfire.workbench.events.PluginEvent;
import org.uberfire.workbench.events.PluginUpdatedEvent;

public class Marshaller_o_u_w_e_PluginUpdatedEvent_Impl implements GeneratedMarshaller<PluginUpdatedEvent> {
  private PluginUpdatedEvent[] EMPTY_ARRAY = new PluginUpdatedEvent[0];
  private Marshaller<String> java_lang_String = Marshalling.getMarshaller(String.class);
  public PluginUpdatedEvent[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  native static String PluginEvent_String_name(PluginEvent instance) /*-{
    return instance.@org.uberfire.workbench.events.PluginEvent::name;
  }-*/;

  native static void PluginEvent_String_name(PluginEvent instance, String value) /*-{
    instance.@org.uberfire.workbench.events.PluginEvent::name = value;
  }-*/;

  public PluginUpdatedEvent demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(PluginUpdatedEvent.class, objId);
    }
    final String c0 = java_lang_String.demarshall(obj.get("name"), a1);
    PluginUpdatedEvent entity = new PluginUpdatedEvent(c0);
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
        case "name": PluginEvent_String_name(entity, java_lang_String.demarshall(objVal, a1));
        break;
      }
    }
    return entity;
  }

  public String marshall(PluginUpdatedEvent a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.uberfire.workbench.events.PluginUpdatedEvent") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((("" + ",\"") + "name") + "\":") + java_lang_String.marshall(a0.getName(), a1)) + "}");
  }

  private void lazyInit() {

  }
}