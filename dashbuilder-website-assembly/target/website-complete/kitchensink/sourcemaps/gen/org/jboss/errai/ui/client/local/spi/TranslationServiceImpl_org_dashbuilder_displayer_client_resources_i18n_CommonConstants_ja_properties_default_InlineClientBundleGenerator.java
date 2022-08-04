package org.jboss.errai.ui.client.local.spi;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class TranslationServiceImpl_org_dashbuilder_displayer_client_resources_i18n_CommonConstants_ja_properties_default_InlineClientBundleGenerator implements org.jboss.errai.ui.client.local.spi.TranslationServiceImpl.org_dashbuilder_displayer_client_resources_i18n_CommonConstants_ja_properties {
  private static TranslationServiceImpl_org_dashbuilder_displayer_client_resources_i18n_CommonConstants_ja_properties_default_InlineClientBundleGenerator _instance0 = new TranslationServiceImpl_org_dashbuilder_displayer_client_resources_i18n_CommonConstants_ja_properties_default_InlineClientBundleGenerator();
  private void getContentsInitializer() {
    getContents = new com.google.gwt.resources.client.TextResource() {
      // jar:file:/home/wsiqueir/.m2/repository/org/dashbuilder/dashbuilder-displayer-client/0.0.0/dashbuilder-displayer-client-0.0.0.jar!/org/dashbuilder/displayer/client/resources/i18n/CommonConstants_ja.properties
      public String getText() {
        return "#\n# Copyright (C) 2014 Red Hat, Inc. and/or its affiliates.\n#\n# Licensed under the Apache License, Version 2.0 (the \"License\");\n# you may not use this file except in compliance with the License.\n# You may obtain a copy of the License at\n#\n#       http://www.apache.org/licenses/LICENSE-2.0\n#\n# Unless required by applicable law or agreed to in writing, software\n# distributed under the License is distributed on an \"AS IS\" BASIS,\n# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\n# See the License for the specific language governing permissions and\n# limitations under the License.\n#\n\nok=OK\ncancel=キャンセル\nerror=エラー:\ncause=原因:\n\n# Position enum literals\nPOSITION_BOTTOM=下揃え\nPOSITION_TOP=上揃え\nPOSITION_LEFT=左揃え\nPOSITION_RIGHT=右揃え\nPOSITION_IN=In\n\n# Common settings editor literals\n\ndataset_editor_notfound=データセットが見つかりません\ncommon_dropdown_select=- 選択 -\ncommon_button_addnew=新規の追加\n\nsettingsEditor_caption=ディスプレイヤー設定エディター\nsettingsJsonSource_caption=ディスプレイヤー設定 JSON ソースビュー\n\ncommon_group=全般\ncommon_showTitle=可視\ncommon_title=タイトル\ncommon_title_placeholder=チャートのタイトルの挿入\ncommon_export=エクスポート\ncommon_allowCSV=CSV \ncommon_allowExcel=Excel \ncommon_renderer=レンダラー\ncommon_columns=カラム\ncolumns_name=カラム\ncolumns_expression=式\ncolumns_pattern=パターン\ncolumns_emptyvalue=空\ncommon_columns_placeholder=ディスプレイヤーの列をカンマで区切って挿入\n\nchart_group=チャート\nchart_width=幅\nchart_height=高さ\nchart_resizable=自動のサイズ変更\nchart_bgColor=背景色\n\nchart_marginGroup=余白\nchart_topMargin=上余白\nchart_bottomMargin=下余白\nchart_leftMargin=左余白\nchart_rightMargin=右余白\n\nchart_legendGroup=凡例\nchart_legendShow=可視\nchart_legendPosition=ポジション\nchart_3d=3D\n\ntable_group=テーブル\ntable_pageSize=ページサイズ\ntable_width=幅\ntable_sortEnabled=ソートが有効化\ntable_sortColumn=デフォルトでソート\ntable_sortColumn_placeholder=デフォルトソート列 ID の挿入\ntable_sortOrder=ソート順序\ntable_ascSortOrder=昇順\ntable_descSortOrder=降順\ntable_columnPicker=列取得\n\naxis_group=軸\nxaxis_showLabels=X 軸ラベルを表示\nxaxis_angle=X 軸ラベルの角度\nxaxis_title=X 軸タイトル\nxaxis_title_placeholder=X 軸タイトルの挿入\nyaxis_showLabels=Y 軸ラベルを表示\nyaxis_angle=Y 軸ラベルの角度\nyaxis_title=Y 軸タイトル\nyaxis_title_placeholder=Y 軸タイトルの挿入\n\nmeter_group=メーター\nmeter_start=開始\nmeter_warning=警告レベル\nmeter_critical=重大レベル\nmeter_end=終了\n\nrefresh_group=更新\nrefresh_interval=更新 (秒)\nrefresh_stale_data=古いデータの更新\n\n# Filter\n\nfilter_group=フィルター\nfilter_enabled=有効\nfilter_self=自己適用\nfilter_listening=他のコンポーネントをリッスン\nfilter_notifications=他のコンポーネントに通知\nselector_group=セレクター\nselector_width=幅\nselector_multiple=複数\nselector_show_inputs=入力を表示\n\nfilter_editor_selectcolumn=- 列の選択 -\n\ntimeframe_from=から\ntimeframe_to=終了\ntimeframe_first_month_year=年度開始月\n\ncase_sensitive=大文字と小文字を区別します\nlike_to_pattern_instructions=''%'' は 0 以上の文字数で ''_'' は 1 文字になります\nmultiple_input_descriptions=複数の値がサポートされています。セパレーターには、''|'' または '','' を使用できます。\n\ndataset_groupdate_fixed_intervals=固定された間隔\ndataset_groupdate_empty_intervals=空の間隔\ndataset_groupdate_interval_type=間隔タイプ\ndataset_groupdate_max_intervals=最大間隔\ndataset_groupdate_firstday=開始日\ndataset_groupdate_firstmonth=開始月\n\nsettings_validation_integer=値は整数でなければなりません。\nsettings_validation_double=値は倍精度形式でなければなりません。\nsettings_validation_meter_unknown=不明\nsettings_validation_meter_higher={0} 値よりも大きい必要があります。\nsettings_validation_meter_lower={0} 値よりも小さい必要があります。\nsettings_validation_meter_invalid=無効値\n\n# DataSetLookup literals\ndataset_dataset=データセット\ndataset_filters=フィルター\ndataset_rows=行\ndataset_columns=カラム\ngroup_columnid_label=列 ID\ndataset_lookup_group_columns_all=グループ化無し\ndataset_lookup_dataset_notfound=データセット {0} が見つかりません\ndataset_lookup_init_error=初期化エラー\n\n# DisplayerEditor literals\ndisplayer_editor_title=ディスプレイヤーエディター\ndisplayer_editor_new=新規ディスプレイヤー\ndisplayer_editor_dataset_notfound=選択されたデータセットが見つかりません。\ndisplayer_editor_datasetmetadata_fetcherror=データセットメタデータのフェッチ中にエラがー発生しました。\ndisplayer_editor_dataset_nolookuprequest=選択されたデータセットに対してデータルックアップ要求を作成できません。\ndisplayer_editor_incompatible_settings=データ設定には互換性がありあｍせん。現在の設定は失われます。続行しますか?\ndisplayer_editor_tab_type=タイプ\ndisplayer_editor_tab_data=データ\ndisplayer_editor_tab_display=表示\ndisplayer_editor_view_as_table=テーブルとして表示\n\nrenderer_selector_title=レンダラーセレクター\n\ndisplayerlocator_default_renderer_undeclared={0} ディスプレイヤーのデフォルトレンダラーが宣言されていません。\ndisplayerlocator_unsupported_displayer_renderer={0} ディスプレイヤーは {1} レンダラーでサポートされていません。\n\nrendererliblocator_renderer_not_found={0} レンダラーが見つかりません。\nrendererliblocator_multiple_renderers_found=複数のレンダラー実装が見つかりました: {0}\nrenderermanager_renderer_not_available=タイプ:  {0} で利用可能なレンダラーがありません。\n\ndisplayerviewer_displayer_not_created=ディスプレイヤーを作成できませんでした。\n\nexpand=展開\ncollapse=折りたたむ\nremoveFilter=フィルターの削除";
      }
      public String getName() {
        return "getContents";
      }
    }
    ;
  }
  private static class getContentsInitializer {
    static {
      _instance0.getContentsInitializer();
    }
    static com.google.gwt.resources.client.TextResource get() {
      return getContents;
    }
  }
  public com.google.gwt.resources.client.TextResource getContents() {
    return getContentsInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.google.gwt.resources.client.TextResource getContents;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      getContents(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("getContents", getContents());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'getContents': return this.@org.jboss.errai.ui.client.local.spi.TranslationServiceImpl.org_dashbuilder_displayer_client_resources_i18n_CommonConstants_ja_properties::getContents()();
    }
    return null;
  }-*/;
}
