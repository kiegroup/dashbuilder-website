package org.jboss.errai.ioc.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ClientBundle.Source;
import com.google.gwt.resources.client.TextResource;
import com.google.gwt.user.client.ui.Widget;
import elemental2.dom.HTMLDivElement;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.enterprise.context.ApplicationScoped;
import org.dashbuilder.client.RuntimeClientLoader;
import org.dashbuilder.client.navbar.AppNavBar;
import org.dashbuilder.client.navbar.DashboardListMenuBuilder;
import org.dashbuilder.client.navbar.GoToDashboardMenuBuilder;
import org.jboss.errai.common.client.api.extension.InitVotes;
import org.jboss.errai.common.client.dom.HTMLElement;
import org.jboss.errai.common.client.ui.ElementWrapperWidget;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;
import org.jboss.errai.ui.client.local.api.IsElement;
import org.jboss.errai.ui.shared.DataFieldMeta;
import org.jboss.errai.ui.shared.Template;
import org.jboss.errai.ui.shared.TemplateUtil;
import org.jboss.errai.ui.shared.api.style.StyleBindingsRegistry;
import org.uberfire.client.workbench.Header;
import org.uberfire.client.workbench.Orderable;
import org.uberfire.client.workbench.WorkbenchLayout;
import org.uberfire.client.workbench.WorkbenchLayoutImpl;
import org.uberfire.client.workbench.widgets.menu.megamenu.WorkbenchMegaMenuPresenter;
import org.uberfire.workbench.model.menu.Menus;

public class Type_factory__o_d_c_n_AppNavBar__quals__j_e_i_Any_j_e_i_Default extends Factory<AppNavBar> { public interface o_d_c_n_AppNavBarTemplateResource extends Template, ClientBundle { @Source("org/dashbuilder/client/navbar/AppNavBar.html") public TextResource getContents(); }
  private class Type_factory__o_d_c_n_AppNavBar__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends AppNavBar implements Proxy<AppNavBar> {
    private final ProxyHelper<AppNavBar> proxyHelper = new ProxyHelperImpl<AppNavBar>("Type_factory__o_d_c_n_AppNavBar__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final AppNavBar instance) {

    }

    public AppNavBar asBeanType() {
      return this;
    }

    public void setInstance(final AppNavBar instance) {
      proxyHelper.setInstance(instance);
    }

    public void clearInstance() {
      proxyHelper.clearInstance();
    }

    public void setProxyContext(final Context context) {
      proxyHelper.setProxyContext(context);
    }

    public Context getProxyContext() {
      return proxyHelper.getProxyContext();
    }

    public Object unwrap() {
      return proxyHelper.getInstance(this);
    }

    public boolean equals(Object obj) {
      obj = Factory.maybeUnwrapProxy(obj);
      return proxyHelper.getInstance(this).equals(obj);
    }

    @Override public void setup() {
      if (proxyHelper != null) {
        final AppNavBar proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.setup();
      } else {
        super.setup();
      }
    }

    @Override public void setupMenus(Menus menus) {
      if (proxyHelper != null) {
        final AppNavBar proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.setupMenus(menus);
      } else {
        super.setupMenus(menus);
      }
    }

    @Override public void setupMenus() {
      if (proxyHelper != null) {
        final AppNavBar proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.setupMenus();
      } else {
        super.setupMenus();
      }
    }

    @Override public String getId() {
      if (proxyHelper != null) {
        final AppNavBar proxiedInstance = proxyHelper.getInstance(this);
        final String retVal = proxiedInstance.getId();
        return retVal;
      } else {
        return super.getId();
      }
    }

    @Override public int getOrder() {
      if (proxyHelper != null) {
        final AppNavBar proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.getOrder();
        return retVal;
      } else {
        return super.getOrder();
      }
    }

    @Override public void setDashboardListEnabled(boolean isDashboardListEnabled) {
      if (proxyHelper != null) {
        final AppNavBar proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.setDashboardListEnabled(isDashboardListEnabled);
      } else {
        super.setDashboardListEnabled(isDashboardListEnabled);
      }
    }

