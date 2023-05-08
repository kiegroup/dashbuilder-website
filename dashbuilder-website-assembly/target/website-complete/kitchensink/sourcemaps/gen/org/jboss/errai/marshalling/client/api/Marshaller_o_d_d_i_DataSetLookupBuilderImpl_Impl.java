package org.jboss.errai.marshalling.client.api;

import java.util.Set;
import org.dashbuilder.dataset.DataSetLookup;
import org.dashbuilder.dataset.impl.AbstractDataSetLookupBuilder;
import org.dashbuilder.dataset.impl.DataSetLookupBuilderImpl;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_o_d_d_i_DataSetLookupBuilderImpl_Impl implements GeneratedMarshaller<DataSetLookupBuilderImpl> {
  private DataSetLookupBuilderImpl[] EMPTY_ARRAY = new DataSetLookupBuilderImpl[0];
  private Marshaller<DataSetLookup> org_dashbuilder_dataset_DataSetLookup = null;
  public DataSetLookupBuilderImpl[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  native static DataSetLookup AbstractDataSetLookupBuilder_DataSetLookup_dataSetLookup(AbstractDataSetLookupBuilder instance) /*-{
    return instance.@org.dashbuilder.dataset.impl.AbstractDataSetLookupBuilder::dataSetLookup;
  }-*/;

  native static void AbstractDataSetLookupBuilder_DataSetLookup_dataSetLookup(AbstractDataSetLookupBuilder instance, DataSetLookup value) /*-{
    instance.@org.dashbuilder.dataset.impl.AbstractDataSetLookupBuilder::dataSetLookup = value;
  }-*/;

  public DataSetLookupBuilderImpl demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(DataSetLookupBuilderImpl.class, objId);
    }
    DataSetLookupBuilderImpl entity = new DataSetLookupBuilderImpl();
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
        case "dataSetLookup": AbstractDataSetLookupBuilder_DataSetLookup_dataSetLookup(entity, org_dashbuilder_dataset_DataSetLookup.demarshall(objVal, a1));
        break;
      }
    }
    return entity;
  }

  public String marshall(DataSetLookupBuilderImpl a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.dashbuilder.dataset.impl.DataSetLookupBuilderImpl") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((("" + ",\"") + "dataSetLookup") + "\":") + org_dashbuilder_dataset_DataSetLookup.marshall(AbstractDataSetLookupBuilder_DataSetLookup_dataSetLookup(a0), a1)) + "}");
  }

  private void lazyInit() {
    if (org_dashbuilder_dataset_DataSetLookup == null) {
      org_dashbuilder_dataset_DataSetLookup = Marshalling.getMarshaller(DataSetLookup.class);
    }
  }
}