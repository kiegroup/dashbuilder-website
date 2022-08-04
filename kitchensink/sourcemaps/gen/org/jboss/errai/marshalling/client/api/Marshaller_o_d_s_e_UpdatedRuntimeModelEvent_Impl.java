package org.jboss.errai.marshalling.client.api;

import java.util.Set;
import org.dashbuilder.shared.event.UpdatedRuntimeModelEvent;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_o_d_s_e_UpdatedRuntimeModelEvent_Impl implements GeneratedMarshaller<UpdatedRuntimeModelEvent> {
  private UpdatedRuntimeModelEvent[] EMPTY_ARRAY = new UpdatedRuntimeModelEvent[0];
  private Marshaller<String> java_lang_String = Marshalling.getMarshaller(String.class);
  public UpdatedRuntimeModelEvent[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  native static String UpdatedRuntimeModelEvent_String_runtimeModelId(UpdatedRuntimeModelEvent instance) /*-{
    return instance.@org.dashbuilder.shared.event.UpdatedRuntimeModelEvent::runtimeModelId;
  }-*/;

  native static void UpdatedRuntimeModelEvent_String_runtimeModelId(UpdatedRuntimeModelEvent instance, String value) /*-{
    instance.@org.dashbuilder.shared.event.UpdatedRuntimeModelEvent::runtimeModelId = value;
  }-*/;

  public UpdatedRuntimeModelEvent demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(UpdatedRuntimeModelEvent.class, objId);
    }
    final String c0 = java_lang_String.demarshall(obj.get("id"), a1);
    UpdatedRuntimeModelEvent entity = new UpdatedRuntimeModelEvent(c0);
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
        case "runtimeModelId": UpdatedRuntimeModelEvent_String_runtimeModelId(entity, java_lang_String.demarshall(objVal, a1));
        break;
      }
    }
    return entity;
  }

  public String marshall(UpdatedRuntimeModelEvent a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.dashbuilder.shared.event.UpdatedRuntimeModelEvent") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((("" + ",\"") + "runtimeModelId") + "\":") + java_lang_String.marshall(a0.getRuntimeModelId(), a1)) + "}");
  }

  private void lazyInit() {

  }
}