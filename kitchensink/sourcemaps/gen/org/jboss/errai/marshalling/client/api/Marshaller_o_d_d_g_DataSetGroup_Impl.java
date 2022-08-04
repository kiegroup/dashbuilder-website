package org.jboss.errai.marshalling.client.api;

import java.util.List;
import java.util.Set;
import org.dashbuilder.dataset.group.ColumnGroup;
import org.dashbuilder.dataset.group.DataSetGroup;
import org.dashbuilder.dataset.group.GroupFunction;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_o_d_d_g_DataSetGroup_Impl implements GeneratedMarshaller<DataSetGroup> {
  private DataSetGroup[] EMPTY_ARRAY = new DataSetGroup[0];
  private Marshaller<Boolean> java_lang_Boolean = Marshalling.getMarshaller(Boolean.class);
  private Marshaller<ColumnGroup> org_dashbuilder_dataset_group_ColumnGroup = null;
  private Marshaller<List> java_util_List = Marshalling.getMarshaller(List.class);
  private Marshaller<String> java_lang_String = Marshalling.getMarshaller(String.class);
  public DataSetGroup[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  native static List DataSetGroup_List_groupFunctionList(DataSetGroup instance) /*-{
    return instance.@org.dashbuilder.dataset.group.DataSetGroup::groupFunctionList;
  }-*/;

  native static void DataSetGroup_List_groupFunctionList(DataSetGroup instance, List<GroupFunction> value) /*-{
    instance.@org.dashbuilder.dataset.group.DataSetGroup::groupFunctionList = value;
  }-*/;

  public DataSetGroup demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(DataSetGroup.class, objId);
    }
    DataSetGroup entity = new DataSetGroup();
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
        case "join": entity.setJoin(java_lang_Boolean.demarshall(objVal, a1));
        break;
        case "columnGroup": entity.setColumnGroup(org_dashbuilder_dataset_group_ColumnGroup.demarshall(objVal, a1));
        break;
        case "groupFunctionList": a1.setAssumedElementType("org.dashbuilder.dataset.group.GroupFunction");
        DataSetGroup_List_groupFunctionList(entity, java_util_List.demarshall(objVal, a1));
        break;
        case "selectedIntervalList": a1.setAssumedElementType("org.dashbuilder.dataset.group.Interval");
        entity.setSelectedIntervalList(java_util_List.demarshall(objVal, a1));
        break;
        case "dataSetUUID": entity.setDataSetUUID(java_lang_String.demarshall(objVal, a1));
        break;
      }
    }
    return entity;
  }

  native static boolean DataSetGroup_boolean_join(DataSetGroup instance) /*-{
    return instance.@org.dashbuilder.dataset.group.DataSetGroup::join;
  }-*/;

  native static void DataSetGroup_boolean_join(DataSetGroup instance, boolean value) /*-{
    instance.@org.dashbuilder.dataset.group.DataSetGroup::join = value;
  }-*/;

  public String marshall(DataSetGroup a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.dashbuilder.dataset.group.DataSetGroup") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((((((((((((((((((("" + ",\"") + "join") + "\":") + java_lang_Boolean.marshall(DataSetGroup_boolean_join(a0), a1)) + ",\"") + "columnGroup") + "\":") + org_dashbuilder_dataset_group_ColumnGroup.marshall(a0.getColumnGroup(), a1)) + ",\"") + "groupFunctionList") + "\":") + java_util_List.marshall(DataSetGroup_List_groupFunctionList(a0), a1)) + ",\"") + "selectedIntervalList") + "\":") + java_util_List.marshall(a0.getSelectedIntervalList(), a1)) + ",\"") + "dataSetUUID") + "\":") + java_lang_String.marshall(a0.getDataSetUUID(), a1)) + "}");
  }

  private void lazyInit() {
    if (org_dashbuilder_dataset_group_ColumnGroup == null) {
      org_dashbuilder_dataset_group_ColumnGroup = Marshalling.getMarshaller(ColumnGroup.class);
    }
  }
}