package org.jboss.errai.ioc.client;

import java.lang.annotation.Annotation;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Event;
import org.dashbuilder.client.RuntimeClientLoader;
import org.dashbuilder.client.RuntimeModelBackendAppLoader;
import org.dashbuilder.client.RuntimeModelContentListener;
import org.dashbuilder.client.external.ExternalDataSetClientProvider;
import org.dashbuilder.client.navigation.NavigationManager;
import org.dashbuilder.client.navigation.impl.NavigationManagerImpl;
import org.dashbuilder.client.parser.RuntimeModelClientParserFactory;
import org.dashbuilder.client.perspective.generator.RuntimePerspectiveGenerator;
import org.dashbuilder.client.plugins.RuntimePerspectivePluginManager;
import org.dashbuilder.client.screens.RouterScreen;
import org.dashbuilder.shared.event.UpdatedRuntimeModelEvent;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;
import org.uberfire.ext.widgets.common.client.common.BusyIndicatorView;
import org.uberfire.mvp.Command;

public class Type_factory__o_d_c_RuntimeClientLoader__quals__j_e_i_Any_j_e_i_Default extends Factory<RuntimeClientLoader> { private class Type_factory__o_d_c_RuntimeClientLoader__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends RuntimeClientLoader implements Proxy<RuntimeClientLoader> {
    private final ProxyHelper<RuntimeClientLoader> proxyHelper = new ProxyHelperImpl<RuntimeClientLoader>("Type_factory__o_d_c_RuntimeClientLoader__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final RuntimeClientLoader instance) {

    }

    public RuntimeClientLoader asBeanType() {
      return this;
    }

