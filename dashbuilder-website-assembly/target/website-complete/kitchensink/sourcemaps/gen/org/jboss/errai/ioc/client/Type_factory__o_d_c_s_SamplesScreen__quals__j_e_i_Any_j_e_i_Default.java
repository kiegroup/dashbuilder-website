package org.jboss.errai.ioc.client;

import java.lang.annotation.Annotation;
import javax.enterprise.context.ApplicationScoped;
import org.dashbuilder.client.screens.RouterScreen;
import org.dashbuilder.client.screens.SamplesScreen;
import org.dashbuilder.client.screens.SamplesScreen.View;
import org.dashbuilder.client.screens.view.SamplesScreenView;
import org.dashbuilder.client.services.SamplesService;
import org.dashbuilder.client.widgets.SampleCard;
import org.dashbuilder.client.widgets.SamplesCardRow;
import org.jboss.errai.ioc.client.api.ManagedInstance;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;

public class Type_factory__o_d_c_s_SamplesScreen__quals__j_e_i_Any_j_e_i_Default extends Factory<SamplesScreen> { private class Type_factory__o_d_c_s_SamplesScreen__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends SamplesScreen implements Proxy<SamplesScreen> {
    private final ProxyHelper<SamplesScreen> proxyHelper = new ProxyHelperImpl<SamplesScreen>("Type_factory__o_d_c_s_SamplesScreen__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final SamplesScreen instance) {

    }

    public SamplesScreen asBeanType() {
      return this;
    }

    public void setInstance(final SamplesScreen instance) {
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

    @Override public void init() {
      if (proxyHelper != null) {
        final SamplesScreen proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.init();
      } else {
        super.init();
      }
    }

    @Override public String title() {
      if (proxyHelper != null) {
        final SamplesScreen proxiedInstance = proxyHelper.getInstance(this);
        final String retVal = proxiedInstance.title();
        return retVal;
      } else {
        return super.title();
      }
    }

    @Override protected View getPart() {
      if (proxyHelper != null) {
        final SamplesScreen proxiedInstance = proxyHelper.getInstance(this);
        final View retVal = SamplesScreen_getPart(proxiedInstance);
        return retVal;
      } else {
        return super.getPart();
      }
    }

    @Override protected void onOpen() {
      if (proxyHelper != null) {
        final SamplesScreen proxiedInstance = proxyHelper.getInstance(this);
        SamplesScreen_onOpen(proxiedInstance);
      } else {
        super.onOpen();
      }
    }

    @Override public void clear() {
      if (proxyHelper != null) {
        final SamplesScreen proxiedInstance = proxyHelper.getInstance(this);
        proxiedInstance.clear();
      } else {
        super.clear();
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final SamplesScreen proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Type_factory__o_d_c_s_SamplesScreen__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(SamplesScreen.class, "Type_factory__o_d_c_s_SamplesScreen__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { SamplesScreen.class, Object.class });
  }

  public SamplesScreen createInstance(final ContextManager contextManager) {
    final SamplesScreen instance = new SamplesScreen();
    setIncompleteInstance(instance);
    final RouterScreen SamplesScreen_router = (RouterScreen) contextManager.getInstance("Type_factory__o_d_c_s_RouterScreen__quals__j_e_i_Any_j_e_i_Default");
    SamplesScreen_RouterScreen_router(instance, SamplesScreen_router);
    final SamplesScreenView SamplesScreen_view = (SamplesScreenView) contextManager.getInstance("Type_factory__o_d_c_s_v_SamplesScreenView__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, SamplesScreen_view);
    SamplesScreen_View_view(instance, SamplesScreen_view);
    final ManagedInstance SamplesScreen_sampleCardInstance = (ManagedInstance) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_i_c_a_ManagedInstance__quals__Universal", new Class[] { SampleCard.class }, new Annotation[] { });
    registerDependentScopedReference(instance, SamplesScreen_sampleCardInstance);
    SamplesScreen_ManagedInstance_sampleCardInstance(instance, SamplesScreen_sampleCardInstance);
    final ManagedInstance SamplesScreen_samplesCardRowInstance = (ManagedInstance) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_i_c_a_ManagedInstance__quals__Universal", new Class[] { SamplesCardRow.class }, new Annotation[] { });
    registerDependentScopedReference(instance, SamplesScreen_samplesCardRowInstance);
    SamplesScreen_ManagedInstance_samplesCardRowInstance(instance, SamplesScreen_samplesCardRowInstance);
    final SamplesService SamplesScreen_samplesService = (SamplesService) contextManager.getInstance("Type_factory__o_d_c_s_SamplesService__quals__j_e_i_Any_j_e_i_Default");
    SamplesScreen_SamplesService_samplesService(instance, SamplesScreen_samplesService);
    setIncompleteInstance(null);
    return instance;
  }

  public void invokePostConstructs(final SamplesScreen instance) {
    instance.init();
  }

  public Proxy createProxy(final Context context) {
    final Proxy<SamplesScreen> proxyImpl = new Type_factory__o_d_c_s_SamplesScreen__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }

  native static ManagedInstance SamplesScreen_ManagedInstance_sampleCardInstance(SamplesScreen instance) /*-{
    return instance.@org.dashbuilder.client.screens.SamplesScreen::sampleCardInstance;
  }-*/;

  native static void SamplesScreen_ManagedInstance_sampleCardInstance(SamplesScreen instance, ManagedInstance<SampleCard> value) /*-{
    instance.@org.dashbuilder.client.screens.SamplesScreen::sampleCardInstance = value;
  }-*/;

  native static SamplesService SamplesScreen_SamplesService_samplesService(SamplesScreen instance) /*-{
    return instance.@org.dashbuilder.client.screens.SamplesScreen::samplesService;
  }-*/;

  native static void SamplesScreen_SamplesService_samplesService(SamplesScreen instance, SamplesService value) /*-{
    instance.@org.dashbuilder.client.screens.SamplesScreen::samplesService = value;
  }-*/;

  native static RouterScreen SamplesScreen_RouterScreen_router(SamplesScreen instance) /*-{
    return instance.@org.dashbuilder.client.screens.SamplesScreen::router;
  }-*/;

  native static void SamplesScreen_RouterScreen_router(SamplesScreen instance, RouterScreen value) /*-{
    instance.@org.dashbuilder.client.screens.SamplesScreen::router = value;
  }-*/;

  native static View SamplesScreen_View_view(SamplesScreen instance) /*-{
    return instance.@org.dashbuilder.client.screens.SamplesScreen::view;
  }-*/;

  native static void SamplesScreen_View_view(SamplesScreen instance, View value) /*-{
    instance.@org.dashbuilder.client.screens.SamplesScreen::view = value;
  }-*/;

  native static ManagedInstance SamplesScreen_ManagedInstance_samplesCardRowInstance(SamplesScreen instance) /*-{
    return instance.@org.dashbuilder.client.screens.SamplesScreen::samplesCardRowInstance;
  }-*/;

  native static void SamplesScreen_ManagedInstance_samplesCardRowInstance(SamplesScreen instance, ManagedInstance<SamplesCardRow> value) /*-{
    instance.@org.dashbuilder.client.screens.SamplesScreen::samplesCardRowInstance = value;
  }-*/;

  public native static View SamplesScreen_getPart(SamplesScreen instance) /*-{
    return instance.@org.dashbuilder.client.screens.SamplesScreen::getPart()();
  }-*/;

  public native static void SamplesScreen_onOpen(SamplesScreen instance) /*-{
    instance.@org.dashbuilder.client.screens.SamplesScreen::onOpen()();
  }-*/;
}