<#include "security.ftlh">
<#import "login.ftlh" as l>

<nav class="navbar navbar-expand-lg bg-light">
    <div class="container-fluid">
        <a class="navbar-brand" href="/main">Sweater</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="/">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/main">Messages</a>
                </li>
                <#if isAdmin>
                <li class="nav-item">
                    <a class="nav-link" href="/users">Users</a>
                </li>
                </#if>
                <#if user??>
                    <li class="nav-item">
                        <a class="nav-link" href="/users/profile">Profile</a>
                    </li>
                </#if>
            </ul>

            <#if user??>
                <div class="navbar-text mr-3">${name}</div>
                <@l.logout/>
            </#if>
        </div>
    </div>
</nav>
