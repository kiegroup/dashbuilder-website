package org.jboss.errai.marshalling.client.api;

import java.util.Set;
import org.dashbuilder.dataset.sort.ColumnSort;
import org.dashbuilder.dataset.sort.SortOrder;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_o_d_d_s_ColumnSort_Impl implements GeneratedMarshaller<ColumnSort> {
  private ColumnSort[] EMPTY_ARRAY = new ColumnSort[0];
  private Marshaller<String> java_lang_String = Marshalling.getMarshaller(String.class);
  private Marshaller<SortOrder> org_dashbuilder_dataset_sort_SortOrder = null;
  public ColumnSort[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public ColumnSort demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(ColumnSort.class, objId);
    }
    ColumnSort entity = new ColumnSort();
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
        case "columnId": entity.setColumnId(java_lang_String.demarshall(objVal, a1));
        break;
        case "order": entity.setOrder(objVal.isObject() != null ? Enum.valueOf(SortOrder.class, objVal.isObject().get("^EnumStringValue").isString().stringValue()) : objVal.isString() != null ? Enum.valueOf(SortOrder.class, objVal.isString().stringValue()) : null);
        break;
      }
    }
    return entity;
  }

  public String marshall(ColumnSort a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.dashbuilder.dataset.sort.ColumnSort") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((((((("" + ",\"") + "columnId") + "\":") + java_lang_String.marshall(a0.getColumnId(), a1)) + ",\"") + "order") + "\":") + (a0.getOrder() != null ? ((((((("{\"" + "^EncodedType") + "\":\"") + "org.dashbuilder.dataset.sort.SortOrder") + "\",\"") + "^EnumStringValue") + "\":\"") + a0.getOrder().name()) + "\"}" : "null")) + "}");
  }

  private void lazyInit() {
    if (org_dashbuilder_dataset_sort_SortOrder == null) {
      org_dashbuilder_dataset_sort_SortOrder = Marshalling.getMarshaller(SortOrder.class);
    }
  }
}