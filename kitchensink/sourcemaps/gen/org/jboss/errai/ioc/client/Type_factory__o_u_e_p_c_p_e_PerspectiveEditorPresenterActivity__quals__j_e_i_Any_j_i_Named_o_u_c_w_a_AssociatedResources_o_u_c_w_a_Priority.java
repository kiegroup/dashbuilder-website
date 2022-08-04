package org.jboss.errai.ioc.client;

import java.lang.annotation.Annotation;
import javax.enterprise.context.Dependent;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.uberfire.client.mvp.AbstractActivity;
import org.uberfire.client.mvp.AbstractWorkbenchActivity;
import org.uberfire.client.mvp.AbstractWorkbenchEditorActivity;
import org.uberfire.client.mvp.Activity;
import org.uberfire.client.mvp.ContextSensitiveActivity;
import org.uberfire.client.mvp.PlaceManager;
import org.uberfire.client.mvp.PlaceManagerImpl;
import org.uberfire.client.mvp.WorkbenchActivity;
import org.uberfire.client.mvp.WorkbenchEditorActivity;
import org.uberfire.client.workbench.annotations.AssociatedResources;
import org.uberfire.client.workbench.annotations.Priority;
import org.uberfire.ext.plugin.client.perspective.editor.PerspectiveEditorPresenter;
import org.uberfire.ext.plugin.client.perspective.editor.PerspectiveEditorPresenterActivity;
import org.uberfire.ext.plugin.client.type.PerspectiveLayoutPluginResourceType;
import org.uberfire.security.Resource;
import org.uberfire.security.authz.RuntimeFeatureResource;
import org.uberfire.security.authz.RuntimeResource;

public class Type_factory__o_u_e_p_c_p_e_PerspectiveEditorPresenterActivity__quals__j_e_i_Any_j_i_Named_o_u_c_w_a_AssociatedResources_o_u_c_w_a_Priority extends Factory<PerspectiveEditorPresenterActivity> { public Type_factory__o_u_e_p_c_p_e_PerspectiveEditorPresenterActivity__quals__j_e_i_Any_j_i_Named_o_u_c_w_a_AssociatedResources_o_u_c_w_a_Priority() {
    super(new FactoryHandleImpl(PerspectiveEditorPresenterActivity.class, "Type_factory__o_u_e_p_c_p_e_PerspectiveEditorPresenterActivity__quals__j_e_i_Any_j_i_Named_o_u_c_w_a_AssociatedResources_o_u_c_w_a_Priority", Dependent.class, false, "Perspective Editor", true));
    handle.setAssignableTypes(new Class[] { PerspectiveEditorPresenterActivity.class, AbstractWorkbenchEditorActivity.class, AbstractWorkbenchActivity.class, AbstractActivity.class, Object.class, Activity.class, RuntimeFeatureResource.class, RuntimeResource.class, Resource.class, WorkbenchActivity.class, ContextSensitiveActivity.class, WorkbenchEditorActivity.class });
    handle.setQualifiers(new Annotation[] { QualifierUtil.ANY_ANNOTATION, QualifierUtil.createNamed("Perspective Editor"), new AssociatedResources() {
        public Class annotationType() {
          return AssociatedResources.class;
        }
        public String toString() {
          return "@org.uberfire.client.workbench.annotations.AssociatedResources(value=[class org.uberfire.ext.plugin.client.type.PerspectiveLayoutPluginResourceType])";
        }
        public Class[] value() {
          return new Class[] { PerspectiveLayoutPluginResourceType.class };
        }
      }, new Priority() {
        public Class annotationType() {
          return Priority.class;
        }
        public String toString() {
          return "@org.uberfire.client.workbench.annotations.Priority(value=2147483647)";
        }
        public int value() {
          return 2147483647;
        }
    } });
  }

  public PerspectiveEditorPresenterActivity createInstance(final ContextManager contextManager) {
    final PlaceManager _placeManager_0 = (PlaceManagerImpl) contextManager.getInstance("Type_factory__o_u_c_m_PlaceManagerImpl__quals__j_e_i_Any_j_e_i_Default");
    final PerspectiveEditorPresenterActivity instance = new PerspectiveEditorPresenterActivity(_placeManager_0);
    setIncompleteInstance(instance);
    final PerspectiveEditorPresenter PerspectiveEditorPresenterActivity_realPresenter = (PerspectiveEditorPresenter) contextManager.getInstance("Type_factory__o_u_e_p_c_p_e_PerspectiveEditorPresenter__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, PerspectiveEditorPresenterActivity_realPresenter);
    PerspectiveEditorPresenterActivity_PerspectiveEditorPresenter_realPresenter(instance, PerspectiveEditorPresenterActivity_realPresenter);
    setIncompleteInstance(null);
    return instance;
  }

  public void invokePostConstructs(final PerspectiveEditorPresenterActivity instance) {
    instance.init();
  }

  native static PerspectiveEditorPresenter PerspectiveEditorPresenterActivity_PerspectiveEditorPresenter_realPresenter(PerspectiveEditorPresenterActivity instance) /*-{
    return instance.@org.uberfire.ext.plugin.client.perspective.editor.PerspectiveEditorPresenterActivity::realPresenter;
  }-*/;

  native static void PerspectiveEditorPresenterActivity_PerspectiveEditorPresenter_realPresenter(PerspectiveEditorPresenterActivity instance, PerspectiveEditorPresenter value) /*-{
    instance.@org.uberfire.ext.plugin.client.perspective.editor.PerspectiveEditorPresenterActivity::realPresenter = value;
  }-*/;
}