<#-- Move into content after https://github.com/jbake-org/jbake/issues/693 -->
<#import "normalBase.ftl" as parent>
<#import "macros.ftl" as macros>

<@layout>${content.body}</@layout>

<#macro layout>
<@parent.layout>
    <#assign pom = data.get('pom.yml')>
    <h1 class="mt-1 mb-4">${content.title}</h1>

    <div class="row">
        <div class="col-md-12">
            <p>Dashbuilder documentation is in constant development and it can be found on <a href="/docs">this website</a>.</p>
        </div>
    </div>
</@parent.layout>
</#macro>
