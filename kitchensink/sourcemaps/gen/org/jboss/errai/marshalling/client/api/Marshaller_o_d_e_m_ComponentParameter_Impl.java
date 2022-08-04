package org.jboss.errai.marshalling.client.api;

import java.util.List;
import java.util.Set;
import org.dashbuilder.external.model.ComponentParameter;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_o_d_e_m_ComponentParameter_Impl implements GeneratedMarshaller<ComponentParameter> {
  private ComponentParameter[] EMPTY_ARRAY = new ComponentParameter[0];
  private Marshaller<String> java_lang_String = Marshalling.getMarshaller(String.class);
  private Marshaller<List> java_util_List = Marshalling.getMarshaller(List.class);
  private Marshaller<Boolean> java_lang_Boolean = Marshalling.getMarshaller(Boolean.class);
  public ComponentParameter[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public ComponentParameter demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(ComponentParameter.class, objId);
    }
    final String c0 = java_lang_String.demarshall(obj.get("name"), a1);
    final String c1 = java_lang_String.demarshall(obj.get("type"), a1);
    final String c2 = java_lang_String.demarshall(obj.get("category"), a1);
    final String c3 = java_lang_String.demarshall(obj.get("defaultValue"), a1);
    final String c4 = java_lang_String.demarshall(obj.get("label"), a1);
    a1.setAssumedElementType("java.lang.String");
    final List c5 = java_util_List.demarshall(obj.get("comboValues"), a1);
    ComponentParameter entity = new ComponentParameter(c0, c1, c2, c3, c4, c5);
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
        case "mandatory": entity.setMandatory(java_lang_Boolean.demarshall(objVal, a1));
        break;
      }
    }
    return entity;
  }

  native static boolean ComponentParameter_boolean_mandatory(ComponentParameter instance) /*-{
    return instance.@org.dashbuilder.external.model.ComponentParameter::mandatory;
  }-*/;

  native static void ComponentParameter_boolean_mandatory(ComponentParameter instance, boolean value) /*-{
    instance.@org.dashbuilder.external.model.ComponentParameter::mandatory = value;
  }-*/;

  public String marshall(ComponentParameter a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.dashbuilder.external.model.ComponentParameter") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((((((((((((((((((((((((((("" + ",\"") + "name") + "\":") + java_lang_String.marshall(a0.getName(), a1)) + ",\"") + "type") + "\":") + java_lang_String.marshall(a0.getType(), a1)) + ",\"") + "category") + "\":") + java_lang_String.marshall(a0.getCategory(), a1)) + ",\"") + "defaultValue") + "\":") + java_lang_String.marshall(a0.getDefaultValue(), a1)) + ",\"") + "label") + "\":") + java_lang_String.marshall(a0.getLabel(), a1)) + ",\"") + "comboValues") + "\":") + java_util_List.marshall(a0.getComboValues(), a1)) + ",\"") + "mandatory") + "\":") + java_lang_Boolean.marshall(ComponentParameter_boolean_mandatory(a0), a1)) + "}");
  }

  private void lazyInit() {

  }
}