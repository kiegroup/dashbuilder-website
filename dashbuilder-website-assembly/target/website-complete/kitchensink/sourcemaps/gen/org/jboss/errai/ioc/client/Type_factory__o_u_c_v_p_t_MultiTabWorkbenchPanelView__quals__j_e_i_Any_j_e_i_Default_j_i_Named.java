package org.jboss.errai.ioc.client;

import com.google.gwt.event.logical.shared.HasAttachHandlers;
import com.google.gwt.event.shared.HasHandlers;
import com.google.gwt.user.client.EventListener;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasVisibility;
import com.google.gwt.user.client.ui.IsRenderable;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.RequiresResize;
import com.google.gwt.user.client.ui.ResizeComposite;
import com.google.gwt.user.client.ui.UIObject;
import com.google.gwt.user.client.ui.Widget;
import java.lang.annotation.Annotation;
import javax.enterprise.context.Dependent;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.uberfire.client.mvp.HasPresenter;
import org.uberfire.client.mvp.UberView;
import org.uberfire.client.views.pfly.tab.MultiTabWorkbenchPanelView;
import org.uberfire.client.views.pfly.tab.UberTabPanel;
import org.uberfire.client.workbench.BeanFactory;
import org.uberfire.client.workbench.DefaultBeanFactory;
import org.uberfire.client.workbench.LayoutSelection;
import org.uberfire.client.workbench.PanelManager;
import org.uberfire.client.workbench.PanelManagerImpl;
import org.uberfire.client.workbench.panels.DockingWorkbenchPanelView;
import org.uberfire.client.workbench.panels.WorkbenchPanelView;
import org.uberfire.client.workbench.panels.impl.AbstractDockingWorkbenchPanelView;
import org.uberfire.client.workbench.panels.impl.AbstractMultiPartWorkbenchPanelView;
import org.uberfire.client.workbench.panels.impl.AbstractWorkbenchPanelView;
import org.uberfire.client.workbench.widgets.dnd.WorkbenchDragAndDropManager;
import org.uberfire.client.workbench.widgets.listbar.ResizeFlowPanel;

public class Type_factory__o_u_c_v_p_t_MultiTabWorkbenchPanelView__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<MultiTabWorkbenchPanelView> { public Type_factory__o_u_c_v_p_t_MultiTabWorkbenchPanelView__quals__j_e_i_Any_j_e_i_Default_j_i_Named() {
    super(new FactoryHandleImpl(MultiTabWorkbenchPanelView.class, "Type_factory__o_u_c_v_p_t_MultiTabWorkbenchPanelView__quals__j_e_i_Any_j_e_i_Default_j_i_Named", Dependent.class, false, "MultiTabWorkbenchPanelView", true));
    handle.setAssignableTypes(new Class[] { MultiTabWorkbenchPanelView.class, AbstractMultiPartWorkbenchPanelView.class, AbstractDockingWorkbenchPanelView.class, AbstractWorkbenchPanelView.class, ResizeComposite.class, Composite.class, Widget.class, UIObject.class, Object.class, HasVisibility.class, EventListener.class, HasAttachHandlers.class, HasHandlers.class, IsWidget.class, IsRenderable.class, RequiresResize.class, WorkbenchPanelView.class, UberView.class, HasPresenter.class, DockingWorkbenchPanelView.class });
    handle.setQualifiers(new Annotation[] { QualifierUtil.ANY_ANNOTATION, QualifierUtil.DEFAULT_ANNOTATION, QualifierUtil.createNamed("MultiTabWorkbenchPanelView") });
  }

