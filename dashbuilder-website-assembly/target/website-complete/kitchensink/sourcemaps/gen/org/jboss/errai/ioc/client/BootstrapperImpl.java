package org.jboss.errai.ioc.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HeaderPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.web.bindery.event.shared.EventBus;
import elemental2.dom.HTMLAnchorElement;
import elemental2.dom.HTMLButtonElement;
import elemental2.dom.HTMLDivElement;
import elemental2.dom.HTMLDocument;
import elemental2.dom.HTMLElement;
import elemental2.dom.HTMLFormElement;
import elemental2.dom.HTMLHeadingElement;
import elemental2.dom.HTMLIFrameElement;
import elemental2.dom.HTMLInputElement;
import elemental2.dom.HTMLLIElement;
import elemental2.dom.HTMLOListElement;
import elemental2.dom.HTMLOptionElement;
import elemental2.dom.HTMLParagraphElement;
import elemental2.dom.HTMLPreElement;
import elemental2.dom.HTMLSelectElement;
import elemental2.dom.HTMLTextAreaElement;
import elemental2.dom.HTMLUListElement;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.enterprise.event.Event;
import javax.enterprise.inject.Instance;
import org.dashbuilder.client.RuntimeClientLoader;
import org.dashbuilder.client.RuntimeCommunication;
import org.dashbuilder.client.RuntimeEntryPoint;
import org.dashbuilder.client.RuntimeModelBackendAppLoader;
import org.dashbuilder.client.RuntimeModelContentListener;
import org.dashbuilder.client.channel.RuntimeChannelClient;
import org.dashbuilder.client.editor.AreaChartDragComponent;
import org.dashbuilder.client.editor.BarChartDragComponent;
import org.dashbuilder.client.editor.BubbleChartDragComponent;
import org.dashbuilder.client.editor.DisplayerDragComponent;
import org.dashbuilder.client.editor.DisplayerEditorEntryPoint;
import org.dashbuilder.client.editor.LineChartDragComponent;
import org.dashbuilder.client.editor.MapChartDragComponent;
import org.dashbuilder.client.editor.MeterChartDragComponent;
import org.dashbuilder.client.editor.MetricDragComponent;
import org.dashbuilder.client.editor.PerspectiveEditorReportingGroupProvider;
import org.dashbuilder.client.editor.PieChartDragComponent;
import org.dashbuilder.client.editor.SelectorDragComponent;
import org.dashbuilder.client.editor.TableDragComponent;
import org.dashbuilder.client.editor.external.ComponentGroupProducer;
import org.dashbuilder.client.editor.external.ExternalDisplayerDragComponent;
import org.dashbuilder.client.editor.external.ExternalDragComponent;
import org.dashbuilder.client.error.DefaultRuntimeErrorCallback;
import org.dashbuilder.client.error.ErrorResponseVerifier;
import org.dashbuilder.client.external.CSVParser;
import org.dashbuilder.client.external.ExternalDataSetClientProvider;
import org.dashbuilder.client.marshalling.ClientDataSetMetadataJSONMarshaller;
import org.dashbuilder.client.navbar.AppNavBar;
import org.dashbuilder.client.navbar.DashboardListMenuBuilder;
import org.dashbuilder.client.navbar.GoToDashboardMenuBuilder;
import org.dashbuilder.client.navbar.MenuBuilderHelper;
import org.dashbuilder.client.navbar.NavBarHelper;
import org.dashbuilder.client.navbar.RuntimeNavBrand;
import org.dashbuilder.client.navigation.impl.NavigationManagerImpl;
import org.dashbuilder.client.navigation.layout.editor.NavCarouselDragComponent;
import org.dashbuilder.client.navigation.layout.editor.NavMenuBarDragComponent;
import org.dashbuilder.client.navigation.layout.editor.NavTabListDragComponent;
import org.dashbuilder.client.navigation.layout.editor.NavTilesDragComponent;
import org.dashbuilder.client.navigation.layout.editor.NavTreeDragComponent;
import org.dashbuilder.client.navigation.plugin.PerspectivePluginEntryPoint;
import org.dashbuilder.client.navigation.plugin.PerspectivePluginManagerImpl;
import org.dashbuilder.client.navigation.widget.NavCarouselWidget;
import org.dashbuilder.client.navigation.widget.NavCarouselWidgetView;
import org.dashbuilder.client.navigation.widget.NavComponentConfigModal;
import org.dashbuilder.client.navigation.widget.NavComponentConfigModalView;
import org.dashbuilder.client.navigation.widget.NavDropDownWidget;
import org.dashbuilder.client.navigation.widget.NavDropDownWidgetView;
import org.dashbuilder.client.navigation.widget.NavItemTileWidget;
import org.dashbuilder.client.navigation.widget.NavItemTileWidgetView;
import org.dashbuilder.client.navigation.widget.NavMenuBarWidget;
import org.dashbuilder.client.navigation.widget.NavMenuBarWidgetView;
import org.dashbuilder.client.navigation.widget.NavTabListWidget;
import org.dashbuilder.client.navigation.widget.NavTabListWidgetView;
import org.dashbuilder.client.navigation.widget.NavTilesWidget;
import org.dashbuilder.client.navigation.widget.NavTilesWidgetView;
import org.dashbuilder.client.navigation.widget.NavTreeWidget;
import org.dashbuilder.client.navigation.widget.NavTreeWidgetView;
import org.dashbuilder.client.navigation.widget.editor.NavItemDefaultEditor;
import org.dashbuilder.client.navigation.widget.editor.NavItemDefaultEditorView;
import org.dashbuilder.client.navigation.widget.editor.NavRootNodeEditor;
import org.dashbuilder.client.navigation.widget.editor.NavRootNodeEditorView;
import org.dashbuilder.client.navigation.widget.editor.NavTreeEditor;
import org.dashbuilder.client.navigation.widget.editor.NavTreeEditorView;
import org.dashbuilder.client.navigation.widget.editor.TargetPerspectiveEditor;
import org.dashbuilder.client.navigation.widget.editor.TargetPerspectiveEditorView;
import org.dashbuilder.client.parser.JSONRuntimeModelClientParser;
import org.dashbuilder.client.parser.PropertyReplacementService;
import org.dashbuilder.client.parser.RuntimeModelClientParserFactory;
import org.dashbuilder.client.parser.YAMLRuntimeModelClientParser;
import org.dashbuilder.client.perspective.ContentErrorPerspective;
import org.dashbuilder.client.perspective.ContentErrorPerspectiveActivity;
import org.dashbuilder.client.perspective.DashboardsListPerspective;
import org.dashbuilder.client.perspective.DashboardsListPerspectiveActivity;
import org.dashbuilder.client.perspective.EmptyPerspective;
import org.dashbuilder.client.perspective.EmptyPerspectiveActivity;
import org.dashbuilder.client.perspective.NotFoundPerspective;
import org.dashbuilder.client.perspective.NotFoundPerspectiveActivity;
import org.dashbuilder.client.perspective.RouterPerspective;
import org.dashbuilder.client.perspective.RouterPerspectiveActivity;
import org.dashbuilder.client.perspective.RuntimePerspective;
import org.dashbuilder.client.perspective.RuntimePerspectiveActivity;
import org.dashbuilder.client.perspective.generator.RuntimePerspectiveGenerator;
import org.dashbuilder.client.plugins.RuntimePerspectivePluginManager;
import org.dashbuilder.client.screens.ContentErrorScreen;
import org.dashbuilder.client.screens.ContentErrorScreenActivity;
import org.dashbuilder.client.screens.DashboardsListScreen;
import org.dashbuilder.client.screens.DashboardsListScreenActivity;
import org.dashbuilder.client.screens.EmptyScreen;
import org.dashbuilder.client.screens.EmptyScreenActivity;
import org.dashbuilder.client.screens.NotFoundScreen;
import org.dashbuilder.client.screens.NotFoundScreenActivity;
import org.dashbuilder.client.screens.RouterScreen;
import org.dashbuilder.client.screens.RouterScreenActivity;
import org.dashbuilder.client.screens.RuntimeScreen;
import org.dashbuilder.client.screens.RuntimeScreenActivity;
import org.dashbuilder.client.screens.view.ContentErrorScreenView;
import org.dashbuilder.client.screens.view.DashboardsListScreenView;
import org.dashbuilder.client.screens.view.EmptyScreenView;
import org.dashbuilder.client.screens.view.NotFoundScreenView;
import org.dashbuilder.client.screens.view.RouterScreenView;
import org.dashbuilder.client.screens.view.RuntimeScreenView;
import org.dashbuilder.client.services.RuntimeBackendComponentFunctionService;
import org.dashbuilder.client.services.RuntimeDataSetClientServices;
import org.dashbuilder.client.services.dummy.RuntimeRendererSettingsService;
import org.dashbuilder.client.widgets.DashboardCard;
import org.dashbuilder.client.widgets.UploadWidget;
import org.dashbuilder.client.widgets.view.DashboardCardView;
import org.dashbuilder.client.widgets.view.UploadWidgetView;
import org.dashbuilder.common.client.backend.PathUrlFactory;
import org.dashbuilder.common.client.editor.ToggleSwitchEditor;
import org.dashbuilder.common.client.editor.ToggleSwitchEditorView;
import org.dashbuilder.common.client.editor.ValueBoxEditor;
import org.dashbuilder.common.client.editor.ValueBoxEditorView;
import org.dashbuilder.common.client.editor.file.FileUploadEditor;
import org.dashbuilder.common.client.editor.file.FileUploadEditorView;
import org.dashbuilder.common.client.editor.list.DropDownEditor;
import org.dashbuilder.common.client.editor.list.DropDownEditorView;
import org.dashbuilder.common.client.editor.list.DropDownImageListEditor;
import org.dashbuilder.common.client.editor.list.DropDownImageListEditorView;
import org.dashbuilder.common.client.editor.list.HorizImageListEditor;
import org.dashbuilder.common.client.editor.list.HorizImageListEditorView;
import org.dashbuilder.common.client.editor.map.MapEditor;
import org.dashbuilder.common.client.editor.map.MapEditorView;
import org.dashbuilder.common.client.widgets.AlertBox;
import org.dashbuilder.common.client.widgets.AlertBoxView;
import org.dashbuilder.common.client.widgets.AlertPanel;
import org.dashbuilder.common.client.widgets.AlertPanelView;
import org.dashbuilder.common.client.widgets.FilterLabel;
import org.dashbuilder.common.client.widgets.FilterLabelSet;
import org.dashbuilder.common.client.widgets.FilterLabelSetView;
import org.dashbuilder.common.client.widgets.FilterLabelView;
import org.dashbuilder.common.client.widgets.LoadingBox;
import org.dashbuilder.common.client.widgets.LoadingBoxView;
import org.dashbuilder.dataset.client.ClientDataSetManager;
import org.dashbuilder.dataset.client.DataSetClientServicesImpl;
import org.dashbuilder.dataset.client.engine.ClientChronometer;
import org.dashbuilder.dataset.client.engine.ClientDateFormatterImpl;
import org.dashbuilder.dataset.client.engine.ClientIntervalBuilderDynamicDate;
import org.dashbuilder.dataset.client.engine.ClientIntervalBuilderLocator;
import org.dashbuilder.dataset.client.uuid.ClientUUIDGenerator;
import org.dashbuilder.dataset.engine.function.AggregateFunctionManagerImpl;
import org.dashbuilder.dataset.engine.group.IntervalBuilderDynamicLabel;
import org.dashbuilder.dataset.engine.group.IntervalBuilderFixedDate;
import org.dashbuilder.displayer.client.ClientSettings;
import org.dashbuilder.displayer.client.DisplayerClientEntryPoint;
import org.dashbuilder.displayer.client.DisplayerCoordinator;
import org.dashbuilder.displayer.client.DisplayerLocator;
import org.dashbuilder.displayer.client.DisplayerScreenPresenter;
import org.dashbuilder.displayer.client.PerspectiveCoordinator;
import org.dashbuilder.displayer.client.RendererManager;
import org.dashbuilder.displayer.client.component.ExternalComponentDispatcher;
import org.dashbuilder.displayer.client.component.ExternalComponentMessageHelperProducer;
import org.dashbuilder.displayer.client.component.function.BackendFunctionLoader;
import org.dashbuilder.displayer.client.component.function.ComponentFunctionLocator;
import org.dashbuilder.displayer.client.component.function.GWTVersion;
import org.dashbuilder.displayer.client.component.function.ListFunctions;
import org.dashbuilder.displayer.client.formatter.ValueFormatterRegistry;
import org.dashbuilder.displayer.client.prototypes.DataSetPrototypes;
import org.dashbuilder.displayer.client.prototypes.DisplayerPrototypes;
import org.dashbuilder.displayer.client.widgets.DataSetLookupEditor;
import org.dashbuilder.displayer.client.widgets.DataSetLookupEditorView;
import org.dashbuilder.displayer.client.widgets.DisplayerEditor;
import org.dashbuilder.displayer.client.widgets.DisplayerEditorPopup;
import org.dashbuilder.displayer.client.widgets.DisplayerEditorStatus;
import org.dashbuilder.displayer.client.widgets.DisplayerEditorView;
import org.dashbuilder.displayer.client.widgets.DisplayerError;
import org.dashbuilder.displayer.client.widgets.DisplayerErrorWidget;
import org.dashbuilder.displayer.client.widgets.DisplayerHtmlEditor;
import org.dashbuilder.displayer.client.widgets.DisplayerHtmlEditorView;
import org.dashbuilder.displayer.client.widgets.DisplayerSettingsEditor;
import org.dashbuilder.displayer.client.widgets.DisplayerSettingsEditorView;
import org.dashbuilder.displayer.client.widgets.DisplayerSettingsJSONSourceViewer;
import org.dashbuilder.displayer.client.widgets.DisplayerSubtypeSelector;
import org.dashbuilder.displayer.client.widgets.DisplayerSubtypeSelectorView;
import org.dashbuilder.displayer.client.widgets.DisplayerTypeSelector;
import org.dashbuilder.displayer.client.widgets.DisplayerTypeSelectorView;
import org.dashbuilder.displayer.client.widgets.DisplayerViewer;
import org.dashbuilder.displayer.client.widgets.ExternalComponentEditor;
import org.dashbuilder.displayer.client.widgets.ExternalComponentEditorPopUp;
import org.dashbuilder.displayer.client.widgets.ExternalComponentEditorView;
import org.dashbuilder.displayer.client.widgets.ExternalComponentPresenter;
import org.dashbuilder.displayer.client.widgets.ExternalComponentPropertiesEditor;
import org.dashbuilder.displayer.client.widgets.ExternalComponentPropertiesEditorView;
import org.dashbuilder.displayer.client.widgets.ExternalComponentView;
import org.dashbuilder.displayer.client.widgets.RendererSelector;
import org.dashbuilder.displayer.client.widgets.RendererSelectorListBoxView;
import org.dashbuilder.displayer.client.widgets.RendererSelectorRadioListView;
import org.dashbuilder.displayer.client.widgets.RendererSelectorTabListView;
import org.dashbuilder.displayer.client.widgets.filter.ColumnFilterEditor;
import org.dashbuilder.displayer.client.widgets.filter.ColumnFilterEditorView;
import org.dashbuilder.displayer.client.widgets.filter.DataSetFilterEditor;
import org.dashbuilder.displayer.client.widgets.filter.DataSetFilterEditorView;
import org.dashbuilder.displayer.client.widgets.filter.DateParameterEditor;
import org.dashbuilder.displayer.client.widgets.filter.DateParameterEditorView;
import org.dashbuilder.displayer.client.widgets.filter.LikeToFunctionEditor;
import org.dashbuilder.displayer.client.widgets.filter.LikeToFunctionEditorView;
import org.dashbuilder.displayer.client.widgets.filter.MultipleNumberParameterEditor;
import org.dashbuilder.displayer.client.widgets.filter.MultipleNumberParameterEditorView;
import org.dashbuilder.displayer.client.widgets.filter.MultipleTextParameterEditor;
import org.dashbuilder.displayer.client.widgets.filter.MultipleTextParameterEditorView;
import org.dashbuilder.displayer.client.widgets.filter.NumberParameterEditor;
import org.dashbuilder.displayer.client.widgets.filter.NumberParameterEditorView;
import org.dashbuilder.displayer.client.widgets.filter.TextParameterEditor;
import org.dashbuilder.displayer.client.widgets.filter.TextParameterEditorView;
import org.dashbuilder.displayer.client.widgets.filter.TimeAmountEditor;
import org.dashbuilder.displayer.client.widgets.filter.TimeAmountEditorView;
import org.dashbuilder.displayer.client.widgets.filter.TimeFrameEditor;
import org.dashbuilder.displayer.client.widgets.filter.TimeFrameEditorView;
import org.dashbuilder.displayer.client.widgets.filter.TimeInstantEditor;
import org.dashbuilder.displayer.client.widgets.filter.TimeInstantEditorView;
import org.dashbuilder.displayer.client.widgets.group.ColumnDetailsEditor;
import org.dashbuilder.displayer.client.widgets.group.ColumnDetailsEditorView;
import org.dashbuilder.displayer.client.widgets.group.ColumnFunctionEditor;
import org.dashbuilder.displayer.client.widgets.group.ColumnFunctionEditorView;
import org.dashbuilder.displayer.client.widgets.group.DataSetGroupDateEditor;
import org.dashbuilder.displayer.client.widgets.group.DataSetGroupDateEditorView;
import org.dashbuilder.displayer.client.widgets.sourcecode.DefaultHtmlValidator;
import org.dashbuilder.displayer.client.widgets.sourcecode.DefaultJsEvaluator;
import org.dashbuilder.displayer.client.widgets.sourcecode.DefaultJsValidator;
import org.dashbuilder.displayer.client.widgets.sourcecode.SourceCodeEditor;
import org.dashbuilder.displayer.client.widgets.sourcecode.SourceCodeEditorView;
import org.dashbuilder.displayer.external.ExternalComponentMessageHelper;
import org.dashbuilder.renderer.c3.client.C3Renderer;
import org.dashbuilder.renderer.c3.client.charts.area.C3AreaChartDisplayer;
import org.dashbuilder.renderer.c3.client.charts.area.C3AreaChartView;
import org.dashbuilder.renderer.c3.client.charts.bar.C3BarChartDisplayer;
import org.dashbuilder.renderer.c3.client.charts.bar.C3BarChartView;
import org.dashbuilder.renderer.c3.client.charts.bubble.C3BubbleChartDisplayer;
import org.dashbuilder.renderer.c3.client.charts.bubble.C3BubbleChartView;
import org.dashbuilder.renderer.c3.client.charts.line.C3LineChartDisplayer;
import org.dashbuilder.renderer.c3.client.charts.line.C3LineChartView;
import org.dashbuilder.renderer.c3.client.charts.map.D3MapDisplayer;
import org.dashbuilder.renderer.c3.client.charts.map.D3MapDisplayerView;
import org.dashbuilder.renderer.c3.client.charts.map.geojson.impl.CountriesGeoJsonServiceImpl;
import org.dashbuilder.renderer.c3.client.charts.map.geojson.impl.GWTGeoJsonLoader;
import org.dashbuilder.renderer.c3.client.charts.map.widgets.D3Map;
import org.dashbuilder.renderer.c3.client.charts.map.widgets.MapTooltip;
import org.dashbuilder.renderer.c3.client.charts.meter.C3MeterChartDisplayer;
import org.dashbuilder.renderer.c3.client.charts.meter.C3MeterView;
import org.dashbuilder.renderer.c3.client.charts.pie.C3PieChartDisplayer;
import org.dashbuilder.renderer.c3.client.charts.pie.C3PieChartView;
import org.dashbuilder.renderer.c3.client.jsbinding.C3JsTypesFactory;
import org.dashbuilder.renderer.c3.mutationobserver.MutationObserverFactory;
import org.dashbuilder.renderer.client.DefaultRenderer;
import org.dashbuilder.renderer.client.external.ExternalComponentDisplayer;
import org.dashbuilder.renderer.client.external.ExternalComponentDisplayerView;
import org.dashbuilder.renderer.client.metric.MetricDisplayer;
import org.dashbuilder.renderer.client.metric.MetricView;
import org.dashbuilder.renderer.client.selector.SelectorDisplayer;
import org.dashbuilder.renderer.client.selector.SelectorDisplayerView;
import org.dashbuilder.renderer.client.selector.SelectorDropDownDisplayer;
import org.dashbuilder.renderer.client.selector.SelectorDropDownDisplayerView;
import org.dashbuilder.renderer.client.selector.SelectorDropDownItem;
import org.dashbuilder.renderer.client.selector.SelectorDropDownItemView;
import org.dashbuilder.renderer.client.selector.SelectorLabelItem;
import org.dashbuilder.renderer.client.selector.SelectorLabelItemView;
import org.dashbuilder.renderer.client.selector.SelectorLabelSetDisplayer;
import org.dashbuilder.renderer.client.selector.SelectorLabelSetDisplayerView;
import org.dashbuilder.renderer.client.selector.SelectorSliderDisplayer;
import org.dashbuilder.renderer.client.selector.SelectorSliderDisplayerView;
import org.dashbuilder.renderer.client.table.TableDisplayer;
import org.dashbuilder.renderer.client.table.TableDisplayerView;
import org.dashbuilder.shared.marshalling.RuntimeModelJSONMarshaller;
import org.gwtbootstrap3.client.ui.CheckBox;
import org.gwtbootstrap3.client.ui.TextBox;
import org.jboss.errai.bus.client.api.ClientMessageBus;
import org.jboss.errai.bus.client.api.messaging.RequestDispatcher;
import org.jboss.errai.common.client.api.BatchCaller;
import org.jboss.errai.common.client.api.Caller;
import org.jboss.errai.common.client.dom.Anchor;
import org.jboss.errai.common.client.dom.Div;
import org.jboss.errai.common.client.dom.Document;
import org.jboss.errai.common.client.dom.Heading;
import org.jboss.errai.common.client.dom.Image;
import org.jboss.errai.common.client.dom.Input;
import org.jboss.errai.common.client.dom.Label;
import org.jboss.errai.common.client.dom.ListItem;
import org.jboss.errai.common.client.dom.NumberInput;
import org.jboss.errai.common.client.dom.OrderedList;
import org.jboss.errai.common.client.dom.Paragraph;
import org.jboss.errai.common.client.dom.Span;
import org.jboss.errai.common.client.dom.TextArea;
import org.jboss.errai.common.client.dom.TextInput;
import org.jboss.errai.common.client.dom.UnorderedList;
import org.jboss.errai.common.client.dom.elemental2.Elemental2DomUtil;
import org.jboss.errai.databinding.client.DataBinderProvider;
import org.jboss.errai.databinding.client.DataBindingModuleBootstrapper;
import org.jboss.errai.databinding.client.ListComponentProvider;
import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.databinding.client.components.ListComponent;
import org.jboss.errai.enterprise.client.cdi.CDIEventTypeLookup;
import org.jboss.errai.enterprise.client.cdi.EventProvider;
import org.jboss.errai.enterprise.client.cdi.InstanceProvider;
import org.jboss.errai.enterprise.client.cdi.JsTypeEventObserver;
import org.jboss.errai.enterprise.client.cdi.WindowEventObservers;
import org.jboss.errai.enterprise.client.cdi.api.CDI;
import org.jboss.errai.ioc.client.api.Disposer;
import org.jboss.errai.ioc.client.api.InitBallot;
import org.jboss.errai.ioc.client.api.ManagedInstance;
import org.jboss.errai.ioc.client.api.builtin.CallerProvider;
import org.jboss.errai.ioc.client.api.builtin.DisposerProvider;
import org.jboss.errai.ioc.client.api.builtin.IOCBeanManagerProvider;
import org.jboss.errai.ioc.client.api.builtin.InitBallotProvider;
import org.jboss.errai.ioc.client.api.builtin.ManagedInstanceProvider;
import org.jboss.errai.ioc.client.api.builtin.RootPanelProvider;
import org.jboss.errai.ioc.client.container.ApplicationScopedContext;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.ContextManagerImpl;
import org.jboss.errai.ioc.client.container.DependentScopeContext;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.JsTypeProvider;
import org.jboss.errai.ioc.client.container.SyncBeanManager;
import org.jboss.errai.ioc.client.lifecycle.impl.AccessImpl;
import org.jboss.errai.ioc.client.lifecycle.impl.CreationImpl;
import org.jboss.errai.ioc.client.lifecycle.impl.DestructionImpl;
import org.jboss.errai.ioc.client.lifecycle.impl.LifecycleListenerRegistrarImpl;
import org.jboss.errai.ioc.client.lifecycle.impl.StateChangeImpl;
import org.jboss.errai.ioc.support.bus.client.BatchCallerProvider;
import org.jboss.errai.ioc.support.bus.client.MessageBusProvider;
import org.jboss.errai.ioc.support.bus.client.RequestDispatcherProvider;
import org.jboss.errai.ioc.support.bus.client.Sender;
import org.jboss.errai.ioc.support.bus.client.SenderProvider;
import org.jboss.errai.ui.client.local.producer.Elemental2HTMLElementProvider;
import org.jboss.errai.ui.client.local.producer.HTMLElementProvider;
import org.jboss.errai.ui.client.local.spi.TranslationService;
import org.jboss.errai.ui.client.local.spi.TranslationServiceProvider;
import org.jboss.errai.ui.client.widget.ListWidget;
import org.jboss.errai.ui.client.widget.ListWidgetProvider;
import org.jboss.errai.ui.client.widget.LocaleListBox;
import org.jboss.errai.ui.client.widget.LocaleSelector;
import org.jboss.errai.ui.shared.ServerTemplateProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.uberfire.backend.vfs.Path;
import org.uberfire.backend.vfs.impl.ObservablePathImpl;
import org.uberfire.client.DocksEntryPoint;
import org.uberfire.client.WorkbenchBackendEntryPoint;
import org.uberfire.client.docks.UberfireDocksImpl;
import org.uberfire.client.docks.view.DocksBars;
import org.uberfire.client.docks.view.menu.MenuBuilder;
import org.uberfire.client.menu.CustomSplashHelp;
import org.uberfire.client.menu.SplashScreenMenuPresenter;
import org.uberfire.client.menu.WorkbenchViewModeSwitcherMenuBuilder;
import org.uberfire.client.menu.WorkbenchViewModeSwitcherPresenter;
import org.uberfire.client.mvp.Activity;
import org.uberfire.client.mvp.ActivityBeansCache;
import org.uberfire.client.mvp.ActivityBeansInfo;
import org.uberfire.client.mvp.ActivityLifecycleErrorHandler;
import org.uberfire.client.mvp.ActivityManagerImpl;
import org.uberfire.client.mvp.CategoriesManagerCache;
import org.uberfire.client.mvp.LockDemandDetector;
import org.uberfire.client.mvp.LockTarget;
import org.uberfire.client.mvp.LockTarget.TitleProvider;
import org.uberfire.client.mvp.PerspectiveActivity;
import org.uberfire.client.mvp.PerspectiveManagerImpl;
import org.uberfire.client.mvp.PlaceHistoryHandler;
import org.uberfire.client.mvp.PlaceManager;
import org.uberfire.client.mvp.PlaceManagerImpl;
import org.uberfire.client.mvp.PlaceRequestHistoryMapperImpl;
import org.uberfire.client.mvp.PlaceStatus;
import org.uberfire.client.mvp.ResourceTypeManagerCache;
import org.uberfire.client.mvp.WorkbenchActivity;
import org.uberfire.client.promise.Promises;
import org.uberfire.client.resources.i18n.PermissionTreeI18NImpl;
import org.uberfire.client.util.Clipboard;
import org.uberfire.client.util.Cookie;
import org.uberfire.client.views.pfly.HTML5DndSeleniumSupport;
import org.uberfire.client.views.pfly.PatternFlyEntryPoint;
import org.uberfire.client.views.pfly.dnd.CompassWidgetImpl;
import org.uberfire.client.views.pfly.listbar.ListBarWidgetImpl;
import org.uberfire.client.views.pfly.menu.PartContextMenusView;
import org.uberfire.client.views.pfly.menu.SplashScreenMenuView;
import org.uberfire.client.views.pfly.menu.UtilityMenuBarView;
import org.uberfire.client.views.pfly.menu.WorkbenchMenuBarView;
import org.uberfire.client.views.pfly.menu.WorkbenchMenuCompactNavBarView;
import org.uberfire.client.views.pfly.menu.WorkbenchMenuStandardNavBarView;
import org.uberfire.client.views.pfly.menu.WorkbenchViewModeSwitcherView;
import org.uberfire.client.views.pfly.menu.megamenu.WorkbenchMegaMenuView;
import org.uberfire.client.views.pfly.menu.megamenu.contextmenuitem.ChildContextMenuItemView;
import org.uberfire.client.views.pfly.menu.megamenu.contextmenuitem.GroupContextMenuItemView;
import org.uberfire.client.views.pfly.menu.megamenu.menuitem.ChildMenuItemView;
import org.uberfire.client.views.pfly.menu.megamenu.menuitem.GroupMenuItemView;
import org.uberfire.client.views.pfly.menu.megamenu.menuitem.IconMenuItemView;
import org.uberfire.client.views.pfly.modal.Bs3Modal;
import org.uberfire.client.views.pfly.multipage.MultiPageEditorImpl;
import org.uberfire.client.views.pfly.multipage.MultiPageEditorViewImpl;
import org.uberfire.client.views.pfly.multiscreen.MultiScreenMenuBuilder;
import org.uberfire.client.views.pfly.multiscreen.MultiScreenPartWidget;
import org.uberfire.client.views.pfly.multiscreen.MultiScreenView;
import org.uberfire.client.views.pfly.notfound.ActivityNotFoundView;
import org.uberfire.client.views.pfly.notifications.NotificationPopupsManagerView;
import org.uberfire.client.views.pfly.popup.PopupViewImpl;
import org.uberfire.client.views.pfly.splash.SplashModalFooter;
import org.uberfire.client.views.pfly.splash.SplashViewImpl;
import org.uberfire.client.views.pfly.tab.MultiTabWorkbenchPanelView;
import org.uberfire.client.views.pfly.tab.ResizeTabPanel;
import org.uberfire.client.views.pfly.tab.TabPanelWithDropdowns;
import org.uberfire.client.views.pfly.tab.UberTabPanel;
import org.uberfire.client.views.pfly.toolbar.WorkbenchToolBarView;
import org.uberfire.client.views.pfly.widgets.Button;
import org.uberfire.client.views.pfly.widgets.ConfirmPopup;
import org.uberfire.client.views.pfly.widgets.DateRangePicker;
import org.uberfire.client.views.pfly.widgets.DropdownMenu;
import org.uberfire.client.views.pfly.widgets.DropdownMenuItem;
import org.uberfire.client.views.pfly.widgets.Elemental2Producer;
import org.uberfire.client.views.pfly.widgets.ErrorPopup;
import org.uberfire.client.views.pfly.widgets.ErrorPopupView;
import org.uberfire.client.views.pfly.widgets.FormGroup;
import org.uberfire.client.views.pfly.widgets.FormLabel;
import org.uberfire.client.views.pfly.widgets.InlineNotification;
import org.uberfire.client.views.pfly.widgets.InputAutocomplete;
import org.uberfire.client.views.pfly.widgets.JQueryElementalProducer.JQuery;
import org.uberfire.client.views.pfly.widgets.KebabMenu;
import org.uberfire.client.views.pfly.widgets.KebabMenuItem;
import org.uberfire.client.views.pfly.widgets.Modal;
import org.uberfire.client.views.pfly.widgets.SanitizedNumberInput;
import org.uberfire.client.views.pfly.widgets.Select;
import org.uberfire.client.workbench.DefaultBeanFactory;
import org.uberfire.client.workbench.LayoutSelection;
import org.uberfire.client.workbench.PanelManagerImpl;
import org.uberfire.client.workbench.StandaloneEditorPerspective;
import org.uberfire.client.workbench.Workbench;
import org.uberfire.client.workbench.WorkbenchLayoutImpl;
import org.uberfire.client.workbench.WorkbenchLayoutInfoImpl;
import org.uberfire.client.workbench.WorkbenchServicesProxyClientImpl;
import org.uberfire.client.workbench.docks.UberfireDocksContainer;
import org.uberfire.client.workbench.panels.impl.AdaptiveWorkbenchPanelPresenter;
import org.uberfire.client.workbench.panels.impl.AdaptiveWorkbenchPanelView;
import org.uberfire.client.workbench.panels.impl.ClosableSimpleWorkbenchPanelPresenter;
import org.uberfire.client.workbench.panels.impl.ClosableSimpleWorkbenchPanelView;
import org.uberfire.client.workbench.panels.impl.ImmutableWorkbenchPanelPresenter;
import org.uberfire.client.workbench.panels.impl.ImmutableWorkbenchPanelView;
import org.uberfire.client.workbench.panels.impl.LayoutPanelPresenter;
import org.uberfire.client.workbench.panels.impl.LayoutPanelView;
import org.uberfire.client.workbench.panels.impl.MultiListWorkbenchPanelPresenter;
import org.uberfire.client.workbench.panels.impl.MultiListWorkbenchPanelView;
import org.uberfire.client.workbench.panels.impl.MultiScreenWorkbenchPanelPresenter;
import org.uberfire.client.workbench.panels.impl.MultiScreenWorkbenchPanelView;
import org.uberfire.client.workbench.panels.impl.MultiTabWorkbenchPanelPresenter;
import org.uberfire.client.workbench.panels.impl.SimpleDnDWorkbenchPanelPresenter;
import org.uberfire.client.workbench.panels.impl.SimpleDnDWorkbenchPanelView;
import org.uberfire.client.workbench.panels.impl.SimpleNoExpandWorkbenchPanelPresenter;
import org.uberfire.client.workbench.panels.impl.SimpleNoExpandWorkbenchPanelView;
import org.uberfire.client.workbench.panels.impl.SimpleWorkbenchPanelPresenter;
import org.uberfire.client.workbench.panels.impl.SimpleWorkbenchPanelView;
import org.uberfire.client.workbench.panels.impl.SplitLayoutPanelPresenter;
import org.uberfire.client.workbench.panels.impl.SplitLayoutPanelView;
import org.uberfire.client.workbench.panels.impl.StaticWorkbenchPanelPresenter;
import org.uberfire.client.workbench.panels.impl.StaticWorkbenchPanelView;
import org.uberfire.client.workbench.panels.impl.TemplatedWorkbenchPanelPresenter;
import org.uberfire.client.workbench.panels.impl.TemplatedWorkbenchPanelView;
import org.uberfire.client.workbench.panels.impl.UnanchoredStaticWorkbenchPanelPresenter;
import org.uberfire.client.workbench.panels.impl.UnanchoredStaticWorkbenchPanelView;
import org.uberfire.client.workbench.panels.support.PartManager;
import org.uberfire.client.workbench.pmgr.nswe.part.WorkbenchPartPresenterDefault;
import org.uberfire.client.workbench.pmgr.nswe.part.WorkbenchPartView;
import org.uberfire.client.workbench.pmgr.unanchored.part.UnanchoredWorkbenchPartPresenter;
import org.uberfire.client.workbench.pmgr.unanchored.part.UnanchoredWorkbenchPartView;
import org.uberfire.client.workbench.type.AnyResourceType;
import org.uberfire.client.workbench.type.ClientResourceType;
import org.uberfire.client.workbench.type.DotResourceType;
import org.uberfire.client.workbench.type.impl.ClientTypeRegistryImpl;
import org.uberfire.client.workbench.widgets.common.ErrorPopupPresenter;
import org.uberfire.client.workbench.widgets.dnd.CompassDropController;
import org.uberfire.client.workbench.widgets.dnd.WorkbenchDragAndDropManager;
import org.uberfire.client.workbench.widgets.dnd.WorkbenchPickupDragController;
import org.uberfire.client.workbench.widgets.listbar.ResizeFlowPanel;
import org.uberfire.client.workbench.widgets.menu.PartContextMenusPresenter;
import org.uberfire.client.workbench.widgets.menu.UtilityMenuBarPresenter;
import org.uberfire.client.workbench.widgets.menu.WorkbenchMenuBarPresenter;
import org.uberfire.client.workbench.widgets.menu.WorkbenchMenuBarProducer;
import org.uberfire.client.workbench.widgets.menu.megamenu.WorkbenchMegaMenuPresenter;
import org.uberfire.client.workbench.widgets.menu.megamenu.WorkbenchMegaMenuProducer;
import org.uberfire.client.workbench.widgets.menu.megamenu.contextmenuitem.ChildContextMenuItemPresenter;
import org.uberfire.client.workbench.widgets.menu.megamenu.contextmenuitem.GroupContextMenuItemPresenter;
import org.uberfire.client.workbench.widgets.menu.megamenu.menuitem.ChildMenuItemPresenter;
import org.uberfire.client.workbench.widgets.menu.megamenu.menuitem.GroupMenuItemPresenter;
import org.uberfire.client.workbench.widgets.menu.megamenu.menuitem.IconMenuItemPresenter;
import org.uberfire.client.workbench.widgets.notfound.ActivityNotFoundPresenter;
import org.uberfire.client.workbench.widgets.notifications.NotificationManager;
import org.uberfire.client.workbench.widgets.panel.StaticFocusedResizePanel;
import org.uberfire.client.workbench.widgets.toolbar.WorkbenchToolBarPresenter;
import org.uberfire.ext.editor.commons.client.BaseEditorEntryPoint;
import org.uberfire.ext.editor.commons.client.file.CopyPopUpViewProducer;
import org.uberfire.ext.editor.commons.client.file.exports.FileExportProducer;
import org.uberfire.ext.editor.commons.client.file.exports.ImageFileExport;
import org.uberfire.ext.editor.commons.client.file.exports.TextFileExport;
import org.uberfire.ext.editor.commons.client.file.exports.jso.FileExportScriptInjector;
import org.uberfire.ext.editor.commons.client.file.exports.svg.SvgFileExport;
import org.uberfire.ext.editor.commons.client.file.popups.CopyPopUpPresenter;
import org.uberfire.ext.editor.commons.client.file.popups.CopyPopUpPresenter.View;
import org.uberfire.ext.editor.commons.client.file.popups.CopyPopUpView;
import org.uberfire.ext.editor.commons.client.file.popups.DeletePopUpPresenter;
import org.uberfire.ext.editor.commons.client.file.popups.DeletePopUpView;
import org.uberfire.ext.editor.commons.client.file.popups.RenamePopUpPresenter;
import org.uberfire.ext.editor.commons.client.file.popups.RenamePopUpView;
import org.uberfire.ext.editor.commons.client.file.popups.SavePopUpPresenter;
import org.uberfire.ext.editor.commons.client.file.popups.SavePopUpView;
import org.uberfire.ext.editor.commons.client.htmleditor.HtmlEditorLibraryLoader;
import org.uberfire.ext.editor.commons.client.htmleditor.HtmlEditorPresenter;
import org.uberfire.ext.editor.commons.client.htmleditor.HtmlEditorView;
import org.uberfire.ext.editor.commons.client.htmleditor.HtmlResourceType;
import org.uberfire.ext.editor.commons.client.menu.BasicFileMenuBuilderImpl;
import org.uberfire.ext.editor.commons.client.menu.DownloadMenuItemBuilder;
import org.uberfire.ext.editor.commons.client.menu.common.CurrentBranchProducer;
import org.uberfire.ext.editor.commons.client.menu.common.SaveAndRenameCommandBuilder;
import org.uberfire.ext.editor.commons.client.template.mustache.ClientMustacheTemplateRenderer;
import org.uberfire.ext.editor.commons.client.validation.DefaultFileNameValidator;
import org.uberfire.ext.editor.commons.version.CurrentBranch;
import org.uberfire.ext.layout.editor.client.LayoutComponentPaletteScreen;
import org.uberfire.ext.layout.editor.client.LayoutComponentPaletteScreenActivity;
import org.uberfire.ext.layout.editor.client.LayoutEditorEntryPoint;
import org.uberfire.ext.layout.editor.client.LayoutEditorPluginImpl;
import org.uberfire.ext.layout.editor.client.LayoutEditorPresenter;
import org.uberfire.ext.layout.editor.client.LayoutEditorPropertiesScreen;
import org.uberfire.ext.layout.editor.client.LayoutEditorPropertiesScreenActivity;
import org.uberfire.ext.layout.editor.client.LayoutEditorView;
import org.uberfire.ext.layout.editor.client.components.columns.ColumnWithComponents;
import org.uberfire.ext.layout.editor.client.components.columns.ColumnWithComponentsView;
import org.uberfire.ext.layout.editor.client.components.columns.ComponentColumn;
import org.uberfire.ext.layout.editor.client.components.columns.ComponentColumnPart;
import org.uberfire.ext.layout.editor.client.components.columns.ComponentColumnView;
import org.uberfire.ext.layout.editor.client.components.container.Container;
import org.uberfire.ext.layout.editor.client.components.container.ContainerView;
import org.uberfire.ext.layout.editor.client.components.rows.EmptyDropRow;
import org.uberfire.ext.layout.editor.client.components.rows.EmptyDropRowView;
import org.uberfire.ext.layout.editor.client.components.rows.Row;
import org.uberfire.ext.layout.editor.client.components.rows.RowView;
import org.uberfire.ext.layout.editor.client.generator.BootstrapLayoutGenerator;
import org.uberfire.ext.layout.editor.client.generator.BootstrapLayoutGeneratorDriver;
import org.uberfire.ext.layout.editor.client.infra.DnDManager;
import org.uberfire.ext.layout.editor.client.infra.DragHelperComponentColumn;
import org.uberfire.ext.layout.editor.client.infra.LayoutDragComponentHelper;
import org.uberfire.ext.layout.editor.client.infra.LayoutEditorCssHelper;
import org.uberfire.ext.layout.editor.client.infra.LayoutEditorFocusController;
import org.uberfire.ext.layout.editor.client.widgets.KebabWidget;
import org.uberfire.ext.layout.editor.client.widgets.LayoutComponentPalettePresenter;
import org.uberfire.ext.layout.editor.client.widgets.LayoutComponentPaletteView;
import org.uberfire.ext.layout.editor.client.widgets.LayoutDragComponentGroupPresenter;
import org.uberfire.ext.layout.editor.client.widgets.LayoutDragComponentGroupView;
import org.uberfire.ext.layout.editor.client.widgets.LayoutDragComponentWidget;
import org.uberfire.ext.layout.editor.client.widgets.LayoutEditorPropertiesPresenter;
import org.uberfire.ext.layout.editor.client.widgets.LayoutEditorPropertiesView;
import org.uberfire.ext.layout.editor.client.widgets.LayoutElementPropertiesPresenter;
import org.uberfire.ext.layout.editor.client.widgets.LayoutElementPropertiesView;
import org.uberfire.ext.plugin.client.RuntimePluginsEntryPoint;
import org.uberfire.ext.plugin.client.perspective.editor.PerspectiveEditorPresenter;
import org.uberfire.ext.plugin.client.perspective.editor.PerspectiveEditorPresenterActivity;
import org.uberfire.ext.plugin.client.perspective.editor.PerspectiveEditorView;
import org.uberfire.ext.plugin.client.perspective.editor.api.PerspectiveEditorCoreGroupProvider;
import org.uberfire.ext.plugin.client.perspective.editor.api.PerspectiveEditorNavGroupProvider;
import org.uberfire.ext.plugin.client.perspective.editor.generator.PerspectiveEditorGenerator;
import org.uberfire.ext.plugin.client.perspective.editor.layout.editor.HTMLLayoutDragComponent;
import org.uberfire.ext.plugin.client.perspective.editor.layout.editor.PerspectiveEditorSettings;
import org.uberfire.ext.plugin.client.perspective.editor.layout.editor.ScreenLayoutDragComponent;
import org.uberfire.ext.plugin.client.perspective.editor.layout.editor.TargetDivDragComponent;
import org.uberfire.ext.plugin.client.perspective.editor.layout.editor.popups.EditHTMLPresenter;
import org.uberfire.ext.plugin.client.perspective.editor.layout.editor.popups.EditHTMLView;
import org.uberfire.ext.plugin.client.resources.i18n.PerspectiveEditorPaletteI18nImpl;
import org.uberfire.ext.plugin.client.type.PerspectiveLayoutPluginResourceType;
import org.uberfire.ext.plugin.client.validation.PluginNameValidator;
import org.uberfire.ext.properties.editor.client.PropertyEditorWidget;
import org.uberfire.ext.properties.editor.client.fields.BooleanField;
import org.uberfire.ext.properties.editor.client.fields.ColorField;
import org.uberfire.ext.properties.editor.client.fields.ComboField;
import org.uberfire.ext.properties.editor.client.fields.SecretTextField;
import org.uberfire.ext.properties.editor.client.fields.TextField;
import org.uberfire.ext.widgets.common.client.CommonsEntryPoint;
import org.uberfire.ext.widgets.common.client.ace.AceEditor;
import org.uberfire.ext.widgets.common.client.breadcrumbs.UberfireBreadcrumbs;
import org.uberfire.ext.widgets.common.client.breadcrumbs.UberfireBreadcrumbsView;
import org.uberfire.ext.widgets.common.client.breadcrumbs.header.UberfireBreadcrumbsContainerImpl;
import org.uberfire.ext.widgets.common.client.breadcrumbs.widget.DefaultBreadcrumbsPresenter;
import org.uberfire.ext.widgets.common.client.breadcrumbs.widget.DefaultBreadcrumbsView;
import org.uberfire.ext.widgets.common.client.common.BusyIndicatorView;
import org.uberfire.ext.widgets.common.client.dropdown.LiveSearchDropDown;
import org.uberfire.ext.widgets.common.client.dropdown.LiveSearchDropDownView;
import org.uberfire.ext.widgets.common.client.dropdown.PerspectiveDropDown;
import org.uberfire.ext.widgets.common.client.dropdown.footer.LiveSearchFooter;
import org.uberfire.ext.widgets.common.client.dropdown.footer.LiveSearchFooterViewImpl;
import org.uberfire.ext.widgets.common.client.dropdown.items.LiveSearchSelectorDropDownItem;
import org.uberfire.ext.widgets.common.client.dropdown.items.LiveSearchSelectorDropDownItemViewImpl;
import org.uberfire.ext.widgets.common.client.dropdown.noItems.NoItemsComponent;
import org.uberfire.ext.widgets.common.client.dropdown.noItems.NoItemsComponentViewImpl;
import org.uberfire.ext.widgets.common.client.menu.MenuItemDividerView;
import org.uberfire.ext.widgets.common.client.menu.MenuItemFactory;
import org.uberfire.ext.widgets.common.client.menu.MenuItemHeaderView;
import org.uberfire.ext.widgets.common.client.menu.MenuItemWithIconView;
import org.uberfire.ext.widgets.common.client.select.SelectComponent;
import org.uberfire.ext.widgets.common.client.select.SelectOptionComponent;
import org.uberfire.ext.widgets.common.client.select.SelectOptionView;
import org.uberfire.ext.widgets.common.client.select.SelectView;
import org.uberfire.ext.widgets.common.client.tables.FilterPagedTable;
import org.uberfire.ext.widgets.common.client.tables.PagedTable;
import org.uberfire.ext.widgets.common.client.tables.SimpleTable;
import org.uberfire.ext.widgets.common.client.tables.popup.NewFilterPopup;
import org.uberfire.ext.widgets.common.client.tables.popup.NewTabFilterPopup;
import org.uberfire.ext.widgets.table.client.TableEntryPoint;
import org.uberfire.mvp.Command;
import org.uberfire.mvp.PlaceRequest;
import org.uberfire.mvp.impl.ExternalPathPlaceRequest;
import org.uberfire.rpc.SessionInfo;
import org.uberfire.security.Resource;
import org.uberfire.security.ResourceAction;
import org.uberfire.security.ResourceType;
import org.uberfire.security.authz.ResourceActionRef;
import org.uberfire.security.authz.RuntimeResource;
import org.uberfire.workbench.category.Others;
import org.uberfire.workbench.category.Undefined;
import org.uberfire.workbench.model.ActivityResourceType;
import org.uberfire.workbench.model.AppFormerActivities;
import org.uberfire.workbench.model.AppFormerActivitiesProducer;
import org.uberfire.workbench.model.CompassPosition;
import org.uberfire.workbench.model.ContextDefinition;
import org.uberfire.workbench.model.ContextDisplayMode;
import org.uberfire.workbench.model.CustomPanelDefinition;
import org.uberfire.workbench.model.DefaultAppFormerActivities;
import org.uberfire.workbench.model.PanelDefinition;
import org.uberfire.workbench.model.PartDefinition;
import org.uberfire.workbench.model.PerspectiveDefinition;
import org.uberfire.workbench.model.Position;
import org.uberfire.workbench.model.impl.PanelDefinitionImpl;
import org.uberfire.workbench.model.menu.HasEnabledStateChangeListeners;
import org.uberfire.workbench.model.menu.MenuCustom;
import org.uberfire.workbench.model.menu.MenuGroup;
import org.uberfire.workbench.model.menu.MenuItem;
import org.uberfire.workbench.model.menu.MenuItemCommand;
import org.uberfire.workbench.model.menu.MenuItemPerspective;
import org.uberfire.workbench.model.menu.MenuItemPlain;
import org.uberfire.workbench.model.menu.MenuPosition;
import org.uberfire.workbench.model.menu.MenuVisitor;
import org.uberfire.workbench.model.menu.Menus;
import org.uberfire.workbench.model.menu.impl.DefaultMenuGroup;
import org.uberfire.workbench.model.menu.impl.DefaultMenus;
import org.uberfire.workbench.model.toolbar.ToolBar;
import org.uberfire.workbench.model.toolbar.ToolBarIcon;
import org.uberfire.workbench.model.toolbar.ToolBarItem;
import org.uberfire.workbench.type.ResourceTypeDefinition;

