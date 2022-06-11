<#import "parts/common.ftlh" as c>

<@c.page>
    <h3>${userChannel.name}</h3>
    <#if !isCurrentUser>
        <#if isSubscriber>
            <a class="btn btn-info" href="/users/unsubscribe/${userChannel.id}">Unsubscribe</a>
        <#else>
            <a class="btn btn-info" href="/users/subscribe/${userChannel.id}">Subscribe</a>
        </#if>
    </#if>
    <div class="col">
        <div class="col">
            <div class="card">
                <div class="card=body">
                    <div class="card-title">Subscriptions</div>
                    <div class="card-text">
                        <h3 class="card-text">
                           <a href="/users/subscriptions/${userChannel.id}/list">${subscriptionCount}</a>
                        </h3>
                    </div>
                </div>
            </div>
            <div class="card">
                <div class="card=body">
                    <div class="card-title">Subscribers</div>
                    <div class="card-text">
                        <h3 class="card-text">
                            <a href="/users/subscribers/${userChannel.id}/list">${subscribersCount}</a>
                        </h3>
                    </div>
                </div>
            </div>
        </div>
        <div class="col">
            <div class="card"></div>
        </div>
    </div>
<#if isCurrentUser>
    <#include "parts/messageEdit.ftlh"/>
</#if>
    <#include "parts/messageList.ftlh"/>

</@c.page>
