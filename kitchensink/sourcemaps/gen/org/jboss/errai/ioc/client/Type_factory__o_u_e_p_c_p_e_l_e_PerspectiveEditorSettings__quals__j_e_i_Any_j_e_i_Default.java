package org.jboss.errai.ioc.client;

import javax.enterprise.context.ApplicationScoped;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;
import org.uberfire.ext.plugin.client.perspective.editor.layout.editor.PerspectiveEditorSettings;

public class Type_factory__o_u_e_p_c_p_e_l_e_PerspectiveEditorSettings__quals__j_e_i_Any_j_e_i_Default extends Factory<PerspectiveEditorSettings> { private class Type_factory__o_u_e_p_c_p_e_l_e_PerspectiveEditorSettings__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends PerspectiveEditorSettings implements Proxy<PerspectiveEditorSettings> {
    private final ProxyHelper<PerspectiveEditorSettings> proxyHelper = new ProxyHelperImpl<PerspectiveEditorSettings>("Type_factory__o_u_e_p_c_p_e_l_e_PerspectiveEditorSettings__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final PerspectiveEditorSettings instance) {

    }

    public PerspectiveEditorSettings asBeanType() {
      return this;
    }

    public void setInstance(final PerspectiveEditorSettings instance) {
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

    @Override public boolean isTagsEnabled() {
      if (proxyHelper != null) {
        final PerspectiveEditorSettings proxiedInstance = proxyHelper.getInstance(this);
        final boolean retVal = proxiedInstance.isTagsEnabled();
        return retVal;
      } else {
        return super.isTagsEnabled();
      }
    }

    @Override public void setTagsEnabled(boolean tagsEnabled) {
      if (proxyHelper != null) {
        final PerspectiveEditorSettings proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.setTagsEnabled(tagsEnabled);
      } else {
        super.setTagsEnabled(tagsEnabled);
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final PerspectiveEditorSettings proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_u_e_p_c_p_e_l_e_PerspectiveEditorSettings__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(PerspectiveEditorSettings.class, "Type_factory__o_u_e_p_c_p_e_l_e_PerspectiveEditorSettings__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { PerspectiveEditorSettings.class, Object.class });
  }

  public PerspectiveEditorSettings createInstance(final ContextManager contextManager) {
    final PerspectiveEditorSettings instance = new PerspectiveEditorSettings();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public Proxy createProxy(final Context context) {
    final Proxy<PerspectiveEditorSettings> proxyImpl = new Type_factory__o_u_e_p_c_p_e_l_e_PerspectiveEditorSettings__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }
}