package org.jboss.errai.marshalling.client.api;

import java.util.List;
import java.util.Set;
import org.dashbuilder.external.model.ExternalComponent;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_o_d_e_m_ExternalComponent_Impl implements GeneratedMarshaller<ExternalComponent> {
  private ExternalComponent[] EMPTY_ARRAY = new ExternalComponent[0];
  private Marshaller<String> java_lang_String = Marshalling.getMarshaller(String.class);
  private Marshaller<Boolean> java_lang_Boolean = Marshalling.getMarshaller(Boolean.class);
  private Marshaller<List> java_util_List = Marshalling.getMarshaller(List.class);
  public ExternalComponent[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  native static String ExternalComponent_String_category(ExternalComponent instance) /*-{
    return instance.@org.dashbuilder.external.model.ExternalComponent::category;
  }-*/;

  native static void ExternalComponent_String_category(ExternalComponent instance, String value) /*-{
    instance.@org.dashbuilder.external.model.ExternalComponent::category = value;
  }-*/;

  public ExternalComponent demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(ExternalComponent.class, objId);
    }
    final String c0 = java_lang_String.demarshall(obj.get("id"), a1);
    final String c1 = java_lang_String.demarshall(obj.get("name"), a1);
    final String c2 = java_lang_String.demarshall(obj.get("icon"), a1);
    final Boolean c3 = java_lang_Boolean.demarshall(obj.get("noData"), a1);
    a1.setAssumedElementType("org.dashbuilder.external.model.ComponentParameter");
    final List c4 = java_util_List.demarshall(obj.get("parameters"), a1);
    ExternalComponent entity = new ExternalComponent(c0, c1, c2, c3, c4);
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
        case "category": ExternalComponent_String_category(entity, java_lang_String.demarshall(objVal, a1));
        break;
        case "provided": entity.setProvided(java_lang_Boolean.demarshall(objVal, a1));
        break;
      }
    }
    return entity;
  }

  native static boolean ExternalComponent_boolean_provided(ExternalComponent instance) /*-{
    return instance.@org.dashbuilder.external.model.ExternalComponent::provided;
  }-*/;

  native static void ExternalComponent_boolean_provided(ExternalComponent instance, boolean value) /*-{
    instance.@org.dashbuilder.external.model.ExternalComponent::provided = value;
  }-*/;

  public String marshall(ExternalComponent a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.dashbuilder.external.model.ExternalComponent") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((((((((((((((((((((((((((("" + ",\"") + "id") + "\":") + java_lang_String.marshall(a0.getId(), a1)) + ",\"") + "name") + "\":") + java_lang_String.marshall(a0.getName(), a1)) + ",\"") + "icon") + "\":") + java_lang_String.marshall(a0.getIcon(), a1)) + ",\"") + "category") + "\":") + java_lang_String.marshall(a0.getCategory(), a1)) + ",\"") + "noData") + "\":") + java_lang_Boolean.marshall(a0.isNoData(), a1)) + ",\"") + "provided") + "\":") + java_lang_Boolean.marshall(ExternalComponent_boolean_provided(a0), a1)) + ",\"") + "parameters") + "\":") + java_util_List.marshall(a0.getParameters(), a1)) + "}");
  }

  private void lazyInit() {

  }
}