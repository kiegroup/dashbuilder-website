package org.jboss.errai.marshalling.client.api;

import java.util.List;
import java.util.Set;
import org.dashbuilder.transfer.DataTransferExportModel;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_o_d_t_DataTransferExportModel_Impl implements GeneratedMarshaller<DataTransferExportModel> {
  private DataTransferExportModel[] EMPTY_ARRAY = new DataTransferExportModel[0];
  private Marshaller<List> java_util_List = Marshalling.getMarshaller(List.class);
  private Marshaller<Boolean> java_lang_Boolean = Marshalling.getMarshaller(Boolean.class);
  public DataTransferExportModel[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public DataTransferExportModel demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(DataTransferExportModel.class, objId);
    }
    DataTransferExportModel entity = new DataTransferExportModel();
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
        case "datasetDefinitions": a1.setAssumedElementType("org.dashbuilder.dataset.def.DataSetDef");
        entity.setDatasetDefinitions(java_util_List.demarshall(objVal, a1));
        break;
        case "pages": a1.setAssumedElementType("java.lang.String");
        entity.setPages(java_util_List.demarshall(objVal, a1));
        break;
        case "exportNavigation": entity.setExportNavigation(java_lang_Boolean.demarshall(objVal, a1));
        break;
        case "exportAll": entity.setExportAll(java_lang_Boolean.demarshall(objVal, a1));
        break;
      }
    }
    return entity;
  }

  native static boolean DataTransferExportModel_boolean_exportNavigation(DataTransferExportModel instance) /*-{
    return instance.@org.dashbuilder.transfer.DataTransferExportModel::exportNavigation;
  }-*/;

  native static void DataTransferExportModel_boolean_exportNavigation(DataTransferExportModel instance, boolean value) /*-{
    instance.@org.dashbuilder.transfer.DataTransferExportModel::exportNavigation = value;
  }-*/;

  native static boolean DataTransferExportModel_boolean_exportAll(DataTransferExportModel instance) /*-{
    return instance.@org.dashbuilder.transfer.DataTransferExportModel::exportAll;
  }-*/;

  native static void DataTransferExportModel_boolean_exportAll(DataTransferExportModel instance, boolean value) /*-{
    instance.@org.dashbuilder.transfer.DataTransferExportModel::exportAll = value;
  }-*/;

  public String marshall(DataTransferExportModel a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.dashbuilder.transfer.DataTransferExportModel") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((((((((((((((("" + ",\"") + "datasetDefinitions") + "\":") + java_util_List.marshall(a0.getDatasetDefinitions(), a1)) + ",\"") + "pages") + "\":") + java_util_List.marshall(a0.getPages(), a1)) + ",\"") + "exportNavigation") + "\":") + java_lang_Boolean.marshall(DataTransferExportModel_boolean_exportNavigation(a0), a1)) + ",\"") + "exportAll") + "\":") + java_lang_Boolean.marshall(DataTransferExportModel_boolean_exportAll(a0), a1)) + "}");
  }

  private void lazyInit() {

  }
}