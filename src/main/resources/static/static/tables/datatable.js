$(document).ready(function () {
    $('#example').DataTable();

    $('#logexm').DataTable({
        "searching": true,
        "info": false,
        "paging": false,
        dom: 'Bfrtip',
        buttons: [
            {text: '全部删除',action: function ( e, dt, node, config ) {del('');},}
        ],
        "columnDefs": [{
            "orderable": false,
            "targets": [0]
        }]
    });
    $('#staffexm').DataTable({
        "searching": true,
        "info": false,
        "paging": false,
        dom: 'Bfrtip',
        buttons: [
            {
                iTname: '#editmode', text: '添加', action: function (e, dt, node, config) {
                    edit();
                }
            },
        ],
        "columnDefs": [{
            "orderable": false,
            "targets": [0]
        }]
    });

    $('#levelexm').DataTable({
        "searching": true,
        "info": false,
        "paging": false,
        dom: 'Bfrtip',
        buttons: [
            $("#jstype").val()=="A"?{
                iTname: '#editmode', text: '添加', action: function (e, dt, node, config) {
                    edit();
                }
            }:undefined,
            $("#jstype").val()=="A"?{
                text: '下载模板', action: function (e, dt, node, config) {
                    xzmb();
                }
            }:undefined,
            $("#jstype").val()=="A"?{
                text: '导入', action: function (e, dt, node, config) {
                    drlevel();
                }
            }:undefined,
            $("#jstype").val()=="A"?{
                text: '下载选课方模板', action: function (e, dt, node, config) {
                    xzxkmb();
                }
            }:undefined,
        ],
        "columnDefs": [{
            "orderable": false,
            "targets": [0]
        }]
    });

    $('#choseexm').DataTable({
        "searching": true,
        "info": false,
        "paging": false,
        dom: 'Bfrtip',
        buttons: [
            $("#jstype").val()=="A"?{
                iTname: '#editmode', text: '添加', action: function (e, dt, node, config) {
                    edit();
                }
            }:undefined,
            // {text: '下载模板',action: function ( e, dt, node, config ) {xzmb();}},
            // {text: '导入',action: function ( e, dt, node, config ) {drlevel();}}
        ],
        "columnDefs": [{
            "orderable": false,
            "targets": [0]
        }]
    });

    $('#courselxexm').DataTable({
        "searching": true,
        "info": false,
        "paging": false,
        dom: 'Bfrtip',
        buttons: [
            {
                iTname: '#editmode', text: '添加', action: function (e, dt, node, config) {
                    edit();
                }
            },
        ],
        "columnDefs": [{
            "orderable": false,
            "targets": [0]
        }]
    });

    $('#courseexm').DataTable({
        "searching": true,
        "info": false,
        "paging": false,
        dom: 'Bfrtip',
        buttons: [
            $("#jstype").val()=="B"?{
                iTname: '#editmode', text: '添加', action: function (e, dt, node, config) {
                    edit();
                }
            }:undefined,
        ],
        "columnDefs": [{
            "orderable": false,
            "targets": [0]
        }]
    });

    $('#courselsexm').DataTable({
        "searching": true,
        "info": false,
        "paging": false,
        dom: 'Bfrtip',
        buttons: [
            {
                text: '返回', action: function (e, dt, node, config) {
                    reback();
                }
            },
            $("#jstype").val()=="B"?{
                iTname: '#editmode', text: '添加', action: function (e, dt, node, config) {
                    edit();
                }
            }:undefined,
        ],
        "columnDefs": [{
            "orderable": false,
            "targets": [0]
        }]
    });

    $('#selectexm').DataTable({
        "searching": true,
        "info": false,
        "paging": false,
        dom: 'Bfrtip',
        buttons: [
           /*{
                iTname: '#editmode', text: '添加', action: function (e, dt, node, config) {
                    edit();
                }
            },*/
        ],
        "columnDefs": [{
            "orderable": false,
            "targets": [0]
        }]
    });

    $('#selectionexm').DataTable({
        "searching": true,
        "info": false,
        "paging": false,
        dom: 'Bfrtip',
        buttons: [
            $("#fhlx").val()=="LE"?{text: '返回', action: function (e, dt, node, config) {tole();}}:undefined,
            $("#fhlx").val()=="XK"?{text: '返回', action: function (e, dt, node, config) {toxk();}}:undefined,
            $("#jstype").val()!="A"&&$("#ztype").val()=="A"?{
                iTname: '#yymode', text: '课程预约'
            }:undefined,
            $("#jstype").val()!="A"&&$("#ztype").val()=="C"?{text: '导出', action: function (e, dt, node, config) {todc();}}:undefined,
        ],
        "columnDefs": [{
            "orderable": false,
            "targets": [0]
        }]
    });

    $('#newsexm').DataTable({
        "searching": true,
        "info": false,
        "paging": false,
        dom: 'Bfrtip',
        buttons: [
            {
                iTname: '#editmode', text: '添加', action: function (e, dt, node, config) {
                    edit();
                }
            },
        ],
        "columnDefs": [{
            "orderable": false,
            "targets": [0]
        }]
    });

    $('#newsaexm').DataTable({
        "searching": true,
        "info": false,
        "paging": false,
        dom: 'Bfrtip',
        buttons: [
        ],
        "columnDefs": [{
            "orderable": false,
            "targets": [0]
        }]
    });


    $('#tjskexm').DataTable({
        "searching": true,
        "info": false,
        "paging": false,
        dom: 'Bfrtip',
        buttons: [],
        "columnDefs": [{
            "orderable": false,
            "targets": [0]
        }]
    });

    $('#tjpjskexm').DataTable({
        "searching": true,
        "info": false,
        "paging": false,
        dom: 'Bfrtip',
        buttons: [],
        "columnDefs": [{
            "orderable": false,
            "targets": [0]
        }]
    });
    $('#tjxkexm').DataTable({
        "searching": true,
        "info": false,
        "paging": false,
        dom: 'Bfrtip',
        buttons: [],
        "columnDefs": [{
            "orderable": false,
            "targets": [0]
        }]
    });
    $('#tjjtbtexm').DataTable({
        "searching": true,
        "info": false,
        "paging": false,
        dom: 'Bfrtip',
        buttons: [],
        "columnDefs": [{
            "orderable": false,
            "targets": [0]
        }]
    });
    $('#tjxkexm1').DataTable({
        "searching": true,
        "info": false,
        "paging": false,
        dom: 'Bfrtip',
        buttons: [],
        "columnDefs": [{
            "orderable": false,
            "targets": [0]
        }]
    });


    $('#tjpjxkexm').DataTable({
        "searching": true,
        "info": false,
        "paging": false,
        dom: 'Bfrtip',
        buttons: [],
        "columnDefs": [{
            "orderable": false,
            "targets": [0]
        }]
    });

    $('#tjpjxkexm1').DataTable({
        "searching": true,
        "info": false,
        "paging": false,
        dom: 'Bfrtip',
        buttons: [],
        "columnDefs": [{
            "orderable": false,
            "targets": [0]
        }]
    });

    $('#tjselectionexm').DataTable({
        "searching": true,
        "info": false,
        "paging": false,
        dom: 'Bfrtip',
        buttons: [
            $("#fhlx").val()=="SK"?{text: '返回', action: function (e, dt, node, config) {tosk();}}:undefined,
            $("#fhlx").val()=="XK"?{text: '返回', action: function (e, dt, node, config) {toxk();}}:undefined,
            $("#fhlx").val()=="SK"?{text: '导出', action: function (e, dt, node, config) {todc();}}:undefined,
        ],
        "columnDefs": [{
            "orderable": false,
            "targets": [0]
        }]
    });
})
