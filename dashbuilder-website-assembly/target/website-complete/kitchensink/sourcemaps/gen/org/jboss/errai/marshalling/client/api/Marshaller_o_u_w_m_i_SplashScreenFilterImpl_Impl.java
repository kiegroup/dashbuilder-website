package org.jboss.errai.marshalling.client.api;

import java.util.Collection;
import java.util.Set;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;
import org.jboss.errai.marshalling.client.marshallers.ObjectMarshaller;
import org.uberfire.workbench.model.impl.SplashScreenFilterImpl;

public class Marshaller_o_u_w_m_i_SplashScreenFilterImpl_Impl implements GeneratedMarshaller<SplashScreenFilterImpl> {
  private SplashScreenFilterImpl[] EMPTY_ARRAY = new SplashScreenFilterImpl[0];
  private Marshaller<String> java_lang_String = Marshalling.getMarshaller(String.class);
  private Marshaller<Boolean> java_lang_Boolean = Marshalling.getMarshaller(Boolean.class);
  private Marshaller java_lang_Object = Marshalling.getMarshaller(Object.class);
  public SplashScreenFilterImpl[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public SplashScreenFilterImpl demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(SplashScreenFilterImpl.class, objId);
    }
    final String c0 = java_lang_String.demarshall(obj.get("name"), a1);
    final Boolean c1 = java_lang_Boolean.demarshall(obj.get("displayNextTime"), a1);
    final Collection c2 = (Collection) ((ObjectMarshaller) java_lang_Object).demarshall(Collection.class, obj.get("interceptionPoints"), a1);
    SplashScreenFilterImpl entity = new SplashScreenFilterImpl(c0, c1, c2);
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
        case "displayNextTime": entity.setDisplayNextTime(java_lang_Boolean.demarshall(objVal, a1));
        break;
      }
    }
    return entity;
  }

  native static boolean SplashScreenFilterImpl_boolean_displayNextTime(SplashScreenFilterImpl instance) /*-{
    return instance.@org.uberfire.workbench.model.impl.SplashScreenFilterImpl::displayNextTime;
  }-*/;

  native static void SplashScreenFilterImpl_boolean_displayNextTime(SplashScreenFilterImpl instance, boolean value) /*-{
    instance.@org.uberfire.workbench.model.impl.SplashScreenFilterImpl::displayNextTime = value;
  }-*/;

  public String marshall(SplashScreenFilterImpl a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.uberfire.workbench.model.impl.SplashScreenFilterImpl") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((((((((((("" + ",\"") + "name") + "\":") + java_lang_String.marshall(a0.getName(), a1)) + ",\"") + "displayNextTime") + "\":") + java_lang_Boolean.marshall(SplashScreenFilterImpl_boolean_displayNextTime(a0), a1)) + ",\"") + "interceptionPoints") + "\":") + java_lang_Object.marshall(a0.getInterceptionPoints(), a1)) + "}");
  }

  private void lazyInit() {

  }
}