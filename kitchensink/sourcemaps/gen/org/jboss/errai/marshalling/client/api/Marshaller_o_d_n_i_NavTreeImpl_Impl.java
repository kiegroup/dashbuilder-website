package org.jboss.errai.marshalling.client.api;

import java.util.Set;
import org.dashbuilder.navigation.NavGroup;
import org.dashbuilder.navigation.impl.NavTreeImpl;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;
import org.jboss.errai.marshalling.client.marshallers.ObjectMarshaller;

public class Marshaller_o_d_n_i_NavTreeImpl_Impl implements GeneratedMarshaller<NavTreeImpl> {
  private NavTreeImpl[] EMPTY_ARRAY = new NavTreeImpl[0];
  private Marshaller java_lang_Object = Marshalling.getMarshaller(Object.class);
  public NavTreeImpl[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  native static NavGroup NavTreeImpl_NavGroup_root(NavTreeImpl instance) /*-{
    return instance.@org.dashbuilder.navigation.impl.NavTreeImpl::root;
  }-*/;

  native static void NavTreeImpl_NavGroup_root(NavTreeImpl instance, NavGroup value) /*-{
    instance.@org.dashbuilder.navigation.impl.NavTreeImpl::root = value;
  }-*/;

  public NavTreeImpl demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(NavTreeImpl.class, objId);
    }
    NavTreeImpl entity = new NavTreeImpl();
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
        case "root": NavTreeImpl_NavGroup_root(entity, (NavGroup) ((ObjectMarshaller) java_lang_Object).demarshall(NavGroup.class, objVal, a1));
        break;
      }
    }
    return entity;
  }

  public String marshall(NavTreeImpl a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.dashbuilder.navigation.impl.NavTreeImpl") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((("" + ",\"") + "root") + "\":") + java_lang_Object.marshall(NavTreeImpl_NavGroup_root(a0), a1)) + "}");
  }

  private void lazyInit() {

  }
}