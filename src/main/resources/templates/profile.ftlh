<#import "parts/common.ftlh" as c>

<@c.page>
    <h5>${name}</h5>
    ${message!}
    <form method="post">
            <div class="mb-1">
                <label class="form-label">Email:</label>
                <div>
                    <label>
                        <input type="email" class="form-control" name="email" placeholder="mail@mail.com"/>
                    </label>
                </div>
            </div>
        <div class="mb-1">
            <label class="form-label">Password:</label>
            <div>
                <label>
                    <input type="password" class="form-control" name="password" placeholder="Password" value="${email!''}"/>
                </label>
            </div>
        </div>
        <input type="hidden" name="_csrf" value="${_csrf.token}"/>
        <#if isRegisterForm??><a href="/registration">Sign up</a></#if>
        <button type="submit" class="btn btn-primary">Save</button>
    </form>
</@c.page>
