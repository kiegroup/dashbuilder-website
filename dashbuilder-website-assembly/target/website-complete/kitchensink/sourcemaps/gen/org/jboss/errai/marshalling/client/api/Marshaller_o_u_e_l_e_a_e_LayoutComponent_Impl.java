package org.jboss.errai.marshalling.client.api;

import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;
import org.jboss.errai.marshalling.client.marshallers.ObjectMarshaller;
import org.uberfire.ext.layout.editor.api.editor.LayoutComponent;
import org.uberfire.ext.layout.editor.api.editor.LayoutComponentPart;

public class Marshaller_o_u_e_l_e_a_e_LayoutComponent_Impl implements GeneratedMarshaller<LayoutComponent> {
  private LayoutComponent[] EMPTY_ARRAY = new LayoutComponent[0];
  private Marshaller<String> java_lang_String = Marshalling.getMarshaller(String.class);
  private Marshaller<Map> java_util_Map = Marshalling.getMarshaller(Map.class);
  private Marshaller<List> java_util_List = Marshalling.getMarshaller(List.class);
  private Marshaller java_lang_Object = Marshalling.getMarshaller(Object.class);
  public LayoutComponent[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  native static String LayoutComponent_String_dragTypeName(LayoutComponent instance) /*-{
    return instance.@org.uberfire.ext.layout.editor.api.editor.LayoutComponent::dragTypeName;
  }-*/;

  native static void LayoutComponent_String_dragTypeName(LayoutComponent instance, String value) /*-{
    instance.@org.uberfire.ext.layout.editor.api.editor.LayoutComponent::dragTypeName = value;
  }-*/;

  native static Map LayoutComponent_Map_properties(LayoutComponent instance) /*-{
    return instance.@org.uberfire.ext.layout.editor.api.editor.LayoutComponent::properties;
  }-*/;

  native static void LayoutComponent_Map_properties(LayoutComponent instance, Map<String, String> value) /*-{
    instance.@org.uberfire.ext.layout.editor.api.editor.LayoutComponent::properties = value;
  }-*/;

  native static List LayoutComponent_List_parts(LayoutComponent instance) /*-{
    return instance.@org.uberfire.ext.layout.editor.api.editor.LayoutComponent::parts;
  }-*/;

  native static void LayoutComponent_List_parts(LayoutComponent instance, List<LayoutComponentPart> value) /*-{
    instance.@org.uberfire.ext.layout.editor.api.editor.LayoutComponent::parts = value;
  }-*/;

  public LayoutComponent demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(LayoutComponent.class, objId);
    }
    LayoutComponent entity = new LayoutComponent();
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
        case "dragTypeName": LayoutComponent_String_dragTypeName(entity, java_lang_String.demarshall(objVal, a1));
        break;
        case "properties": a1.setAssumedMapKeyType("java.lang.String");
        a1.setAssumedMapValueType("java.lang.String");
        LayoutComponent_Map_properties(entity, java_util_Map.demarshall(objVal, a1));
        a1.resetAssumedTypes();
        break;
        case "parts": a1.setAssumedElementType("org.uberfire.ext.layout.editor.api.editor.LayoutComponentPart");
        LayoutComponent_List_parts(entity, java_util_List.demarshall(objVal, a1));
        break;
        case "settings": entity.setSettings(((ObjectMarshaller) java_lang_Object).demarshall(Object.class, objVal, a1));
        break;
      }
    }
    return entity;
  }

  public String marshall(LayoutComponent a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.uberfire.ext.layout.editor.api.editor.LayoutComponent") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((((((((((((((("" + ",\"") + "dragTypeName") + "\":") + java_lang_String.marshall(a0.getDragTypeName(), a1)) + ",\"") + "properties") + "\":") + java_util_Map.marshall(a0.getProperties(), a1)) + ",\"") + "parts") + "\":") + java_util_List.marshall(a0.getParts(), a1)) + ",\"") + "settings") + "\":") + java_lang_Object.marshall(a0.getSettings(), a1)) + "}");
  }

  private void lazyInit() {

  }
}