<#-- Move into content after https://github.com/jbake-org/jbake/issues/693 -->
<#import "normalBase.ftl" as parent>
<#import "macros.ftl" as macros>

<@layout>${content.body}</@layout>

<#macro layout>
<@parent.layout>
    <h1>${content.title}</h1>
    <p>
        This page mentions <em>active contributors</em>, who have contributed to OptaPlanner in the last year.
        If your name belongs in this list,
        <a href="https://github.com/kiegroup/optaplanner-website/blob/main/data/users.yml">submit a pull request</a>
        with the appropriate changes.
    </p>
    <h2>Research &amp; Development</h2>
    <@listUserBadges userIds=["jesuino"]/>
    <h2>Quality Assurance</h2>
    <h2>Marketing and Product Management</h2>
    <h2>Documentation</h2>
    <h2>Build, continuous integration and releases</h2>
    <h2>Community contributors</h2>
    <h2>Umbrella KIE R&amp;D team (Drools, Kogito, &hellip;)</h2>
</@parent.layout>
</#macro>


<#macro listUserBadges userIds>
    <ul style="list-style: none">
        <#list userIds as userId>
            <li class="mb-4">
                <@macros.userBadge userId="${userId}" long=true/>
            </li>
        </#list>
    </ul>
</#macro>
