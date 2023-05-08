package org.jboss.errai.marshalling.client.api;

import java.util.List;
import java.util.Set;
import org.dashbuilder.dataset.filter.CoreFunctionFilter;
import org.dashbuilder.dataset.filter.CoreFunctionType;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_o_d_d_f_CoreFunctionFilter_Impl implements GeneratedMarshaller<CoreFunctionFilter> {
  private CoreFunctionFilter[] EMPTY_ARRAY = new CoreFunctionFilter[0];
  private Marshaller<CoreFunctionType> org_dashbuilder_dataset_filter_CoreFunctionType = null;
  private Marshaller<String> java_lang_String = Marshalling.getMarshaller(String.class);
  private Marshaller<List> java_util_List = Marshalling.getMarshaller(List.class);
  public CoreFunctionFilter[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public CoreFunctionFilter demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(CoreFunctionFilter.class, objId);
    }
    CoreFunctionFilter entity = new CoreFunctionFilter();
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
        case "type": entity.setType(objVal.isObject() != null ? Enum.valueOf(CoreFunctionType.class, objVal.isObject().get("^EnumStringValue").isString().stringValue()) : objVal.isString() != null ? Enum.valueOf(CoreFunctionType.class, objVal.isString().stringValue()) : null);
        break;
        case "labelValue": entity.setLabelValue(java_lang_String.demarshall(objVal, a1));
        break;
        case "parameters": entity.setParameters(java_util_List.demarshall(objVal, a1));
        break;
        case "columnId": entity.setColumnId(java_lang_String.demarshall(objVal, a1));
        break;
      }
    }
    return entity;
  }

  public String marshall(CoreFunctionFilter a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.dashbuilder.dataset.filter.CoreFunctionFilter") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((((((((((((((("" + ",\"") + "type") + "\":") + (a0.getType() != null ? ((((((("{\"" + "^EncodedType") + "\":\"") + "org.dashbuilder.dataset.filter.CoreFunctionType") + "\",\"") + "^EnumStringValue") + "\":\"") + a0.getType().name()) + "\"}" : "null")) + ",\"") + "labelValue") + "\":") + java_lang_String.marshall(a0.getLabelValue(), a1)) + ",\"") + "parameters") + "\":") + java_util_List.marshall(a0.getParameters(), a1)) + ",\"") + "columnId") + "\":") + java_lang_String.marshall(a0.getColumnId(), a1)) + "}");
  }

  private void lazyInit() {
    if (org_dashbuilder_dataset_filter_CoreFunctionType == null) {
      org_dashbuilder_dataset_filter_CoreFunctionType = Marshalling.getMarshaller(CoreFunctionType.class);
    }
  }
}