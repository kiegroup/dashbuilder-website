<#-- Move into content after https://github.com/jbake-org/jbake/issues/693 -->
<#import "normalBase.ftl" as parent>
<#import "macros.ftl" as macros>

<@layout>${content.body}</@layout>

<#macro layout>
<@parent.layout>
    <#assign pom = data.get('pom.yml')>
    <h1 class="mt-1 mb-4">${content.title}</h1>

    <div class="row">
        <div class="row">

            <div class="col-md-12">
                <p>DashBuilder is a full-featured web application that allows non-technical users and programmers to create business dashboards.</p>
                <p>Dashboard data can be extracted from heterogeneous sources of information such as Prometheus, JDBC databases, or regular text files.</p>
                <p>The resulting dashboard can be deployed in a cloud environment using DashBuilder Runtime.</p>

                <h4><a href="/docs">DashBuilder Documentation</a></h4>

            </div>
        </div>
        <div class="row">

            <div class="col-md-12">
                <h3>Overview</h3>
                Here is a <a href="https://blog.kie.org/2021/04/dashbuilder-an-apache-licensed-business-reporting-and-monitoring-tool.html">short introduction</a> and sneek peek into the features of DashBuilder.
                <h3>Getting Started Guide</h3>
                <p>To know more, you can head over to <a href=https://blog.kie.org/2021/05/dashbuilder-getting-started-guide.html>Getting Started with DashBuilder(guide)</a>.<p>
            </div>
        </div>
        <div class="row">
            <div class="col-md-12">
                <h3>Connecting your datasets with DashBuilder</h3>
                <p>You can connect your own datasets to DashBuilder and create intuitive dashboards based on your own data. This is how the Datasets page looks like.</p>
                <img src="https://blog.kie.org/wp-content/uploads/2021/08/0KYpUjbzUriHd__VS" alt="DashBuilder Datasets page">
                <p>Here are some important links to get started with adding datasets from several sources to DashBuilder<p/>
                <a href="https://blog.kie.org/2021/08/add-data-from-kie-execution-server-for-authoring-dashboards.html"><p>KIE Execution server</p></a>
                <a href="https://blog.kie.org/2021/07/add-sql-datasource-for-authoring-dashboards.html"><p>SQL</p></a>
                <a href="https://blog.kie.org/2021/05/add-prometheus-datasets-for-authoring-dashboards.html"><p>Prometheus</p></a>
                <a href="https://blog.kie.org/2022/02/json-datasets-in-dashbuilder.html"><p>JSON</p></a>
                <a href="https://blog.kie.org/2021/05/add-csv-datasets-for-authoring-dashboards.html"><p>CSV</p></a>
                <a href="https://blog.kie.org/2021/05/kafka-monitoring-dashboards-from-business-central.html"><p>Kafka</p></a>
                <h3>DashBuilder Runtime</h3>
                <p>You can import your dashboards from DashBuilder in the form of a ZIP file using the "Data Transfer" option from the menu on the top left. Once you've imported the dashboards, you can deploy them in a cloud environment as mentioned earlier. To know more about DashBuilder Runtime, refer to the <a href="https://blog.kie.org/2020/09/introducing-dashbuilder-runtime.html">Introduction to DashBuilder Runtime</a> and refer to <a href="https://medium.com/kie-foundation/dashbuilder-runtime-demos-6d78e53edced"> some of it's demos and features.</a></p>
                <h3>Build and Run instructions</h3>
                <p>Clone the <a href="https://github.com/kiegroup/kie-tools/">KIE Tools repository.</a> Go to <code>packages/dashbuilder</code> and run <code>mvn clean install -Dfull</code></p>
                <p>Go to <code>dashbuilder-authoring</code> folder inside <code>dashbuilder</code> and run <code>mvn clean install -Dfull</code><p>
                <p>To run Dashbuilder Authoring, run the <code>dashbuilder-authoring-bootable JAR</code> created inside <code>dashbuilder-authoring/target</code> using the command <code>java -jar dashbuilder-authoring-bootable.jar</code></p>
                <p>To run DashBuilder Runtime where you can import and display dashboards, run the <code>dashbuilder-runtime-app-runner.jar</code> created inside <code>dashbuilder-runtime-parent/dashbuilder-runtime-app/target</code> using the same command.</p>
            </div>
        </div>
    </div>
</@parent.layout>
</#macro>
