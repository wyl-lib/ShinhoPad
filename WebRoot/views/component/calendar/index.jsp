<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
pageContext.setAttribute("ctx", basePath);
%>

<!DOCTYPE html>
<html lang="zh-CN">
<script type="text/javascript">
	var ctx = "${ctx}";
</script>
<head>
    <meta charset='utf-8' />
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <link rel="stylesheet" href="../../../layuiadmin/layui/css/layui.css" media="all">
    <link rel="stylesheet" href="../../../layuiadmin/style/admin.css" media="all">
    <link rel="stylesheet" href="${ctx}/JS/fullcalendar.css" media="all">
    <script type='text/javascript' src='${ctx}/JS/jquery-1.12.4.min.js'></script>
    <script type='text/javascript' src='${ctx}/JS/moment.min.js'></script>
    <script type='text/javascript' src='${ctx}/JS/fullcalendar.js'></script>
</head>
<body>
	<div id="calendar" style="height: 750px;width: 950px;margin: 10px auto;"></div>
<script>

$(document).ready(function() {
        // 页面加载完毕，初始化Canlendar
        $('#calendar').fullCalendar({
		  header: {
                left: 'prev,next today',  
                center: 'title',  
                right: 'month,agendaWeek'//控制显示样式  
	            },
	            monthNames:['一月','二月', '三月', '四月', '五月', '六月', '七月','八月', '九月', '十月', '十一月', '十二月'],  
	            dayNamesShort:['周日', '周一', '周二', '周三','周四', '周五', '周六'],  
	            buttonText:{ prev: '前', next:'后', prevYear: '去年', nextYear: '明年', today:'今天', month:'月', week:'周', day:'日' }, //显示文字中文设置        
    			allDayText: '全天',
    			defaultView: 'month',
    			firstDay : 1,
    			titleFormat:'YYYY年    排课日历',
    			editable: false,
    			eventLimit: true,
    			eventSources: [{
                   url: '${ctx}/DateServlet',
                   type: 'post',
                   error: function() {
                       alert('获取事件时出错！');
                       
                   },
                   color: '#38DCC3',   // a non-ajax option
                   textColor: '#333333 ' // a non-ajax option
               	}],
               	eventClick: function(calEvent, jsEvent, view) { 
					alert('Event: ' + calEvent.title);
					alert(jsEvent+"---"+view);
	            },
    			
		    	
    			
    });
});    
</script>
</body>
</html>
