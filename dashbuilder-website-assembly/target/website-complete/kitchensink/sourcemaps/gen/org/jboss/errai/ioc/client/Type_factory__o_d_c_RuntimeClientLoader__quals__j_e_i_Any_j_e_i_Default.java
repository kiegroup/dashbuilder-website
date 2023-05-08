package org.jboss.errai.ioc.client;

import java.lang.annotation.Annotation;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Event;
import org.dashbuilder.client.RuntimeClientLoader;
import org.dashbuilder.client.RuntimeModelContentListener;
import org.dashbuilder.client.external.ExternalDataSetClientProvider;
import org.dashbuilder.client.navigation.NavigationManager;
import org.dashbuilder.client.navigation.impl.NavigationManagerImpl;
import org.dashbuilder.client.parser.RuntimeModelClientParserFactory;
import org.dashbuilder.client.perspective.generator.RuntimePerspectiveGenerator;
import org.dashbuilder.client.plugins.RuntimePerspectivePluginManager;
import org.dashbuilder.client.screens.RouterScreen;
import org.dashbuilder.client.services.SamplesService;
import org.dashbuilder.dataset.events.DataSetDefRemovedEvent;
import org.dashbuilder.shared.event.UpdatedGlobalSettingsEvent;
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

    @Override public boolean isSamplesDefaultHome() {
      if (proxyHelper != null) {
        final RuntimeClientLoader proxiedInstance = proxyHelper.getInstance(this);
        final boolean retVal = proxiedInstance.isSamplesDefaultHome();
        return retVal;
      } else {
        return super.isSamplesDefaultHome();
      }
    }

    @Override public boolean hasSamples() {
      if (proxyHelper != null) {
        final RuntimeClientLoader proxiedInstance = proxyHelper.getInstance(this);
        final boolean retVal = proxiedInstance.hasSamples();
        return retVal;
      } else {
        return super.hasSamples();
      }
    }

    @Override public boolean loadContentAndRoute(String content) {
      if (proxyHelper != null) {
        final RuntimeClientLoader proxiedInstance = proxyHelper.getInstance(this);
        final boolean retVal = proxiedInstance.loadContentAndRoute(content);
        return retVal;
      } else {
        return super.loadContentAndRoute(content);
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
    final RuntimeModelContentListener _contentListener_7 = (RuntimeModelContentListener) contextManager.getInstance("Type_factory__o_d_c_RuntimeModelContentListener__quals__j_e_i_Any_j_e_i_Default");
    final Event<DataSetDefRemovedEvent> _dataSetDefRemovedEvent_9 = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { DataSetDefRemovedEvent.class }, new Annotation[] { });
    final Event<UpdatedGlobalSettingsEvent> _updatedGlobalSettingsEvent_10 = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { UpdatedGlobalSettingsEvent.class }, new Annotation[] { });
    final RuntimePerspectiveGenerator _perspectiveEditorGenerator_0 = (RuntimePerspectiveGenerator) contextManager.getInstance("Type_factory__o_d_c_p_g_RuntimePerspectiveGenerator__quals__j_e_i_Any_j_e_i_Default");
    final RouterScreen _router_11 = (RouterScreen) contextManager.getInstance("Type_factory__o_d_c_s_RouterScreen__quals__j_e_i_Any_j_e_i_Default");
    final ExternalDataSetClientProvider _externalDataSetRegister_4 = (ExternalDataSetClientProvider) contextManager.getInstance("Type_factory__o_d_c_e_ExternalDataSetClientProvider__quals__j_e_i_Any_j_e_i_Default");
    final RuntimeModelClientParserFactory _parserFactory_6 = (RuntimeModelClientParserFactory) contextManager.getInstance("Type_factory__o_d_c_p_RuntimeModelClientParserFactory__quals__j_e_i_Any_j_e_i_Default");
    final NavigationManager _navigationManager_2 = (NavigationManagerImpl) contextManager.getInstance("Type_factory__o_d_c_n_i_NavigationManagerImpl__quals__j_e_i_Any_j_e_i_Default");
    final BusyIndicatorView _loading_3 = (BusyIndicatorView) contextManager.getInstance("Type_factory__o_u_e_w_c_c_c_BusyIndicatorView__quals__j_e_i_Any_j_e_i_Default");
    final Event<UpdatedRuntimeModelEvent> _updatedRuntimeModelEvent_8 = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { UpdatedRuntimeModelEvent.class }, new Annotation[] { });
    final RuntimePerspectivePluginManager _runtimePerspectivePluginManager_1 = (RuntimePerspectivePluginManager) contextManager.getInstance("Type_factory__o_d_c_p_RuntimePerspectivePluginManager__quals__j_e_i_Any_j_e_i_Default");
    final SamplesService _samplesService_5 = (SamplesService) contextManager.getInstance("Type_factory__o_d_c_s_SamplesService__quals__j_e_i_Any_j_e_i_Default");
    final RuntimeClientLoader instance = new RuntimeClientLoader(_perspectiveEditorGenerator_0, _runtimePerspectivePluginManager_1, _navigationManager_2, _loading_3, _externalDataSetRegister_4, _samplesService_5, _parserFactory_6, _contentListener_7, _updatedRuntimeModelEvent_8, _dataSetDefRemovedEvent_9, _updatedGlobalSettingsEvent_10, _router_11);
    registerDependentScopedReference(instance, _dataSetDefRemovedEvent_9);
    registerDependentScopedReference(instance, _updatedGlobalSettingsEvent_10);
    registerDependentScopedReference(instance, _loading_3);
    registerDependentScopedReference(instance, _updatedRuntimeModelEvent_8);
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