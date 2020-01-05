<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>



<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>表单元素</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
  <link rel="stylesheet" href="../../../layuiadmin/layui/css/layui.css" media="all">
  <link rel="stylesheet" href="../../../layuiadmin/style/admin.css" media="all">
</head>
<body>

  <div class="layui-fluid">
    <div class="layui-row layui-col-space15">
      <div class="layui-col-md6">
        <div class="layui-card">
          <form class="layui-form layui-form-pane"lay-filter="component-form-group">
          <div class="layui-card-header">请输入核销码</div>
          <div class="layui-card-body layui-row layui-col-space10">
            <div class="layui-col-md12">
              <input type="text" name="writeoffcode" placeholder="请输入" autocomplete="off" class="layui-input">
              <input type="text" name="action"  value="updateCheck" style="display: none"> 
              <input type="text" name="date" id="date" value="" style="display: none"> 
            </div>
          </div>
          <div class="layui-form-item layui-layout-admin">
							<div class="layui-footer" style="left: 0;">
								<button class="layui-btn" lay-submit=""
									lay-filter="component-form-element">点击验证</button>
							</div>
						</div>
            </form>
          </div>
        </div>
      </div>
    </div>

  
  <script src="../../../layuiadmin/layui/layui.js"></script>  
  <script>
  layui.config({
    base: '../../../layuiadmin/' //静态资源所在路径
  }).extend({
    index: 'lib/index' //主入口模块
  }).use(['index', 'form'], function(){
    var $ = layui.$
    ,admin = layui.admin
    ,element = layui.element
    ,form = layui.form;
    
    form.render(null, 'component-form-element');
    element.render('breadcrumb', 'breadcrumb');
    
    
    function init(){
    		var nowDate = new Date();
     		var year=nowDate.getFullYear(); 
			var month=nowDate.getMonth()+1; 
			var date=nowDate.getDate(); 
			var hour=nowDate.getHours(); 
			var minute=nowDate.getMinutes(); 
			var second=nowDate.getSeconds(); 
     			var str = year+"-"+month+"-"+date+" "+hour+":"+minute+":"+second;
     			document.getElementById("date").value=str; 
     			form.render();
    }
    
    init();
    form.on('submit(component-form-element)', function(data){
      /* layer.msg(JSON.stringify(data.field)); */
      alert("准备跳转PlayClassServlet");
      $.ajax({
      		url:"/ShinhoPad/PlayClassServlet" //实际使用请改成服务端真实接口
              ,type:"post"
              ,dataType:"json"
              ,data: data.field
              ,success: function(res){
              		 if(res.status==1){
              			layer.msg("验证成功！", {
		            	offset: '15px'
		            	,icon: 1
		            	,time: 2000
		            	,end: function(){
		            	var index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引
						parent.layer.close(index); 
		            	}
		          		});
		          		
              		}else {
						layer.msg("验证失败！", {
		            	offset: '15px'
		            	,icon: 2
		            	,time: 2000
		          		});
					}
              }
      });
      return false;
    });
  });
  </script>
</body>
</html>