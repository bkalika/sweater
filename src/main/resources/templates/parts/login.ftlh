<#macro login path isRegisterForm>
<form action="${path}" method="post">
    <div class="mb-1">
        <label class="form-label">User Name:</label>
        <div>
            <input type="text" class="form-control" name="name" placeholder="Login"/>
        </div>
    </div>
    <#if isRegisterForm>
    <div class="mb-1">
        <label class="form-label">Email:</label>
        <div>
            <input type="email" class="form-control" name="email" placeholder="mail@mail.com"/>
        </div>
    </div>
    </#if>
    <div class="mb-1">
        <label class="form-label">Password:</label>
        <div>
            <input type="password" class="form-control" name="password" placeholder="Password"/>
        </div>
    </div>
    <input type="hidden" name="_csrf" value="${_csrf.token}"/>
    <#if !isRegisterForm><a href="/register">Sign up</a></#if>
    <button type="submit" class="btn btn-primary"><#if isRegisterForm>Create<#else>Sign In</#if></button>
</form>
</#macro>

<#macro logout>
<form action="/logout" method="post">
    <button type="submit" class="btn btn-primary">Sign Out</button>
    <input type="hidden" name="_csrf" value="${_csrf.token}"/>
</form>
</#macro>
