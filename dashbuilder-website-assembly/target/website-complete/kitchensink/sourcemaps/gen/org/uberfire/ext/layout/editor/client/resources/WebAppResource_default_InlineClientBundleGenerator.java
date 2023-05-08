package org.uberfire.ext.layout.editor.client.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class WebAppResource_default_InlineClientBundleGenerator implements org.uberfire.ext.layout.editor.client.resources.WebAppResource {
  private static WebAppResource_default_InlineClientBundleGenerator _instance0 = new WebAppResource_default_InlineClientBundleGenerator();
  private void cssInitializer() {
    css = new org.uberfire.ext.layout.editor.client.resources.LayoutEditorCss() {
      private boolean injected;
      public boolean ensureInjected() {
        if (!injected) {
          injected = true;
          com.google.gwt.dom.client.StyleInjector.inject(getText());
          return true;
        }
        return false;
      }
      public String getName() {
        return "css";
      }
      public String getText() {
        return (".GJIO14PDOJ{border:" + ("1px"+ " " +"solid"+ " " +"dodgerblue")  + ";margin:" + ("10px"+ " " +"10px"+ " " +"15px"+ " " +"10px")  + ";padding:" + ("10px")  + ";height:" + ("50px")  + ";}.GJIO14PDPJ{border:" + ("1px"+ " " +"solid"+ " " +"lightgray")  + ";margin:" + ("10px"+ " " +"10px"+ " " +"15px"+ " " +"10px")  + ";padding:" + ("10px")  + ";height:" + ("50px")  + ";}.GJIO14PDAK{border:" + ("1px"+ " " +"solid"+ " " +"lightgray")  + ";margin:" + ("10px")  + ";}");
      }
      public java.lang.String dropBorder() {
        return "GJIO14PDOJ";
      }
      public java.lang.String dropInactive() {
        return "GJIO14PDPJ";
      }
      public java.lang.String rowContainer() {
        return "GJIO14PDAK";
      }
    }
    ;
  }
  private static class cssInitializer {
    static {
      _instance0.cssInitializer();
    }
    static org.uberfire.ext.layout.editor.client.resources.LayoutEditorCss get() {
      return css;
    }
  }
  public org.uberfire.ext.layout.editor.client.resources.LayoutEditorCss css() {
    return cssInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static org.uberfire.ext.layout.editor.client.resources.LayoutEditorCss css;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      css(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("css", css());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'css': return this.@org.uberfire.ext.layout.editor.client.resources.WebAppResource::css()();
    }
    return null;
  }-*/;
}
