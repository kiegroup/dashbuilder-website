package org.jboss.errai.marshalling.client.api;

import java.util.Set;
import org.dashbuilder.dataset.ColumnType;
import org.dashbuilder.dataset.def.DataColumnDef;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_o_d_d_d_DataColumnDef_Impl implements GeneratedMarshaller<DataColumnDef> {
  private DataColumnDef[] EMPTY_ARRAY = new DataColumnDef[0];
  private Marshaller<String> java_lang_String = Marshalling.getMarshaller(String.class);
  private Marshaller<ColumnType> org_dashbuilder_dataset_ColumnType = null;
  public DataColumnDef[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public DataColumnDef demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(DataColumnDef.class, objId);
    }
    DataColumnDef entity = new DataColumnDef();
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
        case "id": entity.setId(java_lang_String.demarshall(objVal, a1));
        break;
        case "columnType": entity.setColumnType(objVal.isObject() != null ? Enum.valueOf(ColumnType.class, objVal.isObject().get("^EnumStringValue").isString().stringValue()) : objVal.isString() != null ? Enum.valueOf(ColumnType.class, objVal.isString().stringValue()) : null);
        break;
      }
    }
    return entity;
  }

  public String marshall(DataColumnDef a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.dashbuilder.dataset.def.DataColumnDef") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((((((("" + ",\"") + "id") + "\":") + java_lang_String.marshall(a0.getId(), a1)) + ",\"") + "columnType") + "\":") + (a0.getColumnType() != null ? ((((((("{\"" + "^EncodedType") + "\":\"") + "org.dashbuilder.dataset.ColumnType") + "\",\"") + "^EnumStringValue") + "\":\"") + a0.getColumnType().name()) + "\"}" : "null")) + "}");
  }

  private void lazyInit() {
    if (org_dashbuilder_dataset_ColumnType == null) {
      org_dashbuilder_dataset_ColumnType = Marshalling.getMarshaller(ColumnType.class);
    }
  }
}