package org.jboss.errai.marshalling.client.api;

import java.util.Set;
import org.dashbuilder.dataset.date.TimeAmount;
import org.dashbuilder.dataset.group.DateIntervalType;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_o_d_d_d_TimeAmount_Impl implements GeneratedMarshaller<TimeAmount> {
  private TimeAmount[] EMPTY_ARRAY = new TimeAmount[0];
  private Marshaller<Long> java_lang_Long = Marshalling.getMarshaller(Long.class);
  private Marshaller<DateIntervalType> org_dashbuilder_dataset_group_DateIntervalType = null;
  public TimeAmount[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public TimeAmount demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(TimeAmount.class, objId);
    }
    TimeAmount entity = new TimeAmount();
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
        case "quantity": entity.setQuantity(java_lang_Long.demarshall(objVal, a1));
        break;
        case "type": entity.setType(objVal.isObject() != null ? Enum.valueOf(DateIntervalType.class, objVal.isObject().get("^EnumStringValue").isString().stringValue()) : objVal.isString() != null ? Enum.valueOf(DateIntervalType.class, objVal.isString().stringValue()) : null);
        break;
      }
    }
    return entity;
  }

  public String marshall(TimeAmount a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.dashbuilder.dataset.date.TimeAmount") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((((((("" + ",\"") + "quantity") + "\":") + java_lang_Long.marshall(a0.getQuantity(), a1)) + ",\"") + "type") + "\":") + (a0.getType() != null ? ((((((("{\"" + "^EncodedType") + "\":\"") + "org.dashbuilder.dataset.group.DateIntervalType") + "\",\"") + "^EnumStringValue") + "\":\"") + a0.getType().name()) + "\"}" : "null")) + "}");
  }

  private void lazyInit() {
    if (org_dashbuilder_dataset_group_DateIntervalType == null) {
      org_dashbuilder_dataset_group_DateIntervalType = Marshalling.getMarshaller(DateIntervalType.class);
    }
  }
}