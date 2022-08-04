package org.dashbuilder.displayer.client.resources.i18n;

public class DisplayerTypeConstants_ implements org.dashbuilder.displayer.client.resources.i18n.DisplayerTypeConstants {
  
  public java.lang.String displayer_type_selector_tab_bar() {
    return "Bar";
  }
  
  public java.lang.String displayer_type_selector_tab_pie() {
    return "Pie";
  }
  
  public java.lang.String displayer_type_selector_tab_line() {
    return "Line";
  }
  
  public java.lang.String displayer_type_selector_tab_area() {
    return "Area";
  }
  
  public java.lang.String displayer_type_selector_tab_bubble() {
    return "Bubble";
  }
  
  public java.lang.String displayer_type_selector_tab_meter() {
    return "Meter";
  }
  
  public java.lang.String displayer_type_selector_tab_metric() {
    return "Metric";
  }
  
  public java.lang.String displayer_type_selector_tab_map() {
    return "Map";
  }
  
  public java.lang.String displayer_type_selector_tab_table() {
    return "Table";
  }
  
  public java.lang.String displayer_type_selector_tab_selector() {
    return "Selector";
  }
  
  public java.lang.String DISPLAYER_SUBTYPE_LINE() {
    return "Line";
  }
  
  public java.lang.String DISPLAYER_SUBTYPE_SMOOTH() {
    return "Smooth";
  }
  
  public java.lang.String DISPLAYER_SUBTYPE_AREA() {
    return "Area";
  }
  
  public java.lang.String DISPLAYER_SUBTYPE_STACKED() {
    return "Stacked";
  }
  
  public java.lang.String DISPLAYER_SUBTYPE_STEPPED() {
    return "Stepped";
  }
  
  public java.lang.String DISPLAYER_SUBTYPE_BAR() {
    return "Bar";
  }
  
  public java.lang.String DISPLAYER_SUBTYPE_BAR_STACKED() {
    return "Bar Stacked";
  }
  
  public java.lang.String DISPLAYER_SUBTYPE_COLUMN() {
    return "Column";
  }
  
  public java.lang.String DISPLAYER_SUBTYPE_COLUMN_STACKED() {
    return "Column Stacked";
  }
  
  public java.lang.String DISPLAYER_SUBTYPE_HISTOGRAM() {
    return "Histogram";
  }
  
  public java.lang.String DISPLAYER_SUBTYPE_PIE() {
    return "Pie";
  }
  
  public java.lang.String DISPLAYER_SUBTYPE_PIE_3D() {
    return "3D Pie";
  }
  
  public java.lang.String DISPLAYER_SUBTYPE_DONUT() {
    return "Donut";
  }
  
  public java.lang.String DISPLAYER_SUBTYPE_MAP_REGIONS() {
    return "Map (Regions)";
  }
  
  public java.lang.String DISPLAYER_SUBTYPE_MAP_MARKERS() {
    return "Map (Markers)";
  }
  
  public java.lang.String DISPLAYER_SUBTYPE_METRIC_CARD() {
    return "Metric Card";
  }
  
  public java.lang.String DISPLAYER_SUBTYPE_METRIC_CARD2() {
    return "Metric Card 2";
  }
  
  public java.lang.String DISPLAYER_SUBTYPE_METRIC_QUOTA() {
    return "Metric Quota";
  }
  
  public java.lang.String DISPLAYER_SUBTYPE_METRIC_PLAIN_TEXT() {
    return "Metric Text";
  }
  
  public java.lang.String DISPLAYER_SUBTYPE_SELECTOR_DROPDOWN() {
    return "Drop Down";
  }
  
  public java.lang.String DISPLAYER_SUBTYPE_SELECTOR_LABELS() {
    return "Label Set";
  }
  
  public java.lang.String DISPLAYER_SUBTYPE_SELECTOR_SLIDER() {
    return "Slider";
  }
  
  public java.lang.String BARCHART_BAR_tt() {
    return "Bar Chart";
  }
  
  public java.lang.String BARCHART_BAR_STACKED_tt() {
    return "Stacked Bar Chart";
  }
  
  public java.lang.String BARCHART_COLUMN_tt() {
    return "Column Chart";
  }
  
  public java.lang.String BARCHART_COLUMN_STACKED_tt() {
    return "Stacked Column Chart";
  }
  
  public java.lang.String PIECHART_PIE_tt() {
    return "Pie Chart";
  }
  
