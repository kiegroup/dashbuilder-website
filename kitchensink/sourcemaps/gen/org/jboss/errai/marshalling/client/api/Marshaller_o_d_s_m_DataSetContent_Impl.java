package org.jboss.errai.marshalling.client.api;

import org.dashbuilder.shared.model.DataSetContent;
import org.dashbuilder.shared.model.DataSetContentType;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_o_d_s_m_DataSetContent_Impl implements GeneratedMarshaller<DataSetContent> {
  private DataSetContent[] EMPTY_ARRAY = new DataSetContent[0];
  private Marshaller<String> java_lang_String = Marshalling.getMarshaller(String.class);
  private Marshaller<DataSetContentType> org_dashbuilder_shared_model_DataSetContentType = null;
  public DataSetContent[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public DataSetContent demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(DataSetContent.class, objId);
    }
    final String c0 = java_lang_String.demarshall(obj.get("id"), a1);
    final String c1 = java_lang_String.demarshall(obj.get("content"), a1);
    final DataSetContentType c2 = obj.get("contentType").isObject() != null ? Enum.valueOf(DataSetContentType.class, obj.get("contentType").isObject().get("^EnumStringValue").isString().stringValue()) : obj.get("contentType").isString() != null ? Enum.valueOf(DataSetContentType.class, obj.get("contentType").isString().stringValue()) : null;
    DataSetContent entity = new DataSetContent(c0, c1, c2);
    a1.recordObject(objId, entity);
    return entity;
  }

  public String marshall(DataSetContent a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.dashbuilder.shared.model.DataSetContent") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((((((((((("" + ",\"") + "id") + "\":") + java_lang_String.marshall(a0.getId(), a1)) + ",\"") + "content") + "\":") + java_lang_String.marshall(a0.getContent(), a1)) + ",\"") + "contentType") + "\":") + (a0.getContentType() != null ? ((((((("{\"" + "^EncodedType") + "\":\"") + "org.dashbuilder.shared.model.DataSetContentType") + "\",\"") + "^EnumStringValue") + "\":\"") + a0.getContentType().name()) + "\"}" : "null")) + "}");
  }

  private void lazyInit() {
    if (org_dashbuilder_shared_model_DataSetContentType == null) {
      org_dashbuilder_shared_model_DataSetContentType = Marshalling.getMarshaller(DataSetContentType.class);
    }
  }
}