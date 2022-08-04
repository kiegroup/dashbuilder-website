package org.jboss.errai.marshalling.client.api;

import java.util.List;
import java.util.Set;
import org.dashbuilder.dataset.filter.LogicalExprFilter;
import org.dashbuilder.dataset.filter.LogicalExprType;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_o_d_d_f_LogicalExprFilter_Impl implements GeneratedMarshaller<LogicalExprFilter> {
  private LogicalExprFilter[] EMPTY_ARRAY = new LogicalExprFilter[0];
  private Marshaller<LogicalExprType> org_dashbuilder_dataset_filter_LogicalExprType = null;
  private Marshaller<List> java_util_List = Marshalling.getMarshaller(List.class);
  private Marshaller<String> java_lang_String = Marshalling.getMarshaller(String.class);
  public LogicalExprFilter[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public LogicalExprFilter demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(LogicalExprFilter.class, objId);
    }
    LogicalExprFilter entity = new LogicalExprFilter();
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
        case "logicalOperator": entity.setLogicalOperator(objVal.isObject() != null ? Enum.valueOf(LogicalExprType.class, objVal.isObject().get("^EnumStringValue").isString().stringValue()) : objVal.isString() != null ? Enum.valueOf(LogicalExprType.class, objVal.isString().stringValue()) : null);
        break;
        case "logicalTerms": a1.setAssumedElementType("org.dashbuilder.dataset.filter.ColumnFilter");
        entity.setLogicalTerms(java_util_List.demarshall(objVal, a1));
        break;
        case "columnId": entity.setColumnId(java_lang_String.demarshall(objVal, a1));
        break;
      }
    }
    return entity;
  }

  public String marshall(LogicalExprFilter a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.dashbuilder.dataset.filter.LogicalExprFilter") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((((((((((("" + ",\"") + "logicalOperator") + "\":") + (a0.getLogicalOperator() != null ? ((((((("{\"" + "^EncodedType") + "\":\"") + "org.dashbuilder.dataset.filter.LogicalExprType") + "\",\"") + "^EnumStringValue") + "\":\"") + a0.getLogicalOperator().name()) + "\"}" : "null")) + ",\"") + "logicalTerms") + "\":") + java_util_List.marshall(a0.getLogicalTerms(), a1)) + ",\"") + "columnId") + "\":") + java_lang_String.marshall(a0.getColumnId(), a1)) + "}");
  }

  private void lazyInit() {
    if (org_dashbuilder_dataset_filter_LogicalExprType == null) {
      org_dashbuilder_dataset_filter_LogicalExprType = Marshalling.getMarshaller(LogicalExprType.class);
    }
  }
}