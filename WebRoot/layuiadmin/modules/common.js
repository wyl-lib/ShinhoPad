/**

 @Name：layuiAdmin 公共业务
 @Author：贤心
 @Site：http://www.layui.com/admin/
 @License：LPPL
    
 */
 
layui.define(function(exports){
  var $ = layui.$
  ,layer = layui.layer
  ,laytpl = layui.laytpl
  ,setter = layui.setter
  ,view = layui.view
  ,admin = layui.admin
  
  //公共业务的逻辑处理可以写在此处，切换任何页面都会执行
  //……
  
  
  
  //退出
  admin.events.logout = function(){
    //执行退出接口
	  $.ajax({
	      url: '/ShinhoPad/UserLoginServlet'
	      ,type: 'post'
	      ,data: 'action=loginOut'
	      ,dataType:'json'
	      ,success: function(res){
	    	  if(res.status==1){
	    		  location.href = '/ShinhoPad/views/user/login.jsp';
	    	  }
	      }
	    });
	  };

  
  //对外暴露的接口
  exports('common', {});
});