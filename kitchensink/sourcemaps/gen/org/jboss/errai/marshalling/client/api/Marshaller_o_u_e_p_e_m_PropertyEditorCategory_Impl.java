package org.jboss.errai.marshalling.client.api;

import java.util.List;
import java.util.Set;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;
import org.uberfire.ext.properties.editor.model.PropertyEditorCategory;
import org.uberfire.ext.properties.editor.model.PropertyEditorFieldInfo;

public class Marshaller_o_u_e_p_e_m_PropertyEditorCategory_Impl implements GeneratedMarshaller<PropertyEditorCategory> {
  private PropertyEditorCategory[] EMPTY_ARRAY = new PropertyEditorCategory[0];
  private Marshaller<String> java_lang_String = Marshalling.getMarshaller(String.class);
  private Marshaller<Integer> java_lang_Integer = Marshalling.getMarshaller(Integer.class);
  private Marshaller<List> java_util_List = Marshalling.getMarshaller(List.class);
  public PropertyEditorCategory[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  native static String PropertyEditorCategory_String_name(PropertyEditorCategory instance) /*-{
    return instance.@org.uberfire.ext.properties.editor.model.PropertyEditorCategory::name;
  }-*/;

  native static void PropertyEditorCategory_String_name(PropertyEditorCategory instance, String value) /*-{
    instance.@org.uberfire.ext.properties.editor.model.PropertyEditorCategory::name = value;
  }-*/;

  native static int PropertyEditorCategory_int_priority(PropertyEditorCategory instance) /*-{
    return instance.@org.uberfire.ext.properties.editor.model.PropertyEditorCategory::priority;
  }-*/;

  native static void PropertyEditorCategory_int_priority(PropertyEditorCategory instance, int value) /*-{
    instance.@org.uberfire.ext.properties.editor.model.PropertyEditorCategory::priority = value;
  }-*/;

  native static List PropertyEditorCategory_List_fields(PropertyEditorCategory instance) /*-{
    return instance.@org.uberfire.ext.properties.editor.model.PropertyEditorCategory::fields;
  }-*/;

  native static void PropertyEditorCategory_List_fields(PropertyEditorCategory instance, List<PropertyEditorFieldInfo> value) /*-{
    instance.@org.uberfire.ext.properties.editor.model.PropertyEditorCategory::fields = value;
  }-*/;

  public PropertyEditorCategory demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(PropertyEditorCategory.class, objId);
    }
    PropertyEditorCategory entity = new PropertyEditorCategory();
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
        case "name": PropertyEditorCategory_String_name(entity, java_lang_String.demarshall(objVal, a1));
        break;
        case "priority": PropertyEditorCategory_int_priority(entity, java_lang_Integer.demarshall(objVal, a1));
        break;
        case "fields": a1.setAssumedElementType("org.uberfire.ext.properties.editor.model.PropertyEditorFieldInfo");
        PropertyEditorCategory_List_fields(entity, java_util_List.demarshall(objVal, a1));
        break;
        case "idEvent": entity.setIdEvent(java_lang_String.demarshall(objVal, a1));
        break;
      }
    }
    return entity;
  }

  public String marshall(PropertyEditorCategory a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.uberfire.ext.properties.editor.model.PropertyEditorCategory") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((((((((((((((("" + ",\"") + "name") + "\":") + java_lang_String.marshall(a0.getName(), a1)) + ",\"") + "priority") + "\":") + java_lang_Integer.marshall(a0.getPriority(), a1)) + ",\"") + "fields") + "\":") + java_util_List.marshall(a0.getFields(), a1)) + ",\"") + "idEvent") + "\":") + java_lang_String.marshall(a0.getIdEvent(), a1)) + "}");
  }

  private void lazyInit() {

  }
}