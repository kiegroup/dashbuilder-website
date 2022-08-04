package org.jboss.errai.marshalling.client.api;

import java.util.List;
import java.util.Set;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;
import org.uberfire.ext.properties.editor.model.PropertyEditorCategory;
import org.uberfire.ext.properties.editor.model.PropertyEditorFieldInfo;
import org.uberfire.ext.properties.editor.model.PropertyEditorFieldOption;
import org.uberfire.ext.properties.editor.model.PropertyEditorType;
import org.uberfire.ext.properties.editor.model.validators.PropertyFieldValidator;

public class Marshaller_o_u_e_p_e_m_PropertyEditorFieldInfo_Impl implements GeneratedMarshaller<PropertyEditorFieldInfo> {
  private PropertyEditorFieldInfo[] EMPTY_ARRAY = new PropertyEditorFieldInfo[0];
  private Marshaller<String> java_lang_String = Marshalling.getMarshaller(String.class);
  private Marshaller<PropertyEditorCategory> org_uberfire_ext_properties_editor_model_PropertyEditorCategory = null;
  private Marshaller<PropertyEditorType> org_uberfire_ext_properties_editor_model_PropertyEditorType = null;
  private Marshaller<List> java_util_List = Marshalling.getMarshaller(List.class);
  private Marshaller<Integer> java_lang_Integer = Marshalling.getMarshaller(Integer.class);
  private Marshaller<Boolean> java_lang_Boolean = Marshalling.getMarshaller(Boolean.class);
  public PropertyEditorFieldInfo[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  native static String PropertyEditorFieldInfo_String_label(PropertyEditorFieldInfo instance) /*-{
    return instance.@org.uberfire.ext.properties.editor.model.PropertyEditorFieldInfo::label;
  }-*/;

  native static void PropertyEditorFieldInfo_String_label(PropertyEditorFieldInfo instance, String value) /*-{
    instance.@org.uberfire.ext.properties.editor.model.PropertyEditorFieldInfo::label = value;
  }-*/;

  native static String PropertyEditorFieldInfo_String_originalValue(PropertyEditorFieldInfo instance) /*-{
    return instance.@org.uberfire.ext.properties.editor.model.PropertyEditorFieldInfo::originalValue;
  }-*/;

  native static void PropertyEditorFieldInfo_String_originalValue(PropertyEditorFieldInfo instance, String value) /*-{
    instance.@org.uberfire.ext.properties.editor.model.PropertyEditorFieldInfo::originalValue = value;
  }-*/;

  native static PropertyEditorCategory PropertyEditorFieldInfo_PropertyEditorCategory_category(PropertyEditorFieldInfo instance) /*-{
    return instance.@org.uberfire.ext.properties.editor.model.PropertyEditorFieldInfo::category;
  }-*/;

  native static void PropertyEditorFieldInfo_PropertyEditorCategory_category(PropertyEditorFieldInfo instance, PropertyEditorCategory value) /*-{
    instance.@org.uberfire.ext.properties.editor.model.PropertyEditorFieldInfo::category = value;
  }-*/;

  native static PropertyEditorType PropertyEditorFieldInfo_PropertyEditorType_type(PropertyEditorFieldInfo instance) /*-{
    return instance.@org.uberfire.ext.properties.editor.model.PropertyEditorFieldInfo::type;
  }-*/;

  native static void PropertyEditorFieldInfo_PropertyEditorType_type(PropertyEditorFieldInfo instance, PropertyEditorType value) /*-{
    instance.@org.uberfire.ext.properties.editor.model.PropertyEditorFieldInfo::type = value;
  }-*/;

  native static List PropertyEditorFieldInfo_List_comboValues(PropertyEditorFieldInfo instance) /*-{
    return instance.@org.uberfire.ext.properties.editor.model.PropertyEditorFieldInfo::comboValues;
  }-*/;

  native static void PropertyEditorFieldInfo_List_comboValues(PropertyEditorFieldInfo instance, List<String> value) /*-{
    instance.@org.uberfire.ext.properties.editor.model.PropertyEditorFieldInfo::comboValues = value;
  }-*/;

  native static int PropertyEditorFieldInfo_int_priority(PropertyEditorFieldInfo instance) /*-{
    return instance.@org.uberfire.ext.properties.editor.model.PropertyEditorFieldInfo::priority;
  }-*/;

  native static void PropertyEditorFieldInfo_int_priority(PropertyEditorFieldInfo instance, int value) /*-{
    instance.@org.uberfire.ext.properties.editor.model.PropertyEditorFieldInfo::priority = value;
  }-*/;

  native static List PropertyEditorFieldInfo_List_validators(PropertyEditorFieldInfo instance) /*-{
    return instance.@org.uberfire.ext.properties.editor.model.PropertyEditorFieldInfo::validators;
  }-*/;

  native static void PropertyEditorFieldInfo_List_validators(PropertyEditorFieldInfo instance, List<PropertyFieldValidator> value) /*-{
    instance.@org.uberfire.ext.properties.editor.model.PropertyEditorFieldInfo::validators = value;
  }-*/;

  native static String PropertyEditorFieldInfo_String_key(PropertyEditorFieldInfo instance) /*-{
    return instance.@org.uberfire.ext.properties.editor.model.PropertyEditorFieldInfo::key;
  }-*/;

  native static void PropertyEditorFieldInfo_String_key(PropertyEditorFieldInfo instance, String value) /*-{
    instance.@org.uberfire.ext.properties.editor.model.PropertyEditorFieldInfo::key = value;
  }-*/;

  native static boolean PropertyEditorFieldInfo_boolean_isRemovalSupported(PropertyEditorFieldInfo instance) /*-{
    return instance.@org.uberfire.ext.properties.editor.model.PropertyEditorFieldInfo::isRemovalSupported;
  }-*/;

  native static void PropertyEditorFieldInfo_boolean_isRemovalSupported(PropertyEditorFieldInfo instance, boolean value) /*-{
    instance.@org.uberfire.ext.properties.editor.model.PropertyEditorFieldInfo::isRemovalSupported = value;
  }-*/;

  native static String PropertyEditorFieldInfo_String_helpHeading(PropertyEditorFieldInfo instance) /*-{
    return instance.@org.uberfire.ext.properties.editor.model.PropertyEditorFieldInfo::helpHeading;
  }-*/;

  native static void PropertyEditorFieldInfo_String_helpHeading(PropertyEditorFieldInfo instance, String value) /*-{
    instance.@org.uberfire.ext.properties.editor.model.PropertyEditorFieldInfo::helpHeading = value;
  }-*/;

  native static String PropertyEditorFieldInfo_String_helpText(PropertyEditorFieldInfo instance) /*-{
    return instance.@org.uberfire.ext.properties.editor.model.PropertyEditorFieldInfo::helpText;
  }-*/;

  native static void PropertyEditorFieldInfo_String_helpText(PropertyEditorFieldInfo instance, String value) /*-{
    instance.@org.uberfire.ext.properties.editor.model.PropertyEditorFieldInfo::helpText = value;
  }-*/;

  native static List PropertyEditorFieldInfo_List_options(PropertyEditorFieldInfo instance) /*-{
    return instance.@org.uberfire.ext.properties.editor.model.PropertyEditorFieldInfo::options;
  }-*/;

  native static void PropertyEditorFieldInfo_List_options(PropertyEditorFieldInfo instance, List<PropertyEditorFieldOption> value) /*-{
    instance.@org.uberfire.ext.properties.editor.model.PropertyEditorFieldInfo::options = value;
  }-*/;

  public PropertyEditorFieldInfo demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(PropertyEditorFieldInfo.class, objId);
    }
    PropertyEditorFieldInfo entity = new PropertyEditorFieldInfo();
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
        case "label": PropertyEditorFieldInfo_String_label(entity, java_lang_String.demarshall(objVal, a1));
        break;
        case "currentStringValue": entity.setCurrentStringValue(java_lang_String.demarshall(objVal, a1));
        break;
        case "originalValue": PropertyEditorFieldInfo_String_originalValue(entity, java_lang_String.demarshall(objVal, a1));
        break;
        case "category": PropertyEditorFieldInfo_PropertyEditorCategory_category(entity, org_uberfire_ext_properties_editor_model_PropertyEditorCategory.demarshall(objVal, a1));
        break;
        case "type": PropertyEditorFieldInfo_PropertyEditorType_type(entity, objVal.isObject() != null ? Enum.valueOf(PropertyEditorType.class, objVal.isObject().get("^EnumStringValue").isString().stringValue()) : objVal.isString() != null ? Enum.valueOf(PropertyEditorType.class, objVal.isString().stringValue()) : null);
        break;
        case "comboValues": a1.setAssumedElementType("java.lang.String");
        PropertyEditorFieldInfo_List_comboValues(entity, java_util_List.demarshall(objVal, a1));
        break;
        case "priority": PropertyEditorFieldInfo_int_priority(entity, java_lang_Integer.demarshall(objVal, a1));
        break;
        case "validators": a1.setAssumedElementType("org.uberfire.ext.properties.editor.model.validators.PropertyFieldValidator");
        PropertyEditorFieldInfo_List_validators(entity, java_util_List.demarshall(objVal, a1));
        break;
        case "key": PropertyEditorFieldInfo_String_key(entity, java_lang_String.demarshall(objVal, a1));
        break;
        case "isRemovalSupported": PropertyEditorFieldInfo_boolean_isRemovalSupported(entity, java_lang_Boolean.demarshall(objVal, a1));
        break;
        case "helpHeading": PropertyEditorFieldInfo_String_helpHeading(entity, java_lang_String.demarshall(objVal, a1));
        break;
        case "helpText": PropertyEditorFieldInfo_String_helpText(entity, java_lang_String.demarshall(objVal, a1));
        break;
        case "options": a1.setAssumedElementType("org.uberfire.ext.properties.editor.model.PropertyEditorFieldOption");
        PropertyEditorFieldInfo_List_options(entity, java_util_List.demarshall(objVal, a1));
        break;
      }
    }
    return entity;
  }

  public String marshall(PropertyEditorFieldInfo a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.uberfire.ext.properties.editor.model.PropertyEditorFieldInfo") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((((((((((((((((((((((((((((((((((((((((((((((((((("" + ",\"") + "label") + "\":") + java_lang_String.marshall(a0.getLabel(), a1)) + ",\"") + "currentStringValue") + "\":") + java_lang_String.marshall(a0.getCurrentStringValue(), a1)) + ",\"") + "originalValue") + "\":") + java_lang_String.marshall(a0.getOriginalValue(), a1)) + ",\"") + "category") + "\":") + org_uberfire_ext_properties_editor_model_PropertyEditorCategory.marshall(PropertyEditorFieldInfo_PropertyEditorCategory_category(a0), a1)) + ",\"") + "type") + "\":") + (a0.getType() != null ? ((((((("{\"" + "^EncodedType") + "\":\"") + "org.uberfire.ext.properties.editor.model.PropertyEditorType") + "\",\"") + "^EnumStringValue") + "\":\"") + a0.getType().name()) + "\"}" : "null")) + ",\"") + "comboValues") + "\":") + java_util_List.marshall(a0.getComboValues(), a1)) + ",\"") + "priority") + "\":") + java_lang_Integer.marshall(a0.getPriority(), a1)) + ",\"") + "validators") + "\":") + java_util_List.marshall(a0.getValidators(), a1)) + ",\"") + "key") + "\":") + java_lang_String.marshall(a0.getKey(), a1)) + ",\"") + "isRemovalSupported") + "\":") + java_lang_Boolean.marshall(PropertyEditorFieldInfo_boolean_isRemovalSupported(a0), a1)) + ",\"") + "helpHeading") + "\":") + java_lang_String.marshall(a0.getHelpHeading(), a1)) + ",\"") + "helpText") + "\":") + java_lang_String.marshall(a0.getHelpText(), a1)) + ",\"") + "options") + "\":") + java_util_List.marshall(a0.getOptions(), a1)) + "}");
  }

  private void lazyInit() {
    if (org_uberfire_ext_properties_editor_model_PropertyEditorCategory == null) {
      org_uberfire_ext_properties_editor_model_PropertyEditorCategory = Marshalling.getMarshaller(PropertyEditorCategory.class);
    }
    if (org_uberfire_ext_properties_editor_model_PropertyEditorType == null) {
      org_uberfire_ext_properties_editor_model_PropertyEditorType = Marshalling.getMarshaller(PropertyEditorType.class);
    }
  }
}