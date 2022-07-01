<#import "parts/common.ftlh" as c>
<@c.page>
    User editor
    <form action="/users" method="post">
        <label>
            <input type="text" name="name" value="${user.name}" />
        </label>
        <#list roles as role>
            <div>
                <label>
                    <input type="checkbox" name="${role}" ${user.roles?seq_contains(role)?string("checked", "")} />${role}
                </label>
            </div>
        </#list>
        <label>
            <input type="hidden" value="${user.id}" name="userId" />
        </label>
        <label>
            <input type="hidden" value="${_csrf.token}" name="_csrf" />
        </label>
        <button type="submit">Save</button>
    </form>
</@c.page>
