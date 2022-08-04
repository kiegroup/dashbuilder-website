package org.jboss.errai.marshalling.client.api;

import java.util.Set;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;
import org.jboss.errai.marshalling.client.marshallers.ObjectMarshaller;
import org.uberfire.backend.vfs.Path;
import org.uberfire.backend.vfs.impl.ObservablePathImpl;

public class Marshaller_o_u_b_v_i_ObservablePathImpl_Impl implements GeneratedMarshaller<ObservablePathImpl> {
  private ObservablePathImpl[] EMPTY_ARRAY = new ObservablePathImpl[0];
  private Marshaller java_lang_Object = Marshalling.getMarshaller(Object.class);
  public ObservablePathImpl[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  native static Path ObservablePathImpl_Path_path(ObservablePathImpl instance) /*-{
    return instance.@org.uberfire.backend.vfs.impl.ObservablePathImpl::path;
  }-*/;

  native static void ObservablePathImpl_Path_path(ObservablePathImpl instance, Path value) /*-{
    instance.@org.uberfire.backend.vfs.impl.ObservablePathImpl::path = value;
  }-*/;

  public ObservablePathImpl demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(ObservablePathImpl.class, objId);
    }
    ObservablePathImpl entity = new ObservablePathImpl();
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
        case "path": ObservablePathImpl_Path_path(entity, (Path) ((ObjectMarshaller) java_lang_Object).demarshall(Path.class, objVal, a1));
        break;
      }
    }
    return entity;
  }

  public String marshall(ObservablePathImpl a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.uberfire.backend.vfs.impl.ObservablePathImpl") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((("" + ",\"") + "path") + "\":") + java_lang_Object.marshall(ObservablePathImpl_Path_path(a0), a1)) + "}");
  }

  private void lazyInit() {

  }
}