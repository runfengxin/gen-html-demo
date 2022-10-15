<!DOCTYPE html>
<html>
<style>
    table {
        border-right: 1px solid #000000;
        border-bottom: 1px solid #000000;
        text-align: center;
    }

    table th {
        border-left: 1px solid #000000;
        border-top: 1px solid #000000;
    }

    table td {
        border-left: 1px solid #000000;
        border-top: 1px solid #000000;
    }
</style>
<head>
    <meta charset="utf-8">
    <title>Hello World!</title>
</head>
<body>
Hello ${name}!
<br/>
<table>
    <tr>
        <td>序号</td>
        <td>姓名</td>
        <td>年龄</td>
        <td>学号</td>
    </tr>
    <#list stus as stu>
        <tr>
            <td>${stu_index + 1}</td>
            <td <#if stu.name =='小明'>style="background:blue;"</#if>>${stu.name}</td>
            <td>${stu.age}</td>
            <td >${stu.number?c}</td>
        </tr>
    </#list>

</table>
<br/><br/>

<table>
    <tr>
        <td>姓名</td>
        <td>年龄</td>
        <td>出生日期</td>
        <td>学号</td>
        <td>最好的朋友</td>
        <td>朋友个数</td>
        <td>朋友列表</td>
    </tr>
    <#if stus??>
        <#list stus as stu>
            <tr>
                <td>${stu.name!''}</td>
                <td>${stu.age}</td>
                <td>${(stu.birthday?date)!''}</td>
                <td>${stu.number?c}</td>
                <td>${(stu.bestFriend.name)!''}</td>
                <td>${(stu.friends?size)!0}</td>
                <td>
                    <#if stu.friends??>
                        <#list stu.friends as firend>
                            ${firend.name!''}<br/>
                        </#list>
                    </#if>
                </td>
            </tr>
        </#list>
    </#if>

</table>
<br/>

</body>
</html>