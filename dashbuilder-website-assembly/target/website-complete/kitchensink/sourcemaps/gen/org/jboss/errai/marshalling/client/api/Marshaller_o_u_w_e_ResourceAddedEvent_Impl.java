package org.jboss.errai.marshalling.client.api;

import java.util.Set;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;
import org.jboss.errai.marshalling.client.marshallers.ObjectMarshaller;
import org.uberfire.backend.vfs.Path;
import org.uberfire.rpc.SessionInfo;
import org.uberfire.workbench.events.ResourceAdded;
import org.uberfire.workbench.events.ResourceAddedEvent;

public class Marshaller_o_u_w_e_ResourceAddedEvent_Impl implements GeneratedMarshaller<ResourceAddedEvent> {
  private ResourceAddedEvent[] EMPTY_ARRAY = new ResourceAddedEvent[0];
  private Marshaller java_lang_Object = Marshalling.getMarshaller(Object.class);
  private Marshaller<SessionInfo> org_uberfire_rpc_SessionInfo = Marshalling.getMarshaller(SessionInfo.class);
  private Marshaller<String> java_lang_String = Marshalling.getMarshaller(String.class);
  public ResourceAddedEvent[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  native static String ResourceAdded_String_message(ResourceAdded instance) /*-{
    return instance.@org.uberfire.workbench.events.ResourceAdded::message;
  }-*/;

  native static void ResourceAdded_String_message(ResourceAdded instance, String value) /*-{
    instance.@org.uberfire.workbench.events.ResourceAdded::message = value;
  }-*/;

  public ResourceAddedEvent demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(ResourceAddedEvent.class, objId);
    }
    final Path c0 = (Path) ((ObjectMarshaller) java_lang_Object).demarshall(Path.class, obj.get("path"), a1);
    final SessionInfo c2 = org_uberfire_rpc_SessionInfo.demarshall(obj.get("sessionInfo"), a1);
    final String c1 = java_lang_String.demarshall(obj.get("message"), a1);
    ResourceAddedEvent entity = new ResourceAddedEvent(c0, c1, c2);
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
        case "message": ResourceAdded_String_message(entity, java_lang_String.demarshall(objVal, a1));
        break;
      }
    }
    return entity;
  }

  public String marshall(ResourceAddedEvent a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.uberfire.workbench.events.ResourceAddedEvent") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((((((((((("" + ",\"") + "path") + "\":") + java_lang_Object.marshall(a0.getPath(), a1)) + ",\"") + "sessionInfo") + "\":") + org_uberfire_rpc_SessionInfo.marshall(a0.getSessionInfo(), a1)) + ",\"") + "message") + "\":") + java_lang_String.marshall(a0.getMessage(), a1)) + "}");
  }

  private void lazyInit() {

  }
}