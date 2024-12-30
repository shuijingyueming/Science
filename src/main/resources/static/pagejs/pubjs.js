document.addEventListener("error", function (e) {
    var elem = e.target;
    if (elem.tagName.toLowerCase() === 'img') {
        elem.src = "static/xtimg/nopic.png";
    }
}, true /* 指定事件处理函数在捕获阶段执行 */);


window.onload = function () {
    var params = window.location.search;
    if (params.indexOf("msg") >= 0) {
        window.history.pushState({}, 0, window.location.pathname + params.replace("msg=", "wang="));
    }
};

function putIn(id,text,listSetName,divclassName,spanid,className,listName) {
    if(id!="")listName.push(id+"#"+text);
    //去重
    listSetName = new Set(listName);
    str = '#';
    listSetName.forEach((val) => {
        str += val.split('#')[0]+'#';
    })
    $(className).val(str);
    let html = ``;
    listSetName.forEach(val => {
        html +=  `<div class=dpcs xs='${val.split('#')[1]}'><image src=./static/images/delicon.png class=`;
        html +=spanid;
        html +=  ` name=`;
        html +=spanid;
        html +=` id=${val.split('#')[0]} value=${val.split('#')[0]} ></image>${val.split('#')[1]}</div>`
    })
    $(divclassName).empty();
    $(divclassName).append(html);
    return listSetName;
}
function putOn(isVal,isText,listSetName,divclassName,spanid,className,listName) {
    listSetName.forEach(val => {
        if(val==isVal+"#"+isText){
            listSetName.delete(val);
        }
    })
    $(className).val("");
    str="#";
    listName.splice(0,listName.length);
    listSetName.forEach((val) => {
        str += val.split('#')[0]+'#';
        listName.push(val);
    })
    $(className).val(str);
    let html = ``;
    listSetName.forEach(val => {
        html +=  `<div class=dpcs xs='${val.split('#')[1]}'><image src=./static/images/delicon.png class=`;
        html +=spanid;
        html +=  ` name=`;
        html +=spanid;
        html +=` id=${val.split('#')[0]} value=${val.split('#')[0]} ></image>${val.split('#')[1]}</div>`
    })
    $(divclassName).empty();
    $(divclassName).append(html);
}

function tofile(){
    // layui.use('layer', function(){
    //     var layer = layui.layer;
    //     var index = layer.load(1, {
    //         content: "保存中",
    //         shade: [0.1, 'black'], //0.1透明度的白色背景
    //         success: function (layero) {
    //             layero.find('.layui-layer-content').css({
    //                 'padding-top': '39px',
    //                 'width': '60px'
    //             });
    //         }
    //     });
    // });
    $.ajax({
        url:'updatefile',
        type:'post',
        async: false,
        cache: false,
        processData: false,
        contentType: false,
        dataType:'json',
        success:function(data) {
            alert(data.msg);
            // window.parent.layer.closeAll();
        },
        error:function(){}
    });
}

function tofile1(){
    // layui.use('layer', function(){
    //     var layer = layui.layer;
    //     var index = layer.load(1, {
    //         content: "保存中",
    //         shade: [0.1, 'black'], //0.1透明度的白色背景
    //         success: function (layero) {
    //             layero.find('.layui-layer-content').css({
    //                 'padding-top': '39px',
    //                 'width': '60px'
    //             });
    //         }
    //     });
    // });
    $.ajax({
        url:'updatefile1',
        type:'post',
        async: false,
        cache: false,
        processData: false,
        contentType: false,
        dataType:'json',
        success:function(data) {
            alert(data.msg)
            // window.parent.layer.closeAll();
        },
        error:function(){}
    });
}