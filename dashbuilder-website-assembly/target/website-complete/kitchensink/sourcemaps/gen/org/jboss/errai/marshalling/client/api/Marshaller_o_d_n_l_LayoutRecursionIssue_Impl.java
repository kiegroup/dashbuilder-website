package org.jboss.errai.marshalling.client.api;

import java.util.List;
import java.util.Set;
import org.dashbuilder.navigation.layout.LayoutNavigationRef;
import org.dashbuilder.navigation.layout.LayoutRecursionIssue;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_o_d_n_l_LayoutRecursionIssue_Impl implements GeneratedMarshaller<LayoutRecursionIssue> {
  private LayoutRecursionIssue[] EMPTY_ARRAY = new LayoutRecursionIssue[0];
  private Marshaller<List> java_util_List = Marshalling.getMarshaller(List.class);
  public LayoutRecursionIssue[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  native static List LayoutRecursionIssue_List_refList(LayoutRecursionIssue instance) /*-{
    return instance.@org.dashbuilder.navigation.layout.LayoutRecursionIssue::refList;
  }-*/;

  native static void LayoutRecursionIssue_List_refList(LayoutRecursionIssue instance, List<LayoutNavigationRef> value) /*-{
    instance.@org.dashbuilder.navigation.layout.LayoutRecursionIssue::refList = value;
  }-*/;

  public LayoutRecursionIssue demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(LayoutRecursionIssue.class, objId);
    }
    LayoutRecursionIssue entity = new LayoutRecursionIssue();
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
        case "refList": a1.setAssumedElementType("org.dashbuilder.navigation.layout.LayoutNavigationRef");
        LayoutRecursionIssue_List_refList(entity, java_util_List.demarshall(objVal, a1));
        break;
      }
    }
    return entity;
  }

  public String marshall(LayoutRecursionIssue a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.dashbuilder.navigation.layout.LayoutRecursionIssue") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((("" + ",\"") + "refList") + "\":") + java_util_List.marshall(a0.getRefList(), a1)) + "}");
  }

  private void lazyInit() {

  }
}