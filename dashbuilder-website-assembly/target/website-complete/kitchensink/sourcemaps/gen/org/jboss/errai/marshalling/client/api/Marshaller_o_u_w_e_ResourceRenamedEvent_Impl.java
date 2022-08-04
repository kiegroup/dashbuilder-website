package org.jboss.errai.marshalling.client.api;

import java.util.Set;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;
import org.jboss.errai.marshalling.client.marshallers.ObjectMarshaller;
import org.uberfire.backend.vfs.Path;
import org.uberfire.rpc.SessionInfo;
import org.uberfire.workbench.events.ResourceRenamed;
import org.uberfire.workbench.events.ResourceRenamedEvent;

public class Marshaller_o_u_w_e_ResourceRenamedEvent_Impl implements GeneratedMarshaller<ResourceRenamedEvent> {
  private ResourceRenamedEvent[] EMPTY_ARRAY = new ResourceRenamedEvent[0];
  private Marshaller java_lang_Object = Marshalling.getMarshaller(Object.class);
  private Marshaller<SessionInfo> org_uberfire_rpc_SessionInfo = Marshalling.getMarshaller(SessionInfo.class);
  private Marshaller<String> java_lang_String = Marshalling.getMarshaller(String.class);
  public ResourceRenamedEvent[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  native static Path ResourceRenamedEvent_Path_sourcePath(ResourceRenamedEvent instance) /*-{
    return instance.@org.uberfire.workbench.events.ResourceRenamedEvent::sourcePath;
  }-*/;

  native static void ResourceRenamedEvent_Path_sourcePath(ResourceRenamedEvent instance, Path value) /*-{
    instance.@org.uberfire.workbench.events.ResourceRenamedEvent::sourcePath = value;
  }-*/;

  native static Path ResourceRenamed_Path_destinationPath(ResourceRenamed instance) /*-{
    return instance.@org.uberfire.workbench.events.ResourceRenamed::destinationPath;
  }-*/;

  native static void ResourceRenamed_Path_destinationPath(ResourceRenamed instance, Path value) /*-{
    instance.@org.uberfire.workbench.events.ResourceRenamed::destinationPath = value;
  }-*/;

  native static String ResourceRenamed_String_message(ResourceRenamed instance) /*-{
    return instance.@org.uberfire.workbench.events.ResourceRenamed::message;
  }-*/;

  native static void ResourceRenamed_String_message(ResourceRenamed instance, String value) /*-{
    instance.@org.uberfire.workbench.events.ResourceRenamed::message = value;
  }-*/;

  public ResourceRenamedEvent demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(ResourceRenamedEvent.class, objId);
    }
    final Path c0 = (Path) ((ObjectMarshaller) java_lang_Object).demarshall(Path.class, obj.get("sourcePath"), a1);
    final SessionInfo c3 = org_uberfire_rpc_SessionInfo.demarshall(obj.get("sessionInfo"), a1);
    final Path c1 = (Path) ((ObjectMarshaller) java_lang_Object).demarshall(Path.class, obj.get("destinationPath"), a1);
    final String c2 = java_lang_String.demarshall(obj.get("message"), a1);
    ResourceRenamedEvent entity = new ResourceRenamedEvent(c0, c1, c2, c3);
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
        case "sourcePath": ResourceRenamedEvent_Path_sourcePath(entity, (Path) ((ObjectMarshaller) java_lang_Object).demarshall(Path.class, objVal, a1));
        break;
        case "destinationPath": ResourceRenamed_Path_destinationPath(entity, (Path) ((ObjectMarshaller) java_lang_Object).demarshall(Path.class, objVal, a1));
        break;
        case "message": ResourceRenamed_String_message(entity, java_lang_String.demarshall(objVal, a1));
        break;
      }
    }
    return entity;
  }

  public String marshall(ResourceRenamedEvent a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.uberfire.workbench.events.ResourceRenamedEvent") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((((((((((((((("" + ",\"") + "sourcePath") + "\":") + java_lang_Object.marshall(ResourceRenamedEvent_Path_sourcePath(a0), a1)) + ",\"") + "sessionInfo") + "\":") + org_uberfire_rpc_SessionInfo.marshall(a0.getSessionInfo(), a1)) + ",\"") + "destinationPath") + "\":") + java_lang_Object.marshall(a0.getDestinationPath(), a1)) + ",\"") + "message") + "\":") + java_lang_String.marshall(a0.getMessage(), a1)) + "}");
  }

  private void lazyInit() {

  }
}