package org.uberfire.ext.plugin.client.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class WebAppResource_default_InlineClientBundleGenerator implements org.uberfire.ext.plugin.client.resources.WebAppResource {
  private static WebAppResource_default_InlineClientBundleGenerator _instance0 = new WebAppResource_default_InlineClientBundleGenerator();
  private void CSSInitializer() {
    CSS = new org.uberfire.ext.plugin.client.resources.PluginCss() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GJIO14PDFK{position:" + ("absolute")  + ";height:" + ("auto")  + ";bottom:" + ("0")  + ";top:" + ("0")  + ";right:" + ("0")  + ";left:" + ("0")  + ";margin:" + ("14px"+ " " +"15px")  + ";min-height:" + ("300px")  + ";}.GJIO14PDEK{display:" + ("block")  + ";height:" + ("100%")  + ";width:") + (("50%")  + ";}.GJIO14PDDK{float:" + ("left")  + ";margin-top:" + ("5px")  + ";margin-left:" + ("20px")  + ";}.GJIO14PDNK{width:" + ("100%")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#c0c0c0")  + ";box-shadow:" + ("inset"+ " " +"0"+ " " +"1px"+ " " +"2px"+ " " +"#e4e4e4")  + ";}.GJIO14PDLK{height:" + ("25%")  + ";position:" + ("absolute")  + ";top:" + ("-6px")  + ";}.GJIO14PDBK{height:" + ("75%") ) + (";position:" + ("absolute")  + ";bottom:" + ("-6px")  + ";}.GJIO14PDMK{height:" + ("75%")  + ";position:" + ("absolute")  + ";top:" + ("-6px")  + ";}.GJIO14PDCK{height:" + ("25%")  + ";position:" + ("absolute")  + ";bottom:" + ("-6px")  + ";}.GJIO14PDKK{position:" + ("absolute")  + ";left:" + ("-5px")  + ";}.GJIO14PDJK{position:") + (("absolute")  + ";right:" + ("-5px")  + ";}.GJIO14PDIK{width:" + ("8px")  + ";height:" + ("100%")  + ";padding:" + ("5px"+ " " +"0")  + ";cursor:" + ("col-resize")  + ";position:" + ("absolute")  + ";top:" + ("-5px")  + ";right:" + ("0")  + ";background:" + ("url('" + WebAppResource_default_InlineClientBundleGenerator.this.handleVertical().getSafeUri().asString() + "')"+ " " +"3px"+ " " +"50%"+ " " +"no-repeat")  + ";}.GJIO14PDHK{width:" + ("100%") ) + (";height:" + ("8px")  + ";padding:" + ("0"+ " " +"1px")  + ";cursor:" + ("row-resize")  + ";position:" + ("absolute")  + ";top:" + ("0")  + ";right:" + ("0")  + ";background:" + ("url('" + WebAppResource_default_InlineClientBundleGenerator.this.handleHorizontal().getSafeUri().asString() + "')"+ " " +"50%"+ " " +"3px"+ " " +"no-repeat")  + ";}.GJIO14PDOK{border:" + ("solid"+ " " +"1px"+ " " +"#f1f1f1")  + ";background:" + ("#fff")  + ";display:" + ("inline-block")  + ";height:") + (("22px")  + ";padding:" + ("0"+ " " +"6px")  + ";line-height:" + ("22px")  + ";position:" + ("absolute")  + ";top:" + ("7px")  + ";left:" + ("6px")  + ";text-align:" + ("center")  + ";font-size:" + ("12px")  + ";color:" + ("#777")  + ";border-radius:" + ("1px")  + ";z-index:" + ("30") ) + (";}.GJIO14PDGK{width:" + ("100%")  + ";height:" + ("100%")  + ";}")) : ((".GJIO14PDFK{position:" + ("absolute")  + ";height:" + ("auto")  + ";bottom:" + ("0")  + ";top:" + ("0")  + ";left:" + ("0")  + ";right:" + ("0")  + ";margin:" + ("14px"+ " " +"15px")  + ";min-height:" + ("300px")  + ";}.GJIO14PDEK{display:" + ("block")  + ";height:" + ("100%")  + ";width:") + (("50%")  + ";}.GJIO14PDDK{float:" + ("right")  + ";margin-top:" + ("5px")  + ";margin-right:" + ("20px")  + ";}.GJIO14PDNK{width:" + ("100%")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#c0c0c0")  + ";box-shadow:" + ("inset"+ " " +"0"+ " " +"1px"+ " " +"2px"+ " " +"#e4e4e4")  + ";}.GJIO14PDLK{height:" + ("25%")  + ";position:" + ("absolute")  + ";top:" + ("-6px")  + ";}.GJIO14PDBK{height:" + ("75%") ) + (";position:" + ("absolute")  + ";bottom:" + ("-6px")  + ";}.GJIO14PDMK{height:" + ("75%")  + ";position:" + ("absolute")  + ";top:" + ("-6px")  + ";}.GJIO14PDCK{height:" + ("25%")  + ";position:" + ("absolute")  + ";bottom:" + ("-6px")  + ";}.GJIO14PDKK{position:" + ("absolute")  + ";right:" + ("-5px")  + ";}.GJIO14PDJK{position:") + (("absolute")  + ";left:" + ("-5px")  + ";}.GJIO14PDIK{width:" + ("8px")  + ";height:" + ("100%")  + ";padding:" + ("5px"+ " " +"0")  + ";cursor:" + ("col-resize")  + ";position:" + ("absolute")  + ";top:" + ("-5px")  + ";left:" + ("0")  + ";background:" + ("url('" + WebAppResource_default_InlineClientBundleGenerator.this.handleVertical().getSafeUri().asString() + "')"+ " " +"3px"+ " " +"50%"+ " " +"no-repeat")  + ";}.GJIO14PDHK{width:" + ("100%") ) + (";height:" + ("8px")  + ";padding:" + ("0"+ " " +"1px")  + ";cursor:" + ("row-resize")  + ";position:" + ("absolute")  + ";top:" + ("0")  + ";left:" + ("0")  + ";background:" + ("url('" + WebAppResource_default_InlineClientBundleGenerator.this.handleHorizontal().getSafeUri().asString() + "')"+ " " +"50%"+ " " +"3px"+ " " +"no-repeat")  + ";}.GJIO14PDOK{border:" + ("solid"+ " " +"1px"+ " " +"#f1f1f1")  + ";background:" + ("#fff")  + ";display:" + ("inline-block")  + ";height:") + (("22px")  + ";padding:" + ("0"+ " " +"6px")  + ";line-height:" + ("22px")  + ";position:" + ("absolute")  + ";top:" + ("7px")  + ";right:" + ("6px")  + ";text-align:" + ("center")  + ";font-size:" + ("12px")  + ";color:" + ("#777")  + ";border-radius:" + ("1px")  + ";z-index:" + ("30") ) + (";}.GJIO14PDGK{width:" + ("100%")  + ";height:" + ("100%")  + ";}"));
      }
      public java.lang.String bottom() {
        return "GJIO14PDBK";
      }
      public java.lang.String bottomInverted() {
        return "GJIO14PDCK";
      }
      public java.lang.String buttonAddParameter() {
        return "GJIO14PDDK";
      }
      public java.lang.String column() {
        return "GJIO14PDEK";
      }
      public java.lang.String content() {
        return "GJIO14PDFK";
      }
      public java.lang.String editorWrapping() {
        return "GJIO14PDGK";
      }
      public java.lang.String handlerHorizontal() {
        return "GJIO14PDHK";
      }
      public java.lang.String handlerVertical() {
        return "GJIO14PDIK";
      }
      public java.lang.String left() {
        return "GJIO14PDJK";
      }
      public java.lang.String right() {
        return "GJIO14PDKK";
      }
      public java.lang.String top() {
        return "GJIO14PDLK";
      }
      public java.lang.String topInverted() {
        return "GJIO14PDMK";
      }
      public java.lang.String window() {
        return "GJIO14PDNK";
      }
      public java.lang.String windowLabel() {
        return "GJIO14PDOK";
      }
    }
    ;
  }
  private static class CSSInitializer {
    static {
      _instance0.CSSInitializer();
    }
    static org.uberfire.ext.plugin.client.resources.PluginCss get() {
      return CSS;
    }
  }
  public org.uberfire.ext.plugin.client.resources.PluginCss CSS() {
    return CSSInitializer.get();
  }
  private void handleHorizontalInitializer() {
    handleHorizontal = // jar:file:/home/wsiqueir/.m2/repository/org/uberfire/uberfire-runtime-plugins-client/0.0.0/uberfire-runtime-plugins-client-0.0.0-sources.jar!/org/uberfire/ext/plugin/client/resources/images/handle-h.png
    new com.google.gwt.resources.client.impl.DataResourcePrototype(
      "handleHorizontal",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAA8AAAAECAYAAABREWWJAAAABHNCSVQICAgIfAhkiAAAAAlwSFlzAAALEgAACxIB0t1+/AAAABx0RVh0U29mdHdhcmUAQWRvYmUgRmlyZXdvcmtzIENTNAay06AAAAAYdEVYdENyZWF0aW9uIFRpbWUAMTQuMDEuMjAxMNh/L3IAAAAgSURBVAiZYzx9+vR/BjIB4////8nWzHLmzBly9VJmMwALIg3EdKSVwwAAAABJRU5ErkJggg==")
    );
  }
  private static class handleHorizontalInitializer {
    static {
      _instance0.handleHorizontalInitializer();
    }
    static com.google.gwt.resources.client.DataResource get() {
      return handleHorizontal;
    }
  }
  public com.google.gwt.resources.client.DataResource handleHorizontal() {
    return handleHorizontalInitializer.get();
  }
  private void handleVerticalInitializer() {
    handleVertical = // jar:file:/home/wsiqueir/.m2/repository/org/uberfire/uberfire-runtime-plugins-client/0.0.0/uberfire-runtime-plugins-client-0.0.0-sources.jar!/org/uberfire/ext/plugin/client/resources/images/handle-v.png
    new com.google.gwt.resources.client.impl.DataResourcePrototype(
      "handleVertical",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAQAAAAPCAYAAADDNm69AAAABHNCSVQICAgIfAhkiAAAAAlwSFlzAAALEgAACxIB0t1+/AAAABx0RVh0U29mdHdhcmUAQWRvYmUgRmlyZXdvcmtzIENTNAay06AAAAAYdEVYdENyZWF0aW9uIFRpbWUAMTQuMDEuMjAxMNh/L3IAAAAaSURBVAiZYzh9+vT//////4fRTAxoYFgLAAA44w7VNg0kZQAAAABJRU5ErkJggg==")
    );
  }
  private static class handleVerticalInitializer {
    static {
      _instance0.handleVerticalInitializer();
    }
    static com.google.gwt.resources.client.DataResource get() {
      return handleVertical;
    }
  }
  public com.google.gwt.resources.client.DataResource handleVertical() {
    return handleVerticalInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static org.uberfire.ext.plugin.client.resources.PluginCss CSS;
  private static com.google.gwt.resources.client.DataResource handleHorizontal;
  private static com.google.gwt.resources.client.DataResource handleVertical;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      CSS(), 
      handleHorizontal(), 
      handleVertical(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("CSS", CSS());
        resourceMap.put("handleHorizontal", handleHorizontal());
        resourceMap.put("handleVertical", handleVertical());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'CSS': return this.@org.uberfire.ext.plugin.client.resources.WebAppResource::CSS()();
      case 'handleHorizontal': return this.@org.uberfire.ext.plugin.client.resources.WebAppResource::handleHorizontal()();
      case 'handleVertical': return this.@org.uberfire.ext.plugin.client.resources.WebAppResource::handleVertical()();
    }
    return null;
  }-*/;
}
