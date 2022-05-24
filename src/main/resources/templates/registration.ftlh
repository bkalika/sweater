<#import "parts/common.ftlh" as c>
<#import "parts/login.ftlh" as l>

<@c.page>
<p>Sign up</p>
${message!}
<@l.login "/registration" />
</@c.page>