<#assign pom = data.get('pom.yml')>
<#assign videos = data.get('videos.yml').data>
<#assign users = data.get('users.yml').data>

<#macro latestBlogPosts>
    <div class="card mb-4">
        <div class="card-header">Latest blog posts</div>
        <div class="card-body">
            <ul class="list-unstyled">
                <#list published_posts[0..4] as blog>
                    <li class="mb-2">
                        <div class="title">
                            <a href="${content.rootpath}${blog.uri}">${blog.title}</a>
                        </div>
                        <div class="small">${blog.date?string("EEE d MMMM yyyy")}</div>
                        <@userBadgeInline userId=blog.author/>
                    </li>
                </#list>
                <div class="small float-end">
                    <a href="${content.rootpath}blog/index.html">Blog archive</a>
                </div>
            </ul>
        </div>
    </div>
</#macro>

<#macro latestVideos>
    <div class="card mb-4">
        <div class="card-header">Latest videos</div>
        <div class="card-body">
            <ul class="list-unstyled">
                <#list videos[0..4] as video>
                    <li class="mb-2">
                        <a style="cursor: pointer" data-bs-toggle="modal" data-bs-target="#videoModal" data-youtube-id="${video.youtubeId}" data-video-title="${video.title}">
                            <span><i class="fas fa-play-circle"></i></span>
                            <span class="align-text-middle link-primary">${video.title}</span>
                        </a>
                        <div class="small">${video.date?string("EEE d MMMM yyyy")}</div>
                        <#if video.author??>
                            <@userBadgeInline userId=video.author/>
                        </#if>
                    </li>
                </#list>
            </ul>
        </div>
    </div>
</#macro>

<#macro userBadgeInline userId>
    <#assign user = users?filter(u -> u.userId == userId)?first >
    <span>
        <img class="rounded me-1" src="https://www.gravatar.com/avatar/${user.gravatarHashId}?s=20&d=mm"/>
        <span class="align-middle">${user.fullName}</span>
    </span>
</#macro>

<#macro userBadge userId long>
    <#assign user = users?filter(u -> u.userId == userId)?first >
    <div class="card bg-light" style="width: ${long?then("600px", "320px")};">
        <div class="row gx-2">
            <div class="col-auto">
                <img class="rounded m-1" src="https://www.gravatar.com/avatar/${user.gravatarHashId}?s=64&d=mm" width="64" height="64" alt="Avatar ${user.fullName}"/>
            </div>
            <div class="col">
                <div class="card-body p-0 me-1">
                    <h5 class="card-title my-1">${user.fullName}</h5>
                    <hr class="m-0"/>
                    <span class="float-end mx-1">
                        <#if user.twitterUsername??>
                            <a href="https://twitter.com/${user.twitterUsername}"><img src="${content.rootpath}headerFooter/twitterLogo.png" alt="Twitter"/></a>
                        </#if>
                        <#if user.facebookUsername??>
                            <a href="https://www.facebook.com/${user.facebookUsername}"><img src="${content.rootpath}headerFooter/facebookLogo.png" alt="Facebook"/></a>
                        </#if>
                        <#if user.linkedInId??>
                            <a href="https://www.linkedin.com/in/${user.linkedInId}"><img src="${content.rootpath}headerFooter/linkedInLogo.png" alt="LinkedIn"/></a>
                        </#if>
                        <#if user.githubUsername??>
                            <a href="https://github.com/${user.githubUsername}"><img src="${content.rootpath}headerFooter/gitHubLogo.png" alt="GitHub"/></a>
                        </#if>
                    </span>
                    <p class="small mb-1">${user.role}</p>
                    <#if long>
                        <#if user.email??>
                            <p class="mb-1">
                                <span class="emailSupportPopover"><strong>Email:</strong> ${user.email}</span>
                            </p>
                        </#if>
                        <#if user.employedBy??>
                            <p class="mb-1"><strong>Employed by:</strong> ${user.employedBy}</p>
                        </#if>
                        <#if user.contributionsDescription??>
                            <p class="mb-1"><strong>Contributions:</strong> ${user.contributionsDescription}</p>
                        </#if>
                        <#if user.biography??>
                            <p class="mb-1"><strong>Bio:</strong> ${user.biography}</p>
                        </#if>
                    </#if>
                </div>
            </div>
        </div>
    </div>
</#macro>

<#macro relatedVideos>
    <#assign relatedVideos = videos?filter(video -> video.tags?? &amp;&amp; video.tags.contains(content.related_tag))>
    <#if relatedVideos?size &gt; 0>
        <h2>Related videos</h2>
        <div class="row row-cols-1 row-cols-md-2 row-cols-lg-3 g-4 mb-4">
            <#list relatedVideos as video>
                <div class="col">
                    <@videoCard youtubeId=video.youtubeId/>
                </div>
            </#list>
        </div>
    </#if>
