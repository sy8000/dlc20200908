layui.use(['form', 'table', 'layer', 'laydate','upload'], function () {
    $(document).ready(function () {

        var $ = layui.jquery,
            form = layui.form,
            table = layui.table,
            util = layui.util,
            layer = layui.layer,
            upload = layui.upload,
            laydate = layui.laydate;
    });

    table.render({
        elem: '#currentTableId',
        url: '/AllTaskProgess',
        method:'post',
        toolbar: '#toolbarDemo',
        request: {
            pageName: 'page' //页码的参数名称，默认：page
            , limitName: 'limit' //每页数据量的参数名，默认：limit
        },
        response: {
            statusName: 'code' //数据状态的字段名称，默认：code
            , statusCode: 0 //成功的状态码，默认：0
            , countName: 'totals' //数据总数的字段名称，默认：count
            , dataName: 'list' //数据列表的字段名称，默认：data
        },
        defaultToolbar: ['filter', 'exports', 'print', {
            title: '报告导出',
            layEvent: 'LAYTABLE_TIPS',
            icon: 'layui-icon-tips'
        }],
        cols: [
            [
                {type: "checkbox", width: 50, fixed: 'left' },
                {field: 'taskcode', width: 165, title: '任务单号', sort: true},
                {field: 'billTitle', width: 165, title: '委托单名称', sort: true},
                {field: 'testPurpose', width: 165, title: '测试目的', sort: true},
                {field: 'creatTime', width: 120, title: '创建时间', sort: true},
                {field: 'ManagerTime', width: 120, title: '主管审批时间', sort: true},
                {field: 'TechTime', width: 120, title: '技术审批时间', sort: true},
                {field: 'creator', width: 80, title: '创建人', sort: true},
                {field: 'contact', width: 80, title: '联系人', sort: true},
                {field: 'billStatus', width: 100, title: '任务状态', sort: true}
            ]
        ],
        limit: 10,
        limits: [10, 20, 30, 40, 50, 100, 500],
        page: true,
        skin: 'line'

    });


});