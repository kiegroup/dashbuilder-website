package org.jboss.errai.marshalling.client.api;

import java.util.Map;
import java.util.Set;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;
import org.uberfire.mvp.impl.DefaultPlaceRequest;
import org.uberfire.mvp.impl.ForcedPlaceRequest;

public class Marshaller_o_u_m_i_ForcedPlaceRequest_Impl implements GeneratedMarshaller<ForcedPlaceRequest> {
  private ForcedPlaceRequest[] EMPTY_ARRAY = new ForcedPlaceRequest[0];
  private Marshaller<Map> java_util_Map = Marshalling.getMarshaller(Map.class);
  private Marshaller<Boolean> java_lang_Boolean = Marshalling.getMarshaller(Boolean.class);
  private Marshaller<String> java_lang_String = Marshalling.getMarshaller(String.class);
  public ForcedPlaceRequest[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  native static Map DefaultPlaceRequest_Map_parameters(DefaultPlaceRequest instance) /*-{
    return instance.@org.uberfire.mvp.impl.DefaultPlaceRequest::parameters;
  }-*/;

  native static void DefaultPlaceRequest_Map_parameters(DefaultPlaceRequest instance, Map<String, String> value) /*-{
    instance.@org.uberfire.mvp.impl.DefaultPlaceRequest::parameters = value;
  }-*/;

  public ForcedPlaceRequest demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(ForcedPlaceRequest.class, objId);
    }
    ForcedPlaceRequest entity = new ForcedPlaceRequest();
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

  public String marshall(ForcedPlaceRequest a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.uberfire.mvp.impl.ForcedPlaceRequest") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((((((((((("" + ",\"") + "parameters") + "\":") + java_util_Map.marshall(a0.getParameters(), a1)) + ",\"") + "updateLocationBar") + "\":") + java_lang_Boolean.marshall(DefaultPlaceRequest_boolean_updateLocationBar(a0), a1)) + ",\"") + "identifier") + "\":") + java_lang_String.marshall(a0.getIdentifier(), a1)) + "}");
  }

  private void lazyInit() {

  }
}