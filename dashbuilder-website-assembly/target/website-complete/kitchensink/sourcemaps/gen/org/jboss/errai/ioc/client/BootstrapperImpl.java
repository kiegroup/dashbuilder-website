package org.jboss.errai.ioc.client;

import com.google.gwt.core.client.GWT;
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
import elemental2.dom.HTMLParagraphElement;
import elemental2.dom.HTMLPreElement;
import elemental2.dom.HTMLTextAreaElement;
import elemental2.dom.HTMLUListElement;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.enterprise.event.Event;
import javax.enterprise.inject.Instance;
import org.dashbuilder.client.GlobalSettingsChangeListener;
import org.dashbuilder.client.RuntimeClientLoader;
import org.dashbuilder.client.RuntimeCommunication;
import org.dashbuilder.client.RuntimeEntryPoint;
import org.dashbuilder.client.RuntimeModelContentListener;
import org.dashbuilder.client.editor.DisplayerDragComponent;
import org.dashbuilder.client.editor.external.ExternalDragComponent;
import org.dashbuilder.client.error.DefaultRuntimeErrorCallback;
import org.dashbuilder.client.error.ErrorResponseVerifier;
import org.dashbuilder.client.external.ExternalDataCallbackCoordinator;
import org.dashbuilder.client.external.ExternalDataSetClientProvider;
import org.dashbuilder.client.external.csv.CSVColumnsFunction;
import org.dashbuilder.client.external.csv.CSVParser;
import org.dashbuilder.client.marshalling.ClientDataSetMetadataJSONMarshaller;
import org.dashbuilder.client.navigation.impl.NavigationManagerImpl;
import org.dashbuilder.client.navigation.layout.editor.NavCarouselDragComponent;
import org.dashbuilder.client.navigation.layout.editor.NavMenuBarDragComponent;
import org.dashbuilder.client.navigation.layout.editor.NavTabListDragComponent;
import org.dashbuilder.client.navigation.layout.editor.NavTilesDragComponent;
import org.dashbuilder.client.navigation.layout.editor.NavTreeDragComponent;
import org.dashbuilder.client.navigation.widget.NavCarouselWidget;
import org.dashbuilder.client.navigation.widget.NavCarouselWidgetView;
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
import org.dashbuilder.client.navigation.widget.ScreenLayoutDragComponent;
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
import org.dashbuilder.client.perspective.SamplesPerspective;
import org.dashbuilder.client.perspective.SamplesPerspectiveActivity;
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
import org.dashbuilder.client.screens.SamplesScreen;
import org.dashbuilder.client.screens.SamplesScreenActivity;
import org.dashbuilder.client.screens.view.ContentErrorScreenView;
import org.dashbuilder.client.screens.view.DashboardsListScreenView;
import org.dashbuilder.client.screens.view.EmptyScreenView;
import org.dashbuilder.client.screens.view.NotFoundScreenView;
import org.dashbuilder.client.screens.view.RouterScreenView;
import org.dashbuilder.client.screens.view.RuntimeScreenView;
import org.dashbuilder.client.screens.view.SamplesScreenView;
import org.dashbuilder.client.services.RuntimeDataSetClientServices;
import org.dashbuilder.client.services.SamplesService;
import org.dashbuilder.client.widgets.DashboardCard;
import org.dashbuilder.client.widgets.SampleCard;
import org.dashbuilder.client.widgets.SamplesCardRow;
import org.dashbuilder.client.widgets.UploadWidget;
import org.dashbuilder.client.widgets.view.DashboardCardView;
import org.dashbuilder.client.widgets.view.SampleCardView;
import org.dashbuilder.client.widgets.view.SamplesCardRowView;
import org.dashbuilder.client.widgets.view.UploadWidgetView;
import org.dashbuilder.common.client.widgets.AlertBox;
import org.dashbuilder.common.client.widgets.AlertBoxView;
import org.dashbuilder.common.client.widgets.FilterLabel;
import org.dashbuilder.common.client.widgets.FilterLabelSet;
import org.dashbuilder.common.client.widgets.FilterLabelSetView;
import org.dashbuilder.common.client.widgets.FilterLabelView;
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
import org.dashbuilder.displayer.client.GlobalDisplayerSettingsImpl;
import org.dashbuilder.displayer.client.PerspectiveCoordinator;
import org.dashbuilder.displayer.client.RendererManager;
import org.dashbuilder.displayer.client.component.ExternalComponentDispatcher;
import org.dashbuilder.displayer.client.component.ExternalComponentMessageHelperProducer;
import org.dashbuilder.displayer.client.formatter.ValueFormatterRegistry;
import org.dashbuilder.displayer.client.widgets.DisplayerErrorWidget;
import org.dashbuilder.displayer.client.widgets.DisplayerViewer;
import org.dashbuilder.displayer.client.widgets.ExternalComponentPresenter;
import org.dashbuilder.displayer.client.widgets.ExternalComponentView;
import org.dashbuilder.displayer.client.widgets.RendererSelector;
import org.dashbuilder.displayer.client.widgets.RendererSelectorListBoxView;
import org.dashbuilder.displayer.client.widgets.RendererSelectorRadioListView;
import org.dashbuilder.displayer.client.widgets.RendererSelectorTabListView;
import org.dashbuilder.displayer.client.widgets.filter.DateParameterEditor;
import org.dashbuilder.displayer.client.widgets.filter.DateParameterEditorView;
import org.dashbuilder.displayer.client.widgets.filter.NumberParameterEditor;
import org.dashbuilder.displayer.client.widgets.filter.NumberParameterEditorView;
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
import org.dashbuilder.renderer.echarts.client.EChartsBubbleChartDisplayer;
import org.dashbuilder.renderer.echarts.client.EChartsDisplayerView;
import org.dashbuilder.renderer.echarts.client.EChartsMeterChartDisplayer;
import org.dashbuilder.renderer.echarts.client.EChartsPieChartDisplayer;
import org.dashbuilder.renderer.echarts.client.EChartsRenderer;
import org.dashbuilder.renderer.echarts.client.EChartsResizeHandlerRegister;
import org.dashbuilder.renderer.echarts.client.EChartsXYChartDisplayer;
import org.dashbuilder.renderer.echarts.client.js.EChartsTypeFactory;
import org.dashbuilder.shared.marshalling.RuntimeModelJSONMarshaller;
import org.jboss.errai.bus.client.api.ClientMessageBus;
import org.jboss.errai.bus.client.api.messaging.RequestDispatcher;
import org.jboss.errai.common.client.api.BatchCaller;
import org.jboss.errai.common.client.api.Caller;
import org.jboss.errai.common.client.dom.Anchor;
import org.jboss.errai.common.client.dom.Div;
import org.jboss.errai.common.client.dom.Document;
import org.jboss.errai.common.client.dom.Input;
import org.jboss.errai.common.client.dom.Label;
import org.jboss.errai.common.client.dom.ListItem;
import org.jboss.errai.common.client.dom.NumberInput;
import org.jboss.errai.common.client.dom.OrderedList;
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
import org.uberfire.client.mvp.Activity;
import org.uberfire.client.mvp.ActivityBeansCache;
import org.uberfire.client.mvp.ActivityBeansInfo;
import org.uberfire.client.mvp.ActivityLifecycleErrorHandler;
import org.uberfire.client.mvp.ActivityManagerImpl;
import org.uberfire.client.mvp.PerspectiveActivity;
import org.uberfire.client.mvp.PerspectiveManagerImpl;
import org.uberfire.client.mvp.PlaceManager;
import org.uberfire.client.mvp.PlaceManagerImpl;
import org.uberfire.client.mvp.PlaceStatus;
import org.uberfire.client.mvp.WorkbenchActivity;
import org.uberfire.client.promise.Promises;
import org.uberfire.client.views.pfly.PatternFlyEntryPoint;
import org.uberfire.client.views.pfly.dnd.CompassWidgetImpl;
import org.uberfire.client.views.pfly.listbar.ListBarWidgetImpl;
import org.uberfire.client.views.pfly.modal.Bs3Modal;
import org.uberfire.client.views.pfly.multiscreen.MultiScreenPartWidget;
import org.uberfire.client.views.pfly.multiscreen.MultiScreenView;
import org.uberfire.client.views.pfly.notfound.ActivityNotFoundView;
import org.uberfire.client.views.pfly.notifications.NotificationPopupsManagerView;
import org.uberfire.client.views.pfly.popup.PopupViewImpl;
import org.uberfire.client.views.pfly.tab.ResizeTabPanel;
import org.uberfire.client.views.pfly.tab.TabPanelWithDropdowns;
import org.uberfire.client.views.pfly.tab.UberTabPanel;
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
import org.uberfire.client.workbench.Workbench;
import org.uberfire.client.workbench.WorkbenchLayoutImpl;
import org.uberfire.client.workbench.WorkbenchServicesProxyClientImpl;
import org.uberfire.client.workbench.panels.impl.LayoutPanelPresenter;
import org.uberfire.client.workbench.panels.impl.LayoutPanelView;
import org.uberfire.client.workbench.panels.support.PartManager;
import org.uberfire.client.workbench.pmgr.nswe.part.WorkbenchPartPresenterDefault;
import org.uberfire.client.workbench.pmgr.nswe.part.WorkbenchPartView;
import org.uberfire.client.workbench.pmgr.unanchored.part.UnanchoredWorkbenchPartPresenter;
import org.uberfire.client.workbench.pmgr.unanchored.part.UnanchoredWorkbenchPartView;
import org.uberfire.client.workbench.widgets.common.ErrorPopupPresenter;
import org.uberfire.client.workbench.widgets.dnd.CompassDropController;
import org.uberfire.client.workbench.widgets.dnd.WorkbenchDragAndDropManager;
import org.uberfire.client.workbench.widgets.dnd.WorkbenchPickupDragController;
import org.uberfire.client.workbench.widgets.listbar.ResizeFlowPanel;
import org.uberfire.client.workbench.widgets.notfound.ActivityNotFoundPresenter;
import org.uberfire.client.workbench.widgets.notifications.NotificationManager;
import org.uberfire.ext.layout.editor.client.LayoutEditorEntryPoint;
import org.uberfire.ext.layout.editor.client.generator.BootstrapLayoutGenerator;
import org.uberfire.ext.layout.editor.client.generator.BootstrapLayoutGeneratorDriver;
import org.uberfire.ext.layout.editor.client.infra.LayoutDragComponentHelper;
import org.uberfire.ext.layout.editor.client.infra.LayoutEditorCssHelper;
import org.uberfire.ext.plugin.client.RuntimePluginsEntryPoint;
import org.uberfire.ext.plugin.client.perspective.editor.layout.editor.HTMLLayoutDragComponent;
import org.uberfire.ext.plugin.client.perspective.editor.layout.editor.TargetDivDragComponent;
import org.uberfire.ext.plugin.client.resources.i18n.PerspectiveEditorPaletteI18nImpl;
import org.uberfire.ext.widgets.common.client.CommonsEntryPoint;
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
import org.uberfire.ext.widgets.common.client.select.SelectComponent;
import org.uberfire.ext.widgets.common.client.select.SelectOptionComponent;
import org.uberfire.ext.widgets.common.client.select.SelectOptionView;
import org.uberfire.ext.widgets.common.client.select.SelectView;
import org.uberfire.ext.widgets.table.client.TableEntryPoint;
import org.uberfire.mvp.Command;
import org.uberfire.mvp.PlaceRequest;
import org.uberfire.workbench.model.CompassPosition;
import org.uberfire.workbench.model.ContextDefinition;
import org.uberfire.workbench.model.ContextDisplayMode;
import org.uberfire.workbench.model.CustomPanelDefinition;
import org.uberfire.workbench.model.PanelDefinition;
import org.uberfire.workbench.model.PartDefinition;
import org.uberfire.workbench.model.PerspectiveDefinition;
import org.uberfire.workbench.model.Position;
import org.uberfire.workbench.model.impl.PanelDefinitionImpl;

public class BootstrapperImpl implements Bootstrapper {
  {
    addLookups_0();
    new CDI().initLookupTable(CDIEventTypeLookup.get());
    new DataBindingModuleBootstrapper().run();
  }

