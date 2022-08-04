package org.jboss.errai.ioc.client;

import javax.enterprise.context.ApplicationScoped;
import org.dashbuilder.common.client.backend.PathUrlFactory;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;
import org.uberfire.backend.vfs.Path;

public class Type_factory__o_d_c_c_b_PathUrlFactory__quals__j_e_i_Any_j_e_i_Default extends Factory<PathUrlFactory> { private class Type_factory__o_d_c_c_b_PathUrlFactory__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends PathUrlFactory implements Proxy<PathUrlFactory> {
    private final ProxyHelper<PathUrlFactory> proxyHelper = new ProxyHelperImpl<PathUrlFactory>("Type_factory__o_d_c_c_b_PathUrlFactory__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final PathUrlFactory instance) {

    }

    public PathUrlFactory asBeanType() {
      return this;
    }

    public void setInstance(final PathUrlFactory instance) {
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

    @Override public String getDownloadFileUrl(Path path) {
      if (proxyHelper != null) {
        final PathUrlFactory proxiedInstance = proxyHelper.getInstance(this);
        final String retVal = proxiedInstance.getDownloadFileUrl(path);
        return retVal;
      } else {
        return super.getDownloadFileUrl(path);
      }
    }

    @Override public String getDownloadFileUrl(String path) {
      if (proxyHelper != null) {
        final PathUrlFactory proxiedInstance = proxyHelper.getInstance(this);
        final String retVal = proxiedInstance.getDownloadFileUrl(path);
        return retVal;
      } else {
        return super.getDownloadFileUrl(path);
      }
    }

    @Override public String getUploadFileUrl() {
      if (proxyHelper != null) {
        final PathUrlFactory proxiedInstance = proxyHelper.getInstance(this);
        final String retVal = proxiedInstance.getUploadFileUrl();
        return retVal;
      } else {
        return super.getUploadFileUrl();
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final PathUrlFactory proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_d_c_c_b_PathUrlFactory__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(PathUrlFactory.class, "Type_factory__o_d_c_c_b_PathUrlFactory__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { PathUrlFactory.class, Object.class });
  }

  public PathUrlFactory createInstance(final ContextManager contextManager) {
    final PathUrlFactory instance = new PathUrlFactory();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public Proxy createProxy(final Context context) {
    final Proxy<PathUrlFactory> proxyImpl = new Type_factory__o_d_c_c_b_PathUrlFactory__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }
}