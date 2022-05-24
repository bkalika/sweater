<#import "parts/common.ftlh" as c>

<@c.page>
    <div class="form-row">
        <div class="form-group col-md-6">
            <form method="get" action="/main" class="form-inline">
                <label>
                    <input type="text" name="filter" class="form-control" value="${filter!}"
                           placeholder="Search by tag">
                </label>
                <button type="submit" class="btn btn-primary ml-2">Search</button>
            </form>
        </div>
    </div>

    <div class="mt-3">
        <a class="btn btn-primary" data-bs-toggle="collapse" href="#collapseExample" role="button" aria-expanded="false"
           aria-controls="collapseExample">
            Post new message
        </a>
    </div>
    <div class="collapse" id="collapseExample" style="width: 30rem;">
        <div class="form-group mt-3">
            <form method="post" enctype="multipart/form-data">
                <div class="form-group m-2">
                    <input type="text" name="text" class="form-control" placeholder="Input a message"/>
                </div>
                <div class="form-group m-2">
                    <input type="text" name="tag" class="form-control" placeholder="Tag">
                </div>
                <div class="form-group">
                    <div class="input-group m-2">
                        <input type="file" name="file" class="form-control" id="inputGroupFile04"
                               aria-describedby="inputGroupFileAddon04" aria-label="Upload">
                    </div>
                </div>
                <input type="hidden" name="_csrf" value="${_csrf.token}"/>
                <div class="form-group m-2">
                    <button type="submit" class="btn btn-primary">Post</button>
                </div>
            </form>
        </div>
    </div>
    <div class="row row-cols-1 row-cols-md-3 g-4">
        <#list messages as message>
            <div class="col">
                <div class="card my-3">
                    <#--            <b>${message.id}</b>-->
                    <div>
                        <#if message.filename??>
                            <img class="card-img-top" src="/img/${message.filename}" alt="File">
                        </#if>
                    </div>
                    <div class="m-2">
                        <span>${message.text}</span>
                        <i>${message.tag}</i>
                    </div>
                    <div class="card-footer text-muted">
                        <strong>${message.authorName}</strong>
                    </div>
                </div>
            </div>
        <#else>
            No messages
        </#list>
    </div>
</@c.page>
