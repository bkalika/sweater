<#macro login path isRegisterForm>
<form action="${path}" method="post">
    <div class="mb-1">
        <label class="form-label">User Name:</label>
        <div>
            <input type="text" class="form-control ${(nameError??)?string('is-invalid', '')}"
                   name="name" value="<#if user??>${user.name}</#if>" placeholder="Login"/>
            <#if nameError??>
                <div class="invalid-feedback">
                    ${nameError}
                </div>
            </#if>
        </div>
    </div>
    <div class="mb-1">
        <label class="form-label">Password:</label>
        <div>
            <input type="password" class="form-control ${(passwordError??)?string('is-invalid', '')}"
                   name="password" placeholder="Password"/>
            <#if passwordError??>
                <div class="invalid-feedback">
                    ${passwordError}
                </div>
            </#if>
        </div>
    </div>
    <#if isRegisterForm>
        <div class="mb-1">
            <label class="form-label">Password:</label>
            <div>
                <input type="password" class="form-control ${(password2Error??)?string('is-invalid', '')}"
                       name="password2" placeholder="Retype password"/>
                <#if password2Error??>
                    <div class="invalid-feedback">
                        ${password2Error}
                    </div>
                </#if>
            </div>
        </div>
        <div class="mb-1">
            <label class="form-label">Email:</label>
            <div>
                <input type="email" class="form-control ${(emailError??)?string('is-invalid', '')}"
                       name="email" value="<#if user??>${user.email}</#if>" placeholder="mail@mail.com"/>
                <#if emailError??>
                    <div class="invalid-feedback">
                        ${emailError}
                    </div>
                </#if>
            </div>
        </div>
        <div class="col-sm-6">
            <div class="g-recaptcha" data-sitekey="6LdNZV4gAAAAAOvgjwmTFGB9f5aUFXJOzF3e2L-X"></div>
            <#if captchaError??>
                <div class="alert alert-danger" role="alert">
                    ${captchaError}
                </div>
            </#if>
        </div>
    </#if>
    <input type="hidden" name="_csrf" value="${_csrf.token}"/>
    <#if !isRegisterForm><a href="/registration">Sign up</a></#if>
    <button type="submit" class="btn btn-primary"><#if isRegisterForm>Create<#else>Sign In</#if></button>
</form>
</#macro>

<#macro logout>
<form action="/logout" method="post">
    <button type="submit" class="btn btn-primary">Sign Out</button>
    <input type="hidden" name="_csrf" value="${_csrf.token}"/>
</form>
</#macro>
