package org.jboss.errai.marshalling.client.api;

import java.util.Set;
import org.dashbuilder.dataset.date.DayOfWeek;
import org.dashbuilder.dataset.date.Month;
import org.dashbuilder.dataset.group.ColumnGroup;
import org.dashbuilder.dataset.group.GroupStrategy;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_o_d_d_g_ColumnGroup_Impl implements GeneratedMarshaller<ColumnGroup> {
  private ColumnGroup[] EMPTY_ARRAY = new ColumnGroup[0];
  private Marshaller<String> java_lang_String = Marshalling.getMarshaller(String.class);
  private Marshaller<GroupStrategy> org_dashbuilder_dataset_group_GroupStrategy = null;
  private Marshaller<Integer> java_lang_Integer = Marshalling.getMarshaller(Integer.class);
  private Marshaller<Boolean> java_lang_Boolean = Marshalling.getMarshaller(Boolean.class);
  private Marshaller<Month> org_dashbuilder_dataset_date_Month = null;
  private Marshaller<DayOfWeek> org_dashbuilder_dataset_date_DayOfWeek = null;
  public ColumnGroup[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  native static boolean ColumnGroup_boolean_emptyIntervals(ColumnGroup instance) /*-{
    return instance.@org.dashbuilder.dataset.group.ColumnGroup::emptyIntervals;
  }-*/;

  native static void ColumnGroup_boolean_emptyIntervals(ColumnGroup instance, boolean value) /*-{
    instance.@org.dashbuilder.dataset.group.ColumnGroup::emptyIntervals = value;
  }-*/;

  native static boolean ColumnGroup_boolean_isPostEnabled(ColumnGroup instance) /*-{
    return instance.@org.dashbuilder.dataset.group.ColumnGroup::isPostEnabled;
  }-*/;

  native static void ColumnGroup_boolean_isPostEnabled(ColumnGroup instance, boolean value) /*-{
    instance.@org.dashbuilder.dataset.group.ColumnGroup::isPostEnabled = value;
  }-*/;

  public ColumnGroup demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(ColumnGroup.class, objId);
    }
    ColumnGroup entity = new ColumnGroup();
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
        case "strategy": entity.setStrategy(objVal.isObject() != null ? Enum.valueOf(GroupStrategy.class, objVal.isObject().get("^EnumStringValue").isString().stringValue()) : objVal.isString() != null ? Enum.valueOf(GroupStrategy.class, objVal.isString().stringValue()) : null);
        break;
        case "maxIntervals": entity.setMaxIntervals(java_lang_Integer.demarshall(objVal, a1));
        break;
        case "intervalSize": entity.setIntervalSize(java_lang_String.demarshall(objVal, a1));
        break;
        case "emptyIntervals": ColumnGroup_boolean_emptyIntervals(entity, java_lang_Boolean.demarshall(objVal, a1));
        break;
        case "ascendingOrder": entity.setAscendingOrder(java_lang_Boolean.demarshall(objVal, a1));
        break;
        case "firstMonthOfYear": entity.setFirstMonthOfYear(objVal.isObject() != null ? Enum.valueOf(Month.class, objVal.isObject().get("^EnumStringValue").isString().stringValue()) : objVal.isString() != null ? Enum.valueOf(Month.class, objVal.isString().stringValue()) : null);
        break;
        case "firstDayOfWeek": entity.setFirstDayOfWeek(objVal.isObject() != null ? Enum.valueOf(DayOfWeek.class, objVal.isObject().get("^EnumStringValue").isString().stringValue()) : objVal.isString() != null ? Enum.valueOf(DayOfWeek.class, objVal.isString().stringValue()) : null);
        break;
        case "isPostEnabled": ColumnGroup_boolean_isPostEnabled(entity, java_lang_Boolean.demarshall(objVal, a1));
        break;
      }
    }
    return entity;
  }

  native static boolean ColumnGroup_boolean_ascendingOrder(ColumnGroup instance) /*-{
    return instance.@org.dashbuilder.dataset.group.ColumnGroup::ascendingOrder;
  }-*/;

  native static void ColumnGroup_boolean_ascendingOrder(ColumnGroup instance, boolean value) /*-{
    instance.@org.dashbuilder.dataset.group.ColumnGroup::ascendingOrder = value;
  }-*/;

  public String marshall(ColumnGroup a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.dashbuilder.dataset.group.ColumnGroup") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((((((((((((((((((((((((((((((((((((((("" + ",\"") + "sourceId") + "\":") + java_lang_String.marshall(a0.getSourceId(), a1)) + ",\"") + "columnId") + "\":") + java_lang_String.marshall(a0.getColumnId(), a1)) + ",\"") + "strategy") + "\":") + (a0.getStrategy() != null ? ((((((("{\"" + "^EncodedType") + "\":\"") + "org.dashbuilder.dataset.group.GroupStrategy") + "\",\"") + "^EnumStringValue") + "\":\"") + a0.getStrategy().name()) + "\"}" : "null")) + ",\"") + "maxIntervals") + "\":") + java_lang_Integer.marshall(a0.getMaxIntervals(), a1)) + ",\"") + "intervalSize") + "\":") + java_lang_String.marshall(a0.getIntervalSize(), a1)) + ",\"") + "emptyIntervals") + "\":") + java_lang_Boolean.marshall(ColumnGroup_boolean_emptyIntervals(a0), a1)) + ",\"") + "ascendingOrder") + "\":") + java_lang_Boolean.marshall(ColumnGroup_boolean_ascendingOrder(a0), a1)) + ",\"") + "firstMonthOfYear") + "\":") + (a0.getFirstMonthOfYear() != null ? ((((((("{\"" + "^EncodedType") + "\":\"") + "org.dashbuilder.dataset.date.Month") + "\",\"") + "^EnumStringValue") + "\":\"") + a0.getFirstMonthOfYear().name()) + "\"}" : "null")) + ",\"") + "firstDayOfWeek") + "\":") + (a0.getFirstDayOfWeek() != null ? ((((((("{\"" + "^EncodedType") + "\":\"") + "org.dashbuilder.dataset.date.DayOfWeek") + "\",\"") + "^EnumStringValue") + "\":\"") + a0.getFirstDayOfWeek().name()) + "\"}" : "null")) + ",\"") + "isPostEnabled") + "\":") + java_lang_Boolean.marshall(ColumnGroup_boolean_isPostEnabled(a0), a1)) + "}");
  }

  private void lazyInit() {
    if (org_dashbuilder_dataset_group_GroupStrategy == null) {
      org_dashbuilder_dataset_group_GroupStrategy = Marshalling.getMarshaller(GroupStrategy.class);
    }
    if (org_dashbuilder_dataset_date_Month == null) {
      org_dashbuilder_dataset_date_Month = Marshalling.getMarshaller(Month.class);
    }
    if (org_dashbuilder_dataset_date_DayOfWeek == null) {
      org_dashbuilder_dataset_date_DayOfWeek = Marshalling.getMarshaller(DayOfWeek.class);
    }
  }
}