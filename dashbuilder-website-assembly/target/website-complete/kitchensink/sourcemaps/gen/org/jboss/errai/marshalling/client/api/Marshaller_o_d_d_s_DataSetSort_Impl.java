package org.jboss.errai.marshalling.client.api;

import java.util.List;
import java.util.Set;
import org.dashbuilder.dataset.sort.ColumnSort;
import org.dashbuilder.dataset.sort.DataSetSort;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_o_d_d_s_DataSetSort_Impl implements GeneratedMarshaller<DataSetSort> {
  private DataSetSort[] EMPTY_ARRAY = new DataSetSort[0];
  private Marshaller<List> java_util_List = Marshalling.getMarshaller(List.class);
  private Marshaller<String> java_lang_String = Marshalling.getMarshaller(String.class);
  public DataSetSort[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  native static List DataSetSort_List_columnSortList(DataSetSort instance) /*-{
    return instance.@org.dashbuilder.dataset.sort.DataSetSort::columnSortList;
  }-*/;

  native static void DataSetSort_List_columnSortList(DataSetSort instance, List<ColumnSort> value) /*-{
    instance.@org.dashbuilder.dataset.sort.DataSetSort::columnSortList = value;
  }-*/;

  public DataSetSort demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(DataSetSort.class, objId);
    }
    DataSetSort entity = new DataSetSort();
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
        case "columnSortList": a1.setAssumedElementType("org.dashbuilder.dataset.sort.ColumnSort");
        DataSetSort_List_columnSortList(entity, java_util_List.demarshall(objVal, a1));
        break;
        case "dataSetUUID": entity.setDataSetUUID(java_lang_String.demarshall(objVal, a1));
        break;
      }
    }
    return entity;
  }

  public String marshall(DataSetSort a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.dashbuilder.dataset.sort.DataSetSort") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((((((("" + ",\"") + "columnSortList") + "\":") + java_util_List.marshall(a0.getColumnSortList(), a1)) + ",\"") + "dataSetUUID") + "\":") + java_lang_String.marshall(a0.getDataSetUUID(), a1)) + "}");
  }

  private void lazyInit() {

  }
}