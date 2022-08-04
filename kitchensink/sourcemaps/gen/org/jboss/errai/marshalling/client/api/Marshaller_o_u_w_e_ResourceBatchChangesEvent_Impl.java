package org.jboss.errai.marshalling.client.api;

import java.util.Map;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;
import org.uberfire.rpc.SessionInfo;
import org.uberfire.workbench.events.ResourceBatchChangesEvent;

public class Marshaller_o_u_w_e_ResourceBatchChangesEvent_Impl implements GeneratedMarshaller<ResourceBatchChangesEvent> {
  private ResourceBatchChangesEvent[] EMPTY_ARRAY = new ResourceBatchChangesEvent[0];
  private Marshaller<String> java_lang_String = Marshalling.getMarshaller(String.class);
  private Marshaller<SessionInfo> org_uberfire_rpc_SessionInfo = Marshalling.getMarshaller(SessionInfo.class);
  private Marshaller<Map> java_util_Map = Marshalling.getMarshaller(Map.class);
  public ResourceBatchChangesEvent[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public ResourceBatchChangesEvent demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(ResourceBatchChangesEvent.class, objId);
    }
    final String c1 = java_lang_String.demarshall(obj.get("message"), a1);
    final SessionInfo c2 = org_uberfire_rpc_SessionInfo.demarshall(obj.get("sessionInfo"), a1);
    a1.setAssumedMapKeyType("org.uberfire.backend.vfs.Path");
    a1.setAssumedMapValueType("java.util.Collection");
    final Map c0 = java_util_Map.demarshall(obj.get("batch"), a1);
    a1.resetAssumedTypes();
    ResourceBatchChangesEvent entity = new ResourceBatchChangesEvent(c0, c1, c2);
    a1.recordObject(objId, entity);
    return entity;
  }

  public String marshall(ResourceBatchChangesEvent a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.uberfire.workbench.events.ResourceBatchChangesEvent") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((((((((((("" + ",\"") + "message") + "\":") + java_lang_String.marshall(a0.getMessage(), a1)) + ",\"") + "sessionInfo") + "\":") + org_uberfire_rpc_SessionInfo.marshall(a0.getSessionInfo(), a1)) + ",\"") + "batch") + "\":") + java_util_Map.marshall(a0.getBatch(), a1)) + "}");
  }

  private void lazyInit() {

  }
}