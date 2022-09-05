<#include "security.ftlh">
<#import "pager.ftlh" as p>

<@p.pager url page></@p.pager>

<div class="row row-cols-1 row-cols-md-3 g-4" id="message-list">
    <#list page.content as message>
        <div class="col">
            <div class="card my-3" data-id="${message.id}">
                <#--            <b>${message.id}</b>-->
                <div>
                    <#if message.filename??>
                        <img class="card-img-top" src="/img/${message.filename}" alt="File" />
                    </#if>
                </div>
                <div class="m-2">
                    <span>${message.text}</span><br/>
                    <i>#${message.tag}</i>
                </div>
                <div class="card-footer text-muted container">
                    <div class="row">
                        <a class="col align-self-center" href="/user-messages/${message.author.id}">${message.authorName}</a>
                        <a class="col align-self-center" href="/messages/${message.id}/like">
                            <#if message.meLiked>
                                <i class="fas fa-heart"></i>
                            <#else>
                                <i class="far fa-heart"></i>
                            </#if>
                            ${message.likes}
                        </a>
                        <#if message.author.id == currentUserId>
                            <a class="btn btn-primary" href="/user-messages/${message.author.id}?message=${message.id}">Edit</a>
                            <a class="col btn btn-warning" href="/del-user-messages/${message.author.id}?message=${message.id}">Delete</a>
                        </#if>
                    </div>
                </div>
            </div>
        </div>
    <#else>
        No messages
    </#list>
</div>

<@p.pager url page></@p.pager>