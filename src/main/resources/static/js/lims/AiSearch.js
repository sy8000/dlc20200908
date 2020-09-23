//智能联查按钮
function changeBtnable() {
    if ($('#taskid').val()) {
        $('#billsearch').addClass('layui-btn');
        $('#billsearch').removeClass('layui-btn-disabled');
    } else {
        $('#billsearch').addClass('layui-btn-disabled');
    }
}