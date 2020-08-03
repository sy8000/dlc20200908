layui.use(['form', 'table','layer'], function () {
    var $ = layui.jquery,
        form = layui.form,
        table = layui.table,
        layer = layui.layer;

    table.render({
        elem: '#currentTableId',
        url: '/TechEngineerTaskByUser',
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
            title: '提示',
            layEvent: 'LAYTABLE_TIPS',
            icon: 'layui-icon-tips'
        }],
        cols: [
            [
                {field: 'taskId', width: 165, title: '任务单号', sort: true},
                {field: 'taskReportedName', width: 200, title: '任务名称', sort: true},
                {field: 'assginTo', width: 150, title: '测试人员', sort: true},
                {field: 'changedOn', width: 180, title: '提交时间', sort: true},
                {field: 'rptAssginTo', width: 130, title: '所属工程师', sort: true},
                {field: 'cCoaLanguage', width: 110, title: '报告语言', sort: true},
                {field: 'rptRejectCommentS', width: 110, title: '驳回信息', sort: true},
                {field: 'seqNum', width: 100, title: '主键信息', sort: true, hide:true}
            ]
        ],
        limit: 10,
        limits: [10, 20, 30, 40, 50, 100],
        page: true,
        skin: 'line'

    });


    //行双击
    table.on('rowDouble(currentTableFilter)', function(obj){
        var data = obj.data;
        console.log(obj.tr) //得到当前行元素对象
        console.log(obj.data) //得到当前行数据
        // console.log(session.getAttribute("username"));
        layer.confirm('是否开始编辑任务单号为:' + obj.data.taskId +'的报告？', function(index){
            //obj.del(); //删除对应行（tr）的DOM结构
            var loading = layer.load(2);
            //向服务端发送Excel指令
            $.ajax({
                type:"post",
                url:"/lims/TechEngineerEditExcel",
                data:JSON.stringify(data),
                contentType:"application/json;charset=utf-8",
                dataType:"json",
                success:function(res){
                    layer.alert(res.msg);
                }
            });
            layer.close(loading);
            layer.close(index);


        });
    });

    // 监听搜索操作
    form.on('submit(data-search-btn)', function (data) {
        var result = JSON.stringify(data.field);
        /*layer.alert(result, {
            title: '提示'
        });*/

        //执行搜索重载
        table.reload('currentTableId', {
            page: {
                curr: 1
            }
            , where: {
                keyword: result
            }
        }, 'list');

        return false;
    });


});