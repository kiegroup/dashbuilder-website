package org.jboss.errai.marshalling.client.api;

import java.util.List;
import java.util.Set;
import org.dashbuilder.dataset.ColumnType;
import org.dashbuilder.dataset.group.ColumnGroup;
import org.dashbuilder.dataset.group.GroupFunction;
import org.dashbuilder.dataset.impl.DataColumnImpl;
import org.dashbuilder.dataset.impl.DataSetImpl;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;
import org.jboss.errai.marshalling.client.marshallers.ObjectMarshaller;

public class Marshaller_o_d_d_i_DataColumnImpl_Impl implements GeneratedMarshaller<DataColumnImpl> {
  private DataColumnImpl[] EMPTY_ARRAY = new DataColumnImpl[0];
  private Marshaller<DataSetImpl> org_dashbuilder_dataset_impl_DataSetImpl = null;
  private Marshaller<String> java_lang_String = Marshalling.getMarshaller(String.class);
  private Marshaller<ColumnType> org_dashbuilder_dataset_ColumnType = null;
  private Marshaller<List> java_util_List = Marshalling.getMarshaller(List.class);
  private Marshaller<ColumnGroup> org_dashbuilder_dataset_group_ColumnGroup = null;
  private Marshaller java_lang_Object = Marshalling.getMarshaller(Object.class);
  private Marshaller<GroupFunction> org_dashbuilder_dataset_group_GroupFunction = null;
  public DataColumnImpl[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public DataColumnImpl demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(DataColumnImpl.class, objId);
    }
    DataColumnImpl entity = new DataColumnImpl();
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
        case "dataSet": entity.setDataSet(org_dashbuilder_dataset_impl_DataSetImpl.demarshall(objVal, a1));
        break;
        case "id": entity.setId(java_lang_String.demarshall(objVal, a1));
        break;
        case "columnType": entity.setColumnType(objVal.isObject() != null ? Enum.valueOf(ColumnType.class, objVal.isObject().get("^EnumStringValue").isString().stringValue()) : objVal.isString() != null ? Enum.valueOf(ColumnType.class, objVal.isString().stringValue()) : null);
        break;
        case "values": entity.setValues(java_util_List.demarshall(objVal, a1));
        break;
        case "columnGroup": entity.setColumnGroup(org_dashbuilder_dataset_group_ColumnGroup.demarshall(objVal, a1));
        break;
        case "intervalType": entity.setIntervalType(java_lang_String.demarshall(objVal, a1));
        break;
        case "minValue": entity.setMinValue(((ObjectMarshaller) java_lang_Object).demarshall(Object.class, objVal, a1));
        break;
        case "maxValue": entity.setMaxValue(((ObjectMarshaller) java_lang_Object).demarshall(Object.class, objVal, a1));
        break;
        case "groupFunction": entity.setGroupFunction(org_dashbuilder_dataset_group_GroupFunction.demarshall(objVal, a1));
        break;
      }
    }
    return entity;
  }

  public String marshall(DataColumnImpl a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.dashbuilder.dataset.impl.DataColumnImpl") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((((((((((((((((((((((((((((((((((("" + ",\"") + "dataSet") + "\":") + org_dashbuilder_dataset_impl_DataSetImpl.marshall(a0.getDataSet(), a1)) + ",\"") + "id") + "\":") + java_lang_String.marshall(a0.getId(), a1)) + ",\"") + "columnType") + "\":") + (a0.getColumnType() != null ? ((((((("{\"" + "^EncodedType") + "\":\"") + "org.dashbuilder.dataset.ColumnType") + "\",\"") + "^EnumStringValue") + "\":\"") + a0.getColumnType().name()) + "\"}" : "null")) + ",\"") + "values") + "\":") + java_util_List.marshall(a0.getValues(), a1)) + ",\"") + "columnGroup") + "\":") + org_dashbuilder_dataset_group_ColumnGroup.marshall(a0.getColumnGroup(), a1)) + ",\"") + "intervalType") + "\":") + java_lang_String.marshall(a0.getIntervalType(), a1)) + ",\"") + "minValue") + "\":") + java_lang_Object.marshall(a0.getMinValue(), a1)) + ",\"") + "maxValue") + "\":") + java_lang_Object.marshall(a0.getMaxValue(), a1)) + ",\"") + "groupFunction") + "\":") + org_dashbuilder_dataset_group_GroupFunction.marshall(a0.getGroupFunction(), a1)) + "}");
  }

  private void lazyInit() {
    if (org_dashbuilder_dataset_impl_DataSetImpl == null) {
      org_dashbuilder_dataset_impl_DataSetImpl = Marshalling.getMarshaller(DataSetImpl.class);
    }
    if (org_dashbuilder_dataset_ColumnType == null) {
      org_dashbuilder_dataset_ColumnType = Marshalling.getMarshaller(ColumnType.class);
    }
    if (org_dashbuilder_dataset_group_ColumnGroup == null) {
      org_dashbuilder_dataset_group_ColumnGroup = Marshalling.getMarshaller(ColumnGroup.class);
    }
    if (org_dashbuilder_dataset_group_GroupFunction == null) {
      org_dashbuilder_dataset_group_GroupFunction = Marshalling.getMarshaller(GroupFunction.class);
    }
  }
}