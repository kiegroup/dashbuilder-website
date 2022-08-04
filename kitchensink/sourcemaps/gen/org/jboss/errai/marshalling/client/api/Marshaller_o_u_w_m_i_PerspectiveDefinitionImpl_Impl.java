package org.jboss.errai.marshalling.client.api;

import java.util.Set;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;
import org.jboss.errai.marshalling.client.marshallers.ObjectMarshaller;
import org.uberfire.workbench.model.ContextDefinition;
import org.uberfire.workbench.model.ContextDisplayMode;
import org.uberfire.workbench.model.PanelDefinition;
import org.uberfire.workbench.model.impl.PerspectiveDefinitionImpl;

public class Marshaller_o_u_w_m_i_PerspectiveDefinitionImpl_Impl implements GeneratedMarshaller<PerspectiveDefinitionImpl> {
  private PerspectiveDefinitionImpl[] EMPTY_ARRAY = new PerspectiveDefinitionImpl[0];
  private Marshaller java_lang_Object = Marshalling.getMarshaller(Object.class);
  private Marshaller<String> java_lang_String = Marshalling.getMarshaller(String.class);
  private Marshaller<ContextDisplayMode> org_uberfire_workbench_model_ContextDisplayMode = null;
  public PerspectiveDefinitionImpl[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  native static PanelDefinition PerspectiveDefinitionImpl_PanelDefinition_root(PerspectiveDefinitionImpl instance) /*-{
    return instance.@org.uberfire.workbench.model.impl.PerspectiveDefinitionImpl::root;
  }-*/;

  native static void PerspectiveDefinitionImpl_PanelDefinition_root(PerspectiveDefinitionImpl instance, PanelDefinition value) /*-{
    instance.@org.uberfire.workbench.model.impl.PerspectiveDefinitionImpl::root = value;
  }-*/;

  public PerspectiveDefinitionImpl demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(PerspectiveDefinitionImpl.class, objId);
    }
    PerspectiveDefinitionImpl entity = new PerspectiveDefinitionImpl();
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
        case "root": PerspectiveDefinitionImpl_PanelDefinition_root(entity, (PanelDefinition) ((ObjectMarshaller) java_lang_Object).demarshall(PanelDefinition.class, objVal, a1));
        break;
        case "name": entity.setName(java_lang_String.demarshall(objVal, a1));
        break;
        case "contextDefinition": entity.setContextDefinition((ContextDefinition) ((ObjectMarshaller) java_lang_Object).demarshall(ContextDefinition.class, objVal, a1));
        break;
        case "contextDisplayMode": entity.setContextDisplayMode(objVal.isObject() != null ? Enum.valueOf(ContextDisplayMode.class, objVal.isObject().get("^EnumStringValue").isString().stringValue()) : objVal.isString() != null ? Enum.valueOf(ContextDisplayMode.class, objVal.isString().stringValue()) : null);
        break;
      }
    }
    return entity;
  }

  public String marshall(PerspectiveDefinitionImpl a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.uberfire.workbench.model.impl.PerspectiveDefinitionImpl") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((((((((((((((("" + ",\"") + "root") + "\":") + java_lang_Object.marshall(a0.getRoot(), a1)) + ",\"") + "name") + "\":") + java_lang_String.marshall(a0.getName(), a1)) + ",\"") + "contextDefinition") + "\":") + java_lang_Object.marshall(a0.getContextDefinition(), a1)) + ",\"") + "contextDisplayMode") + "\":") + (a0.getContextDisplayMode() != null ? ((((((("{\"" + "^EncodedType") + "\":\"") + "org.uberfire.workbench.model.ContextDisplayMode") + "\",\"") + "^EnumStringValue") + "\":\"") + a0.getContextDisplayMode().name()) + "\"}" : "null")) + "}");
  }

  private void lazyInit() {
    if (org_uberfire_workbench_model_ContextDisplayMode == null) {
      org_uberfire_workbench_model_ContextDisplayMode = Marshalling.getMarshaller(ContextDisplayMode.class);
    }
  }
}