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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GJIO14PDKM{height:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().whiteTopLeftCorner()).getHeight() + "px")  + ";width:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().whiteTopLeftCorner()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (CommonResources_default_InlineClientBundleGenerator.this.images().whiteTopLeftCorner()).getSafeUri().asString() + "\") -" + (CommonResources_default_InlineClientBundleGenerator.this.images().whiteTopLeftCorner()).getLeft() + "px -" + (CommonResources_default_InlineClientBundleGenerator.this.images().whiteTopLeftCorner()).getTop() + "px  no-repeat")  + ";height:" + ("4px")  + ";width:" + ("4px")  + ";}.GJIO14PDLM{height:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().whiteTopRightCorner()).getHeight() + "px")  + ";width:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().whiteTopRightCorner()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (CommonResources_default_InlineClientBundleGenerator.this.images().whiteTopRightCorner()).getSafeUri().asString() + "\") -" + (CommonResources_default_InlineClientBundleGenerator.this.images().whiteTopRightCorner()).getLeft() + "px -" + (CommonResources_default_InlineClientBundleGenerator.this.images().whiteTopRightCorner()).getTop() + "px  no-repeat")  + ";height:") + (("4px")  + ";width:" + ("4px")  + ";}.GJIO14PDEM{height:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().whiteBottomLeftCorner()).getHeight() + "px")  + ";width:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().whiteBottomLeftCorner()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (CommonResources_default_InlineClientBundleGenerator.this.images().whiteBottomLeftCorner()).getSafeUri().asString() + "\") -" + (CommonResources_default_InlineClientBundleGenerator.this.images().whiteBottomLeftCorner()).getLeft() + "px -" + (CommonResources_default_InlineClientBundleGenerator.this.images().whiteBottomLeftCorner()).getTop() + "px  no-repeat")  + ";height:" + ("4px")  + ";width:" + ("4px")  + ";}.GJIO14PDFM{height:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().whiteBottomRightCorner()).getHeight() + "px")  + ";width:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().whiteBottomRightCorner()).getWidth() + "px")  + ";overflow:" + ("hidden") ) + (";background:" + ("url(\"" + (CommonResources_default_InlineClientBundleGenerator.this.images().whiteBottomRightCorner()).getSafeUri().asString() + "\") -" + (CommonResources_default_InlineClientBundleGenerator.this.images().whiteBottomRightCorner()).getLeft() + "px -" + (CommonResources_default_InlineClientBundleGenerator.this.images().whiteBottomRightCorner()).getTop() + "px  no-repeat")  + ";height:" + ("4px")  + ";width:" + ("4px")  + ";}.GJIO14PDDM{border-bottom:" + ("1px"+ " " +"solid"+ " " +"#bbb")  + ";height:" + ("3px")  + ";width:" + ("100%")  + ";}.GJIO14PDJM{border-top:" + ("1px"+ " " +"solid"+ " " +"#bbb")  + ";height:" + ("3px")  + ";width:" + ("100%")  + ";}.GJIO14PDHM{border-right:" + ("1px"+ " " +"solid"+ " " +"#bbb")  + ";height:") + (("100%")  + ";width:" + ("3px")  + ";}.GJIO14PDIM{border-left:" + ("1px"+ " " +"solid"+ " " +"#bbb")  + ";height:" + ("100%")  + ";width:" + ("3px")  + ";}.GJIO14PDOL{height:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().greyTopLeftCorner()).getHeight() + "px")  + ";width:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().greyTopLeftCorner()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyTopLeftCorner()).getSafeUri().asString() + "\") -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyTopLeftCorner()).getLeft() + "px -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyTopLeftCorner()).getTop() + "px  no-repeat")  + ";height:" + ("4px")  + ";width:" + ("4px") ) + (";}.GJIO14PDPL{height:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().greyTopRightCorner()).getHeight() + "px")  + ";width:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().greyTopRightCorner()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyTopRightCorner()).getSafeUri().asString() + "\") -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyTopRightCorner()).getLeft() + "px -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyTopRightCorner()).getTop() + "px  no-repeat")  + ";height:" + ("4px")  + ";width:" + ("4px")  + ";}.GJIO14PDIL{height:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().greyBottomLeftCorner()).getHeight() + "px")  + ";width:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().greyBottomLeftCorner()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyBottomLeftCorner()).getSafeUri().asString() + "\") -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyBottomLeftCorner()).getLeft() + "px -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyBottomLeftCorner()).getTop() + "px  no-repeat")  + ";height:") + (("4px")  + ";width:" + ("4px")  + ";}.GJIO14PDJL{height:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().greyBottomRightCorner()).getHeight() + "px")  + ";width:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().greyBottomRightCorner()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyBottomRightCorner()).getSafeUri().asString() + "\") -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyBottomRightCorner()).getLeft() + "px -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyBottomRightCorner()).getTop() + "px  no-repeat")  + ";height:" + ("4px")  + ";width:" + ("4px")  + ";}.GJIO14PDHL{height:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().greyBottom()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyBottom()).getSafeUri().asString() + "\") -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyBottom()).getLeft() + "px -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyBottom()).getTop() + "px  repeat-x") ) + (";height:" + ("4px")  + ";width:" + ("100%")  + ";}.GJIO14PDNL{height:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().greyTop()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyTop()).getSafeUri().asString() + "\") -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyTop()).getLeft() + "px -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyTop()).getTop() + "px  repeat-x")  + ";height:" + ("4px")  + ";width:" + ("100%")  + ";}.GJIO14PDLL{width:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().greySideLeft()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (CommonResources_default_InlineClientBundleGenerator.this.images().greySideLeft()).getSafeUri().asString() + "\") -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greySideLeft()).getLeft() + "px -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greySideLeft()).getTop() + "px  repeat-y")  + ";height:") + (("100%")  + ";width:" + ("4px")  + ";}.GJIO14PDML{width:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().greySideRight()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (CommonResources_default_InlineClientBundleGenerator.this.images().greySideRight()).getSafeUri().asString() + "\") -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greySideRight()).getLeft() + "px -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greySideRight()).getTop() + "px  repeat-y")  + ";height:" + ("100%")  + ";width:" + ("4px")  + ";}.GJIO14PDKL{background:" + ("#e3e3e3")  + ";}.GJIO14PDAL{border:" + ("none")  + " !important;width:" + ("95%")  + ";}.GJIO14PDPK{width:" + ("300px") ) + (";}.GJIO14PDPK span{padding-right:" + ("15px")  + ";vertical-align:" + ("text-top")  + ";}.GJIO14PDPK .spinner{margin-top:" + ("-3px")  + ";}.GJIO14PDBM{height:" + ("32px")  + ";vertical-align:" + ("middle")  + ";display:" + ("table-cell")  + ";}.GJIO14PDCM{font-size:" + ("smaller")  + ";font-style:" + ("italic")  + ";}.GJIO14PDDL td div{white-space:" + ("nowrap")  + ";overflow:" + ("hidden")  + ";text-overflow:") + (("ellipsis")  + ";}.GJIO14PDFL thead th{overflow:" + ("hidden")  + ";text-overflow:" + ("ellipsis")  + ";}.GJIO14PDEL,.GJIO14PDGL:first-child td{border-top:" + ("none")  + ";}.GJIO14PDCL{background-color:" + ("#fff")  + ";padding:" + ("5px")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#d1d1d1")  + ";z-index:" + ("2000")  + ";}.GJIO14PDCL .checkbox{margin-top:" + ("2px")  + ";margin-bottom:" + ("2px")  + ";}.btn-file{position:" + ("relative") ) + (";overflow:" + ("hidden")  + ";}.btn-file input[type=\"file\"]{position:" + ("absolute")  + ";top:" + ("0")  + ";left:" + ("0")  + ";min-width:" + ("100%")  + ";min-height:" + ("100%")  + ";font-size:" + ("999px")  + ";text-align:" + ("left")  + ";filter:" + ("alpha(opacity=0)")  + ";opacity:" + ("0")  + ";outline:") + (("none")  + ";background:" + ("white")  + ";cursor:" + ("inherit")  + ";display:" + ("block")  + ";}.btn-file>i+span,.btn-file>span+i{padding-right:" + ("2px")  + ";}.GJIO14PDAM{overflow-wrap:" + ("break-word")  + ";}")) : ((".GJIO14PDKM{height:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().whiteTopLeftCorner()).getHeight() + "px")  + ";width:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().whiteTopLeftCorner()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (CommonResources_default_InlineClientBundleGenerator.this.images().whiteTopLeftCorner()).getSafeUri().asString() + "\") -" + (CommonResources_default_InlineClientBundleGenerator.this.images().whiteTopLeftCorner()).getLeft() + "px -" + (CommonResources_default_InlineClientBundleGenerator.this.images().whiteTopLeftCorner()).getTop() + "px  no-repeat")  + ";height:" + ("4px")  + ";width:" + ("4px")  + ";}.GJIO14PDLM{height:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().whiteTopRightCorner()).getHeight() + "px")  + ";width:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().whiteTopRightCorner()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (CommonResources_default_InlineClientBundleGenerator.this.images().whiteTopRightCorner()).getSafeUri().asString() + "\") -" + (CommonResources_default_InlineClientBundleGenerator.this.images().whiteTopRightCorner()).getLeft() + "px -" + (CommonResources_default_InlineClientBundleGenerator.this.images().whiteTopRightCorner()).getTop() + "px  no-repeat")  + ";height:") + (("4px")  + ";width:" + ("4px")  + ";}.GJIO14PDEM{height:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().whiteBottomLeftCorner()).getHeight() + "px")  + ";width:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().whiteBottomLeftCorner()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (CommonResources_default_InlineClientBundleGenerator.this.images().whiteBottomLeftCorner()).getSafeUri().asString() + "\") -" + (CommonResources_default_InlineClientBundleGenerator.this.images().whiteBottomLeftCorner()).getLeft() + "px -" + (CommonResources_default_InlineClientBundleGenerator.this.images().whiteBottomLeftCorner()).getTop() + "px  no-repeat")  + ";height:" + ("4px")  + ";width:" + ("4px")  + ";}.GJIO14PDFM{height:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().whiteBottomRightCorner()).getHeight() + "px")  + ";width:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().whiteBottomRightCorner()).getWidth() + "px")  + ";overflow:" + ("hidden") ) + (";background:" + ("url(\"" + (CommonResources_default_InlineClientBundleGenerator.this.images().whiteBottomRightCorner()).getSafeUri().asString() + "\") -" + (CommonResources_default_InlineClientBundleGenerator.this.images().whiteBottomRightCorner()).getLeft() + "px -" + (CommonResources_default_InlineClientBundleGenerator.this.images().whiteBottomRightCorner()).getTop() + "px  no-repeat")  + ";height:" + ("4px")  + ";width:" + ("4px")  + ";}.GJIO14PDDM{border-bottom:" + ("1px"+ " " +"solid"+ " " +"#bbb")  + ";height:" + ("3px")  + ";width:" + ("100%")  + ";}.GJIO14PDJM{border-top:" + ("1px"+ " " +"solid"+ " " +"#bbb")  + ";height:" + ("3px")  + ";width:" + ("100%")  + ";}.GJIO14PDHM{border-left:" + ("1px"+ " " +"solid"+ " " +"#bbb")  + ";height:") + (("100%")  + ";width:" + ("3px")  + ";}.GJIO14PDIM{border-right:" + ("1px"+ " " +"solid"+ " " +"#bbb")  + ";height:" + ("100%")  + ";width:" + ("3px")  + ";}.GJIO14PDOL{height:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().greyTopLeftCorner()).getHeight() + "px")  + ";width:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().greyTopLeftCorner()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyTopLeftCorner()).getSafeUri().asString() + "\") -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyTopLeftCorner()).getLeft() + "px -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyTopLeftCorner()).getTop() + "px  no-repeat")  + ";height:" + ("4px")  + ";width:" + ("4px") ) + (";}.GJIO14PDPL{height:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().greyTopRightCorner()).getHeight() + "px")  + ";width:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().greyTopRightCorner()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyTopRightCorner()).getSafeUri().asString() + "\") -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyTopRightCorner()).getLeft() + "px -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyTopRightCorner()).getTop() + "px  no-repeat")  + ";height:" + ("4px")  + ";width:" + ("4px")  + ";}.GJIO14PDIL{height:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().greyBottomLeftCorner()).getHeight() + "px")  + ";width:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().greyBottomLeftCorner()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyBottomLeftCorner()).getSafeUri().asString() + "\") -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyBottomLeftCorner()).getLeft() + "px -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyBottomLeftCorner()).getTop() + "px  no-repeat")  + ";height:") + (("4px")  + ";width:" + ("4px")  + ";}.GJIO14PDJL{height:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().greyBottomRightCorner()).getHeight() + "px")  + ";width:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().greyBottomRightCorner()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyBottomRightCorner()).getSafeUri().asString() + "\") -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyBottomRightCorner()).getLeft() + "px -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyBottomRightCorner()).getTop() + "px  no-repeat")  + ";height:" + ("4px")  + ";width:" + ("4px")  + ";}.GJIO14PDHL{height:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().greyBottom()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyBottom()).getSafeUri().asString() + "\") -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyBottom()).getLeft() + "px -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyBottom()).getTop() + "px  repeat-x") ) + (";height:" + ("4px")  + ";width:" + ("100%")  + ";}.GJIO14PDNL{height:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().greyTop()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyTop()).getSafeUri().asString() + "\") -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyTop()).getLeft() + "px -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greyTop()).getTop() + "px  repeat-x")  + ";height:" + ("4px")  + ";width:" + ("100%")  + ";}.GJIO14PDLL{width:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().greySideLeft()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (CommonResources_default_InlineClientBundleGenerator.this.images().greySideLeft()).getSafeUri().asString() + "\") -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greySideLeft()).getLeft() + "px -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greySideLeft()).getTop() + "px  repeat-y")  + ";height:") + (("100%")  + ";width:" + ("4px")  + ";}.GJIO14PDML{width:" + ((CommonResources_default_InlineClientBundleGenerator.this.images().greySideRight()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (CommonResources_default_InlineClientBundleGenerator.this.images().greySideRight()).getSafeUri().asString() + "\") -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greySideRight()).getLeft() + "px -" + (CommonResources_default_InlineClientBundleGenerator.this.images().greySideRight()).getTop() + "px  repeat-y")  + ";height:" + ("100%")  + ";width:" + ("4px")  + ";}.GJIO14PDKL{background:" + ("#e3e3e3")  + ";}.GJIO14PDAL{border:" + ("none")  + " !important;width:" + ("95%")  + ";}.GJIO14PDPK{width:" + ("300px") ) + (";}.GJIO14PDPK span{padding-left:" + ("15px")  + ";vertical-align:" + ("text-top")  + ";}.GJIO14PDPK .spinner{margin-top:" + ("-3px")  + ";}.GJIO14PDBM{height:" + ("32px")  + ";vertical-align:" + ("middle")  + ";display:" + ("table-cell")  + ";}.GJIO14PDCM{font-size:" + ("smaller")  + ";font-style:" + ("italic")  + ";}.GJIO14PDDL td div{white-space:" + ("nowrap")  + ";overflow:" + ("hidden")  + ";text-overflow:") + (("ellipsis")  + ";}.GJIO14PDFL thead th{overflow:" + ("hidden")  + ";text-overflow:" + ("ellipsis")  + ";}.GJIO14PDEL,.GJIO14PDGL:first-child td{border-top:" + ("none")  + ";}.GJIO14PDCL{background-color:" + ("#fff")  + ";padding:" + ("5px")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#d1d1d1")  + ";z-index:" + ("2000")  + ";}.GJIO14PDCL .checkbox{margin-top:" + ("2px")  + ";margin-bottom:" + ("2px")  + ";}.btn-file{position:" + ("relative") ) + (";overflow:" + ("hidden")  + ";}.btn-file input[type=\"file\"]{position:" + ("absolute")  + ";top:" + ("0")  + ";right:" + ("0")  + ";min-width:" + ("100%")  + ";min-height:" + ("100%")  + ";font-size:" + ("999px")  + ";text-align:" + ("right")  + ";filter:" + ("alpha(opacity=0)")  + ";opacity:" + ("0")  + ";outline:") + (("none")  + ";background:" + ("white")  + ";cursor:" + ("inherit")  + ";display:" + ("block")  + ";}.btn-file>i+span,.btn-file>span+i{padding-left:" + ("2px")  + ";}.GJIO14PDAM{overflow-wrap:" + ("break-word")  + ";}"));
      }
      public java.lang.String busyPopup() {
        return "GJIO14PDPK";
      }
      public java.lang.String cleanTextArea() {
        return "GJIO14PDAL";
      }
      public java.lang.String columnPickerButton() {
        return "GJIO14PDBL";
      }
      public java.lang.String columnPickerPopup() {
        return "GJIO14PDCL";
      }
      public java.lang.String dataGrid() {
        return "GJIO14PDDL";
      }
      public java.lang.String dataGridContent() {
        return "GJIO14PDEL";
      }
      public java.lang.String dataGridHeader() {
        return "GJIO14PDFL";
      }
      public java.lang.String dataGridRow() {
        return "GJIO14PDGL";
      }
      public java.lang.String greyBottomClass() {
        return "GJIO14PDHL";
      }
      public java.lang.String greyBottomLeftCornerClass() {
        return "GJIO14PDIL";
      }
      public java.lang.String greyBottomRightCornerClass() {
        return "GJIO14PDJL";
      }
      public java.lang.String greyCenterClass() {
        return "GJIO14PDKL";
      }
      public java.lang.String greySideLeftClass() {
        return "GJIO14PDLL";
      }
      public java.lang.String greySideRightClass() {
        return "GJIO14PDML";
      }
      public java.lang.String greyTopClass() {
        return "GJIO14PDNL";
      }
      public java.lang.String greyTopLeftCornerClass() {
        return "GJIO14PDOL";
      }
      public java.lang.String greyTopRightCornerClass() {
        return "GJIO14PDPL";
      }
      public java.lang.String popoverTextBreakWord() {
        return "GJIO14PDAM";
      }
      public java.lang.String titleTextCellContainer() {
        return "GJIO14PDBM";
      }
      public java.lang.String titleTextCellDescription() {
        return "GJIO14PDCM";
      }
      public java.lang.String whiteBottomClass() {
        return "GJIO14PDDM";
      }
      public java.lang.String whiteBottomLeftCornerClass() {
        return "GJIO14PDEM";
      }
      public java.lang.String whiteBottomRightCornerClass() {
        return "GJIO14PDFM";
      }
      public java.lang.String whiteCenterClass() {
        return "GJIO14PDGM";
      }
      public java.lang.String whiteSideLeftClass() {
        return "GJIO14PDHM";
      }
      public java.lang.String whiteSideRightClass() {
        return "GJIO14PDIM";
      }
      public java.lang.String whiteTopClass() {
        return "GJIO14PDJM";
      }
      public java.lang.String whiteTopLeftCornerClass() {
        return "GJIO14PDKM";
      }
      public java.lang.String whiteTopRightCornerClass() {
        return "GJIO14PDLM";
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
