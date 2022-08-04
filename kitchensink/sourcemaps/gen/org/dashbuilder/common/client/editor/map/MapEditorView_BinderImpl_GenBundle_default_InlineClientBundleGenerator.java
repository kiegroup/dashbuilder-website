package org.dashbuilder.common.client.editor.map;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class MapEditorView_BinderImpl_GenBundle_default_InlineClientBundleGenerator implements org.dashbuilder.common.client.editor.map.MapEditorView_BinderImpl_GenBundle {
  private static MapEditorView_BinderImpl_GenBundle_default_InlineClientBundleGenerator _instance0 = new MapEditorView_BinderImpl_GenBundle_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new org.dashbuilder.common.client.editor.map.MapEditorView_BinderImpl_GenCss_style() {
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
        return "style";
      }
      public String getText() {
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GD0PFO4BOP{border:" + ("1px"+ " " +"solid"+ " " +"red")  + ";}.GD0PFO4BAQ{width:" + ("100%")  + ";}.GD0PFO4BPP{width:" + ("100%")  + ";height:" + ("200px")  + ";font-size:" + ("small")  + ";overflow:" + ("auto")  + ";}.GD0PFO4BNP{width:" + ("100%")  + ";text-align:" + ("left")  + ";}")) : ((".GD0PFO4BOP{border:" + ("1px"+ " " +"solid"+ " " +"red")  + ";}.GD0PFO4BAQ{width:" + ("100%")  + ";}.GD0PFO4BPP{width:" + ("100%")  + ";height:" + ("200px")  + ";font-size:" + ("small")  + ";overflow:" + ("auto")  + ";}.GD0PFO4BNP{width:" + ("100%")  + ";text-align:" + ("right")  + ";}"));
      }
      public java.lang.String addButtonPanel() {
        return "GD0PFO4BNP";
      }
      public java.lang.String errorPanelError() {
        return "GD0PFO4BOP";
      }
      public java.lang.String grid() {
        return "GD0PFO4BPP";
      }
      public java.lang.String gridPanel() {
        return "GD0PFO4BAQ";
      }
      public java.lang.String mainPanel() {
        return "GD0PFO4BBQ";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static org.dashbuilder.common.client.editor.map.MapEditorView_BinderImpl_GenCss_style get() {
      return style;
    }
  }
  public org.dashbuilder.common.client.editor.map.MapEditorView_BinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static org.dashbuilder.common.client.editor.map.MapEditorView_BinderImpl_GenCss_style style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'style': return this.@org.dashbuilder.common.client.editor.map.MapEditorView_BinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
