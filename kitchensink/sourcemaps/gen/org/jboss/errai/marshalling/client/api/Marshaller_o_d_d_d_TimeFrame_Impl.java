package org.jboss.errai.marshalling.client.api;

import java.util.Set;
import org.dashbuilder.dataset.date.TimeFrame;
import org.dashbuilder.dataset.date.TimeInstant;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_o_d_d_d_TimeFrame_Impl implements GeneratedMarshaller<TimeFrame> {
  private TimeFrame[] EMPTY_ARRAY = new TimeFrame[0];
  private Marshaller<TimeInstant> org_dashbuilder_dataset_date_TimeInstant = null;
  public TimeFrame[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public TimeFrame demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(TimeFrame.class, objId);
    }
    TimeFrame entity = new TimeFrame();
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
        case "from": entity.setFrom(org_dashbuilder_dataset_date_TimeInstant.demarshall(objVal, a1));
        break;
        case "to": entity.setTo(org_dashbuilder_dataset_date_TimeInstant.demarshall(objVal, a1));
        break;
      }
    }
    return entity;
  }

  public String marshall(TimeFrame a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.dashbuilder.dataset.date.TimeFrame") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((((((("" + ",\"") + "from") + "\":") + org_dashbuilder_dataset_date_TimeInstant.marshall(a0.getFrom(), a1)) + ",\"") + "to") + "\":") + org_dashbuilder_dataset_date_TimeInstant.marshall(a0.getTo(), a1)) + "}");
  }

  private void lazyInit() {
    if (org_dashbuilder_dataset_date_TimeInstant == null) {
      org_dashbuilder_dataset_date_TimeInstant = Marshalling.getMarshaller(TimeInstant.class);
    }
  }
}