  public MultiTabWorkbenchPanelView createInstance(final ContextManager contextManager) {
    final UberTabPanel _uberTabPanel_0 = (UberTabPanel) contextManager.getInstance("Type_factory__o_u_c_v_p_t_UberTabPanel__quals__j_e_i_Any_j_e_i_Default");
    final MultiTabWorkbenchPanelView instance = new MultiTabWorkbenchPanelView(_uberTabPanel_0);
    registerDependentScopedReference(instance, _uberTabPanel_0);
    setIncompleteInstance(instance);
    final DefaultBeanFactory AbstractDockingWorkbenchPanelView_factory = (DefaultBeanFactory) contextManager.getInstance("Type_factory__o_u_c_w_DefaultBeanFactory__quals__j_e_i_Any_j_e_i_Default");
    AbstractDockingWorkbenchPanelView_BeanFactory_factory(instance, AbstractDockingWorkbenchPanelView_factory);
    final WorkbenchDragAndDropManager AbstractDockingWorkbenchPanelView_dndManager = (WorkbenchDragAndDropManager) contextManager.getInstance("Type_factory__o_u_c_w_w_d_WorkbenchDragAndDropManager__quals__j_e_i_Any_j_e_i_Default");
    AbstractDockingWorkbenchPanelView_WorkbenchDragAndDropManager_dndManager(instance, AbstractDockingWorkbenchPanelView_dndManager);
    final LayoutSelection AbstractWorkbenchPanelView_layoutSelection = (LayoutSelection) contextManager.getInstance("Type_factory__o_u_c_w_LayoutSelection__quals__j_e_i_Any_j_e_i_Default");
    AbstractWorkbenchPanelView_LayoutSelection_layoutSelection(instance, AbstractWorkbenchPanelView_layoutSelection);
    final PanelManagerImpl AbstractWorkbenchPanelView_panelManager = (PanelManagerImpl) contextManager.getInstance("Type_factory__o_u_c_w_PanelManagerImpl__quals__j_e_i_Any_j_e_i_Default");
    AbstractWorkbenchPanelView_PanelManager_panelManager(instance, AbstractWorkbenchPanelView_panelManager);
    final ResizeFlowPanel AbstractDockingWorkbenchPanelView_partViewContainer = (ResizeFlowPanel) contextManager.getInstance("ExtensionProvided_factory__o_u_c_w_w_l_ResizeFlowPanel__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, AbstractDockingWorkbenchPanelView_partViewContainer);
    AbstractDockingWorkbenchPanelView_ResizeFlowPanel_partViewContainer(instance, AbstractDockingWorkbenchPanelView_partViewContainer);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((MultiTabWorkbenchPanelView) instance, contextManager);
  }

  public void destroyInstanceHelper(final MultiTabWorkbenchPanelView instance, final ContextManager contextManager) {
    AbstractDockingWorkbenchPanelView_tearDownDockingPanel(instance);
  }

  public void invokePostConstructs(final MultiTabWorkbenchPanelView instance) {
    AbstractDockingWorkbenchPanelView_setupDockingPanel(instance);
    AbstractMultiPartWorkbenchPanelView_setupMultiPartPanel(instance);
  }

  native static ResizeFlowPanel AbstractDockingWorkbenchPanelView_ResizeFlowPanel_partViewContainer(AbstractDockingWorkbenchPanelView instance) /*-{
    return instance.@org.uberfire.client.workbench.panels.impl.AbstractDockingWorkbenchPanelView::partViewContainer;
  }-*/;

  native static void AbstractDockingWorkbenchPanelView_ResizeFlowPanel_partViewContainer(AbstractDockingWorkbenchPanelView instance, ResizeFlowPanel value) /*-{
    instance.@org.uberfire.client.workbench.panels.impl.AbstractDockingWorkbenchPanelView::partViewContainer = value;
  }-*/;

  native static BeanFactory AbstractDockingWorkbenchPanelView_BeanFactory_factory(AbstractDockingWorkbenchPanelView instance) /*-{
    return instance.@org.uberfire.client.workbench.panels.impl.AbstractDockingWorkbenchPanelView::factory;
  }-*/;

  native static void AbstractDockingWorkbenchPanelView_BeanFactory_factory(AbstractDockingWorkbenchPanelView instance, BeanFactory value) /*-{
    instance.@org.uberfire.client.workbench.panels.impl.AbstractDockingWorkbenchPanelView::factory = value;
  }-*/;

  native static PanelManager AbstractWorkbenchPanelView_PanelManager_panelManager(AbstractWorkbenchPanelView instance) /*-{
    return instance.@org.uberfire.client.workbench.panels.impl.AbstractWorkbenchPanelView::panelManager;
  }-*/;

  native static void AbstractWorkbenchPanelView_PanelManager_panelManager(AbstractWorkbenchPanelView instance, PanelManager value) /*-{
    instance.@org.uberfire.client.workbench.panels.impl.AbstractWorkbenchPanelView::panelManager = value;
  }-*/;

  native static LayoutSelection AbstractWorkbenchPanelView_LayoutSelection_layoutSelection(AbstractWorkbenchPanelView instance) /*-{
    return instance.@org.uberfire.client.workbench.panels.impl.AbstractWorkbenchPanelView::layoutSelection;
  }-*/;

  native static void AbstractWorkbenchPanelView_LayoutSelection_layoutSelection(AbstractWorkbenchPanelView instance, LayoutSelection value) /*-{
    instance.@org.uberfire.client.workbench.panels.impl.AbstractWorkbenchPanelView::layoutSelection = value;
  }-*/;

  native static WorkbenchDragAndDropManager AbstractDockingWorkbenchPanelView_WorkbenchDragAndDropManager_dndManager(AbstractDockingWorkbenchPanelView instance) /*-{
    return instance.@org.uberfire.client.workbench.panels.impl.AbstractDockingWorkbenchPanelView::dndManager;
  }-*/;

  native static void AbstractDockingWorkbenchPanelView_WorkbenchDragAndDropManager_dndManager(AbstractDockingWorkbenchPanelView instance, WorkbenchDragAndDropManager value) /*-{
    instance.@org.uberfire.client.workbench.panels.impl.AbstractDockingWorkbenchPanelView::dndManager = value;
  }-*/;

  public native static void AbstractMultiPartWorkbenchPanelView_setupMultiPartPanel(AbstractMultiPartWorkbenchPanelView instance) /*-{
    instance.@org.uberfire.client.workbench.panels.impl.AbstractMultiPartWorkbenchPanelView::setupMultiPartPanel()();
  }-*/;

  public native static void AbstractDockingWorkbenchPanelView_tearDownDockingPanel(AbstractDockingWorkbenchPanelView instance) /*-{
    instance.@org.uberfire.client.workbench.panels.impl.AbstractDockingWorkbenchPanelView::tearDownDockingPanel()();
  }-*/;

  public native static void AbstractDockingWorkbenchPanelView_setupDockingPanel(AbstractDockingWorkbenchPanelView instance) /*-{
    instance.@org.uberfire.client.workbench.panels.impl.AbstractDockingWorkbenchPanelView::setupDockingPanel()();
  }-*/;
}