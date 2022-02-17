<#-- Move into content after https://github.com/jbake-org/jbake/issues/693 -->
<#import "normalBase.ftl" as parent>
<#import "macros.ftl" as macros>

<@layout>${content.body}</@layout>

<#macro layout>
<@parent.layout>
    <#assign pom = data.get('pom.yml')>
    <h1 class="mt-1 mb-4">${content.title}</h1>

    <@macros.downloadButton/>

    <p>
        Dashbuilder is distributed as part of <a href="${config.downloadDirectory}">KIE Tools releases</a>. In file <em>dashbuilder_dist.zip</em> you will find:
    </p>

    <ul>
        <li><strong>Dashbuilder Authoring:</strong> a web application to visually author dashboards and export to ZIP files. This can be found in a form of bootable JAR or a WAR that can be deployed in Wildfly.</li>
        <li><strong>Dashbuilder Runtime:</strong> a Quarkus web application to run dashboards.</li>
    </ul>

    <p>
        Additionally you can run dashbuilder using container images

        <p><strong>Authoring: </strong> <em>quay.io/kogito_tooling_bot/dashbuilder-authoring</em></p>
        <p><strong>Runtime: </strong> <em>quay.io/kogito_tooling_bot/dashbuilder-runtime</em></p>

        The move to Kie Tools is recent, you read more about it on <a href="https://blog.kie.org/2022/01/announcing-dashbuilder-0-14-1.html">KIE Blog</a>.
    </p>    
    </@parent.layout>
</#macro>