  private ContextManager contextManager = new ContextManagerImpl();
  private static final Logger logger = LoggerFactory.getLogger(Bootstrapper.class);
  public abstract class Type_factory__o_d_c_n_w_ScreenLayoutDragComponent__quals__j_e_i_Any_j_e_i_Default extends Factory<ScreenLayoutDragComponent> { }
  public abstract class Type_factory__o_d_d_c_w_ExternalComponentPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<ExternalComponentPresenter> { }
  public abstract class Type_factory__o_d_c_m_ClientDataSetMetadataJSONMarshaller__quals__j_e_i_Any_j_e_i_Default extends Factory<ClientDataSetMetadataJSONMarshaller> { }
  public abstract class ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal extends Factory<Caller> { }
  public abstract class Producer_factory__o_j_e_b_c_a_ClientMessageBus__quals__j_e_i_Any_j_e_i_Default extends Factory<ClientMessageBus> { }
  public abstract class Type_factory__o_d_c_w_v_UploadWidgetView__quals__j_e_i_Any_j_e_i_Default extends Factory<UploadWidgetView> { }
  public abstract class Type_factory__o_u_e_l_e_c_LayoutEditorEntryPoint__quals__j_e_i_Any_j_e_i_Default extends Factory<LayoutEditorEntryPoint> { }
  public abstract class Type_factory__o_u_c_w_Workbench__quals__j_e_i_Any_j_e_i_Default extends Factory<Workbench> { }
  public abstract class Type_factory__o_d_d_e_g_IntervalBuilderDynamicLabel__quals__j_e_i_Any_j_e_i_Default extends Factory<IntervalBuilderDynamicLabel> { }
  public abstract class Type_factory__o_u_c_m_ActivityBeansInfo__quals__j_e_i_Any_j_e_i_Default extends Factory<ActivityBeansInfo> { }
  public abstract class Type_factory__o_d_c_n_w_NavMenuBarWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<NavMenuBarWidget> { }
  public abstract class Type_factory__o_u_c_w_p_u_p_UnanchoredWorkbenchPartView__quals__j_e_i_Any_j_e_i_Default extends Factory<UnanchoredWorkbenchPartView> { }
  public abstract class Type_factory__o_u_c_v_p_w_Select__quals__j_e_i_Any_j_e_i_Default extends Factory<Select> { }
  public abstract class Type_factory__o_u_w_m_i_PanelDefinitionImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<PanelDefinitionImpl> { }
  public abstract class Type_factory__o_d_r_c_c_c_p_C3PieChartDisplayer__quals__j_e_i_Any_j_e_i_Default extends Factory<C3PieChartDisplayer> { }
  public abstract class Type_factory__o_u_c_v_p_w_ErrorPopupView__quals__j_e_i_Any_j_e_i_Default extends Factory<ErrorPopupView> { }
  public abstract class Type_factory__o_d_c_s_v_RouterScreenView__quals__j_e_i_Any_j_e_i_Default extends Factory<RouterScreenView> { }
  public abstract class Type_factory__o_d_c_n_w_NavCarouselWidgetView__quals__j_e_i_Any_j_e_i_Default extends Factory<NavCarouselWidgetView> { }
  public abstract class Type_factory__o_d_r_c_c_j_C3JsTypesFactory__quals__j_e_i_Any_j_e_i_Default extends Factory<C3JsTypesFactory> { }
  public abstract class Type_factory__o_u_c_v_p_m_MultiScreenView__quals__j_e_i_Any_j_e_i_Default extends Factory<MultiScreenView> { }
  public abstract class Type_factory__o_d_c_w_UploadWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<UploadWidget> { }
  public abstract class Type_factory__o_d_c_e_c_CSVParser__quals__j_e_i_Any_j_e_i_Default extends Factory<CSVParser> { }
  public abstract class Type_factory__o_u_c_w_w_d_WorkbenchDragAndDropManager__quals__j_e_i_Any_j_e_i_Default extends Factory<WorkbenchDragAndDropManager> { }
  public abstract class Type_factory__o_d_c_n_w_NavTilesWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<NavTilesWidget> { }
  public abstract class Type_factory__o_d_c_s_ContentErrorScreen__quals__j_e_i_Any_j_e_i_Default extends Factory<ContentErrorScreen> { }
  public abstract class Type_factory__o_u_e_w_c_c_s_SelectComponent__quals__j_e_i_Any_j_e_i_Default extends Factory<SelectComponent> { }
  public abstract class Type_factory__o_d_r_c_e_ExternalComponentDisplayerView__quals__j_e_i_Any_j_e_i_Default extends Factory<ExternalComponentDisplayerView> { }
  public abstract class Type_factory__o_u_c_m_PerspectiveManagerImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<PerspectiveManagerImpl> { }
  public abstract class Type_factory__o_u_c_w_w_c_ErrorPopupPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<ErrorPopupPresenter> { }
  public abstract class Type_factory__o_d_c_p_g_RuntimePerspectiveGenerator__quals__j_e_i_Any_j_e_i_Default extends Factory<RuntimePerspectiveGenerator> { }
  public abstract class Type_factory__o_d_r_c_c_c_m_C3MeterView__quals__j_e_i_Any_j_e_i_Default extends Factory<C3MeterView> { }
  public abstract class Type_factory__o_d_d_c_c_ExternalComponentMessageHelperProducer__quals__j_e_i_Any_j_e_i_Default extends Factory<ExternalComponentMessageHelperProducer> { }
  public abstract class ContextualProvider_factory__j_e_e_Event__quals__Universal extends Factory<Event> { }
  public abstract class Type_factory__o_d_r_c_c_c_m_w_MapTooltip__quals__j_e_i_Any_j_e_i_Default extends Factory<MapTooltip> { }
  public abstract class Type_factory__o_d_c_s_RuntimeScreen__quals__j_e_i_Any_j_e_i_Default extends Factory<RuntimeScreen> { }
  public abstract class Type_factory__o_d_c_p_DashboardsListPerspectiveActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<DashboardsListPerspectiveActivity> { }
  public abstract class Type_factory__o_d_c_p_YAMLRuntimeModelClientParser__quals__j_e_i_Any_j_e_i_Default extends Factory<YAMLRuntimeModelClientParser> { }
  public abstract class Type_factory__o_d_c_w_v_SampleCardView__quals__j_e_i_Any_j_e_i_Default extends Factory<SampleCardView> { }
  public abstract class Type_factory__o_d_c_p_ContentErrorPerspective__quals__j_e_i_Any_j_e_i_Default extends Factory<ContentErrorPerspective> { }
  public abstract class Type_factory__o_d_c_p_PropertyReplacementService__quals__j_e_i_Any_j_e_i_Default extends Factory<PropertyReplacementService> { }
  public abstract class ContextualProvider_factory__o_j_e_i_c_a_InitBallot__quals__Universal extends Factory<InitBallot> { }
  public abstract class Type_factory__o_d_c_w_SampleCard__quals__j_e_i_Any_j_e_i_Default extends Factory<SampleCard> { }
  public abstract class ExtensionProvided_factory__o_j_e_c_c_d_Input__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<Input> { }
  public abstract class Type_factory__o_j_e_c_c_d_e_Elemental2DomUtil__quals__j_e_i_Any_j_e_i_Default extends Factory<Elemental2DomUtil> { }
  public abstract class Type_factory__o_u_c_w_WorkbenchServicesProxyClientImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<WorkbenchServicesProxyClientImpl> { }
  public abstract class Type_factory__o_d_d_c_u_ClientUUIDGenerator__quals__j_e_i_Any_j_e_i_Default extends Factory<ClientUUIDGenerator> { }
  public abstract class Type_factory__o_u_c_v_p_w_Button__quals__j_e_i_Any_j_e_i_Default extends Factory<Button> { }
  public abstract class Type_factory__o_u_e_w_t_c_TableEntryPoint__quals__j_e_i_Any_j_e_i_Default extends Factory<TableEntryPoint> { }
  public abstract class Type_factory__o_u_c_v_p_t_TabPanelWithDropdowns__quals__j_e_i_Any_j_e_i_Default extends Factory<TabPanelWithDropdowns> { }
  public abstract class ExtensionProvided_factory__o_j_e_c_c_d_NumberInput__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<NumberInput> { }
  public abstract class Provider_factory__o_j_e_c_c_a_BatchCaller__quals__j_e_i_Any_j_e_i_Default extends Factory<BatchCaller> { }
  public abstract class Type_factory__o_u_c_v_p_w_FormLabel__quals__j_e_i_Any_j_e_i_Default extends Factory<FormLabel> { }
  public abstract class Type_factory__o_d_r_c_s_SelectorLabelItemView__quals__j_e_i_Any_j_e_i_Default extends Factory<SelectorLabelItemView> { }
  public abstract class Type_factory__o_u_e_p_c_p_e_l_e_HTMLLayoutDragComponent__quals__j_e_i_Any_j_e_i_Default extends Factory<HTMLLayoutDragComponent> { }
  public abstract class Type_factory__o_u_e_w_c_c_s_SelectOptionView__quals__j_e_i_Any_j_e_i_Default extends Factory<SelectOptionView> { }
  public abstract class Type_factory__o_u_c_v_p_PatternFlyEntryPoint__quals__j_e_i_Any_j_e_i_Default extends Factory<PatternFlyEntryPoint> { }
  public abstract class Type_factory__o_j_e_i_s_b_c_BatchCallerProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<BatchCallerProvider> { }
  public abstract class Type_factory__o_d_d_c_ClientDataSetManager__quals__j_e_i_Any_j_e_i_Default extends Factory<ClientDataSetManager> { }
  public abstract class JsType_factory__j_u_Set__quals__Universal extends Factory<Set> { }
  public abstract class Type_factory__o_d_c_RuntimeEntryPoint__quals__j_e_i_Any_j_e_i_Default extends Factory<RuntimeEntryPoint> { }
  public abstract class Type_factory__o_d_c_n_w_NavTabListWidgetView__quals__j_e_i_Any_j_e_i_Default extends Factory<NavTabListWidgetView> { }
  public abstract class Producer_factory__e_d_HTMLDocument__quals__j_e_i_Any_j_e_i_Default extends Factory<HTMLDocument> { }
  public abstract class Type_factory__o_u_c_w_DefaultBeanFactory__quals__j_e_i_Any_j_e_i_Default extends Factory<DefaultBeanFactory> { }
  public abstract class Type_factory__o_d_r_c_s_SelectorDisplayerView__quals__j_e_i_Any_j_e_i_Default extends Factory<SelectorDisplayerView> { }
  public abstract class Type_factory__o_d_r_e_c_EChartsDisplayerView__quals__j_e_i_Any_j_e_i_Default extends Factory<EChartsDisplayerView> { }
  public abstract class Type_factory__o_d_c_p_NotFoundPerspective__quals__j_e_i_Any_j_e_i_Default extends Factory<NotFoundPerspective> { }
  public abstract class Type_factory__o_u_c_w_p_s_PartManager__quals__j_e_i_Any_j_e_i_Default extends Factory<PartManager> { }
  public abstract class Type_factory__o_d_d_c_e_ClientIntervalBuilderLocator__quals__j_e_i_Any_j_e_i_Default extends Factory<ClientIntervalBuilderLocator> { }
  public abstract class Type_factory__o_j_e_i_c_l_i_AccessImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<AccessImpl> { }
  public abstract class Type_factory__o_d_c_n_l_e_NavMenuBarDragComponent__quals__j_e_i_Any_j_e_i_Default extends Factory<NavMenuBarDragComponent> { }
  public abstract class Type_factory__o_d_c_w_DashboardCard__quals__j_e_i_Any_j_e_i_Default extends Factory<DashboardCard> { }
  public abstract class Type_factory__o_d_r_c_c_c_l_C3LineChartView__quals__j_e_i_Any_j_e_i_Default extends Factory<C3LineChartView> { }
  public abstract class Type_factory__o_d_c_s_RouterScreen__quals__j_e_i_Any_j_e_i_Default extends Factory<RouterScreen> { }
  public abstract class Type_factory__o_d_c_s_DashboardsListScreenActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<DashboardsListScreenActivity> { }
  public abstract class Type_factory__o_u_c_v_p_n_ActivityNotFoundView__quals__j_e_i_Any_j_e_i_Default extends Factory<ActivityNotFoundView> { }
  public abstract class ExtensionProvided_factory__e_d_HTMLIFrameElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<HTMLIFrameElement> { }
  public abstract class Type_factory__o_d_r_c_s_SelectorDropDownItemView__quals__j_e_i_Any_j_e_i_Default extends Factory<SelectorDropDownItemView> { }
  public abstract class Type_factory__o_u_c_v_p_w_KebabMenuItem__quals__j_e_i_Any_j_e_i_Default extends Factory<KebabMenuItem> { }
  public abstract class JsType_factory__j_u_Map__quals__Universal extends Factory<Map> { }
  public abstract class Type_factory__o_d_d_c_w_DisplayerErrorWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<DisplayerErrorWidget> { }
  public abstract class Type_factory__o_d_d_c_DisplayerClientEntryPoint__quals__j_e_i_Any_j_e_i_Default extends Factory<DisplayerClientEntryPoint> { }
  public abstract class Type_factory__o_u_c_v_p_t_ResizeTabPanel__quals__j_e_i_Any_o_u_c_v_p_t_Resize extends Factory<ResizeTabPanel> { }
  public abstract class Type_factory__o_d_c_c_w_FilterLabelSet__quals__j_e_i_Any_j_e_i_Default extends Factory<FilterLabelSet> { }
  public abstract class Type_factory__o_d_c_p_NotFoundPerspectiveActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<NotFoundPerspectiveActivity> { }
  public abstract class JsType_factory__o_u_w_m_PartDefinition__quals__Universal extends Factory<PartDefinition> { }
  public abstract class Type_factory__o_d_c_p_RuntimeModelClientParserFactory__quals__j_e_i_Any_j_e_i_Default extends Factory<RuntimeModelClientParserFactory> { }
  public abstract class Type_factory__o_d_c_s_NotFoundScreen__quals__j_e_i_Any_j_e_i_Default extends Factory<NotFoundScreen> { }
  public abstract class Type_factory__o_d_r_c_t_TableDisplayerView__quals__j_e_i_Any_j_e_i_Default extends Factory<TableDisplayerView> { }
  public abstract class ExtensionProvided_factory__o_j_e_c_c_d_UnorderedList__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<UnorderedList> { }
  public abstract class Type_factory__o_d_r_e_c_EChartsMeterChartDisplayer__quals__j_e_i_Any_j_e_i_Default extends Factory<EChartsMeterChartDisplayer> { }
  public abstract class Provider_factory__c_g_g_u_c_u_RootPanel__quals__j_e_i_Any_j_e_i_Default extends Factory<RootPanel> { }
  public abstract class Type_factory__o_d_c_e_ErrorResponseVerifier__quals__j_e_i_Any_j_e_i_Default extends Factory<ErrorResponseVerifier> { }
  public abstract class Type_factory__o_d_c_n_w_NavTilesWidgetView__quals__j_e_i_Any_j_e_i_Default extends Factory<NavTilesWidgetView> { }
  public abstract class Type_factory__o_d_r_c_s_SelectorDropDownDisplayer__quals__j_e_i_Any_j_e_i_Default extends Factory<SelectorDropDownDisplayer> { }
  public abstract class Type_factory__o_d_c_s_v_EmptyScreenView__quals__j_e_i_Any_j_e_i_Default extends Factory<EmptyScreenView> { }
  public abstract class Type_factory__o_d_r_c_c_c_l_C3LineChartDisplayer__quals__j_e_i_Any_j_e_i_Default extends Factory<C3LineChartDisplayer> { }
  public abstract class Type_factory__o_d_d_c_w_f_NumberParameterEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<NumberParameterEditor> { }
  public abstract class Type_factory__o_u_e_w_c_c_d_i_LiveSearchSelectorDropDownItemViewImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<LiveSearchSelectorDropDownItemViewImpl> { }
  public abstract class Type_factory__o_d_c_n_l_e_NavTreeDragComponent__quals__j_e_i_Any_j_e_i_Default extends Factory<NavTreeDragComponent> { }
  public abstract class Producer_factory__o_u_c_v_p_w_JQueryElementalProducer_JQuery__quals__j_e_i_Any_j_e_i_Default extends Factory<JQuery> { }
  public abstract class Type_factory__o_d_r_c_s_SelectorLabelSetDisplayer__quals__j_e_i_Any_j_e_i_Default extends Factory<SelectorLabelSetDisplayer> { }
  public abstract class Type_factory__o_j_e_i_c_l_i_DestructionImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<DestructionImpl> { }
  public abstract class ExtensionProvided_factory__e_d_HTMLHeadingElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named_1 extends Factory<HTMLHeadingElement> { }
  public abstract class Type_factory__o_u_c_w_w_d_CompassDropController__quals__j_e_i_Any_j_e_i_Default extends Factory<CompassDropController> { }
  public abstract class Type_factory__o_u_e_l_e_c_g_BootstrapLayoutGenerator__quals__j_e_i_Any_j_e_i_Default extends Factory<BootstrapLayoutGenerator> { }
  public abstract class Type_factory__o_d_r_c_s_SelectorLabelSetDisplayerView__quals__j_e_i_Any_j_e_i_Default extends Factory<SelectorLabelSetDisplayerView> { }
  public abstract class Type_factory__o_d_c_c_w_FilterLabel__quals__j_e_i_Any_j_e_i_Default extends Factory<FilterLabel> { }
  public abstract class Type_factory__o_u_c_v_p_w_FormGroup__quals__j_e_i_Any_j_e_i_Default extends Factory<FormGroup> { }
  public abstract class Type_factory__o_d_c_w_SamplesCardRow__quals__j_e_i_Any_j_e_i_Default extends Factory<SamplesCardRow> { }
  public abstract class Type_factory__o_d_d_c_f_ValueFormatterRegistry__quals__j_e_i_Any_j_e_i_Default extends Factory<ValueFormatterRegistry> { }
  public abstract class Type_factory__o_j_e_i_c_a_b_InitBallotProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<InitBallotProvider> { }
  public abstract class JsType_factory__o_u_m_Command__quals__Universal extends Factory<Command> { }
  public abstract class Type_factory__o_d_c_s_v_DashboardsListScreenView__quals__j_e_i_Any_j_e_i_Default extends Factory<DashboardsListScreenView> { }
  public abstract class Type_factory__o_j_e_u_c_w_LocaleListBox__quals__j_e_i_Any_j_e_i_Default extends Factory<LocaleListBox> { }
  public abstract class Type_factory__o_d_d_c_w_RendererSelectorTabListView__quals__j_e_i_Any_j_e_i_Default extends Factory<RendererSelectorTabListView> { }
  public abstract class Type_factory__o_d_c_p_SamplesPerspectiveActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<SamplesPerspectiveActivity> { }
  public abstract class Type_factory__o_u_e_w_c_c_d_LiveSearchDropDownView__quals__j_e_i_Any_j_e_i_Default extends Factory<LiveSearchDropDownView> { }
  public abstract class Type_factory__o_u_e_p_c_p_e_l_e_TargetDivDragComponent__quals__j_e_i_Any_j_e_i_Default extends Factory<TargetDivDragComponent> { }
  public abstract class JsType_factory__o_u_m_PlaceRequest__quals__Universal extends Factory<PlaceRequest> { }
  public abstract class Type_factory__o_d_d_c_w_DisplayerViewer__quals__j_e_i_Any_j_e_i_Default extends Factory<DisplayerViewer> { }
  public abstract class Type_factory__o_d_c_n_w_NavItemTileWidgetView__quals__j_e_i_Any_j_e_i_Default extends Factory<NavItemTileWidgetView> { }
  public abstract class Type_factory__o_d_c_c_w_AlertBoxView__quals__j_e_i_Any_j_e_i_Default extends Factory<AlertBoxView> { }
  public abstract class Type_factory__o_d_r_c_DefaultRenderer__quals__j_e_i_Any_j_e_i_Default extends Factory<DefaultRenderer> { }
  public abstract class Type_factory__o_d_r_e_c_EChartsXYChartDisplayer__quals__j_e_i_Any_j_e_i_Default extends Factory<EChartsXYChartDisplayer> { }
  public abstract class Type_factory__o_d_d_e_g_IntervalBuilderFixedDate__quals__j_e_i_Any_j_e_i_Default extends Factory<IntervalBuilderFixedDate> { }
  public abstract class Type_factory__o_u_c_w_w_n_ActivityNotFoundPresenter__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<ActivityNotFoundPresenter> { }
  public abstract class Type_factory__o_d_c_p_RouterPerspective__quals__j_e_i_Any_j_e_i_Default extends Factory<RouterPerspective> { }
  public abstract class ExtensionProvided_factory__e_d_HTMLDivElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<HTMLDivElement> { }
  public abstract class Type_factory__o_d_d_c_w_RendererSelectorRadioListView__quals__j_e_i_Any_j_e_i_Default extends Factory<RendererSelectorRadioListView> { }
  public abstract class Type_factory__o_u_e_w_c_c_CommonsEntryPoint__quals__j_e_i_Any_j_e_i_Default extends Factory<CommonsEntryPoint> { }
  public abstract class Type_factory__o_d_c_n_w_NavTreeWidgetView__quals__j_e_i_Any_j_e_i_Default extends Factory<NavTreeWidgetView> { }
  public abstract class JsType_factory__o_j_e_i_c_c_JsTypeProvider__quals__Universal extends Factory<JsTypeProvider> { }
  public abstract class Type_factory__o_d_r_c_s_SelectorDropDownDisplayerView__quals__j_e_i_Any_j_e_i_Default extends Factory<SelectorDropDownDisplayerView> { }
  public abstract class ContextualProvider_factory__e_d_HTMLElement__quals__Universal extends Factory<HTMLElement> { }
  public abstract class Type_factory__o_u_e_w_c_c_d_f_LiveSearchFooter__quals__j_e_i_Any_j_e_i_Default extends Factory<LiveSearchFooter> { }
  public abstract class ExtensionProvided_factory__e_d_HTMLTextAreaElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<HTMLTextAreaElement> { }
  public abstract class Type_factory__o_d_d_c_w_f_DateParameterEditorView__quals__j_e_i_Any_j_e_i_Default extends Factory<DateParameterEditorView> { }
  public abstract class Type_factory__o_j_e_e_c_c_EventProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<EventProvider> { }
  public abstract class Type_factory__o_u_c_v_p_w_SanitizedNumberInput__quals__j_e_i_Any_j_e_i_Default extends Factory<SanitizedNumberInput> { }
  public abstract class ContextualProvider_factory__j_e_i_Instance__quals__Universal extends Factory<Instance> { }
  public abstract class Producer_factory__c_g_w_b_e_s_EventBus__quals__j_e_i_Any_j_e_i_Default extends Factory<EventBus> { }
  public abstract class Type_factory__o_d_r_c_t_TableDisplayer__quals__j_e_i_Any_j_e_i_Default extends Factory<TableDisplayer> { }
  public abstract class Type_factory__o_d_c_p_JSONRuntimeModelClientParser__quals__j_e_i_Any_j_e_i_Default extends Factory<JSONRuntimeModelClientParser> { }
  public abstract class Type_factory__o_d_d_c_PerspectiveCoordinator__quals__j_e_i_Any_j_e_i_Default extends Factory<PerspectiveCoordinator> { }
  public abstract class Type_factory__o_j_e_i_c_a_b_CallerProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<CallerProvider> { }
  public abstract class Type_factory__o_d_r_e_c_EChartsPieChartDisplayer__quals__j_e_i_Any_j_e_i_Default extends Factory<EChartsPieChartDisplayer> { }
  public abstract class Type_factory__o_d_c_s_SamplesService__quals__j_e_i_Any_j_e_i_Default extends Factory<SamplesService> { }
  public abstract class Type_factory__o_u_c_v_p_w_DropdownMenu__quals__j_e_i_Any_j_e_i_Default extends Factory<DropdownMenu> { }
  public abstract class ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<Span> { }
  public abstract class ExtensionProvided_factory__e_d_HTMLInputElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<HTMLInputElement> { }
  public abstract class Type_factory__o_d_c_s_SamplesScreenActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<SamplesScreenActivity> { }
  public abstract class Type_factory__o_d_c_s_RuntimeDataSetClientServices__quals__j_e_i_Any_j_e_i_Default extends Factory<RuntimeDataSetClientServices> { }
  public abstract class Type_factory__o_d_c_e_DisplayerDragComponent__quals__j_e_i_Any_j_e_i_Default extends Factory<DisplayerDragComponent> { }
  public abstract class Type_factory__o_u_c_v_p_t_UberTabPanel__quals__j_e_i_Any_j_e_i_Default extends Factory<UberTabPanel> { }
  public abstract class Type_factory__o_d_r_c_c_c_b_C3BubbleChartDisplayer__quals__j_e_i_Any_j_e_i_Default extends Factory<C3BubbleChartDisplayer> { }
  public abstract class JsType_factory__o_u_c_m_Activity__quals__Universal extends Factory<Activity> { }
  public abstract class ExtensionProvided_factory__e_d_HTMLButtonElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<HTMLButtonElement> { }
  public abstract class Type_factory__o_d_c_n_i_NavigationManagerImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<NavigationManagerImpl> { }
  public abstract class Type_factory__o_j_e_u_c_w_LocaleSelector__quals__j_e_i_Any_j_e_i_Default extends Factory<LocaleSelector> { }
  public abstract class Type_factory__o_d_d_c_w_ExternalComponentView__quals__j_e_i_Any_j_e_i_Default extends Factory<ExternalComponentView> { }
  public abstract class Type_factory__o_j_e_i_c_l_i_CreationImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<CreationImpl> { }
  public abstract class Type_factory__o_j_e_d_c_ListComponentProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<ListComponentProvider> { }
  public abstract class JsType_factory__o_u_w_m_ContextDefinition__quals__Universal extends Factory<ContextDefinition> { }
  public abstract class JsType_factory__o_u_c_m_PerspectiveActivity__quals__Universal extends Factory<PerspectiveActivity> { }
  public abstract class JsType_factory__o_j_e_e_c_c_JsTypeEventObserver__quals__Universal extends Factory<JsTypeEventObserver> { }
  public abstract class Type_factory__o_u_c_w_WorkbenchLayoutImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<WorkbenchLayoutImpl> { }
  public abstract class Type_factory__o_d_d_c_e_ClientDateFormatterImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<ClientDateFormatterImpl> { }
  public abstract class Type_factory__o_d_c_s_SamplesScreen__quals__j_e_i_Any_j_e_i_Default extends Factory<SamplesScreen> { }
  public abstract class Type_factory__o_d_r_c_c_c_p_C3PieChartView__quals__j_e_i_Any_j_e_i_Default extends Factory<C3PieChartView> { }
  public abstract class Type_factory__o_u_c_v_p_m_MultiScreenPartWidget__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<MultiScreenPartWidget> { }
  public abstract class Type_factory__o_j_e_i_c_l_i_LifecycleListenerRegistrarImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<LifecycleListenerRegistrarImpl> { }
  public abstract class Type_factory__o_u_e_w_c_c_d_LiveSearchDropDown__quals__j_e_i_Any_j_e_i_Default extends Factory<LiveSearchDropDown> { }
  public abstract class Type_factory__o_d_c_s_EmptyScreenActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<EmptyScreenActivity> { }
  public abstract class ContextualProvider_factory__o_j_e_c_c_d_HTMLElement__quals__Universal extends Factory<org.jboss.errai.common.client.dom.HTMLElement> { }
  public abstract class Type_factory__o_d_d_c_ClientSettings__quals__j_e_i_Any_j_e_i_Default extends Factory<ClientSettings> { }
  public abstract class JsType_factory__o_u_w_m_CustomPanelDefinition__quals__Universal extends Factory<CustomPanelDefinition> { }
  public abstract class Type_factory__o_u_c_v_p_w_Elemental2Producer__quals__j_e_i_Any_j_e_i_Default extends Factory<Elemental2Producer> { }
  public abstract class ContextualProvider_factory__o_j_e_i_c_a_Disposer__quals__Universal extends Factory<Disposer> { }
  public abstract class ContextualProvider_factory__o_j_e_d_c_c_ListComponent__quals__Universal extends Factory<ListComponent> { }
  public abstract class Type_factory__o_u_c_v_p_m_ErrorPopupView__quals__j_e_i_Any_j_e_i_Default extends Factory<org.uberfire.client.views.pfly.modal.ErrorPopupView> { }
  public abstract class ExtensionProvided_factory__e_d_HTMLHeadingElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<HTMLHeadingElement> { }
  public abstract class Type_factory__o_d_d_c_DisplayerLocator__quals__j_e_i_Any_j_e_i_Default extends Factory<DisplayerLocator> { }
  public abstract class Type_factory__o_d_r_e_c_EChartsResizeHandlerRegister__quals__j_e_i_Any_j_e_i_Default extends Factory<EChartsResizeHandlerRegister> { }
  public abstract class Type_factory__o_d_r_c_c_c_m_g_i_CountriesGeoJsonServiceImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<CountriesGeoJsonServiceImpl> { }
  public abstract class Type_factory__o_u_c_w_w_n_NotificationManager__quals__j_e_i_Any_j_e_i_Default extends Factory<NotificationManager> { }
  public abstract class ExtensionProvided_factory__o_j_e_c_c_d_Select__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<org.jboss.errai.common.client.dom.Select> { }
  public abstract class Type_factory__o_d_c_w_v_SamplesCardRowView__quals__j_e_i_Any_j_e_i_Default extends Factory<SamplesCardRowView> { }
  public abstract class Producer_factory__o_j_e_c_c_d_Document__quals__j_e_i_Any_j_e_i_Default extends Factory<Document> { }
  public abstract class ExtensionProvided_factory__e_d_HTMLAnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<HTMLAnchorElement> { }
  public abstract class Type_factory__o_d_d_e_f_AggregateFunctionManagerImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<AggregateFunctionManagerImpl> { }
  public abstract class ContextualProvider_factory__o_j_e_i_c_a_ManagedInstance__quals__Universal extends Factory<ManagedInstance> { }
  public abstract class Type_factory__o_d_r_c_c_c_b_C3BubbleChartView__quals__j_e_i_Any_j_e_i_Default extends Factory<C3BubbleChartView> { }
  public abstract class ExtensionProvided_factory__o_j_e_c_c_d_Anchor__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<Anchor> { }
  public abstract class Type_factory__o_d_r_c_c_c_m_C3MeterChartDisplayer__quals__j_e_i_Any_j_e_i_Default extends Factory<C3MeterChartDisplayer> { }
  public abstract class Type_factory__o_d_c_e_c_CSVColumnsFunction__quals__j_e_i_Any_j_e_i_Default extends Factory<CSVColumnsFunction> { }
  public abstract class Type_factory__o_d_c_s_RuntimeScreenActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<RuntimeScreenActivity> { }
  public abstract class JsType_factory__o_u_c_m_PlaceStatus__quals__Universal extends Factory<PlaceStatus> { }
  public abstract class ExtensionProvided_factory__e_d_HTMLPreElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<HTMLPreElement> { }
  public abstract class Type_factory__o_d_r_c_c_c_b_C3BarChartView__quals__j_e_i_Any_j_e_i_Default extends Factory<C3BarChartView> { }
  public abstract class Type_factory__o_d_c_w_v_DashboardCardView__quals__j_e_i_Any_j_e_i_Default extends Factory<DashboardCardView> { }
  public abstract class Type_factory__o_u_c_w_p_i_LayoutPanelPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<LayoutPanelPresenter> { }
  public abstract class Type_factory__o_d_r_c_c_c_m_D3MapDisplayer__quals__j_e_i_Any_j_e_i_Default extends Factory<D3MapDisplayer> { }
  public abstract class Type_factory__o_d_c_p_RuntimePerspectiveActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<RuntimePerspectiveActivity> { }
  public abstract class Type_factory__o_u_c_v_p_w_Modal__quals__j_e_i_Any_j_e_i_Default extends Factory<Modal> { }
  public abstract class ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal extends Factory<DataBinder> { }
  public abstract class Type_factory__o_d_d_c_DataSetClientServicesImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<DataSetClientServicesImpl> { }
  public abstract class ExtensionProvided_factory__o_s_Logger__quals__Universal_1 extends Factory<Logger> { }
  public abstract class Type_factory__o_d_c_n_w_NavTreeWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<NavTreeWidget> { }
  public abstract class Type_factory__o_d_c_c_w_FilterLabelView__quals__j_e_i_Any_j_e_i_Default extends Factory<FilterLabelView> { }
  public abstract class Type_factory__o_j_e_i_c_a_b_RootPanelProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<RootPanelProvider> { }
  public abstract class Type_factory__o_d_c_p_RouterPerspectiveActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<RouterPerspectiveActivity> { }
  public abstract class Type_factory__o_d_c_c_w_FilterLabelSetView__quals__j_e_i_Any_j_e_i_Default extends Factory<FilterLabelSetView> { }
  public abstract class ExtensionProvided_factory__o_s_Logger__quals__Universal extends Factory<Logger> { }
  public abstract class JsType_factory__o_u_w_m_i_PanelDefinitionImpl__quals__Universal extends Factory<PanelDefinitionImpl> { }
  public abstract class Producer_factory__o_u_c_v_p_w_JQueryProducer_JQuery__quals__j_e_i_Any_j_e_i_Default extends Factory<org.uberfire.client.views.pfly.widgets.JQueryProducer.JQuery> { }
  public abstract class Type_factory__o_j_e_u_c_w_ListWidgetProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<ListWidgetProvider> { }
  public abstract class Type_factory__o_d_d_c_w_f_DateParameterEditor__quals__j_e_i_Any_j_e_i_Default extends Factory<DateParameterEditor> { }
  public abstract class Type_factory__o_u_e_p_c_r_i_PerspectiveEditorPaletteI18nImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<PerspectiveEditorPaletteI18nImpl> { }
  public abstract class ExtensionProvided_factory__e_d_HTMLFormElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<HTMLFormElement> { }
  public abstract class Type_factory__o_d_d_c_DisplayerCoordinator__quals__j_e_i_Any_j_e_i_Default extends Factory<DisplayerCoordinator> { }
  public abstract class Type_factory__o_u_c_v_p_m_Bs3Modal__quals__j_e_i_Any_j_e_i_Default extends Factory<Bs3Modal> { }
  public abstract class Type_factory__o_d_r_c_m_MetricView__quals__j_e_i_Any_j_e_i_Default extends Factory<MetricView> { }
  public abstract class Type_factory__o_d_c_n_w_NavItemTileWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<NavItemTileWidget> { }
  public abstract class Type_factory__o_d_c_s_EmptyScreen__quals__j_e_i_Any_j_e_i_Default extends Factory<EmptyScreen> { }
  public abstract class Type_factory__o_d_c_s_NotFoundScreenActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<NotFoundScreenActivity> { }
  public abstract class Type_factory__o_d_c_e_ExternalDataCallbackCoordinator__quals__j_e_i_Any_j_e_i_Default extends Factory<ExternalDataCallbackCoordinator> { }
  public abstract class JsType_factory__o_u_w_m_ContextDisplayMode__quals__Universal extends Factory<ContextDisplayMode> { }
  public abstract class Type_factory__o_d_c_n_l_e_NavCarouselDragComponent__quals__j_e_i_Any_j_e_i_Default extends Factory<NavCarouselDragComponent> { }
  public abstract class ExtensionProvided_factory__o_j_e_c_c_d_Label__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<Label> { }
  public abstract class JsType_factory__o_u_w_m_PerspectiveDefinition__quals__Universal extends Factory<PerspectiveDefinition> { }
  public abstract class Type_factory__o_u_c_w_LayoutSelection__quals__j_e_i_Any_j_e_i_Default extends Factory<LayoutSelection> { }
  public abstract class Type_factory__o_j_e_u_s_ServerTemplateProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<ServerTemplateProvider> { }
  public abstract class ExtensionProvided_factory__e_d_HTMLUListElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<HTMLUListElement> { }
  public abstract class Type_factory__o_d_c_p_RuntimePerspective__quals__j_e_i_Any_j_e_i_Default extends Factory<RuntimePerspective> { }
  public abstract class Type_factory__o_d_c_p_EmptyPerspectiveActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<EmptyPerspectiveActivity> { }
  public abstract class Type_factory__o_u_c_m_PlaceManagerImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<PlaceManagerImpl> { }
  public abstract class Type_factory__o_d_r_c_e_ExternalComponentDisplayer__quals__j_e_i_Any_j_e_i_Default extends Factory<ExternalComponentDisplayer> { }
  public abstract class Type_factory__o_d_r_c_c_c_b_C3BarChartDisplayer__quals__j_e_i_Any_j_e_i_Default extends Factory<C3BarChartDisplayer> { }
  public abstract class Type_factory__o_u_c_v_p_w_InputAutocomplete__quals__j_e_i_Any_j_e_i_Default extends Factory<InputAutocomplete> { }
  public abstract class Type_factory__o_j_e_i_c_a_b_IOCBeanManagerProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<IOCBeanManagerProvider> { }
  public abstract class ExtensionProvided_factory__o_u_c_w_w_l_ResizeFlowPanel__quals__j_e_i_Any_j_e_i_Default extends Factory<ResizeFlowPanel> { }
  public abstract class Type_factory__o_u_c_v_p_w_KebabMenu__quals__j_e_i_Any_j_e_i_Default extends Factory<KebabMenu> { }
  public abstract class Type_factory__o_u_e_w_c_c_s_SelectView__quals__j_e_i_Any_j_e_i_Default extends Factory<SelectView> { }
  public abstract class JsType_factory__o_u_c_m_WorkbenchActivity__quals__Universal extends Factory<WorkbenchActivity> { }
  public abstract class Type_factory__o_u_c_m_ActivityLifecycleErrorHandler__quals__j_e_i_Any_j_e_i_Default extends Factory<ActivityLifecycleErrorHandler> { }
  public abstract class ExtensionProvided_factory__o_j_e_c_c_d_TextInput__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<TextInput> { }
  public abstract class Type_factory__o_j_e_i_s_b_c_RequestDispatcherProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<RequestDispatcherProvider> { }
  public abstract class ExtensionProvided_factory__e_d_HTMLLIElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<HTMLLIElement> { }
  public abstract class Type_factory__o_u_c_v_p_w_InlineNotification__quals__j_e_i_Any_j_e_i_Default extends Factory<InlineNotification> { }
  public abstract class Type_factory__o_d_r_e_c_EChartsRenderer__quals__j_e_i_Any_j_e_i_Default extends Factory<EChartsRenderer> { }
  public abstract class Type_factory__o_u_c_m_ActivityBeansCache__quals__j_e_i_Any_j_e_i_Default extends Factory<ActivityBeansCache> { }
  public abstract class ExtensionProvided_factory__o_j_e_c_c_d_OrderedList__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<OrderedList> { }
  public abstract class Type_factory__o_j_e_i_c_a_b_DisposerProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<DisposerProvider> { }
  public abstract class Type_factory__o_d_d_c_w_RendererSelector__quals__j_e_i_Any_j_e_i_Default extends Factory<RendererSelector> { }
  public abstract class Type_factory__o_d_r_c_c_c_m_D3MapDisplayerView__quals__j_e_i_Any_j_e_i_Default extends Factory<D3MapDisplayerView> { }
  public abstract class Type_factory__o_j_e_i_s_b_c_MessageBusProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<MessageBusProvider> { }
  public abstract class Type_factory__o_d_d_c_e_ClientChronometer__quals__j_e_i_Any_j_e_i_Default extends Factory<ClientChronometer> { }
  public abstract class Type_factory__o_j_e_i_s_b_c_SenderProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<SenderProvider> { }
  public abstract class Type_factory__o_j_e_i_c_a_b_ManagedInstanceProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<ManagedInstanceProvider> { }
  public abstract class Type_factory__o_u_e_l_e_c_i_LayoutDragComponentHelper__quals__j_e_i_Any_j_e_i_Default extends Factory<LayoutDragComponentHelper> { }
  public abstract class Type_factory__o_d_r_c_c_c_a_C3AreaChartView__quals__j_e_i_Any_j_e_i_Default extends Factory<C3AreaChartView> { }
  public abstract class JsType_factory__j_u_List__quals__Universal extends Factory<List> { }
  public abstract class Type_factory__o_d_r_c_c_c_m_w_D3Map__quals__j_e_i_Any_j_e_i_Default extends Factory<D3Map> { }
  public abstract class Type_factory__o_u_c_p_Promises__quals__j_e_i_Any_j_e_i_Default extends Factory<Promises> { }
  public abstract class Type_factory__o_u_c_v_p_l_ListBarWidgetImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<ListBarWidgetImpl> { }
  public abstract class Type_factory__o_j_e_u_c_l_p_HTMLElementProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<HTMLElementProvider> { }
  public abstract class Type_factory__o_d_c_s_v_ContentErrorScreenView__quals__j_e_i_Any_j_e_i_Default extends Factory<ContentErrorScreenView> { }
  public abstract class Type_factory__o_d_c_n_l_e_NavTabListDragComponent__quals__j_e_i_Any_j_e_i_Default extends Factory<NavTabListDragComponent> { }
  public abstract class Type_factory__o_j_e_u_c_l_p_Elemental2HTMLElementProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<Elemental2HTMLElementProvider> { }
  public abstract class ExtensionProvided_factory__o_g_c_u_h_Span__quals__j_e_i_Any_j_e_i_Default extends Factory<org.gwtbootstrap3.client.ui.html.Span> { }
  public abstract class Type_factory__o_d_r_e_c_j_EChartsTypeFactory__quals__j_e_i_Any_j_e_i_Default extends Factory<EChartsTypeFactory> { }
  public abstract class Type_factory__o_d_c_n_w_NavCarouselWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<NavCarouselWidget> { }
  public abstract class Type_factory__o_u_e_l_e_c_g_BootstrapLayoutGeneratorDriver__quals__j_e_i_Any_j_e_i_Default extends Factory<BootstrapLayoutGeneratorDriver> { }
  public abstract class ExtensionProvided_factory__o_j_e_c_c_d_ListItem__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<ListItem> { }
  public abstract class Type_factory__o_d_r_c_c_c_a_C3AreaChartDisplayer__quals__j_e_i_Any_j_e_i_Default extends Factory<C3AreaChartDisplayer> { }
  public abstract class ContextualProvider_factory__o_j_e_u_c_w_ListWidget__quals__Universal extends Factory<ListWidget> { }
  public abstract class Type_factory__o_u_e_w_c_c_d_n_NoItemsComponentViewImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<NoItemsComponentViewImpl> { }
  public abstract class Type_factory__o_u_e_w_c_c_d_f_LiveSearchFooterViewImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<LiveSearchFooterViewImpl> { }
  public abstract class Type_factory__o_d_d_c_GlobalDisplayerSettingsImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<GlobalDisplayerSettingsImpl> { }
  public abstract class Type_factory__o_d_r_e_c_EChartsBubbleChartDisplayer__quals__j_e_i_Any_j_e_i_Default extends Factory<EChartsBubbleChartDisplayer> { }
  public abstract class Type_factory__o_u_e_w_c_c_d_i_LiveSearchSelectorDropDownItem__quals__j_e_i_Any_j_e_i_Default extends Factory<LiveSearchSelectorDropDownItem> { }
  public abstract class Type_factory__o_d_c_s_RouterScreenActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<RouterScreenActivity> { }
  public abstract class Type_factory__o_d_s_m_RuntimeModelJSONMarshaller__quals__j_e_i_Any_j_e_i_Default extends Factory<RuntimeModelJSONMarshaller> { }
  public abstract class Type_factory__o_j_e_e_c_c_InstanceProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<InstanceProvider> { }
  public abstract class Type_factory__o_d_c_c_w_AlertBox__quals__j_e_i_Any_j_e_i_Default extends Factory<AlertBox> { }
  public abstract class Type_factory__o_u_c_v_p_n_NotificationPopupsManagerView__quals__j_e_i_Any_j_e_i_Default extends Factory<NotificationPopupsManagerView> { }
  public abstract class Type_factory__o_u_c_v_p_w_DateRangePicker__quals__j_e_i_Any_j_e_i_Default extends Factory<DateRangePicker> { }
  public abstract class Type_factory__o_d_c_RuntimeCommunication__quals__j_e_i_Any_j_e_i_Default extends Factory<RuntimeCommunication> { }
  public abstract class Type_factory__o_d_c_GlobalSettingsChangeListener__quals__j_e_i_Any_j_e_i_Default extends Factory<GlobalSettingsChangeListener> { }
  public abstract class JsType_factory__o_j_e_e_c_c_WindowEventObservers__quals__Universal extends Factory<WindowEventObservers> { }
  public abstract class Type_factory__o_d_c_s_v_RuntimeScreenView__quals__j_e_i_Any_j_e_i_Default extends Factory<RuntimeScreenView> { }
  public abstract class Type_factory__o_u_c_w_w_d_WorkbenchPickupDragController__quals__j_e_i_Any_j_e_i_Default extends Factory<WorkbenchPickupDragController> { }
  public abstract class Type_factory__o_u_c_w_PanelManagerImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<PanelManagerImpl> { }
  public abstract class Type_factory__o_u_e_w_c_c_s_SelectOptionComponent__quals__j_e_i_Any_j_e_i_Default extends Factory<SelectOptionComponent> { }
  public abstract class ContextualProvider_factory__o_j_e_i_s_b_c_Sender__quals__Universal extends Factory<Sender> { }
  public abstract class Type_factory__o_d_c_p_DashboardsListPerspective__quals__j_e_i_Any_j_e_i_Default extends Factory<DashboardsListPerspective> { }
  public abstract class Type_factory__o_d_r_c_s_SelectorLabelItem__quals__j_e_i_Any_j_e_i_Default extends Factory<SelectorLabelItem> { }
  public abstract class Type_factory__o_u_c_v_p_w_DropdownMenuItem__quals__j_e_i_Any_j_e_i_Default extends Factory<DropdownMenuItem> { }
  public abstract class Type_factory__o_d_c_s_DashboardsListScreen__quals__j_e_i_Any_j_e_i_Default extends Factory<DashboardsListScreen> { }
  public abstract class Type_factory__o_d_r_c_s_SelectorDisplayer__quals__j_e_i_Any_j_e_i_Default extends Factory<SelectorDisplayer> { }
  public abstract class Producer_factory__o_d_d_e_ExternalComponentMessageHelper__quals__j_e_i_Any_j_e_i_Default extends Factory<ExternalComponentMessageHelper> { }
  public abstract class Type_factory__o_d_c_RuntimeModelContentListener__quals__j_e_i_Any_j_e_i_Default extends Factory<RuntimeModelContentListener> { }
  public abstract class ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<Div> { }
  public abstract class JsType_factory__j_u_Collection__quals__Universal extends Factory<Collection> { }
  public abstract class ExtensionProvided_factory__o_j_e_c_c_d_TextArea__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<TextArea> { }
  public abstract class Type_factory__o_d_c_e_DefaultRuntimeErrorCallback__quals__j_e_i_Any_j_e_i_Default extends Factory<DefaultRuntimeErrorCallback> { }
  public abstract class Type_factory__o_d_d_c_e_ClientIntervalBuilderDynamicDate__quals__j_e_i_Any_j_e_i_Default extends Factory<ClientIntervalBuilderDynamicDate> { }
  public abstract class Type_factory__o_d_c_e_ExternalDataSetClientProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<ExternalDataSetClientProvider> { }
  public abstract class Type_factory__o_d_c_n_w_NavTabListWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<NavTabListWidget> { }
  public abstract class Type_factory__o_d_c_p_SamplesPerspective__quals__j_e_i_Any_j_e_i_Default extends Factory<SamplesPerspective> { }
  public abstract class Type_factory__o_j_e_d_c_DataBinderProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<DataBinderProvider> { }
  public abstract class Type_factory__o_u_c_w_p_n_p_WorkbenchPartPresenterDefault__quals__j_e_i_Any_j_e_i_Default extends Factory<WorkbenchPartPresenterDefault> { }
  public abstract class Type_factory__o_d_c_s_v_NotFoundScreenView__quals__j_e_i_Any_j_e_i_Default extends Factory<NotFoundScreenView> { }
  public abstract class JsType_factory__o_u_c_m_PlaceManager__quals__Universal extends Factory<PlaceManager> { }
  public abstract class Type_factory__o_d_c_n_w_NavDropDownWidgetView__quals__j_e_i_Any_j_e_i_Default extends Factory<NavDropDownWidgetView> { }
  public abstract class Type_factory__o_u_c_v_p_d_CompassWidgetImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<CompassWidgetImpl> { }
  public abstract class Type_factory__o_d_c_p_EmptyPerspective__quals__j_e_i_Any_j_e_i_Default extends Factory<EmptyPerspective> { }
  public abstract class Type_factory__o_u_c_v_p_p_PopupViewImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<PopupViewImpl> { }
  public abstract class Type_factory__o_u_c_v_p_w_ConfirmPopup__quals__j_e_i_Any_j_e_i_Default extends Factory<ConfirmPopup> { }
  public abstract class Type_factory__o_j_e_e_c_c_JsTypeEventObserver__quals__j_e_i_Any_j_e_i_Default extends Factory<JsTypeEventObserver> { }
  public abstract class Type_factory__o_u_e_l_e_c_i_LayoutEditorCssHelper__quals__j_e_i_Any_j_e_i_Default extends Factory<LayoutEditorCssHelper> { }
  public abstract class Type_factory__o_u_e_w_c_c_d_n_NoItemsComponent__quals__j_e_i_Any_j_e_i_Default extends Factory<NoItemsComponent> { }
  public abstract class Type_factory__o_d_d_c_w_RendererSelectorListBoxView__quals__j_e_i_Any_j_e_i_Default extends Factory<RendererSelectorListBoxView> { }
  public abstract class JsType_factory__o_u_w_m_Position__quals__Universal extends Factory<Position> { }
  public abstract class JsType_factory__o_u_w_m_PanelDefinition__quals__Universal extends Factory<PanelDefinition> { }
  public abstract class Type_factory__o_d_c_n_l_e_NavTilesDragComponent__quals__j_e_i_Any_j_e_i_Default extends Factory<NavTilesDragComponent> { }
  public abstract class Type_factory__o_u_e_p_c_RuntimePluginsEntryPoint__quals__j_e_i_Any_j_e_i_Default extends Factory<RuntimePluginsEntryPoint> { }
  public abstract class Type_factory__o_j_e_e_c_c_WindowEventObservers__quals__j_e_i_Any_j_e_i_Default extends Factory<WindowEventObservers> { }
  public abstract class Type_factory__o_d_d_c_RendererManager__quals__j_e_i_Any_j_e_i_Default extends Factory<RendererManager> { }
  public abstract class Type_factory__o_u_e_w_c_c_c_BusyIndicatorView__quals__j_e_i_Any_j_e_i_Default extends Factory<BusyIndicatorView> { }
  public abstract class Type_factory__o_d_r_c_s_SelectorSliderDisplayer__quals__j_e_i_Any_j_e_i_Default extends Factory<SelectorSliderDisplayer> { }
  public abstract class Type_factory__o_d_r_c_m_MutationObserverFactory__quals__j_e_i_Any_j_e_i_Default extends Factory<MutationObserverFactory> { }
  public abstract class JsType_factory__o_j_e_i_c_JsArray__quals__Universal extends Factory<JsArray> { }
  public abstract class JsType_factory__o_u_w_m_CompassPosition__quals__Universal extends Factory<CompassPosition> { }
  public abstract class Type_factory__o_u_c_m_ActivityManagerImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<ActivityManagerImpl> { }
  public abstract class Type_factory__o_d_r_c_c_C3Renderer__quals__j_e_i_Any_j_e_i_Default extends Factory<C3Renderer> { }
  public abstract class Type_factory__o_d_c_n_w_NavDropDownWidget__quals__j_e_i_Any_j_e_i_Default extends Factory<NavDropDownWidget> { }
  public abstract class Type_factory__o_j_e_i_c_l_i_StateChangeImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<StateChangeImpl> { }
  public abstract class Provider_factory__o_j_e_b_c_a_m_RequestDispatcher__quals__j_e_i_Any_j_e_i_Default extends Factory<RequestDispatcher> { }
  public abstract class Type_factory__o_d_r_c_m_MetricDisplayer__quals__j_e_i_Any_j_e_i_Default extends Factory<MetricDisplayer> { }
  public abstract class Type_factory__o_d_c_RuntimeClientLoader__quals__j_e_i_Any_j_e_i_Default extends Factory<RuntimeClientLoader> { }
  public abstract class Type_factory__o_d_c_n_w_NavMenuBarWidgetView__quals__j_e_i_Any_j_e_i_Default extends Factory<NavMenuBarWidgetView> { }
  public abstract class Type_factory__o_u_c_v_p_w_ErrorPopup__quals__j_e_i_Any_j_e_i_Default extends Factory<ErrorPopup> { }
  public abstract class Type_factory__o_j_e_u_c_l_s_TranslationServiceProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<TranslationServiceProvider> { }
  public abstract class Type_factory__o_d_r_c_s_SelectorDropDownItem__quals__j_e_i_Any_j_e_i_Default extends Factory<SelectorDropDownItem> { }
  public abstract class Type_factory__o_u_e_w_c_c_d_PerspectiveDropDown__quals__j_e_i_Any_j_e_i_Default extends Factory<PerspectiveDropDown> { }
  public abstract class Type_factory__o_d_c_s_v_SamplesScreenView__quals__j_e_i_Any_j_e_i_Default extends Factory<SamplesScreenView> { }
  public abstract class ExtensionProvided_factory__e_d_HTMLParagraphElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<HTMLParagraphElement> { }
  public abstract class Type_factory__o_d_r_c_s_SelectorSliderDisplayerView__quals__j_e_i_Any_j_e_i_Default extends Factory<SelectorSliderDisplayerView> { }
  public abstract class Type_factory__o_d_c_p_RuntimePerspectivePluginManager__quals__j_e_i_Any_j_e_i_Default extends Factory<RuntimePerspectivePluginManager> { }
  public abstract class Type_factory__o_u_c_w_p_u_p_UnanchoredWorkbenchPartPresenter__quals__j_e_i_Any_j_e_i_Default extends Factory<UnanchoredWorkbenchPartPresenter> { }
  public abstract class Producer_factory__o_j_e_i_c_c_SyncBeanManager__quals__j_e_i_Any_j_e_i_Default extends Factory<SyncBeanManager> { }
  public abstract class Type_factory__o_d_d_c_c_ExternalComponentDispatcher__quals__j_e_i_Any_j_e_i_Default extends Factory<ExternalComponentDispatcher> { }
  public abstract class ExtensionProvided_factory__o_j_e_c_c_d_Button__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<org.jboss.errai.common.client.dom.Button> { }
  public abstract class Type_factory__o_d_c_p_ContentErrorPerspectiveActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<ContentErrorPerspectiveActivity> { }
  public abstract class Type_factory__o_d_d_c_w_f_NumberParameterEditorView__quals__j_e_i_Any_j_e_i_Default extends Factory<NumberParameterEditorView> { }
  public abstract class Type_factory__o_u_c_w_p_n_p_WorkbenchPartView__quals__j_e_i_Any_j_e_i_Default extends Factory<WorkbenchPartView> { }
  public abstract class Type_factory__o_d_r_c_c_c_m_g_i_GWTGeoJsonLoader__quals__j_e_i_Any_j_e_i_Default extends Factory<GWTGeoJsonLoader> { }
  public abstract class Type_factory__o_d_c_s_ContentErrorScreenActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<ContentErrorScreenActivity> { }
  public abstract class Type_factory__o_d_c_e_e_ExternalDragComponent__quals__j_e_i_Any_j_e_i_Default extends Factory<ExternalDragComponent> { }
  public abstract class Provider_factory__o_j_e_u_c_l_s_TranslationService__quals__j_e_i_Any_j_e_i_Default extends Factory<TranslationService> { }
  public abstract class Type_factory__o_u_c_w_p_i_LayoutPanelView__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<LayoutPanelView> { }
  private static void addLookups_0() {
    CDIEventTypeLookup.get().addLookup("org.dashbuilder.shared.event.UpdatedGlobalSettingsEvent", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("org.uberfire.client.workbench.events.PerspectiveChange", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("org.uberfire.client.workbench.events.PerspectiveChange", "org.uberfire.workbench.events.UberFireEvent");
    CDIEventTypeLookup.get().addLookup("org.dashbuilder.dataset.events.DataSetDefRemovedEvent", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("org.dashbuilder.shared.event.UpdatedRuntimeModelEvent", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("org.dashbuilder.navigation.event.NavTreeChangedEvent", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("org.dashbuilder.shared.event.RemovedRuntimeModelEvent", "java.lang.Object");
    CDIEventTypeLookup.get().addLookup("org.dashbuilder.dataset.events.DataSetStaleEvent", "java.lang.Object");
  }

  private void registerFactories0(final Context org_jboss_errai_ioc_client_container_ApplicationScopedContext_context, final Context org_jboss_errai_ioc_client_container_DependentScopeContext_context) {
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<ScreenLayoutDragComponent>) GWT.create(Type_factory__o_d_c_n_w_ScreenLayoutDragComponent__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ExternalComponentPresenter>) GWT.create(Type_factory__o_d_d_c_w_ExternalComponentPresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<ClientDataSetMetadataJSONMarshaller>) GWT.create(Type_factory__o_d_c_m_ClientDataSetMetadataJSONMarshaller__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Caller>) GWT.create(ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ClientMessageBus>) GWT.create(Producer_factory__o_j_e_b_c_a_ClientMessageBus__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<UploadWidgetView>) GWT.create(Type_factory__o_d_c_w_v_UploadWidgetView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<LayoutEditorEntryPoint>) GWT.create(Type_factory__o_u_e_l_e_c_LayoutEditorEntryPoint__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<Workbench>) GWT.create(Type_factory__o_u_c_w_Workbench__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<IntervalBuilderDynamicLabel>) GWT.create(Type_factory__o_d_d_e_g_IntervalBuilderDynamicLabel__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<ActivityBeansInfo>) GWT.create(Type_factory__o_u_c_m_ActivityBeansInfo__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<NavMenuBarWidget>) GWT.create(Type_factory__o_d_c_n_w_NavMenuBarWidget__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<UnanchoredWorkbenchPartView>) GWT.create(Type_factory__o_u_c_w_p_u_p_UnanchoredWorkbenchPartView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Select>) GWT.create(Type_factory__o_u_c_v_p_w_Select__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<PanelDefinitionImpl>) GWT.create(Type_factory__o_u_w_m_i_PanelDefinitionImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<C3PieChartDisplayer>) GWT.create(Type_factory__o_d_r_c_c_c_p_C3PieChartDisplayer__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ErrorPopupView>) GWT.create(Type_factory__o_u_c_v_p_w_ErrorPopupView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<RouterScreenView>) GWT.create(Type_factory__o_d_c_s_v_RouterScreenView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<NavCarouselWidgetView>) GWT.create(Type_factory__o_d_c_n_w_NavCarouselWidgetView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<C3JsTypesFactory>) GWT.create(Type_factory__o_d_r_c_c_j_C3JsTypesFactory__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<MultiScreenView>) GWT.create(Type_factory__o_u_c_v_p_m_MultiScreenView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<UploadWidget>) GWT.create(Type_factory__o_d_c_w_UploadWidget__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<CSVParser>) GWT.create(Type_factory__o_d_c_e_c_CSVParser__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<WorkbenchDragAndDropManager>) GWT.create(Type_factory__o_u_c_w_w_d_WorkbenchDragAndDropManager__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<NavTilesWidget>) GWT.create(Type_factory__o_d_c_n_w_NavTilesWidget__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<ContentErrorScreen>) GWT.create(Type_factory__o_d_c_s_ContentErrorScreen__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SelectComponent>) GWT.create(Type_factory__o_u_e_w_c_c_s_SelectComponent__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ExternalComponentDisplayerView>) GWT.create(Type_factory__o_d_r_c_e_ExternalComponentDisplayerView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<PerspectiveManagerImpl>) GWT.create(Type_factory__o_u_c_m_PerspectiveManagerImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<ErrorPopupPresenter>) GWT.create(Type_factory__o_u_c_w_w_c_ErrorPopupPresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<RuntimePerspectiveGenerator>) GWT.create(Type_factory__o_d_c_p_g_RuntimePerspectiveGenerator__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<C3MeterView>) GWT.create(Type_factory__o_d_r_c_c_c_m_C3MeterView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<ExternalComponentMessageHelperProducer>) GWT.create(Type_factory__o_d_d_c_c_ExternalComponentMessageHelperProducer__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Event>) GWT.create(ContextualProvider_factory__j_e_e_Event__quals__Universal.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<MapTooltip>) GWT.create(Type_factory__o_d_r_c_c_c_m_w_MapTooltip__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<RuntimeScreen>) GWT.create(Type_factory__o_d_c_s_RuntimeScreen__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DashboardsListPerspectiveActivity>) GWT.create(Type_factory__o_d_c_p_DashboardsListPerspectiveActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<YAMLRuntimeModelClientParser>) GWT.create(Type_factory__o_d_c_p_YAMLRuntimeModelClientParser__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SampleCardView>) GWT.create(Type_factory__o_d_c_w_v_SampleCardView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<ContentErrorPerspective>) GWT.create(Type_factory__o_d_c_p_ContentErrorPerspective__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<PropertyReplacementService>) GWT.create(Type_factory__o_d_c_p_PropertyReplacementService__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<InitBallot>) GWT.create(ContextualProvider_factory__o_j_e_i_c_a_InitBallot__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SampleCard>) GWT.create(Type_factory__o_d_c_w_SampleCard__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Input>) GWT.create(ExtensionProvided_factory__o_j_e_c_c_d_Input__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Elemental2DomUtil>) GWT.create(Type_factory__o_j_e_c_c_d_e_Elemental2DomUtil__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<WorkbenchServicesProxyClientImpl>) GWT.create(Type_factory__o_u_c_w_WorkbenchServicesProxyClientImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<ClientUUIDGenerator>) GWT.create(Type_factory__o_d_d_c_u_ClientUUIDGenerator__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Button>) GWT.create(Type_factory__o_u_c_v_p_w_Button__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<TableEntryPoint>) GWT.create(Type_factory__o_u_e_w_t_c_TableEntryPoint__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<TabPanelWithDropdowns>) GWT.create(Type_factory__o_u_c_v_p_t_TabPanelWithDropdowns__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<NumberInput>) GWT.create(ExtensionProvided_factory__o_j_e_c_c_d_NumberInput__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<BatchCaller>) GWT.create(Provider_factory__o_j_e_c_c_a_BatchCaller__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<FormLabel>) GWT.create(Type_factory__o_u_c_v_p_w_FormLabel__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SelectorLabelItemView>) GWT.create(Type_factory__o_d_r_c_s_SelectorLabelItemView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<HTMLLayoutDragComponent>) GWT.create(Type_factory__o_u_e_p_c_p_e_l_e_HTMLLayoutDragComponent__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SelectOptionView>) GWT.create(Type_factory__o_u_e_w_c_c_s_SelectOptionView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<PatternFlyEntryPoint>) GWT.create(Type_factory__o_u_c_v_p_PatternFlyEntryPoint__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<BatchCallerProvider>) GWT.create(Type_factory__o_j_e_i_s_b_c_BatchCallerProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<ClientDataSetManager>) GWT.create(Type_factory__o_d_d_c_ClientDataSetManager__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Set>) GWT.create(JsType_factory__j_u_Set__quals__Universal.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<RuntimeEntryPoint>) GWT.create(Type_factory__o_d_c_RuntimeEntryPoint__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<NavTabListWidgetView>) GWT.create(Type_factory__o_d_c_n_w_NavTabListWidgetView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<HTMLDocument>) GWT.create(Producer_factory__e_d_HTMLDocument__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<DefaultBeanFactory>) GWT.create(Type_factory__o_u_c_w_DefaultBeanFactory__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SelectorDisplayerView>) GWT.create(Type_factory__o_d_r_c_s_SelectorDisplayerView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<EChartsDisplayerView>) GWT.create(Type_factory__o_d_r_e_c_EChartsDisplayerView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<NotFoundPerspective>) GWT.create(Type_factory__o_d_c_p_NotFoundPerspective__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<PartManager>) GWT.create(Type_factory__o_u_c_w_p_s_PartManager__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<ClientIntervalBuilderLocator>) GWT.create(Type_factory__o_d_d_c_e_ClientIntervalBuilderLocator__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<AccessImpl>) GWT.create(Type_factory__o_j_e_i_c_l_i_AccessImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<NavMenuBarDragComponent>) GWT.create(Type_factory__o_d_c_n_l_e_NavMenuBarDragComponent__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DashboardCard>) GWT.create(Type_factory__o_d_c_w_DashboardCard__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<C3LineChartView>) GWT.create(Type_factory__o_d_r_c_c_c_l_C3LineChartView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<RouterScreen>) GWT.create(Type_factory__o_d_c_s_RouterScreen__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DashboardsListScreenActivity>) GWT.create(Type_factory__o_d_c_s_DashboardsListScreenActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ActivityNotFoundView>) GWT.create(Type_factory__o_u_c_v_p_n_ActivityNotFoundView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<HTMLIFrameElement>) GWT.create(ExtensionProvided_factory__e_d_HTMLIFrameElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SelectorDropDownItemView>) GWT.create(Type_factory__o_d_r_c_s_SelectorDropDownItemView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<KebabMenuItem>) GWT.create(Type_factory__o_u_c_v_p_w_KebabMenuItem__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Map>) GWT.create(JsType_factory__j_u_Map__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DisplayerErrorWidget>) GWT.create(Type_factory__o_d_d_c_w_DisplayerErrorWidget__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<DisplayerClientEntryPoint>) GWT.create(Type_factory__o_d_d_c_DisplayerClientEntryPoint__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ResizeTabPanel>) GWT.create(Type_factory__o_u_c_v_p_t_ResizeTabPanel__quals__j_e_i_Any_o_u_c_v_p_t_Resize.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<FilterLabelSet>) GWT.create(Type_factory__o_d_c_c_w_FilterLabelSet__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<NotFoundPerspectiveActivity>) GWT.create(Type_factory__o_d_c_p_NotFoundPerspectiveActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<PartDefinition>) GWT.create(JsType_factory__o_u_w_m_PartDefinition__quals__Universal.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<RuntimeModelClientParserFactory>) GWT.create(Type_factory__o_d_c_p_RuntimeModelClientParserFactory__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<NotFoundScreen>) GWT.create(Type_factory__o_d_c_s_NotFoundScreen__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<TableDisplayerView>) GWT.create(Type_factory__o_d_r_c_t_TableDisplayerView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<UnorderedList>) GWT.create(ExtensionProvided_factory__o_j_e_c_c_d_UnorderedList__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<EChartsMeterChartDisplayer>) GWT.create(Type_factory__o_d_r_e_c_EChartsMeterChartDisplayer__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<RootPanel>) GWT.create(Provider_factory__c_g_g_u_c_u_RootPanel__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<ErrorResponseVerifier>) GWT.create(Type_factory__o_d_c_e_ErrorResponseVerifier__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<NavTilesWidgetView>) GWT.create(Type_factory__o_d_c_n_w_NavTilesWidgetView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SelectorDropDownDisplayer>) GWT.create(Type_factory__o_d_r_c_s_SelectorDropDownDisplayer__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<EmptyScreenView>) GWT.create(Type_factory__o_d_c_s_v_EmptyScreenView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<C3LineChartDisplayer>) GWT.create(Type_factory__o_d_r_c_c_c_l_C3LineChartDisplayer__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<NumberParameterEditor>) GWT.create(Type_factory__o_d_d_c_w_f_NumberParameterEditor__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<LiveSearchSelectorDropDownItemViewImpl>) GWT.create(Type_factory__o_u_e_w_c_c_d_i_LiveSearchSelectorDropDownItemViewImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<NavTreeDragComponent>) GWT.create(Type_factory__o_d_c_n_l_e_NavTreeDragComponent__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<JQuery>) GWT.create(Producer_factory__o_u_c_v_p_w_JQueryElementalProducer_JQuery__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SelectorLabelSetDisplayer>) GWT.create(Type_factory__o_d_r_c_s_SelectorLabelSetDisplayer__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DestructionImpl>) GWT.create(Type_factory__o_j_e_i_c_l_i_DestructionImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<HTMLHeadingElement>) GWT.create(ExtensionProvided_factory__e_d_HTMLHeadingElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named_1.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<CompassDropController>) GWT.create(Type_factory__o_u_c_w_w_d_CompassDropController__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<BootstrapLayoutGenerator>) GWT.create(Type_factory__o_u_e_l_e_c_g_BootstrapLayoutGenerator__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SelectorLabelSetDisplayerView>) GWT.create(Type_factory__o_d_r_c_s_SelectorLabelSetDisplayerView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<FilterLabel>) GWT.create(Type_factory__o_d_c_c_w_FilterLabel__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<FormGroup>) GWT.create(Type_factory__o_u_c_v_p_w_FormGroup__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SamplesCardRow>) GWT.create(Type_factory__o_d_c_w_SamplesCardRow__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<ValueFormatterRegistry>) GWT.create(Type_factory__o_d_d_c_f_ValueFormatterRegistry__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<InitBallotProvider>) GWT.create(Type_factory__o_j_e_i_c_a_b_InitBallotProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Command>) GWT.create(JsType_factory__o_u_m_Command__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DashboardsListScreenView>) GWT.create(Type_factory__o_d_c_s_v_DashboardsListScreenView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<LocaleListBox>) GWT.create(Type_factory__o_j_e_u_c_w_LocaleListBox__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<RendererSelectorTabListView>) GWT.create(Type_factory__o_d_d_c_w_RendererSelectorTabListView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SamplesPerspectiveActivity>) GWT.create(Type_factory__o_d_c_p_SamplesPerspectiveActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<LiveSearchDropDownView>) GWT.create(Type_factory__o_u_e_w_c_c_d_LiveSearchDropDownView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<TargetDivDragComponent>) GWT.create(Type_factory__o_u_e_p_c_p_e_l_e_TargetDivDragComponent__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<PlaceRequest>) GWT.create(JsType_factory__o_u_m_PlaceRequest__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DisplayerViewer>) GWT.create(Type_factory__o_d_d_c_w_DisplayerViewer__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<NavItemTileWidgetView>) GWT.create(Type_factory__o_d_c_n_w_NavItemTileWidgetView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<AlertBoxView>) GWT.create(Type_factory__o_d_c_c_w_AlertBoxView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<DefaultRenderer>) GWT.create(Type_factory__o_d_r_c_DefaultRenderer__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<EChartsXYChartDisplayer>) GWT.create(Type_factory__o_d_r_e_c_EChartsXYChartDisplayer__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<IntervalBuilderFixedDate>) GWT.create(Type_factory__o_d_d_e_g_IntervalBuilderFixedDate__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<ActivityNotFoundPresenter>) GWT.create(Type_factory__o_u_c_w_w_n_ActivityNotFoundPresenter__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<RouterPerspective>) GWT.create(Type_factory__o_d_c_p_RouterPerspective__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<HTMLDivElement>) GWT.create(ExtensionProvided_factory__e_d_HTMLDivElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<RendererSelectorRadioListView>) GWT.create(Type_factory__o_d_d_c_w_RendererSelectorRadioListView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<CommonsEntryPoint>) GWT.create(Type_factory__o_u_e_w_c_c_CommonsEntryPoint__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<NavTreeWidgetView>) GWT.create(Type_factory__o_d_c_n_w_NavTreeWidgetView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<JsTypeProvider>) GWT.create(JsType_factory__o_j_e_i_c_c_JsTypeProvider__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SelectorDropDownDisplayerView>) GWT.create(Type_factory__o_d_r_c_s_SelectorDropDownDisplayerView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<HTMLElement>) GWT.create(ContextualProvider_factory__e_d_HTMLElement__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<LiveSearchFooter>) GWT.create(Type_factory__o_u_e_w_c_c_d_f_LiveSearchFooter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<HTMLTextAreaElement>) GWT.create(ExtensionProvided_factory__e_d_HTMLTextAreaElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DateParameterEditorView>) GWT.create(Type_factory__o_d_d_c_w_f_DateParameterEditorView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<EventProvider>) GWT.create(Type_factory__o_j_e_e_c_c_EventProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SanitizedNumberInput>) GWT.create(Type_factory__o_u_c_v_p_w_SanitizedNumberInput__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Instance>) GWT.create(ContextualProvider_factory__j_e_i_Instance__quals__Universal.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<EventBus>) GWT.create(Producer_factory__c_g_w_b_e_s_EventBus__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<TableDisplayer>) GWT.create(Type_factory__o_d_r_c_t_TableDisplayer__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<JSONRuntimeModelClientParser>) GWT.create(Type_factory__o_d_c_p_JSONRuntimeModelClientParser__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<PerspectiveCoordinator>) GWT.create(Type_factory__o_d_d_c_PerspectiveCoordinator__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<CallerProvider>) GWT.create(Type_factory__o_j_e_i_c_a_b_CallerProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<EChartsPieChartDisplayer>) GWT.create(Type_factory__o_d_r_e_c_EChartsPieChartDisplayer__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<SamplesService>) GWT.create(Type_factory__o_d_c_s_SamplesService__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DropdownMenu>) GWT.create(Type_factory__o_u_c_v_p_w_DropdownMenu__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Span>) GWT.create(ExtensionProvided_factory__o_j_e_c_c_d_Span__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<HTMLInputElement>) GWT.create(ExtensionProvided_factory__e_d_HTMLInputElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SamplesScreenActivity>) GWT.create(Type_factory__o_d_c_s_SamplesScreenActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<RuntimeDataSetClientServices>) GWT.create(Type_factory__o_d_c_s_RuntimeDataSetClientServices__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DisplayerDragComponent>) GWT.create(Type_factory__o_d_c_e_DisplayerDragComponent__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<UberTabPanel>) GWT.create(Type_factory__o_u_c_v_p_t_UberTabPanel__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<C3BubbleChartDisplayer>) GWT.create(Type_factory__o_d_r_c_c_c_b_C3BubbleChartDisplayer__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Activity>) GWT.create(JsType_factory__o_u_c_m_Activity__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<HTMLButtonElement>) GWT.create(ExtensionProvided_factory__e_d_HTMLButtonElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<NavigationManagerImpl>) GWT.create(Type_factory__o_d_c_n_i_NavigationManagerImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<LocaleSelector>) GWT.create(Type_factory__o_j_e_u_c_w_LocaleSelector__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ExternalComponentView>) GWT.create(Type_factory__o_d_d_c_w_ExternalComponentView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<CreationImpl>) GWT.create(Type_factory__o_j_e_i_c_l_i_CreationImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ListComponentProvider>) GWT.create(Type_factory__o_j_e_d_c_ListComponentProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ContextDefinition>) GWT.create(JsType_factory__o_u_w_m_ContextDefinition__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<PerspectiveActivity>) GWT.create(JsType_factory__o_u_c_m_PerspectiveActivity__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<JsTypeEventObserver>) GWT.create(JsType_factory__o_j_e_e_c_c_JsTypeEventObserver__quals__Universal.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<WorkbenchLayoutImpl>) GWT.create(Type_factory__o_u_c_w_WorkbenchLayoutImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ClientDateFormatterImpl>) GWT.create(Type_factory__o_d_d_c_e_ClientDateFormatterImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<SamplesScreen>) GWT.create(Type_factory__o_d_c_s_SamplesScreen__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<C3PieChartView>) GWT.create(Type_factory__o_d_r_c_c_c_p_C3PieChartView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<MultiScreenPartWidget>) GWT.create(Type_factory__o_u_c_v_p_m_MultiScreenPartWidget__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<LifecycleListenerRegistrarImpl>) GWT.create(Type_factory__o_j_e_i_c_l_i_LifecycleListenerRegistrarImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<LiveSearchDropDown>) GWT.create(Type_factory__o_u_e_w_c_c_d_LiveSearchDropDown__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<EmptyScreenActivity>) GWT.create(Type_factory__o_d_c_s_EmptyScreenActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<org.jboss.errai.common.client.dom.HTMLElement>) GWT.create(ContextualProvider_factory__o_j_e_c_c_d_HTMLElement__quals__Universal.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<ClientSettings>) GWT.create(Type_factory__o_d_d_c_ClientSettings__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<CustomPanelDefinition>) GWT.create(JsType_factory__o_u_w_m_CustomPanelDefinition__quals__Universal.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<Elemental2Producer>) GWT.create(Type_factory__o_u_c_v_p_w_Elemental2Producer__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Disposer>) GWT.create(ContextualProvider_factory__o_j_e_i_c_a_Disposer__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ListComponent>) GWT.create(ContextualProvider_factory__o_j_e_d_c_c_ListComponent__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<org.uberfire.client.views.pfly.modal.ErrorPopupView>) GWT.create(Type_factory__o_u_c_v_p_m_ErrorPopupView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<HTMLHeadingElement>) GWT.create(ExtensionProvided_factory__e_d_HTMLHeadingElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<DisplayerLocator>) GWT.create(Type_factory__o_d_d_c_DisplayerLocator__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<EChartsResizeHandlerRegister>) GWT.create(Type_factory__o_d_r_e_c_EChartsResizeHandlerRegister__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<CountriesGeoJsonServiceImpl>) GWT.create(Type_factory__o_d_r_c_c_c_m_g_i_CountriesGeoJsonServiceImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<NotificationManager>) GWT.create(Type_factory__o_u_c_w_w_n_NotificationManager__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<org.jboss.errai.common.client.dom.Select>) GWT.create(ExtensionProvided_factory__o_j_e_c_c_d_Select__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SamplesCardRowView>) GWT.create(Type_factory__o_d_c_w_v_SamplesCardRowView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Document>) GWT.create(Producer_factory__o_j_e_c_c_d_Document__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<HTMLAnchorElement>) GWT.create(ExtensionProvided_factory__e_d_HTMLAnchorElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<AggregateFunctionManagerImpl>) GWT.create(Type_factory__o_d_d_e_f_AggregateFunctionManagerImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ManagedInstance>) GWT.create(ContextualProvider_factory__o_j_e_i_c_a_ManagedInstance__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<C3BubbleChartView>) GWT.create(Type_factory__o_d_r_c_c_c_b_C3BubbleChartView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Anchor>) GWT.create(ExtensionProvided_factory__o_j_e_c_c_d_Anchor__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<C3MeterChartDisplayer>) GWT.create(Type_factory__o_d_r_c_c_c_m_C3MeterChartDisplayer__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<CSVColumnsFunction>) GWT.create(Type_factory__o_d_c_e_c_CSVColumnsFunction__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<RuntimeScreenActivity>) GWT.create(Type_factory__o_d_c_s_RuntimeScreenActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<PlaceStatus>) GWT.create(JsType_factory__o_u_c_m_PlaceStatus__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<HTMLPreElement>) GWT.create(ExtensionProvided_factory__e_d_HTMLPreElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<C3BarChartView>) GWT.create(Type_factory__o_d_r_c_c_c_b_C3BarChartView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DashboardCardView>) GWT.create(Type_factory__o_d_c_w_v_DashboardCardView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<LayoutPanelPresenter>) GWT.create(Type_factory__o_u_c_w_p_i_LayoutPanelPresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<D3MapDisplayer>) GWT.create(Type_factory__o_d_r_c_c_c_m_D3MapDisplayer__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<RuntimePerspectiveActivity>) GWT.create(Type_factory__o_d_c_p_RuntimePerspectiveActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Modal>) GWT.create(Type_factory__o_u_c_v_p_w_Modal__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DataBinder>) GWT.create(ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<DataSetClientServicesImpl>) GWT.create(Type_factory__o_d_d_c_DataSetClientServicesImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Logger>) GWT.create(ExtensionProvided_factory__o_s_Logger__quals__Universal_1.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<NavTreeWidget>) GWT.create(Type_factory__o_d_c_n_w_NavTreeWidget__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<FilterLabelView>) GWT.create(Type_factory__o_d_c_c_w_FilterLabelView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<RootPanelProvider>) GWT.create(Type_factory__o_j_e_i_c_a_b_RootPanelProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<RouterPerspectiveActivity>) GWT.create(Type_factory__o_d_c_p_RouterPerspectiveActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<FilterLabelSetView>) GWT.create(Type_factory__o_d_c_c_w_FilterLabelSetView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Logger>) GWT.create(ExtensionProvided_factory__o_s_Logger__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<PanelDefinitionImpl>) GWT.create(JsType_factory__o_u_w_m_i_PanelDefinitionImpl__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<org.uberfire.client.views.pfly.widgets.JQueryProducer.JQuery>) GWT.create(Producer_factory__o_u_c_v_p_w_JQueryProducer_JQuery__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<ListWidgetProvider>) GWT.create(Type_factory__o_j_e_u_c_w_ListWidgetProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DateParameterEditor>) GWT.create(Type_factory__o_d_d_c_w_f_DateParameterEditor__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<PerspectiveEditorPaletteI18nImpl>) GWT.create(Type_factory__o_u_e_p_c_r_i_PerspectiveEditorPaletteI18nImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<HTMLFormElement>) GWT.create(ExtensionProvided_factory__e_d_HTMLFormElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DisplayerCoordinator>) GWT.create(Type_factory__o_d_d_c_DisplayerCoordinator__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Bs3Modal>) GWT.create(Type_factory__o_u_c_v_p_m_Bs3Modal__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<MetricView>) GWT.create(Type_factory__o_d_r_c_m_MetricView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<NavItemTileWidget>) GWT.create(Type_factory__o_d_c_n_w_NavItemTileWidget__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<EmptyScreen>) GWT.create(Type_factory__o_d_c_s_EmptyScreen__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<NotFoundScreenActivity>) GWT.create(Type_factory__o_d_c_s_NotFoundScreenActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<ExternalDataCallbackCoordinator>) GWT.create(Type_factory__o_d_c_e_ExternalDataCallbackCoordinator__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ContextDisplayMode>) GWT.create(JsType_factory__o_u_w_m_ContextDisplayMode__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<NavCarouselDragComponent>) GWT.create(Type_factory__o_d_c_n_l_e_NavCarouselDragComponent__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Label>) GWT.create(ExtensionProvided_factory__o_j_e_c_c_d_Label__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<PerspectiveDefinition>) GWT.create(JsType_factory__o_u_w_m_PerspectiveDefinition__quals__Universal.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<LayoutSelection>) GWT.create(Type_factory__o_u_c_w_LayoutSelection__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<ServerTemplateProvider>) GWT.create(Type_factory__o_j_e_u_s_ServerTemplateProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<HTMLUListElement>) GWT.create(ExtensionProvided_factory__e_d_HTMLUListElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<RuntimePerspective>) GWT.create(Type_factory__o_d_c_p_RuntimePerspective__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<EmptyPerspectiveActivity>) GWT.create(Type_factory__o_d_c_p_EmptyPerspectiveActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<PlaceManagerImpl>) GWT.create(Type_factory__o_u_c_m_PlaceManagerImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ExternalComponentDisplayer>) GWT.create(Type_factory__o_d_r_c_e_ExternalComponentDisplayer__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<C3BarChartDisplayer>) GWT.create(Type_factory__o_d_r_c_c_c_b_C3BarChartDisplayer__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<InputAutocomplete>) GWT.create(Type_factory__o_u_c_v_p_w_InputAutocomplete__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<IOCBeanManagerProvider>) GWT.create(Type_factory__o_j_e_i_c_a_b_IOCBeanManagerProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ResizeFlowPanel>) GWT.create(ExtensionProvided_factory__o_u_c_w_w_l_ResizeFlowPanel__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<KebabMenu>) GWT.create(Type_factory__o_u_c_v_p_w_KebabMenu__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SelectView>) GWT.create(Type_factory__o_u_e_w_c_c_s_SelectView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<WorkbenchActivity>) GWT.create(JsType_factory__o_u_c_m_WorkbenchActivity__quals__Universal.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<ActivityLifecycleErrorHandler>) GWT.create(Type_factory__o_u_c_m_ActivityLifecycleErrorHandler__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<TextInput>) GWT.create(ExtensionProvided_factory__o_j_e_c_c_d_TextInput__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<RequestDispatcherProvider>) GWT.create(Type_factory__o_j_e_i_s_b_c_RequestDispatcherProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<HTMLLIElement>) GWT.create(ExtensionProvided_factory__e_d_HTMLLIElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<InlineNotification>) GWT.create(Type_factory__o_u_c_v_p_w_InlineNotification__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<EChartsRenderer>) GWT.create(Type_factory__o_d_r_e_c_EChartsRenderer__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<ActivityBeansCache>) GWT.create(Type_factory__o_u_c_m_ActivityBeansCache__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<OrderedList>) GWT.create(ExtensionProvided_factory__o_j_e_c_c_d_OrderedList__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<DisposerProvider>) GWT.create(Type_factory__o_j_e_i_c_a_b_DisposerProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<RendererSelector>) GWT.create(Type_factory__o_d_d_c_w_RendererSelector__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<D3MapDisplayerView>) GWT.create(Type_factory__o_d_r_c_c_c_m_D3MapDisplayerView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<MessageBusProvider>) GWT.create(Type_factory__o_j_e_i_s_b_c_MessageBusProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ClientChronometer>) GWT.create(Type_factory__o_d_d_c_e_ClientChronometer__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<SenderProvider>) GWT.create(Type_factory__o_j_e_i_s_b_c_SenderProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ManagedInstanceProvider>) GWT.create(Type_factory__o_j_e_i_c_a_b_ManagedInstanceProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<LayoutDragComponentHelper>) GWT.create(Type_factory__o_u_e_l_e_c_i_LayoutDragComponentHelper__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<C3AreaChartView>) GWT.create(Type_factory__o_d_r_c_c_c_a_C3AreaChartView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<List>) GWT.create(JsType_factory__j_u_List__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<D3Map>) GWT.create(Type_factory__o_d_r_c_c_c_m_w_D3Map__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Promises>) GWT.create(Type_factory__o_u_c_p_Promises__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ListBarWidgetImpl>) GWT.create(Type_factory__o_u_c_v_p_l_ListBarWidgetImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<HTMLElementProvider>) GWT.create(Type_factory__o_j_e_u_c_l_p_HTMLElementProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ContentErrorScreenView>) GWT.create(Type_factory__o_d_c_s_v_ContentErrorScreenView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<NavTabListDragComponent>) GWT.create(Type_factory__o_d_c_n_l_e_NavTabListDragComponent__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Elemental2HTMLElementProvider>) GWT.create(Type_factory__o_j_e_u_c_l_p_Elemental2HTMLElementProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<org.gwtbootstrap3.client.ui.html.Span>) GWT.create(ExtensionProvided_factory__o_g_c_u_h_Span__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<EChartsTypeFactory>) GWT.create(Type_factory__o_d_r_e_c_j_EChartsTypeFactory__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<NavCarouselWidget>) GWT.create(Type_factory__o_d_c_n_w_NavCarouselWidget__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<BootstrapLayoutGeneratorDriver>) GWT.create(Type_factory__o_u_e_l_e_c_g_BootstrapLayoutGeneratorDriver__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ListItem>) GWT.create(ExtensionProvided_factory__o_j_e_c_c_d_ListItem__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<C3AreaChartDisplayer>) GWT.create(Type_factory__o_d_r_c_c_c_a_C3AreaChartDisplayer__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ListWidget>) GWT.create(ContextualProvider_factory__o_j_e_u_c_w_ListWidget__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<NoItemsComponentViewImpl>) GWT.create(Type_factory__o_u_e_w_c_c_d_n_NoItemsComponentViewImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<LiveSearchFooterViewImpl>) GWT.create(Type_factory__o_u_e_w_c_c_d_f_LiveSearchFooterViewImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<GlobalDisplayerSettingsImpl>) GWT.create(Type_factory__o_d_d_c_GlobalDisplayerSettingsImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<EChartsBubbleChartDisplayer>) GWT.create(Type_factory__o_d_r_e_c_EChartsBubbleChartDisplayer__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<LiveSearchSelectorDropDownItem>) GWT.create(Type_factory__o_u_e_w_c_c_d_i_LiveSearchSelectorDropDownItem__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<RouterScreenActivity>) GWT.create(Type_factory__o_d_c_s_RouterScreenActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<RuntimeModelJSONMarshaller>) GWT.create(Type_factory__o_d_s_m_RuntimeModelJSONMarshaller__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<InstanceProvider>) GWT.create(Type_factory__o_j_e_e_c_c_InstanceProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<AlertBox>) GWT.create(Type_factory__o_d_c_c_w_AlertBox__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<NotificationPopupsManagerView>) GWT.create(Type_factory__o_u_c_v_p_n_NotificationPopupsManagerView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DateRangePicker>) GWT.create(Type_factory__o_u_c_v_p_w_DateRangePicker__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<RuntimeCommunication>) GWT.create(Type_factory__o_d_c_RuntimeCommunication__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<GlobalSettingsChangeListener>) GWT.create(Type_factory__o_d_c_GlobalSettingsChangeListener__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<WindowEventObservers>) GWT.create(JsType_factory__o_j_e_e_c_c_WindowEventObservers__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<RuntimeScreenView>) GWT.create(Type_factory__o_d_c_s_v_RuntimeScreenView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<WorkbenchPickupDragController>) GWT.create(Type_factory__o_u_c_w_w_d_WorkbenchPickupDragController__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<PanelManagerImpl>) GWT.create(Type_factory__o_u_c_w_PanelManagerImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SelectOptionComponent>) GWT.create(Type_factory__o_u_e_w_c_c_s_SelectOptionComponent__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Sender>) GWT.create(ContextualProvider_factory__o_j_e_i_s_b_c_Sender__quals__Universal.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<DashboardsListPerspective>) GWT.create(Type_factory__o_d_c_p_DashboardsListPerspective__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SelectorLabelItem>) GWT.create(Type_factory__o_d_r_c_s_SelectorLabelItem__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DropdownMenuItem>) GWT.create(Type_factory__o_u_c_v_p_w_DropdownMenuItem__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<DashboardsListScreen>) GWT.create(Type_factory__o_d_c_s_DashboardsListScreen__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SelectorDisplayer>) GWT.create(Type_factory__o_d_r_c_s_SelectorDisplayer__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ExternalComponentMessageHelper>) GWT.create(Producer_factory__o_d_d_e_ExternalComponentMessageHelper__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<RuntimeModelContentListener>) GWT.create(Type_factory__o_d_c_RuntimeModelContentListener__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Div>) GWT.create(ExtensionProvided_factory__o_j_e_c_c_d_Div__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Collection>) GWT.create(JsType_factory__j_u_Collection__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<TextArea>) GWT.create(ExtensionProvided_factory__o_j_e_c_c_d_TextArea__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DefaultRuntimeErrorCallback>) GWT.create(Type_factory__o_d_c_e_DefaultRuntimeErrorCallback__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<ClientIntervalBuilderDynamicDate>) GWT.create(Type_factory__o_d_d_c_e_ClientIntervalBuilderDynamicDate__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<ExternalDataSetClientProvider>) GWT.create(Type_factory__o_d_c_e_ExternalDataSetClientProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<NavTabListWidget>) GWT.create(Type_factory__o_d_c_n_w_NavTabListWidget__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<SamplesPerspective>) GWT.create(Type_factory__o_d_c_p_SamplesPerspective__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<DataBinderProvider>) GWT.create(Type_factory__o_j_e_d_c_DataBinderProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<WorkbenchPartPresenterDefault>) GWT.create(Type_factory__o_u_c_w_p_n_p_WorkbenchPartPresenterDefault__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<NotFoundScreenView>) GWT.create(Type_factory__o_d_c_s_v_NotFoundScreenView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<PlaceManager>) GWT.create(JsType_factory__o_u_c_m_PlaceManager__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<NavDropDownWidgetView>) GWT.create(Type_factory__o_d_c_n_w_NavDropDownWidgetView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<CompassWidgetImpl>) GWT.create(Type_factory__o_u_c_v_p_d_CompassWidgetImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<EmptyPerspective>) GWT.create(Type_factory__o_d_c_p_EmptyPerspective__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<PopupViewImpl>) GWT.create(Type_factory__o_u_c_v_p_p_PopupViewImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ConfirmPopup>) GWT.create(Type_factory__o_u_c_v_p_w_ConfirmPopup__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<JsTypeEventObserver>) GWT.create(Type_factory__o_j_e_e_c_c_JsTypeEventObserver__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<LayoutEditorCssHelper>) GWT.create(Type_factory__o_u_e_l_e_c_i_LayoutEditorCssHelper__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<NoItemsComponent>) GWT.create(Type_factory__o_u_e_w_c_c_d_n_NoItemsComponent__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<RendererSelectorListBoxView>) GWT.create(Type_factory__o_d_d_c_w_RendererSelectorListBoxView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Position>) GWT.create(JsType_factory__o_u_w_m_Position__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<PanelDefinition>) GWT.create(JsType_factory__o_u_w_m_PanelDefinition__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<NavTilesDragComponent>) GWT.create(Type_factory__o_d_c_n_l_e_NavTilesDragComponent__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<RuntimePluginsEntryPoint>) GWT.create(Type_factory__o_u_e_p_c_RuntimePluginsEntryPoint__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<WindowEventObservers>) GWT.create(Type_factory__o_j_e_e_c_c_WindowEventObservers__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<RendererManager>) GWT.create(Type_factory__o_d_d_c_RendererManager__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<BusyIndicatorView>) GWT.create(Type_factory__o_u_e_w_c_c_c_BusyIndicatorView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SelectorSliderDisplayer>) GWT.create(Type_factory__o_d_r_c_s_SelectorSliderDisplayer__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<MutationObserverFactory>) GWT.create(Type_factory__o_d_r_c_m_MutationObserverFactory__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<JsArray>) GWT.create(JsType_factory__o_j_e_i_c_JsArray__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<CompassPosition>) GWT.create(JsType_factory__o_u_w_m_CompassPosition__quals__Universal.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<ActivityManagerImpl>) GWT.create(Type_factory__o_u_c_m_ActivityManagerImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<C3Renderer>) GWT.create(Type_factory__o_d_r_c_c_C3Renderer__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<NavDropDownWidget>) GWT.create(Type_factory__o_d_c_n_w_NavDropDownWidget__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<StateChangeImpl>) GWT.create(Type_factory__o_j_e_i_c_l_i_StateChangeImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<RequestDispatcher>) GWT.create(Provider_factory__o_j_e_b_c_a_m_RequestDispatcher__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<MetricDisplayer>) GWT.create(Type_factory__o_d_r_c_m_MetricDisplayer__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<RuntimeClientLoader>) GWT.create(Type_factory__o_d_c_RuntimeClientLoader__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<NavMenuBarWidgetView>) GWT.create(Type_factory__o_d_c_n_w_NavMenuBarWidgetView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ErrorPopup>) GWT.create(Type_factory__o_u_c_v_p_w_ErrorPopup__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<TranslationServiceProvider>) GWT.create(Type_factory__o_j_e_u_c_l_s_TranslationServiceProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SelectorDropDownItem>) GWT.create(Type_factory__o_d_r_c_s_SelectorDropDownItem__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<PerspectiveDropDown>) GWT.create(Type_factory__o_u_e_w_c_c_d_PerspectiveDropDown__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SamplesScreenView>) GWT.create(Type_factory__o_d_c_s_v_SamplesScreenView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<HTMLParagraphElement>) GWT.create(ExtensionProvided_factory__e_d_HTMLParagraphElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SelectorSliderDisplayerView>) GWT.create(Type_factory__o_d_r_c_s_SelectorSliderDisplayerView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<RuntimePerspectivePluginManager>) GWT.create(Type_factory__o_d_c_p_RuntimePerspectivePluginManager__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<UnanchoredWorkbenchPartPresenter>) GWT.create(Type_factory__o_u_c_w_p_u_p_UnanchoredWorkbenchPartPresenter__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SyncBeanManager>) GWT.create(Producer_factory__o_j_e_i_c_c_SyncBeanManager__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<ExternalComponentDispatcher>) GWT.create(Type_factory__o_d_d_c_c_ExternalComponentDispatcher__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<org.jboss.errai.common.client.dom.Button>) GWT.create(ExtensionProvided_factory__o_j_e_c_c_d_Button__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ContentErrorPerspectiveActivity>) GWT.create(Type_factory__o_d_c_p_ContentErrorPerspectiveActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<NumberParameterEditorView>) GWT.create(Type_factory__o_d_d_c_w_f_NumberParameterEditorView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<WorkbenchPartView>) GWT.create(Type_factory__o_u_c_w_p_n_p_WorkbenchPartView__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<GWTGeoJsonLoader>) GWT.create(Type_factory__o_d_r_c_c_c_m_g_i_GWTGeoJsonLoader__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ContentErrorScreenActivity>) GWT.create(Type_factory__o_d_c_s_ContentErrorScreenActivity__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ExternalDragComponent>) GWT.create(Type_factory__o_d_c_e_e_ExternalDragComponent__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<TranslationService>) GWT.create(Provider_factory__o_j_e_u_c_l_s_TranslationService__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<LayoutPanelView>) GWT.create(Type_factory__o_u_c_w_p_i_LayoutPanelView__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
  }

  private void registerFactories(final Context org_jboss_errai_ioc_client_container_ApplicationScopedContext_context, final Context org_jboss_errai_ioc_client_container_DependentScopeContext_context) {
    registerFactories0(org_jboss_errai_ioc_client_container_ApplicationScopedContext_context, org_jboss_errai_ioc_client_container_DependentScopeContext_context);
  }

  // The main IOC bootstrap method.
  public ContextManager bootstrapContainer() {
    final Context org_jboss_errai_ioc_client_container_ApplicationScopedContext_context = new ApplicationScopedContext();
    final Context org_jboss_errai_ioc_client_container_DependentScopeContext_context = new DependentScopeContext();
    logger.debug("Registering factories with contexts.");
    long start = System.currentTimeMillis();
    registerFactories(org_jboss_errai_ioc_client_container_ApplicationScopedContext_context, org_jboss_errai_ioc_client_container_DependentScopeContext_context);
    logger.debug("Registered 362 factories in {}ms", System.currentTimeMillis() - start);
    logger.debug("Adding contexts to context manager...");
    start = System.currentTimeMillis();
    contextManager.addContext(org_jboss_errai_ioc_client_container_ApplicationScopedContext_context);
    contextManager.addContext(org_jboss_errai_ioc_client_container_DependentScopeContext_context);
    logger.debug("Added 2 contexts in {}ms", System.currentTimeMillis() - start);
    logger.debug("Calling finishInit on ContextManager");
    start = System.currentTimeMillis();
    contextManager.finishInit();
    logger.debug("ContextManager#finishInit ran in {}ms", System.currentTimeMillis() - start);
    return contextManager;
  }
}