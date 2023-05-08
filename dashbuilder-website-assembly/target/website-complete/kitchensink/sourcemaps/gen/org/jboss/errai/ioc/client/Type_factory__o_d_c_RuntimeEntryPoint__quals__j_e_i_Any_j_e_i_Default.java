package org.jboss.errai.ioc.client;

import com.google.gwt.core.client.GWT;
import java.util.function.Consumer;
import javax.enterprise.context.ApplicationScoped;
import org.dashbuilder.client.RuntimeClientLoader;
import org.dashbuilder.client.RuntimeCommunication;
import org.dashbuilder.client.RuntimeEntryPoint;
import org.dashbuilder.client.error.DefaultRuntimeErrorCallback;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.ErraiUncaughtExceptionHandler;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;
import org.uberfire.client.mvp.PlaceManager;
import org.uberfire.client.mvp.PlaceManagerImpl;
import org.uberfire.client.workbench.Workbench;

public class Type_factory__o_d_c_RuntimeEntryPoint__quals__j_e_i_Any_j_e_i_Default extends Factory<RuntimeEntryPoint> { private class Type_factory__o_d_c_RuntimeEntryPoint__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends RuntimeEntryPoint implements Proxy<RuntimeEntryPoint> {
    private final ProxyHelper<RuntimeEntryPoint> proxyHelper = new ProxyHelperImpl<RuntimeEntryPoint>("Type_factory__o_d_c_RuntimeEntryPoint__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final RuntimeEntryPoint instance) {

    }

    public RuntimeEntryPoint asBeanType() {
      return this;
    }