    public void setInstance(final RuntimeClientLoader instance) {
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

    @Override public void load(Consumer responseConsumer, BiConsumer error) {
      if (proxyHelper != null) {
        final RuntimeClientLoader proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.load(responseConsumer, error);
      } else {
        super.load(responseConsumer, error);
      }
    }

    @Override public void loadModel(String importId, Consumer modelLoaded, Command emptyModel, BiConsumer error) {
      if (proxyHelper != null) {
        final RuntimeClientLoader proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.loadModel(importId, modelLoaded, emptyModel, error);
      } else {
        super.loadModel(importId, modelLoaded, emptyModel, error);
      }
    }

    @Override public void loadModel(Consumer modelLoaded, Command emptyModel, BiConsumer error) {
      if (proxyHelper != null) {
        final RuntimeClientLoader proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.loadModel(modelLoaded, emptyModel, error);
      } else {
        super.loadModel(modelLoaded, emptyModel, error);
      }
    }

    @Override public String getImportId() {
      if (proxyHelper != null) {
        final RuntimeClientLoader proxiedInstance = proxyHelper.getInstance(this);
        final String retVal = proxiedInstance.getImportId();
        return retVal;
      } else {
        return super.getImportId();
      }
    }

    @Override public boolean isEditor() {
      if (proxyHelper != null) {
        final RuntimeClientLoader proxiedInstance = proxyHelper.getInstance(this);
        final boolean retVal = proxiedInstance.isEditor();
        return retVal;
      } else {
        return super.isEditor();
      }
    }

    @Override public boolean isClient() {
      if (proxyHelper != null) {
        final RuntimeClientLoader proxiedInstance = proxyHelper.getInstance(this);
        final boolean retVal = proxiedInstance.isClient();
        return retVal;
      } else {
        return super.isClient();
      }
    }

    @Override public boolean hasBackend() {
      if (proxyHelper != null) {
        final RuntimeClientLoader proxiedInstance = proxyHelper.getInstance(this);
        final boolean retVal = proxiedInstance.hasBackend();
        return retVal;
      } else {
        return super.hasBackend();
      }
    }

    @Override public boolean isHideNavBar() {
      if (proxyHelper != null) {
        final RuntimeClientLoader proxiedInstance = proxyHelper.getInstance(this);
        final boolean retVal = proxiedInstance.isHideNavBar();
        return retVal;
      } else {
        return super.isHideNavBar();
      }
    }

    @Override public void loadClientModel(String content) {
      if (proxyHelper != null) {
        final RuntimeClientLoader proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.loadClientModel(content);
      } else {
        super.loadClientModel(content);
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final RuntimeClientLoader proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_d_c_RuntimeClientLoader__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(RuntimeClientLoader.class, "Type_factory__o_d_c_RuntimeClientLoader__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { RuntimeClientLoader.class, Object.class });
  }

  public RuntimeClientLoader createInstance(final ContextManager contextManager) {
    final RuntimeModelBackendAppLoader _runtimeModelResourceClient_0 = (RuntimeModelBackendAppLoader) contextManager.getInstance("Type_factory__o_d_c_RuntimeModelBackendAppLoader__quals__j_e_i_Any_j_e_i_Default");
    final RuntimePerspectiveGenerator _perspectiveEditorGenerator_1 = (RuntimePerspectiveGenerator) contextManager.getInstance("Type_factory__o_d_c_p_g_RuntimePerspectiveGenerator__quals__j_e_i_Any_j_e_i_Default");
    final RuntimePerspectivePluginManager _runtimePerspectivePluginManager_2 = (RuntimePerspectivePluginManager) contextManager.getInstance("Type_factory__o_d_c_p_RuntimePerspectivePluginManager__quals__j_e_i_Any_j_e_i_Default");
    final RouterScreen _router_9 = (RouterScreen) contextManager.getInstance("Type_factory__o_d_c_s_RouterScreen__quals__j_e_i_Any_j_e_i_Default");
    final NavigationManager _navigationManager_3 = (NavigationManagerImpl) contextManager.getInstance("Type_factory__o_d_c_n_i_NavigationManagerImpl__quals__j_e_i_Any_j_e_i_Default");
    final Event<UpdatedRuntimeModelEvent> _updatedRuntimeModelEvent_8 = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { UpdatedRuntimeModelEvent.class }, new Annotation[] { });
    final RuntimeModelClientParserFactory _parserFactory_6 = (RuntimeModelClientParserFactory) contextManager.getInstance("Type_factory__o_d_c_p_RuntimeModelClientParserFactory__quals__j_e_i_Any_j_e_i_Default");
    final RuntimeModelContentListener _contentListener_7 = (RuntimeModelContentListener) contextManager.getInstance("Type_factory__o_d_c_RuntimeModelContentListener__quals__j_e_i_Any_j_e_i_Default");
    final BusyIndicatorView _loading_4 = (BusyIndicatorView) contextManager.getInstance("Type_factory__o_u_e_w_c_c_c_BusyIndicatorView__quals__j_e_i_Any_j_e_i_Default");
    final ExternalDataSetClientProvider _externalDataSetRegister_5 = (ExternalDataSetClientProvider) contextManager.getInstance("Type_factory__o_d_c_e_ExternalDataSetClientProvider__quals__j_e_i_Any_j_e_i_Default");
    final RuntimeClientLoader instance = new RuntimeClientLoader(_runtimeModelResourceClient_0, _perspectiveEditorGenerator_1, _runtimePerspectivePluginManager_2, _navigationManager_3, _loading_4, _externalDataSetRegister_5, _parserFactory_6, _contentListener_7, _updatedRuntimeModelEvent_8, _router_9);
    registerDependentScopedReference(instance, _updatedRuntimeModelEvent_8);
    registerDependentScopedReference(instance, _loading_4);
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void invokePostConstructs(final RuntimeClientLoader instance) {
    RuntimeClientLoader_loadSetup(instance);
  }

  public Proxy createProxy(final Context context) {
    final Proxy<RuntimeClientLoader> proxyImpl = new Type_factory__o_d_c_RuntimeClientLoader__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }

  public native static void RuntimeClientLoader_loadSetup(RuntimeClientLoader instance) /*-{
    instance.@org.dashbuilder.client.RuntimeClientLoader::loadSetup()();
  }-*/;
}