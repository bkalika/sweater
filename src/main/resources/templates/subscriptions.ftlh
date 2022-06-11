<#import "parts/common.ftlh" as c>

<@c.page>
<h3>${userChannel.name}</h3>
    <div>${type}</div>
    <ul class="list-group">
        <#list users as user>
            <li class="list-group-item">
                <a href="/user-messages/${user.id}">${user.getName()}</a>
            </li>
        </#list>
    </ul>
</@c.page>