<#import "base.ftl" as parent>
<#import "macros.ftl" as macros>

<@layout>${content.body}</@layout>

<#macro layout>
    <@parent.layout>
        <div class="row">
            <div class="col-md-9">
                <#nested>
                <@macros.relatedVideos/>
                <@macros.relatedBlogPosts/>
            </div>
            <div class="col-md-3">
                <@macros.tryItButton/>
                <@macros.getStartedButton/>
                <@macros.latestBlogPosts/>
                <@macros.latestVideos/>
            </div>
        </div>
    </@parent.layout>
</#macro>
