package org.uberfire.ext.layout.editor.client.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class WebAppResource_default_InlineClientBundleGenerator implements org.uberfire.ext.layout.editor.client.resources.WebAppResource {
  private static WebAppResource_default_InlineClientBundleGenerator _instance0 = new WebAppResource_default_InlineClientBundleGenerator();
  private void CSSInitializer() {
    CSS = new org.uberfire.ext.layout.editor.client.resources.LayoutEditorCss() {
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
        return "CSS";
      }
      public String getText() {
        return (".GD0PFO4BJL{border:" + ("1px"+ " " +"solid"+ " " +"dodgerblue")  + ";margin:" + ("10px"+ " " +"10px"+ " " +"15px"+ " " +"10px")  + ";padding:" + ("10px")  + ";height:" + ("50px")  + ";}.GD0PFO4BKL{border:" + ("1px"+ " " +"solid"+ " " +"lightgray")  + ";margin:" + ("10px"+ " " +"10px"+ " " +"15px"+ " " +"10px")  + ";padding:" + ("10px")  + ";height:" + ("50px")  + ";}.GD0PFO4BLL{border:" + ("1px"+ " " +"solid"+ " " +"lightgray")  + ";margin:" + ("10px")  + ";}");
      }
      public java.lang.String dropBorder() {
        return "GD0PFO4BJL";
      }
      public java.lang.String dropInactive() {
        return "GD0PFO4BKL";
      }
      public java.lang.String rowContainer() {
        return "GD0PFO4BLL";
      }
    }
    ;
  }
  private static class CSSInitializer {
    static {
      _instance0.CSSInitializer();
    }
    static org.uberfire.ext.layout.editor.client.resources.LayoutEditorCss get() {
      return CSS;
    }
  }
  public org.uberfire.ext.layout.editor.client.resources.LayoutEditorCss CSS() {
    return CSSInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static org.uberfire.ext.layout.editor.client.resources.LayoutEditorCss CSS;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      CSS(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("CSS", CSS());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'CSS': return this.@org.uberfire.ext.layout.editor.client.resources.WebAppResource::CSS()();
    }
    return null;
  }-*/;
}
