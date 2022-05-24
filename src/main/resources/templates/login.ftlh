<#import "parts/common.ftlh" as c>
<#import "parts/login.ftlh" as l>

<@c.page>
<div>Login page</div>
<@l.login "/login" />
<a href="/registration">Sign up</a>
</@c.page>
