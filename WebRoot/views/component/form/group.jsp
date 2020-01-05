<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>表单组合</title>
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
<link rel="stylesheet" href="../../../layuiadmin/layui/css/layui.css"
	media="all">
<link rel="stylesheet" href="../../../layuiadmin/style/admin.css"
	media="all">
<script src="../../../layuiadmin/layui/layui.js"></script>
</head>

<body>


	<div class="layui-fluid">
		<div class="layui-card">
			<div class="layui-card-header">排课信息</div>
			<div class="layui-card-body" style="padding: 15px;">
				<form class="layui-form layui-form-pane"lay-filter="component-form-group">
				
				<input type="text" name="action"  value="updateAdd" style="display: none"> 
				<input type="text" name="id"  value='${param.id}' style="display: none"> 
				<input type="text" name="phone"  value='' id="phone" style="display: none"> 
				<input type="text" name="writeoffcode"  value='' id="writeoffcode" style="display: none"> 
				
					<div class="layui-form-item">
						<label class="layui-form-label">学员姓名</label>
						<div class="layui-input-block">
							<input type="text" name="name" lay-verify="required" id="name"
								autocomplete="off" class="layui-input" disabled>
						</div>
					</div>
					<div class="layui-form-item">
						<label class="layui-form-label">上课地点</label>
						<div class="layui-input-block">
							<input type="text" name="storeName" lay-verify="required"
								id="storeName" autocomplete="off" class="layui-input" disabled>
								<input type="text" name="storeId" id="storeId" value="" style="display: none"> 
						</div>
					</div>
					<div class="layui-form-item">
						<label class="layui-form-label">预约课程</label>
						<div class="layui-input-block">
							<input type="text" name="courseName" lay-verify="required"
								id="courseName" autocomplete="off" class="layui-input" disabled>
								<input type="text" name="courseId" id="courseId" value="" style="display: none"> 
								
						</div>
					</div>
					<div class="layui-form-item">
						<label class="layui-form-label">预约讲师</label>
						<div class="layui-input-inline">
							<select name="teachers" lay-verify="required" lay-search="" id="selectTS">
								<option value="">直接选择讲师或搜索</option>
							</select>
						</div>
					</div>
					<div class="layui-form-item">
						<label class="layui-form-label">预约方式</label>
						<div class="layui-input-block">
							<input type="radio" name="orderType" value="0" title="应用预约">
							<input type="radio" name="orderType" value="1" title="电话预约">
							<input type="radio" name="orderType" value="2" title="应用电话预约">
						</div>
					</div>
					<div class="layui-form-item">
						<label class="layui-form-label">排课日期</label>
						<div class="layui-input-block">
							<input type="text" class="layui-input" lay-verify="required" name="playDate" id="LAY-component-form-group-date">
						</div>
					</div>
					<div class="layui-form-item">
						<label class="layui-form-label">排课时间</label>
						<div class="layui-input-block">
							<input type="radio" name="classTime" value="0" title="应用预约">
							<input type="radio" name="classTime" value="1" title="电话预约">
							<input type="radio" name="classTime" value="2" title="应用电话预约">
							<input type="radio" name="classTime" value="3" title="应用电话预约">
						</div>
						<div class="layui-input-block" hidden>
							<input type="radio" name="classTimeEnd" value="0" title="应用预约" >
							<input type="radio" name="classTimeEnd" value="1" title="电话预约" >
							<input type="radio" name="classTimeEnd" value="2" title="应用电话预约" >
							<input type="radio" name="classTimeEnd" value="3" title="应用电话预约" >
						</div>
					</div>
					<input type="text" name="shijian" id="shijian" value="" style="display: none"> 
					<div class="layui-form-item layui-layout-admin">
						<div class="layui-input-block">
							<div class="layui-footer" style="left: 0;">
								<button class="layui-btn" lay-submit=""
									lay-filter="component-form-demo1">发送排课通知</button>
							</div>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>


	<script>
  layui.config({
    base: '../../../layuiadmin/' //静态资源所在路径
  }).extend({
    index: 'lib/index' //主入口模块
  }).use(['index', 'form', 'laydate'], function(){
    var $ = layui.$
    ,admin = layui.admin
    ,element = layui.element
    ,layer = layui.layer
    ,laydate = layui.laydate
    ,form = layui.form;
    
    form.render(null, 'component-form-group');

    laydate.render({
        elem: '#LAY-component-form-group-date'
        ,position: 'fixed'
    });   
    var r;
    var t;
    var id ='${param.id}'; 
    /* 监听提交 */
    form.on('submit(component-form-demo1)', function(data){
     /*  parent.layer.alert(JSON.stringify(data.field), {
        title: '最终的提交信息'
      });  */
      /*Qiaoxp begin.  */
		alert("group function(data)");
      $.ajax({
      		url:"/ShinhoPad/PlayClassServlet" //实际使用请改成服务端真实接口
              ,type:"post"
              ,dataType:"json"
              ,data: data.field
              ,success: function(res){
              		 if(res.status==1){
              			layer.msg(res.data, {
		            	offset: '15px'
		            	,icon: 1
		            	,time: 2000
		            	,end: function(){
		            	var index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引
						parent.layer.close(index); 
		            	}
		          		});
		          		
              		}else {
						layer.msg(res.data, {
		            	offset: '15px'
		            	,icon: 1
		            	,time: 2000
		          		});
					}
              }
      });
      return false;
    });
   	init();
   	function init() {
		alert("group function init()");
	       $.ajax({
   			url:"/ShinhoPad/PlayClassServlet" //实际使用请改成服务端真实接口
             ,type:"post"
             ,dataType:"json"
             ,data: {"action":"reserveClass","id":id}
             ,success: function(res){
             if(res.status==1){
             	r=res.data;
             	$("#name").val(r.name);
             	$("#storeName").val(r.storeName);
             	$("#storeId").val(r.storeId);
             	$("#courseName").val(r.courseName);
             	$("#courseId").val(r.courseId);
             	$("#phone").val(r.phone);
             	$("#writeoffcode").val(r.writeoffcode);
             	$("#LAY-component-form-group-date").val(r.date.toString().substring(0,11));
				$("input[name='orderType']").each(function(index) {
         		if ($("input[name='orderType']").get(index).value == r.orderType) {
             		$("input[name='orderType']").get(index).checked = true;
         			}
         			form.render();
     			});
     			$("#selectTS").empty();
     	 		$.ajax({
   				url:"/ShinhoPad/PlayClassServlet" //实际使用请改成服务端真实接口
             		,type:"post"
             		,dataType:"json"
             		,data: {"action":"chooseTeacher","id":id}
             		,success: function(res){
             			if(res.status==1){
             				t=res.data;
             				$("#selectTS").prepend("<option value=''>请选择</option>");//添加第一个option值
             				for (var i = 0; i < t.length; i++) {
             					$("#selectTS").append("<option value='"+t[i].id+"'>"+t[i].name+"</option>");
             					form.render();
     						}
     				
     					}
     				}	
     			});
     			
     			$.ajax({
   				url:"/ShinhoPad/PlayClassServlet" //实际使用请改成服务端真实接口
             		,type:"post"
             		,dataType:"json"
             		,data: {"action":"PlayTime"}
             		,success: function(res){
             			if(res.status==1){
             				t=res.data;
             				var courseTime = new Array();
             				courseTime[0]=t.course1StartTime+"-"+t.course1EndTime;
             				courseTime[1]=t.course2StartTime+"-"+t.course2EndTime;
             				courseTime[2]=t.course3StartTime+"-"+t.course3EndTime;
             				courseTime[3]=t.course4StartTime+"-"+t.course4EndTime;
             				var startTime = new Array();
             					startTime[0]=t.course1StartTime;
             					startTime[1]=t.course2StartTime;
             					startTime[2]=t.course3StartTime;
             					startTime[3]=t.course4StartTime;
             				var endTime = new Array();
             					endTime[0]=t.course1EndTime;
             					endTime[1]=t.course2EndTime;
             					endTime[2]=t.course3EndTime;
             					endTime[3]=t.course4EndTime;
             				$("input[name='classTime']").each(function(index) {
             				$("input[name='classTime']").get(index).value = $("#LAY-component-form-group-date").val(r.date.toString().substring(0,11)).val()+startTime[index];
             				$("input[name='classTime']").get(index).title = courseTime[index];
             				form.render();
             				} );
             				$("input[name='classTimeEnd']").each(function(index) {
             				$("input[name='classTimeEnd']").get(index).value = $("#LAY-component-form-group-date").val(r.date.toString().substring(0,11)).val()+endTime[index];
             				$("input[name='classTimeEnd']").get(index).title = courseTime[index];
             				form.render();
             				} );
         					
     				$("input[name='classTime']").each(function(index) {
         			if ($("input[name='classTime']").get(index).title == r.beginTime.toString().substring(11,16)+"-"+r.endTime.toString().substring(11,16)) {
             			$("input[name='classTime']").get(index).checked = true;
         			}
         			form.render();
     				});
         			$("input[name='classTimeEnd']").each(function(index) {
         			if ($("input[name='classTime']").get(index).checked == true) {
             			$("input[name='classTimeEnd']").get(index).checked = true;
         			}
         			form.render();
     				});
     					}
     				}	
     			});
     			
     			var nowDate = new Date();
     			var year=nowDate.getFullYear(); 
			var month=nowDate.getMonth()+1; 
			var date=nowDate.getDate(); 
			var hour=nowDate.getHours(); 
			var minute=nowDate.getMinutes(); 
			var second=nowDate.getSeconds(); 
     			var str = year+"-"+month+"-"+date+" "+hour+":"+minute+":"+second;
     			document.getElementById("shijian").value=str; 
             }else{
       		layer.msg(res.message, {
	            offset: '15px'
	            ,icon: 5
	            ,time: 2000
	          });
       			}
             	
             }
   		});
	}
    /* $(document).ready(function () {

    		
      }); */
  });
  </script>
</body>
</html>
