<#import "parts/common.ftlh" as c>
<#import "parts/login.ftlh" as l>

<@c.page>
    <div>
        <@l.logout/>
        <span><a href="/users">User list</a> </span>
    </div>
    <div>
        <form method="post" enctype="multipart/form-data">
            <label>
                <input type="text" name="text" placeholder="Input a message"/>
            </label>
            <label>
                <input type="text" name="tag" placeholder="Tag">
            </label>
            <label>
                <input type="file" name="file">
            </label>
            <input type="hidden" name="_csrf" value="${_csrf.token}"/>

            <button type="submit">Post</button>
        </form>
    </div>
    <div>List of messages</div>
    <form method="get" action="/main">
        <label>
            <input type="text" name="filter" value="${filter!}">
        </label>
        <button type="submit">Search</button>
    </form>
    <#list messages as message>
    <div>
        <b>${message.id}</b>
        <span>${message.text}</span>
        <i>${message.tag}</i>
        <strong>${message.authorName}</strong>
        <div>
            <#if message.filename??>
                <img src="/img/${message.filename}" alt="File">
            </#if>
        </div>
    </div>
        <#else>
        No messages
    </#list>
</@c.page>
