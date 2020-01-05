<%@page import="cn.pad.entity.unique.ReserveOrdInfo"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
  <head>
    <%-- <base href="<%=basePath%>"> --%>
    
    <title>My JSP 'index.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta name="renderer" content="webkit">
  	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  	<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
  	<link rel="stylesheet" href="../../../layuiadmin/layui/css/layui.css" media="all">
  	<link rel="stylesheet" href="../../../layuiadmin/style/admin.css" media="all">
	<script src="../../../layuiadmin/layui/layui.js"></script>
	<script src="../../../JS/jquery-1.12.4.min.js"></script>
	<script>
	/*Qiaoxp begin.  */
	  function PlayClass(id){
		  alert("timeLineIndex function PlayClass(id)");
                   layer.open({
                       title :'',
                       type: 2,
                       area: ['1000px', '800px'],
                       fixed: false, //不固定
                       shade: [0.8, '#393D49'],
                       anim:  1,
                       maxmin: false,
                       resize: false,
                       content: '../form/group.jsp?id='+id,
                       cancel: function (index, layero){
                           layer.close(index);
                           return false;

                       },
                       end: function(){
                       	closeShow();
                       }

                   });
               }
	
	var idC;
	function closeShow(){
		$.ajax({
		url	:	"/ShinhoPad/ReserveOrdInfoServlet"
		,type:	"post"
        ,dataType:"json"
        ,data: {"action":"reserveInfo","id":idC}
        ,beforeSend: function () {
			index = layer.load(0);
		}
        ,success:function(res){
        	if(res.status==1){
        		ROrdInfos = res.data;
        		layer.close(index);
        		
		          
		          var reserveHtml = "";
		  for (var i = 0; i < ROrdInfos.length; i++){
		  idC = ROrdInfos[i].id.toString();
          var  date = ROrdInfos[i].date;
          var  dateC = new Date(date);
          var  time = dateC.toLocaleTimeString();
          var  orderNum = ROrdInfos[i].orderNum;
          var  courseName = ROrdInfos[i].courseName;
          var  storeName = ROrdInfos[i].storeName;
          var  name = ROrdInfos[i].name;
          var  phone = ROrdInfos[i].phone;
          var  beginDate = ROrdInfos[i].beginTime;
          var  beginDateC = new  Date(beginDate);
          var  beginTime = beginDateC.toLocaleTimeString();
          var  endDate = ROrdInfos[i].endTime;
          var  endDateC = new  Date(endDate);
          var  endTime = endDateC.toLocaleTimeString();
          var dateNow = new  Date();
          var dateNowC = dateNow.toLocaleDateString().substring(7,10);
          var dateCC = dateC.toLocaleDateString().substring(7,10);
          var day = "";

          if(dateNowC-dateCC==2){
              day = "前天";
          }else if(dateNowC-dateCC==1){
              day = "昨天";
          }else if(dateNowC-dateCC==0){
              day = "今天";
          }

  			function PA(time) {
                if(time.length==9){
                    time=time.substring(0,6);
                }else{
                    time=time.substring(0,7);
                }
                return time;
              }
               function BT(beginTime) {
                  if(beginTime.length==9){
                      beginTime=beginTime.substring(0,6);
                  }else{
                      beginTime=beginTime.substring(0,7);
                  }
                  return beginTime;
              }
              function ET(endTime) {
                  if(endTime.length==9){
                      endTime=endTime.substring(0,6);
                  }else{
                      endTime=endTime.substring(0,7);
                  }
                  return endTime;
              }
              time = PA(time);
              beginTime = BT(beginTime);
              endTime = ET(endTime);
          reserveHtml += "<div class=\"layui-card\">";
          reserveHtml += "          <div class=\"layui-card-header\"><span class=\"AdminColor\"style=\"color: #2F4056;\">"+date.substring(0,10)+ "<span style='color: #393D49'>&nbsp;"+day+"<\/span><\/span><\/div>";
          reserveHtml += "          <!--第1条订单信息-->";
          reserveHtml += "          <div class=\"layui-card-body\">";
          reserveHtml += "            <ul class=\"layui-timeline\">";
          reserveHtml += "              <li class=\"layui-timeline-item\">";
          reserveHtml += "                <i class=\"layui-icon layui-timeline-axis\"><\/i>";
          reserveHtml += "                <div class=\"layui-timeline-content layui-text\">";
          reserveHtml += "                  <h3 class=\"layui-timeline-title\"style=\"color: #5d5d5d;\">"+time.replace("上午","AM&nbsp;").replace("下午","PM&nbsp;")+ "<\/h3>";
          reserveHtml += "";
          reserveHtml += "                  <div class=\"layui-card\">";
          reserveHtml += "                    <div class=\"layui-card-header\"><span class=\"AdminColor\"style=\"color: #8c8c8c;\">订单号: <span>"+orderNum+ "<\/span><\/span><\/div>";
          reserveHtml += "                    <div class=\"layui-card-body\">";
          reserveHtml += "                      <table class=\"layui-table-even\" >";
          reserveHtml += "                        <colgroup>";
          reserveHtml += "                          <col width=\"200\">";
          reserveHtml += "                          <col width=\"300\">";
          reserveHtml += "                          <col>";
          reserveHtml += "                        <\/colgroup>";
          reserveHtml += "                        <thead>";
          reserveHtml += "                        <tr style=\"color: #8c8c8c;font-size: small\">";
          reserveHtml += "                          <td>课程名称<\/td>";
          reserveHtml += "                          <td>预约时间<\/td>";
          reserveHtml += "                          <td>预约地点<\/td>";
          reserveHtml += "                        <\/tr>";
          reserveHtml += "                        <\/thead>";
          reserveHtml += "                        <tbody>";
          reserveHtml += "                        <tr>";
          reserveHtml += "                          <th>"+courseName+ "<\/th>";
          reserveHtml += "                          <th style=\"color:#FF5722\">"+beginDateC.toLocaleDateString().replace("/","年").replace("/","月")+"日&nbsp;&nbsp;&nbsp;"+beginTime+"&nbsp;—&nbsp;"+endTime+"<\/th>";
          reserveHtml += "                          <th>"+storeName+"<\/th>";
          reserveHtml += "                        <\/tr>";
          reserveHtml += "                        <\/tbody>";
          reserveHtml += "                      <\/table>";
          reserveHtml += "                        <!--灰色分割线-->";
          reserveHtml += "                        <hr class=\"layui-bg-gray\">";
          reserveHtml += "                      <table class=\"layui-table-even\">";
          reserveHtml += "                        <colgroup>";
          reserveHtml += "                          <col width=\"200\">";
          reserveHtml += "                          <col width=\"300\">";
          reserveHtml += "                          <col>";
          reserveHtml += "                        <\/colgroup>";
          reserveHtml += "                        <tr style=\"color: #8c8c8c;font-size: small\">";
          reserveHtml += "                          <td>联系人："+name+"<\/td>";
          reserveHtml += "                          <td>手机号："+phone+"<\/td>";
          reserveHtml += "                          <td><div class=\"layui-btn-group\">";
          reserveHtml += "                            <button class=\"layui-btn layui-btn-primary layui-btn-sm\" onclick=\"PlayClass(this.name)\"name=\""+idC+"\"lay-tips=\"排课\">";
          reserveHtml += "                              <i class=\"layui-icon\">&#xe705;<\/i>";
          reserveHtml += "                            <\/button>";
          reserveHtml += "                            <button class=\"layui-btn layui-btn-primary layui-btn-sm \" onclick=\"closebtn(this.name)\"name=\""+idC+"\"lay-tips=\"删除\">";
          reserveHtml += "                              <i class=\"layui-icon\">&#xe640;<\/i>";
          reserveHtml += "                            <\/button>";
          reserveHtml += "                          <\/div><\/td>";
          reserveHtml += "                        <\/tr>";
          reserveHtml += "                      <\/table>";
          reserveHtml += "                    <\/div>";
          reserveHtml += "                  <\/div>";
          reserveHtml += "                <\/div>";
          reserveHtml += "              <\/li>";
          reserveHtml += "            <\/ul>";
          reserveHtml += "          <\/div>";
          reserveHtml += "";
          reserveHtml += "            <\/div>";
          reserveHtml += "          <\/div>";
          reserveHtml += "        <\/div>";
          $("#appendList").empty();
          $("#appendList").append(reserveHtml);
          }
        	}else{
        		layer.msg(res.message, {
		            offset: '15px'
		            ,icon: 5
		            ,time: 2000
		          });
		           $("#appendList").empty();
        	}
        }
	});
	};
	function closebtn(name) {

	layer.confirm('是否删除？', {icon: 3, title:'提示'}, function(index){
	        idC=name;
             $.ajax({
              url:"/ShinhoPad/ReserveOrdInfoServlet" //实际使用请改成服务端真实接口
              ,type:"post"
              ,dataType:"json"
              ,data: {"action":"closeReserve","id":idC}
              ,success: function(res){
                  if(res.status==1){
                     
                  }else{
                      layer.msg(res.message, {
                          offset: '15px'
                          ,icon: 5
                          ,time: 2000
                          ,anim: 6
                      });
                  }
              }
          });
          $("#appendList").empty();
			closeShow();
              layer.close(index);
          });
          
          
}</script>  
  </head>
