package org.jboss.errai.marshalling.client.api;

import java.util.Map;
import java.util.Set;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;
import org.jboss.errai.marshalling.client.marshallers.ObjectMarshaller;
import org.uberfire.backend.vfs.ObservablePath;
import org.uberfire.ext.editor.commons.readonly.ReadOnlyPathPlaceRequest;
import org.uberfire.mvp.impl.DefaultPlaceRequest;
import org.uberfire.mvp.impl.PathPlaceRequest;

public class Marshaller_o_u_e_e_c_r_ReadOnlyPathPlaceRequest_Impl implements GeneratedMarshaller<ReadOnlyPathPlaceRequest> {
  private ReadOnlyPathPlaceRequest[] EMPTY_ARRAY = new ReadOnlyPathPlaceRequest[0];
  private Marshaller java_lang_Object = Marshalling.getMarshaller(Object.class);
  private Marshaller<Map> java_util_Map = Marshalling.getMarshaller(Map.class);
  private Marshaller<Boolean> java_lang_Boolean = Marshalling.getMarshaller(Boolean.class);
  private Marshaller<String> java_lang_String = Marshalling.getMarshaller(String.class);
  public ReadOnlyPathPlaceRequest[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  native static ObservablePath PathPlaceRequest_ObservablePath_path(PathPlaceRequest instance) /*-{
    return instance.@org.uberfire.mvp.impl.PathPlaceRequest::path;
  }-*/;

  native static void PathPlaceRequest_ObservablePath_path(PathPlaceRequest instance, ObservablePath value) /*-{
    instance.@org.uberfire.mvp.impl.PathPlaceRequest::path = value;
  }-*/;

  native static Map DefaultPlaceRequest_Map_parameters(DefaultPlaceRequest instance) /*-{
    return instance.@org.uberfire.mvp.impl.DefaultPlaceRequest::parameters;
  }-*/;

  native static void DefaultPlaceRequest_Map_parameters(DefaultPlaceRequest instance, Map<String, String> value) /*-{
    instance.@org.uberfire.mvp.impl.DefaultPlaceRequest::parameters = value;
  }-*/;

  public ReadOnlyPathPlaceRequest demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(ReadOnlyPathPlaceRequest.class, objId);
    }
    ReadOnlyPathPlaceRequest entity = new ReadOnlyPathPlaceRequest();
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
        case "path": PathPlaceRequest_ObservablePath_path(entity, (ObservablePath) ((ObjectMarshaller) java_lang_Object).demarshall(ObservablePath.class, objVal, a1));
        break;
        case "parameters": a1.setAssumedMapKeyType("java.lang.String");
        a1.setAssumedMapValueType("java.lang.String");
        DefaultPlaceRequest_Map_parameters(entity, java_util_Map.demarshall(objVal, a1));
        a1.resetAssumedTypes();
        break;
        case "updateLocationBar": entity.setUpdateLocationBar(java_lang_Boolean.demarshall(objVal, a1));
        break;
        case "identifier": entity.setIdentifier(java_lang_String.demarshall(objVal, a1));
        break;
      }
    }
    return entity;
  }

  native static boolean DefaultPlaceRequest_boolean_updateLocationBar(DefaultPlaceRequest instance) /*-{
    return instance.@org.uberfire.mvp.impl.DefaultPlaceRequest::updateLocationBar;
  }-*/;

  native static void DefaultPlaceRequest_boolean_updateLocationBar(DefaultPlaceRequest instance, boolean value) /*-{
    instance.@org.uberfire.mvp.impl.DefaultPlaceRequest::updateLocationBar = value;
  }-*/;

  public String marshall(ReadOnlyPathPlaceRequest a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.uberfire.ext.editor.commons.readonly.ReadOnlyPathPlaceRequest") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((((((((((((((("" + ",\"") + "path") + "\":") + java_lang_Object.marshall(a0.getPath(), a1)) + ",\"") + "parameters") + "\":") + java_util_Map.marshall(a0.getParameters(), a1)) + ",\"") + "updateLocationBar") + "\":") + java_lang_Boolean.marshall(DefaultPlaceRequest_boolean_updateLocationBar(a0), a1)) + ",\"") + "identifier") + "\":") + java_lang_String.marshall(a0.getIdentifier(), a1)) + "}");
  }

  private void lazyInit() {

  }
}