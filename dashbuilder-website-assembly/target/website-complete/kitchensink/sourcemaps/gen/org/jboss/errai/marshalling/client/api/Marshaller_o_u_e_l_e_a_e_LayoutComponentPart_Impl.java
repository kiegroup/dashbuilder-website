package org.jboss.errai.marshalling.client.api;

import java.util.Map;
import java.util.Set;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;
import org.uberfire.ext.layout.editor.api.editor.LayoutComponentPart;

public class Marshaller_o_u_e_l_e_a_e_LayoutComponentPart_Impl implements GeneratedMarshaller<LayoutComponentPart> {
  private LayoutComponentPart[] EMPTY_ARRAY = new LayoutComponentPart[0];
  private Marshaller<String> java_lang_String = Marshalling.getMarshaller(String.class);
  private Marshaller<Map> java_util_Map = Marshalling.getMarshaller(Map.class);
  public LayoutComponentPart[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  native static String LayoutComponentPart_String_partId(LayoutComponentPart instance) /*-{
    return instance.@org.uberfire.ext.layout.editor.api.editor.LayoutComponentPart::partId;
  }-*/;

  native static void LayoutComponentPart_String_partId(LayoutComponentPart instance, String value) /*-{
    instance.@org.uberfire.ext.layout.editor.api.editor.LayoutComponentPart::partId = value;
  }-*/;

  native static Map LayoutComponentPart_Map_cssProperties(LayoutComponentPart instance) /*-{
    return instance.@org.uberfire.ext.layout.editor.api.editor.LayoutComponentPart::cssProperties;
  }-*/;

  native static void LayoutComponentPart_Map_cssProperties(LayoutComponentPart instance, Map<String, String> value) /*-{
    instance.@org.uberfire.ext.layout.editor.api.editor.LayoutComponentPart::cssProperties = value;
  }-*/;

  public LayoutComponentPart demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(LayoutComponentPart.class, objId);
    }
    LayoutComponentPart entity = new LayoutComponentPart();
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
        case "partId": LayoutComponentPart_String_partId(entity, java_lang_String.demarshall(objVal, a1));
        break;
        case "cssProperties": a1.setAssumedMapKeyType("java.lang.String");
        a1.setAssumedMapValueType("java.lang.String");
        LayoutComponentPart_Map_cssProperties(entity, java_util_Map.demarshall(objVal, a1));
        a1.resetAssumedTypes();
        break;
      }
    }
    return entity;
  }

  public String marshall(LayoutComponentPart a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.uberfire.ext.layout.editor.api.editor.LayoutComponentPart") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((((((("" + ",\"") + "partId") + "\":") + java_lang_String.marshall(a0.getPartId(), a1)) + ",\"") + "cssProperties") + "\":") + java_util_Map.marshall(a0.getCssProperties(), a1)) + "}");
  }

  private void lazyInit() {

  }
}