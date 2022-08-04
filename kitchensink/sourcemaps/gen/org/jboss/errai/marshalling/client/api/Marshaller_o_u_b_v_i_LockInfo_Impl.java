package org.jboss.errai.marshalling.client.api;

import java.util.Set;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;
import org.jboss.errai.marshalling.client.marshallers.ObjectMarshaller;
import org.uberfire.backend.vfs.Path;
import org.uberfire.backend.vfs.impl.LockInfo;

public class Marshaller_o_u_b_v_i_LockInfo_Impl implements GeneratedMarshaller<LockInfo> {
  private LockInfo[] EMPTY_ARRAY = new LockInfo[0];
  private Marshaller<Boolean> java_lang_Boolean = Marshalling.getMarshaller(Boolean.class);
  private Marshaller<String> java_lang_String = Marshalling.getMarshaller(String.class);
  private Marshaller java_lang_Object = Marshalling.getMarshaller(Object.class);
  public LockInfo[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  native static String LockInfo_String_lockedBy(LockInfo instance) /*-{
    return instance.@org.uberfire.backend.vfs.impl.LockInfo::lockedBy;
  }-*/;

  native static void LockInfo_String_lockedBy(LockInfo instance, String value) /*-{
    instance.@org.uberfire.backend.vfs.impl.LockInfo::lockedBy = value;
  }-*/;

  public LockInfo demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(LockInfo.class, objId);
    }
    final Boolean c0 = java_lang_Boolean.demarshall(obj.get("locked"), a1);
    final String c1 = java_lang_String.demarshall(obj.get("lockedBy"), a1);
    final Path c2 = (Path) ((ObjectMarshaller) java_lang_Object).demarshall(Path.class, obj.get("file"), a1);
    LockInfo entity = new LockInfo(c0, c1, c2);
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
        case "lockedBy": LockInfo_String_lockedBy(entity, java_lang_String.demarshall(objVal, a1));
        break;
      }
    }
    return entity;
  }

  public String marshall(LockInfo a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.uberfire.backend.vfs.impl.LockInfo") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((((((((((("" + ",\"") + "locked") + "\":") + java_lang_Boolean.marshall(a0.isLocked(), a1)) + ",\"") + "lockedBy") + "\":") + java_lang_String.marshall(LockInfo_String_lockedBy(a0), a1)) + ",\"") + "file") + "\":") + java_lang_Object.marshall(a0.getFile(), a1)) + "}");
  }

  private void lazyInit() {

  }
}