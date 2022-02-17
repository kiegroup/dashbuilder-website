<!DOCTYPE html>
<#-- This page must use ${content.rootpath} because it is returned for 404 subdirectory urls too. -->
<html lang="en">
<head>
    <script id="dpal" src="https://www.redhat.com/dtm.js" type="text/javascript"></script>
    <script async src="https://www.googletagmanager.com/gtag/js?id=${config.googleAnalyticsId}"></script>
    <script>
      window.dataLayer = window.dataLayer || [];
      function gtag(){dataLayer.push(arguments);}
      gtag('js', new Date());

      gtag('config', '${config.googleAnalyticsId}');
    </script>

    <meta content="text/html; charset=UTF-8" http-equiv="Content-Type">
    <meta content="width=device-width, initial-scale=1" name="viewport">
    <title>Dashbuilder - 404 Page not found</title>
</head>
<body>
<h1>The requested page does not exist</h1>
<p>
    <a href="${config.canonicalBaseUrl}">Return www.dashbuilder.org.</a>
</p>
<script type="text/javascript">
  if (("undefined" !== typeof _satellite) && ("function" === typeof _satellite.pageBottom)) {
    _satellite.pageBottom();
  }
</script>
</body>
</html>

