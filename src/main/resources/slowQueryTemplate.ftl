<html>
<head>
    <title>啦啦啦啦啦</title>
</head>
<body>
<h1>侠客行</h1>
<p>${author!}</P>
<#if (poem?size)!=0>
    <#list poem as item>
        <p>${item.first!}${item.second!}</p></br>
    </#list>
</#if>
</body>
</html>