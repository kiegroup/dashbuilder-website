<#import "base.ftl" as parent>
<#import "macros.ftl" as macros>

<@layout></@layout>

<#macro layout>
    <@parent.layout
            title="Dashboards and data storytelling tool"
            description="Build data visualization from different sources of data using custom visualization widgets using YML, Java or a drag-and-drop tool with Dashbuilder"
            uri=""
            googleWebmasterToolsVerification=true>

        <div class="row">
            <div class="col-md-7">
                <h1>Easy dashboards and data storytelling with Dashbuilder</h1>
                <p class="lead">A fast, easy-to-use, cloud-native and open source data visualization tool for software developers</p>
                <div class="d-flex justify-content-center" style="width: auto;">
                    <@macros.videoCard youtubeId="YM4OjSMqBP4" long=false/>
                </div>
            </div>
            <div class="col-md-5">
                <@macros.tryItButton/>
                <@macros.getStartedButton/>
            </div>
        </div>

        <div class="row">
            <div class="row">
                <div class="mb-2 mt-4">
                    <h3>Flexibility to work</h3>
                    <p>Consume data from different sources, export your work to edit later or run in a runtime environment</p>
                </div>    
                <div class="row">
                    <div class="col-md-4">
                        <div class="card h-100">
                            <div class="card-body">
                                <h5 class="card-title"><i class="fas fa-table cardTitleIcon"></i>Data Sets</h5>
                                <p class="card-text">Consume data from different sources, including SQL databases, JSON webservice or create your own provider using Java.</p>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-4">
                        <div class="card h-100">
                            <div class="card-body">
                                <h5 class="card-title"><i class="fas fa-exchange-alt cardTitleIcon"></i>Import and Export</h5>
                                <p class="card-text">The work can be exported to ZIP files and be imported in other installations or moved to production.</p>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-4">
                        <div class="card h-100">
                            <div class="card-body">
                                <h5 class="card-title"><i class="fas fa-recycle cardTitleIcon"></i>Reusable Dashboards</h5>
                                <p class="card-text">Reuse dashboards changing configuration for the target environment</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>      

            <div class="row">
                <div class="mb-2 mt-4">
                    <h3>Create dashboards your way</h3>
                    <p>Dashbuilder supports dashboards created from YML, Java or a drag and drop tool.</p>
                </div>        
                <div class="col-md-4">
                    <div class="card h-100">
                        <img class="card-img-top" src="${content.rootpath}website/DB_YML.png"  height="200px" alt="YML Editor">
                        <div class="card-body">
                            <h5 class="card-title">YML</h5>
                            <p class="card-text">Author dashboards in a browser editor using YML language. Export a client-only application to use anywhere or keep it stored in the cloud.</p>
                        </div>
                        <div class="card-footer">
                            <a href="${config.onlineEditorURL}" class="card-link">Try it!</a>
                        </div>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="card h-100">
                        <img class="card-img-top" src="${content.rootpath}website/DB_JAVA_DSL.png" height="200px"  alt="Card image cap">
                        <div class="card-body">
                            <h5 class="card-title">Java</h5>
                            <p class="card-text">Java developers can create dashboards and exports to a ZIP file that runs on Dashbuilder Runtime.</p>
                        </div>
                        <div class="card-footer">
                            <a href="#" class="card-link">Learn more</a>
                        </div>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="card h-100">
                        <img class="card-img-top" src="${content.rootpath}website/LAYOUT_EDITOR.png" height="200px" alt="Card image cap">
                        <div class="card-body">
                            <h5 class="card-title">Layout Editor</h5>
                            <p class="card-text">Create dashboards using a visual drag and drop editor. Export the dashboard and run on Dashbuilder Runtime.</p>                        
                        </div>
                        <div class="card-footer">
                            <a href="#" class="card-link">Learn more</a>
                        </div>
                    </div>
                </div>
            </div>         
        </div>
        

        <br />

        <div class="row">
            <div class="col-md-12">
                <@macros.latestBlogPosts/>
            </div>
        </div>

        <div class="row">
            <div class="col-md-12">
                <@macros.latestVideos/>
            </div>
        </div>
    </@parent.layout>
</#macro>
