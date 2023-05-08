package org.jboss.errai.cdi;

import java.util.function.Function;
import javax.inject.Named;
import org.jboss.errai.common.client.util.AnnotationPropertyAccessorBuilder;
import org.jboss.errai.common.client.util.SharedAnnotationSerializer;
import org.jboss.errai.databinding.client.components.ListContainer;
import org.jboss.errai.enterprise.client.cdi.EventQualifierSerializer;
import org.jboss.errai.ioc.client.api.ReplyTo;
import org.jboss.errai.ioc.client.api.ToSubject;
import org.jboss.errai.ui.client.widget.Table;
import org.uberfire.client.workbench.annotations.Priority;

public class EventQualifierSerializerImpl extends EventQualifierSerializer { public EventQualifierSerializerImpl() {
    serializers.put("javax.inject.Named", AnnotationPropertyAccessorBuilder.create().with("value", new Function() {
      public Object apply(final Object anno) {
        return SharedAnnotationSerializer.stringify(((Named) anno).value());
      }
    }).build());
    serializers.put("org.jboss.errai.ui.client.widget.Table", AnnotationPropertyAccessorBuilder.create().with("root", new Function() {
      public Object apply(final Object anno) {
        return SharedAnnotationSerializer.stringify(((Table) anno).root());
      }
    }).build());
    serializers.put("org.jboss.errai.ioc.client.api.ReplyTo", AnnotationPropertyAccessorBuilder.create().with("value", new Function() {
      public Object apply(final Object anno) {
        return SharedAnnotationSerializer.stringify(((ReplyTo) anno).value());
      }
    }).build());
    serializers.put("org.uberfire.client.workbench.annotations.Priority", AnnotationPropertyAccessorBuilder.create().with("value", new Function() {
      public Object apply(final Object anno) {
        return SharedAnnotationSerializer.stringify(((Priority) anno).value());
      }
    }).build());
    serializers.put("org.jboss.errai.databinding.client.components.ListContainer", AnnotationPropertyAccessorBuilder.create().with("value", new Function() {
      public Object apply(final Object anno) {
        return SharedAnnotationSerializer.stringify(((ListContainer) anno).value());
      }
    }).build());
    serializers.put("org.jboss.errai.ioc.client.api.ToSubject", AnnotationPropertyAccessorBuilder.create().with("value", new Function() {
      public Object apply(final Object anno) {
        return SharedAnnotationSerializer.stringify(((ToSubject) anno).value());
      }
    }).build());
  }

}