</#macro>

<#macro videoCard youtubeId long=true>
    <#assign video = videos?filter(v -> v.youtubeId == youtubeId)?first >
    <div class="card" style="cursor: pointer">
        <#if long>
            <img class="card-img-top ratio ratio-16x9" src="https://img.youtube.com/vi/${video.youtubeId}/mqdefault.jpg" alt="Video thumbnail">
            <div class="card-img-overlay">
                <div class="text-center mt-5"><i class="fas fa-play-circle fa-3x text-white bg-dark bg-opacity-25 rounded-pill p-1"></i></div>
            </div>
            <div class="card-body p-2">
                <#-- As a stretched-link for the hover over effect -->
                <a class="stretched-link" data-bs-toggle="modal" data-bs-target="#videoModal" data-youtube-id="${video.youtubeId}" data-video-title="${video.title}">${video.title}</a>
                <br/>
                <#if video.author??>
                    <@userBadgeInline userId=video.author/>
                </#if>
                <span class="float-end align-bottom small">${video.date?string("d MMM yyyy")}</span>
            </div>
        <#else>
            <a data-bs-toggle="modal" data-bs-target="#videoModal" data-youtube-id="${video.youtubeId}" data-video-title="${video.title}">
                <img class="card-img-top ratio ratio-16x9" src="https://img.youtube.com/vi/${video.youtubeId}/mqdefault.jpg" alt="Video thumbnail">
                <div class="card-img-overlay d-flex justify-content-center align-items-center">
                    <i class="fas fa-play-circle fa-3x text-white bg-dark bg-opacity-25 rounded-pill p-1"></i>
                </div>
            </a>
        </#if>
    </div>
</#macro>

<#macro relatedBlogPosts>
    <#assign relatedTags = tags?filter(tag -> tag.name == content.related_tag)>
    <#if relatedTags?size &gt; 0>
        <#assign relatedTag = relatedTags?first>
        <h2>Related blog posts</h2>
        <ul>
            <#list relatedTag.tagged_posts as blog>
                <li class="mb-2">
                    <div class="title">
                        <a href="${content.rootpath}${blog.uri}">${blog.title}</a>
                    </div>
                    <div class="small">${blog.date?string("EEE d MMMM yyyy")}</div>
                    <@userBadgeInline userId=blog.author/>
                </li>
            </#list>
        </ul>
    </#if>
</#macro>

<#macro downloadButton>
    <div class="card bg-light mb-4">
        <div class="text-center mt-2"><a class="btn btn-lg btn-success versionedButton" href="${pom.latestFinal.distributionZip}"><img alt="Download" src="${content.rootpath}download/download.png">
            <div>
                <span>Try Dashbuilder</span><br/>
                <span class="small">Download ${pom.latestFinal.version}</span>
            </div>
        </a></div>
        <div class="card-body">
            <ol class="mb-1">
                <li>Download and unzip.</li>
                <li>
                    Run <code>java -jar dashbuilder-authoring-bootable.jar</code>
                </li>
                <li>
                    Create dashboards in <em>http://localhost:8080</em> <br/>
                </li>
            </ol>
            <div class="text-center small">
                Requires <a href="https://adoptium.net">JDK 11 or higher</a> to run.
            </div>
        </div>
    </div>
</#macro>

<#macro tryItButton>
    <div class="card bg-light mb-4">
        <div class="text-center mt-2" data-bs-toggle="modal" data-bs-target="#samplesModal"><a class="btn btn-lg btn-success versionedButton" style="margin-top: 5px">
            <div>
                <span>Try Samples</span><br/>
            </div>
        </a></div>
        <div class="card-body">
            <p>No download is required, try some of the samples in the <a href="${config.onlineEditorURL}">Dashbuilder Online Editor</a></p>           
        </div>
    </div>
</#macro>


<#macro getStartedButton>
    <div class="card bg-light mb-4">
        <div class="text-center mt-2"><a class="btn btn-lg btn-primary versionedButton" style="margin-top: 5px" href="${config.canonicalBaseUrl}/docs/optaplanner/latest/quickstart/quickstart.html">
            <div>
                <span>Documentation</span><br/>
            </div>
        </a></div>
        <div class="card-body">
            <div class="text-center">
                <p>Check the documentation and the getting started guide to learn more about Dashbuilder.</p>
            </div>
        </div>
    </div>
</#macro>
