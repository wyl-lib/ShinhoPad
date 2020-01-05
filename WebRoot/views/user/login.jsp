<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
  <head>
  	<link rel="Shortcut Icon" href="../../static/image/logo.png" />
    <%-- <base href="<%=basePath%>"> --%>
    <title>员工登录</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" href="../../layuiadmin/layui/css/layui.css" media="all">
  	<link rel="stylesheet" href="../../layuiadmin/style/admin.css" media="all">
  	<link rel="stylesheet" href="../../layuiadmin/style/login.css" media="all">
	<link rel="stylesheet" href="../../views/user/assets/css/supersized.css" type="text/css"></link>
	<style>
		body {
		     background: none;
		}
	  	.layadmin-user-login-main {
	    	background-color: rgba(29, 30, 30, 0.5);
	    	border-radius:13px
		}
		.layadmin-user-login-header h2 {
		    color: #b9bcc6;
		}
  </style>
  </head>
  
  <body>
  <div class="layadmin-user-login layadmin-user-display-show" id="LAY-user-login" style="display: none;">
    <div class="layadmin-user-login-main" style="margin-top: 135px;">
      <div class="layadmin-user-login-box layadmin-user-login-header ">
        <h2><strong>臻焙课工坊员工端</strong></h2>
      </div>
      <div class="layadmin-user-login-box layadmin-user-login-body layui-form">
        <div class="layui-form-item">
          <label class="layadmin-user-login-icon layui-icon layui-icon-username" for="LAY-user-login-username"></label>
          <input type="text" name="username" id="LAY-user-login-username" lay-verify="required" placeholder="用户名" class="layui-input">
        </div>
        <div class="layui-form-item">
          <label class="layadmin-user-login-icon layui-icon layui-icon-password" for="LAY-user-login-password"></label>
          <input type="password" name="password" id="LAY-user-login-password" lay-verify="required" placeholder="密码" class="layui-input">
          <input type="hidden" name="action" value="login">
        </div>
        <div class="layui-form-item">
          <div class="layui-row">
            <div class="layui-col-xs7">
              <label class="layadmin-user-login-icon layui-icon layui-icon-vercode" for="LAY-user-login-vercode"></label>
              <input type="text" name="vercode" id="LAY-user-login-vercode" lay-verify="required" placeholder="图形验证码" class="layui-input">
            </div>
            <div class="layui-col-xs5">
              <div style="margin-left: 10px;">
                <img src="" class="layadmin-user-login-codeimg" id="LAY-user-get-vercode">
              </div>
            </div>
          </div>
        </div>
        <!-- <div class="layui-form-item" style="margin-bottom: 20px;">
          <input type="checkbox" name="remember" lay-skin="primary" title="记住密码">
          <a href="forget.html" class="layadmin-user-jump-change layadmin-link" style="margin-top: 7px;">忘记密码？</a>
        </div> -->
        <div class="layui-form-item" style="margin-top: 35px;">
          <button class="layui-btn layui-btn-fluid" lay-submit lay-filter="LAY-user-login-submit">登 入</button>
        </div>
        <!-- <div class="layui-trans layui-form-item layadmin-user-login-other">
          <label>社交账号登入</label>
          <a href="javascript:;"><i class="layui-icon layui-icon-login-qq"></i></a>
          <a href="javascript:;"><i class="layui-icon layui-icon-login-wechat"></i></a>
          <a href="javascript:;"><i class="layui-icon layui-icon-login-weibo"></i></a>
          
          <a href="reg.html" class="layadmin-user-jump-change layadmin-link">注册帐号</a>
        </div> -->
      </div>
    </div>
    
    
    <!--<div class="ladmin-user-login-theme">
      <script type="text/html" template>
        <ul>
          <li data-theme=""><img src="{{ layui.setter.base }}style/res/bg-none.jpg"></li>
          <li data-theme="#03152A" style="background-color: #03152A;"></li>
          <li data-theme="#2E241B" style="background-color: #2E241B;"></li>
          <li data-theme="#50314F" style="background-color: #50314F;"></li>
          <li data-theme="#344058" style="background-color: #344058;"></li>
          <li data-theme="#20222A" style="background-color: #20222A;"></li>
        </ul>
      </script>
    </div>-->
    
  </div>

  <script src="../../layuiadmin/layui/layui.js"></script>
  <script type="text/javascript" src="../../views/user/assets/js/jquery-1.8.2.min.js"></script>
  <script type="text/javascript" src="../../views/user/assets/js/supersized.3.2.7.min.js"></script>
  <script type="text/javascript" src="../../views/user/assets/js/supersized-init.js"></script>
  <script>
  layui.config({
    base: '../../layuiadmin/' //静态资源所在路径
  }).extend({
    index: 'lib/index' //主入口模块
  }).use(['index', 'user'], function(){
    var $ = layui.$
    ,setter = layui.setter
    ,admin = layui.admin
    ,form = layui.form
    ,router = layui.router()
    ,search = router.search;

    form.render();
	var username=$("#username");
	var password=$("");
	var action = $("");
    //提交
    form.on('submit(LAY-user-login-submit)', function(obj){
    
      //请求登入接口
      $.ajax({
        url:"/ShinhoPad/UserLoginServlet" //实际使用请改成服务端真实接口
        ,type:"post"
        ,dataType:"json"
        ,data: obj.field//{"username:username,password:password,action:action}
        ,success: function(res){
        	if(res.status==1){
        		layer.msg(res.data, {
		            offset: '15px'
		            ,icon: 1
		            ,time: 1000
		          }, function(){
		            location.href = '../'; //后台主页
		          });
        	}else{
        		layer.msg(res.message, {
		            offset: '15px'
		            ,icon: 5
		            ,time: 2000
		            ,anim: 6
		          }, function(){
		            code();
		          });
        	}
        }
      });
      
    });
    
    $("#LAY-user-get-vercode").on('click', function(){
    	code();
    });
    function code() {
		$.ajax({
			 "url"          : "/ShinhoPad/UserLoginServlet",     // 要提交的URL路径
		     "type"         :  "post",                // 发送请求的方式
		     "data"         :  {'action':'code'},                 // 要发送到服务器的数据
		     "dataType" :  "json",                   // 指定传输的数据格式
		     "success"  :  function(result) { // 请求成功后要执行的代码
		    	 if(result.status==1){
		    		 $("#LAY-user-get-vercode").attr('src',result.data);
		    	 }else{
		        		layer.msg(result.message, {
		                    offset: '15px'
		                    ,icon: 5
		                    ,anim: 6
		                    ,time: 2000
		                  });
		         }
		     }
		});
	}
	code();
  });
  </script>
</body>
</html>
