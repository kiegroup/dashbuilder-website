package org.dashbuilder.common.client.editor.list;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class DropDownEditorView_BinderImpl_GenBundle_default_InlineClientBundleGenerator implements org.dashbuilder.common.client.editor.list.DropDownEditorView_BinderImpl_GenBundle {
  private static DropDownEditorView_BinderImpl_GenBundle_default_InlineClientBundleGenerator _instance0 = new DropDownEditorView_BinderImpl_GenBundle_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new org.dashbuilder.common.client.editor.list.DropDownEditorView_BinderImpl_GenCss_style() {
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
        return (".GD0PFO4BEP{border:" + ("none")  + ";}.GD0PFO4BFP{border-style:" + ("solid")  + ";border-color:" + ("red")  + ";border-width:" + ("1px")  + ";}");
      }
      public java.lang.String errorPanel() {
        return "GD0PFO4BEP";
      }
      public java.lang.String errorPanelWithError() {
        return "GD0PFO4BFP";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static org.dashbuilder.common.client.editor.list.DropDownEditorView_BinderImpl_GenCss_style get() {
      return style;
    }
  }
  public org.dashbuilder.common.client.editor.list.DropDownEditorView_BinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static org.dashbuilder.common.client.editor.list.DropDownEditorView_BinderImpl_GenCss_style style;
  
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
      case 'style': return this.@org.dashbuilder.common.client.editor.list.DropDownEditorView_BinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