public class BootstrapperImpl implements Bootstrapper {
  {
    addLookups_0();
    new CDI().initLookupTable(CDIEventTypeLookup.get());
    new DataBindingModuleBootstrapper().run();
  }

  private ContextManager contextManager = new ContextManagerImpl();
  private static final Logger logger = LoggerFactory.getLogger(Bootstrapper.class);
  public abstract class Type_factory__o_u_c_u_Cookie__quals__j_e_i_Any_j_e_i_Default extends Factory<Cookie> { }
  public abstract class Type_factory__o_d_d_c_w_ExternalComponentPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<ExternalComponentPresenter> { }
  public abstract class Type_factory__o_u_e_l_e_c_c_c_ComponentColumnView__quals__j_e_i_Any_j_e_i_Default extends Factory<ComponentColumnView> { }
  public abstract class Type_factory__o_d_d_c_w_DisplayerEditorStatus__quals__j_e_i_Any_j_e_i_Default extends Factory<DisplayerEditorStatus> { }
  public abstract class Type_factory__o_d_c_m_ClientDataSetMetadataJSONMarshaller__quals__j_e_i_Any_j_e_i_Default extends Factory<ClientDataSetMetadataJSONMarshaller> { }
  public abstract class ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal extends Factory<Caller> { }
  public abstract class Producer_factory__o_j_e_b_c_a_ClientMessageBus__quals__j_e_i_Any_j_e_i_Default extends Factory<ClientMessageBus> { }
  public abstract class Type_factory__o_d_c_w_v_UploadWidgetView__quals__j_e_i_Any_j_e_i_Default extends Factory<UploadWidgetView> { }
  public abstract class JsType_factory__o_u_s_ResourceAction__quals__Universal extends Factory<ResourceAction> { }
  public abstract class Type_factory__o_u_e_l_e_c_LayoutEditorEntryPoint__quals__j_e_i_Any_j_e_i_Default extends Factory<LayoutEditorEntryPoint> { }
  public abstract class Type_factory__o_d_c_n_w_e_NavTreeEditorView__quals__j_e_i_Any_j_e_i_Default extends Factory<NavTreeEditorView> { }
  public abstract class Type_factory__o_u_c_w_Workbench__quals__j_e_i_Any_j_e_i_Default extends Factory<Workbench> { }
  public abstract class JsType_factory__o_u_s_a_ResourceActionRef__quals__Universal extends Factory<ResourceActionRef> { }
  public abstract class Type_factory__o_u_c_w_p_i_MultiListWorkbenchPanelPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<MultiListWorkbenchPanelPresenter> { }
  public abstract class Type_factory__o_d_d_e_g_IntervalBuilderDynamicLabel__quals__j_e_i_Any_j_e_i_Default extends Factory<IntervalBuilderDynamicLabel> { }
  public abstract class JsType_factory__o_u_s_ResourceType__quals__Universal extends Factory<ResourceType> { }
  public abstract class Type_factory__o_u_c_m_ActivityBeansInfo__quals__j_e_i_Any_j_e_i_Default extends Factory<ActivityBeansInfo> { }
  public abstract class Type_factory__o_u_e_w_c_c_m_MenuItemWithIconView__quals__j_e_i_Any_o_u_e_w_c_c_m_MenuItemWithIcon extends Factory<MenuItemWithIconView> { }
  public abstract class Type_factory__o_d_c_n_w_NavMenuBarWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<NavMenuBarWidget> { }
  public abstract class Type_factory__o_u_c_w_p_u_p_UnanchoredWorkbenchPartView__quals__j_e_i_Any_j_e_i_Default extends Factory<UnanchoredWorkbenchPartView> { }
  public abstract class Type_factory__o_u_e_l_e_c_c_c_ComponentColumnPart__quals__j_e_i_Any_j_e_i_Default extends Factory<ComponentColumnPart> { }
  public abstract class Type_factory__o_u_e_l_e_c_w_LayoutDragComponentGroupView__quals__j_e_i_Any_j_e_i_Default extends Factory<LayoutDragComponentGroupView> { }
  public abstract class ExtensionProvided_factory__o_g_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default extends Factory<TextBox> { }
  public abstract class Type_factory__o_d_c_c_e_m_MapEditorView__quals__j_e_i_Any_j_e_i_Default extends Factory<MapEditorView> { }
  public abstract class Type_factory__o_d_c_c_e_ToggleSwitchEditorView__quals__j_e_i_Any_j_e_i_Default extends Factory<ToggleSwitchEditorView> { }
  public abstract class Type_factory__o_u_c_v_p_w_Select__quals__j_e_i_Any_j_e_i_Default extends Factory<Select> { }
  public abstract class Type_factory__o_u_w_m_i_PanelDefinitionImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<PanelDefinitionImpl> { }
  public abstract class Type_factory__o_d_r_c_c_c_p_C3PieChartDisplayer__quals__j_e_i_Any_j_e_i_Default extends Factory<C3PieChartDisplayer> { }
  public abstract class Type_factory__o_u_c_v_p_w_ErrorPopupView__quals__j_e_i_Any_j_e_i_Default extends Factory<ErrorPopupView> { }
  public abstract class Type_factory__o_d_c_s_v_RouterScreenView__quals__j_e_i_Any_j_e_i_Default extends Factory<RouterScreenView> { }
  public abstract class Type_factory__o_d_c_n_w_NavCarouselWidgetView__quals__j_e_i_Any_j_e_i_Default extends Factory<NavCarouselWidgetView> { }
  public abstract class Type_factory__o_d_r_c_c_j_C3JsTypesFactory__quals__j_e_i_Any_j_e_i_Default extends Factory<C3JsTypesFactory> { }
  public abstract class Type_factory__o_u_c_v_p_m_MultiScreenView__quals__j_e_i_Any_j_e_i_Default extends Factory<MultiScreenView> { }
  public abstract class Type_factory__o_d_c_w_UploadWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<UploadWidget> { }
  public abstract class JsType_factory__o_u_w_m_m_MenuGroup__quals__Universal extends Factory<MenuGroup> { }
  public abstract class Type_factory__o_u_c_w_p_i_AdaptiveWorkbenchPanelView__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<AdaptiveWorkbenchPanelView> { }
  public abstract class Type_factory__o_d_c_n_p_PerspectivePluginEntryPoint__quals__j_e_i_Any_j_e_i_Default extends Factory<PerspectivePluginEntryPoint> { }
  public abstract class Type_factory__o_u_c_w_w_d_WorkbenchDragAndDropManager__quals__j_e_i_Any_j_e_i_Default extends Factory<WorkbenchDragAndDropManager> { }
  public abstract class Type_factory__o_d_c_n_w_NavTilesWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<NavTilesWidget> { }
  public abstract class Type_factory__o_u_e_l_e_c_LayoutEditorPropertiesScreen__quals__j_e_i_Any_j_e_i_Default extends Factory<LayoutEditorPropertiesScreen> { }
  public abstract class Type_factory__o_d_c_s_ContentErrorScreen__quals__j_e_i_Any_j_e_i_Default extends Factory<ContentErrorScreen> { }
  public abstract class Type_factory__o_u_e_w_c_c_s_SelectComponent__quals__j_e_i_Any_j_e_i_Default extends Factory<SelectComponent> { }
  public abstract class Type_factory__o_d_r_c_e_ExternalComponentDisplayerView__quals__j_e_i_Any_j_e_i_Default extends Factory<ExternalComponentDisplayerView> { }
  public abstract class Type_factory__o_u_c_m_PerspectiveManagerImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<PerspectiveManagerImpl> { }
  public abstract class Type_factory__o_u_c_w_w_c_ErrorPopupPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<ErrorPopupPresenter> { }
  public abstract class Type_factory__o_d_c_p_g_RuntimePerspectiveGenerator__quals__j_e_i_Any_j_e_i_Default extends Factory<RuntimePerspectiveGenerator> { }
  public abstract class Type_factory__o_d_r_c_c_c_m_C3MeterView__quals__j_e_i_Any_j_e_i_Default extends Factory<C3MeterView> { }
  public abstract class Type_factory__o_d_d_c_c_ExternalComponentMessageHelperProducer__quals__j_e_i_Any_j_e_i_Default extends Factory<ExternalComponentMessageHelperProducer> { }
  public abstract class Type_factory__o_d_c_e_e_ExternalDisplayerDragComponent__quals__j_e_i_Any_j_e_i_Default extends Factory<ExternalDisplayerDragComponent> { }
  public abstract class ContextualProvider_factory__j_e_e_Event__quals__Universal extends Factory<Event> { }
  public abstract class Type_factory__o_d_r_c_c_c_m_w_MapTooltip__quals__j_e_i_Any_j_e_i_Default extends Factory<MapTooltip> { }
  public abstract class Type_factory__o_d_c_s_RuntimeScreen__quals__j_e_i_Any_j_e_i_Default extends Factory<RuntimeScreen> { }
  public abstract class Type_factory__o_d_c_p_DashboardsListPerspectiveActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<DashboardsListPerspectiveActivity> { }
  public abstract class Type_factory__o_d_c_p_YAMLRuntimeModelClientParser__quals__j_e_i_Any_j_e_i_Default extends Factory<YAMLRuntimeModelClientParser> { }
  public abstract class Type_factory__o_d_c_p_ContentErrorPerspective__quals__j_e_i_Any_j_e_i_Default extends Factory<ContentErrorPerspective> { }
  public abstract class Type_factory__o_d_c_e_PieChartDragComponent__quals__j_e_i_Any_j_e_i_Default extends Factory<PieChartDragComponent> { }
  public abstract class Type_factory__o_d_c_p_PropertyReplacementService__quals__j_e_i_Any_j_e_i_Default extends Factory<PropertyReplacementService> { }
  public abstract class Type_factory__o_u_c_w_StandaloneEditorPerspective__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<StandaloneEditorPerspective> { }
  public abstract class Type_factory__o_u_e_e_c_c_f_p_CopyPopUpView__quals__j_e_i_Any_o_u_a_FallbackImplementation extends Factory<CopyPopUpView> { }
  public abstract class ContextualProvider_factory__o_j_e_i_c_a_InitBallot__quals__Universal extends Factory<InitBallot> { }
  public abstract class Type_factory__o_d_c_c_e_ToggleSwitchEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<ToggleSwitchEditor> { }
  public abstract class Type_factory__o_u_c_w_p_i_ImmutableWorkbenchPanelView__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<ImmutableWorkbenchPanelView> { }
  public abstract class Type_factory__o_u_w_c_Others__quals__j_e_i_Any_j_e_i_Default extends Factory<Others> { }
  public abstract class ExtensionProvided_factory__o_j_e_c_c_d_Input__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<Input> { }
  public abstract class Type_factory__o_j_e_c_c_d_e_Elemental2DomUtil__quals__j_e_i_Any_j_e_i_Default extends Factory<Elemental2DomUtil> { }
  public abstract class Type_factory__o_d_d_c_w_DisplayerTypeSelector__quals__j_e_i_Any_j_e_i_Default extends Factory<DisplayerTypeSelector> { }
  public abstract class Type_factory__o_u_c_w_WorkbenchServicesProxyClientImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<WorkbenchServicesProxyClientImpl> { }
  public abstract class Type_factory__o_d_c_c_e_ValueBoxEditorView__quals__j_e_i_Any_j_e_i_Default extends Factory<ValueBoxEditorView> { }
  public abstract class Type_factory__o_u_c_w_p_i_StaticWorkbenchPanelPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<StaticWorkbenchPanelPresenter> { }
  public abstract class Type_factory__o_u_c_u_Clipboard__quals__j_e_i_Any_j_e_i_Default extends Factory<Clipboard> { }
  public abstract class Type_factory__o_d_d_c_u_ClientUUIDGenerator__quals__j_e_i_Any_j_e_i_Default extends Factory<ClientUUIDGenerator> { }
  public abstract class Type_factory__o_d_d_c_w_f_MultipleNumberParameterEditorView__quals__j_e_i_Any_j_e_i_Default extends Factory<MultipleNumberParameterEditorView> { }
  public abstract class Type_factory__o_u_c_v_p_w_Button__quals__j_e_i_Any_j_e_i_Default extends Factory<Button> { }
  public abstract class Type_factory__o_u_e_w_t_c_TableEntryPoint__quals__j_e_i_Any_j_e_i_Default extends Factory<TableEntryPoint> { }
  public abstract class Type_factory__o_d_c_c_RuntimeChannelClient__quals__j_e_i_Any_j_e_i_Default extends Factory<RuntimeChannelClient> { }
  public abstract class Type_factory__o_u_c_v_p_t_TabPanelWithDropdowns__quals__j_e_i_Any_j_e_i_Default extends Factory<TabPanelWithDropdowns> { }
  public abstract class Type_factory__o_u_e_l_e_c_c_r_RowView__quals__j_e_i_Any_j_e_i_Default extends Factory<RowView> { }
  public abstract class JsType_factory__o_u_w_m_t_ToolBarIcon__quals__Universal extends Factory<ToolBarIcon> { }
  public abstract class Type_factory__o_u_e_p_c_p_e_g_PerspectiveEditorGenerator__quals__j_e_i_Any_j_e_i_Default extends Factory<PerspectiveEditorGenerator> { }
  public abstract class ExtensionProvided_factory__o_j_e_c_c_d_NumberInput__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<NumberInput> { }
  public abstract class Provider_factory__o_j_e_c_c_a_BatchCaller__quals__j_e_i_Any_j_e_i_Default extends Factory<BatchCaller> { }
  public abstract class Type_factory__o_u_c_w_p_i_SimpleWorkbenchPanelPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<SimpleWorkbenchPanelPresenter> { }
  public abstract class Type_factory__o_d_c_RuntimeModelBackendAppLoader__quals__j_e_i_Any_j_e_i_Default extends Factory<RuntimeModelBackendAppLoader> { }
  public abstract class Type_factory__o_d_d_c_c_f_ComponentFunctionLocator__quals__j_e_i_Any_j_e_i_Default extends Factory<ComponentFunctionLocator> { }
  public abstract class Type_factory__o_d_c_c_e_l_DropDownImageListEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<DropDownImageListEditor> { }
  public abstract class Type_factory__o_u_c_v_p_w_FormLabel__quals__j_e_i_Any_j_e_i_Default extends Factory<FormLabel> { }
  public abstract class Type_factory__o_u_e_l_e_c_LayoutComponentPaletteScreen__quals__j_e_i_Any_j_e_i_Default extends Factory<LayoutComponentPaletteScreen> { }
  public abstract class Type_factory__o_d_r_c_s_SelectorLabelItemView__quals__j_e_i_Any_j_e_i_Default extends Factory<SelectorLabelItemView> { }
  public abstract class Type_factory__o_u_e_p_c_p_e_l_e_HTMLLayoutDragComponent__quals__j_e_i_Any_j_e_i_Default extends Factory<HTMLLayoutDragComponent> { }
  public abstract class Type_factory__o_u_c_WorkbenchBackendEntryPoint__quals__j_e_i_Any_j_e_i_Default extends Factory<WorkbenchBackendEntryPoint> { }
  public abstract class Type_factory__o_u_e_l_e_c_c_c_Container__quals__j_e_i_Any_j_e_i_Default extends Factory<Container> { }
  public abstract class Type_factory__o_u_e_p_e_c_f_BooleanField__quals__j_e_i_Any_j_e_i_Default extends Factory<BooleanField> { }
  public abstract class Type_factory__o_u_c_w_w_m_m_m_IconMenuItemPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<IconMenuItemPresenter> { }
  public abstract class JsType_factory__o_u_w_m_m_MenuPosition__quals__Universal extends Factory<MenuPosition> { }
  public abstract class Type_factory__o_u_c_v_p_m_m_WorkbenchMegaMenuView__quals__j_e_i_Any_j_e_i_Default extends Factory<WorkbenchMegaMenuView> { }
  public abstract class Type_factory__o_u_c_v_p_m_MultiScreenMenuBuilder__quals__j_e_i_Any_j_e_i_Default extends Factory<MultiScreenMenuBuilder> { }
  public abstract class Type_factory__o_u_e_w_c_c_s_SelectOptionView__quals__j_e_i_Any_j_e_i_Default extends Factory<SelectOptionView> { }
  public abstract class Type_factory__o_u_e_l_e_c_c_r_EmptyDropRowView__quals__j_e_i_Any_j_e_i_Default extends Factory<EmptyDropRowView> { }
  public abstract class Producer_factory__o_u_w_m_AppFormerActivities__quals__j_e_i_Any_o_u_a_Customizable extends Factory<AppFormerActivities> { }
  public abstract class Type_factory__o_u_c_v_p_PatternFlyEntryPoint__quals__j_e_i_Any_j_e_i_Default extends Factory<PatternFlyEntryPoint> { }
  public abstract class Type_factory__o_u_c_v_p_m_WorkbenchMenuStandardNavBarView__quals__j_e_i_Any_j_e_i_Default extends Factory<WorkbenchMenuStandardNavBarView> { }
  public abstract class Type_factory__o_u_c_DocksEntryPoint__quals__j_e_i_Any_j_e_i_Default extends Factory<DocksEntryPoint> { }
  public abstract class Type_factory__o_j_e_i_s_b_c_BatchCallerProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<BatchCallerProvider> { }
  public abstract class Type_factory__o_d_d_c_ClientDataSetManager__quals__j_e_i_Any_j_e_i_Default extends Factory<ClientDataSetManager> { }
  public abstract class Type_factory__o_d_d_c_w_DisplayerHtmlEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<DisplayerHtmlEditor> { }
  public abstract class Producer_factory__o_u_e_e_c_c_f_e_ImageFileExport__quals__j_e_i_Any_j_e_i_Default extends Factory<ImageFileExport> { }
  public abstract class Type_factory__o_d_d_c_w_f_TimeInstantEditorView__quals__j_e_i_Any_j_e_i_Default extends Factory<TimeInstantEditorView> { }
  public abstract class JsType_factory__j_u_Set__quals__Universal extends Factory<Set> { }
  public abstract class Type_factory__o_d_c_RuntimeEntryPoint__quals__j_e_i_Any_j_e_i_Default extends Factory<RuntimeEntryPoint> { }
  public abstract class Type_factory__o_d_c_n_w_NavTabListWidgetView__quals__j_e_i_Any_j_e_i_Default extends Factory<NavTabListWidgetView> { }
  public abstract class Producer_factory__e_d_HTMLDocument__quals__j_e_i_Any_j_e_i_Default extends Factory<HTMLDocument> { }
  public abstract class Type_factory__o_d_d_c_w_ExternalComponentEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<ExternalComponentEditor> { }
  public abstract class Type_factory__o_u_e_w_c_c_m_MenuItemHeaderView__quals__j_e_i_Any_o_u_e_w_c_c_m_MenuItemHeader extends Factory<MenuItemHeaderView> { }
  public abstract class Type_factory__o_u_c_w_DefaultBeanFactory__quals__j_e_i_Any_j_e_i_Default extends Factory<DefaultBeanFactory> { }
  public abstract class Type_factory__o_d_d_c_w_g_ColumnDetailsEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<ColumnDetailsEditor> { }
  public abstract class Type_factory__o_d_r_c_s_SelectorDisplayerView__quals__j_e_i_Any_j_e_i_Default extends Factory<SelectorDisplayerView> { }
  public abstract class Type_factory__o_d_c_p_NotFoundPerspective__quals__j_e_i_Any_j_e_i_Default extends Factory<NotFoundPerspective> { }
  public abstract class Type_factory__o_u_c_w_p_s_PartManager__quals__j_e_i_Any_j_e_i_Default extends Factory<PartManager> { }
  public abstract class Type_factory__o_d_d_c_e_ClientIntervalBuilderLocator__quals__j_e_i_Any_j_e_i_Default extends Factory<ClientIntervalBuilderLocator> { }
  public abstract class Type_factory__o_j_e_i_c_l_i_AccessImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<AccessImpl> { }
  public abstract class Type_factory__o_u_w_c_Undefined__quals__j_e_i_Any_j_e_i_Default extends Factory<Undefined> { }
  public abstract class Type_factory__o_d_c_n_l_e_NavMenuBarDragComponent__quals__j_e_i_Any_j_e_i_Default extends Factory<NavMenuBarDragComponent> { }
  public abstract class Type_factory__o_d_c_w_DashboardCard__quals__j_e_i_Any_j_e_i_Default extends Factory<DashboardCard> { }
  public abstract class Type_factory__o_u_c_v_p_t_WorkbenchToolBarView__quals__j_e_i_Any_j_e_i_Default extends Factory<WorkbenchToolBarView> { }
  public abstract class Type_factory__o_d_r_c_c_c_l_C3LineChartView__quals__j_e_i_Any_j_e_i_Default extends Factory<C3LineChartView> { }
  public abstract class Type_factory__o_d_c_s_d_RuntimeRendererSettingsService__quals__j_e_i_Any_j_e_i_Default extends Factory<RuntimeRendererSettingsService> { }
  public abstract class ExtensionProvided_factory__e_d_HTMLOptionElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<HTMLOptionElement> { }
  public abstract class Type_factory__o_d_c_n_w_e_NavItemDefaultEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<NavItemDefaultEditor> { }
  public abstract class Type_factory__o_u_e_w_c_c_t_PagedTable__quals__j_e_i_Any_j_e_i_Default extends Factory<PagedTable> { }
  public abstract class Type_factory__o_d_c_s_RouterScreen__quals__j_e_i_Any_j_e_i_Default extends Factory<RouterScreen> { }
  public abstract class Type_factory__o_d_d_c_w_DisplayerSettingsEditorView__quals__j_e_i_Any_j_e_i_Default extends Factory<DisplayerSettingsEditorView> { }
  public abstract class Type_factory__o_d_c_s_DashboardsListScreenActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<DashboardsListScreenActivity> { }
  public abstract class Type_factory__o_u_e_l_e_c_LayoutComponentPaletteScreenActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<LayoutComponentPaletteScreenActivity> { }
  public abstract class Type_factory__o_u_c_v_p_n_ActivityNotFoundView__quals__j_e_i_Any_j_e_i_Default extends Factory<ActivityNotFoundView> { }
  public abstract class ExtensionProvided_factory__e_d_HTMLIFrameElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<HTMLIFrameElement> { }
  public abstract class Type_factory__o_d_r_c_s_SelectorDropDownItemView__quals__j_e_i_Any_j_e_i_Default extends Factory<SelectorDropDownItemView> { }
  public abstract class Type_factory__o_u_c_v_p_w_KebabMenuItem__quals__j_e_i_Any_j_e_i_Default extends Factory<KebabMenuItem> { }
  public abstract class JsType_factory__j_u_Map__quals__Universal extends Factory<Map> { }
  public abstract class Type_factory__o_d_c_c_e_l_HorizImageListEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<HorizImageListEditor> { }
  public abstract class Type_factory__o_d_d_c_w_DisplayerErrorWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<DisplayerErrorWidget> { }
  public abstract class Type_factory__o_u_c_v_p_s_SplashModalFooter__quals__j_e_i_Any_j_e_i_Default extends Factory<SplashModalFooter> { }
  public abstract class Type_factory__o_u_c_v_p_m_PartContextMenusView__quals__j_e_i_Any_j_e_i_Default extends Factory<PartContextMenusView> { }
  public abstract class Type_factory__o_d_d_c_DisplayerClientEntryPoint__quals__j_e_i_Any_j_e_i_Default extends Factory<DisplayerClientEntryPoint> { }
  public abstract class Type_factory__o_u_c_v_p_t_ResizeTabPanel__quals__j_e_i_Any_o_u_c_v_p_t_Resize extends Factory<ResizeTabPanel> { }
  public abstract class Type_factory__o_d_c_c_w_FilterLabelSet__quals__j_e_i_Any_j_e_i_Default extends Factory<FilterLabelSet> { }
  public abstract class Type_factory__o_d_d_c_c_f_ListFunctions__quals__j_e_i_Any_j_e_i_Default extends Factory<ListFunctions> { }
  public abstract class Type_factory__o_d_c_p_NotFoundPerspectiveActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<NotFoundPerspectiveActivity> { }
  public abstract class JsType_factory__o_u_w_m_PartDefinition__quals__Universal extends Factory<PartDefinition> { }
  public abstract class ExtensionProvided_factory__o_j_e_c_c_d_Paragraph__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<Paragraph> { }
  public abstract class Type_factory__o_u_c_w_p_i_UnanchoredStaticWorkbenchPanelPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<UnanchoredStaticWorkbenchPanelPresenter> { }
  public abstract class Type_factory__o_d_c_p_RuntimeModelClientParserFactory__quals__j_e_i_Any_j_e_i_Default extends Factory<RuntimeModelClientParserFactory> { }
  public abstract class JsType_factory__o_u_w_m_m_MenuItemCommand__quals__Universal extends Factory<MenuItemCommand> { }
  public abstract class Type_factory__o_d_c_s_NotFoundScreen__quals__j_e_i_Any_j_e_i_Default extends Factory<NotFoundScreen> { }
  public abstract class Type_factory__o_d_r_c_t_TableDisplayerView__quals__j_e_i_Any_j_e_i_Default extends Factory<TableDisplayerView> { }
  public abstract class ExtensionProvided_factory__o_j_e_c_c_d_UnorderedList__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<UnorderedList> { }
  public abstract class Provider_factory__c_g_g_u_c_u_RootPanel__quals__j_e_i_Any_j_e_i_Default extends Factory<RootPanel> { }
  public abstract class Type_factory__o_d_c_e_ErrorResponseVerifier__quals__j_e_i_Any_j_e_i_Default extends Factory<ErrorResponseVerifier> { }
  public abstract class Type_factory__o_u_e_p_c_t_PerspectiveLayoutPluginResourceType__quals__j_e_i_Any_j_e_i_Default extends Factory<PerspectiveLayoutPluginResourceType> { }
  public abstract class Type_factory__o_d_c_n_w_NavTilesWidgetView__quals__j_e_i_Any_j_e_i_Default extends Factory<NavTilesWidgetView> { }
  public abstract class Type_factory__o_d_r_c_s_SelectorDropDownDisplayer__quals__j_e_i_Any_j_e_i_Default extends Factory<SelectorDropDownDisplayer> { }
  public abstract class Type_factory__o_u_c_w_p_i_StaticWorkbenchPanelView__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<StaticWorkbenchPanelView> { }
  public abstract class Type_factory__o_d_c_s_v_EmptyScreenView__quals__j_e_i_Any_j_e_i_Default extends Factory<EmptyScreenView> { }
  public abstract class Type_factory__o_u_c_v_p_HTML5DndSeleniumSupport__quals__j_e_i_Any_j_e_i_Default extends Factory<HTML5DndSeleniumSupport> { }
  public abstract class Type_factory__o_d_d_c_w_f_TimeInstantEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<TimeInstantEditor> { }
  public abstract class Type_factory__o_d_r_c_c_c_l_C3LineChartDisplayer__quals__j_e_i_Any_j_e_i_Default extends Factory<C3LineChartDisplayer> { }
  public abstract class Type_factory__o_d_d_c_w_f_NumberParameterEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<NumberParameterEditor> { }
  public abstract class Type_factory__o_u_e_w_c_c_d_i_LiveSearchSelectorDropDownItemViewImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<LiveSearchSelectorDropDownItemViewImpl> { }
  public abstract class Type_factory__o_u_c_w_p_i_MultiScreenWorkbenchPanelPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<MultiScreenWorkbenchPanelPresenter> { }
  public abstract class Producer_factory__o_u_c_w_w_m_WorkbenchMenuBarPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<WorkbenchMenuBarPresenter> { }
  public abstract class JsType_factory__o_u_w_m_t_ToolBar__quals__Universal extends Factory<ToolBar> { }
  public abstract class Type_factory__o_d_c_e_e_ComponentGroupProducer__quals__j_e_i_Any_j_e_i_Default extends Factory<ComponentGroupProducer> { }
  public abstract class Type_factory__o_d_c_e_BarChartDragComponent__quals__j_e_i_Any_j_e_i_Default extends Factory<BarChartDragComponent> { }
  public abstract class Type_factory__o_d_c_n_l_e_NavTreeDragComponent__quals__j_e_i_Any_j_e_i_Default extends Factory<NavTreeDragComponent> { }
  public abstract class Producer_factory__o_u_c_v_p_w_JQueryElementalProducer_JQuery__quals__j_e_i_Any_j_e_i_Default extends Factory<JQuery> { }
  public abstract class Type_factory__o_u_c_v_p_m_WorkbenchViewModeSwitcherView__quals__j_e_i_Any_j_e_i_Default extends Factory<WorkbenchViewModeSwitcherView> { }
  public abstract class Type_factory__o_u_c_w_w_m_PartContextMenusPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<PartContextMenusPresenter> { }
  public abstract class Type_factory__o_u_c_v_p_m_SplashScreenMenuView__quals__j_e_i_Any_j_e_i_Default extends Factory<SplashScreenMenuView> { }
  public abstract class Type_factory__o_d_r_c_s_SelectorLabelSetDisplayer__quals__j_e_i_Any_j_e_i_Default extends Factory<SelectorLabelSetDisplayer> { }
  public abstract class Type_factory__o_j_e_i_c_l_i_DestructionImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<DestructionImpl> { }
  public abstract class Type_factory__o_d_c_n_w_e_TargetPerspectiveEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<TargetPerspectiveEditor> { }
  public abstract class Type_factory__o_d_d_c_w_g_DataSetGroupDateEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<DataSetGroupDateEditor> { }
  public abstract class Type_factory__o_u_e_w_c_c_b_UberfireBreadcrumbsView__quals__j_e_i_Any_j_e_i_Default extends Factory<UberfireBreadcrumbsView> { }
  public abstract class Type_factory__o_u_e_e_c_c_h_HtmlEditorView__quals__j_e_i_Any_j_e_i_Default extends Factory<HtmlEditorView> { }
  public abstract class Type_factory__o_u_c_w_w_d_CompassDropController__quals__j_e_i_Any_j_e_i_Default extends Factory<CompassDropController> { }
  public abstract class Type_factory__o_d_d_c_w_g_ColumnDetailsEditorView__quals__j_e_i_Any_j_e_i_Default extends Factory<ColumnDetailsEditorView> { }
  public abstract class Type_factory__o_u_e_l_e_c_g_BootstrapLayoutGenerator__quals__j_e_i_Any_j_e_i_Default extends Factory<BootstrapLayoutGenerator> { }
  public abstract class Type_factory__o_d_r_c_s_SelectorLabelSetDisplayerView__quals__j_e_i_Any_j_e_i_Default extends Factory<SelectorLabelSetDisplayerView> { }
  public abstract class Type_factory__o_d_c_c_w_FilterLabel__quals__j_e_i_Any_j_e_i_Default extends Factory<FilterLabel> { }
  public abstract class Type_factory__o_u_e_p_c_v_PluginNameValidator__quals__j_e_i_Any_j_e_i_Default extends Factory<PluginNameValidator> { }
  public abstract class Type_factory__o_u_c_v_p_w_FormGroup__quals__j_e_i_Any_j_e_i_Default extends Factory<FormGroup> { }
  public abstract class Type_factory__o_u_c_v_p_t_MultiTabWorkbenchPanelView__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<MultiTabWorkbenchPanelView> { }
  public abstract class Type_factory__o_u_c_v_p_m_m_c_ChildContextMenuItemView__quals__j_e_i_Any_j_e_i_Default extends Factory<ChildContextMenuItemView> { }
  public abstract class Type_factory__o_d_d_c_w_f_ColumnFilterEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<ColumnFilterEditor> { }
  public abstract class Type_factory__o_d_c_n_MenuBuilderHelper__quals__j_e_i_Any_j_e_i_Default extends Factory<MenuBuilderHelper> { }
  public abstract class Type_factory__o_d_d_c_f_ValueFormatterRegistry__quals__j_e_i_Any_j_e_i_Default extends Factory<ValueFormatterRegistry> { }
  public abstract class Type_factory__o_j_e_i_c_a_b_InitBallotProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<InitBallotProvider> { }
  public abstract class Type_factory__o_u_e_w_c_c_m_MenuItemFactory__quals__j_e_i_Any_j_e_i_Default extends Factory<MenuItemFactory> { }
  public abstract class JsType_factory__o_u_m_Command__quals__Universal extends Factory<Command> { }
  public abstract class Type_factory__o_d_c_s_v_DashboardsListScreenView__quals__j_e_i_Any_j_e_i_Default extends Factory<DashboardsListScreenView> { }
  public abstract class Type_factory__o_j_e_u_c_w_LocaleListBox__quals__j_e_i_Any_j_e_i_Default extends Factory<LocaleListBox> { }
  public abstract class Type_factory__o_u_c_w_p_i_ImmutableWorkbenchPanelPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<ImmutableWorkbenchPanelPresenter> { }
  public abstract class Type_factory__o_d_d_c_w_ExternalComponentEditorPopUp__quals__j_e_i_Any_j_e_i_Default extends Factory<ExternalComponentEditorPopUp> { }
  public abstract class Type_factory__o_d_d_c_w_RendererSelectorTabListView__quals__j_e_i_Any_j_e_i_Default extends Factory<RendererSelectorTabListView> { }
  public abstract class Type_factory__o_u_e_w_c_c_d_LiveSearchDropDownView__quals__j_e_i_Any_j_e_i_Default extends Factory<LiveSearchDropDownView> { }
  public abstract class Type_factory__o_u_c_w_w_m_UtilityMenuBarPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<UtilityMenuBarPresenter> { }
  public abstract class Type_factory__o_u_e_p_e_c_f_TextField__quals__j_e_i_Any_j_e_i_Default extends Factory<TextField> { }
  public abstract class Type_factory__o_u_e_p_c_p_e_l_e_TargetDivDragComponent__quals__j_e_i_Any_j_e_i_Default extends Factory<TargetDivDragComponent> { }
  public abstract class JsType_factory__o_u_m_PlaceRequest__quals__Universal extends Factory<PlaceRequest> { }
  public abstract class Type_factory__o_d_d_c_w_DisplayerViewer__quals__j_e_i_Any_j_e_i_Default extends Factory<DisplayerViewer> { }
  public abstract class Type_factory__o_d_c_n_w_NavItemTileWidgetView__quals__j_e_i_Any_j_e_i_Default extends Factory<NavItemTileWidgetView> { }
  public abstract class Type_factory__o_d_c_c_w_AlertBoxView__quals__j_e_i_Any_j_e_i_Default extends Factory<AlertBoxView> { }
  public abstract class Type_factory__o_d_r_c_DefaultRenderer__quals__j_e_i_Any_j_e_i_Default extends Factory<DefaultRenderer> { }
  public abstract class Type_factory__o_u_e_e_c_c_f_p_DeletePopUpPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<DeletePopUpPresenter> { }
  public abstract class Type_factory__o_u_c_w_p_i_MultiListWorkbenchPanelView__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<MultiListWorkbenchPanelView> { }
  public abstract class Type_factory__o_u_e_l_e_c_c_c_ColumnWithComponentsView__quals__j_e_i_Any_j_e_i_Default extends Factory<ColumnWithComponentsView> { }
  public abstract class Type_factory__o_d_d_e_g_IntervalBuilderFixedDate__quals__j_e_i_Any_j_e_i_Default extends Factory<IntervalBuilderFixedDate> { }
  public abstract class Type_factory__o_u_c_w_w_n_ActivityNotFoundPresenter__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<ActivityNotFoundPresenter> { }
  public abstract class Type_factory__o_d_c_p_RouterPerspective__quals__j_e_i_Any_j_e_i_Default extends Factory<RouterPerspective> { }
  public abstract class Type_factory__o_u_c_w_t_i_ClientTypeRegistryImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<ClientTypeRegistryImpl> { }
  public abstract class Type_factory__o_d_d_c_w_DisplayerTypeSelectorView__quals__j_e_i_Any_j_e_i_Default extends Factory<DisplayerTypeSelectorView> { }
  public abstract class Type_factory__o_u_c_w_p_i_ClosableSimpleWorkbenchPanelPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<ClosableSimpleWorkbenchPanelPresenter> { }
  public abstract class Type_factory__o_u_c_m_LockDemandDetector__quals__j_e_i_Any_j_e_i_Default extends Factory<LockDemandDetector> { }
  public abstract class Type_factory__o_u_e_p_e_c_f_ColorField__quals__j_e_i_Any_j_e_i_Default extends Factory<ColorField> { }
  public abstract class ExtensionProvided_factory__e_d_HTMLDivElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<HTMLDivElement> { }
  public abstract class Type_factory__o_d_d_c_w_RendererSelectorRadioListView__quals__j_e_i_Any_j_e_i_Default extends Factory<RendererSelectorRadioListView> { }
  public abstract class Type_factory__o_u_e_w_c_c_CommonsEntryPoint__quals__j_e_i_Any_j_e_i_Default extends Factory<CommonsEntryPoint> { }
  public abstract class Type_factory__o_d_d_c_w_f_TimeAmountEditorView__quals__j_e_i_Any_j_e_i_Default extends Factory<TimeAmountEditorView> { }
  public abstract class Type_factory__o_u_e_w_c_c_b_h_UberfireBreadcrumbsContainerImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<UberfireBreadcrumbsContainerImpl> { }
  public abstract class Type_factory__o_d_c_n_w_NavTreeWidgetView__quals__j_e_i_Any_j_e_i_Default extends Factory<NavTreeWidgetView> { }
  public abstract class Type_factory__o_u_c_w_p_i_SimpleWorkbenchPanelView__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<SimpleWorkbenchPanelView> { }
  public abstract class JsType_factory__o_j_e_i_c_c_JsTypeProvider__quals__Universal extends Factory<JsTypeProvider> { }
  public abstract class Type_factory__o_d_r_c_s_SelectorDropDownDisplayerView__quals__j_e_i_Any_j_e_i_Default extends Factory<SelectorDropDownDisplayerView> { }
  public abstract class ContextualProvider_factory__e_d_HTMLElement__quals__Universal extends Factory<HTMLElement> { }
  public abstract class Type_factory__o_u_c_w_p_i_SimpleDnDWorkbenchPanelView__quals__j_e_i_Any_j_e_i_Default extends Factory<SimpleDnDWorkbenchPanelView> { }
  public abstract class Type_factory__o_u_e_w_c_c_d_f_LiveSearchFooter__quals__j_e_i_Any_j_e_i_Default extends Factory<LiveSearchFooter> { }
  public abstract class Type_factory__o_d_d_c_w_DisplayerError__quals__j_e_i_Any_j_e_i_Default extends Factory<DisplayerError> { }
  public abstract class ExtensionProvided_factory__e_d_HTMLTextAreaElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<HTMLTextAreaElement> { }
  public abstract class Type_factory__o_u_c_v_p_m_WorkbenchMenuBarView__quals__j_e_i_Any_j_e_i_Default extends Factory<WorkbenchMenuBarView> { }
  public abstract class Type_factory__o_d_d_c_w_f_DateParameterEditorView__quals__j_e_i_Any_j_e_i_Default extends Factory<DateParameterEditorView> { }
  public abstract class Type_factory__o_j_e_e_c_c_EventProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<EventProvider> { }
  public abstract class Type_factory__o_u_c_v_p_w_SanitizedNumberInput__quals__j_e_i_Any_j_e_i_Default extends Factory<SanitizedNumberInput> { }
  public abstract class JsType_factory__o_u_w_m_m_MenuItem__quals__Universal extends Factory<MenuItem> { }
  public abstract class Type_factory__o_d_c_n_w_e_TargetPerspectiveEditorView__quals__j_e_i_Any_j_e_i_Default extends Factory<TargetPerspectiveEditorView> { }
  public abstract class Type_factory__o_u_e_l_e_c_w_LayoutComponentPalettePresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<LayoutComponentPalettePresenter> { }
  public abstract class ContextualProvider_factory__j_e_i_Instance__quals__Universal extends Factory<Instance> { }
  public abstract class ExtensionProvided_factory__c_g_g_u_c_u_HeaderPanel__quals__j_e_i_Any_j_e_i_Default extends Factory<HeaderPanel> { }
  public abstract class Producer_factory__c_g_w_b_e_s_EventBus__quals__j_e_i_Any_j_e_i_Default extends Factory<EventBus> { }
  public abstract class Type_factory__o_d_d_c_w_f_MultipleTextParameterEditorView__quals__j_e_i_Any_j_e_i_Default extends Factory<MultipleTextParameterEditorView> { }
  public abstract class Type_factory__o_u_e_p_c_p_e_a_PerspectiveEditorCoreGroupProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<PerspectiveEditorCoreGroupProvider> { }
  public abstract class ExtensionProvided_factory__o_j_e_c_c_d_Heading__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<Heading> { }
  public abstract class Type_factory__o_u_c_v_p_m_MultiPageEditorViewImpl__quals__j_e_i_Any_o_u_c_w_w_m_Multiple extends Factory<MultiPageEditorViewImpl> { }
  public abstract class Type_factory__o_d_r_c_t_TableDisplayer__quals__j_e_i_Any_j_e_i_Default extends Factory<TableDisplayer> { }
  public abstract class Type_factory__o_u_c_v_p_m_m_m_GroupMenuItemView__quals__j_e_i_Any_j_e_i_Default extends Factory<GroupMenuItemView> { }
  public abstract class Type_factory__o_d_c_p_JSONRuntimeModelClientParser__quals__j_e_i_Any_j_e_i_Default extends Factory<JSONRuntimeModelClientParser> { }
  public abstract class Producer_factory__o_u_c_w_w_m_m_WorkbenchMegaMenuPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<WorkbenchMegaMenuPresenter> { }
  public abstract class Type_factory__o_d_d_c_PerspectiveCoordinator__quals__j_e_i_Any_j_e_i_Default extends Factory<PerspectiveCoordinator> { }
  public abstract class Type_factory__o_u_c_w_p_i_ClosableSimpleWorkbenchPanelView__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<ClosableSimpleWorkbenchPanelView> { }
  public abstract class Type_factory__o_j_e_i_c_a_b_CallerProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<CallerProvider> { }
  public abstract class Type_factory__o_u_c_r_i_PermissionTreeI18NImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<PermissionTreeI18NImpl> { }
  public abstract class Type_factory__o_d_d_c_w_DisplayerSettingsEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<DisplayerSettingsEditor> { }
  public abstract class Type_factory__o_d_d_c_w_f_MultipleTextParameterEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<MultipleTextParameterEditor> { }
  public abstract class Type_factory__o_u_c_v_p_w_DropdownMenu__quals__j_e_i_Any_j_e_i_Default extends Factory<DropdownMenu> { }
  public abstract class Type_factory__o_u_w_m_AppFormerActivitiesProducer__quals__j_e_i_Any_j_e_i_Default extends Factory<AppFormerActivitiesProducer> { }
  public abstract class ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<Span> { }
  public abstract class ExtensionProvided_factory__e_d_HTMLInputElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<HTMLInputElement> { }
  public abstract class Type_factory__o_u_b_v_i_ObservablePathImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<ObservablePathImpl> { }
  public abstract class ExtensionProvided_factory__e_d_HTMLOListElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<HTMLOListElement> { }
  public abstract class Type_factory__o_d_c_s_RuntimeDataSetClientServices__quals__j_e_i_Any_j_e_i_Default extends Factory<RuntimeDataSetClientServices> { }
  public abstract class Type_factory__o_d_c_n_w_e_NavTreeEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<NavTreeEditor> { }
  public abstract class Type_factory__o_d_c_e_DisplayerDragComponent__quals__j_e_i_Any_j_e_i_Default extends Factory<DisplayerDragComponent> { }
  public abstract class Type_factory__o_d_c_c_e_m_MapEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<MapEditor> { }
  public abstract class Type_factory__o_u_c_v_p_t_UberTabPanel__quals__j_e_i_Any_j_e_i_Default extends Factory<UberTabPanel> { }
  public abstract class Type_factory__o_d_r_c_c_c_b_C3BubbleChartDisplayer__quals__j_e_i_Any_j_e_i_Default extends Factory<C3BubbleChartDisplayer> { }
  public abstract class JsType_factory__o_u_c_m_Activity__quals__Universal extends Factory<Activity> { }
  public abstract class ExtensionProvided_factory__e_d_HTMLButtonElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<HTMLButtonElement> { }
  public abstract class Type_factory__o_d_c_n_w_NavComponentConfigModal__quals__j_e_i_Any_j_e_i_Default extends Factory<NavComponentConfigModal> { }
  public abstract class Type_factory__o_d_c_n_i_NavigationManagerImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<NavigationManagerImpl> { }
  public abstract class Producer_factory__o_u_e_e_c_v_CurrentBranch__quals__j_e_i_Any_o_u_a_Customizable extends Factory<CurrentBranch> { }
  public abstract class Type_factory__o_j_e_u_c_w_LocaleSelector__quals__j_e_i_Any_j_e_i_Default extends Factory<LocaleSelector> { }
  public abstract class Type_factory__o_d_d_c_w_ExternalComponentView__quals__j_e_i_Any_j_e_i_Default extends Factory<ExternalComponentView> { }
  public abstract class Type_factory__o_u_e_l_e_c_w_LayoutComponentPaletteView__quals__j_e_i_Any_j_e_i_Default extends Factory<LayoutComponentPaletteView> { }
  public abstract class Type_factory__o_d_d_c_w_ExternalComponentPropertiesEditorView__quals__j_e_i_Any_j_e_i_Default extends Factory<ExternalComponentPropertiesEditorView> { }
  public abstract class Type_factory__o_j_e_i_c_l_i_CreationImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<CreationImpl> { }
  public abstract class Type_factory__o_j_e_d_c_ListComponentProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<ListComponentProvider> { }
  public abstract class JsType_factory__o_u_w_m_m_MenuItemPerspective__quals__Universal extends Factory<MenuItemPerspective> { }
  public abstract class JsType_factory__o_u_w_m_ContextDefinition__quals__Universal extends Factory<ContextDefinition> { }
  public abstract class Type_factory__o_u_e_p_c_p_e_PerspectiveEditorView__quals__j_e_i_Any_j_e_i_Default extends Factory<PerspectiveEditorView> { }
  public abstract class Type_factory__o_u_e_w_c_c_b_UberfireBreadcrumbs__quals__j_e_i_Any_j_e_i_Default extends Factory<UberfireBreadcrumbs> { }
  public abstract class Type_factory__o_u_e_l_e_c_LayoutEditorPluginImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<LayoutEditorPluginImpl> { }
  public abstract class Type_factory__o_u_c_v_p_s_SplashViewImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<SplashViewImpl> { }
  public abstract class JsType_factory__o_u_c_m_PerspectiveActivity__quals__Universal extends Factory<PerspectiveActivity> { }
  public abstract class JsType_factory__o_j_e_e_c_c_JsTypeEventObserver__quals__Universal extends Factory<JsTypeEventObserver> { }
  public abstract class Type_factory__o_u_c_w_WorkbenchLayoutImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<WorkbenchLayoutImpl> { }
  public abstract class Type_factory__o_d_d_c_e_ClientDateFormatterImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<ClientDateFormatterImpl> { }
  public abstract class Type_factory__o_u_e_e_c_c_h_HtmlEditorPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<HtmlEditorPresenter> { }
  public abstract class Type_factory__o_d_c_c_w_LoadingBox__quals__j_e_i_Any_j_e_i_Default extends Factory<LoadingBox> { }
  public abstract class Type_factory__o_d_d_c_w_f_TimeFrameEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<TimeFrameEditor> { }
  public abstract class Type_factory__o_d_d_c_p_DataSetPrototypes__quals__j_e_i_Any_j_e_i_Default extends Factory<DataSetPrototypes> { }
  public abstract class Type_factory__o_d_d_c_w_s_DefaultHtmlValidator__quals__j_e_i_Any_j_e_i_Default extends Factory<DefaultHtmlValidator> { }
  public abstract class Type_factory__o_u_e_e_c_c_f_p_SavePopUpPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<SavePopUpPresenter> { }
  public abstract class Type_factory__o_d_r_c_c_c_p_C3PieChartView__quals__j_e_i_Any_j_e_i_Default extends Factory<C3PieChartView> { }
  public abstract class Type_factory__o_u_c_v_p_m_m_m_ChildMenuItemView__quals__j_e_i_Any_j_e_i_Default extends Factory<ChildMenuItemView> { }
  public abstract class JsType_factory__o_u_w_m_m_i_DefaultMenuGroup__quals__Universal extends Factory<DefaultMenuGroup> { }
  public abstract class Type_factory__o_d_c_s_RuntimeBackendComponentFunctionService__quals__j_e_i_Any_j_e_i_Default extends Factory<RuntimeBackendComponentFunctionService> { }
  public abstract class Type_factory__o_u_c_d_UberfireDocksImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<UberfireDocksImpl> { }
  public abstract class Type_factory__o_u_c_w_p_i_SimpleDnDWorkbenchPanelPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<SimpleDnDWorkbenchPanelPresenter> { }
  public abstract class Type_factory__o_u_c_v_p_m_MultiScreenPartWidget__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<MultiScreenPartWidget> { }
  public abstract class Type_factory__o_u_c_w_p_i_SimpleNoExpandWorkbenchPanelView__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<SimpleNoExpandWorkbenchPanelView> { }
  public abstract class Type_factory__o_j_e_i_c_l_i_LifecycleListenerRegistrarImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<LifecycleListenerRegistrarImpl> { }
  public abstract class Type_factory__o_u_e_e_c_c_f_p_RenamePopUpView__quals__j_e_i_Any_j_e_i_Default extends Factory<RenamePopUpView> { }
  public abstract class Type_factory__o_d_d_c_w_g_DataSetGroupDateEditorView__quals__j_e_i_Any_j_e_i_Default extends Factory<DataSetGroupDateEditorView> { }
  public abstract class Type_factory__o_d_d_c_w_DisplayerSubtypeSelectorView__quals__j_e_i_Any_j_e_i_Default extends Factory<DisplayerSubtypeSelectorView> { }
  public abstract class Type_factory__o_d_c_c_e_f_FileUploadEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<FileUploadEditor> { }
  public abstract class Type_factory__o_u_e_w_c_c_d_LiveSearchDropDown__quals__j_e_i_Any_j_e_i_Default extends Factory<LiveSearchDropDown> { }
  public abstract class Type_factory__o_d_c_s_EmptyScreenActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<EmptyScreenActivity> { }
  public abstract class ContextualProvider_factory__o_j_e_c_c_d_HTMLElement__quals__Universal extends Factory<org.jboss.errai.common.client.dom.HTMLElement> { }
  public abstract class Type_factory__o_u_e_w_c_c_b_w_DefaultBreadcrumbsView__quals__j_e_i_Any_j_e_i_Default extends Factory<DefaultBreadcrumbsView> { }
  public abstract class Producer_factory__o_u_e_e_c_c_f_e_TextFileExport__quals__j_e_i_Any_j_e_i_Default extends Factory<TextFileExport> { }
  public abstract class Type_factory__o_u_e_l_e_c_w_LayoutDragComponentGroupPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<LayoutDragComponentGroupPresenter> { }
  public abstract class Type_factory__o_d_d_c_ClientSettings__quals__j_e_i_Any_j_e_i_Default extends Factory<ClientSettings> { }
  public abstract class Type_factory__o_u_c_w_p_i_MultiTabWorkbenchPanelPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<MultiTabWorkbenchPanelPresenter> { }
  public abstract class JsType_factory__o_u_w_m_CustomPanelDefinition__quals__Universal extends Factory<CustomPanelDefinition> { }
  public abstract class JsType_factory__o_u_b_v_Path__quals__Universal extends Factory<Path> { }
  public abstract class Type_factory__o_u_c_v_p_w_Elemental2Producer__quals__j_e_i_Any_j_e_i_Default extends Factory<Elemental2Producer> { }
  public abstract class ContextualProvider_factory__o_j_e_i_c_a_Disposer__quals__Universal extends Factory<Disposer> { }
  public abstract class Type_factory__o_d_d_c_w_s_DefaultJsEvaluator__quals__j_e_i_Any_j_e_i_Default extends Factory<DefaultJsEvaluator> { }
  public abstract class ContextualProvider_factory__o_j_e_d_c_c_ListComponent__quals__Universal extends Factory<ListComponent> { }
  public abstract class Type_factory__o_u_c_w_p_i_SplitLayoutPanelView__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<SplitLayoutPanelView> { }
  public abstract class Type_factory__o_u_e_e_c_c_m_BasicFileMenuBuilderImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<BasicFileMenuBuilderImpl> { }
  public abstract class Type_factory__o_u_c_v_p_m_ErrorPopupView__quals__j_e_i_Any_j_e_i_Default extends Factory<org.uberfire.client.views.pfly.modal.ErrorPopupView> { }
  public abstract class ExtensionProvided_factory__e_d_HTMLHeadingElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<HTMLHeadingElement> { }
  public abstract class Type_factory__o_d_d_c_w_DisplayerSubtypeSelector__quals__j_e_i_Any_j_e_i_Default extends Factory<DisplayerSubtypeSelector> { }
  public abstract class Type_factory__o_d_c_n_GoToDashboardMenuBuilder__quals__j_e_i_Any_j_e_i_Default extends Factory<GoToDashboardMenuBuilder> { }
  public abstract class JsType_factory__o_u_w_m_m_HasEnabledStateChangeListeners__quals__Universal extends Factory<HasEnabledStateChangeListeners> { }
  public abstract class Type_factory__o_d_d_c_DisplayerLocator__quals__j_e_i_Any_j_e_i_Default extends Factory<DisplayerLocator> { }
  public abstract class Type_factory__o_d_d_c_w_f_LikeToFunctionEditorView__quals__j_e_i_Any_j_e_i_Default extends Factory<LikeToFunctionEditorView> { }
  public abstract class Type_factory__o_u_c_w_t_AnyResourceType__quals__j_e_i_Any_j_e_i_Default extends Factory<AnyResourceType> { }
  public abstract class Type_factory__o_u_c_m_PlaceHistoryHandler__quals__j_e_i_Any_j_e_i_Default extends Factory<PlaceHistoryHandler> { }
  public abstract class Type_factory__o_d_c_n_p_PerspectivePluginManagerImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<PerspectivePluginManagerImpl> { }
  public abstract class Type_factory__o_d_r_c_c_c_m_g_i_CountriesGeoJsonServiceImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<CountriesGeoJsonServiceImpl> { }
  public abstract class Type_factory__o_u_c_w_w_n_NotificationManager__quals__j_e_i_Any_j_e_i_Default extends Factory<NotificationManager> { }
  public abstract class ExtensionProvided_factory__o_j_e_c_c_d_Select__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<org.jboss.errai.common.client.dom.Select> { }
  public abstract class Type_factory__o_u_e_w_c_c_b_w_DefaultBreadcrumbsPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<DefaultBreadcrumbsPresenter> { }
  public abstract class Type_factory__o_u_e_l_e_c_LayoutEditorPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<LayoutEditorPresenter> { }
  public abstract class Type_factory__o_d_d_c_w_DisplayerHtmlEditorView__quals__j_e_i_Any_j_e_i_Default extends Factory<DisplayerHtmlEditorView> { }
  public abstract class Type_factory__o_u_e_l_e_c_c_c_ComponentColumn__quals__j_e_i_Any_j_e_i_Default extends Factory<ComponentColumn> { }
  public abstract class Type_factory__o_u_e_p_c_p_e_a_PerspectiveEditorNavGroupProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<PerspectiveEditorNavGroupProvider> { }
  public abstract class Type_factory__o_u_c_w_t_DotResourceType__quals__j_e_i_Any_j_e_i_Default extends Factory<DotResourceType> { }
  public abstract class Producer_factory__o_j_e_c_c_d_Document__quals__j_e_i_Any_j_e_i_Default extends Factory<Document> { }
  public abstract class ExtensionProvided_factory__e_d_HTMLAnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<HTMLAnchorElement> { }
  public abstract class Type_factory__o_d_d_e_f_AggregateFunctionManagerImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<AggregateFunctionManagerImpl> { }
  public abstract class ContextualProvider_factory__o_j_e_i_c_a_ManagedInstance__quals__Universal extends Factory<ManagedInstance> { }
  public abstract class Type_factory__o_d_c_n_RuntimeNavBrand__quals__j_e_i_Any_j_e_i_Default extends Factory<RuntimeNavBrand> { }
  public abstract class JsType_factory__o_u_w_m_m_Menus__quals__Universal extends Factory<Menus> { }
  public abstract class Type_factory__o_d_r_c_c_c_b_C3BubbleChartView__quals__j_e_i_Any_j_e_i_Default extends Factory<C3BubbleChartView> { }
  public abstract class Type_factory__o_u_e_l_e_c_i_DragHelperComponentColumn__quals__j_e_i_Any_j_e_i_Default extends Factory<DragHelperComponentColumn> { }
  public abstract class ExtensionProvided_factory__o_j_e_c_c_d_Anchor__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<Anchor> { }
  public abstract class Type_factory__o_u_e_p_e_c_PropertyEditorWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<PropertyEditorWidget> { }
  public abstract class Type_factory__o_d_r_c_c_c_m_C3MeterChartDisplayer__quals__j_e_i_Any_j_e_i_Default extends Factory<C3MeterChartDisplayer> { }
  public abstract class Type_factory__o_d_c_s_RuntimeScreenActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<RuntimeScreenActivity> { }
  public abstract class JsType_factory__o_u_c_m_PlaceStatus__quals__Universal extends Factory<PlaceStatus> { }
  public abstract class ExtensionProvided_factory__e_d_HTMLPreElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<HTMLPreElement> { }
  public abstract class Type_factory__o_d_c_e_AreaChartDragComponent__quals__j_e_i_Any_j_e_i_Default extends Factory<AreaChartDragComponent> { }
  public abstract class Type_factory__o_u_e_e_c_c_f_p_DeletePopUpView__quals__j_e_i_Any_j_e_i_Default extends Factory<DeletePopUpView> { }
  public abstract class Type_factory__o_d_d_c_w_s_SourceCodeEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<SourceCodeEditor> { }
  public abstract class Type_factory__o_d_c_n_w_e_NavItemDefaultEditorView__quals__j_e_i_Any_j_e_i_Default extends Factory<NavItemDefaultEditorView> { }
  public abstract class Type_factory__o_d_d_c_c_f_GWTVersion__quals__j_e_i_Any_j_e_i_Default extends Factory<GWTVersion> { }
  public abstract class Type_factory__o_d_d_c_w_ExternalComponentEditorView__quals__j_e_i_Any_j_e_i_Default extends Factory<ExternalComponentEditorView> { }
  public abstract class Type_factory__o_d_r_c_c_c_b_C3BarChartView__quals__j_e_i_Any_j_e_i_Default extends Factory<C3BarChartView> { }
  public abstract class Type_factory__o_d_c_w_v_DashboardCardView__quals__j_e_i_Any_j_e_i_Default extends Factory<DashboardCardView> { }
  public abstract class Type_factory__o_u_e_l_e_c_i_LayoutEditorFocusController__quals__j_e_i_Any_j_e_i_Default extends Factory<LayoutEditorFocusController> { }
  public abstract class Type_factory__o_d_d_c_w_f_TextParameterEditorView__quals__j_e_i_Any_j_e_i_Default extends Factory<TextParameterEditorView> { }
  public abstract class JsType_factory__o_u_s_Resource__quals__Universal extends Factory<Resource> { }
  public abstract class Type_factory__o_u_c_w_p_i_LayoutPanelPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<LayoutPanelPresenter> { }
  public abstract class Type_factory__o_d_r_c_c_c_m_D3MapDisplayer__quals__j_e_i_Any_j_e_i_Default extends Factory<D3MapDisplayer> { }
  public abstract class Type_factory__o_d_c_p_RuntimePerspectiveActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<RuntimePerspectiveActivity> { }
  public abstract class Type_factory__o_u_c_v_p_w_Modal__quals__j_e_i_Any_j_e_i_Default extends Factory<Modal> { }
  public abstract class ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal extends Factory<DataBinder> { }
  public abstract class Type_factory__o_d_d_c_DataSetClientServicesImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<DataSetClientServicesImpl> { }
  public abstract class ExtensionProvided_factory__o_s_Logger__quals__Universal_2 extends Factory<Logger> { }
  public abstract class ExtensionProvided_factory__o_s_Logger__quals__Universal_1 extends Factory<Logger> { }
  public abstract class Type_factory__o_u_e_w_c_c_t_p_NewTabFilterPopup__quals__j_e_i_Any_j_e_i_Default extends Factory<NewTabFilterPopup> { }
  public abstract class JsType_factory__o_u_w_m_m_MenuItemPlain__quals__Universal extends Factory<MenuItemPlain> { }
  public abstract class Type_factory__o_d_c_n_w_NavTreeWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<NavTreeWidget> { }
  public abstract class Type_factory__o_u_c_w_w_m_WorkbenchMenuBarProducer__quals__j_e_i_Any_j_e_i_Default extends Factory<WorkbenchMenuBarProducer> { }
  public abstract class Type_factory__o_d_c_c_w_FilterLabelView__quals__j_e_i_Any_j_e_i_Default extends Factory<FilterLabelView> { }
  public abstract class Type_factory__o_d_d_c_w_DisplayerEditorPopup__quals__j_e_i_Any_j_e_i_Default extends Factory<DisplayerEditorPopup> { }
  public abstract class Type_factory__o_j_e_i_c_a_b_RootPanelProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<RootPanelProvider> { }
  public abstract class Type_factory__o_d_c_c_w_LoadingBoxView__quals__j_e_i_Any_j_e_i_Default extends Factory<LoadingBoxView> { }
  public abstract class Type_factory__o_d_c_e_PerspectiveEditorReportingGroupProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<PerspectiveEditorReportingGroupProvider> { }
  public abstract class Type_factory__o_d_c_p_RouterPerspectiveActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<RouterPerspectiveActivity> { }
  public abstract class Type_factory__o_d_c_c_w_FilterLabelSetView__quals__j_e_i_Any_j_e_i_Default extends Factory<FilterLabelSetView> { }
  public abstract class Producer_factory__o_u_e_e_c_c_f_e_s_SvgFileExport__quals__j_e_i_Any_j_e_i_Default extends Factory<SvgFileExport> { }
  public abstract class ExtensionProvided_factory__o_s_Logger__quals__Universal extends Factory<Logger> { }
  public abstract class Type_factory__o_u_c_m_PlaceRequestHistoryMapperImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<PlaceRequestHistoryMapperImpl> { }
  public abstract class Type_factory__o_d_c_e_TableDragComponent__quals__j_e_i_Any_j_e_i_Default extends Factory<TableDragComponent> { }
  public abstract class Type_factory__o_d_c_e_MapChartDragComponent__quals__j_e_i_Any_j_e_i_Default extends Factory<MapChartDragComponent> { }
  public abstract class JsType_factory__o_u_w_m_i_PanelDefinitionImpl__quals__Universal extends Factory<PanelDefinitionImpl> { }
  public abstract class Producer_factory__o_u_c_v_p_w_JQueryProducer_JQuery__quals__j_e_i_Any_j_e_i_Default extends Factory<org.uberfire.client.views.pfly.widgets.JQueryProducer.JQuery> { }
  public abstract class Type_factory__o_j_e_u_c_w_ListWidgetProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<ListWidgetProvider> { }
  public abstract class Type_factory__o_d_d_c_w_f_DateParameterEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<DateParameterEditor> { }
  public abstract class Type_factory__o_u_e_p_c_r_i_PerspectiveEditorPaletteI18nImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<PerspectiveEditorPaletteI18nImpl> { }
  public abstract class Type_factory__o_u_e_l_e_c_w_LayoutDragComponentWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<LayoutDragComponentWidget> { }
  public abstract class ExtensionProvided_factory__e_d_HTMLFormElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<HTMLFormElement> { }
  public abstract class Type_factory__o_d_d_c_DisplayerCoordinator__quals__j_e_i_Any_j_e_i_Default extends Factory<DisplayerCoordinator> { }
  public abstract class Type_factory__o_u_c_v_p_m_Bs3Modal__quals__j_e_i_Any_j_e_i_Default extends Factory<Bs3Modal> { }
  public abstract class Type_factory__o_d_d_c_w_f_TextParameterEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<TextParameterEditor> { }
  public abstract class Type_factory__o_d_c_c_b_PathUrlFactory__quals__j_e_i_Any_j_e_i_Default extends Factory<PathUrlFactory> { }
  public abstract class Type_factory__o_u_e_e_c_c_t_m_ClientMustacheTemplateRenderer__quals__j_e_i_Any_j_e_i_Default extends Factory<ClientMustacheTemplateRenderer> { }
  public abstract class Type_factory__o_d_r_c_m_MetricView__quals__j_e_i_Any_j_e_i_Default extends Factory<MetricView> { }
  public abstract class Type_factory__o_d_c_n_w_NavItemTileWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<NavItemTileWidget> { }
  public abstract class Type_factory__o_d_d_c_w_g_ColumnFunctionEditorView__quals__j_e_i_Any_j_e_i_Default extends Factory<ColumnFunctionEditorView> { }
  public abstract class Type_factory__o_d_c_s_EmptyScreen__quals__j_e_i_Any_j_e_i_Default extends Factory<EmptyScreen> { }
  public abstract class Type_factory__o_d_c_s_NotFoundScreenActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<NotFoundScreenActivity> { }
  public abstract class Type_factory__o_u_e_l_e_c_c_c_ContainerView__quals__j_e_i_Any_j_e_i_Default extends Factory<ContainerView> { }
  public abstract class JsType_factory__o_u_w_m_ContextDisplayMode__quals__Universal extends Factory<ContextDisplayMode> { }
  public abstract class Type_factory__o_d_c_n_l_e_NavCarouselDragComponent__quals__j_e_i_Any_j_e_i_Default extends Factory<NavCarouselDragComponent> { }
  public abstract class Type_factory__o_u_c_w_WorkbenchLayoutInfoImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<WorkbenchLayoutInfoImpl> { }
  public abstract class Type_factory__o_d_c_c_e_l_HorizImageListEditorView__quals__j_e_i_Any_j_e_i_Default extends Factory<HorizImageListEditorView> { }
  public abstract class ExtensionProvided_factory__o_j_e_c_c_d_Label__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<Label> { }
  public abstract class JsType_factory__o_u_w_m_PerspectiveDefinition__quals__Universal extends Factory<PerspectiveDefinition> { }
  public abstract class Type_factory__o_u_c_w_LayoutSelection__quals__j_e_i_Any_j_e_i_Default extends Factory<LayoutSelection> { }
  public abstract class Type_factory__o_j_e_u_s_ServerTemplateProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<ServerTemplateProvider> { }
  public abstract class ExtensionProvided_factory__e_d_HTMLUListElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<HTMLUListElement> { }
  public abstract class Type_factory__o_d_d_c_w_DisplayerEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<DisplayerEditor> { }
  public abstract class ExtensionProvided_factory__o_g_c_u_Button__quals__j_e_i_Any_j_e_i_Default extends Factory<org.gwtbootstrap3.client.ui.Button> { }
  public abstract class Type_factory__o_d_c_p_RuntimePerspective__quals__j_e_i_Any_j_e_i_Default extends Factory<RuntimePerspective> { }
  public abstract class Type_factory__o_d_c_p_EmptyPerspectiveActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<EmptyPerspectiveActivity> { }
  public abstract class ExtensionProvided_factory__e_d_HTMLSelectElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<HTMLSelectElement> { }
  public abstract class Type_factory__o_u_c_m_PlaceManagerImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<PlaceManagerImpl> { }
  public abstract class Type_factory__o_u_e_e_c_c_m_c_CurrentBranchProducer__quals__j_e_i_Any_j_e_i_Default extends Factory<CurrentBranchProducer> { }
  public abstract class Type_factory__o_u_c_m_CustomSplashHelp__quals__j_e_i_Any_j_e_i_Default extends Factory<CustomSplashHelp> { }
  public abstract class Type_factory__o_d_r_c_e_ExternalComponentDisplayer__quals__j_e_i_Any_j_e_i_Default extends Factory<ExternalComponentDisplayer> { }
  public abstract class Type_factory__o_u_e_p_e_c_f_SecretTextField__quals__j_e_i_Any_j_e_i_Default extends Factory<SecretTextField> { }
  public abstract class Type_factory__o_d_r_c_c_c_b_C3BarChartDisplayer__quals__j_e_i_Any_j_e_i_Default extends Factory<C3BarChartDisplayer> { }
  public abstract class Type_factory__o_u_c_v_p_w_InputAutocomplete__quals__j_e_i_Any_j_e_i_Default extends Factory<InputAutocomplete> { }
  public abstract class Type_factory__o_j_e_i_c_a_b_IOCBeanManagerProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<IOCBeanManagerProvider> { }
  public abstract class ExtensionProvided_factory__o_u_c_w_w_l_ResizeFlowPanel__quals__j_e_i_Any_j_e_i_Default extends Factory<ResizeFlowPanel> { }
  public abstract class Type_factory__o_u_c_v_p_w_KebabMenu__quals__j_e_i_Any_j_e_i_Default extends Factory<KebabMenu> { }
  public abstract class Type_factory__o_u_e_w_c_c_s_SelectView__quals__j_e_i_Any_j_e_i_Default extends Factory<SelectView> { }
  public abstract class Type_factory__o_d_c_c_w_AlertPanel__quals__j_e_i_Any_j_e_i_Default extends Factory<AlertPanel> { }
  public abstract class JsType_factory__o_u_c_m_WorkbenchActivity__quals__Universal extends Factory<WorkbenchActivity> { }
  public abstract class Type_factory__o_u_c_m_WorkbenchViewModeSwitcherMenuBuilder__quals__j_e_i_Any_j_e_i_Default extends Factory<WorkbenchViewModeSwitcherMenuBuilder> { }
  public abstract class Type_factory__o_u_c_m_ActivityLifecycleErrorHandler__quals__j_e_i_Any_j_e_i_Default extends Factory<ActivityLifecycleErrorHandler> { }
  public abstract class Type_factory__o_u_c_w_p_i_UnanchoredStaticWorkbenchPanelView__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<UnanchoredStaticWorkbenchPanelView> { }
  public abstract class ExtensionProvided_factory__o_j_e_c_c_d_TextInput__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<TextInput> { }
  public abstract class Type_factory__o_u_e_l_e_c_i_DnDManager__quals__j_e_i_Any_j_e_i_Default extends Factory<DnDManager> { }
  public abstract class Type_factory__o_u_e_e_c_c_h_HtmlResourceType__quals__j_e_i_Any_j_e_i_Default extends Factory<HtmlResourceType> { }
  public abstract class Type_factory__o_j_e_i_s_b_c_RequestDispatcherProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<RequestDispatcherProvider> { }
  public abstract class Type_factory__o_u_w_m_DefaultAppFormerActivities__quals__j_e_i_Any_o_u_a_FallbackImplementation extends Factory<DefaultAppFormerActivities> { }
  public abstract class ExtensionProvided_factory__e_d_HTMLLIElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<HTMLLIElement> { }
  public abstract class Type_factory__o_d_c_n_NavBarHelper__quals__j_e_i_Any_j_e_i_Default_1 extends Factory<NavBarHelper> { }
  public abstract class Type_factory__o_u_c_v_p_w_InlineNotification__quals__j_e_i_Any_j_e_i_Default extends Factory<InlineNotification> { }
  public abstract class Type_factory__o_d_d_c_w_DisplayerEditorView__quals__j_e_i_Any_j_e_i_Default extends Factory<DisplayerEditorView> { }
  public abstract class Type_factory__o_u_e_p_e_c_f_ComboField__quals__j_e_i_Any_j_e_i_Default extends Factory<ComboField> { }
  public abstract class JsType_factory__o_u_s_a_RuntimeResource__quals__Universal extends Factory<RuntimeResource> { }
  public abstract class Type_factory__o_u_c_m_ActivityBeansCache__quals__j_e_i_Any_j_e_i_Default extends Factory<ActivityBeansCache> { }
  public abstract class Type_factory__o_d_d_c_w_s_SourceCodeEditorView__quals__j_e_i_Any_j_e_i_Default extends Factory<SourceCodeEditorView> { }
  public abstract class Type_factory__o_u_c_w_w_m_m_m_ChildMenuItemPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<ChildMenuItemPresenter> { }
  public abstract class Type_factory__o_u_e_e_c_c_m_DownloadMenuItemBuilder__quals__j_e_i_Any_j_e_i_Default extends Factory<DownloadMenuItemBuilder> { }
  public abstract class Type_factory__o_u_c_d_v_DocksBars__quals__j_e_i_Any_j_e_i_Default extends Factory<DocksBars> { }
  public abstract class ExtensionProvided_factory__o_j_e_c_c_d_OrderedList__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<OrderedList> { }
  public abstract class Type_factory__o_j_e_i_c_a_b_DisposerProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<DisposerProvider> { }
  public abstract class Type_factory__o_d_d_c_w_RendererSelector__quals__j_e_i_Any_j_e_i_Default extends Factory<RendererSelector> { }
  public abstract class Type_factory__o_d_r_c_c_c_m_D3MapDisplayerView__quals__j_e_i_Any_j_e_i_Default extends Factory<D3MapDisplayerView> { }
  public abstract class Type_factory__o_j_e_i_s_b_c_MessageBusProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<MessageBusProvider> { }
  public abstract class Type_factory__o_d_c_n_DashboardListMenuBuilder__quals__j_e_i_Any_j_e_i_Default extends Factory<DashboardListMenuBuilder> { }
  public abstract class Type_factory__o_u_c_v_p_m_MultiPageEditorImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<MultiPageEditorImpl> { }
  public abstract class Type_factory__o_d_d_c_e_ClientChronometer__quals__j_e_i_Any_j_e_i_Default extends Factory<ClientChronometer> { }
  public abstract class Type_factory__o_j_e_i_s_b_c_SenderProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<SenderProvider> { }
  public abstract class Type_factory__o_u_e_e_c_c_f_p_RenamePopUpPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<RenamePopUpPresenter> { }
  public abstract class Type_factory__o_u_e_l_e_c_c_r_EmptyDropRow__quals__j_e_i_Any_j_e_i_Default extends Factory<EmptyDropRow> { }
  public abstract class Type_factory__o_j_e_i_c_a_b_ManagedInstanceProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<ManagedInstanceProvider> { }
  public abstract class Type_factory__o_u_e_l_e_c_i_LayoutDragComponentHelper__quals__j_e_i_Any_j_e_i_Default extends Factory<LayoutDragComponentHelper> { }
  public abstract class Type_factory__o_d_r_c_c_c_a_C3AreaChartView__quals__j_e_i_Any_j_e_i_Default extends Factory<C3AreaChartView> { }
  public abstract class Type_factory__o_u_e_p_c_p_e_l_e_p_EditHTMLView__quals__j_e_i_Any_j_e_i_Default extends Factory<EditHTMLView> { }
  public abstract class JsType_factory__j_u_List__quals__Universal extends Factory<List> { }
  public abstract class Type_factory__o_d_r_c_c_c_m_w_D3Map__quals__j_e_i_Any_j_e_i_Default extends Factory<D3Map> { }
  public abstract class ExtensionProvided_factory__o_j_e_c_c_d_Image__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<Image> { }
  public abstract class Type_factory__o_u_c_w_w_m_m_m_GroupMenuItemPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<GroupMenuItemPresenter> { }
  public abstract class Type_factory__o_d_d_c_w_ExternalComponentPropertiesEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<ExternalComponentPropertiesEditor> { }
  public abstract class Type_factory__o_u_e_l_e_c_LayoutEditorView__quals__j_e_i_Any_j_e_i_Default extends Factory<LayoutEditorView> { }
  public abstract class Type_factory__o_u_c_p_Promises__quals__j_e_i_Any_j_e_i_Default extends Factory<Promises> { }
  public abstract class Type_factory__o_u_c_v_p_l_ListBarWidgetImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<ListBarWidgetImpl> { }
  public abstract class Type_factory__o_d_c_n_w_e_NavRootNodeEditorView__quals__j_e_i_Any_j_e_i_Default extends Factory<NavRootNodeEditorView> { }
  public abstract class Type_factory__o_u_c_m_WorkbenchViewModeSwitcherPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<WorkbenchViewModeSwitcherPresenter> { }
  public abstract class Type_factory__o_u_e_p_c_p_e_l_e_ScreenLayoutDragComponent__quals__j_e_i_Any_j_e_i_Default extends Factory<ScreenLayoutDragComponent> { }
  public abstract class Type_factory__o_j_e_u_c_l_p_HTMLElementProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<HTMLElementProvider> { }
  public abstract class Type_factory__o_d_c_e_DisplayerEditorEntryPoint__quals__j_e_i_Any_j_e_i_Default extends Factory<DisplayerEditorEntryPoint> { }
  public abstract class Type_factory__o_d_c_s_v_ContentErrorScreenView__quals__j_e_i_Any_j_e_i_Default extends Factory<ContentErrorScreenView> { }
  public abstract class Type_factory__o_d_c_n_l_e_NavTabListDragComponent__quals__j_e_i_Any_j_e_i_Default extends Factory<NavTabListDragComponent> { }
  public abstract class JsType_factory__o_u_w_m_m_i_DefaultMenus__quals__Universal extends Factory<DefaultMenus> { }
  public abstract class Type_factory__o_u_e_e_c_c_h_HtmlEditorLibraryLoader__quals__j_e_i_Any_j_e_i_Default extends Factory<HtmlEditorLibraryLoader> { }
  public abstract class Type_factory__o_u_e_e_c_c_v_DefaultFileNameValidator__quals__j_e_i_Any_j_e_i_Default extends Factory<DefaultFileNameValidator> { }
  public abstract class Type_factory__o_j_e_u_c_l_p_Elemental2HTMLElementProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<Elemental2HTMLElementProvider> { }
  public abstract class ExtensionProvided_factory__o_g_c_u_h_Span__quals__j_e_i_Any_j_e_i_Default extends Factory<org.gwtbootstrap3.client.ui.html.Span> { }
  public abstract class Type_factory__o_d_c_c_e_l_DropDownEditorView__quals__j_e_i_Any_j_e_i_Default extends Factory<DropDownEditorView> { }
  public abstract class Type_factory__o_u_c_d_v_m_MenuBuilder__quals__j_e_i_Any_j_e_i_Default extends Factory<MenuBuilder> { }
  public abstract class Producer_factory__o_u_e_e_c_c_f_p_CopyPopUpPresenter_View__quals__j_e_i_Any_o_u_e_e_c_c_f_Customizable extends Factory<View> { }
  public abstract class Type_factory__o_d_d_c_w_f_DataSetFilterEditorView__quals__j_e_i_Any_j_e_i_Default extends Factory<DataSetFilterEditorView> { }
  public abstract class Type_factory__o_d_c_n_w_NavCarouselWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<NavCarouselWidget> { }
  public abstract class Type_factory__o_u_e_w_c_c_t_p_NewFilterPopup__quals__j_e_i_Any_j_e_i_Default extends Factory<NewFilterPopup> { }
  public abstract class Type_factory__o_u_e_w_c_c_t_FilterPagedTable__quals__j_e_i_Any_j_e_i_Default extends Factory<FilterPagedTable> { }
  public abstract class Type_factory__o_u_c_v_p_m_UtilityMenuBarView__quals__j_e_i_Any_j_e_i_Default extends Factory<UtilityMenuBarView> { }
  public abstract class Type_factory__o_u_e_l_e_c_g_BootstrapLayoutGeneratorDriver__quals__j_e_i_Any_j_e_i_Default extends Factory<BootstrapLayoutGeneratorDriver> { }
  public abstract class ExtensionProvided_factory__o_j_e_c_c_d_ListItem__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<ListItem> { }
  public abstract class Type_factory__o_d_d_c_w_DataSetLookupEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<DataSetLookupEditor> { }
  public abstract class Producer_factory__o_u_r_SessionInfo__quals__j_e_i_Any_j_e_i_Default extends Factory<SessionInfo> { }
  public abstract class Type_factory__o_d_r_c_c_c_a_C3AreaChartDisplayer__quals__j_e_i_Any_j_e_i_Default extends Factory<C3AreaChartDisplayer> { }
  public abstract class ContextualProvider_factory__o_j_e_u_c_w_ListWidget__quals__Universal extends Factory<ListWidget> { }
  public abstract class Type_factory__o_u_e_w_c_c_d_n_NoItemsComponentViewImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<NoItemsComponentViewImpl> { }
  public abstract class Type_factory__o_u_e_w_c_c_d_f_LiveSearchFooterViewImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<LiveSearchFooterViewImpl> { }
  public abstract class Type_factory__o_u_e_e_c_c_m_c_SaveAndRenameCommandBuilder__quals__j_e_i_Any_j_e_i_Default extends Factory<SaveAndRenameCommandBuilder> { }
  public abstract class Type_factory__o_d_c_c_w_AlertPanelView__quals__j_e_i_Any_j_e_i_Default extends Factory<AlertPanelView> { }
  public abstract class Type_factory__o_u_e_l_e_c_w_LayoutElementPropertiesPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<LayoutElementPropertiesPresenter> { }
  public abstract class Type_factory__o_u_e_w_c_c_d_i_LiveSearchSelectorDropDownItem__quals__j_e_i_Any_j_e_i_Default extends Factory<LiveSearchSelectorDropDownItem> { }
  public abstract class Type_factory__o_d_c_s_RouterScreenActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<RouterScreenActivity> { }
  public abstract class Type_factory__o_d_c_e_SelectorDragComponent__quals__j_e_i_Any_j_e_i_Default extends Factory<SelectorDragComponent> { }
  public abstract class JsType_factory__o_u_m_i_ExternalPathPlaceRequest__quals__Universal extends Factory<ExternalPathPlaceRequest> { }
  public abstract class Type_factory__o_d_s_m_RuntimeModelJSONMarshaller__quals__j_e_i_Any_j_e_i_Default extends Factory<RuntimeModelJSONMarshaller> { }
  public abstract class Type_factory__o_j_e_e_c_c_InstanceProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<InstanceProvider> { }
  public abstract class Type_factory__o_d_c_c_w_AlertBox__quals__j_e_i_Any_j_e_i_Default extends Factory<AlertBox> { }
  public abstract class Type_factory__o_u_c_w_p_i_MultiScreenWorkbenchPanelView__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<MultiScreenWorkbenchPanelView> { }
  public abstract class Type_factory__o_u_c_v_p_n_NotificationPopupsManagerView__quals__j_e_i_Any_j_e_i_Default extends Factory<NotificationPopupsManagerView> { }
  public abstract class Type_factory__o_u_c_w_p_i_SplitLayoutPanelPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<SplitLayoutPanelPresenter> { }
  public abstract class Type_factory__o_d_c_e_BubbleChartDragComponent__quals__j_e_i_Any_j_e_i_Default extends Factory<BubbleChartDragComponent> { }
  public abstract class Type_factory__o_u_e_e_c_c_f_p_CopyPopUpPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<CopyPopUpPresenter> { }
  public abstract class Type_factory__o_u_c_v_p_w_DateRangePicker__quals__j_e_i_Any_j_e_i_Default extends Factory<DateRangePicker> { }
  public abstract class Type_factory__o_u_c_w_w_m_m_c_GroupContextMenuItemPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<GroupContextMenuItemPresenter> { }
  public abstract class Type_factory__o_d_c_RuntimeCommunication__quals__j_e_i_Any_j_e_i_Default extends Factory<RuntimeCommunication> { }
  public abstract class JsType_factory__o_u_w_m_m_MenuCustom__quals__Universal extends Factory<MenuCustom> { }
  public abstract class Type_factory__o_d_d_c_w_f_ColumnFilterEditorView__quals__j_e_i_Any_j_e_i_Default extends Factory<ColumnFilterEditorView> { }
  public abstract class JsType_factory__o_j_e_e_c_c_WindowEventObservers__quals__Universal extends Factory<WindowEventObservers> { }
  public abstract class Type_factory__o_d_c_s_v_RuntimeScreenView__quals__j_e_i_Any_j_e_i_Default extends Factory<RuntimeScreenView> { }
  public abstract class Type_factory__o_u_c_w_w_d_WorkbenchPickupDragController__quals__j_e_i_Any_j_e_i_Default extends Factory<WorkbenchPickupDragController> { }
  public abstract class Type_factory__o_u_c_w_PanelManagerImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<PanelManagerImpl> { }
  public abstract class Type_factory__o_u_e_w_c_c_s_SelectOptionComponent__quals__j_e_i_Any_j_e_i_Default extends Factory<SelectOptionComponent> { }
  public abstract class Type_factory__o_d_c_c_e_l_DropDownImageListEditorView__quals__j_e_i_Any_j_e_i_Default extends Factory<DropDownImageListEditorView> { }
  public abstract class ExtensionProvided_factory__o_g_c_u_CheckBox__quals__j_e_i_Any_j_e_i_Default extends Factory<CheckBox> { }
  public abstract class ContextualProvider_factory__o_j_e_i_s_b_c_Sender__quals__Universal extends Factory<Sender> { }
  public abstract class Type_factory__o_d_c_p_DashboardsListPerspective__quals__j_e_i_Any_j_e_i_Default extends Factory<DashboardsListPerspective> { }
  public abstract class Type_factory__o_u_c_w_p_i_SimpleNoExpandWorkbenchPanelPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<SimpleNoExpandWorkbenchPanelPresenter> { }
  public abstract class Type_factory__o_d_r_c_s_SelectorLabelItem__quals__j_e_i_Any_j_e_i_Default extends Factory<SelectorLabelItem> { }
  public abstract class Type_factory__o_u_c_m_SplashScreenMenuPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<SplashScreenMenuPresenter> { }
  public abstract class ExtensionProvided_factory__c_g_g_u_c_u_FlowPanel__quals__j_e_i_Any_j_e_i_Default extends Factory<FlowPanel> { }
  public abstract class Type_factory__o_u_c_v_p_w_DropdownMenuItem__quals__j_e_i_Any_j_e_i_Default extends Factory<DropdownMenuItem> { }
  public abstract class Type_factory__o_d_d_c_w_DataSetLookupEditorView__quals__j_e_i_Any_j_e_i_Default extends Factory<DataSetLookupEditorView> { }
  public abstract class Type_factory__o_d_c_e_MeterChartDragComponent__quals__j_e_i_Any_j_e_i_Default extends Factory<MeterChartDragComponent> { }
  public abstract class Type_factory__o_u_e_e_c_c_f_e_j_FileExportScriptInjector__quals__j_e_i_Any_j_e_i_Default extends Factory<FileExportScriptInjector> { }
  public abstract class Type_factory__o_d_c_s_DashboardsListScreen__quals__j_e_i_Any_j_e_i_Default extends Factory<DashboardsListScreen> { }
  public abstract class Type_factory__o_d_r_c_s_SelectorDisplayer__quals__j_e_i_Any_j_e_i_Default extends Factory<SelectorDisplayer> { }
  public abstract class Producer_factory__o_d_d_e_ExternalComponentMessageHelper__quals__j_e_i_Any_j_e_i_Default extends Factory<ExternalComponentMessageHelper> { }
  public abstract class Type_factory__o_d_c_c_e_ValueBoxEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<ValueBoxEditor> { }
  public abstract class Type_factory__o_u_c_w_w_m_m_WorkbenchMegaMenuProducer__quals__j_e_i_Any_j_e_i_Default extends Factory<WorkbenchMegaMenuProducer> { }
  public abstract class Type_factory__o_d_c_RuntimeModelContentListener__quals__j_e_i_Any_j_e_i_Default extends Factory<RuntimeModelContentListener> { }
  public abstract class Type_factory__o_u_e_p_c_p_e_PerspectiveEditorPresenterActivity__quals__j_e_i_Any_j_i_Named_o_u_c_w_a_AssociatedResources_o_u_c_w_a_Priority extends Factory<PerspectiveEditorPresenterActivity> { }
  public abstract class Type_factory__o_u_c_m_CategoriesManagerCache__quals__j_e_i_Any_j_e_i_Default extends Factory<CategoriesManagerCache> { }
  public abstract class ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<Div> { }
  public abstract class Type_factory__o_u_c_m_ResourceTypeManagerCache__quals__j_e_i_Any_j_e_i_Default extends Factory<ResourceTypeManagerCache> { }
  public abstract class Type_factory__o_d_d_c_w_f_TimeFrameEditorView__quals__j_e_i_Any_j_e_i_Default extends Factory<TimeFrameEditorView> { }
  public abstract class JsType_factory__j_u_Collection__quals__Universal extends Factory<Collection> { }
  public abstract class JsType_factory__o_u_w_t_ResourceTypeDefinition__quals__Universal extends Factory<ResourceTypeDefinition> { }
  public abstract class ExtensionProvided_factory__o_j_e_c_c_d_TextArea__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<TextArea> { }
  public abstract class Type_factory__o_d_c_e_DefaultRuntimeErrorCallback__quals__j_e_i_Any_j_e_i_Default extends Factory<DefaultRuntimeErrorCallback> { }
  public abstract class Type_factory__o_d_d_c_DisplayerScreenPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<DisplayerScreenPresenter> { }
  public abstract class Type_factory__o_d_d_c_e_ClientIntervalBuilderDynamicDate__quals__j_e_i_Any_j_e_i_Default extends Factory<ClientIntervalBuilderDynamicDate> { }
  public abstract class Type_factory__o_d_c_e_ExternalDataSetClientProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<ExternalDataSetClientProvider> { }
  public abstract class Type_factory__o_d_c_n_w_NavTabListWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<NavTabListWidget> { }
  public abstract class Type_factory__o_u_c_w_p_i_TemplatedWorkbenchPanelView__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<TemplatedWorkbenchPanelView> { }
  public abstract class Type_factory__o_j_e_d_c_DataBinderProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<DataBinderProvider> { }
  public abstract class Type_factory__o_u_c_w_p_n_p_WorkbenchPartPresenterDefault__quals__j_e_i_Any_j_e_i_Default extends Factory<WorkbenchPartPresenterDefault> { }
  public abstract class Type_factory__o_u_e_e_c_c_f_p_SavePopUpView__quals__j_e_i_Any_j_e_i_Default extends Factory<SavePopUpView> { }
  public abstract class Type_factory__o_d_c_s_v_NotFoundScreenView__quals__j_e_i_Any_j_e_i_Default extends Factory<NotFoundScreenView> { }
  public abstract class JsType_factory__o_u_c_m_PlaceManager__quals__Universal extends Factory<PlaceManager> { }
  public abstract class Type_factory__o_d_c_n_AppNavBar__quals__j_e_i_Any_j_e_i_Default extends Factory<AppNavBar> { }
  public abstract class Type_factory__o_d_d_c_w_s_DefaultJsValidator__quals__j_e_i_Any_j_e_i_Default extends Factory<DefaultJsValidator> { }
  public abstract class Type_factory__o_d_d_c_c_f_BackendFunctionLoader__quals__j_e_i_Any_j_e_i_Default extends Factory<BackendFunctionLoader> { }
  public abstract class Type_factory__o_d_c_n_w_NavDropDownWidgetView__quals__j_e_i_Any_j_e_i_Default extends Factory<NavDropDownWidgetView> { }
  public abstract class Type_factory__o_u_c_v_p_d_CompassWidgetImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<CompassWidgetImpl> { }
  public abstract class JsType_factory__o_u_w_m_t_ToolBarItem__quals__Universal extends Factory<ToolBarItem> { }
  public abstract class Type_factory__o_u_c_v_p_m_WorkbenchMenuCompactNavBarView__quals__j_e_i_Any_j_e_i_Default extends Factory<WorkbenchMenuCompactNavBarView> { }
  public abstract class Type_factory__o_d_d_c_p_DisplayerPrototypes__quals__j_e_i_Any_j_e_i_Default extends Factory<DisplayerPrototypes> { }
  public abstract class Type_factory__o_d_c_n_w_NavComponentConfigModalView__quals__j_e_i_Any_j_e_i_Default extends Factory<NavComponentConfigModalView> { }
  public abstract class Type_factory__o_u_e_p_c_p_e_PerspectiveEditorPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<PerspectiveEditorPresenter> { }
  public abstract class Type_factory__o_d_c_p_EmptyPerspective__quals__j_e_i_Any_j_e_i_Default extends Factory<EmptyPerspective> { }
  public abstract class Type_factory__o_u_c_v_p_p_PopupViewImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<PopupViewImpl> { }
  public abstract class Type_factory__o_u_c_v_p_w_ConfirmPopup__quals__j_e_i_Any_j_e_i_Default extends Factory<ConfirmPopup> { }
  public abstract class Type_factory__o_d_c_e_CSVParser__quals__j_e_i_Any_j_e_i_Default extends Factory<CSVParser> { }
  public abstract class Type_factory__o_j_e_e_c_c_JsTypeEventObserver__quals__j_e_i_Any_j_e_i_Default extends Factory<JsTypeEventObserver> { }
  public abstract class Type_factory__o_u_c_w_w_t_WorkbenchToolBarPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<WorkbenchToolBarPresenter> { }
  public abstract class Type_factory__o_u_e_l_e_c_c_c_ColumnWithComponents__quals__j_e_i_Any_j_e_i_Default extends Factory<ColumnWithComponents> { }
  public abstract class JsType_factory__o_u_c_m_LockTarget__quals__Universal extends Factory<LockTarget> { }
  public abstract class Type_factory__o_u_e_e_c_c_BaseEditorEntryPoint__quals__j_e_i_Any_j_e_i_Default extends Factory<BaseEditorEntryPoint> { }
  public abstract class Type_factory__o_u_e_l_e_c_i_LayoutEditorCssHelper__quals__j_e_i_Any_j_e_i_Default extends Factory<LayoutEditorCssHelper> { }
  public abstract class Type_factory__o_u_e_w_c_c_d_n_NoItemsComponent__quals__j_e_i_Any_j_e_i_Default extends Factory<NoItemsComponent> { }
  public abstract class Type_factory__o_d_d_c_w_RendererSelectorListBoxView__quals__j_e_i_Any_j_e_i_Default extends Factory<RendererSelectorListBoxView> { }
  public abstract class Type_factory__o_u_e_e_c_c_f_e_FileExportProducer__quals__j_e_i_Any_j_e_i_Default extends Factory<FileExportProducer> { }
  public abstract class JsType_factory__o_u_w_m_Position__quals__Universal extends Factory<Position> { }
  public abstract class JsType_factory__o_u_w_m_PanelDefinition__quals__Universal extends Factory<PanelDefinition> { }
  public abstract class Type_factory__o_d_c_n_l_e_NavTilesDragComponent__quals__j_e_i_Any_j_e_i_Default extends Factory<NavTilesDragComponent> { }
  public abstract class Type_factory__o_u_e_e_c_c_f_CopyPopUpViewProducer__quals__j_e_i_Any_j_e_i_Default extends Factory<CopyPopUpViewProducer> { }
  public abstract class Type_factory__o_u_e_p_c_RuntimePluginsEntryPoint__quals__j_e_i_Any_j_e_i_Default extends Factory<RuntimePluginsEntryPoint> { }
  public abstract class ExtensionProvided_factory__o_j_e_c_c_d_Heading__quals__j_e_i_Any_j_e_i_Default_j_i_Named_1 extends Factory<Heading> { }
  public abstract class JsType_factory__o_u_c_m_LockTarget_TitleProvider__quals__Universal extends Factory<TitleProvider> { }
  public abstract class Type_factory__o_u_e_w_c_c_t_SimpleTable__quals__j_e_i_Any_j_e_i_Default extends Factory<SimpleTable> { }
  public abstract class Type_factory__o_j_e_e_c_c_WindowEventObservers__quals__j_e_i_Any_j_e_i_Default extends Factory<WindowEventObservers> { }
  public abstract class Type_factory__o_d_d_c_RendererManager__quals__j_e_i_Any_j_e_i_Default extends Factory<RendererManager> { }
  public abstract class Type_factory__o_u_e_l_e_c_LayoutEditorPropertiesScreenActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<LayoutEditorPropertiesScreenActivity> { }
  public abstract class Type_factory__o_d_c_n_NavBarHelper__quals__j_e_i_Any_j_e_i_Default extends Factory<org.dashbuilder.client.navigation.NavBarHelper> { }
  public abstract class Type_factory__o_u_e_w_c_c_c_BusyIndicatorView__quals__j_e_i_Any_j_e_i_Default extends Factory<BusyIndicatorView> { }
  public abstract class Type_factory__o_u_e_l_e_c_w_LayoutEditorPropertiesView__quals__j_e_i_Any_j_e_i_Default extends Factory<LayoutEditorPropertiesView> { }
  public abstract class Type_factory__o_u_e_w_c_c_m_MenuItemDividerView__quals__j_e_i_Any_o_u_e_w_c_c_m_MenuItemDivider extends Factory<MenuItemDividerView> { }
  public abstract class Type_factory__o_d_d_c_w_DisplayerSettingsJSONSourceViewer__quals__j_e_i_Any_j_e_i_Default extends Factory<DisplayerSettingsJSONSourceViewer> { }
  public abstract class Type_factory__o_d_r_c_s_SelectorSliderDisplayer__quals__j_e_i_Any_j_e_i_Default extends Factory<SelectorSliderDisplayer> { }
  public abstract class Type_factory__o_d_r_c_m_MutationObserverFactory__quals__j_e_i_Any_j_e_i_Default extends Factory<MutationObserverFactory> { }
  public abstract class JsType_factory__o_j_e_i_c_JsArray__quals__Universal extends Factory<JsArray> { }
  public abstract class Type_factory__o_d_d_c_w_f_DataSetFilterEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<DataSetFilterEditor> { }
  public abstract class JsType_factory__o_u_w_m_CompassPosition__quals__Universal extends Factory<CompassPosition> { }
  public abstract class Type_factory__o_u_c_m_ActivityManagerImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<ActivityManagerImpl> { }
  public abstract class JsType_factory__o_u_w_m_m_MenuVisitor__quals__Universal extends Factory<MenuVisitor> { }
  public abstract class Type_factory__o_d_r_c_c_C3Renderer__quals__j_e_i_Any_j_e_i_Default extends Factory<C3Renderer> { }
  public abstract class Type_factory__o_u_c_w_p_i_TemplatedWorkbenchPanelPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<TemplatedWorkbenchPanelPresenter> { }
  public abstract class Type_factory__o_d_c_n_w_NavDropDownWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<NavDropDownWidget> { }
  public abstract class Type_factory__o_j_e_i_c_l_i_StateChangeImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<StateChangeImpl> { }
  public abstract class Provider_factory__o_j_e_b_c_a_m_RequestDispatcher__quals__j_e_i_Any_j_e_i_Default extends Factory<RequestDispatcher> { }
  public abstract class Type_factory__o_d_r_c_m_MetricDisplayer__quals__j_e_i_Any_j_e_i_Default extends Factory<MetricDisplayer> { }
  public abstract class Type_factory__o_d_c_e_LineChartDragComponent__quals__j_e_i_Any_j_e_i_Default extends Factory<LineChartDragComponent> { }
  public abstract class Type_factory__o_d_c_RuntimeClientLoader__quals__j_e_i_Any_j_e_i_Default extends Factory<RuntimeClientLoader> { }
  public abstract class Type_factory__o_d_c_n_w_NavMenuBarWidgetView__quals__j_e_i_Any_j_e_i_Default extends Factory<NavMenuBarWidgetView> { }
  public abstract class Type_factory__o_u_e_l_e_c_w_KebabWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<KebabWidget> { }
  public abstract class Type_factory__o_u_c_v_p_w_ErrorPopup__quals__j_e_i_Any_j_e_i_Default extends Factory<ErrorPopup> { }
  public abstract class Type_factory__o_u_e_p_c_p_e_l_e_p_EditHTMLPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<EditHTMLPresenter> { }
  public abstract class Type_factory__o_j_e_u_c_l_s_TranslationServiceProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<TranslationServiceProvider> { }
  public abstract class Type_factory__o_d_c_c_e_l_DropDownEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<DropDownEditor> { }
  public abstract class ExtensionProvided_factory__o_u_e_w_c_c_a_AceEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<AceEditor> { }
  public abstract class Type_factory__o_d_r_c_s_SelectorDropDownItem__quals__j_e_i_Any_j_e_i_Default extends Factory<SelectorDropDownItem> { }
  public abstract class Type_factory__o_u_e_w_c_c_d_PerspectiveDropDown__quals__j_e_i_Any_j_e_i_Default extends Factory<PerspectiveDropDown> { }
  public abstract class Type_factory__o_d_d_c_w_g_ColumnFunctionEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<ColumnFunctionEditor> { }
  public abstract class Type_factory__o_d_c_n_w_e_NavRootNodeEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<NavRootNodeEditor> { }
  public abstract class Type_factory__o_u_c_w_p_i_AdaptiveWorkbenchPanelPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<AdaptiveWorkbenchPanelPresenter> { }
  public abstract class JsType_factory__o_u_c_w_t_ClientResourceType__quals__Universal extends Factory<ClientResourceType> { }
  public abstract class ExtensionProvided_factory__e_d_HTMLParagraphElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<HTMLParagraphElement> { }
  public abstract class Type_factory__o_d_r_c_s_SelectorSliderDisplayerView__quals__j_e_i_Any_j_e_i_Default extends Factory<SelectorSliderDisplayerView> { }
  public abstract class Type_factory__o_d_c_p_RuntimePerspectivePluginManager__quals__j_e_i_Any_j_e_i_Default extends Factory<RuntimePerspectivePluginManager> { }
  public abstract class JsType_factory__o_u_w_m_ActivityResourceType__quals__Universal extends Factory<ActivityResourceType> { }
  public abstract class Type_factory__o_u_c_w_p_u_p_UnanchoredWorkbenchPartPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<UnanchoredWorkbenchPartPresenter> { }
  public abstract class Type_factory__o_d_d_c_w_f_MultipleNumberParameterEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<MultipleNumberParameterEditor> { }
  public abstract class Type_factory__o_d_c_c_e_f_FileUploadEditorView__quals__j_e_i_Any_j_e_i_Default extends Factory<FileUploadEditorView> { }
  public abstract class Type_factory__o_u_c_v_p_m_m_c_GroupContextMenuItemView__quals__j_e_i_Any_j_e_i_Default extends Factory<GroupContextMenuItemView> { }
  public abstract class Producer_factory__o_j_e_i_c_c_SyncBeanManager__quals__j_e_i_Any_j_e_i_Default extends Factory<SyncBeanManager> { }
  public abstract class Type_factory__o_u_e_l_e_c_c_r_Row__quals__j_e_i_Any_j_e_i_Default extends Factory<Row> { }
  public abstract class Type_factory__o_d_d_c_c_ExternalComponentDispatcher__quals__j_e_i_Any_j_e_i_Default extends Factory<ExternalComponentDispatcher> { }
  public abstract class Type_factory__o_d_d_c_w_f_LikeToFunctionEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<LikeToFunctionEditor> { }
  public abstract class Type_factory__o_u_e_l_e_c_w_LayoutEditorPropertiesPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<LayoutEditorPropertiesPresenter> { }
  public abstract class ExtensionProvided_factory__o_j_e_c_c_d_Button__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<org.jboss.errai.common.client.dom.Button> { }
  public abstract class Type_factory__o_d_c_e_MetricDragComponent__quals__j_e_i_Any_j_e_i_Default extends Factory<MetricDragComponent> { }
  public abstract class Type_factory__o_u_e_l_e_c_w_LayoutElementPropertiesView__quals__j_e_i_Any_j_e_i_Default extends Factory<LayoutElementPropertiesView> { }
  public abstract class Type_factory__o_d_c_p_ContentErrorPerspectiveActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<ContentErrorPerspectiveActivity> { }
  public abstract class Type_factory__o_d_d_c_w_f_NumberParameterEditorView__quals__j_e_i_Any_j_e_i_Default extends Factory<NumberParameterEditorView> { }
  public abstract class ExtensionProvided_factory__o_u_c_w_w_p_StaticFocusedResizePanel__quals__j_e_i_Any_j_e_i_Default extends Factory<StaticFocusedResizePanel> { }
  public abstract class Type_factory__o_u_c_w_p_n_p_WorkbenchPartView__quals__j_e_i_Any_j_e_i_Default extends Factory<WorkbenchPartView> { }
  public abstract class Type_factory__o_u_c_w_w_m_m_c_ChildContextMenuItemPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<ChildContextMenuItemPresenter> { }
  public abstract class Type_factory__o_d_r_c_c_c_m_g_i_GWTGeoJsonLoader__quals__j_e_i_Any_j_e_i_Default extends Factory<GWTGeoJsonLoader> { }
  public abstract class Type_factory__o_d_c_s_ContentErrorScreenActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<ContentErrorScreenActivity> { }
  public abstract class Type_factory__o_u_e_p_c_p_e_l_e_PerspectiveEditorSettings__quals__j_e_i_Any_j_e_i_Default extends Factory<PerspectiveEditorSettings> { }
  public abstract class Type_factory__o_d_c_e_e_ExternalDragComponent__quals__j_e_i_Any_j_e_i_Default extends Factory<ExternalDragComponent> { }
  public abstract class Type_factory__o_d_d_c_w_f_TimeAmountEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<TimeAmountEditor> { }
  public abstract class Provider_factory__o_j_e_u_c_l_s_TranslationService__quals__j_e_i_Any_j_e_i_Default extends Factory<TranslationService> { }
  public abstract class Type_factory__o_u_c_v_p_m_m_m_IconMenuItemView__quals__j_e_i_Any_j_e_i_Default extends Factory<IconMenuItemView> { }
  public abstract class Type_factory__o_u_c_w_d_UberfireDocksContainer__quals__j_e_i_Any_j_e_i_Default extends Factory<UberfireDocksContainer> { }
  public abstract class Type_factory__o_u_c_w_p_i_LayoutPanelView__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<LayoutPanelView> { }
  private static void addLookups_0() {
    CDIEventTypeLookup.get().addLookup("org.dashbuilder.client.navigation.event.NavItemEditCancelledEvent", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("org.dashbuilder.displayer.client.events.DisplayerSubtypeSelectedEvent", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("org.dashbuilder.displayer.client.events.ColumnFilterChangedEvent", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("org.uberfire.ext.properties.editor.model.PropertyEditorChangeEvent", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("org.uberfire.ext.plugin.event.PluginRenamed", "org.uberfire.ext.plugin.event.BasePluginEvent");
    CDIEventTypeLookup.get().addLookup("org.dashbuilder.dataset.events.DataSetModifiedEvent", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("org.dashbuilder.displayer.client.events.GroupFunctionDeletedEvent", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("org.dashbuilder.shared.event.UpdatedRuntimeModelEvent", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("org.dashbuilder.displayer.client.events.DataSetGroupDateChanged", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("org.dashbuilder.dataset.events.DataSetStaleEvent", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("org.dashbuilder.displayer.client.events.DisplayerSettingsChangedEvent", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("org.dashbuilder.displayer.client.events.DataSetLookupChangedEvent", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("org.dashbuilder.displayer.client.events.DataSetFilterChangedEvent", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("org.uberfire.ext.plugin.client.perspective.editor.events.PerspectiveEditorFocusEvent", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("org.dashbuilder.dataset.events.DataSetDefRegisteredEvent", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("org.dashbuilder.navigation.event.NavTreeChangedEvent", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("org.dashbuilder.displayer.client.events.ColumnFilterDeletedEvent", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("org.dashbuilder.client.navigation.event.NavItemEditStartedEvent", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("org.uberfire.ext.plugin.event.PluginDeleted", "org.uberfire.ext.plugin.event.BasePluginEvent");
    CDIEventTypeLookup.get().addLookup("org.uberfire.client.workbench.events.PerspectiveChange", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("org.uberfire.client.workbench.events.PerspectiveChange", "org.uberfire.workbench.events.UberFireEvent");
    CDIEventTypeLookup.get().addLookup("org.dashbuilder.dataset.events.DataSetDefRemovedEvent", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("org.dashbuilder.shared.event.RemovedRuntimeModelEvent", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("org.dashbuilder.dataset.events.DataSetDefModifiedEvent", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("org.dashbuilder.displayer.client.events.GroupFunctionChangedEvent", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("org.dashbuilder.displayer.client.events.DisplayerTypeSelectedEvent", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("org.uberfire.ext.plugin.event.PluginAdded", "org.uberfire.ext.plugin.event.BasePluginEvent");
    CDIEventTypeLookup.get().addLookup("org.uberfire.ext.plugin.event.PluginSaved", "org.uberfire.ext.plugin.event.BasePluginEvent");
  }

  private void registerFactories0(final Context org_jboss_errai_ioc_client_container_DependentScopeContext_context, final Context org_jboss_errai_ioc_client_container_ApplicationScopedContext_context) {
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Cookie>) GWT.create(Type_factory__o_u_c_u_Cookie__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ExternalComponentPresenter>) GWT.create(Type_factory__o_d_d_c_w_ExternalComponentPresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ComponentColumnView>) GWT.create(Type_factory__o_u_e_l_e_c_c_c_ComponentColumnView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<DisplayerEditorStatus>) GWT.create(Type_factory__o_d_d_c_w_DisplayerEditorStatus__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<ClientDataSetMetadataJSONMarshaller>) GWT.create(Type_factory__o_d_c_m_ClientDataSetMetadataJSONMarshaller__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Caller>) GWT.create(ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ClientMessageBus>) GWT.create(Producer_factory__o_j_e_b_c_a_ClientMessageBus__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<UploadWidgetView>) GWT.create(Type_factory__o_d_c_w_v_UploadWidgetView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ResourceAction>) GWT.create(JsType_factory__o_u_s_ResourceAction__quals__Universal.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<LayoutEditorEntryPoint>) GWT.create(Type_factory__o_u_e_l_e_c_LayoutEditorEntryPoint__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<NavTreeEditorView>) GWT.create(Type_factory__o_d_c_n_w_e_NavTreeEditorView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<Workbench>) GWT.create(Type_factory__o_u_c_w_Workbench__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ResourceActionRef>) GWT.create(JsType_factory__o_u_s_a_ResourceActionRef__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<MultiListWorkbenchPanelPresenter>) GWT.create(Type_factory__o_u_c_w_p_i_MultiListWorkbenchPanelPresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<IntervalBuilderDynamicLabel>) GWT.create(Type_factory__o_d_d_e_g_IntervalBuilderDynamicLabel__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ResourceType>) GWT.create(JsType_factory__o_u_s_ResourceType__quals__Universal.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<ActivityBeansInfo>) GWT.create(Type_factory__o_u_c_m_ActivityBeansInfo__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<MenuItemWithIconView>) GWT.create(Type_factory__o_u_e_w_c_c_m_MenuItemWithIconView__quals__j_e_i_Any_o_u_e_w_c_c_m_MenuItemWithIcon.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<NavMenuBarWidget>) GWT.create(Type_factory__o_d_c_n_w_NavMenuBarWidget__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<UnanchoredWorkbenchPartView>) GWT.create(Type_factory__o_u_c_w_p_u_p_UnanchoredWorkbenchPartView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ComponentColumnPart>) GWT.create(Type_factory__o_u_e_l_e_c_c_c_ComponentColumnPart__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<LayoutDragComponentGroupView>) GWT.create(Type_factory__o_u_e_l_e_c_w_LayoutDragComponentGroupView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<TextBox>) GWT.create(ExtensionProvided_factory__o_g_c_u_TextBox__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<MapEditorView>) GWT.create(Type_factory__o_d_c_c_e_m_MapEditorView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ToggleSwitchEditorView>) GWT.create(Type_factory__o_d_c_c_e_ToggleSwitchEditorView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Select>) GWT.create(Type_factory__o_u_c_v_p_w_Select__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<PanelDefinitionImpl>) GWT.create(Type_factory__o_u_w_m_i_PanelDefinitionImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<C3PieChartDisplayer>) GWT.create(Type_factory__o_d_r_c_c_c_p_C3PieChartDisplayer__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ErrorPopupView>) GWT.create(Type_factory__o_u_c_v_p_w_ErrorPopupView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<RouterScreenView>) GWT.create(Type_factory__o_d_c_s_v_RouterScreenView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<NavCarouselWidgetView>) GWT.create(Type_factory__o_d_c_n_w_NavCarouselWidgetView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<C3JsTypesFactory>) GWT.create(Type_factory__o_d_r_c_c_j_C3JsTypesFactory__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<MultiScreenView>) GWT.create(Type_factory__o_u_c_v_p_m_MultiScreenView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<UploadWidget>) GWT.create(Type_factory__o_d_c_w_UploadWidget__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<MenuGroup>) GWT.create(JsType_factory__o_u_w_m_m_MenuGroup__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<AdaptiveWorkbenchPanelView>) GWT.create(Type_factory__o_u_c_w_p_i_AdaptiveWorkbenchPanelView__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<PerspectivePluginEntryPoint>) GWT.create(Type_factory__o_d_c_n_p_PerspectivePluginEntryPoint__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<WorkbenchDragAndDropManager>) GWT.create(Type_factory__o_u_c_w_w_d_WorkbenchDragAndDropManager__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<NavTilesWidget>) GWT.create(Type_factory__o_d_c_n_w_NavTilesWidget__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<LayoutEditorPropertiesScreen>) GWT.create(Type_factory__o_u_e_l_e_c_LayoutEditorPropertiesScreen__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<ContentErrorScreen>) GWT.create(Type_factory__o_d_c_s_ContentErrorScreen__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SelectComponent>) GWT.create(Type_factory__o_u_e_w_c_c_s_SelectComponent__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ExternalComponentDisplayerView>) GWT.create(Type_factory__o_d_r_c_e_ExternalComponentDisplayerView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<PerspectiveManagerImpl>) GWT.create(Type_factory__o_u_c_m_PerspectiveManagerImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<ErrorPopupPresenter>) GWT.create(Type_factory__o_u_c_w_w_c_ErrorPopupPresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<RuntimePerspectiveGenerator>) GWT.create(Type_factory__o_d_c_p_g_RuntimePerspectiveGenerator__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<C3MeterView>) GWT.create(Type_factory__o_d_r_c_c_c_m_C3MeterView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<ExternalComponentMessageHelperProducer>) GWT.create(Type_factory__o_d_d_c_c_ExternalComponentMessageHelperProducer__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ExternalDisplayerDragComponent>) GWT.create(Type_factory__o_d_c_e_e_ExternalDisplayerDragComponent__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Event>) GWT.create(ContextualProvider_factory__j_e_e_Event__quals__Universal.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<MapTooltip>) GWT.create(Type_factory__o_d_r_c_c_c_m_w_MapTooltip__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<RuntimeScreen>) GWT.create(Type_factory__o_d_c_s_RuntimeScreen__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DashboardsListPerspectiveActivity>) GWT.create(Type_factory__o_d_c_p_DashboardsListPerspectiveActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<YAMLRuntimeModelClientParser>) GWT.create(Type_factory__o_d_c_p_YAMLRuntimeModelClientParser__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<ContentErrorPerspective>) GWT.create(Type_factory__o_d_c_p_ContentErrorPerspective__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<PieChartDragComponent>) GWT.create(Type_factory__o_d_c_e_PieChartDragComponent__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<PropertyReplacementService>) GWT.create(Type_factory__o_d_c_p_PropertyReplacementService__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<StandaloneEditorPerspective>) GWT.create(Type_factory__o_u_c_w_StandaloneEditorPerspective__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<CopyPopUpView>) GWT.create(Type_factory__o_u_e_e_c_c_f_p_CopyPopUpView__quals__j_e_i_Any_o_u_a_FallbackImplementation.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<InitBallot>) GWT.create(ContextualProvider_factory__o_j_e_i_c_a_InitBallot__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ToggleSwitchEditor>) GWT.create(Type_factory__o_d_c_c_e_ToggleSwitchEditor__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ImmutableWorkbenchPanelView>) GWT.create(Type_factory__o_u_c_w_p_i_ImmutableWorkbenchPanelView__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<Others>) GWT.create(Type_factory__o_u_w_c_Others__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Input>) GWT.create(ExtensionProvided_factory__o_j_e_c_c_d_Input__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Elemental2DomUtil>) GWT.create(Type_factory__o_j_e_c_c_d_e_Elemental2DomUtil__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DisplayerTypeSelector>) GWT.create(Type_factory__o_d_d_c_w_DisplayerTypeSelector__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<WorkbenchServicesProxyClientImpl>) GWT.create(Type_factory__o_u_c_w_WorkbenchServicesProxyClientImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ValueBoxEditorView>) GWT.create(Type_factory__o_d_c_c_e_ValueBoxEditorView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<StaticWorkbenchPanelPresenter>) GWT.create(Type_factory__o_u_c_w_p_i_StaticWorkbenchPanelPresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Clipboard>) GWT.create(Type_factory__o_u_c_u_Clipboard__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<ClientUUIDGenerator>) GWT.create(Type_factory__o_d_d_c_u_ClientUUIDGenerator__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<MultipleNumberParameterEditorView>) GWT.create(Type_factory__o_d_d_c_w_f_MultipleNumberParameterEditorView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Button>) GWT.create(Type_factory__o_u_c_v_p_w_Button__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<TableEntryPoint>) GWT.create(Type_factory__o_u_e_w_t_c_TableEntryPoint__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<RuntimeChannelClient>) GWT.create(Type_factory__o_d_c_c_RuntimeChannelClient__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<TabPanelWithDropdowns>) GWT.create(Type_factory__o_u_c_v_p_t_TabPanelWithDropdowns__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<RowView>) GWT.create(Type_factory__o_u_e_l_e_c_c_r_RowView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ToolBarIcon>) GWT.create(JsType_factory__o_u_w_m_t_ToolBarIcon__quals__Universal.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<PerspectiveEditorGenerator>) GWT.create(Type_factory__o_u_e_p_c_p_e_g_PerspectiveEditorGenerator__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<NumberInput>) GWT.create(ExtensionProvided_factory__o_j_e_c_c_d_NumberInput__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<BatchCaller>) GWT.create(Provider_factory__o_j_e_c_c_a_BatchCaller__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SimpleWorkbenchPanelPresenter>) GWT.create(Type_factory__o_u_c_w_p_i_SimpleWorkbenchPanelPresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<RuntimeModelBackendAppLoader>) GWT.create(Type_factory__o_d_c_RuntimeModelBackendAppLoader__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<ComponentFunctionLocator>) GWT.create(Type_factory__o_d_d_c_c_f_ComponentFunctionLocator__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DropDownImageListEditor>) GWT.create(Type_factory__o_d_c_c_e_l_DropDownImageListEditor__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<FormLabel>) GWT.create(Type_factory__o_u_c_v_p_w_FormLabel__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<LayoutComponentPaletteScreen>) GWT.create(Type_factory__o_u_e_l_e_c_LayoutComponentPaletteScreen__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SelectorLabelItemView>) GWT.create(Type_factory__o_d_r_c_s_SelectorLabelItemView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<HTMLLayoutDragComponent>) GWT.create(Type_factory__o_u_e_p_c_p_e_l_e_HTMLLayoutDragComponent__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<WorkbenchBackendEntryPoint>) GWT.create(Type_factory__o_u_c_WorkbenchBackendEntryPoint__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Container>) GWT.create(Type_factory__o_u_e_l_e_c_c_c_Container__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<BooleanField>) GWT.create(Type_factory__o_u_e_p_e_c_f_BooleanField__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<IconMenuItemPresenter>) GWT.create(Type_factory__o_u_c_w_w_m_m_m_IconMenuItemPresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<MenuPosition>) GWT.create(JsType_factory__o_u_w_m_m_MenuPosition__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<WorkbenchMegaMenuView>) GWT.create(Type_factory__o_u_c_v_p_m_m_WorkbenchMegaMenuView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<MultiScreenMenuBuilder>) GWT.create(Type_factory__o_u_c_v_p_m_MultiScreenMenuBuilder__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SelectOptionView>) GWT.create(Type_factory__o_u_e_w_c_c_s_SelectOptionView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<EmptyDropRowView>) GWT.create(Type_factory__o_u_e_l_e_c_c_r_EmptyDropRowView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<AppFormerActivities>) GWT.create(Producer_factory__o_u_w_m_AppFormerActivities__quals__j_e_i_Any_o_u_a_Customizable.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<PatternFlyEntryPoint>) GWT.create(Type_factory__o_u_c_v_p_PatternFlyEntryPoint__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<WorkbenchMenuStandardNavBarView>) GWT.create(Type_factory__o_u_c_v_p_m_WorkbenchMenuStandardNavBarView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<DocksEntryPoint>) GWT.create(Type_factory__o_u_c_DocksEntryPoint__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<BatchCallerProvider>) GWT.create(Type_factory__o_j_e_i_s_b_c_BatchCallerProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<ClientDataSetManager>) GWT.create(Type_factory__o_d_d_c_ClientDataSetManager__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DisplayerHtmlEditor>) GWT.create(Type_factory__o_d_d_c_w_DisplayerHtmlEditor__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ImageFileExport>) GWT.create(Producer_factory__o_u_e_e_c_c_f_e_ImageFileExport__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<TimeInstantEditorView>) GWT.create(Type_factory__o_d_d_c_w_f_TimeInstantEditorView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Set>) GWT.create(JsType_factory__j_u_Set__quals__Universal.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<RuntimeEntryPoint>) GWT.create(Type_factory__o_d_c_RuntimeEntryPoint__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<NavTabListWidgetView>) GWT.create(Type_factory__o_d_c_n_w_NavTabListWidgetView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<HTMLDocument>) GWT.create(Producer_factory__e_d_HTMLDocument__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ExternalComponentEditor>) GWT.create(Type_factory__o_d_d_c_w_ExternalComponentEditor__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<MenuItemHeaderView>) GWT.create(Type_factory__o_u_e_w_c_c_m_MenuItemHeaderView__quals__j_e_i_Any_o_u_e_w_c_c_m_MenuItemHeader.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<DefaultBeanFactory>) GWT.create(Type_factory__o_u_c_w_DefaultBeanFactory__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ColumnDetailsEditor>) GWT.create(Type_factory__o_d_d_c_w_g_ColumnDetailsEditor__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SelectorDisplayerView>) GWT.create(Type_factory__o_d_r_c_s_SelectorDisplayerView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<NotFoundPerspective>) GWT.create(Type_factory__o_d_c_p_NotFoundPerspective__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<PartManager>) GWT.create(Type_factory__o_u_c_w_p_s_PartManager__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<ClientIntervalBuilderLocator>) GWT.create(Type_factory__o_d_d_c_e_ClientIntervalBuilderLocator__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<AccessImpl>) GWT.create(Type_factory__o_j_e_i_c_l_i_AccessImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<Undefined>) GWT.create(Type_factory__o_u_w_c_Undefined__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<NavMenuBarDragComponent>) GWT.create(Type_factory__o_d_c_n_l_e_NavMenuBarDragComponent__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DashboardCard>) GWT.create(Type_factory__o_d_c_w_DashboardCard__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<WorkbenchToolBarView>) GWT.create(Type_factory__o_u_c_v_p_t_WorkbenchToolBarView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<C3LineChartView>) GWT.create(Type_factory__o_d_r_c_c_c_l_C3LineChartView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<RuntimeRendererSettingsService>) GWT.create(Type_factory__o_d_c_s_d_RuntimeRendererSettingsService__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<HTMLOptionElement>) GWT.create(ExtensionProvided_factory__e_d_HTMLOptionElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<NavItemDefaultEditor>) GWT.create(Type_factory__o_d_c_n_w_e_NavItemDefaultEditor__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<PagedTable>) GWT.create(Type_factory__o_u_e_w_c_c_t_PagedTable__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<RouterScreen>) GWT.create(Type_factory__o_d_c_s_RouterScreen__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DisplayerSettingsEditorView>) GWT.create(Type_factory__o_d_d_c_w_DisplayerSettingsEditorView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DashboardsListScreenActivity>) GWT.create(Type_factory__o_d_c_s_DashboardsListScreenActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<LayoutComponentPaletteScreenActivity>) GWT.create(Type_factory__o_u_e_l_e_c_LayoutComponentPaletteScreenActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ActivityNotFoundView>) GWT.create(Type_factory__o_u_c_v_p_n_ActivityNotFoundView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<HTMLIFrameElement>) GWT.create(ExtensionProvided_factory__e_d_HTMLIFrameElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SelectorDropDownItemView>) GWT.create(Type_factory__o_d_r_c_s_SelectorDropDownItemView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<KebabMenuItem>) GWT.create(Type_factory__o_u_c_v_p_w_KebabMenuItem__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Map>) GWT.create(JsType_factory__j_u_Map__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<HorizImageListEditor>) GWT.create(Type_factory__o_d_c_c_e_l_HorizImageListEditor__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DisplayerErrorWidget>) GWT.create(Type_factory__o_d_d_c_w_DisplayerErrorWidget__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SplashModalFooter>) GWT.create(Type_factory__o_u_c_v_p_s_SplashModalFooter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<PartContextMenusView>) GWT.create(Type_factory__o_u_c_v_p_m_PartContextMenusView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<DisplayerClientEntryPoint>) GWT.create(Type_factory__o_d_d_c_DisplayerClientEntryPoint__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ResizeTabPanel>) GWT.create(Type_factory__o_u_c_v_p_t_ResizeTabPanel__quals__j_e_i_Any_o_u_c_v_p_t_Resize.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<FilterLabelSet>) GWT.create(Type_factory__o_d_c_c_w_FilterLabelSet__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ListFunctions>) GWT.create(Type_factory__o_d_d_c_c_f_ListFunctions__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<NotFoundPerspectiveActivity>) GWT.create(Type_factory__o_d_c_p_NotFoundPerspectiveActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<PartDefinition>) GWT.create(JsType_factory__o_u_w_m_PartDefinition__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Paragraph>) GWT.create(ExtensionProvided_factory__o_j_e_c_c_d_Paragraph__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<UnanchoredStaticWorkbenchPanelPresenter>) GWT.create(Type_factory__o_u_c_w_p_i_UnanchoredStaticWorkbenchPanelPresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<RuntimeModelClientParserFactory>) GWT.create(Type_factory__o_d_c_p_RuntimeModelClientParserFactory__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<MenuItemCommand>) GWT.create(JsType_factory__o_u_w_m_m_MenuItemCommand__quals__Universal.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<NotFoundScreen>) GWT.create(Type_factory__o_d_c_s_NotFoundScreen__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<TableDisplayerView>) GWT.create(Type_factory__o_d_r_c_t_TableDisplayerView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<UnorderedList>) GWT.create(ExtensionProvided_factory__o_j_e_c_c_d_UnorderedList__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<RootPanel>) GWT.create(Provider_factory__c_g_g_u_c_u_RootPanel__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<ErrorResponseVerifier>) GWT.create(Type_factory__o_d_c_e_ErrorResponseVerifier__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<PerspectiveLayoutPluginResourceType>) GWT.create(Type_factory__o_u_e_p_c_t_PerspectiveLayoutPluginResourceType__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<NavTilesWidgetView>) GWT.create(Type_factory__o_d_c_n_w_NavTilesWidgetView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SelectorDropDownDisplayer>) GWT.create(Type_factory__o_d_r_c_s_SelectorDropDownDisplayer__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<StaticWorkbenchPanelView>) GWT.create(Type_factory__o_u_c_w_p_i_StaticWorkbenchPanelView__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<EmptyScreenView>) GWT.create(Type_factory__o_d_c_s_v_EmptyScreenView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<HTML5DndSeleniumSupport>) GWT.create(Type_factory__o_u_c_v_p_HTML5DndSeleniumSupport__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<TimeInstantEditor>) GWT.create(Type_factory__o_d_d_c_w_f_TimeInstantEditor__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<C3LineChartDisplayer>) GWT.create(Type_factory__o_d_r_c_c_c_l_C3LineChartDisplayer__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<NumberParameterEditor>) GWT.create(Type_factory__o_d_d_c_w_f_NumberParameterEditor__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<LiveSearchSelectorDropDownItemViewImpl>) GWT.create(Type_factory__o_u_e_w_c_c_d_i_LiveSearchSelectorDropDownItemViewImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<MultiScreenWorkbenchPanelPresenter>) GWT.create(Type_factory__o_u_c_w_p_i_MultiScreenWorkbenchPanelPresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<WorkbenchMenuBarPresenter>) GWT.create(Producer_factory__o_u_c_w_w_m_WorkbenchMenuBarPresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ToolBar>) GWT.create(JsType_factory__o_u_w_m_t_ToolBar__quals__Universal.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<ComponentGroupProducer>) GWT.create(Type_factory__o_d_c_e_e_ComponentGroupProducer__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<BarChartDragComponent>) GWT.create(Type_factory__o_d_c_e_BarChartDragComponent__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<NavTreeDragComponent>) GWT.create(Type_factory__o_d_c_n_l_e_NavTreeDragComponent__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<JQuery>) GWT.create(Producer_factory__o_u_c_v_p_w_JQueryElementalProducer_JQuery__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<WorkbenchViewModeSwitcherView>) GWT.create(Type_factory__o_u_c_v_p_m_WorkbenchViewModeSwitcherView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<PartContextMenusPresenter>) GWT.create(Type_factory__o_u_c_w_w_m_PartContextMenusPresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SplashScreenMenuView>) GWT.create(Type_factory__o_u_c_v_p_m_SplashScreenMenuView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SelectorLabelSetDisplayer>) GWT.create(Type_factory__o_d_r_c_s_SelectorLabelSetDisplayer__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DestructionImpl>) GWT.create(Type_factory__o_j_e_i_c_l_i_DestructionImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<TargetPerspectiveEditor>) GWT.create(Type_factory__o_d_c_n_w_e_TargetPerspectiveEditor__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DataSetGroupDateEditor>) GWT.create(Type_factory__o_d_d_c_w_g_DataSetGroupDateEditor__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<UberfireBreadcrumbsView>) GWT.create(Type_factory__o_u_e_w_c_c_b_UberfireBreadcrumbsView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<HtmlEditorView>) GWT.create(Type_factory__o_u_e_e_c_c_h_HtmlEditorView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<CompassDropController>) GWT.create(Type_factory__o_u_c_w_w_d_CompassDropController__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ColumnDetailsEditorView>) GWT.create(Type_factory__o_d_d_c_w_g_ColumnDetailsEditorView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<BootstrapLayoutGenerator>) GWT.create(Type_factory__o_u_e_l_e_c_g_BootstrapLayoutGenerator__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SelectorLabelSetDisplayerView>) GWT.create(Type_factory__o_d_r_c_s_SelectorLabelSetDisplayerView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<FilterLabel>) GWT.create(Type_factory__o_d_c_c_w_FilterLabel__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<PluginNameValidator>) GWT.create(Type_factory__o_u_e_p_c_v_PluginNameValidator__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<FormGroup>) GWT.create(Type_factory__o_u_c_v_p_w_FormGroup__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<MultiTabWorkbenchPanelView>) GWT.create(Type_factory__o_u_c_v_p_t_MultiTabWorkbenchPanelView__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ChildContextMenuItemView>) GWT.create(Type_factory__o_u_c_v_p_m_m_c_ChildContextMenuItemView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ColumnFilterEditor>) GWT.create(Type_factory__o_d_d_c_w_f_ColumnFilterEditor__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<MenuBuilderHelper>) GWT.create(Type_factory__o_d_c_n_MenuBuilderHelper__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<ValueFormatterRegistry>) GWT.create(Type_factory__o_d_d_c_f_ValueFormatterRegistry__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<InitBallotProvider>) GWT.create(Type_factory__o_j_e_i_c_a_b_InitBallotProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<MenuItemFactory>) GWT.create(Type_factory__o_u_e_w_c_c_m_MenuItemFactory__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Command>) GWT.create(JsType_factory__o_u_m_Command__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DashboardsListScreenView>) GWT.create(Type_factory__o_d_c_s_v_DashboardsListScreenView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<LocaleListBox>) GWT.create(Type_factory__o_j_e_u_c_w_LocaleListBox__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ImmutableWorkbenchPanelPresenter>) GWT.create(Type_factory__o_u_c_w_p_i_ImmutableWorkbenchPanelPresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ExternalComponentEditorPopUp>) GWT.create(Type_factory__o_d_d_c_w_ExternalComponentEditorPopUp__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<RendererSelectorTabListView>) GWT.create(Type_factory__o_d_d_c_w_RendererSelectorTabListView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<LiveSearchDropDownView>) GWT.create(Type_factory__o_u_e_w_c_c_d_LiveSearchDropDownView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<UtilityMenuBarPresenter>) GWT.create(Type_factory__o_u_c_w_w_m_UtilityMenuBarPresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<TextField>) GWT.create(Type_factory__o_u_e_p_e_c_f_TextField__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<TargetDivDragComponent>) GWT.create(Type_factory__o_u_e_p_c_p_e_l_e_TargetDivDragComponent__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<PlaceRequest>) GWT.create(JsType_factory__o_u_m_PlaceRequest__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DisplayerViewer>) GWT.create(Type_factory__o_d_d_c_w_DisplayerViewer__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<NavItemTileWidgetView>) GWT.create(Type_factory__o_d_c_n_w_NavItemTileWidgetView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<AlertBoxView>) GWT.create(Type_factory__o_d_c_c_w_AlertBoxView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<DefaultRenderer>) GWT.create(Type_factory__o_d_r_c_DefaultRenderer__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<DeletePopUpPresenter>) GWT.create(Type_factory__o_u_e_e_c_c_f_p_DeletePopUpPresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<MultiListWorkbenchPanelView>) GWT.create(Type_factory__o_u_c_w_p_i_MultiListWorkbenchPanelView__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ColumnWithComponentsView>) GWT.create(Type_factory__o_u_e_l_e_c_c_c_ColumnWithComponentsView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<IntervalBuilderFixedDate>) GWT.create(Type_factory__o_d_d_e_g_IntervalBuilderFixedDate__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<ActivityNotFoundPresenter>) GWT.create(Type_factory__o_u_c_w_w_n_ActivityNotFoundPresenter__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<RouterPerspective>) GWT.create(Type_factory__o_d_c_p_RouterPerspective__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<ClientTypeRegistryImpl>) GWT.create(Type_factory__o_u_c_w_t_i_ClientTypeRegistryImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DisplayerTypeSelectorView>) GWT.create(Type_factory__o_d_d_c_w_DisplayerTypeSelectorView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ClosableSimpleWorkbenchPanelPresenter>) GWT.create(Type_factory__o_u_c_w_p_i_ClosableSimpleWorkbenchPanelPresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<LockDemandDetector>) GWT.create(Type_factory__o_u_c_m_LockDemandDetector__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ColorField>) GWT.create(Type_factory__o_u_e_p_e_c_f_ColorField__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<HTMLDivElement>) GWT.create(ExtensionProvided_factory__e_d_HTMLDivElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<RendererSelectorRadioListView>) GWT.create(Type_factory__o_d_d_c_w_RendererSelectorRadioListView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<CommonsEntryPoint>) GWT.create(Type_factory__o_u_e_w_c_c_CommonsEntryPoint__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<TimeAmountEditorView>) GWT.create(Type_factory__o_d_d_c_w_f_TimeAmountEditorView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<UberfireBreadcrumbsContainerImpl>) GWT.create(Type_factory__o_u_e_w_c_c_b_h_UberfireBreadcrumbsContainerImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<NavTreeWidgetView>) GWT.create(Type_factory__o_d_c_n_w_NavTreeWidgetView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SimpleWorkbenchPanelView>) GWT.create(Type_factory__o_u_c_w_p_i_SimpleWorkbenchPanelView__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<JsTypeProvider>) GWT.create(JsType_factory__o_j_e_i_c_c_JsTypeProvider__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SelectorDropDownDisplayerView>) GWT.create(Type_factory__o_d_r_c_s_SelectorDropDownDisplayerView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<HTMLElement>) GWT.create(ContextualProvider_factory__e_d_HTMLElement__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SimpleDnDWorkbenchPanelView>) GWT.create(Type_factory__o_u_c_w_p_i_SimpleDnDWorkbenchPanelView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<LiveSearchFooter>) GWT.create(Type_factory__o_u_e_w_c_c_d_f_LiveSearchFooter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DisplayerError>) GWT.create(Type_factory__o_d_d_c_w_DisplayerError__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<HTMLTextAreaElement>) GWT.create(ExtensionProvided_factory__e_d_HTMLTextAreaElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<WorkbenchMenuBarView>) GWT.create(Type_factory__o_u_c_v_p_m_WorkbenchMenuBarView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DateParameterEditorView>) GWT.create(Type_factory__o_d_d_c_w_f_DateParameterEditorView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<EventProvider>) GWT.create(Type_factory__o_j_e_e_c_c_EventProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SanitizedNumberInput>) GWT.create(Type_factory__o_u_c_v_p_w_SanitizedNumberInput__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<MenuItem>) GWT.create(JsType_factory__o_u_w_m_m_MenuItem__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<TargetPerspectiveEditorView>) GWT.create(Type_factory__o_d_c_n_w_e_TargetPerspectiveEditorView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<LayoutComponentPalettePresenter>) GWT.create(Type_factory__o_u_e_l_e_c_w_LayoutComponentPalettePresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Instance>) GWT.create(ContextualProvider_factory__j_e_i_Instance__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<HeaderPanel>) GWT.create(ExtensionProvided_factory__c_g_g_u_c_u_HeaderPanel__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<EventBus>) GWT.create(Producer_factory__c_g_w_b_e_s_EventBus__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<MultipleTextParameterEditorView>) GWT.create(Type_factory__o_d_d_c_w_f_MultipleTextParameterEditorView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<PerspectiveEditorCoreGroupProvider>) GWT.create(Type_factory__o_u_e_p_c_p_e_a_PerspectiveEditorCoreGroupProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Heading>) GWT.create(ExtensionProvided_factory__o_j_e_c_c_d_Heading__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<MultiPageEditorViewImpl>) GWT.create(Type_factory__o_u_c_v_p_m_MultiPageEditorViewImpl__quals__j_e_i_Any_o_u_c_w_w_m_Multiple.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<TableDisplayer>) GWT.create(Type_factory__o_d_r_c_t_TableDisplayer__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<GroupMenuItemView>) GWT.create(Type_factory__o_u_c_v_p_m_m_m_GroupMenuItemView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<JSONRuntimeModelClientParser>) GWT.create(Type_factory__o_d_c_p_JSONRuntimeModelClientParser__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<WorkbenchMegaMenuPresenter>) GWT.create(Producer_factory__o_u_c_w_w_m_m_WorkbenchMegaMenuPresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<PerspectiveCoordinator>) GWT.create(Type_factory__o_d_d_c_PerspectiveCoordinator__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ClosableSimpleWorkbenchPanelView>) GWT.create(Type_factory__o_u_c_w_p_i_ClosableSimpleWorkbenchPanelView__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<CallerProvider>) GWT.create(Type_factory__o_j_e_i_c_a_b_CallerProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<PermissionTreeI18NImpl>) GWT.create(Type_factory__o_u_c_r_i_PermissionTreeI18NImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DisplayerSettingsEditor>) GWT.create(Type_factory__o_d_d_c_w_DisplayerSettingsEditor__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<MultipleTextParameterEditor>) GWT.create(Type_factory__o_d_d_c_w_f_MultipleTextParameterEditor__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DropdownMenu>) GWT.create(Type_factory__o_u_c_v_p_w_DropdownMenu__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<AppFormerActivitiesProducer>) GWT.create(Type_factory__o_u_w_m_AppFormerActivitiesProducer__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Span>) GWT.create(ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<HTMLInputElement>) GWT.create(ExtensionProvided_factory__e_d_HTMLInputElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ObservablePathImpl>) GWT.create(Type_factory__o_u_b_v_i_ObservablePathImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<HTMLOListElement>) GWT.create(ExtensionProvided_factory__e_d_HTMLOListElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<RuntimeDataSetClientServices>) GWT.create(Type_factory__o_d_c_s_RuntimeDataSetClientServices__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<NavTreeEditor>) GWT.create(Type_factory__o_d_c_n_w_e_NavTreeEditor__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DisplayerDragComponent>) GWT.create(Type_factory__o_d_c_e_DisplayerDragComponent__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<MapEditor>) GWT.create(Type_factory__o_d_c_c_e_m_MapEditor__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<UberTabPanel>) GWT.create(Type_factory__o_u_c_v_p_t_UberTabPanel__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<C3BubbleChartDisplayer>) GWT.create(Type_factory__o_d_r_c_c_c_b_C3BubbleChartDisplayer__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Activity>) GWT.create(JsType_factory__o_u_c_m_Activity__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<HTMLButtonElement>) GWT.create(ExtensionProvided_factory__e_d_HTMLButtonElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<NavComponentConfigModal>) GWT.create(Type_factory__o_d_c_n_w_NavComponentConfigModal__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<NavigationManagerImpl>) GWT.create(Type_factory__o_d_c_n_i_NavigationManagerImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<CurrentBranch>) GWT.create(Producer_factory__o_u_e_e_c_v_CurrentBranch__quals__j_e_i_Any_o_u_a_Customizable.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<LocaleSelector>) GWT.create(Type_factory__o_j_e_u_c_w_LocaleSelector__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ExternalComponentView>) GWT.create(Type_factory__o_d_d_c_w_ExternalComponentView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<LayoutComponentPaletteView>) GWT.create(Type_factory__o_u_e_l_e_c_w_LayoutComponentPaletteView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ExternalComponentPropertiesEditorView>) GWT.create(Type_factory__o_d_d_c_w_ExternalComponentPropertiesEditorView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<CreationImpl>) GWT.create(Type_factory__o_j_e_i_c_l_i_CreationImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ListComponentProvider>) GWT.create(Type_factory__o_j_e_d_c_ListComponentProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<MenuItemPerspective>) GWT.create(JsType_factory__o_u_w_m_m_MenuItemPerspective__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ContextDefinition>) GWT.create(JsType_factory__o_u_w_m_ContextDefinition__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<PerspectiveEditorView>) GWT.create(Type_factory__o_u_e_p_c_p_e_PerspectiveEditorView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<UberfireBreadcrumbs>) GWT.create(Type_factory__o_u_e_w_c_c_b_UberfireBreadcrumbs__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<LayoutEditorPluginImpl>) GWT.create(Type_factory__o_u_e_l_e_c_LayoutEditorPluginImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SplashViewImpl>) GWT.create(Type_factory__o_u_c_v_p_s_SplashViewImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<PerspectiveActivity>) GWT.create(JsType_factory__o_u_c_m_PerspectiveActivity__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<JsTypeEventObserver>) GWT.create(JsType_factory__o_j_e_e_c_c_JsTypeEventObserver__quals__Universal.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<WorkbenchLayoutImpl>) GWT.create(Type_factory__o_u_c_w_WorkbenchLayoutImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ClientDateFormatterImpl>) GWT.create(Type_factory__o_d_d_c_e_ClientDateFormatterImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<HtmlEditorPresenter>) GWT.create(Type_factory__o_u_e_e_c_c_h_HtmlEditorPresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<LoadingBox>) GWT.create(Type_factory__o_d_c_c_w_LoadingBox__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<TimeFrameEditor>) GWT.create(Type_factory__o_d_d_c_w_f_TimeFrameEditor__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<DataSetPrototypes>) GWT.create(Type_factory__o_d_d_c_p_DataSetPrototypes__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DefaultHtmlValidator>) GWT.create(Type_factory__o_d_d_c_w_s_DefaultHtmlValidator__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SavePopUpPresenter>) GWT.create(Type_factory__o_u_e_e_c_c_f_p_SavePopUpPresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<C3PieChartView>) GWT.create(Type_factory__o_d_r_c_c_c_p_C3PieChartView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ChildMenuItemView>) GWT.create(Type_factory__o_u_c_v_p_m_m_m_ChildMenuItemView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DefaultMenuGroup>) GWT.create(JsType_factory__o_u_w_m_m_i_DefaultMenuGroup__quals__Universal.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<RuntimeBackendComponentFunctionService>) GWT.create(Type_factory__o_d_c_s_RuntimeBackendComponentFunctionService__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<UberfireDocksImpl>) GWT.create(Type_factory__o_u_c_d_UberfireDocksImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SimpleDnDWorkbenchPanelPresenter>) GWT.create(Type_factory__o_u_c_w_p_i_SimpleDnDWorkbenchPanelPresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<MultiScreenPartWidget>) GWT.create(Type_factory__o_u_c_v_p_m_MultiScreenPartWidget__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SimpleNoExpandWorkbenchPanelView>) GWT.create(Type_factory__o_u_c_w_p_i_SimpleNoExpandWorkbenchPanelView__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<LifecycleListenerRegistrarImpl>) GWT.create(Type_factory__o_j_e_i_c_l_i_LifecycleListenerRegistrarImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<RenamePopUpView>) GWT.create(Type_factory__o_u_e_e_c_c_f_p_RenamePopUpView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DataSetGroupDateEditorView>) GWT.create(Type_factory__o_d_d_c_w_g_DataSetGroupDateEditorView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DisplayerSubtypeSelectorView>) GWT.create(Type_factory__o_d_d_c_w_DisplayerSubtypeSelectorView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<FileUploadEditor>) GWT.create(Type_factory__o_d_c_c_e_f_FileUploadEditor__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<LiveSearchDropDown>) GWT.create(Type_factory__o_u_e_w_c_c_d_LiveSearchDropDown__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<EmptyScreenActivity>) GWT.create(Type_factory__o_d_c_s_EmptyScreenActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<org.jboss.errai.common.client.dom.HTMLElement>) GWT.create(ContextualProvider_factory__o_j_e_c_c_d_HTMLElement__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DefaultBreadcrumbsView>) GWT.create(Type_factory__o_u_e_w_c_c_b_w_DefaultBreadcrumbsView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<TextFileExport>) GWT.create(Producer_factory__o_u_e_e_c_c_f_e_TextFileExport__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<LayoutDragComponentGroupPresenter>) GWT.create(Type_factory__o_u_e_l_e_c_w_LayoutDragComponentGroupPresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<ClientSettings>) GWT.create(Type_factory__o_d_d_c_ClientSettings__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<MultiTabWorkbenchPanelPresenter>) GWT.create(Type_factory__o_u_c_w_p_i_MultiTabWorkbenchPanelPresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<CustomPanelDefinition>) GWT.create(JsType_factory__o_u_w_m_CustomPanelDefinition__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Path>) GWT.create(JsType_factory__o_u_b_v_Path__quals__Universal.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<Elemental2Producer>) GWT.create(Type_factory__o_u_c_v_p_w_Elemental2Producer__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Disposer>) GWT.create(ContextualProvider_factory__o_j_e_i_c_a_Disposer__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DefaultJsEvaluator>) GWT.create(Type_factory__o_d_d_c_w_s_DefaultJsEvaluator__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ListComponent>) GWT.create(ContextualProvider_factory__o_j_e_d_c_c_ListComponent__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SplitLayoutPanelView>) GWT.create(Type_factory__o_u_c_w_p_i_SplitLayoutPanelView__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<BasicFileMenuBuilderImpl>) GWT.create(Type_factory__o_u_e_e_c_c_m_BasicFileMenuBuilderImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<org.uberfire.client.views.pfly.modal.ErrorPopupView>) GWT.create(Type_factory__o_u_c_v_p_m_ErrorPopupView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<HTMLHeadingElement>) GWT.create(ExtensionProvided_factory__e_d_HTMLHeadingElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DisplayerSubtypeSelector>) GWT.create(Type_factory__o_d_d_c_w_DisplayerSubtypeSelector__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<GoToDashboardMenuBuilder>) GWT.create(Type_factory__o_d_c_n_GoToDashboardMenuBuilder__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<HasEnabledStateChangeListeners>) GWT.create(JsType_factory__o_u_w_m_m_HasEnabledStateChangeListeners__quals__Universal.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<DisplayerLocator>) GWT.create(Type_factory__o_d_d_c_DisplayerLocator__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<LikeToFunctionEditorView>) GWT.create(Type_factory__o_d_d_c_w_f_LikeToFunctionEditorView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<AnyResourceType>) GWT.create(Type_factory__o_u_c_w_t_AnyResourceType__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<PlaceHistoryHandler>) GWT.create(Type_factory__o_u_c_m_PlaceHistoryHandler__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<PerspectivePluginManagerImpl>) GWT.create(Type_factory__o_d_c_n_p_PerspectivePluginManagerImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<CountriesGeoJsonServiceImpl>) GWT.create(Type_factory__o_d_r_c_c_c_m_g_i_CountriesGeoJsonServiceImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<NotificationManager>) GWT.create(Type_factory__o_u_c_w_w_n_NotificationManager__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<org.jboss.errai.common.client.dom.Select>) GWT.create(ExtensionProvided_factory__o_j_e_c_c_d_Select__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DefaultBreadcrumbsPresenter>) GWT.create(Type_factory__o_u_e_w_c_c_b_w_DefaultBreadcrumbsPresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<LayoutEditorPresenter>) GWT.create(Type_factory__o_u_e_l_e_c_LayoutEditorPresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DisplayerHtmlEditorView>) GWT.create(Type_factory__o_d_d_c_w_DisplayerHtmlEditorView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ComponentColumn>) GWT.create(Type_factory__o_u_e_l_e_c_c_c_ComponentColumn__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<PerspectiveEditorNavGroupProvider>) GWT.create(Type_factory__o_u_e_p_c_p_e_a_PerspectiveEditorNavGroupProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<DotResourceType>) GWT.create(Type_factory__o_u_c_w_t_DotResourceType__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Document>) GWT.create(Producer_factory__o_j_e_c_c_d_Document__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<HTMLAnchorElement>) GWT.create(ExtensionProvided_factory__e_d_HTMLAnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<AggregateFunctionManagerImpl>) GWT.create(Type_factory__o_d_d_e_f_AggregateFunctionManagerImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ManagedInstance>) GWT.create(ContextualProvider_factory__o_j_e_i_c_a_ManagedInstance__quals__Universal.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<RuntimeNavBrand>) GWT.create(Type_factory__o_d_c_n_RuntimeNavBrand__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Menus>) GWT.create(JsType_factory__o_u_w_m_m_Menus__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<C3BubbleChartView>) GWT.create(Type_factory__o_d_r_c_c_c_b_C3BubbleChartView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DragHelperComponentColumn>) GWT.create(Type_factory__o_u_e_l_e_c_i_DragHelperComponentColumn__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Anchor>) GWT.create(ExtensionProvided_factory__o_j_e_c_c_d_Anchor__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<PropertyEditorWidget>) GWT.create(Type_factory__o_u_e_p_e_c_PropertyEditorWidget__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<C3MeterChartDisplayer>) GWT.create(Type_factory__o_d_r_c_c_c_m_C3MeterChartDisplayer__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<RuntimeScreenActivity>) GWT.create(Type_factory__o_d_c_s_RuntimeScreenActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<PlaceStatus>) GWT.create(JsType_factory__o_u_c_m_PlaceStatus__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<HTMLPreElement>) GWT.create(ExtensionProvided_factory__e_d_HTMLPreElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<AreaChartDragComponent>) GWT.create(Type_factory__o_d_c_e_AreaChartDragComponent__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DeletePopUpView>) GWT.create(Type_factory__o_u_e_e_c_c_f_p_DeletePopUpView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SourceCodeEditor>) GWT.create(Type_factory__o_d_d_c_w_s_SourceCodeEditor__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<NavItemDefaultEditorView>) GWT.create(Type_factory__o_d_c_n_w_e_NavItemDefaultEditorView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<GWTVersion>) GWT.create(Type_factory__o_d_d_c_c_f_GWTVersion__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ExternalComponentEditorView>) GWT.create(Type_factory__o_d_d_c_w_ExternalComponentEditorView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<C3BarChartView>) GWT.create(Type_factory__o_d_r_c_c_c_b_C3BarChartView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DashboardCardView>) GWT.create(Type_factory__o_d_c_w_v_DashboardCardView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<LayoutEditorFocusController>) GWT.create(Type_factory__o_u_e_l_e_c_i_LayoutEditorFocusController__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<TextParameterEditorView>) GWT.create(Type_factory__o_d_d_c_w_f_TextParameterEditorView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Resource>) GWT.create(JsType_factory__o_u_s_Resource__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<LayoutPanelPresenter>) GWT.create(Type_factory__o_u_c_w_p_i_LayoutPanelPresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<D3MapDisplayer>) GWT.create(Type_factory__o_d_r_c_c_c_m_D3MapDisplayer__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<RuntimePerspectiveActivity>) GWT.create(Type_factory__o_d_c_p_RuntimePerspectiveActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Modal>) GWT.create(Type_factory__o_u_c_v_p_w_Modal__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DataBinder>) GWT.create(ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<DataSetClientServicesImpl>) GWT.create(Type_factory__o_d_d_c_DataSetClientServicesImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Logger>) GWT.create(ExtensionProvided_factory__o_s_Logger__quals__Universal_2.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Logger>) GWT.create(ExtensionProvided_factory__o_s_Logger__quals__Universal_1.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<NewTabFilterPopup>) GWT.create(Type_factory__o_u_e_w_c_c_t_p_NewTabFilterPopup__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<MenuItemPlain>) GWT.create(JsType_factory__o_u_w_m_m_MenuItemPlain__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<NavTreeWidget>) GWT.create(Type_factory__o_d_c_n_w_NavTreeWidget__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<WorkbenchMenuBarProducer>) GWT.create(Type_factory__o_u_c_w_w_m_WorkbenchMenuBarProducer__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<FilterLabelView>) GWT.create(Type_factory__o_d_c_c_w_FilterLabelView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DisplayerEditorPopup>) GWT.create(Type_factory__o_d_d_c_w_DisplayerEditorPopup__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<RootPanelProvider>) GWT.create(Type_factory__o_j_e_i_c_a_b_RootPanelProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<LoadingBoxView>) GWT.create(Type_factory__o_d_c_c_w_LoadingBoxView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<PerspectiveEditorReportingGroupProvider>) GWT.create(Type_factory__o_d_c_e_PerspectiveEditorReportingGroupProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<RouterPerspectiveActivity>) GWT.create(Type_factory__o_d_c_p_RouterPerspectiveActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<FilterLabelSetView>) GWT.create(Type_factory__o_d_c_c_w_FilterLabelSetView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SvgFileExport>) GWT.create(Producer_factory__o_u_e_e_c_c_f_e_s_SvgFileExport__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Logger>) GWT.create(ExtensionProvided_factory__o_s_Logger__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<PlaceRequestHistoryMapperImpl>) GWT.create(Type_factory__o_u_c_m_PlaceRequestHistoryMapperImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<TableDragComponent>) GWT.create(Type_factory__o_d_c_e_TableDragComponent__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<MapChartDragComponent>) GWT.create(Type_factory__o_d_c_e_MapChartDragComponent__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<PanelDefinitionImpl>) GWT.create(JsType_factory__o_u_w_m_i_PanelDefinitionImpl__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<org.uberfire.client.views.pfly.widgets.JQueryProducer.JQuery>) GWT.create(Producer_factory__o_u_c_v_p_w_JQueryProducer_JQuery__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<ListWidgetProvider>) GWT.create(Type_factory__o_j_e_u_c_w_ListWidgetProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DateParameterEditor>) GWT.create(Type_factory__o_d_d_c_w_f_DateParameterEditor__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<PerspectiveEditorPaletteI18nImpl>) GWT.create(Type_factory__o_u_e_p_c_r_i_PerspectiveEditorPaletteI18nImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<LayoutDragComponentWidget>) GWT.create(Type_factory__o_u_e_l_e_c_w_LayoutDragComponentWidget__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<HTMLFormElement>) GWT.create(ExtensionProvided_factory__e_d_HTMLFormElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DisplayerCoordinator>) GWT.create(Type_factory__o_d_d_c_DisplayerCoordinator__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Bs3Modal>) GWT.create(Type_factory__o_u_c_v_p_m_Bs3Modal__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<TextParameterEditor>) GWT.create(Type_factory__o_d_d_c_w_f_TextParameterEditor__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<PathUrlFactory>) GWT.create(Type_factory__o_d_c_c_b_PathUrlFactory__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<ClientMustacheTemplateRenderer>) GWT.create(Type_factory__o_u_e_e_c_c_t_m_ClientMustacheTemplateRenderer__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<MetricView>) GWT.create(Type_factory__o_d_r_c_m_MetricView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<NavItemTileWidget>) GWT.create(Type_factory__o_d_c_n_w_NavItemTileWidget__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ColumnFunctionEditorView>) GWT.create(Type_factory__o_d_d_c_w_g_ColumnFunctionEditorView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<EmptyScreen>) GWT.create(Type_factory__o_d_c_s_EmptyScreen__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<NotFoundScreenActivity>) GWT.create(Type_factory__o_d_c_s_NotFoundScreenActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ContainerView>) GWT.create(Type_factory__o_u_e_l_e_c_c_c_ContainerView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ContextDisplayMode>) GWT.create(JsType_factory__o_u_w_m_ContextDisplayMode__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<NavCarouselDragComponent>) GWT.create(Type_factory__o_d_c_n_l_e_NavCarouselDragComponent__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<WorkbenchLayoutInfoImpl>) GWT.create(Type_factory__o_u_c_w_WorkbenchLayoutInfoImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<HorizImageListEditorView>) GWT.create(Type_factory__o_d_c_c_e_l_HorizImageListEditorView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Label>) GWT.create(ExtensionProvided_factory__o_j_e_c_c_d_Label__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<PerspectiveDefinition>) GWT.create(JsType_factory__o_u_w_m_PerspectiveDefinition__quals__Universal.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<LayoutSelection>) GWT.create(Type_factory__o_u_c_w_LayoutSelection__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<ServerTemplateProvider>) GWT.create(Type_factory__o_j_e_u_s_ServerTemplateProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<HTMLUListElement>) GWT.create(ExtensionProvided_factory__e_d_HTMLUListElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DisplayerEditor>) GWT.create(Type_factory__o_d_d_c_w_DisplayerEditor__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<org.gwtbootstrap3.client.ui.Button>) GWT.create(ExtensionProvided_factory__o_g_c_u_Button__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<RuntimePerspective>) GWT.create(Type_factory__o_d_c_p_RuntimePerspective__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<EmptyPerspectiveActivity>) GWT.create(Type_factory__o_d_c_p_EmptyPerspectiveActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<HTMLSelectElement>) GWT.create(ExtensionProvided_factory__e_d_HTMLSelectElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<PlaceManagerImpl>) GWT.create(Type_factory__o_u_c_m_PlaceManagerImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<CurrentBranchProducer>) GWT.create(Type_factory__o_u_e_e_c_c_m_c_CurrentBranchProducer__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<CustomSplashHelp>) GWT.create(Type_factory__o_u_c_m_CustomSplashHelp__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ExternalComponentDisplayer>) GWT.create(Type_factory__o_d_r_c_e_ExternalComponentDisplayer__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SecretTextField>) GWT.create(Type_factory__o_u_e_p_e_c_f_SecretTextField__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<C3BarChartDisplayer>) GWT.create(Type_factory__o_d_r_c_c_c_b_C3BarChartDisplayer__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<InputAutocomplete>) GWT.create(Type_factory__o_u_c_v_p_w_InputAutocomplete__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<IOCBeanManagerProvider>) GWT.create(Type_factory__o_j_e_i_c_a_b_IOCBeanManagerProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ResizeFlowPanel>) GWT.create(ExtensionProvided_factory__o_u_c_w_w_l_ResizeFlowPanel__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<KebabMenu>) GWT.create(Type_factory__o_u_c_v_p_w_KebabMenu__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SelectView>) GWT.create(Type_factory__o_u_e_w_c_c_s_SelectView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<AlertPanel>) GWT.create(Type_factory__o_d_c_c_w_AlertPanel__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<WorkbenchActivity>) GWT.create(JsType_factory__o_u_c_m_WorkbenchActivity__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<WorkbenchViewModeSwitcherMenuBuilder>) GWT.create(Type_factory__o_u_c_m_WorkbenchViewModeSwitcherMenuBuilder__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<ActivityLifecycleErrorHandler>) GWT.create(Type_factory__o_u_c_m_ActivityLifecycleErrorHandler__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<UnanchoredStaticWorkbenchPanelView>) GWT.create(Type_factory__o_u_c_w_p_i_UnanchoredStaticWorkbenchPanelView__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<TextInput>) GWT.create(ExtensionProvided_factory__o_j_e_c_c_d_TextInput__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<DnDManager>) GWT.create(Type_factory__o_u_e_l_e_c_i_DnDManager__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<HtmlResourceType>) GWT.create(Type_factory__o_u_e_e_c_c_h_HtmlResourceType__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<RequestDispatcherProvider>) GWT.create(Type_factory__o_j_e_i_s_b_c_RequestDispatcherProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<DefaultAppFormerActivities>) GWT.create(Type_factory__o_u_w_m_DefaultAppFormerActivities__quals__j_e_i_Any_o_u_a_FallbackImplementation.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<HTMLLIElement>) GWT.create(ExtensionProvided_factory__e_d_HTMLLIElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<NavBarHelper>) GWT.create(Type_factory__o_d_c_n_NavBarHelper__quals__j_e_i_Any_j_e_i_Default_1.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<InlineNotification>) GWT.create(Type_factory__o_u_c_v_p_w_InlineNotification__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DisplayerEditorView>) GWT.create(Type_factory__o_d_d_c_w_DisplayerEditorView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ComboField>) GWT.create(Type_factory__o_u_e_p_e_c_f_ComboField__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<RuntimeResource>) GWT.create(JsType_factory__o_u_s_a_RuntimeResource__quals__Universal.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<ActivityBeansCache>) GWT.create(Type_factory__o_u_c_m_ActivityBeansCache__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SourceCodeEditorView>) GWT.create(Type_factory__o_d_d_c_w_s_SourceCodeEditorView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ChildMenuItemPresenter>) GWT.create(Type_factory__o_u_c_w_w_m_m_m_ChildMenuItemPresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DownloadMenuItemBuilder>) GWT.create(Type_factory__o_u_e_e_c_c_m_DownloadMenuItemBuilder__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DocksBars>) GWT.create(Type_factory__o_u_c_d_v_DocksBars__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<OrderedList>) GWT.create(ExtensionProvided_factory__o_j_e_c_c_d_OrderedList__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<DisposerProvider>) GWT.create(Type_factory__o_j_e_i_c_a_b_DisposerProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<RendererSelector>) GWT.create(Type_factory__o_d_d_c_w_RendererSelector__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<D3MapDisplayerView>) GWT.create(Type_factory__o_d_r_c_c_c_m_D3MapDisplayerView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<MessageBusProvider>) GWT.create(Type_factory__o_j_e_i_s_b_c_MessageBusProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<DashboardListMenuBuilder>) GWT.create(Type_factory__o_d_c_n_DashboardListMenuBuilder__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<MultiPageEditorImpl>) GWT.create(Type_factory__o_u_c_v_p_m_MultiPageEditorImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ClientChronometer>) GWT.create(Type_factory__o_d_d_c_e_ClientChronometer__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<SenderProvider>) GWT.create(Type_factory__o_j_e_i_s_b_c_SenderProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<RenamePopUpPresenter>) GWT.create(Type_factory__o_u_e_e_c_c_f_p_RenamePopUpPresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<EmptyDropRow>) GWT.create(Type_factory__o_u_e_l_e_c_c_r_EmptyDropRow__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ManagedInstanceProvider>) GWT.create(Type_factory__o_j_e_i_c_a_b_ManagedInstanceProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<LayoutDragComponentHelper>) GWT.create(Type_factory__o_u_e_l_e_c_i_LayoutDragComponentHelper__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<C3AreaChartView>) GWT.create(Type_factory__o_d_r_c_c_c_a_C3AreaChartView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<EditHTMLView>) GWT.create(Type_factory__o_u_e_p_c_p_e_l_e_p_EditHTMLView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<List>) GWT.create(JsType_factory__j_u_List__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<D3Map>) GWT.create(Type_factory__o_d_r_c_c_c_m_w_D3Map__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Image>) GWT.create(ExtensionProvided_factory__o_j_e_c_c_d_Image__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<GroupMenuItemPresenter>) GWT.create(Type_factory__o_u_c_w_w_m_m_m_GroupMenuItemPresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ExternalComponentPropertiesEditor>) GWT.create(Type_factory__o_d_d_c_w_ExternalComponentPropertiesEditor__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<LayoutEditorView>) GWT.create(Type_factory__o_u_e_l_e_c_LayoutEditorView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Promises>) GWT.create(Type_factory__o_u_c_p_Promises__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ListBarWidgetImpl>) GWT.create(Type_factory__o_u_c_v_p_l_ListBarWidgetImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<NavRootNodeEditorView>) GWT.create(Type_factory__o_d_c_n_w_e_NavRootNodeEditorView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<WorkbenchViewModeSwitcherPresenter>) GWT.create(Type_factory__o_u_c_m_WorkbenchViewModeSwitcherPresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<ScreenLayoutDragComponent>) GWT.create(Type_factory__o_u_e_p_c_p_e_l_e_ScreenLayoutDragComponent__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<HTMLElementProvider>) GWT.create(Type_factory__o_j_e_u_c_l_p_HTMLElementProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<DisplayerEditorEntryPoint>) GWT.create(Type_factory__o_d_c_e_DisplayerEditorEntryPoint__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ContentErrorScreenView>) GWT.create(Type_factory__o_d_c_s_v_ContentErrorScreenView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<NavTabListDragComponent>) GWT.create(Type_factory__o_d_c_n_l_e_NavTabListDragComponent__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DefaultMenus>) GWT.create(JsType_factory__o_u_w_m_m_i_DefaultMenus__quals__Universal.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<HtmlEditorLibraryLoader>) GWT.create(Type_factory__o_u_e_e_c_c_h_HtmlEditorLibraryLoader__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<DefaultFileNameValidator>) GWT.create(Type_factory__o_u_e_e_c_c_v_DefaultFileNameValidator__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Elemental2HTMLElementProvider>) GWT.create(Type_factory__o_j_e_u_c_l_p_Elemental2HTMLElementProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<org.gwtbootstrap3.client.ui.html.Span>) GWT.create(ExtensionProvided_factory__o_g_c_u_h_Span__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DropDownEditorView>) GWT.create(Type_factory__o_d_c_c_e_l_DropDownEditorView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<MenuBuilder>) GWT.create(Type_factory__o_u_c_d_v_m_MenuBuilder__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<View>) GWT.create(Producer_factory__o_u_e_e_c_c_f_p_CopyPopUpPresenter_View__quals__j_e_i_Any_o_u_e_e_c_c_f_Customizable.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DataSetFilterEditorView>) GWT.create(Type_factory__o_d_d_c_w_f_DataSetFilterEditorView__quals__j_e_i_Any_j_e_i_Default.class));
  }

  private void registerFactories1(final Context org_jboss_errai_ioc_client_container_DependentScopeContext_context, final Context org_jboss_errai_ioc_client_container_ApplicationScopedContext_context) {
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<NavCarouselWidget>) GWT.create(Type_factory__o_d_c_n_w_NavCarouselWidget__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<NewFilterPopup>) GWT.create(Type_factory__o_u_e_w_c_c_t_p_NewFilterPopup__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<FilterPagedTable>) GWT.create(Type_factory__o_u_e_w_c_c_t_FilterPagedTable__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<UtilityMenuBarView>) GWT.create(Type_factory__o_u_c_v_p_m_UtilityMenuBarView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<BootstrapLayoutGeneratorDriver>) GWT.create(Type_factory__o_u_e_l_e_c_g_BootstrapLayoutGeneratorDriver__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ListItem>) GWT.create(ExtensionProvided_factory__o_j_e_c_c_d_ListItem__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DataSetLookupEditor>) GWT.create(Type_factory__o_d_d_c_w_DataSetLookupEditor__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<SessionInfo>) GWT.create(Producer_factory__o_u_r_SessionInfo__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<C3AreaChartDisplayer>) GWT.create(Type_factory__o_d_r_c_c_c_a_C3AreaChartDisplayer__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ListWidget>) GWT.create(ContextualProvider_factory__o_j_e_u_c_w_ListWidget__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<NoItemsComponentViewImpl>) GWT.create(Type_factory__o_u_e_w_c_c_d_n_NoItemsComponentViewImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<LiveSearchFooterViewImpl>) GWT.create(Type_factory__o_u_e_w_c_c_d_f_LiveSearchFooterViewImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SaveAndRenameCommandBuilder>) GWT.create(Type_factory__o_u_e_e_c_c_m_c_SaveAndRenameCommandBuilder__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<AlertPanelView>) GWT.create(Type_factory__o_d_c_c_w_AlertPanelView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<LayoutElementPropertiesPresenter>) GWT.create(Type_factory__o_u_e_l_e_c_w_LayoutElementPropertiesPresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<LiveSearchSelectorDropDownItem>) GWT.create(Type_factory__o_u_e_w_c_c_d_i_LiveSearchSelectorDropDownItem__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<RouterScreenActivity>) GWT.create(Type_factory__o_d_c_s_RouterScreenActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SelectorDragComponent>) GWT.create(Type_factory__o_d_c_e_SelectorDragComponent__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ExternalPathPlaceRequest>) GWT.create(JsType_factory__o_u_m_i_ExternalPathPlaceRequest__quals__Universal.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<RuntimeModelJSONMarshaller>) GWT.create(Type_factory__o_d_s_m_RuntimeModelJSONMarshaller__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<InstanceProvider>) GWT.create(Type_factory__o_j_e_e_c_c_InstanceProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<AlertBox>) GWT.create(Type_factory__o_d_c_c_w_AlertBox__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<MultiScreenWorkbenchPanelView>) GWT.create(Type_factory__o_u_c_w_p_i_MultiScreenWorkbenchPanelView__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<NotificationPopupsManagerView>) GWT.create(Type_factory__o_u_c_v_p_n_NotificationPopupsManagerView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SplitLayoutPanelPresenter>) GWT.create(Type_factory__o_u_c_w_p_i_SplitLayoutPanelPresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<BubbleChartDragComponent>) GWT.create(Type_factory__o_d_c_e_BubbleChartDragComponent__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<CopyPopUpPresenter>) GWT.create(Type_factory__o_u_e_e_c_c_f_p_CopyPopUpPresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DateRangePicker>) GWT.create(Type_factory__o_u_c_v_p_w_DateRangePicker__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<GroupContextMenuItemPresenter>) GWT.create(Type_factory__o_u_c_w_w_m_m_c_GroupContextMenuItemPresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<RuntimeCommunication>) GWT.create(Type_factory__o_d_c_RuntimeCommunication__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<MenuCustom>) GWT.create(JsType_factory__o_u_w_m_m_MenuCustom__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ColumnFilterEditorView>) GWT.create(Type_factory__o_d_d_c_w_f_ColumnFilterEditorView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<WindowEventObservers>) GWT.create(JsType_factory__o_j_e_e_c_c_WindowEventObservers__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<RuntimeScreenView>) GWT.create(Type_factory__o_d_c_s_v_RuntimeScreenView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<WorkbenchPickupDragController>) GWT.create(Type_factory__o_u_c_w_w_d_WorkbenchPickupDragController__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<PanelManagerImpl>) GWT.create(Type_factory__o_u_c_w_PanelManagerImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SelectOptionComponent>) GWT.create(Type_factory__o_u_e_w_c_c_s_SelectOptionComponent__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DropDownImageListEditorView>) GWT.create(Type_factory__o_d_c_c_e_l_DropDownImageListEditorView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<CheckBox>) GWT.create(ExtensionProvided_factory__o_g_c_u_CheckBox__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Sender>) GWT.create(ContextualProvider_factory__o_j_e_i_s_b_c_Sender__quals__Universal.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<DashboardsListPerspective>) GWT.create(Type_factory__o_d_c_p_DashboardsListPerspective__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SimpleNoExpandWorkbenchPanelPresenter>) GWT.create(Type_factory__o_u_c_w_p_i_SimpleNoExpandWorkbenchPanelPresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SelectorLabelItem>) GWT.create(Type_factory__o_d_r_c_s_SelectorLabelItem__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<SplashScreenMenuPresenter>) GWT.create(Type_factory__o_u_c_m_SplashScreenMenuPresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<FlowPanel>) GWT.create(ExtensionProvided_factory__c_g_g_u_c_u_FlowPanel__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DropdownMenuItem>) GWT.create(Type_factory__o_u_c_v_p_w_DropdownMenuItem__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DataSetLookupEditorView>) GWT.create(Type_factory__o_d_d_c_w_DataSetLookupEditorView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<MeterChartDragComponent>) GWT.create(Type_factory__o_d_c_e_MeterChartDragComponent__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<FileExportScriptInjector>) GWT.create(Type_factory__o_u_e_e_c_c_f_e_j_FileExportScriptInjector__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<DashboardsListScreen>) GWT.create(Type_factory__o_d_c_s_DashboardsListScreen__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SelectorDisplayer>) GWT.create(Type_factory__o_d_r_c_s_SelectorDisplayer__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ExternalComponentMessageHelper>) GWT.create(Producer_factory__o_d_d_e_ExternalComponentMessageHelper__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ValueBoxEditor>) GWT.create(Type_factory__o_d_c_c_e_ValueBoxEditor__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<WorkbenchMegaMenuProducer>) GWT.create(Type_factory__o_u_c_w_w_m_m_WorkbenchMegaMenuProducer__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<RuntimeModelContentListener>) GWT.create(Type_factory__o_d_c_RuntimeModelContentListener__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<PerspectiveEditorPresenterActivity>) GWT.create(Type_factory__o_u_e_p_c_p_e_PerspectiveEditorPresenterActivity__quals__j_e_i_Any_j_i_Named_o_u_c_w_a_AssociatedResources_o_u_c_w_a_Priority.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<CategoriesManagerCache>) GWT.create(Type_factory__o_u_c_m_CategoriesManagerCache__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Div>) GWT.create(ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<ResourceTypeManagerCache>) GWT.create(Type_factory__o_u_c_m_ResourceTypeManagerCache__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<TimeFrameEditorView>) GWT.create(Type_factory__o_d_d_c_w_f_TimeFrameEditorView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Collection>) GWT.create(JsType_factory__j_u_Collection__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ResourceTypeDefinition>) GWT.create(JsType_factory__o_u_w_t_ResourceTypeDefinition__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<TextArea>) GWT.create(ExtensionProvided_factory__o_j_e_c_c_d_TextArea__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DefaultRuntimeErrorCallback>) GWT.create(Type_factory__o_d_c_e_DefaultRuntimeErrorCallback__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DisplayerScreenPresenter>) GWT.create(Type_factory__o_d_d_c_DisplayerScreenPresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<ClientIntervalBuilderDynamicDate>) GWT.create(Type_factory__o_d_d_c_e_ClientIntervalBuilderDynamicDate__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<ExternalDataSetClientProvider>) GWT.create(Type_factory__o_d_c_e_ExternalDataSetClientProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<NavTabListWidget>) GWT.create(Type_factory__o_d_c_n_w_NavTabListWidget__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<TemplatedWorkbenchPanelView>) GWT.create(Type_factory__o_u_c_w_p_i_TemplatedWorkbenchPanelView__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<DataBinderProvider>) GWT.create(Type_factory__o_j_e_d_c_DataBinderProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<WorkbenchPartPresenterDefault>) GWT.create(Type_factory__o_u_c_w_p_n_p_WorkbenchPartPresenterDefault__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SavePopUpView>) GWT.create(Type_factory__o_u_e_e_c_c_f_p_SavePopUpView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<NotFoundScreenView>) GWT.create(Type_factory__o_d_c_s_v_NotFoundScreenView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<PlaceManager>) GWT.create(JsType_factory__o_u_c_m_PlaceManager__quals__Universal.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<AppNavBar>) GWT.create(Type_factory__o_d_c_n_AppNavBar__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DefaultJsValidator>) GWT.create(Type_factory__o_d_d_c_w_s_DefaultJsValidator__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<BackendFunctionLoader>) GWT.create(Type_factory__o_d_d_c_c_f_BackendFunctionLoader__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<NavDropDownWidgetView>) GWT.create(Type_factory__o_d_c_n_w_NavDropDownWidgetView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<CompassWidgetImpl>) GWT.create(Type_factory__o_u_c_v_p_d_CompassWidgetImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ToolBarItem>) GWT.create(JsType_factory__o_u_w_m_t_ToolBarItem__quals__Universal.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<WorkbenchMenuCompactNavBarView>) GWT.create(Type_factory__o_u_c_v_p_m_WorkbenchMenuCompactNavBarView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<DisplayerPrototypes>) GWT.create(Type_factory__o_d_d_c_p_DisplayerPrototypes__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<NavComponentConfigModalView>) GWT.create(Type_factory__o_d_c_n_w_NavComponentConfigModalView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<PerspectiveEditorPresenter>) GWT.create(Type_factory__o_u_e_p_c_p_e_PerspectiveEditorPresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<EmptyPerspective>) GWT.create(Type_factory__o_d_c_p_EmptyPerspective__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<PopupViewImpl>) GWT.create(Type_factory__o_u_c_v_p_p_PopupViewImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ConfirmPopup>) GWT.create(Type_factory__o_u_c_v_p_w_ConfirmPopup__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<CSVParser>) GWT.create(Type_factory__o_d_c_e_CSVParser__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<JsTypeEventObserver>) GWT.create(Type_factory__o_j_e_e_c_c_JsTypeEventObserver__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<WorkbenchToolBarPresenter>) GWT.create(Type_factory__o_u_c_w_w_t_WorkbenchToolBarPresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ColumnWithComponents>) GWT.create(Type_factory__o_u_e_l_e_c_c_c_ColumnWithComponents__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<LockTarget>) GWT.create(JsType_factory__o_u_c_m_LockTarget__quals__Universal.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<BaseEditorEntryPoint>) GWT.create(Type_factory__o_u_e_e_c_c_BaseEditorEntryPoint__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<LayoutEditorCssHelper>) GWT.create(Type_factory__o_u_e_l_e_c_i_LayoutEditorCssHelper__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<NoItemsComponent>) GWT.create(Type_factory__o_u_e_w_c_c_d_n_NoItemsComponent__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<RendererSelectorListBoxView>) GWT.create(Type_factory__o_d_d_c_w_RendererSelectorListBoxView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<FileExportProducer>) GWT.create(Type_factory__o_u_e_e_c_c_f_e_FileExportProducer__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Position>) GWT.create(JsType_factory__o_u_w_m_Position__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<PanelDefinition>) GWT.create(JsType_factory__o_u_w_m_PanelDefinition__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<NavTilesDragComponent>) GWT.create(Type_factory__o_d_c_n_l_e_NavTilesDragComponent__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<CopyPopUpViewProducer>) GWT.create(Type_factory__o_u_e_e_c_c_f_CopyPopUpViewProducer__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<RuntimePluginsEntryPoint>) GWT.create(Type_factory__o_u_e_p_c_RuntimePluginsEntryPoint__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Heading>) GWT.create(ExtensionProvided_factory__o_j_e_c_c_d_Heading__quals__j_e_i_Any_j_e_i_Default_j_i_Named_1.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<TitleProvider>) GWT.create(JsType_factory__o_u_c_m_LockTarget_TitleProvider__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SimpleTable>) GWT.create(Type_factory__o_u_e_w_c_c_t_SimpleTable__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<WindowEventObservers>) GWT.create(Type_factory__o_j_e_e_c_c_WindowEventObservers__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<RendererManager>) GWT.create(Type_factory__o_d_d_c_RendererManager__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<LayoutEditorPropertiesScreenActivity>) GWT.create(Type_factory__o_u_e_l_e_c_LayoutEditorPropertiesScreenActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<org.dashbuilder.client.navigation.NavBarHelper>) GWT.create(Type_factory__o_d_c_n_NavBarHelper__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<BusyIndicatorView>) GWT.create(Type_factory__o_u_e_w_c_c_c_BusyIndicatorView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<LayoutEditorPropertiesView>) GWT.create(Type_factory__o_u_e_l_e_c_w_LayoutEditorPropertiesView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<MenuItemDividerView>) GWT.create(Type_factory__o_u_e_w_c_c_m_MenuItemDividerView__quals__j_e_i_Any_o_u_e_w_c_c_m_MenuItemDivider.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DisplayerSettingsJSONSourceViewer>) GWT.create(Type_factory__o_d_d_c_w_DisplayerSettingsJSONSourceViewer__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SelectorSliderDisplayer>) GWT.create(Type_factory__o_d_r_c_s_SelectorSliderDisplayer__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<MutationObserverFactory>) GWT.create(Type_factory__o_d_r_c_m_MutationObserverFactory__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<JsArray>) GWT.create(JsType_factory__o_j_e_i_c_JsArray__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DataSetFilterEditor>) GWT.create(Type_factory__o_d_d_c_w_f_DataSetFilterEditor__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<CompassPosition>) GWT.create(JsType_factory__o_u_w_m_CompassPosition__quals__Universal.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<ActivityManagerImpl>) GWT.create(Type_factory__o_u_c_m_ActivityManagerImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<MenuVisitor>) GWT.create(JsType_factory__o_u_w_m_m_MenuVisitor__quals__Universal.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<C3Renderer>) GWT.create(Type_factory__o_d_r_c_c_C3Renderer__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<TemplatedWorkbenchPanelPresenter>) GWT.create(Type_factory__o_u_c_w_p_i_TemplatedWorkbenchPanelPresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<NavDropDownWidget>) GWT.create(Type_factory__o_d_c_n_w_NavDropDownWidget__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<StateChangeImpl>) GWT.create(Type_factory__o_j_e_i_c_l_i_StateChangeImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<RequestDispatcher>) GWT.create(Provider_factory__o_j_e_b_c_a_m_RequestDispatcher__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<MetricDisplayer>) GWT.create(Type_factory__o_d_r_c_m_MetricDisplayer__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<LineChartDragComponent>) GWT.create(Type_factory__o_d_c_e_LineChartDragComponent__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<RuntimeClientLoader>) GWT.create(Type_factory__o_d_c_RuntimeClientLoader__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<NavMenuBarWidgetView>) GWT.create(Type_factory__o_d_c_n_w_NavMenuBarWidgetView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<KebabWidget>) GWT.create(Type_factory__o_u_e_l_e_c_w_KebabWidget__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ErrorPopup>) GWT.create(Type_factory__o_u_c_v_p_w_ErrorPopup__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<EditHTMLPresenter>) GWT.create(Type_factory__o_u_e_p_c_p_e_l_e_p_EditHTMLPresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<TranslationServiceProvider>) GWT.create(Type_factory__o_j_e_u_c_l_s_TranslationServiceProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DropDownEditor>) GWT.create(Type_factory__o_d_c_c_e_l_DropDownEditor__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<AceEditor>) GWT.create(ExtensionProvided_factory__o_u_e_w_c_c_a_AceEditor__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SelectorDropDownItem>) GWT.create(Type_factory__o_d_r_c_s_SelectorDropDownItem__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<PerspectiveDropDown>) GWT.create(Type_factory__o_u_e_w_c_c_d_PerspectiveDropDown__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ColumnFunctionEditor>) GWT.create(Type_factory__o_d_d_c_w_g_ColumnFunctionEditor__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<NavRootNodeEditor>) GWT.create(Type_factory__o_d_c_n_w_e_NavRootNodeEditor__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<AdaptiveWorkbenchPanelPresenter>) GWT.create(Type_factory__o_u_c_w_p_i_AdaptiveWorkbenchPanelPresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ClientResourceType>) GWT.create(JsType_factory__o_u_c_w_t_ClientResourceType__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<HTMLParagraphElement>) GWT.create(ExtensionProvided_factory__e_d_HTMLParagraphElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SelectorSliderDisplayerView>) GWT.create(Type_factory__o_d_r_c_s_SelectorSliderDisplayerView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<RuntimePerspectivePluginManager>) GWT.create(Type_factory__o_d_c_p_RuntimePerspectivePluginManager__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ActivityResourceType>) GWT.create(JsType_factory__o_u_w_m_ActivityResourceType__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<UnanchoredWorkbenchPartPresenter>) GWT.create(Type_factory__o_u_c_w_p_u_p_UnanchoredWorkbenchPartPresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<MultipleNumberParameterEditor>) GWT.create(Type_factory__o_d_d_c_w_f_MultipleNumberParameterEditor__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<FileUploadEditorView>) GWT.create(Type_factory__o_d_c_c_e_f_FileUploadEditorView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<GroupContextMenuItemView>) GWT.create(Type_factory__o_u_c_v_p_m_m_c_GroupContextMenuItemView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SyncBeanManager>) GWT.create(Producer_factory__o_j_e_i_c_c_SyncBeanManager__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Row>) GWT.create(Type_factory__o_u_e_l_e_c_c_r_Row__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<ExternalComponentDispatcher>) GWT.create(Type_factory__o_d_d_c_c_ExternalComponentDispatcher__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<LikeToFunctionEditor>) GWT.create(Type_factory__o_d_d_c_w_f_LikeToFunctionEditor__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<LayoutEditorPropertiesPresenter>) GWT.create(Type_factory__o_u_e_l_e_c_w_LayoutEditorPropertiesPresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<org.jboss.errai.common.client.dom.Button>) GWT.create(ExtensionProvided_factory__o_j_e_c_c_d_Button__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<MetricDragComponent>) GWT.create(Type_factory__o_d_c_e_MetricDragComponent__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<LayoutElementPropertiesView>) GWT.create(Type_factory__o_u_e_l_e_c_w_LayoutElementPropertiesView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ContentErrorPerspectiveActivity>) GWT.create(Type_factory__o_d_c_p_ContentErrorPerspectiveActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<NumberParameterEditorView>) GWT.create(Type_factory__o_d_d_c_w_f_NumberParameterEditorView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<StaticFocusedResizePanel>) GWT.create(ExtensionProvided_factory__o_u_c_w_w_p_StaticFocusedResizePanel__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<WorkbenchPartView>) GWT.create(Type_factory__o_u_c_w_p_n_p_WorkbenchPartView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ChildContextMenuItemPresenter>) GWT.create(Type_factory__o_u_c_w_w_m_m_c_ChildContextMenuItemPresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<GWTGeoJsonLoader>) GWT.create(Type_factory__o_d_r_c_c_c_m_g_i_GWTGeoJsonLoader__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ContentErrorScreenActivity>) GWT.create(Type_factory__o_d_c_s_ContentErrorScreenActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<PerspectiveEditorSettings>) GWT.create(Type_factory__o_u_e_p_c_p_e_l_e_PerspectiveEditorSettings__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ExternalDragComponent>) GWT.create(Type_factory__o_d_c_e_e_ExternalDragComponent__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<TimeAmountEditor>) GWT.create(Type_factory__o_d_d_c_w_f_TimeAmountEditor__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<TranslationService>) GWT.create(Provider_factory__o_j_e_u_c_l_s_TranslationService__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<IconMenuItemView>) GWT.create(Type_factory__o_u_c_v_p_m_m_m_IconMenuItemView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<UberfireDocksContainer>) GWT.create(Type_factory__o_u_c_w_d_UberfireDocksContainer__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<LayoutPanelView>) GWT.create(Type_factory__o_u_c_w_p_i_LayoutPanelView__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
  }

  private void registerFactories(final Context org_jboss_errai_ioc_client_container_DependentScopeContext_context, final Context org_jboss_errai_ioc_client_container_ApplicationScopedContext_context) {
    registerFactories0(org_jboss_errai_ioc_client_container_DependentScopeContext_context, org_jboss_errai_ioc_client_container_ApplicationScopedContext_context);
    registerFactories1(org_jboss_errai_ioc_client_container_DependentScopeContext_context, org_jboss_errai_ioc_client_container_ApplicationScopedContext_context);
  }

  // The main IOC bootstrap method.
  public ContextManager bootstrapContainer() {
    final Context org_jboss_errai_ioc_client_container_DependentScopeContext_context = new DependentScopeContext();
    final Context org_jboss_errai_ioc_client_container_ApplicationScopedContext_context = new ApplicationScopedContext();
    logger.debug("Registering factories with contexts.");
    long start = System.currentTimeMillis();
    registerFactories(org_jboss_errai_ioc_client_container_DependentScopeContext_context, org_jboss_errai_ioc_client_container_ApplicationScopedContext_context);
    logger.debug("Registered 671 factories in {}ms", System.currentTimeMillis() - start);
    logger.debug("Adding contexts to context manager...");
    start = System.currentTimeMillis();
    contextManager.addContext(org_jboss_errai_ioc_client_container_DependentScopeContext_context);
    contextManager.addContext(org_jboss_errai_ioc_client_container_ApplicationScopedContext_context);
    logger.debug("Added 2 contexts in {}ms", System.currentTimeMillis() - start);
    logger.debug("Calling finishInit on ContextManager");
    start = System.currentTimeMillis();
    contextManager.finishInit();
    logger.debug("ContextManager#finishInit ran in {}ms", System.currentTimeMillis() - start);
    return contextManager;
  }
}