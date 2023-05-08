package org.jboss.errai.ioc.client;

import com.google.gwt.user.client.ui.IsWidget;
import javax.enterprise.context.Dependent;
import org.dashbuilder.displayer.client.AbstractDisplayer;
import org.dashbuilder.displayer.client.AbstractErraiDisplayer;
import org.dashbuilder.displayer.client.Displayer;
import org.dashbuilder.displayer.client.DisplayerListener;
import org.dashbuilder.displayer.client.widgets.ExternalComponentPresenter;
import org.dashbuilder.displayer.external.ExternalComponentMessageHelper;
import org.dashbuilder.renderer.client.external.ExternalComponentDisplayer;
import org.dashbuilder.renderer.client.external.ExternalComponentDisplayer.View;
import org.dashbuilder.renderer.client.external.ExternalComponentDisplayerView;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class Type_factory__o_d_r_c_e_ExternalComponentDisplayer__quals__j_e_i_Any_j_e_i_Default extends Factory<ExternalComponentDisplayer> { public Type_factory__o_d_r_c_e_ExternalComponentDisplayer__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(ExternalComponentDisplayer.class, "Type_factory__o_d_r_c_e_ExternalComponentDisplayer__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { ExternalComponentDisplayer.class, AbstractErraiDisplayer.class, AbstractDisplayer.class, Object.class, Displayer.class, DisplayerListener.class, IsWidget.class });
  }

  public ExternalComponentDisplayer createInstance(final ContextManager contextManager) {
    final ExternalComponentDisplayer instance = new ExternalComponentDisplayer();
    setIncompleteInstance(instance);
    final ExternalComponentMessageHelper ExternalComponentDisplayer_messageHelper = (ExternalComponentMessageHelper) contextManager.getInstance("Producer_factory__o_d_d_e_ExternalComponentMessageHelper__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ExternalComponentDisplayer_messageHelper);
    ExternalComponentDisplayer_ExternalComponentMessageHelper_messageHelper(instance, ExternalComponentDisplayer_messageHelper);
    final ExternalComponentPresenter ExternalComponentDisplayer_externalComponentPresenter = (ExternalComponentPresenter) contextManager.getInstance("Type_factory__o_d_d_c_w_ExternalComponentPresenter__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ExternalComponentDisplayer_externalComponentPresenter);
    ExternalComponentDisplayer_ExternalComponentPresenter_externalComponentPresenter(instance, ExternalComponentDisplayer_externalComponentPresenter);
    final ExternalComponentDisplayerView ExternalComponentDisplayer_view = (ExternalComponentDisplayerView) contextManager.getInstance("Type_factory__o_d_r_c_e_ExternalComponentDisplayerView__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ExternalComponentDisplayer_view);
    ExternalComponentDisplayer_View_view(instance, ExternalComponentDisplayer_view);
    setIncompleteInstance(null);
    return instance;
  }

  public void invokePostConstructs(final ExternalComponentDisplayer instance) {
    instance.init();
  }

  native static ExternalComponentMessageHelper ExternalComponentDisplayer_ExternalComponentMessageHelper_messageHelper(ExternalComponentDisplayer instance) /*-{
    return instance.@org.dashbuilder.renderer.client.external.ExternalComponentDisplayer::messageHelper;
  }-*/;

  native static void ExternalComponentDisplayer_ExternalComponentMessageHelper_messageHelper(ExternalComponentDisplayer instance, ExternalComponentMessageHelper value) /*-{
    instance.@org.dashbuilder.renderer.client.external.ExternalComponentDisplayer::messageHelper = value;
  }-*/;

  native static View ExternalComponentDisplayer_View_view(ExternalComponentDisplayer instance) /*-{
    return instance.@org.dashbuilder.renderer.client.external.ExternalComponentDisplayer::view;
  }-*/;

  native static void ExternalComponentDisplayer_View_view(ExternalComponentDisplayer instance, View value) /*-{
    instance.@org.dashbuilder.renderer.client.external.ExternalComponentDisplayer::view = value;
  }-*/;

  native static ExternalComponentPresenter ExternalComponentDisplayer_ExternalComponentPresenter_externalComponentPresenter(ExternalComponentDisplayer instance) /*-{
    return instance.@org.dashbuilder.renderer.client.external.ExternalComponentDisplayer::externalComponentPresenter;
  }-*/;

  native static void ExternalComponentDisplayer_ExternalComponentPresenter_externalComponentPresenter(ExternalComponentDisplayer instance, ExternalComponentPresenter value) /*-{
    instance.@org.dashbuilder.renderer.client.external.ExternalComponentDisplayer::externalComponentPresenter = value;
  }-*/;
}