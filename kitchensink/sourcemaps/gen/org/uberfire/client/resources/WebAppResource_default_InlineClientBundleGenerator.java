package org.uberfire.client.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class WebAppResource_default_InlineClientBundleGenerator implements org.uberfire.client.resources.WebAppResource {
  private static WebAppResource_default_InlineClientBundleGenerator _instance0 = new WebAppResource_default_InlineClientBundleGenerator();
  private void CSSInitializer() {
    CSS = new org.uberfire.client.resources.DocksCss() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GD0PFO4BJK{margin-top:" + ("5px")  + ";margin-right:" + ("2px")  + ";margin-left:" + ("2px")  + ";}.GD0PFO4BKK,.GD0PFO4BKK i{height:" + ("100%")  + ";}.GD0PFO4BHK{display:" + ("none")  + ";}.GD0PFO4BGK{border:" + ("1px"+ " " +"solid"+ " " +"#ddd")  + ";}.GD0PFO4BFK{border-left:" + ("1px"+ " " +"solid"+ " " +"#ddd")  + ";border-right:" + ("1px"+ " " +"solid"+ " " +"#ddd")  + ";text-align:" + ("center")  + ";}.GD0PFO4BKJ{height:" + ("100%")  + ";width:") + (("100%")  + ";}.GD0PFO4BEK{height:" + ("36px")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#ddd")  + ";}.GD0PFO4BPJ{height:" + ("100%")  + ";width:" + ("100%")  + ";}.GD0PFO4BLK{margin-right:" + ("5px")  + ";margin-top:" + ("5px")  + ";}.GD0PFO4BDK{float:" + ("right")  + ";margin-right:" + ("15px")  + ";margin-top:" + ("10px")  + ";margin-bottom:" + ("0") ) + (";}.GD0PFO4BNJ{float:" + ("left")  + ";margin-top:" + ("6px")  + ";margin-left:" + ("15px")  + ";}.GD0PFO4BBK{float:" + ("right")  + ";margin-right:" + ("15px")  + ";margin-top:" + ("10px")  + ";margin-bottom:" + ("0")  + ";}.GD0PFO4BLJ{float:" + ("left")  + ";margin-top:" + ("6px")  + ";margin-left:" + ("15px")  + ";}.GD0PFO4BCK{float:") + (("right")  + ";margin-right:" + ("15px")  + ";margin-top:" + ("10px")  + ";margin-bottom:" + ("0")  + ";}.GD0PFO4BMJ{float:" + ("left")  + ";margin-left:" + ("15px")  + ";margin-top:" + ("6px")  + ";}.GD0PFO4BJJ{margin-right:" + ("3px")  + ";margin-left:" + ("3px")  + ";}.GD0PFO4BIK{background-color:" + ("#ddd")  + ";float:" + ("left") ) + (";}.GD0PFO4BOJ{float:" + ("left")  + ";margin-top:" + ("6px")  + ";margin-left:" + ("5px")  + ";}")) : ((".GD0PFO4BJK{margin-top:" + ("5px")  + ";margin-left:" + ("2px")  + ";margin-right:" + ("2px")  + ";}.GD0PFO4BKK,.GD0PFO4BKK i{height:" + ("100%")  + ";}.GD0PFO4BHK{display:" + ("none")  + ";}.GD0PFO4BGK{border:" + ("1px"+ " " +"solid"+ " " +"#ddd")  + ";}.GD0PFO4BFK{border-right:" + ("1px"+ " " +"solid"+ " " +"#ddd")  + ";border-left:" + ("1px"+ " " +"solid"+ " " +"#ddd")  + ";text-align:" + ("center")  + ";}.GD0PFO4BKJ{height:" + ("100%")  + ";width:") + (("100%")  + ";}.GD0PFO4BEK{height:" + ("36px")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#ddd")  + ";}.GD0PFO4BPJ{height:" + ("100%")  + ";width:" + ("100%")  + ";}.GD0PFO4BLK{margin-left:" + ("5px")  + ";margin-top:" + ("5px")  + ";}.GD0PFO4BDK{float:" + ("left")  + ";margin-left:" + ("15px")  + ";margin-top:" + ("10px")  + ";margin-bottom:" + ("0") ) + (";}.GD0PFO4BNJ{float:" + ("right")  + ";margin-top:" + ("6px")  + ";margin-right:" + ("15px")  + ";}.GD0PFO4BBK{float:" + ("left")  + ";margin-left:" + ("15px")  + ";margin-top:" + ("10px")  + ";margin-bottom:" + ("0")  + ";}.GD0PFO4BLJ{float:" + ("right")  + ";margin-top:" + ("6px")  + ";margin-right:" + ("15px")  + ";}.GD0PFO4BCK{float:") + (("left")  + ";margin-left:" + ("15px")  + ";margin-top:" + ("10px")  + ";margin-bottom:" + ("0")  + ";}.GD0PFO4BMJ{float:" + ("right")  + ";margin-right:" + ("15px")  + ";margin-top:" + ("6px")  + ";}.GD0PFO4BJJ{margin-left:" + ("3px")  + ";margin-right:" + ("3px")  + ";}.GD0PFO4BIK{background-color:" + ("#ddd")  + ";float:" + ("right") ) + (";}.GD0PFO4BOJ{float:" + ("right")  + ";margin-top:" + ("6px")  + ";margin-right:" + ("5px")  + ";}"));
      }
      public java.lang.String buttonFocused() {
        return "GD0PFO4BJJ";
      }
      public java.lang.String dockExpanded() {
        return "GD0PFO4BKJ";
      }
      public java.lang.String dockExpandedButtonEast() {
        return "GD0PFO4BLJ";
      }
      public java.lang.String dockExpandedButtonSouth() {
        return "GD0PFO4BMJ";
      }
      public java.lang.String dockExpandedButtonWest() {
        return "GD0PFO4BNJ";
      }
      public java.lang.String dockExpandedContentButton() {
        return "GD0PFO4BOJ";
      }
      public java.lang.String dockExpandedContentPanel() {
        return "GD0PFO4BPJ";
      }
      public java.lang.String dockExpandedContentPanelSouth() {
        return "GD0PFO4BAK";
      }
      public java.lang.String dockExpandedLabelEast() {
        return "GD0PFO4BBK";
      }
      public java.lang.String dockExpandedLabelSouth() {
        return "GD0PFO4BCK";
      }
      public java.lang.String dockExpandedLabelWest() {
        return "GD0PFO4BDK";
      }
      public java.lang.String dockExpandedTitlePanel() {
        return "GD0PFO4BEK";
      }
      public java.lang.String gradientBottomTop() {
        return "GD0PFO4BFK";
      }
      public java.lang.String gradientTopBottom() {
        return "GD0PFO4BGK";
      }
      public java.lang.String hideElement() {
        return "GD0PFO4BHK";
      }
      public java.lang.String resizableBar() {
        return "GD0PFO4BIK";
      }
      public java.lang.String sideDockItem() {
        return "GD0PFO4BJK";
      }
      public java.lang.String singleDockItem() {
        return "GD0PFO4BKK";
      }
      public java.lang.String southDockItem() {
        return "GD0PFO4BLK";
      }
    }
    ;
  }
  private static class CSSInitializer {
    static {
      _instance0.CSSInitializer();
    }
    static org.uberfire.client.resources.DocksCss get() {
      return CSS;
    }
  }
  public org.uberfire.client.resources.DocksCss CSS() {
    return CSSInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static org.uberfire.client.resources.DocksCss CSS;
  
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
      case 'CSS': return this.@org.uberfire.client.resources.WebAppResource::CSS()();
    }
    return null;
  }-*/;
}
