package org.jboss.errai.marshalling.client.api;

import java.util.Set;
import org.dashbuilder.dataset.def.DataSetDef;
import org.dashbuilder.dataset.events.DataSetDefModifiedEvent;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;
import org.jboss.errai.marshalling.client.marshallers.ObjectMarshaller;

public class Marshaller_o_d_d_e_DataSetDefModifiedEvent_Impl implements GeneratedMarshaller<DataSetDefModifiedEvent> {
  private DataSetDefModifiedEvent[] EMPTY_ARRAY = new DataSetDefModifiedEvent[0];
  private Marshaller java_lang_Object = Marshalling.getMarshaller(Object.class);
  public DataSetDefModifiedEvent[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public DataSetDefModifiedEvent demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(DataSetDefModifiedEvent.class, objId);
    }
    DataSetDefModifiedEvent entity = new DataSetDefModifiedEvent();
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
        case "oldDataSetDef": entity.setOldDataSetDef((DataSetDef) ((ObjectMarshaller) java_lang_Object).demarshall(DataSetDef.class, objVal, a1));
        break;
        case "newDataSetDef": entity.setNewDataSetDef((DataSetDef) ((ObjectMarshaller) java_lang_Object).demarshall(DataSetDef.class, objVal, a1));
        break;
      }
    }
    return entity;
  }

  public String marshall(DataSetDefModifiedEvent a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.dashbuilder.dataset.events.DataSetDefModifiedEvent") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((((((("" + ",\"") + "oldDataSetDef") + "\":") + java_lang_Object.marshall(a0.getOldDataSetDef(), a1)) + ",\"") + "newDataSetDef") + "\":") + java_lang_Object.marshall(a0.getNewDataSetDef(), a1)) + "}");
  }

  private void lazyInit() {

  }
}