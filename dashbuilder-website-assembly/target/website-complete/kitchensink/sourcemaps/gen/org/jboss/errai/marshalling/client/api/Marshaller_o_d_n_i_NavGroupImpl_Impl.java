package org.jboss.errai.marshalling.client.api;

import java.util.List;
import java.util.Set;
import org.dashbuilder.navigation.NavGroup;
import org.dashbuilder.navigation.NavItem.Type;
import org.dashbuilder.navigation.impl.NavGroupImpl;
import org.dashbuilder.navigation.impl.NavItemImpl;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;
import org.jboss.errai.marshalling.client.marshallers.ObjectMarshaller;

public class Marshaller_o_d_n_i_NavGroupImpl_Impl implements GeneratedMarshaller<NavGroupImpl> {
  private NavGroupImpl[] EMPTY_ARRAY = new NavGroupImpl[0];
  private Marshaller<List> java_util_List = Marshalling.getMarshaller(List.class);
  private Marshaller<String> java_lang_String = Marshalling.getMarshaller(String.class);
  private Marshaller java_lang_Object = Marshalling.getMarshaller(Object.class);
  private Marshaller<Boolean> java_lang_Boolean = Marshalling.getMarshaller(Boolean.class);
  private Marshaller<Type> org_dashbuilder_navigation_NavItem_erraiD_Type = null;
  public NavGroupImpl[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  native static Type NavItemImpl_Type_type(NavItemImpl instance) /*-{
    return instance.@org.dashbuilder.navigation.impl.NavItemImpl::type;
  }-*/;

  native static void NavItemImpl_Type_type(NavItemImpl instance, Type value) /*-{
    instance.@org.dashbuilder.navigation.impl.NavItemImpl::type = value;
  }-*/;

  public NavGroupImpl demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(NavGroupImpl.class, objId);
    }
    NavGroupImpl entity = new NavGroupImpl();
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
        case "children": a1.setAssumedElementType("org.dashbuilder.navigation.NavItem");
        entity.setChildren(java_util_List.demarshall(objVal, a1));
        break;
        case "id": entity.setId(java_lang_String.demarshall(objVal, a1));
        break;
        case "name": entity.setName(java_lang_String.demarshall(objVal, a1));
        break;
        case "description": entity.setDescription(java_lang_String.demarshall(objVal, a1));
        break;
        case "parent": entity.setParent((NavGroup) ((ObjectMarshaller) java_lang_Object).demarshall(NavGroup.class, objVal, a1));
        break;
        case "modifiable": entity.setModifiable(java_lang_Boolean.demarshall(objVal, a1));
        break;
        case "context": entity.setContext(java_lang_String.demarshall(objVal, a1));
        break;
        case "type": NavItemImpl_Type_type(entity, objVal.isObject() != null ? Enum.valueOf(Type.class, objVal.isObject().get("^EnumStringValue").isString().stringValue()) : objVal.isString() != null ? Enum.valueOf(Type.class, objVal.isString().stringValue()) : null);
        break;
      }
    }
    return entity;
  }

  native static boolean NavItemImpl_boolean_modifiable(NavItemImpl instance) /*-{
    return instance.@org.dashbuilder.navigation.impl.NavItemImpl::modifiable;
  }-*/;

  native static void NavItemImpl_boolean_modifiable(NavItemImpl instance, boolean value) /*-{
    instance.@org.dashbuilder.navigation.impl.NavItemImpl::modifiable = value;
  }-*/;

  public String marshall(NavGroupImpl a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.dashbuilder.navigation.impl.NavGroupImpl") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((((((((((((((((((((((((((((((("" + ",\"") + "children") + "\":") + java_util_List.marshall(a0.getChildren(), a1)) + ",\"") + "id") + "\":") + java_lang_String.marshall(a0.getId(), a1)) + ",\"") + "name") + "\":") + java_lang_String.marshall(a0.getName(), a1)) + ",\"") + "description") + "\":") + java_lang_String.marshall(a0.getDescription(), a1)) + ",\"") + "parent") + "\":") + java_lang_Object.marshall(a0.getParent(), a1)) + ",\"") + "modifiable") + "\":") + java_lang_Boolean.marshall(NavItemImpl_boolean_modifiable(a0), a1)) + ",\"") + "context") + "\":") + java_lang_String.marshall(a0.getContext(), a1)) + ",\"") + "type") + "\":") + (a0.getType() != null ? ((((((("{\"" + "^EncodedType") + "\":\"") + "org.dashbuilder.navigation.NavItem$Type") + "\",\"") + "^EnumStringValue") + "\":\"") + a0.getType().name()) + "\"}" : "null")) + "}");
  }

  private void lazyInit() {
    if (org_dashbuilder_navigation_NavItem_erraiD_Type == null) {
      org_dashbuilder_navigation_NavItem_erraiD_Type = Marshalling.getMarshaller(Type.class);
    }
  }
}