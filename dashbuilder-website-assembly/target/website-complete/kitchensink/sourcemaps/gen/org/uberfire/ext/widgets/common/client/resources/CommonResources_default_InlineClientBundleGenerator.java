package org.uberfire.ext.widgets.common.client.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class CommonResources_default_InlineClientBundleGenerator implements org.uberfire.ext.widgets.common.client.resources.CommonResources {
  private static CommonResources_default_InlineClientBundleGenerator _instance0 = new CommonResources_default_InlineClientBundleGenerator();
  private void CSSInitializer() {
    CSS = new org.uberfire.ext.widgets.common.client.resources.CommonCss() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GD0PFO4BFO{height:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().whiteTopLeftCorner()).getHeight() + "px")  + ";width:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().whiteTopLeftCorner()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (CommonResources_default_InlineClientBundleGenerator.this.images().whiteTopLeftCorner()).getSafeUri().asString() + "\") -" + (CommonResources_default_InlineClientBundleGenerator.this.images().whiteTopLeftCorner()).getLeft() + "px -" + (CommonResources_default_InlineClientBundleGenerator.this.images().whiteTopLeftCorner()).getTop() + "px  no-repeat")  + ";height:" + ("4px")  + ";width:" + ("4px")  + ";}.GD0PFO4BGO{height:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().whiteTopRightCorner()).getHeight() + "px")  + ";width:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().whiteTopRightCorner()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (CommonResources_default_InlineClientBundleGenerator.this.images().whiteTopRightCorner()).getSafeUri().asString() + "\") -" + (CommonResources_default_InlineClientBundleGenerator.this.images().whiteTopRightCorner()).getLeft() + "px -" + (CommonResources_default_InlineClientBundleGenerator.this.images().whiteTopRightCorner()).getTop() + "px  no-repeat")  + ";height:") + (("4px")  + ";width:" + ("4px")  + ";}.GD0PFO4BPN{height:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().whiteBottomLeftCorner()).getHeight() + "px")  + ";width:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().whiteBottomLeftCorner()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (CommonResources_default_InlineClientBundleGenerator.this.images().whiteBottomLeftCorner()).getSafeUri().asString() + "\") -" + (CommonResources_default_InlineClientBundleGenerator.this.images().whiteBottomLeftCorner()).getLeft() + "px -" + (CommonResources_default_InlineClientBundleGenerator.this.images().whiteBottomLeftCorner()).getTop() + "px  no-repeat")  + ";height:" + ("4px")  + ";width:" + ("4px")  + ";}.GD0PFO4BAO{height:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().whiteBottomRightCorner()).getHeight() + "px")  + ";width:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().whiteBottomRightCorner()).getWidth() + "px")  + ";overflow:" + ("hidden") ) + (";background:" + ("url(\"" + (CommonResources_default_InlineClientBundleGenerator.this.images().whiteBottomRightCorner()).getSafeUri().asString() + "\") -" + (CommonResources_default_InlineClientBundleGenerator.this.images().whiteBottomRightCorner()).getLeft() + "px -" + (CommonResources_default_InlineClientBundleGenerator.this.images().whiteBottomRightCorner()).getTop() + "px  no-repeat")  + ";height:" + ("4px")  + ";width:" + ("4px")  + ";}.GD0PFO4BON{border-bottom:" + ("1px"+ " " +"solid"+ " " +"#bbb")  + ";height:" + ("3px")  + ";width:" + ("100%")  + ";}.GD0PFO4BEO{border-top:" + ("1px"+ " " +"solid"+ " " +"#bbb")  + ";height:" + ("3px")  + ";width:" + ("100%")  + ";}.GD0PFO4BCO{border-right:" + ("1px"+ " " +"solid"+ " " +"#bbb")  + ";height:") + (("100%")  + ";width:" + ("3px")  + ";}.GD0PFO4BDO{border-left:" + ("1px"+ " " +"solid"+ " " +"#bbb")  + ";height:" + ("100%")  + ";width:" + ("3px")  + ";}.GD0PFO4BJN{height:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().greyTopLeftCorner()).getHeight() + "px")  + ";width:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().greyTopLeftCorner()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyTopLeftCorner()).getSafeUri().asString() + "\") -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyTopLeftCorner()).getLeft() + "px -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyTopLeftCorner()).getTop() + "px  no-repeat")  + ";height:" + ("4px")  + ";width:" + ("4px") ) + (";}.GD0PFO4BKN{height:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().greyTopRightCorner()).getHeight() + "px")  + ";width:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().greyTopRightCorner()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyTopRightCorner()).getSafeUri().asString() + "\") -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyTopRightCorner()).getLeft() + "px -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyTopRightCorner()).getTop() + "px  no-repeat")  + ";height:" + ("4px")  + ";width:" + ("4px")  + ";}.GD0PFO4BDN{height:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().greyBottomLeftCorner()).getHeight() + "px")  + ";width:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().greyBottomLeftCorner()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyBottomLeftCorner()).getSafeUri().asString() + "\") -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyBottomLeftCorner()).getLeft() + "px -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyBottomLeftCorner()).getTop() + "px  no-repeat")  + ";height:") + (("4px")  + ";width:" + ("4px")  + ";}.GD0PFO4BEN{height:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().greyBottomRightCorner()).getHeight() + "px")  + ";width:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().greyBottomRightCorner()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyBottomRightCorner()).getSafeUri().asString() + "\") -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyBottomRightCorner()).getLeft() + "px -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyBottomRightCorner()).getTop() + "px  no-repeat")  + ";height:" + ("4px")  + ";width:" + ("4px")  + ";}.GD0PFO4BCN{height:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().greyBottom()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyBottom()).getSafeUri().asString() + "\") -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyBottom()).getLeft() + "px -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyBottom()).getTop() + "px  repeat-x") ) + (";height:" + ("4px")  + ";width:" + ("100%")  + ";}.GD0PFO4BIN{height:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().greyTop()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyTop()).getSafeUri().asString() + "\") -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyTop()).getLeft() + "px -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyTop()).getTop() + "px  repeat-x")  + ";height:" + ("4px")  + ";width:" + ("100%")  + ";}.GD0PFO4BGN{width:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().greySideLeft()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (CommonResources_default_InlineClientBundleGenerator.this.images().greySideLeft()).getSafeUri().asString() + "\") -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greySideLeft()).getLeft() + "px -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greySideLeft()).getTop() + "px  repeat-y")  + ";height:") + (("100%")  + ";width:" + ("4px")  + ";}.GD0PFO4BHN{width:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().greySideRight()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (CommonResources_default_InlineClientBundleGenerator.this.images().greySideRight()).getSafeUri().asString() + "\") -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greySideRight()).getLeft() + "px -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greySideRight()).getTop() + "px  repeat-y")  + ";height:" + ("100%")  + ";width:" + ("4px")  + ";}.GD0PFO4BFN{background:" + ("#e3e3e3")  + ";}.GD0PFO4BLM{border:" + ("none")  + " !important;width:" + ("95%")  + ";}.GD0PFO4BKM{width:" + ("300px") ) + (";}.GD0PFO4BKM span{padding-right:" + ("15px")  + ";vertical-align:" + ("text-top")  + ";}.GD0PFO4BKM .spinner{margin-top:" + ("-3px")  + ";}.GD0PFO4BMN{height:" + ("32px")  + ";vertical-align:" + ("middle")  + ";display:" + ("table-cell")  + ";}.GD0PFO4BNN{font-size:" + ("smaller")  + ";font-style:" + ("italic")  + ";}.GD0PFO4BOM td div{white-space:" + ("nowrap")  + ";overflow:" + ("hidden")  + ";text-overflow:") + (("ellipsis")  + ";}.GD0PFO4BAN thead th{overflow:" + ("hidden")  + ";text-overflow:" + ("ellipsis")  + ";}.GD0PFO4BPM,.GD0PFO4BBN:first-child td{border-top:" + ("none")  + ";}.GD0PFO4BNM{background-color:" + ("#fff")  + ";padding:" + ("5px")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#d1d1d1")  + ";z-index:" + ("2000")  + ";}.GD0PFO4BNM .checkbox{margin-top:" + ("2px")  + ";margin-bottom:" + ("2px")  + ";}.btn-file{position:" + ("relative") ) + (";overflow:" + ("hidden")  + ";}.btn-file input[type=\"file\"]{position:" + ("absolute")  + ";top:" + ("0")  + ";left:" + ("0")  + ";min-width:" + ("100%")  + ";min-height:" + ("100%")  + ";font-size:" + ("999px")  + ";text-align:" + ("left")  + ";filter:" + ("alpha(opacity=0)")  + ";opacity:" + ("0")  + ";outline:") + (("none")  + ";background:" + ("white")  + ";cursor:" + ("inherit")  + ";display:" + ("block")  + ";}.btn-file>i+span,.btn-file>span+i{padding-right:" + ("2px")  + ";}.GD0PFO4BLN{overflow-wrap:" + ("break-word")  + ";}")) : ((".GD0PFO4BFO{height:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().whiteTopLeftCorner()).getHeight() + "px")  + ";width:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().whiteTopLeftCorner()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (CommonResources_default_InlineClientBundleGenerator.this.images().whiteTopLeftCorner()).getSafeUri().asString() + "\") -" + (CommonResources_default_InlineClientBundleGenerator.this.images().whiteTopLeftCorner()).getLeft() + "px -" + (CommonResources_default_InlineClientBundleGenerator.this.images().whiteTopLeftCorner()).getTop() + "px  no-repeat")  + ";height:" + ("4px")  + ";width:" + ("4px")  + ";}.GD0PFO4BGO{height:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().whiteTopRightCorner()).getHeight() + "px")  + ";width:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().whiteTopRightCorner()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (CommonResources_default_InlineClientBundleGenerator.this.images().whiteTopRightCorner()).getSafeUri().asString() + "\") -" + (CommonResources_default_InlineClientBundleGenerator.this.images().whiteTopRightCorner()).getLeft() + "px -" + (CommonResources_default_InlineClientBundleGenerator.this.images().whiteTopRightCorner()).getTop() + "px  no-repeat")  + ";height:") + (("4px")  + ";width:" + ("4px")  + ";}.GD0PFO4BPN{height:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().whiteBottomLeftCorner()).getHeight() + "px")  + ";width:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().whiteBottomLeftCorner()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (CommonResources_default_InlineClientBundleGenerator.this.images().whiteBottomLeftCorner()).getSafeUri().asString() + "\") -" + (CommonResources_default_InlineClientBundleGenerator.this.images().whiteBottomLeftCorner()).getLeft() + "px -" + (CommonResources_default_InlineClientBundleGenerator.this.images().whiteBottomLeftCorner()).getTop() + "px  no-repeat")  + ";height:" + ("4px")  + ";width:" + ("4px")  + ";}.GD0PFO4BAO{height:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().whiteBottomRightCorner()).getHeight() + "px")  + ";width:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().whiteBottomRightCorner()).getWidth() + "px")  + ";overflow:" + ("hidden") ) + (";background:" + ("url(\"" + (CommonResources_default_InlineClientBundleGenerator.this.images().whiteBottomRightCorner()).getSafeUri().asString() + "\") -" + (CommonResources_default_InlineClientBundleGenerator.this.images().whiteBottomRightCorner()).getLeft() + "px -" + (CommonResources_default_InlineClientBundleGenerator.this.images().whiteBottomRightCorner()).getTop() + "px  no-repeat")  + ";height:" + ("4px")  + ";width:" + ("4px")  + ";}.GD0PFO4BON{border-bottom:" + ("1px"+ " " +"solid"+ " " +"#bbb")  + ";height:" + ("3px")  + ";width:" + ("100%")  + ";}.GD0PFO4BEO{border-top:" + ("1px"+ " " +"solid"+ " " +"#bbb")  + ";height:" + ("3px")  + ";width:" + ("100%")  + ";}.GD0PFO4BCO{border-left:" + ("1px"+ " " +"solid"+ " " +"#bbb")  + ";height:") + (("100%")  + ";width:" + ("3px")  + ";}.GD0PFO4BDO{border-right:" + ("1px"+ " " +"solid"+ " " +"#bbb")  + ";height:" + ("100%")  + ";width:" + ("3px")  + ";}.GD0PFO4BJN{height:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().greyTopLeftCorner()).getHeight() + "px")  + ";width:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().greyTopLeftCorner()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyTopLeftCorner()).getSafeUri().asString() + "\") -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyTopLeftCorner()).getLeft() + "px -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyTopLeftCorner()).getTop() + "px  no-repeat")  + ";height:" + ("4px")  + ";width:" + ("4px") ) + (";}.GD0PFO4BKN{height:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().greyTopRightCorner()).getHeight() + "px")  + ";width:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().greyTopRightCorner()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyTopRightCorner()).getSafeUri().asString() + "\") -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyTopRightCorner()).getLeft() + "px -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyTopRightCorner()).getTop() + "px  no-repeat")  + ";height:" + ("4px")  + ";width:" + ("4px")  + ";}.GD0PFO4BDN{height:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().greyBottomLeftCorner()).getHeight() + "px")  + ";width:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().greyBottomLeftCorner()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyBottomLeftCorner()).getSafeUri().asString() + "\") -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyBottomLeftCorner()).getLeft() + "px -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyBottomLeftCorner()).getTop() + "px  no-repeat")  + ";height:") + (("4px")  + ";width:" + ("4px")  + ";}.GD0PFO4BEN{height:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().greyBottomRightCorner()).getHeight() + "px")  + ";width:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().greyBottomRightCorner()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyBottomRightCorner()).getSafeUri().asString() + "\") -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyBottomRightCorner()).getLeft() + "px -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyBottomRightCorner()).getTop() + "px  no-repeat")  + ";height:" + ("4px")  + ";width:" + ("4px")  + ";}.GD0PFO4BCN{height:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().greyBottom()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyBottom()).getSafeUri().asString() + "\") -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyBottom()).getLeft() + "px -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyBottom()).getTop() + "px  repeat-x") ) + (";height:" + ("4px")  + ";width:" + ("100%")  + ";}.GD0PFO4BIN{height:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().greyTop()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyTop()).getSafeUri().asString() + "\") -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyTop()).getLeft() + "px -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyTop()).getTop() + "px  repeat-x")  + ";height:" + ("4px")  + ";width:" + ("100%")  + ";}.GD0PFO4BGN{width:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().greySideLeft()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (CommonResources_default_InlineClientBundleGenerator.this.images().greySideLeft()).getSafeUri().asString() + "\") -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greySideLeft()).getLeft() + "px -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greySideLeft()).getTop() + "px  repeat-y")  + ";height:") + (("100%")  + ";width:" + ("4px")  + ";}.GD0PFO4BHN{width:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().greySideRight()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (CommonResources_default_InlineClientBundleGenerator.this.images().greySideRight()).getSafeUri().asString() + "\") -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greySideRight()).getLeft() + "px -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greySideRight()).getTop() + "px  repeat-y")  + ";height:" + ("100%")  + ";width:" + ("4px")  + ";}.GD0PFO4BFN{background:" + ("#e3e3e3")  + ";}.GD0PFO4BLM{border:" + ("none")  + " !important;width:" + ("95%")  + ";}.GD0PFO4BKM{width:" + ("300px") ) + (";}.GD0PFO4BKM span{padding-left:" + ("15px")  + ";vertical-align:" + ("text-top")  + ";}.GD0PFO4BKM .spinner{margin-top:" + ("-3px")  + ";}.GD0PFO4BMN{height:" + ("32px")  + ";vertical-align:" + ("middle")  + ";display:" + ("table-cell")  + ";}.GD0PFO4BNN{font-size:" + ("smaller")  + ";font-style:" + ("italic")  + ";}.GD0PFO4BOM td div{white-space:" + ("nowrap")  + ";overflow:" + ("hidden")  + ";text-overflow:") + (("ellipsis")  + ";}.GD0PFO4BAN thead th{overflow:" + ("hidden")  + ";text-overflow:" + ("ellipsis")  + ";}.GD0PFO4BPM,.GD0PFO4BBN:first-child td{border-top:" + ("none")  + ";}.GD0PFO4BNM{background-color:" + ("#fff")  + ";padding:" + ("5px")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#d1d1d1")  + ";z-index:" + ("2000")  + ";}.GD0PFO4BNM .checkbox{margin-top:" + ("2px")  + ";margin-bottom:" + ("2px")  + ";}.btn-file{position:" + ("relative") ) + (";overflow:" + ("hidden")  + ";}.btn-file input[type=\"file\"]{position:" + ("absolute")  + ";top:" + ("0")  + ";right:" + ("0")  + ";min-width:" + ("100%")  + ";min-height:" + ("100%")  + ";font-size:" + ("999px")  + ";text-align:" + ("right")  + ";filter:" + ("alpha(opacity=0)")  + ";opacity:" + ("0")  + ";outline:") + (("none")  + ";background:" + ("white")  + ";cursor:" + ("inherit")  + ";display:" + ("block")  + ";}.btn-file>i+span,.btn-file>span+i{padding-left:" + ("2px")  + ";}.GD0PFO4BLN{overflow-wrap:" + ("break-word")  + ";}"));
      }
      public java.lang.String busyPopup() {
        return "GD0PFO4BKM";
      }
      public java.lang.String cleanTextArea() {
        return "GD0PFO4BLM";
      }
      public java.lang.String columnPickerButton() {
        return "GD0PFO4BMM";
      }
      public java.lang.String columnPickerPopup() {
        return "GD0PFO4BNM";
      }
      public java.lang.String dataGrid() {
        return "GD0PFO4BOM";
      }
      public java.lang.String dataGridContent() {
        return "GD0PFO4BPM";
      }
      public java.lang.String dataGridHeader() {
        return "GD0PFO4BAN";
      }
      public java.lang.String dataGridRow() {
        return "GD0PFO4BBN";
      }
      public java.lang.String greyBottomClass() {
        return "GD0PFO4BCN";
      }
      public java.lang.String greyBottomLeftCornerClass() {
        return "GD0PFO4BDN";
      }
      public java.lang.String greyBottomRightCornerClass() {
        return "GD0PFO4BEN";
      }
      public java.lang.String greyCenterClass() {
        return "GD0PFO4BFN";
      }
      public java.lang.String greySideLeftClass() {
        return "GD0PFO4BGN";
      }
      public java.lang.String greySideRightClass() {
        return "GD0PFO4BHN";
      }
      public java.lang.String greyTopClass() {
        return "GD0PFO4BIN";
      }
      public java.lang.String greyTopLeftCornerClass() {
        return "GD0PFO4BJN";
      }
      public java.lang.String greyTopRightCornerClass() {
        return "GD0PFO4BKN";
      }
      public java.lang.String popoverTextBreakWord() {
        return "GD0PFO4BLN";
      }
      public java.lang.String titleTextCellContainer() {
        return "GD0PFO4BMN";
      }
      public java.lang.String titleTextCellDescription() {
        return "GD0PFO4BNN";
      }
      public java.lang.String whiteBottomClass() {
        return "GD0PFO4BON";
      }
      public java.lang.String whiteBottomLeftCornerClass() {
        return "GD0PFO4BPN";
      }
      public java.lang.String whiteBottomRightCornerClass() {
        return "GD0PFO4BAO";
      }
      public java.lang.String whiteCenterClass() {
        return "GD0PFO4BBO";
      }
      public java.lang.String whiteSideLeftClass() {
        return "GD0PFO4BCO";
      }
      public java.lang.String whiteSideRightClass() {
        return "GD0PFO4BDO";
      }
      public java.lang.String whiteTopClass() {
        return "GD0PFO4BEO";
      }
      public java.lang.String whiteTopLeftCornerClass() {
        return "GD0PFO4BFO";
      }
      public java.lang.String whiteTopRightCornerClass() {
        return "GD0PFO4BGO";
      }
    }
    ;
  }
  private static class CSSInitializer {
    static {
      _instance0.CSSInitializer();
    }
    static org.uberfire.ext.widgets.common.client.resources.CommonCss get() {
      return CSS;
    }
  }
  public org.uberfire.ext.widgets.common.client.resources.CommonCss CSS() {
    return CSSInitializer.get();
  }
  private void imagesInitializer() {
    images = com.google.gwt.core.client.GWT.create(org.uberfire.ext.widgets.common.client.resources.CommonImages.class);
  }
  private static class imagesInitializer {
    static {
      _instance0.imagesInitializer();
    }
    static org.uberfire.ext.widgets.common.client.resources.CommonImages get() {
      return images;
    }
  }
  public org.uberfire.ext.widgets.common.client.resources.CommonImages images() {
    return imagesInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static org.uberfire.ext.widgets.common.client.resources.CommonCss CSS;
  private static org.uberfire.ext.widgets.common.client.resources.CommonImages images;
  
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
      case 'CSS': return this.@org.uberfire.ext.widgets.common.client.resources.CommonResources::CSS()();
    }
    return null;
  }-*/;
}