    public void setInstance(final RuntimeEntryPoint instance) {
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

    @Override public void startup() {
      if (proxyHelper != null) {
        final RuntimeEntryPoint proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.startup();
      } else {
        super.startup();
      }
    }

    @Override public void notFound() {
      if (proxyHelper != null) {
        final RuntimeEntryPoint proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.notFound();
      } else {
        super.notFound();
      }
    }

    @Override public void targetPerspective() {
      if (proxyHelper != null) {
        final RuntimeEntryPoint proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.targetPerspective();
      } else {
        super.targetPerspective();
      }
    }

    @Override public void error(Object e, Throwable t) {
      if (proxyHelper != null) {
        final RuntimeEntryPoint proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.error(e, t);
      } else {
        super.error(e, t);
      }
    }

    @Override public void generalErrorHandling(Throwable t) {
      if (proxyHelper != null) {
        final RuntimeEntryPoint proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.generalErrorHandling(t);
      } else {
        super.generalErrorHandling(t);
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final RuntimeEntryPoint proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_d_c_RuntimeEntryPoint__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(RuntimeEntryPoint.class, "Type_factory__o_d_c_RuntimeEntryPoint__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, true, null, true));
    handle.setAssignableTypes(new Class[] { RuntimeEntryPoint.class, Object.class });
  }

  public void init(final Context context) {
    final Consumer<Throwable> generalErrorHandlingHandler = new Consumer<Throwable>() {
      public void accept(Throwable t) {
        final RuntimeEntryPoint instance = Factory.maybeUnwrapProxy((RuntimeEntryPoint) context.getInstance("Type_factory__o_d_c_RuntimeEntryPoint__quals__j_e_i_Any_j_e_i_Default"));
        instance.generalErrorHandling(t);
      }
    };
    final Runnable generalErrorHandlingHandlerCleanup = ((ErraiUncaughtExceptionHandler) GWT.getUncaughtExceptionHandler()).addHandler(generalErrorHandlingHandler);
  }

  public RuntimeEntryPoint createInstance(final ContextManager contextManager) {
    final RuntimeEntryPoint instance = new RuntimeEntryPoint();
    setIncompleteInstance(instance);
    final RuntimeClientLoader RuntimeEntryPoint_modelLoader = (RuntimeClientLoader) contextManager.getInstance("Type_factory__o_d_c_RuntimeClientLoader__quals__j_e_i_Any_j_e_i_Default");
    RuntimeEntryPoint_RuntimeClientLoader_modelLoader(instance, RuntimeEntryPoint_modelLoader);
    final RuntimeCommunication RuntimeEntryPoint_runtimeCommunication = (RuntimeCommunication) contextManager.getInstance("Type_factory__o_d_c_RuntimeCommunication__quals__j_e_i_Any_j_e_i_Default");
    RuntimeEntryPoint_RuntimeCommunication_runtimeCommunication(instance, RuntimeEntryPoint_runtimeCommunication);
    final Workbench RuntimeEntryPoint_workbench = (Workbench) contextManager.getInstance("Type_factory__o_u_c_w_Workbench__quals__j_e_i_Any_j_e_i_Default");
    RuntimeEntryPoint_Workbench_workbench(instance, RuntimeEntryPoint_workbench);
    final PlaceManagerImpl RuntimeEntryPoint_placeManager = (PlaceManagerImpl) contextManager.getInstance("Type_factory__o_u_c_m_PlaceManagerImpl__quals__j_e_i_Any_j_e_i_Default");
    RuntimeEntryPoint_PlaceManager_placeManager(instance, RuntimeEntryPoint_placeManager);
    final DefaultRuntimeErrorCallback RuntimeEntryPoint_defaultRuntimeErrorCallback = (DefaultRuntimeErrorCallback) contextManager.getInstance("Type_factory__o_d_c_e_DefaultRuntimeErrorCallback__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, RuntimeEntryPoint_defaultRuntimeErrorCallback);
    RuntimeEntryPoint_DefaultRuntimeErrorCallback_defaultRuntimeErrorCallback(instance, RuntimeEntryPoint_defaultRuntimeErrorCallback);
    setIncompleteInstance(null);
    return instance;
  }

  public void invokePostConstructs(final RuntimeEntryPoint instance) {
    instance.startup();
  }

  public Proxy createProxy(final Context context) {
    final Proxy<RuntimeEntryPoint> proxyImpl = new Type_factory__o_d_c_RuntimeEntryPoint__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }

  native static Workbench RuntimeEntryPoint_Workbench_workbench(RuntimeEntryPoint instance) /*-{
    return instance.@org.dashbuilder.client.RuntimeEntryPoint::workbench;
  }-*/;

  native static void RuntimeEntryPoint_Workbench_workbench(RuntimeEntryPoint instance, Workbench value) /*-{
    instance.@org.dashbuilder.client.RuntimeEntryPoint::workbench = value;
  }-*/;

  native static PlaceManager RuntimeEntryPoint_PlaceManager_placeManager(RuntimeEntryPoint instance) /*-{
    return instance.@org.dashbuilder.client.RuntimeEntryPoint::placeManager;
  }-*/;

  native static void RuntimeEntryPoint_PlaceManager_placeManager(RuntimeEntryPoint instance, PlaceManager value) /*-{
    instance.@org.dashbuilder.client.RuntimeEntryPoint::placeManager = value;
  }-*/;

  native static DefaultRuntimeErrorCallback RuntimeEntryPoint_DefaultRuntimeErrorCallback_defaultRuntimeErrorCallback(RuntimeEntryPoint instance) /*-{
    return instance.@org.dashbuilder.client.RuntimeEntryPoint::defaultRuntimeErrorCallback;
  }-*/;

  native static void RuntimeEntryPoint_DefaultRuntimeErrorCallback_defaultRuntimeErrorCallback(RuntimeEntryPoint instance, DefaultRuntimeErrorCallback value) /*-{
    instance.@org.dashbuilder.client.RuntimeEntryPoint::defaultRuntimeErrorCallback = value;
  }-*/;

  native static RuntimeCommunication RuntimeEntryPoint_RuntimeCommunication_runtimeCommunication(RuntimeEntryPoint instance) /*-{
    return instance.@org.dashbuilder.client.RuntimeEntryPoint::runtimeCommunication;
  }-*/;

  native static void RuntimeEntryPoint_RuntimeCommunication_runtimeCommunication(RuntimeEntryPoint instance, RuntimeCommunication value) /*-{
    instance.@org.dashbuilder.client.RuntimeEntryPoint::runtimeCommunication = value;
  }-*/;

  native static RuntimeClientLoader RuntimeEntryPoint_RuntimeClientLoader_modelLoader(RuntimeEntryPoint instance) /*-{
    return instance.@org.dashbuilder.client.RuntimeEntryPoint::modelLoader;
  }-*/;

  native static void RuntimeEntryPoint_RuntimeClientLoader_modelLoader(RuntimeEntryPoint instance, RuntimeClientLoader value) /*-{
    instance.@org.dashbuilder.client.RuntimeEntryPoint::modelLoader = value;
  }-*/;
}