package org.jboss.errai.marshalling.client.api;

import java.util.Date;
import java.util.List;
import java.util.Set;
import org.dashbuilder.dataset.def.DataSetDef;
import org.dashbuilder.dataset.impl.DataSetImpl;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;
import org.jboss.errai.marshalling.client.marshallers.ObjectMarshaller;

public class Marshaller_o_d_d_i_DataSetImpl_Impl implements GeneratedMarshaller<DataSetImpl> {
  private DataSetImpl[] EMPTY_ARRAY = new DataSetImpl[0];
  private Marshaller java_lang_Object = Marshalling.getMarshaller(Object.class);
  private Marshaller<String> java_lang_String = Marshalling.getMarshaller(String.class);
  private Marshaller<Date> java_util_Date = Marshalling.getMarshaller(Date.class);
  private Marshaller<List> java_util_List = Marshalling.getMarshaller(List.class);
  private Marshaller<Integer> java_lang_Integer = Marshalling.getMarshaller(Integer.class);
  public DataSetImpl[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public DataSetImpl demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(DataSetImpl.class, objId);
    }
    DataSetImpl entity = new DataSetImpl();
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
        case "definition": entity.setDefinition((DataSetDef) ((ObjectMarshaller) java_lang_Object).demarshall(DataSetDef.class, objVal, a1));
        break;
        case "uuid": entity.setUUID(java_lang_String.demarshall(objVal, a1));
        break;
        case "creationDate": entity.setCreationDate(java_util_Date.demarshall(objVal, a1));
        break;
        case "columns": a1.setAssumedElementType("org.dashbuilder.dataset.impl.DataColumnImpl");
        entity.setColumns(java_util_List.demarshall(objVal, a1));
        break;
        case "rowCountNonTrimmed": entity.setRowCountNonTrimmed(java_lang_Integer.demarshall(objVal, a1));
        break;
      }
    }
    return entity;
  }

  public String marshall(DataSetImpl a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.dashbuilder.dataset.impl.DataSetImpl") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((((((((((((((((((("" + ",\"") + "definition") + "\":") + java_lang_Object.marshall(a0.getDefinition(), a1)) + ",\"") + "uuid") + "\":") + java_lang_String.marshall(a0.getUUID(), a1)) + ",\"") + "creationDate") + "\":") + java_util_Date.marshall(a0.getCreationDate(), a1)) + ",\"") + "columns") + "\":") + java_util_List.marshall(a0.getColumns(), a1)) + ",\"") + "rowCountNonTrimmed") + "\":") + java_lang_Integer.marshall(a0.getRowCountNonTrimmed(), a1)) + "}");
  }

  private void lazyInit() {

  }
}