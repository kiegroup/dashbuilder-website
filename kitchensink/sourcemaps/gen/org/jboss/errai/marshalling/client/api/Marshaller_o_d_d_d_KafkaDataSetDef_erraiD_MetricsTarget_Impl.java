package org.jboss.errai.marshalling.client.api;

import org.dashbuilder.dataset.def.KafkaDataSetDef.MetricsTarget;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_o_d_d_d_KafkaDataSetDef_erraiD_MetricsTarget_Impl implements GeneratedMarshaller<MetricsTarget> {
  private MetricsTarget[] EMPTY_ARRAY = new MetricsTarget[0];
  public MetricsTarget[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public MetricsTarget demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    MetricsTarget entity = obj != null ? Enum.valueOf(MetricsTarget.class, obj.get("^EnumStringValue").isString().stringValue()) : a0.isString() != null ? Enum.valueOf(MetricsTarget.class, a0.isString().stringValue()) : null;
    return entity;
  }

  public String marshall(MetricsTarget a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    return a0 != null ? ((((((("{\"" + "^EncodedType") + "\":\"") + "org.dashbuilder.dataset.def.KafkaDataSetDef$MetricsTarget") + "\",\"") + "^EnumStringValue") + "\":\"") + a0.name()) + "\"}" : "null";
  }

  private void lazyInit() {

  }
}