package org.uberfire.ext.plugin.client.perspective.editor;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class PerspectiveEditorView_PerspectiveEditorViewBinderImpl_GenBundle_default_InlineClientBundleGenerator implements org.uberfire.ext.plugin.client.perspective.editor.PerspectiveEditorView_PerspectiveEditorViewBinderImpl_GenBundle {
  private static PerspectiveEditorView_PerspectiveEditorViewBinderImpl_GenBundle_default_InlineClientBundleGenerator _instance0 = new PerspectiveEditorView_PerspectiveEditorViewBinderImpl_GenBundle_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new org.uberfire.ext.plugin.client.perspective.editor.PerspectiveEditorView_PerspectiveEditorViewBinderImpl_GenCss_style() {
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
        return (".GD0PFO4BES,.GD0PFO4BFS{height:" + ("100%")  + ";}");
      }
      public java.lang.String content() {
        return "GD0PFO4BES";
      }
      public java.lang.String layout() {
        return "GD0PFO4BFS";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static org.uberfire.ext.plugin.client.perspective.editor.PerspectiveEditorView_PerspectiveEditorViewBinderImpl_GenCss_style get() {
      return style;
    }
  }
  public org.uberfire.ext.plugin.client.perspective.editor.PerspectiveEditorView_PerspectiveEditorViewBinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static org.uberfire.ext.plugin.client.perspective.editor.PerspectiveEditorView_PerspectiveEditorViewBinderImpl_GenCss_style style;
  
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
      case 'style': return this.@org.uberfire.ext.plugin.client.perspective.editor.PerspectiveEditorView_PerspectiveEditorViewBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