  public java.lang.String PIECHART_PIE_3D_tt() {
    return "3D Pie Chart";
  }
  
  public java.lang.String PIECHART_DONUT_tt() {
    return "Pie Chart (donut)";
  }
  
  public java.lang.String AREACHART_AREA_tt() {
    return "Area Chart";
  }
  
  public java.lang.String AREACHART_AREA_STACKED_tt() {
    return "Stacked Area Chart";
  }
  
  public java.lang.String LINECHART_LINE_tt() {
    return "Line Chart";
  }
  
  public java.lang.String LINECHART_SMOOTH_tt() {
    return "Smooth Line Chart";
  }
  
  public java.lang.String MAP_MAP_REGIONS_tt() {
    return "Map Chart (regions)";
  }
  
  public java.lang.String MAP_MAP_MARKERS_tt() {
    return "Map Chart (markers)";
  }
  
  public java.lang.String BUBBLECHART_default_tt() {
    return "Bubble Chart";
  }
  
  public java.lang.String METERCHART_default_tt() {
    return "Meter Chart";
  }
  
  public java.lang.String METRIC_METRIC_CARD_tt() {
    return "Metric Card";
  }
  
  public java.lang.String METRIC_METRIC_CARD2_tt() {
    return "Metric Card 2";
  }
  
  public java.lang.String METRIC_METRIC_QUOTA_tt() {
    return "Metric Quota";
  }
  
  public java.lang.String METRIC_METRIC_PLAIN_TEXT_tt() {
    return "Metric Text";
  }
  
  public java.lang.String TABLE_default_tt() {
    return "Table";
  }
  
  public java.lang.String EXTERNAL_COMPONENT_default_tt() {
    return "External Component";
  }
  
  public java.lang.String SELECTOR_SELECTOR_DROPDOWN_tt() {
    return "Drop Down";
  }
  
  public java.lang.String SELECTOR_SELECTOR_LABELS_tt() {
    return "Label Set";
  }
  
  public java.lang.String SELECTOR_SELECTOR_SLIDER_tt() {
    return "Slider";
  }
  