    @Override public void setExternalMenuEnabled(boolean isExternalMenuEnabled) {
      if (proxyHelper != null) {
        final AppNavBar proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.setExternalMenuEnabled(isExternalMenuEnabled);
      } else {
        super.setExternalMenuEnabled(isExternalMenuEnabled);
      }
    }

    @Override public void setDisplayMainMenu(boolean display) {
      if (proxyHelper != null) {
        final AppNavBar proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.setDisplayMainMenu(display);
      } else {
        super.setDisplayMainMenu(display);
      }
    }

    @Override public void setHide(boolean hide) {
      if (proxyHelper != null) {
        final AppNavBar proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.setHide(hide);
      } else {
        super.setHide(hide);
      }
    }

    @Override public HTMLElement getElement() {
      if (proxyHelper != null) {
        final AppNavBar proxiedInstance = proxyHelper.getInstance(this);
        final HTMLElement retVal = proxiedInstance.getElement();
        return retVal;
      } else {
        throw new RuntimeException("Cannot invoke public method on proxied interface before constructor completes.");
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final AppNavBar proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_d_c_n_AppNavBar__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(AppNavBar.class, "Type_factory__o_d_c_n_AppNavBar__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { AppNavBar.class, Object.class, Header.class, IsElement.class, org.jboss.errai.common.client.api.IsElement.class, Orderable.class });
  }

  public AppNavBar createInstance(final ContextManager contextManager) {
    final AppNavBar instance = new AppNavBar();
    setIncompleteInstance(instance);
    final HTMLDivElement AppNavBar_header = (HTMLDivElement) contextManager.getInstance("ExtensionProvided_factory__e_d_HTMLDivElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, AppNavBar_header);
    AppNavBar_HTMLDivElement_header(instance, AppNavBar_header);
    final WorkbenchLayoutImpl AppNavBar_wbLayout = (WorkbenchLayoutImpl) contextManager.getInstance("Type_factory__o_u_c_w_WorkbenchLayoutImpl__quals__j_e_i_Any_j_e_i_Default");
    AppNavBar_WorkbenchLayout_wbLayout(instance, AppNavBar_wbLayout);
    final DashboardListMenuBuilder AppNavBar_dashboardsListMenu = (DashboardListMenuBuilder) contextManager.getInstance("Type_factory__o_d_c_n_DashboardListMenuBuilder__quals__j_e_i_Any_j_e_i_Default");
    AppNavBar_DashboardListMenuBuilder_dashboardsListMenu(instance, AppNavBar_dashboardsListMenu);
    final RuntimeClientLoader AppNavBar_loader = (RuntimeClientLoader) contextManager.getInstance("Type_factory__o_d_c_RuntimeClientLoader__quals__j_e_i_Any_j_e_i_Default");
    AppNavBar_RuntimeClientLoader_loader(instance, AppNavBar_loader);
    final GoToDashboardMenuBuilder AppNavBar_goToDashboardMenu = (GoToDashboardMenuBuilder) contextManager.getInstance("Type_factory__o_d_c_n_GoToDashboardMenuBuilder__quals__j_e_i_Any_j_e_i_Default");
    AppNavBar_GoToDashboardMenuBuilder_goToDashboardMenu(instance, AppNavBar_goToDashboardMenu);
    final WorkbenchMegaMenuPresenter AppNavBar_menuBarPresenter = (WorkbenchMegaMenuPresenter) contextManager.getInstance("Producer_factory__o_u_c_w_w_m_m_WorkbenchMegaMenuPresenter__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, AppNavBar_menuBarPresenter);
    AppNavBar_WorkbenchMegaMenuPresenter_menuBarPresenter(instance, AppNavBar_menuBarPresenter);
    InitVotes.registerOneTimeInitCallback(new Runnable() {
      public void run() {
        instance.setup();
      }
    });
    o_d_c_n_AppNavBarTemplateResource templateForAppNavBar = GWT.create(o_d_c_n_AppNavBarTemplateResource.class);
    Element parentElementForTemplateOfAppNavBar = TemplateUtil.getRootTemplateParentElement(templateForAppNavBar.getContents().getText(), "org/dashbuilder/client/navbar/AppNavBar.html", "");
    TemplateUtil.translateTemplate("org/dashbuilder/client/navbar/AppNavBar.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfAppNavBar));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfAppNavBar));
    final Map<String, DataFieldMeta> dataFieldMetas = new HashMap<String, DataFieldMeta>(1);
    dataFieldMetas.put("header", new DataFieldMeta());
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("org.dashbuilder.client.navbar.AppNavBar", "org/dashbuilder/client/navbar/AppNavBar.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(TemplateUtil.asElement(AppNavBar_HTMLDivElement_header(instance)));
      }
    }, dataFieldElements, dataFieldMetas, "header");
    templateFieldsMap.put("header", ElementWrapperWidget.getWidget(TemplateUtil.asElement(AppNavBar_HTMLDivElement_header(instance))));
    TemplateUtil.initTemplated(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfAppNavBar), templateFieldsMap.values());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((AppNavBar) instance, contextManager);
  }

  public void destroyInstanceHelper(final AppNavBar instance, final ContextManager contextManager) {
    TemplateUtil.cleanupTemplated(instance);
  }

  public Proxy createProxy(final Context context) {
    final Proxy<AppNavBar> proxyImpl = new Type_factory__o_d_c_n_AppNavBar__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }

  native static GoToDashboardMenuBuilder AppNavBar_GoToDashboardMenuBuilder_goToDashboardMenu(AppNavBar instance) /*-{
    return instance.@org.dashbuilder.client.navbar.AppNavBar::goToDashboardMenu;
  }-*/;

  native static void AppNavBar_GoToDashboardMenuBuilder_goToDashboardMenu(AppNavBar instance, GoToDashboardMenuBuilder value) /*-{
    instance.@org.dashbuilder.client.navbar.AppNavBar::goToDashboardMenu = value;
  }-*/;

  native static HTMLDivElement AppNavBar_HTMLDivElement_header(AppNavBar instance) /*-{
    return instance.@org.dashbuilder.client.navbar.AppNavBar::header;
  }-*/;

  native static void AppNavBar_HTMLDivElement_header(AppNavBar instance, HTMLDivElement value) /*-{
    instance.@org.dashbuilder.client.navbar.AppNavBar::header = value;
  }-*/;

  native static WorkbenchLayout AppNavBar_WorkbenchLayout_wbLayout(AppNavBar instance) /*-{
    return instance.@org.dashbuilder.client.navbar.AppNavBar::wbLayout;
  }-*/;

  native static void AppNavBar_WorkbenchLayout_wbLayout(AppNavBar instance, WorkbenchLayout value) /*-{
    instance.@org.dashbuilder.client.navbar.AppNavBar::wbLayout = value;
  }-*/;

  native static DashboardListMenuBuilder AppNavBar_DashboardListMenuBuilder_dashboardsListMenu(AppNavBar instance) /*-{
    return instance.@org.dashbuilder.client.navbar.AppNavBar::dashboardsListMenu;
  }-*/;

  native static void AppNavBar_DashboardListMenuBuilder_dashboardsListMenu(AppNavBar instance, DashboardListMenuBuilder value) /*-{
    instance.@org.dashbuilder.client.navbar.AppNavBar::dashboardsListMenu = value;
  }-*/;

  native static RuntimeClientLoader AppNavBar_RuntimeClientLoader_loader(AppNavBar instance) /*-{
    return instance.@org.dashbuilder.client.navbar.AppNavBar::loader;
  }-*/;

  native static void AppNavBar_RuntimeClientLoader_loader(AppNavBar instance, RuntimeClientLoader value) /*-{
    instance.@org.dashbuilder.client.navbar.AppNavBar::loader = value;
  }-*/;

  native static WorkbenchMegaMenuPresenter AppNavBar_WorkbenchMegaMenuPresenter_menuBarPresenter(AppNavBar instance) /*-{
    return instance.@org.dashbuilder.client.navbar.AppNavBar::menuBarPresenter;
  }-*/;

  native static void AppNavBar_WorkbenchMegaMenuPresenter_menuBarPresenter(AppNavBar instance, WorkbenchMegaMenuPresenter value) /*-{
    instance.@org.dashbuilder.client.navbar.AppNavBar::menuBarPresenter = value;
  }-*/;
}