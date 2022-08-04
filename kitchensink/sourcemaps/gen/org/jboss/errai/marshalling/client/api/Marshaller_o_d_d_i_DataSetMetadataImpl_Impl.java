package org.jboss.errai.marshalling.client.api;

import java.util.List;
import java.util.Set;
import org.dashbuilder.dataset.ColumnType;
import org.dashbuilder.dataset.def.DataSetDef;
import org.dashbuilder.dataset.impl.DataSetMetadataImpl;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;
import org.jboss.errai.marshalling.client.marshallers.ObjectMarshaller;

public class Marshaller_o_d_d_i_DataSetMetadataImpl_Impl implements GeneratedMarshaller<DataSetMetadataImpl> {
  private DataSetMetadataImpl[] EMPTY_ARRAY = new DataSetMetadataImpl[0];
  private Marshaller java_lang_Object = Marshalling.getMarshaller(Object.class);
  private Marshaller<String> java_lang_String = Marshalling.getMarshaller(String.class);
  private Marshaller<Integer> java_lang_Integer = Marshalling.getMarshaller(Integer.class);
  private Marshaller<List> java_util_List = Marshalling.getMarshaller(List.class);
  public DataSetMetadataImpl[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  native static String DataSetMetadataImpl_String_uuid(DataSetMetadataImpl instance) /*-{
    return instance.@org.dashbuilder.dataset.impl.DataSetMetadataImpl::uuid;
  }-*/;

  native static void DataSetMetadataImpl_String_uuid(DataSetMetadataImpl instance, String value) /*-{
    instance.@org.dashbuilder.dataset.impl.DataSetMetadataImpl::uuid = value;
  }-*/;

  native static int DataSetMetadataImpl_int_numberOfColumns(DataSetMetadataImpl instance) /*-{
    return instance.@org.dashbuilder.dataset.impl.DataSetMetadataImpl::numberOfColumns;
  }-*/;

  native static void DataSetMetadataImpl_int_numberOfColumns(DataSetMetadataImpl instance, int value) /*-{
    instance.@org.dashbuilder.dataset.impl.DataSetMetadataImpl::numberOfColumns = value;
  }-*/;

  native static List DataSetMetadataImpl_List_columnIds(DataSetMetadataImpl instance) /*-{
    return instance.@org.dashbuilder.dataset.impl.DataSetMetadataImpl::columnIds;
  }-*/;

  native static void DataSetMetadataImpl_List_columnIds(DataSetMetadataImpl instance, List<String> value) /*-{
    instance.@org.dashbuilder.dataset.impl.DataSetMetadataImpl::columnIds = value;
  }-*/;

  native static List DataSetMetadataImpl_List_columnTypes(DataSetMetadataImpl instance) /*-{
    return instance.@org.dashbuilder.dataset.impl.DataSetMetadataImpl::columnTypes;
  }-*/;

  native static void DataSetMetadataImpl_List_columnTypes(DataSetMetadataImpl instance, List<ColumnType> value) /*-{
    instance.@org.dashbuilder.dataset.impl.DataSetMetadataImpl::columnTypes = value;
  }-*/;

  public DataSetMetadataImpl demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(DataSetMetadataImpl.class, objId);
    }
    DataSetMetadataImpl entity = new DataSetMetadataImpl();
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
        case "uuid": DataSetMetadataImpl_String_uuid(entity, java_lang_String.demarshall(objVal, a1));
        break;
        case "numberOfRows": entity.setNumberOfRows(java_lang_Integer.demarshall(objVal, a1));
        break;
        case "numberOfColumns": DataSetMetadataImpl_int_numberOfColumns(entity, java_lang_Integer.demarshall(objVal, a1));
        break;
        case "columnIds": a1.setAssumedElementType("java.lang.String");
        DataSetMetadataImpl_List_columnIds(entity, java_util_List.demarshall(objVal, a1));
        break;
        case "columnTypes": a1.setAssumedElementType("org.dashbuilder.dataset.ColumnType");
        DataSetMetadataImpl_List_columnTypes(entity, java_util_List.demarshall(objVal, a1));
        break;
        case "estimatedSize": entity.setEstimatedSize(java_lang_Integer.demarshall(objVal, a1));
        break;
      }
    }
    return entity;
  }

  public String marshall(DataSetMetadataImpl a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.dashbuilder.dataset.impl.DataSetMetadataImpl") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((((((((((((((((((((((((((("" + ",\"") + "definition") + "\":") + java_lang_Object.marshall(a0.getDefinition(), a1)) + ",\"") + "uuid") + "\":") + java_lang_String.marshall(a0.getUUID(), a1)) + ",\"") + "numberOfRows") + "\":") + java_lang_Integer.marshall(a0.getNumberOfRows(), a1)) + ",\"") + "numberOfColumns") + "\":") + java_lang_Integer.marshall(a0.getNumberOfColumns(), a1)) + ",\"") + "columnIds") + "\":") + java_util_List.marshall(a0.getColumnIds(), a1)) + ",\"") + "columnTypes") + "\":") + java_util_List.marshall(a0.getColumnTypes(), a1)) + ",\"") + "estimatedSize") + "\":") + java_lang_Integer.marshall(a0.getEstimatedSize(), a1)) + "}");
  }

  private void lazyInit() {

  }
}