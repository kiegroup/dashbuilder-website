package org.jboss.errai.marshalling.client.api;

import org.jboss.errai.marshalling.client.api.json.EJObject;
import org.jboss.errai.marshalling.client.api.json.EJValue;
import org.uberfire.ext.layout.editor.api.editor.LayoutTemplate.Style;

public class Marshaller_o_u_e_l_e_a_e_LayoutTemplate_erraiD_Style_Impl implements GeneratedMarshaller<Style> {
  private Style[] EMPTY_ARRAY = new Style[0];
  public Style[] getEmptyArray() {
    return EMPTY_ARRAY;
  }

  public Style demarshall(EJValue a0, MarshallingSession a1) {
    lazyInit();
    EJObject obj = a0.isObject();
    Style entity = obj != null ? Enum.valueOf(Style.class, obj.get("^EnumStringValue").isString().stringValue()) : a0.isString() != null ? Enum.valueOf(Style.class, a0.isString().stringValue()) : null;
    return entity;
  }

  public String marshall(Style a0, MarshallingSession a1) {
    lazyInit();
    if (a0 == null) {
      return "null";
    }
    return a0 != null ? ((((((("{\"" + "^EncodedType") + "\":\"") + "org.uberfire.ext.layout.editor.api.editor.LayoutTemplate$Style") + "\",\"") + "^EnumStringValue") + "\":\"") + a0.name()) + "\"}" : "null";
  }

  private void lazyInit() {

  }
}