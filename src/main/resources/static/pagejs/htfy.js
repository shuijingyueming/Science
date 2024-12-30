var dqys = 0;

//判断页数 zys：总页数  dqy：当前页
function pdyes(zys, dqy) {
    var html = '<div class="layui-form layui-col-md12 x-so"><a href="javascript:void(0);" style="margin-left:2px;margin-right:2px;" onclick="fanye(1)">&lt;&lt;</a>';

    html += '<a href="javascript:void(0);" style="margin-left:2px;margin-right:2px;" onclick="fanye(' + ((parseInt(dqy) - 1) < 1 ? 1 : (parseInt(dqy) - 1)) + ')">&lt;</a>';

    if (zys > 5) {
        var ks = dqy > 5 ? (dqy - 4) : 1;//循环从第几个开始

        var wy = parseInt(ks) + 4;//循环到第几个结束

        for (var i = ks; i <= wy; i++) {
            if (i == dqy) {
                html += '<span class="current" style="margin-left:2px;margin-right:2px;cursor: pointer;" onclick="fanye(' + i + ')">' + i + '</span>';
            } else {
                html += '<span style="margin-left:2px;margin-right:2px;cursor: pointer;" onclick="fanye(' + i + ')">' + i + '</span>';
            }
        }

        if (dqy < zys) html += '<span style="margin-left:2px;margin-right:2px;">...</span>';
    } else {
        for (var i = 1; i <= zys; i++) {
            if (i == dqy) {
                html += '<span class="current" style="margin-left:2px;margin-right:2px;cursor: pointer;" onclick="fanye(' + i + ')">' + i + '</span>';
            } else {
                html += '<span style="margin-left:2px;margin-right:2px;cursor: pointer;" onclick="fanye(' + i + ')">' + i + '</span>';
            }
        }
    }

    html += '<a href="javascript:void(0);" style="margin-left:2px;margin-right:2px;" onclick="fanye(' + ((parseInt(dqy) + 1) > zys ? zys : (parseInt(dqy) + 1)) + ')">&gt;</a>';
    html += '<a href="javascript:void(0);" style="margin-left:2px;margin-right:2px;" onclick="fanye(' + zys + ')">&gt;&gt;</a>' +
        '共' + zys + '页，到第<input class="layui-input" style="width: 50px;margin-left:2px;margin-right:2px;text-align:center;" id="pagesize" onchange="this.value>' + zys + '?this.value=' + zys + ':this.value=this.value">页' +
        '<button class="layui-btn layui-btn-green" style="margin-left:2px;margin-right:2px;" onclick="fanye($(\'#pagesize\').val());">go</button>' +
        '</div>';
    $(".page").html(html);
}

function getTime(timestamp, option){
    var date = new Date(timestamp)
    var year = date.getFullYear()
    var month = date.getMonth() + 1
    var day = date.getDate()
    var week = date.getDay()
    var hour = date.getHours()
    var minute = date.getMinutes()
    var second = date.getSeconds()

    //获取 年月日 时分
    if (option == 'YY-MM-DD HH:mm')  return [year, month, day].map(formatNumber).join('.') + ' ' + [hour, minute].map(formatNumber).join(':')

    //获取 年月日
    if (option == 'YY/MM/DD') return [year, month, day].map(formatNumber).join('/')
    if (option == 'YY-MM-DD') return [year, month, day].map(formatNumber).join('-')

    //获取 年月
    if (option == 'YY-MM') return [year, month].map(formatNumber).join('-')

    //获取 年
    if (option == 'YY') return [year].map(formatNumber).toString()

    //获取 月
    if (option == 'MM') return  [mont].map(formatNumber).toString()

    //获取 日
    if (option == 'DD') return [day].map(formatNumber).toString()

    //获取 年月日 周一 至 周日
    if (option == 'YY-MM-DD Week')  return [year, month, day].map(formatNumber).join('-') + ' ' + getWeek(week)

    //获取 月日 周一 至 周日
    if (option == 'MM-DD Week')  return [month, day].map(formatNumber).join('-') + ' ' + getWeek(week)

    //获取 周一 至 周日
    if (option == 'Week')  return getWeek(week)

    //获取 时分秒
    if (option == 'hh-mm-ss') return [hour, minute, second].map(formatNumber).join(':')

    //获取 时分
    if (option == 'hh-mm') return [hour, minute].map(formatNumber).join(':')

    //获取 分秒
    if (option == 'mm-dd') return [minute, second].map(formatNumber).join(':')

    //获取 时
    if (option == 'hh')  return [hour].map(formatNumber).toString()

    //获取 分
    if (option == 'mm')  return [minute].map(formatNumber).toString()

    //获取 秒
    if (option == 'ss') return [second].map(formatNumber).toString()

    //获取 年月日

    //默认 时分秒 年月日
    return [year, month, day].map(formatNumber).join('.') + ' ' + [hour, minute, second].map(formatNumber).join(':')
}

function formatNumber(n) {
    n = n.toString()
    return n[1] ? n : '0' + n
}

function getWeek(n) {
    switch (n) {
        case 1:
            return '星期一'
        case 2:
            return '星期二'
        case 3:
            return '星期三'
        case 4:
            return '星期四'
        case 5:
            return '星期五'
        case 6:
            return '星期六'
        case 7:
            return '星期日'
    }
}

function striongTOjsonString(obj){
    obj = obj.replace(/\s+/g,'');
    obj = obj.substring(obj.indexOf("["));
    obj = obj.replaceAll("[","{\"");
    obj = obj.replaceAll("]","\"}");
    obj = obj.replaceAll("=","\":\"");
    obj = obj.replaceAll(",","\",\"");
    return JSON.parse(obj);
}

function jsStringTojsonString(obj){
    obj = obj.replaceAll("{","{\"");
    obj = obj.replaceAll("}","\"}");
    obj = obj.replaceAll("=","\":\"");
    obj = obj.replaceAll(",","\",\"");
    obj = obj.replaceAll("\"[","[");
    obj = obj.replaceAll("]\"","]");
    obj = obj.replaceAll("}\",\"{","},{");
    obj = obj.replaceAll("http\":\"//","http://");
    obj = obj.replaceAll(":\"{",":{");
    obj = obj.replaceAll("}\"}","}}");
    obj = obj.replaceAll("}\",","},");
    return JSON.parse(obj);
}

//提交表单
function form_submit(url, method, params, target) {
    var form = document.createElement("form");//创建一个表单
    form.setAttribute("method", method);//设置form表单的method属性
    form.setAttribute("action", url);
    form.setAttribute("target", target);
    for (var i = 0; i < params.length; i++) {
        var hiddenField = document.createElement("input");
        hiddenField.setAttribute("type", "hidden");
        hiddenField.setAttribute("name", params[i][0]);
        hiddenField.setAttribute("value", params[i][1]);
        form.appendChild(hiddenField);
    }
    document.body.appendChild(form);
    form.submit();
}