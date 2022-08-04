package org.jboss.errai.marshalling.client.api;

import java.util.List;
import java.util.Map;
import java.util.Set;
import org.dashbuilder.dataprovider.DataSetProviderType;
import org.dashbuilder.dataset.def.DataSetDef;
import org.dashbuilder.dataset.def.ExternalDataSetDef;
import org.dashbuilder.dataset.filter.DataSetFilter;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;
import org.jboss.errai.marshalling.client.marshallers.ObjectMarshaller;

public class Marshaller_o_d_d_d_ExternalDataSetDef_Impl implements GeneratedMarshaller<ExternalDataSetDef> {
  private ExternalDataSetDef[] EMPTY_ARRAY = new ExternalDataSetDef[0];
  private Marshaller<String> java_lang_String = Marshalling.getMarshaller(String.class);
  private Marshaller<Boolean> java_lang_Boolean = Marshalling.getMarshaller(Boolean.class);
  private Marshaller<Map> java_util_Map = Marshalling.getMarshaller(Map.class);
  private Marshaller java_lang_Object = Marshalling.getMarshaller(Object.class);
  private Marshaller<List> java_util_List = Marshalling.getMarshaller(List.class);
  private Marshaller<DataSetFilter> org_dashbuilder_dataset_filter_DataSetFilter = null;
  private Marshaller<Integer> java_lang_Integer = Marshalling.getMarshaller(Integer.class);
  public ExternalDataSetDef[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  native static boolean DataSetDef_boolean_isPublic(DataSetDef instance) /*-{
    return instance.@org.dashbuilder.dataset.def.DataSetDef::isPublic;
  }-*/;

  native static void DataSetDef_boolean_isPublic(DataSetDef instance, boolean value) /*-{
    instance.@org.dashbuilder.dataset.def.DataSetDef::isPublic = value;
  }-*/;

  native static Map DataSetDef_Map_patternMap(DataSetDef instance) /*-{
    return instance.@org.dashbuilder.dataset.def.DataSetDef::patternMap;
  }-*/;

  native static void DataSetDef_Map_patternMap(DataSetDef instance, Map<String, String> value) /*-{
    instance.@org.dashbuilder.dataset.def.DataSetDef::patternMap = value;
  }-*/;

  native static Map DataSetDef_Map_propertyMap(DataSetDef instance) /*-{
    return instance.@org.dashbuilder.dataset.def.DataSetDef::propertyMap;
  }-*/;

  native static void DataSetDef_Map_propertyMap(DataSetDef instance, Map<String, String> value) /*-{
    instance.@org.dashbuilder.dataset.def.DataSetDef::propertyMap = value;
  }-*/;

  public ExternalDataSetDef demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(ExternalDataSetDef.class, objId);
    }
    ExternalDataSetDef entity = new ExternalDataSetDef();
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
        case "url": entity.setUrl(java_lang_String.demarshall(objVal, a1));
        break;
        case "dynamic": entity.setDynamic(java_lang_Boolean.demarshall(objVal, a1));
        break;
        case "expression": entity.setExpression(java_lang_String.demarshall(objVal, a1));
        break;
        case "content": entity.setContent(java_lang_String.demarshall(objVal, a1));
        break;
        case "headers": a1.setAssumedMapKeyType("java.lang.String");
        a1.setAssumedMapValueType("java.lang.String");
        entity.setHeaders(java_util_Map.demarshall(objVal, a1));
        a1.resetAssumedTypes();
        break;
        case "UUID": entity.setUUID(java_lang_String.demarshall(objVal, a1));
        break;
        case "name": entity.setName(java_lang_String.demarshall(objVal, a1));
        break;
        case "provider": entity.setProvider((DataSetProviderType) ((ObjectMarshaller) java_lang_Object).demarshall(DataSetProviderType.class, objVal, a1));
        break;
        case "columns": a1.setAssumedElementType("org.dashbuilder.dataset.def.DataColumnDef");
        entity.setColumns(java_util_List.demarshall(objVal, a1));
        break;
        case "dataSetFilter": entity.setDataSetFilter(org_dashbuilder_dataset_filter_DataSetFilter.demarshall(objVal, a1));
        break;
        case "isPublic": DataSetDef_boolean_isPublic(entity, java_lang_Boolean.demarshall(objVal, a1));
        break;
        case "pushEnabled": entity.setPushEnabled(java_lang_Boolean.demarshall(objVal, a1));
        break;
        case "pushMaxSize": entity.setPushMaxSize(java_lang_Integer.demarshall(objVal, a1));
        break;
        case "cacheEnabled": entity.setCacheEnabled(java_lang_Boolean.demarshall(objVal, a1));
        break;
        case "cacheMaxRows": entity.setCacheMaxRows(java_lang_Integer.demarshall(objVal, a1));
        break;
        case "refreshTime": entity.setRefreshTime(java_lang_String.demarshall(objVal, a1));
        break;
        case "refreshAlways": entity.setRefreshAlways(java_lang_Boolean.demarshall(objVal, a1));
        break;
        case "allColumnsEnabled": entity.setAllColumnsEnabled(java_lang_Boolean.demarshall(objVal, a1));
        break;
        case "patternMap": a1.setAssumedMapKeyType("java.lang.String");
        a1.setAssumedMapValueType("java.lang.String");
        DataSetDef_Map_patternMap(entity, java_util_Map.demarshall(objVal, a1));
        a1.resetAssumedTypes();
        break;
        case "propertyMap": a1.setAssumedMapKeyType("java.lang.String");
        a1.setAssumedMapValueType("java.lang.String");
        DataSetDef_Map_propertyMap(entity, java_util_Map.demarshall(objVal, a1));
        a1.resetAssumedTypes();
        break;
      }
    }
    return entity;
  }

  native static boolean ExternalDataSetDef_boolean_dynamic(ExternalDataSetDef instance) /*-{
    return instance.@org.dashbuilder.dataset.def.ExternalDataSetDef::dynamic;
  }-*/;

  native static void ExternalDataSetDef_boolean_dynamic(ExternalDataSetDef instance, boolean value) /*-{
    instance.@org.dashbuilder.dataset.def.ExternalDataSetDef::dynamic = value;
  }-*/;

  native static boolean DataSetDef_boolean_pushEnabled(DataSetDef instance) /*-{
    return instance.@org.dashbuilder.dataset.def.DataSetDef::pushEnabled;
  }-*/;

  native static void DataSetDef_boolean_pushEnabled(DataSetDef instance, boolean value) /*-{
    instance.@org.dashbuilder.dataset.def.DataSetDef::pushEnabled = value;
  }-*/;

  native static boolean DataSetDef_boolean_cacheEnabled(DataSetDef instance) /*-{
    return instance.@org.dashbuilder.dataset.def.DataSetDef::cacheEnabled;
  }-*/;

  native static void DataSetDef_boolean_cacheEnabled(DataSetDef instance, boolean value) /*-{
    instance.@org.dashbuilder.dataset.def.DataSetDef::cacheEnabled = value;
  }-*/;

  native static boolean DataSetDef_boolean_refreshAlways(DataSetDef instance) /*-{
    return instance.@org.dashbuilder.dataset.def.DataSetDef::refreshAlways;
  }-*/;

  native static void DataSetDef_boolean_refreshAlways(DataSetDef instance, boolean value) /*-{
    instance.@org.dashbuilder.dataset.def.DataSetDef::refreshAlways = value;
  }-*/;

  native static boolean DataSetDef_boolean_allColumnsEnabled(DataSetDef instance) /*-{
    return instance.@org.dashbuilder.dataset.def.DataSetDef::allColumnsEnabled;
  }-*/;

  native static void DataSetDef_boolean_allColumnsEnabled(DataSetDef instance, boolean value) /*-{
    instance.@org.dashbuilder.dataset.def.DataSetDef::allColumnsEnabled = value;
  }-*/;

  public String marshall(ExternalDataSetDef a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.dashbuilder.dataset.def.ExternalDataSetDef") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((("" + ",\"") + "url") + "\":") + java_lang_String.marshall(a0.getUrl(), a1)) + ",\"") + "dynamic") + "\":") + java_lang_Boolean.marshall(ExternalDataSetDef_boolean_dynamic(a0), a1)) + ",\"") + "expression") + "\":") + java_lang_String.marshall(a0.getExpression(), a1)) + ",\"") + "content") + "\":") + java_lang_String.marshall(a0.getContent(), a1)) + ",\"") + "headers") + "\":") + java_util_Map.marshall(a0.getHeaders(), a1)) + ",\"") + "UUID") + "\":") + java_lang_String.marshall(a0.getUUID(), a1)) + ",\"") + "name") + "\":") + java_lang_String.marshall(a0.getName(), a1)) + ",\"") + "provider") + "\":") + java_lang_Object.marshall(a0.getProvider(), a1)) + ",\"") + "columns") + "\":") + java_util_List.marshall(a0.getColumns(), a1)) + ",\"") + "dataSetFilter") + "\":") + org_dashbuilder_dataset_filter_DataSetFilter.marshall(a0.getDataSetFilter(), a1)) + ",\"") + "isPublic") + "\":") + java_lang_Boolean.marshall(DataSetDef_boolean_isPublic(a0), a1)) + ",\"") + "pushEnabled") + "\":") + java_lang_Boolean.marshall(DataSetDef_boolean_pushEnabled(a0), a1)) + ",\"") + "pushMaxSize") + "\":") + java_lang_Integer.marshall(a0.getPushMaxSize(), a1)) + ",\"") + "cacheEnabled") + "\":") + java_lang_Boolean.marshall(DataSetDef_boolean_cacheEnabled(a0), a1)) + ",\"") + "cacheMaxRows") + "\":") + java_lang_Integer.marshall(a0.getCacheMaxRows(), a1)) + ",\"") + "refreshTime") + "\":") + java_lang_String.marshall(a0.getRefreshTime(), a1)) + ",\"") + "refreshAlways") + "\":") + java_lang_Boolean.marshall(DataSetDef_boolean_refreshAlways(a0), a1)) + ",\"") + "allColumnsEnabled") + "\":") + java_lang_Boolean.marshall(DataSetDef_boolean_allColumnsEnabled(a0), a1)) + ",\"") + "patternMap") + "\":") + java_util_Map.marshall(DataSetDef_Map_patternMap(a0), a1)) + ",\"") + "propertyMap") + "\":") + java_util_Map.marshall(DataSetDef_Map_propertyMap(a0), a1)) + "}");
  }

  private void lazyInit() {
    if (org_dashbuilder_dataset_filter_DataSetFilter == null) {
      org_dashbuilder_dataset_filter_DataSetFilter = Marshalling.getMarshaller(DataSetFilter.class);
    }
  }
}