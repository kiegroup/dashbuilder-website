package org.jboss.errai.marshalling.client.api;

import java.util.HashMap;
import java.util.Set;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;
import org.uberfire.backend.vfs.PathFactory.PathImpl;

public class Marshaller_o_u_b_v_PathFactory_erraiD_PathImpl_Impl implements GeneratedMarshaller<PathImpl> {
  private PathImpl[] EMPTY_ARRAY = new PathImpl[0];
  private Marshaller<String> java_lang_String = Marshalling.getMarshaller(String.class);
  private Marshaller<HashMap> java_util_HashMap = null;
  private Marshaller<Boolean> java_lang_Boolean = Marshalling.getMarshaller(Boolean.class);
  public PathImpl[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  native static String PathImpl_String_uri(PathImpl instance) /*-{
    return instance.@org.uberfire.backend.vfs.PathFactory.PathImpl::uri;
  }-*/;

  native static void PathImpl_String_uri(PathImpl instance, String value) /*-{
    instance.@org.uberfire.backend.vfs.PathFactory.PathImpl::uri = value;
  }-*/;

  native static String PathImpl_String_fileName(PathImpl instance) /*-{
    return instance.@org.uberfire.backend.vfs.PathFactory.PathImpl::fileName;
  }-*/;

  native static void PathImpl_String_fileName(PathImpl instance, String value) /*-{
    instance.@org.uberfire.backend.vfs.PathFactory.PathImpl::fileName = value;
  }-*/;

  native static HashMap PathImpl_HashMap_attributes(PathImpl instance) /*-{
    return instance.@org.uberfire.backend.vfs.PathFactory.PathImpl::attributes;
  }-*/;

  native static void PathImpl_HashMap_attributes(PathImpl instance, HashMap value) /*-{
    instance.@org.uberfire.backend.vfs.PathFactory.PathImpl::attributes = value;
  }-*/;

  native static boolean PathImpl_boolean_hasVersionSupport(PathImpl instance) /*-{
    return instance.@org.uberfire.backend.vfs.PathFactory.PathImpl::hasVersionSupport;
  }-*/;

  native static void PathImpl_boolean_hasVersionSupport(PathImpl instance, boolean value) /*-{
    instance.@org.uberfire.backend.vfs.PathFactory.PathImpl::hasVersionSupport = value;
  }-*/;

  public PathImpl demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(PathImpl.class, objId);
    }
    PathImpl entity = new PathImpl();
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
        case "uri": PathImpl_String_uri(entity, java_lang_String.demarshall(objVal, a1));
        break;
        case "fileName": PathImpl_String_fileName(entity, java_lang_String.demarshall(objVal, a1));
        break;
        case "attributes": a1.setAssumedMapKeyType("java.lang.String");
        a1.setAssumedMapValueType("java.lang.Object");
        PathImpl_HashMap_attributes(entity, java_util_HashMap.demarshall(objVal, a1));
        a1.resetAssumedTypes();
        break;
        case "hasVersionSupport": PathImpl_boolean_hasVersionSupport(entity, java_lang_Boolean.demarshall(objVal, a1));
        break;
      }
    }
    return entity;
  }

  public String marshall(PathImpl a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.uberfire.backend.vfs.PathFactory$PathImpl") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((((((((((((((("" + ",\"") + "uri") + "\":") + java_lang_String.marshall(PathImpl_String_uri(a0), a1)) + ",\"") + "fileName") + "\":") + java_lang_String.marshall(a0.getFileName(), a1)) + ",\"") + "attributes") + "\":") + java_util_HashMap.marshall(PathImpl_HashMap_attributes(a0), a1)) + ",\"") + "hasVersionSupport") + "\":") + java_lang_Boolean.marshall(PathImpl_boolean_hasVersionSupport(a0), a1)) + "}");
  }

  private void lazyInit() {
    if (java_util_HashMap == null) {
      java_util_HashMap = Marshalling.getMarshaller(HashMap.class);
    }
  }
}