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
                    <@macros.videoCard youtubeId="3u-2qVlm48c" long=false/>
                </div>
            </div>
            <div class="col-md-5">
                <@macros.tryItButton/>
                <@macros.getStartedButton/>
            </div>
        </div>
        <div class="row" style="margin-top: 50px">
            <div class="mb-2 mt-4">
                <h3>Create dashboards your way</h3>
                <p>Dashbuilder supports dashboards created from YML or with a drag and drop tool. You can make use of internal visual components or build your own.</p>
            </div>        
            <div class="col-md-4">
                <div class="card h-100">
                    <img class="card-img-top" src="${content.rootpath}website/DB_YML.png"  height="200px" alt="YML Editor">
                    <div class="card-body">
                        <h5 class="card-title">YML</h5>
                        <p class="card-text">Author dashboards in a browser client-side editor using YML language. Export a client-only application to use anywhere or keep it stored in the cloud.</p>
                    </div>
                    <div class="card-footer">
                        <a href="${config.onlineEditorURL}" class="card-link">Try it!</a>
                    </div>
                </div>
            </div>
            <div class="col-md-4">
                <div class="card h-100">
                    <img class="card-img-top" src="${content.rootpath}website/DB_KITCHENSINK.png" height="200px"  alt="Card image cap">
                    <div class="card-body">
                        <h5 class="card-title">Visual Components</h5>
                        <p class="card-text">Dashbuilder comes with a full set of traditional visual components, but developers can extend the components library by building their own.</p>
                    </div>
                    <div class="card-footer">
                        <a href="/kitchensink" class="card-link">Explore Components</a>
                    </div>
                </div>
            </div>
            <div class="col-md-4">
                <div class="card h-100">
                    <img class="card-img-top" src="${content.rootpath}website/DB_QUARKUS.png" height="200px" alt="Card image cap">
                    <div class="card-body">
                        <h5 class="card-title">Quarkus Extension</h5>
                        <p class="card-text">Bring dashboards to your Quarkus application by using the Dashbuilder extension.</p>                        
                    </div>
                    <div class="card-footer">
                        <a href="https://quarkiverse.github.io/quarkiverse-docs/quarkus-dashbuilder/dev/index.html" class="card-link">Learn more</a>
                    </div>
                </div>
            </div>
        </div>
        
        <hr />

        <div class="row" style="margin-top: 30px">
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
