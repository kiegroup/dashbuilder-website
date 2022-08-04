package org.jboss.errai.marshalling.client.api;

import java.util.List;
import java.util.Set;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;
import org.jboss.errai.marshalling.client.marshallers.ObjectMarshaller;
import org.uberfire.workbench.model.ContextDefinition;
import org.uberfire.workbench.model.ContextDisplayMode;
import org.uberfire.workbench.model.PanelDefinition;
import org.uberfire.workbench.model.PartDefinition;
import org.uberfire.workbench.model.Position;
import org.uberfire.workbench.model.impl.PanelDefinitionImpl;

public class Marshaller_o_u_w_m_i_PanelDefinitionImpl_Impl implements GeneratedMarshaller<PanelDefinitionImpl> {
  private PanelDefinitionImpl[] EMPTY_ARRAY = new PanelDefinitionImpl[0];
  private Marshaller<Set> java_util_Set = Marshalling.getMarshaller(Set.class);
  private Marshaller<List> java_util_List = Marshalling.getMarshaller(List.class);
  private Marshaller<Integer> java_lang_Integer = Marshalling.getMarshaller(Integer.class);
  private Marshaller<String> java_lang_String = Marshalling.getMarshaller(String.class);
  private Marshaller java_lang_Object = Marshalling.getMarshaller(Object.class);
  private Marshaller<Boolean> java_lang_Boolean = Marshalling.getMarshaller(Boolean.class);
  private Marshaller<ContextDisplayMode> org_uberfire_workbench_model_ContextDisplayMode = null;
  public PanelDefinitionImpl[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  native static Set PanelDefinitionImpl_Set_parts(PanelDefinitionImpl instance) /*-{
    return instance.@org.uberfire.workbench.model.impl.PanelDefinitionImpl::parts;
  }-*/;

  native static void PanelDefinitionImpl_Set_parts(PanelDefinitionImpl instance, Set<PartDefinition> value) /*-{
    instance.@org.uberfire.workbench.model.impl.PanelDefinitionImpl::parts = value;
  }-*/;

  native static List PanelDefinitionImpl_List_children(PanelDefinitionImpl instance) /*-{
    return instance.@org.uberfire.workbench.model.impl.PanelDefinitionImpl::children;
  }-*/;

  native static void PanelDefinitionImpl_List_children(PanelDefinitionImpl instance, List<PanelDefinition> value) /*-{
    instance.@org.uberfire.workbench.model.impl.PanelDefinitionImpl::children = value;
  }-*/;

  native static boolean PanelDefinitionImpl_boolean_isRoot(PanelDefinitionImpl instance) /*-{
    return instance.@org.uberfire.workbench.model.impl.PanelDefinitionImpl::isRoot;
  }-*/;

  native static void PanelDefinitionImpl_boolean_isRoot(PanelDefinitionImpl instance, boolean value) /*-{
    instance.@org.uberfire.workbench.model.impl.PanelDefinitionImpl::isRoot = value;
  }-*/;

  public PanelDefinitionImpl demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(PanelDefinitionImpl.class, objId);
    }
    PanelDefinitionImpl entity = new PanelDefinitionImpl();
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
        case "parts": a1.setAssumedElementType("org.uberfire.workbench.model.PartDefinition");
        PanelDefinitionImpl_Set_parts(entity, java_util_Set.demarshall(objVal, a1));
        break;
        case "children": a1.setAssumedElementType("org.uberfire.workbench.model.PanelDefinition");
        PanelDefinitionImpl_List_children(entity, java_util_List.demarshall(objVal, a1));
        break;
        case "height": entity.setHeight(java_lang_Integer.demarshall(objVal, a1));
        break;
        case "width": entity.setWidth(java_lang_Integer.demarshall(objVal, a1));
        break;
        case "minHeight": entity.setMinHeight(java_lang_Integer.demarshall(objVal, a1));
        break;
        case "minWidth": entity.setMinWidth(java_lang_Integer.demarshall(objVal, a1));
        break;
        case "elementId": entity.setElementId(java_lang_String.demarshall(objVal, a1));
        break;
        case "position": entity.setPosition((Position) ((ObjectMarshaller) java_lang_Object).demarshall(Position.class, objVal, a1));
        break;
        case "panelType": entity.setPanelType(java_lang_String.demarshall(objVal, a1));
        break;
        case "isRoot": PanelDefinitionImpl_boolean_isRoot(entity, java_lang_Boolean.demarshall(objVal, a1));
        break;
        case "contextDefinition": entity.setContextDefinition((ContextDefinition) ((ObjectMarshaller) java_lang_Object).demarshall(ContextDefinition.class, objVal, a1));
        break;
        case "contextDisplayMode": entity.setContextDisplayMode(objVal.isObject() != null ? Enum.valueOf(ContextDisplayMode.class, objVal.isObject().get("^EnumStringValue").isString().stringValue()) : objVal.isString() != null ? Enum.valueOf(ContextDisplayMode.class, objVal.isString().stringValue()) : null);
        break;
        case "parent": entity.setParent((PanelDefinition) ((ObjectMarshaller) java_lang_Object).demarshall(PanelDefinition.class, objVal, a1));
        break;
      }
    }
    return entity;
  }

  public String marshall(PanelDefinitionImpl a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.uberfire.workbench.model.impl.PanelDefinitionImpl") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((((((((((((((((((((((((((((((((((((((((((((((((((("" + ",\"") + "parts") + "\":") + java_util_Set.marshall(a0.getParts(), a1)) + ",\"") + "children") + "\":") + java_util_List.marshall(a0.getChildren(), a1)) + ",\"") + "height") + "\":") + java_lang_Integer.marshall(a0.getHeight(), a1)) + ",\"") + "width") + "\":") + java_lang_Integer.marshall(a0.getWidth(), a1)) + ",\"") + "minHeight") + "\":") + java_lang_Integer.marshall(a0.getMinHeight(), a1)) + ",\"") + "minWidth") + "\":") + java_lang_Integer.marshall(a0.getMinWidth(), a1)) + ",\"") + "elementId") + "\":") + java_lang_String.marshall(a0.getElementId(), a1)) + ",\"") + "position") + "\":") + java_lang_Object.marshall(a0.getPosition(), a1)) + ",\"") + "panelType") + "\":") + java_lang_String.marshall(a0.getPanelType(), a1)) + ",\"") + "isRoot") + "\":") + java_lang_Boolean.marshall(PanelDefinitionImpl_boolean_isRoot(a0), a1)) + ",\"") + "contextDefinition") + "\":") + java_lang_Object.marshall(a0.getContextDefinition(), a1)) + ",\"") + "contextDisplayMode") + "\":") + (a0.getContextDisplayMode() != null ? ((((((("{\"" + "^EncodedType") + "\":\"") + "org.uberfire.workbench.model.ContextDisplayMode") + "\",\"") + "^EnumStringValue") + "\":\"") + a0.getContextDisplayMode().name()) + "\"}" : "null")) + ",\"") + "parent") + "\":") + java_lang_Object.marshall(a0.getParent(), a1)) + "}");
  }

  private void lazyInit() {
    if (org_uberfire_workbench_model_ContextDisplayMode == null) {
      org_uberfire_workbench_model_ContextDisplayMode = Marshalling.getMarshaller(ContextDisplayMode.class);
    }
  }
}