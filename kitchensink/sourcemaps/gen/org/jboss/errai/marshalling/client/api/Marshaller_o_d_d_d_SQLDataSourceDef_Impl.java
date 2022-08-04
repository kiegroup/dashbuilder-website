package org.jboss.errai.marshalling.client.api;

import java.util.Set;
import org.dashbuilder.dataset.def.SQLDataSourceDef;
import org.jboss.errai.marshalling.client.Marshalling;
import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;

public class Marshaller_o_d_d_d_SQLDataSourceDef_Impl implements GeneratedMarshaller<SQLDataSourceDef> {
  private SQLDataSourceDef[] EMPTY_ARRAY = new SQLDataSourceDef[0];
  private Marshaller<String> java_lang_String = Marshalling.getMarshaller(String.class);
  public SQLDataSourceDef[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public SQLDataSourceDef demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    if (obj == null) {
      return null;
    }
    String objId = obj.get("^ObjectID").isString().stringValue();
    if (a1.hasObject(objId)) {
      return a1.getObject(SQLDataSourceDef.class, objId);
    }
    SQLDataSourceDef entity = new SQLDataSourceDef();
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
        case "name": entity.setName(java_lang_String.demarshall(objVal, a1));
        break;
        case "description": entity.setDescription(java_lang_String.demarshall(objVal, a1));
        break;
      }
    }
    return entity;
  }

  public String marshall(SQLDataSourceDef a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    final boolean ref = a1.hasObject(a0);
    final String prefix = ((((((((("" + "{\"") + "^EncodedType") + "\":\"") + "org.dashbuilder.dataset.def.SQLDataSourceDef") + "\"") + ",\"") + "^ObjectID") + "\":\"") + a1.getObject(a0)) + "\"";
    if (ref) {
      return prefix + "}";
    }
    return prefix + ((((((((("" + ",\"") + "name") + "\":") + java_lang_String.marshall(a0.getName(), a1)) + ",\"") + "description") + "\":") + java_lang_String.marshall(a0.getDescription(), a1)) + "}");
  }

  private void lazyInit() {

  }
}