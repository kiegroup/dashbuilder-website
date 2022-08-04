package org.dashbuilder.displayer.client.widgets;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class DataSetLookupEditorView_BinderImpl_GenBundle_default_InlineClientBundleGenerator implements org.dashbuilder.displayer.client.widgets.DataSetLookupEditorView_BinderImpl_GenBundle {
  private static DataSetLookupEditorView_BinderImpl_GenBundle_default_InlineClientBundleGenerator _instance0 = new DataSetLookupEditorView_BinderImpl_GenBundle_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new org.dashbuilder.displayer.client.widgets.DataSetLookupEditorView_BinderImpl_GenCss_style() {
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
        return (".GD0PFO4BHQ{color:" + ("red")  + ";}.GD0PFO4BGQ{font-weight:" + ("bold")  + ";}.GD0PFO4BEQ{padding:" + ("3px")  + ";}.GD0PFO4BFQ{width:" + ("200px")  + ";padding:" + ("10px")  + ";background:" + ("#ddd")  + ";border-radius:" + ("5px")  + ";}");
      }
      public java.lang.String cellPaddingPanel() {
        return "GD0PFO4BEQ";
      }
      public java.lang.String groupDatePanel() {
        return "GD0PFO4BFQ";
      }
      public java.lang.String sectionLabel() {
        return "GD0PFO4BGQ";
      }
      public java.lang.String statusLabel() {
        return "GD0PFO4BHQ";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static org.dashbuilder.displayer.client.widgets.DataSetLookupEditorView_BinderImpl_GenCss_style get() {
      return style;
    }
  }
  public org.dashbuilder.displayer.client.widgets.DataSetLookupEditorView_BinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static org.dashbuilder.displayer.client.widgets.DataSetLookupEditorView_BinderImpl_GenCss_style style;
  
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
      case 'style': return this.@org.dashbuilder.displayer.client.widgets.DataSetLookupEditorView_BinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