<body>
  <div class="layui-fluid" id="LAY-component-timeline">
    <div class="layui-row layui-col-space15">
      <div class="layui-col-md12" id="appendList">
        
      
      </div>
    </div>
  </div>

  
  <script>
  layui.config({
    base: '../../../layuiadmin/' //静态资源所在路径
  }).extend({
    index: 'lib/index' //主入口模块
  }).use(['index'],function(){
  	var $ = layui.$;
  	var ROrdInfos;
  	var index;
  	$(document).ready(function () {
         initReserve();
      });
      //加载预约信息  Qiaoxp
  	function initReserve() {
	$.ajax({
		url	:	"/ShinhoPad/ReserveOrdInfoServlet"
		,type:	"post"
        ,dataType:"json"
        ,data:	"action=reserveInfo"
        ,beforeSend: function () {
			index = layer.load(0);
		}
        ,success:function(res){
        	if(res.status==1){
        		ROrdInfos = res.data;
        		layer.close(index);
        		layer.msg("加载预约成功！", {
		            offset: '15px'
		            ,icon: 1
		            ,time: 2000
		          });
		          
		          var reserveHtml = "";
		  for (var i = 0; i < ROrdInfos.length; i++){
		  idC = ROrdInfos[i].id.toString();
          var  date = ROrdInfos[i].date;
          var  dateC = new Date(date);
          var  time = dateC.toLocaleTimeString();
          var  orderNum = ROrdInfos[i].orderNum;
          var  courseName = ROrdInfos[i].courseName;
          var  storeName = ROrdInfos[i].storeName;
          var  name = ROrdInfos[i].name;
          var  phone = ROrdInfos[i].phone;
          var  beginDate = ROrdInfos[i].beginTime;
          var  beginDateC = new  Date(beginDate);
          var  beginTime = beginDateC.toLocaleTimeString();
          var  endDate = ROrdInfos[i].endTime;
          var  endDateC = new  Date(endDate);
          var  endTime = endDateC.toLocaleTimeString();
          var dateNow = new  Date();
          var dateNowC = dateNow.toLocaleDateString().substring(7,10);
          var dateCC = dateC.toLocaleDateString().substring(7,10);
          var day = "";

          if(dateNowC-dateCC==2){
              day = "前天";
          }else if(dateNowC-dateCC==1){
              day = "昨天";
          }else if(dateNowC-dateCC==0){
              day = "今天";
          }
			function PA(time) {
                if(time.length==9){
                    time=time.substring(0,6);
                }else{
                    time=time.substring(0,7);
                }
                return time;
              }
               function BT(beginTime) {
                  if(beginTime.length==9){
                      beginTime=beginTime.substring(0,6);
                  }else{
                      beginTime=beginTime.substring(0,7);
                  }
                  return beginTime;
              }
              function ET(endTime) {
                  if(endTime.length==9){
                      endTime=endTime.substring(0,6);
                  }else{
                      endTime=endTime.substring(0,7);
                  }
                  return endTime;
              }
              time = PA(time);
              beginTime = BT(beginTime);
              endTime = ET(endTime);
          reserveHtml += "<div class=\"layui-card\">";
          reserveHtml += "          <div class=\"layui-card-header\"><span class=\"AdminColor\"style=\"color: #2F4056;\">"+date.substring(0,10)+ "<span style='color: #393D49'>&nbsp;"+day+"<\/span><\/span><\/div>";
          reserveHtml += "          <!--第1条订单信息-->";
          reserveHtml += "          <div class=\"layui-card-body\">";
          reserveHtml += "            <ul class=\"layui-timeline\">";
          reserveHtml += "              <li class=\"layui-timeline-item\">";
          reserveHtml += "                <i class=\"layui-icon layui-timeline-axis\"><\/i>";
          reserveHtml += "                <div class=\"layui-timeline-content layui-text\">";
          reserveHtml += "                  <h3 class=\"layui-timeline-title\"style=\"color: #5d5d5d;\">"+time.replace("上午","AM&nbsp;").replace("下午","PM&nbsp;")+ "<\/h3>";
          reserveHtml += "";
          reserveHtml += "                  <div class=\"layui-card\">";
          reserveHtml += "                    <div class=\"layui-card-header\"><span class=\"AdminColor\"style=\"color: #8c8c8c;\">订单号: <span>"+orderNum+ "<\/span><\/span><\/div>";
          reserveHtml += "                    <div class=\"layui-card-body\">";
          reserveHtml += "                      <table class=\"layui-table-even\" >";
          reserveHtml += "                        <colgroup>";
          reserveHtml += "                          <col width=\"200\">";
          reserveHtml += "                          <col width=\"300\">";
          reserveHtml += "                          <col>";
          reserveHtml += "                        <\/colgroup>";
          reserveHtml += "                        <thead>";
          reserveHtml += "                        <tr style=\"color: #8c8c8c;font-size: small\">";
          reserveHtml += "                          <td>课程名称<\/td>";
          reserveHtml += "                          <td>预约时间<\/td>";
          reserveHtml += "                          <td>预约地点<\/td>";
          reserveHtml += "                        <\/tr>";
          reserveHtml += "                        <\/thead>";
          reserveHtml += "                        <tbody>";
          reserveHtml += "                        <tr>";
          reserveHtml += "                          <th>"+courseName+ "<\/th>";
          reserveHtml += "                          <th style=\"color:#FF5722\">"+beginDateC.toLocaleDateString().replace("/","年").replace("/","月")+"日&nbsp;&nbsp;&nbsp;"+beginTime+"&nbsp;—&nbsp;"+endTime+"<\/th>";
          reserveHtml += "                          <th>"+storeName+"<\/th>";
          reserveHtml += "                        <\/tr>";
          reserveHtml += "                        <\/tbody>";
          reserveHtml += "                      <\/table>";
          reserveHtml += "                        <!--灰色分割线-->";
          reserveHtml += "                        <hr class=\"layui-bg-gray\">";
          reserveHtml += "                      <table class=\"layui-table-even\">";
          reserveHtml += "                        <colgroup>";
          reserveHtml += "                          <col width=\"200\">";
          reserveHtml += "                          <col width=\"300\">";
          reserveHtml += "                          <col>";
          reserveHtml += "                        <\/colgroup>";
          reserveHtml += "                        <tr style=\"color: #8c8c8c;font-size: small\">";
          reserveHtml += "                          <td>联系人："+name+"<\/td>";
          reserveHtml += "                          <td>手机号："+phone+"<\/td>";
          reserveHtml += "                          <td><div class=\"layui-btn-group\">";
          reserveHtml += "                            <button class=\"layui-btn layui-btn-primary layui-btn-sm\"onclick=\"PlayClass(this.name)\"name=\""+idC+"\"lay-tips=\"排课\">";
          reserveHtml += "                              <i class=\"layui-icon\">&#xe705;<\/i>";
          reserveHtml += "                            <\/button>";
          reserveHtml += "                            <button class=\"layui-btn layui-btn-primary layui-btn-sm \"onclick=\"closebtn(this.name)\"name=\""+idC+"\"lay-tips=\"删除\">";
          reserveHtml += "                              <i class=\"layui-icon\">&#xe640;<\/i>";
          reserveHtml += "                            <\/button>";
          reserveHtml += "                          <\/div><\/td>";
          reserveHtml += "                        <\/tr>";
          reserveHtml += "                      <\/table>";
          reserveHtml += "                    <\/div>";
          reserveHtml += "                  <\/div>";
          reserveHtml += "                <\/div>";
          reserveHtml += "              <\/li>";
          reserveHtml += "            <\/ul>";
          reserveHtml += "          <\/div>";
          reserveHtml += "";
          reserveHtml += "            <\/div>";
          reserveHtml += "          <\/div>";
          reserveHtml += "        <\/div>";
          $("#appendList").empty();
          $("#appendList").append(reserveHtml);
          }
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
});
  
</script>

</html>