  public boolean getBoolean(java.lang.String arg0) {
    Boolean target = (Boolean) cache.get(arg0);
    if (target != null) {
      return target.booleanValue();
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.displayer.client.resources.i18n.DisplayerTypeConstants", arg0);
  }
  
  public double getDouble(java.lang.String arg0) {
    Double target = (Double) cache.get(arg0);
    if (target != null) {
      return target.doubleValue();
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.displayer.client.resources.i18n.DisplayerTypeConstants", arg0);
  }
  
  public float getFloat(java.lang.String arg0) {
    Float target = (Float) cache.get(arg0);
    if (target != null) {
      return target.floatValue();
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.displayer.client.resources.i18n.DisplayerTypeConstants", arg0);
  }
  
  public int getInt(java.lang.String arg0) {
    Integer target = (Integer) cache.get(arg0);
    if (target != null) {
      return target.intValue();
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.displayer.client.resources.i18n.DisplayerTypeConstants", arg0);
  }
  
  public java.util.Map<java.lang.String, java.lang.String> getMap(java.lang.String arg0) {
    java.util.Map<java.lang.String, java.lang.String> target = (java.util.Map<java.lang.String, java.lang.String>) cache.get(arg0);
    if (target != null) {
      return target;
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.displayer.client.resources.i18n.DisplayerTypeConstants", arg0);
  }
  
  public java.lang.String getString(java.lang.String arg0) {
    java.lang.String target = (java.lang.String) cache.get(arg0);
    if (target != null) {
      return target;
    }
    if (arg0.equals("displayer_type_selector_tab_bar")) {
      String answer = displayer_type_selector_tab_bar();
      cache.put("displayer_type_selector_tab_bar",answer);
      return answer;
    }
    if (arg0.equals("displayer_type_selector_tab_pie")) {
      String answer = displayer_type_selector_tab_pie();
      cache.put("displayer_type_selector_tab_pie",answer);
      return answer;
    }
    if (arg0.equals("displayer_type_selector_tab_line")) {
      String answer = displayer_type_selector_tab_line();
      cache.put("displayer_type_selector_tab_line",answer);
      return answer;
    }
    if (arg0.equals("displayer_type_selector_tab_area")) {
      String answer = displayer_type_selector_tab_area();
      cache.put("displayer_type_selector_tab_area",answer);
      return answer;
    }
    if (arg0.equals("displayer_type_selector_tab_bubble")) {
      String answer = displayer_type_selector_tab_bubble();
      cache.put("displayer_type_selector_tab_bubble",answer);
      return answer;
    }
    if (arg0.equals("displayer_type_selector_tab_meter")) {
      String answer = displayer_type_selector_tab_meter();
      cache.put("displayer_type_selector_tab_meter",answer);
      return answer;
    }
    if (arg0.equals("displayer_type_selector_tab_metric")) {
      String answer = displayer_type_selector_tab_metric();
      cache.put("displayer_type_selector_tab_metric",answer);
      return answer;
    }
    if (arg0.equals("displayer_type_selector_tab_map")) {
      String answer = displayer_type_selector_tab_map();
      cache.put("displayer_type_selector_tab_map",answer);
      return answer;
    }
    if (arg0.equals("displayer_type_selector_tab_table")) {
      String answer = displayer_type_selector_tab_table();
      cache.put("displayer_type_selector_tab_table",answer);
      return answer;
    }
    if (arg0.equals("displayer_type_selector_tab_selector")) {
      String answer = displayer_type_selector_tab_selector();
      cache.put("displayer_type_selector_tab_selector",answer);
      return answer;
    }
    if (arg0.equals("DISPLAYER_SUBTYPE_LINE")) {
      String answer = DISPLAYER_SUBTYPE_LINE();
      cache.put("DISPLAYER_SUBTYPE_LINE",answer);
      return answer;
    }
    if (arg0.equals("DISPLAYER_SUBTYPE_SMOOTH")) {
      String answer = DISPLAYER_SUBTYPE_SMOOTH();
      cache.put("DISPLAYER_SUBTYPE_SMOOTH",answer);
      return answer;
    }
    if (arg0.equals("DISPLAYER_SUBTYPE_AREA")) {
      String answer = DISPLAYER_SUBTYPE_AREA();
      cache.put("DISPLAYER_SUBTYPE_AREA",answer);
      return answer;
    }
    if (arg0.equals("DISPLAYER_SUBTYPE_STACKED")) {
      String answer = DISPLAYER_SUBTYPE_STACKED();
      cache.put("DISPLAYER_SUBTYPE_STACKED",answer);
      return answer;
    }
    if (arg0.equals("DISPLAYER_SUBTYPE_STEPPED")) {
      String answer = DISPLAYER_SUBTYPE_STEPPED();
      cache.put("DISPLAYER_SUBTYPE_STEPPED",answer);
      return answer;
    }
    if (arg0.equals("DISPLAYER_SUBTYPE_BAR")) {
      String answer = DISPLAYER_SUBTYPE_BAR();
      cache.put("DISPLAYER_SUBTYPE_BAR",answer);
      return answer;
    }
    if (arg0.equals("DISPLAYER_SUBTYPE_BAR_STACKED")) {
      String answer = DISPLAYER_SUBTYPE_BAR_STACKED();
      cache.put("DISPLAYER_SUBTYPE_BAR_STACKED",answer);
      return answer;
    }
    if (arg0.equals("DISPLAYER_SUBTYPE_COLUMN")) {
      String answer = DISPLAYER_SUBTYPE_COLUMN();
      cache.put("DISPLAYER_SUBTYPE_COLUMN",answer);
      return answer;
    }
    if (arg0.equals("DISPLAYER_SUBTYPE_COLUMN_STACKED")) {
      String answer = DISPLAYER_SUBTYPE_COLUMN_STACKED();
      cache.put("DISPLAYER_SUBTYPE_COLUMN_STACKED",answer);
      return answer;
    }
    if (arg0.equals("DISPLAYER_SUBTYPE_HISTOGRAM")) {
      String answer = DISPLAYER_SUBTYPE_HISTOGRAM();
      cache.put("DISPLAYER_SUBTYPE_HISTOGRAM",answer);
      return answer;
    }
    if (arg0.equals("DISPLAYER_SUBTYPE_PIE")) {
      String answer = DISPLAYER_SUBTYPE_PIE();
      cache.put("DISPLAYER_SUBTYPE_PIE",answer);
      return answer;
    }
    if (arg0.equals("DISPLAYER_SUBTYPE_PIE_3D")) {
      String answer = DISPLAYER_SUBTYPE_PIE_3D();
      cache.put("DISPLAYER_SUBTYPE_PIE_3D",answer);
      return answer;
    }
    if (arg0.equals("DISPLAYER_SUBTYPE_DONUT")) {
      String answer = DISPLAYER_SUBTYPE_DONUT();
      cache.put("DISPLAYER_SUBTYPE_DONUT",answer);
      return answer;
    }
    if (arg0.equals("DISPLAYER_SUBTYPE_MAP_REGIONS")) {
      String answer = DISPLAYER_SUBTYPE_MAP_REGIONS();
      cache.put("DISPLAYER_SUBTYPE_MAP_REGIONS",answer);
      return answer;
    }
    if (arg0.equals("DISPLAYER_SUBTYPE_MAP_MARKERS")) {
      String answer = DISPLAYER_SUBTYPE_MAP_MARKERS();
      cache.put("DISPLAYER_SUBTYPE_MAP_MARKERS",answer);
      return answer;
    }
    if (arg0.equals("DISPLAYER_SUBTYPE_METRIC_CARD")) {
      String answer = DISPLAYER_SUBTYPE_METRIC_CARD();
      cache.put("DISPLAYER_SUBTYPE_METRIC_CARD",answer);
      return answer;
    }
    if (arg0.equals("DISPLAYER_SUBTYPE_METRIC_CARD2")) {
      String answer = DISPLAYER_SUBTYPE_METRIC_CARD2();
      cache.put("DISPLAYER_SUBTYPE_METRIC_CARD2",answer);
      return answer;
    }
    if (arg0.equals("DISPLAYER_SUBTYPE_METRIC_QUOTA")) {
      String answer = DISPLAYER_SUBTYPE_METRIC_QUOTA();
      cache.put("DISPLAYER_SUBTYPE_METRIC_QUOTA",answer);
      return answer;
    }
    if (arg0.equals("DISPLAYER_SUBTYPE_METRIC_PLAIN_TEXT")) {
      String answer = DISPLAYER_SUBTYPE_METRIC_PLAIN_TEXT();
      cache.put("DISPLAYER_SUBTYPE_METRIC_PLAIN_TEXT",answer);
      return answer;
    }
    if (arg0.equals("DISPLAYER_SUBTYPE_SELECTOR_DROPDOWN")) {
      String answer = DISPLAYER_SUBTYPE_SELECTOR_DROPDOWN();
      cache.put("DISPLAYER_SUBTYPE_SELECTOR_DROPDOWN",answer);
      return answer;
    }
    if (arg0.equals("DISPLAYER_SUBTYPE_SELECTOR_LABELS")) {
      String answer = DISPLAYER_SUBTYPE_SELECTOR_LABELS();
      cache.put("DISPLAYER_SUBTYPE_SELECTOR_LABELS",answer);
      return answer;
    }
    if (arg0.equals("DISPLAYER_SUBTYPE_SELECTOR_SLIDER")) {
      String answer = DISPLAYER_SUBTYPE_SELECTOR_SLIDER();
      cache.put("DISPLAYER_SUBTYPE_SELECTOR_SLIDER",answer);
      return answer;
    }
    if (arg0.equals("BARCHART_BAR_tt")) {
      String answer = BARCHART_BAR_tt();
      cache.put("BARCHART_BAR_tt",answer);
      return answer;
    }
    if (arg0.equals("BARCHART_BAR_STACKED_tt")) {
      String answer = BARCHART_BAR_STACKED_tt();
      cache.put("BARCHART_BAR_STACKED_tt",answer);
      return answer;
    }
    if (arg0.equals("BARCHART_COLUMN_tt")) {
      String answer = BARCHART_COLUMN_tt();
      cache.put("BARCHART_COLUMN_tt",answer);
      return answer;
    }
    if (arg0.equals("BARCHART_COLUMN_STACKED_tt")) {
      String answer = BARCHART_COLUMN_STACKED_tt();
      cache.put("BARCHART_COLUMN_STACKED_tt",answer);
      return answer;
    }
    if (arg0.equals("PIECHART_PIE_tt")) {
      String answer = PIECHART_PIE_tt();
      cache.put("PIECHART_PIE_tt",answer);
      return answer;
    }
    if (arg0.equals("PIECHART_PIE_3D_tt")) {
      String answer = PIECHART_PIE_3D_tt();
      cache.put("PIECHART_PIE_3D_tt",answer);
      return answer;
    }
    if (arg0.equals("PIECHART_DONUT_tt")) {
      String answer = PIECHART_DONUT_tt();
      cache.put("PIECHART_DONUT_tt",answer);
      return answer;
    }
    if (arg0.equals("AREACHART_AREA_tt")) {
      String answer = AREACHART_AREA_tt();
      cache.put("AREACHART_AREA_tt",answer);
      return answer;
    }
    if (arg0.equals("AREACHART_AREA_STACKED_tt")) {
      String answer = AREACHART_AREA_STACKED_tt();
      cache.put("AREACHART_AREA_STACKED_tt",answer);
      return answer;
    }
    if (arg0.equals("LINECHART_LINE_tt")) {
      String answer = LINECHART_LINE_tt();
      cache.put("LINECHART_LINE_tt",answer);
      return answer;
    }
    if (arg0.equals("LINECHART_SMOOTH_tt")) {
      String answer = LINECHART_SMOOTH_tt();
      cache.put("LINECHART_SMOOTH_tt",answer);
      return answer;
    }
    if (arg0.equals("MAP_MAP_REGIONS_tt")) {
      String answer = MAP_MAP_REGIONS_tt();
      cache.put("MAP_MAP_REGIONS_tt",answer);
      return answer;
    }
    if (arg0.equals("MAP_MAP_MARKERS_tt")) {
      String answer = MAP_MAP_MARKERS_tt();
      cache.put("MAP_MAP_MARKERS_tt",answer);
      return answer;
    }
    if (arg0.equals("BUBBLECHART_default_tt")) {
      String answer = BUBBLECHART_default_tt();
      cache.put("BUBBLECHART_default_tt",answer);
      return answer;
    }
    if (arg0.equals("METERCHART_default_tt")) {
      String answer = METERCHART_default_tt();
      cache.put("METERCHART_default_tt",answer);
      return answer;
    }
    if (arg0.equals("METRIC_METRIC_CARD_tt")) {
      String answer = METRIC_METRIC_CARD_tt();
      cache.put("METRIC_METRIC_CARD_tt",answer);
      return answer;
    }
    if (arg0.equals("METRIC_METRIC_CARD2_tt")) {
      String answer = METRIC_METRIC_CARD2_tt();
      cache.put("METRIC_METRIC_CARD2_tt",answer);
      return answer;
    }
    if (arg0.equals("METRIC_METRIC_QUOTA_tt")) {
      String answer = METRIC_METRIC_QUOTA_tt();
      cache.put("METRIC_METRIC_QUOTA_tt",answer);
      return answer;
    }
    if (arg0.equals("METRIC_METRIC_PLAIN_TEXT_tt")) {
      String answer = METRIC_METRIC_PLAIN_TEXT_tt();
      cache.put("METRIC_METRIC_PLAIN_TEXT_tt",answer);
      return answer;
    }
    if (arg0.equals("TABLE_default_tt")) {
      String answer = TABLE_default_tt();
      cache.put("TABLE_default_tt",answer);
      return answer;
    }
    if (arg0.equals("EXTERNAL_COMPONENT_default_tt")) {
      String answer = EXTERNAL_COMPONENT_default_tt();
      cache.put("EXTERNAL_COMPONENT_default_tt",answer);
      return answer;
    }
    if (arg0.equals("SELECTOR_SELECTOR_DROPDOWN_tt")) {
      String answer = SELECTOR_SELECTOR_DROPDOWN_tt();
      cache.put("SELECTOR_SELECTOR_DROPDOWN_tt",answer);
      return answer;
    }
    if (arg0.equals("SELECTOR_SELECTOR_LABELS_tt")) {
      String answer = SELECTOR_SELECTOR_LABELS_tt();
      cache.put("SELECTOR_SELECTOR_LABELS_tt",answer);
      return answer;
    }
    if (arg0.equals("SELECTOR_SELECTOR_SLIDER_tt")) {
      String answer = SELECTOR_SELECTOR_SLIDER_tt();
      cache.put("SELECTOR_SELECTOR_SLIDER_tt",answer);
      return answer;
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.displayer.client.resources.i18n.DisplayerTypeConstants", arg0);
  }
  
  public java.lang.String[] getStringArray(java.lang.String arg0) {
    java.lang.String[] target = (java.lang.String[]) cache.get(arg0);
    if (target != null) {
      return target;
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "org.dashbuilder.displayer.client.resources.i18n.DisplayerTypeConstants", arg0);
  }
  java.util.Map cache = new java.util.HashMap();
}
