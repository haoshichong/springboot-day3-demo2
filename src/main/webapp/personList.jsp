<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>CityList</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/easyUI/themes/default/easyui.css"/>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/easyUI/themes/icon.css"/>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-2.2.4.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/easyUI/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/easyUI/easyui-lang-zh_CN.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#personTable").datagrid({
                title:'Person List',
                fitColumns: true,
                url: '${pageContext.request.contextPath}/person/all',
                striped: true,
                pagination: true,
                pageSize: 5,
                pageList: [3, 5, 10, 20]
            });
        });
    </script>
</head>
<body>
<table id="personTable">
    <thead>
        <tr>
            <th data-options="field:'id',width:1"></th>
            <th data-options="field:'name',width:1"></th>
            <th data-options="field:'mobile',width:1"></th>
            <th data-options="field:'email',width:1"></th>
            <th data-options="field:'city',width:1"></th>
            <th data-options="field:'birthday',width:1"></th>
        </tr>
    </thead>
</table>
</body>
</html>
