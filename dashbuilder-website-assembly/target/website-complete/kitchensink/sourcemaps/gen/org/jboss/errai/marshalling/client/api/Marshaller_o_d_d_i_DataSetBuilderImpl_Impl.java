package org.jboss.errai.marshalling.client.api;

import java.util.Set;
import org.dashbuilder.dataset.DataSet;
import org.dashbuilder.dataset.impl.DataSetBuilderImpl;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;
import org.jboss.errai.marshalling.client.marshallers.ObjectMarshaller;

public class Marshaller_o_d_d_i_DataSetBuilderImpl_Impl implements GeneratedMarshaller<DataSetBuilderImpl> {
  private DataSetBuilderImpl[] EMPTY_ARRAY = new DataSetBuilderImpl[0];
  private Marshaller java_lang_Object = Marshalling.getMarshaller(Object.class);
  public DataSetBuilderImpl[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  native static DataSet DataSetBuilderImpl_DataSet_dataSet(DataSetBuilderImpl instance) /*-{
    return instance.@org.dashbuilder.dataset.impl.DataSetBuilderImpl::dataSet;
  }-*/;

  native static void DataSetBuilderImpl_DataSet_dataSet(DataSetBuilderImpl instance, DataSet value) /*-{
    instance.@org.dashbuilder.dataset.impl.DataSetBuilderImpl::dataSet = value;
  }-*/;

  public DataSetBuilderImpl demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(DataSetBuilderImpl.class, objId);
    }
    DataSetBuilderImpl entity = new DataSetBuilderImpl();
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
        case "dataSet": DataSetBuilderImpl_DataSet_dataSet(entity, (DataSet) ((ObjectMarshaller) java_lang_Object).demarshall(DataSet.class, objVal, a1));
        break;
      }
    }
    return entity;
  }

  public String marshall(DataSetBuilderImpl a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.dashbuilder.dataset.impl.DataSetBuilderImpl") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((("" + ",\"") + "dataSet") + "\":") + java_lang_Object.marshall(DataSetBuilderImpl_DataSet_dataSet(a0), a1)) + "}");
  }

  private void lazyInit() {

  }
}