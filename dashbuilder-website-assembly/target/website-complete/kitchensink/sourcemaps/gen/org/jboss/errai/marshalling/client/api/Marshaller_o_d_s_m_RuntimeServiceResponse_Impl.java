package org.jboss.errai.marshalling.client.api;

import java.util.List;
import java.util.Optional;
import org.dashbuilder.shared.model.DashbuilderRuntimeMode;
import org.dashbuilder.shared.model.RuntimeServiceResponse;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_o_d_s_m_RuntimeServiceResponse_Impl implements GeneratedMarshaller<RuntimeServiceResponse> {
  private RuntimeServiceResponse[] EMPTY_ARRAY = new RuntimeServiceResponse[0];
  private Marshaller<DashbuilderRuntimeMode> org_dashbuilder_shared_model_DashbuilderRuntimeMode = null;
  private Marshaller<Optional> java_util_Optional = Marshalling.getMarshaller(Optional.class);
  private Marshaller<List> java_util_List = Marshalling.getMarshaller(List.class);
  private Marshaller<Boolean> java_lang_Boolean = Marshalling.getMarshaller(Boolean.class);
  public RuntimeServiceResponse[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public RuntimeServiceResponse demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(RuntimeServiceResponse.class, objId);
    }
    final DashbuilderRuntimeMode c0 = obj.get("mode").isObject() != null ? Enum.valueOf(DashbuilderRuntimeMode.class, obj.get("mode").isObject().get("^EnumStringValue").isString().stringValue()) : obj.get("mode").isString() != null ? Enum.valueOf(DashbuilderRuntimeMode.class, obj.get("mode").isString().stringValue()) : null;
    final Optional c1 = java_util_Optional.demarshall(obj.get("runtimeModelOp"), a1);
    a1.setAssumedElementType("java.lang.String");
    final List c2 = java_util_List.demarshall(obj.get("availableModels"), a1);
    final Boolean c3 = java_lang_Boolean.demarshall(obj.get("allowUpload"), a1);
    RuntimeServiceResponse entity = new RuntimeServiceResponse(c0, c1, c2, c3);
    a1.recordObject(objId, entity);
    return entity;
  }

  public String marshall(RuntimeServiceResponse a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.dashbuilder.shared.model.RuntimeServiceResponse") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((((((((((((((("" + ",\"") + "mode") + "\":") + (a0.getMode() != null ? ((((((("{\"" + "^EncodedType") + "\":\"") + "org.dashbuilder.shared.model.DashbuilderRuntimeMode") + "\",\"") + "^EnumStringValue") + "\":\"") + a0.getMode().name()) + "\"}" : "null")) + ",\"") + "runtimeModelOp") + "\":") + java_util_Optional.marshall(a0.getRuntimeModelOp(), a1)) + ",\"") + "availableModels") + "\":") + java_util_List.marshall(a0.getAvailableModels(), a1)) + ",\"") + "allowUpload") + "\":") + java_lang_Boolean.marshall(a0.isAllowUpload(), a1)) + "}");
  }

  private void lazyInit() {
    if (org_dashbuilder_shared_model_DashbuilderRuntimeMode == null) {
      org_dashbuilder_shared_model_DashbuilderRuntimeMode = Marshalling.getMarshaller(DashbuilderRuntimeMode.class);
    }
  }
}