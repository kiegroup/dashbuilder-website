package org.jboss.errai.marshalling.client.api;

import java.util.Set;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;
import org.jboss.errai.marshalling.client.marshallers.ObjectMarshaller;
import org.uberfire.mvp.PlaceRequest;
import org.uberfire.workbench.model.ContextDefinition;
import org.uberfire.workbench.model.ContextDisplayMode;
import org.uberfire.workbench.model.PanelDefinition;
import org.uberfire.workbench.model.impl.PartDefinitionImpl;

public class Marshaller_o_u_w_m_i_PartDefinitionImpl_Impl implements GeneratedMarshaller<PartDefinitionImpl> {
  private PartDefinitionImpl[] EMPTY_ARRAY = new PartDefinitionImpl[0];
  private Marshaller java_lang_Object = Marshalling.getMarshaller(Object.class);
  private Marshaller<ContextDisplayMode> org_uberfire_workbench_model_ContextDisplayMode = null;
  private Marshaller<Boolean> java_lang_Boolean = Marshalling.getMarshaller(Boolean.class);
  public PartDefinitionImpl[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public PartDefinitionImpl demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(PartDefinitionImpl.class, objId);
    }
    PartDefinitionImpl entity = new PartDefinitionImpl();
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
        case "place": entity.setPlace((PlaceRequest) ((ObjectMarshaller) java_lang_Object).demarshall(PlaceRequest.class, objVal, a1));
        break;
        case "parentPanel": entity.setParentPanel((PanelDefinition) ((ObjectMarshaller) java_lang_Object).demarshall(PanelDefinition.class, objVal, a1));
        break;
        case "contextDefinition": entity.setContextDefinition((ContextDefinition) ((ObjectMarshaller) java_lang_Object).demarshall(ContextDefinition.class, objVal, a1));
        break;
        case "contextDisplayMode": entity.setContextDisplayMode(objVal.isObject() != null ? Enum.valueOf(ContextDisplayMode.class, objVal.isObject().get("^EnumStringValue").isString().stringValue()) : objVal.isString() != null ? Enum.valueOf(ContextDisplayMode.class, objVal.isString().stringValue()) : null);
        break;
        case "selectable": entity.setSelectable(java_lang_Boolean.demarshall(objVal, a1));
        break;
      }
    }
    return entity;
  }

  native static boolean PartDefinitionImpl_boolean_selectable(PartDefinitionImpl instance) /*-{
    return instance.@org.uberfire.workbench.model.impl.PartDefinitionImpl::selectable;
  }-*/;

  native static void PartDefinitionImpl_boolean_selectable(PartDefinitionImpl instance, boolean value) /*-{
    instance.@org.uberfire.workbench.model.impl.PartDefinitionImpl::selectable = value;
  }-*/;

  public String marshall(PartDefinitionImpl a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.uberfire.workbench.model.impl.PartDefinitionImpl") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((((((((((((((((((("" + ",\"") + "place") + "\":") + java_lang_Object.marshall(a0.getPlace(), a1)) + ",\"") + "parentPanel") + "\":") + java_lang_Object.marshall(a0.getParentPanel(), a1)) + ",\"") + "contextDefinition") + "\":") + java_lang_Object.marshall(a0.getContextDefinition(), a1)) + ",\"") + "contextDisplayMode") + "\":") + (a0.getContextDisplayMode() != null ? ((((((("{\"" + "^EncodedType") + "\":\"") + "org.uberfire.workbench.model.ContextDisplayMode") + "\",\"") + "^EnumStringValue") + "\":\"") + a0.getContextDisplayMode().name()) + "\"}" : "null")) + ",\"") + "selectable") + "\":") + java_lang_Boolean.marshall(PartDefinitionImpl_boolean_selectable(a0), a1)) + "}");
  }

  private void lazyInit() {
    if (org_uberfire_workbench_model_ContextDisplayMode == null) {
      org_uberfire_workbench_model_ContextDisplayMode = Marshalling.getMarshaller(ContextDisplayMode.class);
    }
  }
}