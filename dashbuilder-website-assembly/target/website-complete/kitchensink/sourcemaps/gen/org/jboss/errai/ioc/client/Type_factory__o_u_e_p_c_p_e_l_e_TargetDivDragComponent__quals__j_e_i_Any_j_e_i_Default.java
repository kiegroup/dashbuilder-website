package org.jboss.errai.ioc.client;

import com.google.gwt.user.client.ui.IsWidget;
import javax.enterprise.context.ApplicationScoped;
import org.gwtbootstrap3.client.ui.Modal;
import org.jboss.errai.enterprise.client.cdi.AbstractCDIEventCallback;
import org.jboss.errai.enterprise.client.cdi.api.CDI;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;
import org.uberfire.client.mvp.PlaceManager;
import org.uberfire.client.mvp.PlaceManagerImpl;
import org.uberfire.ext.layout.editor.client.api.HasConfiguration;
import org.uberfire.ext.layout.editor.client.api.HasModalConfiguration;
import org.uberfire.ext.layout.editor.client.api.LayoutDragComponent;
import org.uberfire.ext.layout.editor.client.api.ModalConfigurationContext;
import org.uberfire.ext.layout.editor.client.api.RenderingContext;
import org.uberfire.ext.plugin.client.perspective.editor.api.PerspectiveEditorNavComponent;
import org.uberfire.ext.plugin.client.perspective.editor.layout.editor.TargetDivDragComponent;
import org.uberfire.ext.properties.editor.model.PropertyEditorChangeEvent;

public class Type_factory__o_u_e_p_c_p_e_l_e_TargetDivDragComponent__quals__j_e_i_Any_j_e_i_Default extends Factory<TargetDivDragComponent> { private class Type_factory__o_u_e_p_c_p_e_l_e_TargetDivDragComponent__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends TargetDivDragComponent implements Proxy<TargetDivDragComponent> {
    private final ProxyHelper<TargetDivDragComponent> proxyHelper = new ProxyHelperImpl<TargetDivDragComponent>("Type_factory__o_u_e_p_c_p_e_l_e_TargetDivDragComponent__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final TargetDivDragComponent instance) {

    }

    public TargetDivDragComponent asBeanType() {
      return this;
    }

    public void setInstance(final TargetDivDragComponent instance) {
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
        final TargetDivDragComponent proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.setup();
      } else {
        super.setup();
      }
    }

    @Override public String getDragComponentTitle() {
      if (proxyHelper != null) {
        final TargetDivDragComponent proxiedInstance = proxyHelper.getInstance(this);
        final String retVal = proxiedInstance.getDragComponentTitle();
        return retVal;
      } else {
        return super.getDragComponentTitle();
      }
    }

    @Override public IsWidget getPreviewWidget(RenderingContext ctx) {
      if (proxyHelper != null) {
        final TargetDivDragComponent proxiedInstance = proxyHelper.getInstance(this);
        final IsWidget retVal = proxiedInstance.getPreviewWidget(ctx);
        return retVal;
      } else {
        return super.getPreviewWidget(ctx);
      }
    }

    @Override public IsWidget getShowWidget(RenderingContext ctx) {
      if (proxyHelper != null) {
        final TargetDivDragComponent proxiedInstance = proxyHelper.getInstance(this);
        final IsWidget retVal = proxiedInstance.getShowWidget(ctx);
        return retVal;
      } else {
        return super.getShowWidget(ctx);
      }
    }

    @Override public Modal getConfigurationModal(ModalConfigurationContext ctx) {
      if (proxyHelper != null) {
        final TargetDivDragComponent proxiedInstance = proxyHelper.getInstance(this);
        final Modal retVal = proxiedInstance.getConfigurationModal(ctx);
        return retVal;
      } else {
        return super.getConfigurationModal(ctx);
      }
    }

    @Override public void observeEditComponentEventFromPropertyEditor(PropertyEditorChangeEvent event) {
      if (proxyHelper != null) {
        final TargetDivDragComponent proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.observeEditComponentEventFromPropertyEditor(event);
      } else {
        super.observeEditComponentEventFromPropertyEditor(event);
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final TargetDivDragComponent proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_u_e_p_c_p_e_l_e_TargetDivDragComponent__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(TargetDivDragComponent.class, "Type_factory__o_u_e_p_c_p_e_l_e_TargetDivDragComponent__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { TargetDivDragComponent.class, Object.class, PerspectiveEditorNavComponent.class, LayoutDragComponent.class, HasModalConfiguration.class, HasConfiguration.class });
  }

  public void init(final Context context) {
    CDI.subscribeLocal("org.uberfire.ext.properties.editor.model.PropertyEditorChangeEvent", new AbstractCDIEventCallback<PropertyEditorChangeEvent>() {
      public void fireEvent(final PropertyEditorChangeEvent event) {
        final TargetDivDragComponent instance = Factory.maybeUnwrapProxy((TargetDivDragComponent) context.getInstance("Type_factory__o_u_e_p_c_p_e_l_e_TargetDivDragComponent__quals__j_e_i_Any_j_e_i_Default"));
        instance.observeEditComponentEventFromPropertyEditor(event);
      }
      public String toString() {
        return "Observer: org.uberfire.ext.properties.editor.model.PropertyEditorChangeEvent []";
      }
    });
  }

  public TargetDivDragComponent createInstance(final ContextManager contextManager) {
    final TargetDivDragComponent instance = new TargetDivDragComponent();
    setIncompleteInstance(instance);
    final PlaceManagerImpl TargetDivDragComponent_placeManager = (PlaceManagerImpl) contextManager.getInstance("Type_factory__o_u_c_m_PlaceManagerImpl__quals__j_e_i_Any_j_e_i_Default");
    TargetDivDragComponent_PlaceManager_placeManager(instance, TargetDivDragComponent_placeManager);
    setIncompleteInstance(null);
    return instance;
  }

  public void invokePostConstructs(final TargetDivDragComponent instance) {
    instance.setup();
  }

  public Proxy createProxy(final Context context) {
    final Proxy<TargetDivDragComponent> proxyImpl = new Type_factory__o_u_e_p_c_p_e_l_e_TargetDivDragComponent__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }

  native static PlaceManager TargetDivDragComponent_PlaceManager_placeManager(TargetDivDragComponent instance) /*-{
    return instance.@org.uberfire.ext.plugin.client.perspective.editor.layout.editor.TargetDivDragComponent::placeManager;
  }-*/;

  native static void TargetDivDragComponent_PlaceManager_placeManager(TargetDivDragComponent instance, PlaceManager value) /*-{
    instance.@org.uberfire.ext.plugin.client.perspective.editor.layout.editor.TargetDivDragComponent::placeManager = value;
  }-*/;
}