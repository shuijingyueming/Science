$(document).ready(function () {
    $('#example').DataTable();

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
            {
                iTname: '#editmode', text: '添加', action: function (e, dt, node, config) {
                    edit();
                }
            },
            {
                text: '下载模板', action: function (e, dt, node, config) {
                    xzmb();
                }
            },
            {
                text: '导入', action: function (e, dt, node, config) {
                    drlevel();
                }
            },
            {
                text: '下载选课方模板', action: function (e, dt, node, config) {
                    xzxkmb();
                }
            },
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
            {
                iTname: '#editmode', text: '添加', action: function (e, dt, node, config) {
                    edit();
                }
            },
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
})
