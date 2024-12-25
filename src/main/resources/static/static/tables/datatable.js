$(document).ready(function () {
    $('#example').DataTable();

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
