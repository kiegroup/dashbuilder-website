package org.jboss.errai.marshalling.client.api;

import java.util.Set;
import org.dashbuilder.dataset.group.AggregateFunctionType;
import org.dashbuilder.dataset.group.GroupFunction;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_o_d_d_g_GroupFunction_Impl implements GeneratedMarshaller<GroupFunction> {
  private GroupFunction[] EMPTY_ARRAY = new GroupFunction[0];
  private Marshaller<String> java_lang_String = Marshalling.getMarshaller(String.class);
  private Marshaller<AggregateFunctionType> org_dashbuilder_dataset_group_AggregateFunctionType = null;
  public GroupFunction[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public GroupFunction demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(GroupFunction.class, objId);
    }
    GroupFunction entity = new GroupFunction();
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
        case "sourceId": entity.setSourceId(java_lang_String.demarshall(objVal, a1));
        break;
        case "columnId": entity.setColumnId(java_lang_String.demarshall(objVal, a1));
        break;
        case "function": entity.setFunction(objVal.isObject() != null ? Enum.valueOf(AggregateFunctionType.class, objVal.isObject().get("^EnumStringValue").isString().stringValue()) : objVal.isString() != null ? Enum.valueOf(AggregateFunctionType.class, objVal.isString().stringValue()) : null);
        break;
      }
    }
    return entity;
  }

  public String marshall(GroupFunction a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.dashbuilder.dataset.group.GroupFunction") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((((((((((("" + ",\"") + "sourceId") + "\":") + java_lang_String.marshall(a0.getSourceId(), a1)) + ",\"") + "columnId") + "\":") + java_lang_String.marshall(a0.getColumnId(), a1)) + ",\"") + "function") + "\":") + (a0.getFunction() != null ? ((((((("{\"" + "^EncodedType") + "\":\"") + "org.dashbuilder.dataset.group.AggregateFunctionType") + "\",\"") + "^EnumStringValue") + "\":\"") + a0.getFunction().name()) + "\"}" : "null")) + "}");
  }

  private void lazyInit() {
    if (org_dashbuilder_dataset_group_AggregateFunctionType == null) {
      org_dashbuilder_dataset_group_AggregateFunctionType = Marshalling.getMarshaller(AggregateFunctionType.class);
    }
  }
}