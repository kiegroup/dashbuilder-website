package org.jboss.errai.marshalling.client.api;

import java.util.List;
import java.util.Set;
import org.dashbuilder.dataset.sort.SortedList;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_o_d_d_s_SortedList_Impl implements GeneratedMarshaller<SortedList> {
  private SortedList[] EMPTY_ARRAY = new SortedList[0];
  private Marshaller<List> java_util_List = Marshalling.getMarshaller(List.class);
  public SortedList[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  native static List SortedList_List_rows(SortedList instance) /*-{
    return instance.@org.dashbuilder.dataset.sort.SortedList::rows;
  }-*/;

  native static void SortedList_List_rows(SortedList instance, List<Integer> value) /*-{
    instance.@org.dashbuilder.dataset.sort.SortedList::rows = value;
  }-*/;

  native static List SortedList_List_realList(SortedList instance) /*-{
    return instance.@org.dashbuilder.dataset.sort.SortedList::realList;
  }-*/;

  native static void SortedList_List_realList(SortedList instance, List value) /*-{
    instance.@org.dashbuilder.dataset.sort.SortedList::realList = value;
  }-*/;

  public SortedList demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(SortedList.class, objId);
    }
    SortedList entity = new SortedList();
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
        case "rows": a1.setAssumedElementType("java.lang.Integer");
        SortedList_List_rows(entity, java_util_List.demarshall(objVal, a1));
        break;
        case "realList": SortedList_List_realList(entity, java_util_List.demarshall(objVal, a1));
        break;
      }
    }
    return entity;
  }

  public String marshall(SortedList a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.dashbuilder.dataset.sort.SortedList") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((((((("" + ",\"") + "rows") + "\":") + java_util_List.marshall(SortedList_List_rows(a0), a1)) + ",\"") + "realList") + "\":") + java_util_List.marshall(SortedList_List_realList(a0), a1)) + "}");
  }

  private void lazyInit() {

  }
}