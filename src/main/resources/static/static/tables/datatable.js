$(document).ready(function () {
    $('#example').DataTable();

    $('#staffexm').DataTable({
        "searching":true,
        "info":false,
        "paging": false,
        dom: 'Bfrtip',
        buttons:[
            {iTname:'#editmode',text: '添加',action: function ( e, dt, node, config ) {edit();}},
        ],
        "columnDefs": [ {
            "orderable": false,
            "targets": [0]
        }]
    });

    $('#levelexm').DataTable({
        "searching":true,
        "info":false,
        "paging": false,
        dom: 'Bfrtip',
        buttons:[
            {iTname:'#editmode',text: '添加',action: function ( e, dt, node, config ) {edit();}},
            {text: '下载模板',action: function ( e, dt, node, config ) {xzmb();}},
            {text: '导入',action: function ( e, dt, node, config ) {drlevel();}}
        ],
        "columnDefs": [ {
            "orderable": false,
            "targets": [0]
        }]
    });

    $('#selectexm').DataTable({
        "searching":true,
        "info":false,
        "paging": false,
        dom: 'Bfrtip',
        buttons:[
            {iTname:'#editmode',text: '添加',action: function ( e, dt, node, config ) {edit();}},
        ],
        "columnDefs": [ {
            "orderable": false,
            "targets": [0]
        }]
    });


    $('#courselxexm').DataTable({
        "searching":true,
        "info":false,
        "paging": false,
        dom: 'Bfrtip',
        buttons:[
            {iTname:'#editmode',text: '添加',action: function ( e, dt, node, config ) {edit();}},
        ],
        "columnDefs": [ {
            "orderable": false,
            "targets": [0]
        }]
    });


    $('#courseexm').DataTable({
        "searching":true,
        "info":false,
        "paging": false,
        dom: 'Bfrtip',
        buttons:[
            {iTname:'#editmode',text: '添加',action: function ( e, dt, node, config ) {edit();}},
        ],
        "columnDefs": [ {
            "orderable": false,
            "targets": [0]
        }]
    });

    $('#courselsexm').DataTable({
        "searching":true,
        "info":false,
        "paging": false,
        dom: 'Bfrtip',
        buttons:[
            {text: '返回',action: function ( e, dt, node, config ) {reback();}},
            {iTname:'#editmode',text: '添加',action: function ( e, dt, node, config ) {edit();}},
        ],
        "columnDefs": [ {
            "orderable": false,
            "targets": [0]
        }]
    });

    $('#xhhexm').DataTable({
         "searching":false,
        "info":false,
        "paging": false,
        dom: 'Bfrtip',
        buttons:[{text: '添加',action: function ( e, dt, node, config ) {
                $('#addoredit_a')[0].click();
            }}
        ],
        "columnDefs": [ {
            "orderable": false,
            "targets": [0,2]
        }]
    });

    $('#sdcon').DataTable({
        "searching":true,
        "info":false,
        "paging": false,
        dom: 'Bfrtip',
        buttons:[{text: '添加',action: function ( e, dt, node, config ) {
                $('#addoredit_a')[0].click();
            }}
        ],
        "columnDefs": [ {
            "orderable": false,
            "targets": [0,3,4]
        }]
    });

    $('#fjcon').DataTable({
        "searching":true,
        "info":false,
        "paging": false,
        dom: 'Bfrtip',
        buttons:[{text: '添加',action: function ( e, dt, node, config ) {
                $('#addoredit_a')[0].click();
            }},
            {text: '返回内容页',action: function ( e, dt, node, config ) {
                    gobackpage();
                }}
        ],
        "columnDefs": [ {
            "orderable": false,
            "targets": [0,3,4]
        }]
    });
});
