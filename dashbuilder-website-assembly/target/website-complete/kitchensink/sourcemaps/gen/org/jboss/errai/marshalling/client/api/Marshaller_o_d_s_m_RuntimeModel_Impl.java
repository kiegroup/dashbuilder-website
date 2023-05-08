package org.jboss.errai.marshalling.client.api;

import java.util.List;
import java.util.Map;
import org.dashbuilder.navigation.NavTree;
import org.dashbuilder.shared.model.GlobalSettings;
import org.dashbuilder.shared.model.RuntimeModel;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;
import org.jboss.errai.marshalling.client.marshallers.ObjectMarshaller;

public class Marshaller_o_d_s_m_RuntimeModel_Impl implements GeneratedMarshaller<RuntimeModel> {
  private RuntimeModel[] EMPTY_ARRAY = new RuntimeModel[0];
  private Marshaller<GlobalSettings> org_dashbuilder_shared_model_GlobalSettings = null;
  private Marshaller java_lang_Object = Marshalling.getMarshaller(Object.class);
  private Marshaller<Map> java_util_Map = Marshalling.getMarshaller(Map.class);
  private Marshaller<List> java_util_List = Marshalling.getMarshaller(List.class);
  private Marshaller<Long> java_lang_Long = Marshalling.getMarshaller(Long.class);
  public RuntimeModel[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public RuntimeModel demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(RuntimeModel.class, objId);
    }
    final GlobalSettings c5 = org_dashbuilder_shared_model_GlobalSettings.demarshall(obj.get("globalSettings"), a1);
    final NavTree c0 = (NavTree) ((ObjectMarshaller) java_lang_Object).demarshall(NavTree.class, obj.get("navTree"), a1);
    a1.setAssumedMapKeyType("java.lang.String");
    a1.setAssumedMapValueType("java.lang.String");
    final Map c4 = java_util_Map.demarshall(obj.get("properties"), a1);
    a1.resetAssumedTypes();
    a1.setAssumedElementType("org.uberfire.ext.layout.editor.api.editor.LayoutTemplate");
    final List c1 = java_util_List.demarshall(obj.get("layoutTemplates"), a1);
    a1.setAssumedElementType("org.dashbuilder.dataset.def.ExternalDataSetDef");
    final List c3 = java_util_List.demarshall(obj.get("clientDataSets"), a1);
    final Long c2 = java_lang_Long.demarshall(obj.get("lastModified"), a1);
    RuntimeModel entity = new RuntimeModel(c0, c1, c2, c3, c4, c5);
    a1.recordObject(objId, entity);
    return entity;
  }

  public String marshall(RuntimeModel a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.dashbuilder.shared.model.RuntimeModel") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((((((((((((((((((((((("" + ",\"") + "globalSettings") + "\":") + org_dashbuilder_shared_model_GlobalSettings.marshall(a0.getGlobalSettings(), a1)) + ",\"") + "navTree") + "\":") + java_lang_Object.marshall(a0.getNavTree(), a1)) + ",\"") + "properties") + "\":") + java_util_Map.marshall(a0.getProperties(), a1)) + ",\"") + "layoutTemplates") + "\":") + java_util_List.marshall(a0.getLayoutTemplates(), a1)) + ",\"") + "clientDataSets") + "\":") + java_util_List.marshall(a0.getClientDataSets(), a1)) + ",\"") + "lastModified") + "\":") + java_lang_Long.marshall(a0.getLastModified(), a1)) + "}");
  }

  private void lazyInit() {
    if (org_dashbuilder_shared_model_GlobalSettings == null) {
      org_dashbuilder_shared_model_GlobalSettings = Marshalling.getMarshaller(GlobalSettings.class);
    }
  }
}