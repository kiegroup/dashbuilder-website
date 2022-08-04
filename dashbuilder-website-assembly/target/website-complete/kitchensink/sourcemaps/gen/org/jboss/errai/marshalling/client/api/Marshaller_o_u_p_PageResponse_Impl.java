package org.jboss.errai.marshalling.client.api;

import java.util.List;
import java.util.Set;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;
import org.uberfire.paging.PageResponse;

public class Marshaller_o_u_p_PageResponse_Impl implements GeneratedMarshaller<PageResponse> {
  private PageResponse[] EMPTY_ARRAY = new PageResponse[0];
  private Marshaller<Boolean> java_lang_Boolean = Marshalling.getMarshaller(Boolean.class);
  private Marshaller<Integer> java_lang_Integer = Marshalling.getMarshaller(Integer.class);
  private Marshaller<List> java_util_List = Marshalling.getMarshaller(List.class);
  public PageResponse[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public PageResponse demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(PageResponse.class, objId);
    }
    PageResponse entity = new PageResponse();
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
        case "totalRowSizeExact": entity.setTotalRowSizeExact(java_lang_Boolean.demarshall(objVal, a1));
        break;
        case "totalRowSize": entity.setTotalRowSize(java_lang_Integer.demarshall(objVal, a1));
        break;
        case "startRowIndex": entity.setStartRowIndex(java_lang_Integer.demarshall(objVal, a1));
        break;
        case "pageRowList": entity.setPageRowList(java_util_List.demarshall(objVal, a1));
        break;
        case "lastPage": entity.setLastPage(java_lang_Boolean.demarshall(objVal, a1));
        break;
      }
    }
    return entity;
  }

  native static boolean PageResponse_boolean_totalRowSizeExact(PageResponse instance) /*-{
    return instance.@org.uberfire.paging.PageResponse::totalRowSizeExact;
  }-*/;

  native static void PageResponse_boolean_totalRowSizeExact(PageResponse instance, boolean value) /*-{
    instance.@org.uberfire.paging.PageResponse::totalRowSizeExact = value;
  }-*/;

  native static boolean PageResponse_boolean_lastPage(PageResponse instance) /*-{
    return instance.@org.uberfire.paging.PageResponse::lastPage;
  }-*/;

  native static void PageResponse_boolean_lastPage(PageResponse instance, boolean value) /*-{
    instance.@org.uberfire.paging.PageResponse::lastPage = value;
  }-*/;

  public String marshall(PageResponse a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.uberfire.paging.PageResponse") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((((((((((((((((((("" + ",\"") + "totalRowSizeExact") + "\":") + java_lang_Boolean.marshall(PageResponse_boolean_totalRowSizeExact(a0), a1)) + ",\"") + "totalRowSize") + "\":") + java_lang_Integer.marshall(a0.getTotalRowSize(), a1)) + ",\"") + "startRowIndex") + "\":") + java_lang_Integer.marshall(a0.getStartRowIndex(), a1)) + ",\"") + "pageRowList") + "\":") + java_util_List.marshall(a0.getPageRowList(), a1)) + ",\"") + "lastPage") + "\":") + java_lang_Boolean.marshall(PageResponse_boolean_lastPage(a0), a1)) + "}");
  }

  private void lazyInit() {

  }
}