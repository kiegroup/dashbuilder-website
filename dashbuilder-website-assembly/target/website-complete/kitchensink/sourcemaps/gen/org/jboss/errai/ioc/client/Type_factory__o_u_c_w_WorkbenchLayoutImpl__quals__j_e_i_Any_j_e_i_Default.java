package org.jboss.errai.ioc.client;

import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import java.util.Set;
import javax.enterprise.context.ApplicationScoped;
import org.jboss.errai.enterprise.client.cdi.AbstractCDIEventCallback;
import org.jboss.errai.enterprise.client.cdi.api.CDI;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;
import org.jboss.errai.ioc.client.container.SyncBeanManager;
import org.uberfire.client.workbench.WorkbenchLayout;
import org.uberfire.client.workbench.WorkbenchLayoutImpl;
import org.uberfire.client.workbench.events.WorkbenchProfileCssClass;
import org.uberfire.mvp.Command;

public class Type_factory__o_u_c_w_WorkbenchLayoutImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<WorkbenchLayoutImpl> { private class Type_factory__o_u_c_w_WorkbenchLayoutImpl__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends WorkbenchLayoutImpl implements Proxy<WorkbenchLayoutImpl> {
    private final ProxyHelper<WorkbenchLayoutImpl> proxyHelper = new ProxyHelperImpl<WorkbenchLayoutImpl>("Type_factory__o_u_c_w_WorkbenchLayoutImpl__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final WorkbenchLayoutImpl instance) {

    }

    public WorkbenchLayoutImpl asBeanType() {
      return this;
    }

    public void setInstance(final WorkbenchLayoutImpl instance) {
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

    @Override public SimplePanel getRoot() {
      if (proxyHelper != null) {
        final WorkbenchLayoutImpl proxiedInstance = proxyHelper.getInstance(this);
        final SimplePanel retVal = proxiedInstance.getRoot();
        return retVal;
      } else {
        return super.getRoot();
      }
    }

    @Override public HasWidgets getPerspectiveContainer() {
      if (proxyHelper != null) {
        final WorkbenchLayoutImpl proxiedInstance = proxyHelper.getInstance(this);
        final HasWidgets retVal = proxiedInstance.getPerspectiveContainer();
        return retVal;
      } else {
        return super.getPerspectiveContainer();
      }
    }

    @Override public void onBootstrap() {
      if (proxyHelper != null) {
        final WorkbenchLayoutImpl proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.onBootstrap();
      } else {
        super.onBootstrap();
      }
    }

    @Override public void onResize() {
      if (proxyHelper != null) {
        final WorkbenchLayoutImpl proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.onResize();
      } else {
        super.onResize();
      }
    }

    @Override public void resizeTo(int width, int height) {
      if (proxyHelper != null) {
        final WorkbenchLayoutImpl proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.resizeTo(width, height);
      } else {
        super.resizeTo(width, height);
      }
    }

    @Override public void maximize(Widget w) {
      if (proxyHelper != null) {
        final WorkbenchLayoutImpl proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.maximize(w);
      } else {
        super.maximize(w);
      }
    }

    @Override public void maximize(Widget w, Command callback) {
      if (proxyHelper != null) {
        final WorkbenchLayoutImpl proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.maximize(w, callback);
      } else {
        super.maximize(w, callback);
      }
    }

    @Override public void unmaximize(Widget w) {
      if (proxyHelper != null) {
        final WorkbenchLayoutImpl proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.unmaximize(w);
      } else {
        super.unmaximize(w);
      }
    }

    @Override public void unmaximize(Widget w, Command callback) {
      if (proxyHelper != null) {
        final WorkbenchLayoutImpl proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.unmaximize(w, callback);
      } else {
        super.unmaximize(w, callback);
      }
    }

    @Override public void setMarginWidgets(boolean isStandaloneMode, Set headersToKeep) {
      if (proxyHelper != null) {
        final WorkbenchLayoutImpl proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.setMarginWidgets(isStandaloneMode, headersToKeep);
      } else {
        super.setMarginWidgets(isStandaloneMode, headersToKeep);
      }
    }

    @Override public void addWorkbenchProfileCssClass(WorkbenchProfileCssClass workbenchProfileCssClass) {
      if (proxyHelper != null) {
        final WorkbenchLayoutImpl proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.addWorkbenchProfileCssClass(workbenchProfileCssClass);
      } else {
        super.addWorkbenchProfileCssClass(workbenchProfileCssClass);
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final WorkbenchLayoutImpl proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_u_c_w_WorkbenchLayoutImpl__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(WorkbenchLayoutImpl.class, "Type_factory__o_u_c_w_WorkbenchLayoutImpl__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { WorkbenchLayoutImpl.class, Object.class, WorkbenchLayout.class });
  }

  public void init(final Context context) {
    CDI.subscribeLocal("org.uberfire.client.workbench.events.WorkbenchProfileCssClass", new AbstractCDIEventCallback<WorkbenchProfileCssClass>() {
      public void fireEvent(final WorkbenchProfileCssClass event) {
        final WorkbenchLayoutImpl instance = Factory.maybeUnwrapProxy((WorkbenchLayoutImpl) context.getInstance("Type_factory__o_u_c_w_WorkbenchLayoutImpl__quals__j_e_i_Any_j_e_i_Default"));
        instance.addWorkbenchProfileCssClass(event);
      }
      public String toString() {
        return "Observer: org.uberfire.client.workbench.events.WorkbenchProfileCssClass []";
      }
    });
  }

  public WorkbenchLayoutImpl createInstance(final ContextManager contextManager) {
    final SyncBeanManager _iocManager_0 = (SyncBeanManager) contextManager.getInstance("Producer_factory__o_j_e_i_c_c_SyncBeanManager__quals__j_e_i_Any_j_e_i_Default");
    final WorkbenchLayoutImpl instance = new WorkbenchLayoutImpl(_iocManager_0);
    registerDependentScopedReference(instance, _iocManager_0);
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void invokePostConstructs(final WorkbenchLayoutImpl instance) {
    WorkbenchLayoutImpl_init(instance);
  }

  public Proxy createProxy(final Context context) {
    final Proxy<WorkbenchLayoutImpl> proxyImpl = new Type_factory__o_u_c_w_WorkbenchLayoutImpl__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }

  public native static void WorkbenchLayoutImpl_init(WorkbenchLayoutImpl instance) /*-{
    instance.@org.uberfire.client.workbench.WorkbenchLayoutImpl::init()();
  }-*/;
}