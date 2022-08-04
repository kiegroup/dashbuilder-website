package org.jboss.errai.marshalling.client.api;

import java.util.Set;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;
import org.jboss.errai.marshalling.client.marshallers.ObjectMarshaller;
import org.uberfire.backend.vfs.Path;
import org.uberfire.rpc.SessionInfo;
import org.uberfire.workbench.events.ResourceCopied;
import org.uberfire.workbench.events.ResourceCopiedEvent;

public class Marshaller_o_u_w_e_ResourceCopiedEvent_Impl implements GeneratedMarshaller<ResourceCopiedEvent> {
  private ResourceCopiedEvent[] EMPTY_ARRAY = new ResourceCopiedEvent[0];
  private Marshaller java_lang_Object = Marshalling.getMarshaller(Object.class);
  private Marshaller<SessionInfo> org_uberfire_rpc_SessionInfo = Marshalling.getMarshaller(SessionInfo.class);
  private Marshaller<String> java_lang_String = Marshalling.getMarshaller(String.class);
  public ResourceCopiedEvent[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  native static Path ResourceCopiedEvent_Path_sourcePath(ResourceCopiedEvent instance) /*-{
    return instance.@org.uberfire.workbench.events.ResourceCopiedEvent::sourcePath;
  }-*/;

  native static void ResourceCopiedEvent_Path_sourcePath(ResourceCopiedEvent instance, Path value) /*-{
    instance.@org.uberfire.workbench.events.ResourceCopiedEvent::sourcePath = value;
  }-*/;

  native static Path ResourceCopied_Path_destinationPath(ResourceCopied instance) /*-{
    return instance.@org.uberfire.workbench.events.ResourceCopied::destinationPath;
  }-*/;

  native static void ResourceCopied_Path_destinationPath(ResourceCopied instance, Path value) /*-{
    instance.@org.uberfire.workbench.events.ResourceCopied::destinationPath = value;
  }-*/;

  native static String ResourceCopied_String_message(ResourceCopied instance) /*-{
    return instance.@org.uberfire.workbench.events.ResourceCopied::message;
  }-*/;

  native static void ResourceCopied_String_message(ResourceCopied instance, String value) /*-{
    instance.@org.uberfire.workbench.events.ResourceCopied::message = value;
  }-*/;

  public ResourceCopiedEvent demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(ResourceCopiedEvent.class, objId);
    }
    final Path c0 = (Path) ((ObjectMarshaller) java_lang_Object).demarshall(Path.class, obj.get("sourcePath"), a1);
    final SessionInfo c3 = org_uberfire_rpc_SessionInfo.demarshall(obj.get("sessionInfo"), a1);
    final Path c1 = (Path) ((ObjectMarshaller) java_lang_Object).demarshall(Path.class, obj.get("destinationPath"), a1);
    final String c2 = java_lang_String.demarshall(obj.get("message"), a1);
    ResourceCopiedEvent entity = new ResourceCopiedEvent(c0, c1, c2, c3);
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
        case "sourcePath": ResourceCopiedEvent_Path_sourcePath(entity, (Path) ((ObjectMarshaller) java_lang_Object).demarshall(Path.class, objVal, a1));
        break;
        case "destinationPath": ResourceCopied_Path_destinationPath(entity, (Path) ((ObjectMarshaller) java_lang_Object).demarshall(Path.class, objVal, a1));
        break;
        case "message": ResourceCopied_String_message(entity, java_lang_String.demarshall(objVal, a1));
        break;
      }
    }
    return entity;
  }

  public String marshall(ResourceCopiedEvent a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.uberfire.workbench.events.ResourceCopiedEvent") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((((((((((((((("" + ",\"") + "sourcePath") + "\":") + java_lang_Object.marshall(ResourceCopiedEvent_Path_sourcePath(a0), a1)) + ",\"") + "sessionInfo") + "\":") + org_uberfire_rpc_SessionInfo.marshall(a0.getSessionInfo(), a1)) + ",\"") + "destinationPath") + "\":") + java_lang_Object.marshall(a0.getDestinationPath(), a1)) + ",\"") + "message") + "\":") + java_lang_String.marshall(a0.getMessage(), a1)) + "}");
  }

  private void lazyInit() {

  }
}