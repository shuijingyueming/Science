var encrypt = new JSEncrypt();
encrypt.setPublicKey("MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDXajYcIi2XXwXoKgH0JWxh1rgUdPjgJFAvmNitLQseMIhiF1vO+kNLHGCImQKcHScC4/UL1HJSY0dHsiOn8q5ydWFIt7UwxUddiSP5rjAoASYR6K6WKCkpUsPOk3a2/hm6t0DEyje9bLMuUjaTpylFBzkNfY1rp3iOtwNJkUd2nQIDAQAB");
var regex = new RegExp('(?=.*[0-9])(?=.*[A-Z])(?=.*[a-z])(?=.*[^a-zA-Z0-9]).{8,20}');

function login() {
    var name = $("input[type='text']").val();
    var pwd = $("input[type='password']").val();
    var regex = new RegExp('(?=.*[0-9])(?=.*[A-Z])(?=.*[a-z])(?=.*[^a-zA-Z0-9]).{8,20}');
    if(name!=""&&pwd!=""){
        if(!regex.test(pwd)){
            $.notify({
                message: '密码中必须包含字母、数字、特殊字符,至少8个字符，最多20个字符',
            },{
                type: 'danger',
                placement: {
                    from: 'top',
                    align: 'right'
                },
                z_index: 10800,
                delay: 1500,
                animate: {
                    enter: 'animate__animated animate__shakeX',
                    exit: 'animate__animated animate__fadeOutDown'
                }
            });
        }else{
            $.ajax({
                url:'tologin1',
                type:'post',
                data:{'username': encrypt.encrypt(name),'userpwd': encrypt.encrypt(pwd)},
                async: false,
                dataType:'json',
                success:function(data) {
                    if(data.msg!="0"){
                        if(data.msg=="1"){
                            window.parent.parent.login("D");
                        }else{
                            layui.use('layer', function(){
                                var layer = layui.layer;
                                layer.ready(function(){
                                    layer.msg(data.msg);
                                });
                            });
                        }
                    }else{
                        layui.use('layer', function(){
                            var layer = layui.layer;
                            layer.ready(function(){
                                layer.msg("登录成功");
                            });
                        });
                        setTimeout(function(){
                            window.parent.parent.location.href=data.url;
                        },1000);
                    }
                },
                error:function(){	}
            });
        }
    }else{
        if(name==""){
            layer.msg("用户名不能为空");
        }else if(pwd==""){
            layer.msg("密码不能为空");
        }
    }
}
