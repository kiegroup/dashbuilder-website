/*
 * Copyright 2012 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.uberfire.ext.plugin.client.perspective.editor;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Consumer;
import javax.annotation.Generated;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import javax.annotation.PostConstruct;
import org.uberfire.client.mvp.HasPresenter;

import javax.inject.Named;
import org.uberfire.client.workbench.annotations.AssociatedResources;
import org.uberfire.client.workbench.annotations.Priority;
import org.uberfire.client.mvp.AbstractWorkbenchEditorActivity;
import org.uberfire.client.mvp.PlaceManager;

import org.uberfire.mvp.PlaceRequest;

import org.uberfire.workbench.model.menu.Menus;

import org.uberfire.backend.vfs.ObservablePath;

import com.google.gwt.user.client.ui.IsWidget;

@Dependent
@Generated("org.uberfire.annotations.processors.WorkbenchEditorProcessor")
@Named("Perspective Editor")
@AssociatedResources({
    org.uberfire.ext.plugin.client.type.PerspectiveLayoutPluginResourceType.class
})

@Priority(2147483647)
/*
 * WARNING! This class is generated. Do not modify.
 */
public class PerspectiveEditorPresenterActivity extends AbstractWorkbenchEditorActivity {

    @Inject
    private PerspectiveEditorPresenter realPresenter;

    @Inject
    //Constructor injection for testing
    public PerspectiveEditorPresenterActivity(final PlaceManager placeManager) {
        super( placeManager );
    }

    @PostConstruct
    public void init() {
        ((HasPresenter) realPresenter.getWidget()).init( realPresenter );
    }

    @Override
    public void onStartup(final ObservablePath path,
                        final PlaceRequest place) {
        super.onStartup( path, place );
        realPresenter.onStartup( path, place );
    }

    @Override
    public boolean onMayClose() {
        return realPresenter.onMayClose();
    }

    @Override
    public void onClose() {
        super.onClose();
        realPresenter.onClose();
    }

    @Override
    public void onFocus() {
        super.onFocus();
        realPresenter.onFocus();
    }

    @Override
    public IsWidget getTitleDecoration() {
        return realPresenter.getTitle();
    }

    @Override
    public String getTitle() {
        return realPresenter.getTitleText();
    }

    @Override
    public IsWidget getWidget() {
        return realPresenter.getWidget();
    }

    @Override
    public void getMenus(final Consumer<Menus> menusConsumer) {
        realPresenter.getMenus(menusConsumer);
    }

    @Override
    public String getIdentifier() {
        return "Perspective Editor";
    }
}
