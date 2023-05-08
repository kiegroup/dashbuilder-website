package org.jboss.errai.marshalling.client.api;

import java.util.List;
import java.util.Set;
import org.dashbuilder.dataset.filter.ColumnFilter;
import org.dashbuilder.dataset.filter.DataSetFilter;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_o_d_d_f_DataSetFilter_Impl implements GeneratedMarshaller<DataSetFilter> {
  private DataSetFilter[] EMPTY_ARRAY = new DataSetFilter[0];
  private Marshaller<List> java_util_List = Marshalling.getMarshaller(List.class);
  private Marshaller<String> java_lang_String = Marshalling.getMarshaller(String.class);
  public DataSetFilter[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  native static List DataSetFilter_List_columnFilterList(DataSetFilter instance) /*-{
    return instance.@org.dashbuilder.dataset.filter.DataSetFilter::columnFilterList;
  }-*/;

  native static void DataSetFilter_List_columnFilterList(DataSetFilter instance, List<ColumnFilter> value) /*-{
    instance.@org.dashbuilder.dataset.filter.DataSetFilter::columnFilterList = value;
  }-*/;

  public DataSetFilter demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(DataSetFilter.class, objId);
    }
    DataSetFilter entity = new DataSetFilter();
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
        case "columnFilterList": a1.setAssumedElementType("org.dashbuilder.dataset.filter.ColumnFilter");
        DataSetFilter_List_columnFilterList(entity, java_util_List.demarshall(objVal, a1));
        break;
        case "dataSetUUID": entity.setDataSetUUID(java_lang_String.demarshall(objVal, a1));
        break;
      }
    }
    return entity;
  }

  public String marshall(DataSetFilter a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.dashbuilder.dataset.filter.DataSetFilter") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((((((("" + ",\"") + "columnFilterList") + "\":") + java_util_List.marshall(a0.getColumnFilterList(), a1)) + ",\"") + "dataSetUUID") + "\":") + java_lang_String.marshall(a0.getDataSetUUID(), a1)) + "}");
  }

  private void lazyInit() {

  }
}