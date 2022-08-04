package org.jboss.errai.marshalling.client.api;

import java.util.List;
import java.util.Map;
import java.util.Set;
import org.dashbuilder.dataset.DataSetLookup;
import org.dashbuilder.dataset.DataSetOp;
import org.dashbuilder.kieserver.ConsoleDataSetLookup;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_o_d_k_ConsoleDataSetLookup_Impl implements GeneratedMarshaller<ConsoleDataSetLookup> {
  private ConsoleDataSetLookup[] EMPTY_ARRAY = new ConsoleDataSetLookup[0];
  private Marshaller<String> java_lang_String = Marshalling.getMarshaller(String.class);
  private Marshaller<Integer> java_lang_Integer = Marshalling.getMarshaller(Integer.class);
  private Marshaller<Boolean> java_lang_Boolean = Marshalling.getMarshaller(Boolean.class);
  private Marshaller<List> java_util_List = Marshalling.getMarshaller(List.class);
  private Marshaller<Map> java_util_Map = Marshalling.getMarshaller(Map.class);
  public ConsoleDataSetLookup[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  native static List DataSetLookup_List_operationList(DataSetLookup instance) /*-{
    return instance.@org.dashbuilder.dataset.DataSetLookup::operationList;
  }-*/;

  native static void DataSetLookup_List_operationList(DataSetLookup instance, List<DataSetOp> value) /*-{
    instance.@org.dashbuilder.dataset.DataSetLookup::operationList = value;
  }-*/;

  native static Map DataSetLookup_Map_metadata(DataSetLookup instance) /*-{
    return instance.@org.dashbuilder.dataset.DataSetLookup::metadata;
  }-*/;

  native static void DataSetLookup_Map_metadata(DataSetLookup instance, Map value) /*-{
    instance.@org.dashbuilder.dataset.DataSetLookup::metadata = value;
  }-*/;

  public ConsoleDataSetLookup demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(ConsoleDataSetLookup.class, objId);
    }
    ConsoleDataSetLookup entity = new ConsoleDataSetLookup();
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
        case "serverTemplateId": entity.setServerTemplateId(java_lang_String.demarshall(objVal, a1));
        break;
        case "dataSetUUID": entity.setDataSetUUID(java_lang_String.demarshall(objVal, a1));
        break;
        case "rowOffset": entity.setRowOffset(java_lang_Integer.demarshall(objVal, a1));
        break;
        case "numberOfRows": entity.setNumberOfRows(java_lang_Integer.demarshall(objVal, a1));
        break;
        case "testMode": entity.setTestMode(java_lang_Boolean.demarshall(objVal, a1));
        break;
        case "operationList": a1.setAssumedElementType("org.dashbuilder.dataset.DataSetOp");
        DataSetLookup_List_operationList(entity, java_util_List.demarshall(objVal, a1));
        break;
        case "metadata": a1.setAssumedMapKeyType("java.lang.String");
        a1.setAssumedMapValueType("java.lang.Object");
        DataSetLookup_Map_metadata(entity, java_util_Map.demarshall(objVal, a1));
        a1.resetAssumedTypes();
        break;
      }
    }
    return entity;
  }

  native static boolean DataSetLookup_boolean_testMode(DataSetLookup instance) /*-{
    return instance.@org.dashbuilder.dataset.DataSetLookup::testMode;
  }-*/;

  native static void DataSetLookup_boolean_testMode(DataSetLookup instance, boolean value) /*-{
    instance.@org.dashbuilder.dataset.DataSetLookup::testMode = value;
  }-*/;

  public String marshall(ConsoleDataSetLookup a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.dashbuilder.kieserver.ConsoleDataSetLookup") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((((((((((((((((((((((((((("" + ",\"") + "serverTemplateId") + "\":") + java_lang_String.marshall(a0.getServerTemplateId(), a1)) + ",\"") + "dataSetUUID") + "\":") + java_lang_String.marshall(a0.getDataSetUUID(), a1)) + ",\"") + "rowOffset") + "\":") + java_lang_Integer.marshall(a0.getRowOffset(), a1)) + ",\"") + "numberOfRows") + "\":") + java_lang_Integer.marshall(a0.getNumberOfRows(), a1)) + ",\"") + "testMode") + "\":") + java_lang_Boolean.marshall(DataSetLookup_boolean_testMode(a0), a1)) + ",\"") + "operationList") + "\":") + java_util_List.marshall(a0.getOperationList(), a1)) + ",\"") + "metadata") + "\":") + java_util_Map.marshall(DataSetLookup_Map_metadata(a0), a1)) + "}");
  }

  private void lazyInit() {

  }
}