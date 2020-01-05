package cn.pad.web;

import cn.pad.util.EmptyUtils;
import cn.pad.util.PrintUtil;
import cn.pad.util.ReturnResult;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 公共的Servlet抽象类
 * Created by bdqn on 2016/4/21.
 */
public abstract class AbstractServlet extends HttpServlet {

	//获取集成当前类的class对象
    public abstract Class getServletClass();
    
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        doPost(req, resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	//获取要调用的当前Servlet的某个方法
        String actionIndicator = req.getParameter("action");
        //测试
        System.out.println(actionIndicator);
        Method method = null;//声明反射中的方法t
        Object result = null;//声明一个对象
        try {
        	//如果actionIndicator（要调用的方法）的值为空则将result对象赋予主页路径
            if (EmptyUtils.isEmpty(actionIndicator)) {
                result = execute(req, resp);
            } else {
            	//actionIndicator不等于空，则获取当前继承类的class对象中的actionIndicator指定方法
                method = getServletClass().getDeclaredMethod(actionIndicator, HttpServletRequest.class, HttpServletResponse.class);
                //执行获取到的方法并得到该方法的的返回值
                result = method.invoke(this, req, resp);
            }
            //调用返回值处理方法进行处理
            toView(req, resp, result);
        } catch (NoSuchMethodException e) {
            String viewName = "404.jsp";
            req.getRequestDispatcher(viewName).forward(req, resp);
        } catch (Exception e) {
            e.printStackTrace();
            if (!EmptyUtils.isEmpty(result)) {
                if (result instanceof String) {
                    String viewName = "500.jsp";
                    req.getRequestDispatcher(viewName).forward(req, resp);
                } else {
                    ReturnResult returnResult = new ReturnResult();
                    returnResult.returnFail("系统错误");
                    PrintUtil.write(returnResult, resp);
                }
            } else {
                String viewName = "500.jsp";
                req.getRequestDispatcher(viewName).forward(req, resp);
            }

        }
    }
    
    //对方法的返回值进行处理
    protected void toView(HttpServletRequest req, HttpServletResponse resp, Object result) throws IOException, ServletException {
        if (!EmptyUtils.isEmpty(result)) {
            if (result instanceof String) {
                String viewName = result.toString() + ".jsp";
                req.getRequestDispatcher(viewName).forward(req, resp);
            } else {
                PrintUtil.write(result, resp);
            }
        }
    }

    public Object execute(HttpServletRequest req, HttpServletResponse resp) {
        return "pre/index";
    }
}
