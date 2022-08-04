package org.jboss.errai.marshalling.client.api;

import java.util.Set;
import org.dashbuilder.dataset.date.Month;
import org.dashbuilder.dataset.date.TimeAmount;
import org.dashbuilder.dataset.date.TimeInstant;
import org.dashbuilder.dataset.date.TimeInstant.TimeMode;
import org.dashbuilder.dataset.group.DateIntervalType;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_o_d_d_d_TimeInstant_Impl implements GeneratedMarshaller<TimeInstant> {
  private TimeInstant[] EMPTY_ARRAY = new TimeInstant[0];
  private Marshaller<TimeMode> org_dashbuilder_dataset_date_TimeInstant_erraiD_TimeMode = null;
  private Marshaller<DateIntervalType> org_dashbuilder_dataset_group_DateIntervalType = null;
  private Marshaller<Month> org_dashbuilder_dataset_date_Month = null;
  private Marshaller<TimeAmount> org_dashbuilder_dataset_date_TimeAmount = null;
  public TimeInstant[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public TimeInstant demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(TimeInstant.class, objId);
    }
    TimeInstant entity = new TimeInstant();
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
        case "timeMode": entity.setTimeMode(objVal.isObject() != null ? Enum.valueOf(TimeMode.class, objVal.isObject().get("^EnumStringValue").isString().stringValue()) : objVal.isString() != null ? Enum.valueOf(TimeMode.class, objVal.isString().stringValue()) : null);
        break;
        case "intervalType": entity.setIntervalType(objVal.isObject() != null ? Enum.valueOf(DateIntervalType.class, objVal.isObject().get("^EnumStringValue").isString().stringValue()) : objVal.isString() != null ? Enum.valueOf(DateIntervalType.class, objVal.isString().stringValue()) : null);
        break;
        case "firstMonthOfYear": entity.setFirstMonthOfYear(objVal.isObject() != null ? Enum.valueOf(Month.class, objVal.isObject().get("^EnumStringValue").isString().stringValue()) : objVal.isString() != null ? Enum.valueOf(Month.class, objVal.isString().stringValue()) : null);
        break;
        case "timeAmount": entity.setTimeAmount(org_dashbuilder_dataset_date_TimeAmount.demarshall(objVal, a1));
        break;
      }
    }
    return entity;
  }

  public String marshall(TimeInstant a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.dashbuilder.dataset.date.TimeInstant") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((((((((((((((("" + ",\"") + "timeMode") + "\":") + (a0.getTimeMode() != null ? ((((((("{\"" + "^EncodedType") + "\":\"") + "org.dashbuilder.dataset.date.TimeInstant$TimeMode") + "\",\"") + "^EnumStringValue") + "\":\"") + a0.getTimeMode().name()) + "\"}" : "null")) + ",\"") + "intervalType") + "\":") + (a0.getIntervalType() != null ? ((((((("{\"" + "^EncodedType") + "\":\"") + "org.dashbuilder.dataset.group.DateIntervalType") + "\",\"") + "^EnumStringValue") + "\":\"") + a0.getIntervalType().name()) + "\"}" : "null")) + ",\"") + "firstMonthOfYear") + "\":") + (a0.getFirstMonthOfYear() != null ? ((((((("{\"" + "^EncodedType") + "\":\"") + "org.dashbuilder.dataset.date.Month") + "\",\"") + "^EnumStringValue") + "\":\"") + a0.getFirstMonthOfYear().name()) + "\"}" : "null")) + ",\"") + "timeAmount") + "\":") + org_dashbuilder_dataset_date_TimeAmount.marshall(a0.getTimeAmount(), a1)) + "}");
  }

  private void lazyInit() {
    if (org_dashbuilder_dataset_date_TimeInstant_erraiD_TimeMode == null) {
      org_dashbuilder_dataset_date_TimeInstant_erraiD_TimeMode = Marshalling.getMarshaller(TimeMode.class);
    }
    if (org_dashbuilder_dataset_group_DateIntervalType == null) {
      org_dashbuilder_dataset_group_DateIntervalType = Marshalling.getMarshaller(DateIntervalType.class);
    }
    if (org_dashbuilder_dataset_date_Month == null) {
      org_dashbuilder_dataset_date_Month = Marshalling.getMarshaller(Month.class);
    }
    if (org_dashbuilder_dataset_date_TimeAmount == null) {
      org_dashbuilder_dataset_date_TimeAmount = Marshalling.getMarshaller(TimeAmount.class);
    }
  }
}