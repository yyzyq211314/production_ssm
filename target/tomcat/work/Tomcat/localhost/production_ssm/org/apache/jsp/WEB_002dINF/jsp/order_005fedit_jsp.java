/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-10-23 07:39:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class order_005fedit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<link href=\"js/kindeditor-4.1.10/themes/default/default.css\" type=\"text/css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<link href=\"css/uploadfile.css\" rel=\"stylesheet\"> \r\n");
      out.write("<script src=\"js/jquery.uploadfile.js\"></script>\r\n");
      out.write("<script src=\"js/malsup.github.iojquery.form.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" charset=\"utf-8\" src=\"js/kindeditor-4.1.10/kindeditor-all-min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" charset=\"utf-8\" src=\"js/kindeditor-4.1.10/lang/zh_CN.js\"></script>\r\n");
      out.write("<div style=\"padding:10px 10px 10px 10px\">\r\n");
      out.write("\t<form id=\"orderEditForm\" class=\"orderForm\" method=\"post\">\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"orderId\"/>\r\n");
      out.write("\t    <table cellpadding=\"5\">\r\n");
      out.write("\t         <tr>\r\n");
      out.write("\t            <td>订购客户:</td>\r\n");
      out.write("\t            <td>\r\n");
      out.write("\t            \t<input id=\"custom\" class=\"easyui-combobox\" name=\"customId\"  panelHeight=\"auto\"\r\n");
      out.write("\t\t\t\t\t\t   data-options=\"required:true,valueField:'customId',textField:'customName',\r\n");
      out.write("\t\t\t\t\t\t   url:'custom/get_data', editable:false\" />\r\n");
      out.write("\t            </td>\r\n");
      out.write("\t        </tr>\r\n");
      out.write("\t        <tr>\r\n");
      out.write("\t            <td>订购产品:</td>\r\n");
      out.write("\t            <td>\r\n");
      out.write("\t            \t<input id=\"product\" class=\"easyui-combobox\" name=\"productId\"  panelHeight=\"auto\" \r\n");
      out.write("    \t\t\t\t\tdata-options=\"valueField:'productId',textField:'productName',url:'product/get_data',\r\n");
      out.write("    \t\t\t\t\teditable:false, required:true\" />\r\n");
      out.write("    \t\t\t</td>  \r\n");
      out.write("\t        </tr>\r\n");
      out.write("\t        <tr>\r\n");
      out.write("\t            <td>订购数量:</td>\r\n");
      out.write("\t            <td>\r\n");
      out.write("\t\t\t\t\t<input class=\"easyui-numberbox\" type=\"text\" name=\"quantity\"\r\n");
      out.write("\t\t\t\t\t\t   data-options=\"min:1,max:99999999,precision:0,required:true\" />\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t        </tr>\r\n");
      out.write("\t        <tr>\r\n");
      out.write("\t            <td>税前单价:</td>\r\n");
      out.write("\t            <td><input class=\"easyui-numberbox\" type=\"text\" name=\"unitPrice\"\r\n");
      out.write("\t\t\t\t\t\t   data-options=\"min:1,max:99999999,precision:2,required:true\" />\r\n");
      out.write("\t            \t<input type=\"hidden\" name=\"price\"/>\r\n");
      out.write("\t            </td>\r\n");
      out.write("\t        </tr>\r\n");
      out.write("\t        <tr>\r\n");
      out.write("\t            <td>单位:</td>\r\n");
      out.write("\t            <td><input  class=\"easyui-textbox\" type=\"text\" name=\"unit\"/></td>\r\n");
      out.write("\t        </tr>\r\n");
      out.write("\t        <tr>\r\n");
      out.write("\t            <td>订单状态:</td>\r\n");
      out.write("\t            <td>\r\n");
      out.write("\t\t            <select class=\"easyui-combobox\" name=\"status\" panelHeight=\"auto\" data-options=\"required:true,\r\n");
      out.write("\t\t            \t\twidth:150, editable:false\">\r\n");
      out.write("\t\t\t\t\t\t<option value=\"1\">未开始</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"2\">已开始</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"3\">已完成</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"4\">订单取消</option>\r\n");
      out.write("\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t        </tr>\r\n");
      out.write("\t        <tr>\r\n");
      out.write("\t            <td>订购日期:</td>\r\n");
      out.write("\t            <td><input class=\"easyui-datetimebox\" name=\"orderDate\"     \r\n");
      out.write("        \t\t\tdata-options=\"required:true,showSeconds:true\" style=\"width:150px\"> </td>\r\n");
      out.write("\t        </tr>\r\n");
      out.write("\t        <tr>\r\n");
      out.write("\t            <td>要求日期:</td>\r\n");
      out.write("\t            <td><input class=\"easyui-datetimebox\" name=\"requestDate\"     \r\n");
      out.write("        \t\t\tdata-options=\"required:true,showSeconds:true\" style=\"width:150px\"> </td>\r\n");
      out.write("\t        </tr>\r\n");
      out.write("\t        <tr>\r\n");
      out.write("\t            <td>合同扫描件:</td>\r\n");
      out.write("\t            <td>\r\n");
      out.write("\t            \t <a href=\"javascript:void(0)\" class=\"easyui-linkbutton picFileUpload\">上传图片</a>\r\n");
      out.write("\t                 <input type=\"hidden\" id=\"image\" name=\"image\"/>\r\n");
      out.write("\t            </td>\r\n");
      out.write("\t        </tr>\r\n");
      out.write("\t        <tr>\r\n");
      out.write("\t            <td>附件:</td>\r\n");
      out.write("\t            <td>\r\n");
      out.write("\t            \t <div id=\"orderEditFileUploader\">上传文件</div>\r\n");
      out.write("\t                 <input id=\"orderEditFile\" type=\"hidden\" name=\"file\"/>\r\n");
      out.write("\t            </td>\r\n");
      out.write("\t        </tr>\r\n");
      out.write("\t        <tr>\r\n");
      out.write("\t            <td>商品描述:</td>\r\n");
      out.write("\t            <td>\r\n");
      out.write("\t                <textarea style=\"width:800px;height:300px;visibility:visible;\" name=\"note\"></textarea>\r\n");
      out.write("\t            </td>\r\n");
      out.write("\t        </tr>\r\n");
      out.write("\t    </table>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t<div style=\"padding:5px\">\r\n");
      out.write("\t    <a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" onclick=\"submitOrderEditForm()\">提交</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t\r\n");
      out.write("\tvar orderEditEditor ;\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\t//实例化富文本编辑器\r\n");
      out.write("\t\torderEditEditor = TAOTAO.createEditor(\"#orderEditForm [name=note]\");\r\n");
      out.write("\t});\r\n");
      out.write("\t//同步kindeditor中的内容\r\n");
      out.write("\torderEditEditor.sync();\r\n");
      out.write("\t\r\n");
      out.write("\tfunction submitOrderEditForm(){\r\n");
      out.write("\t\tif(!$('#orderEditForm').form('validate')){\r\n");
      out.write("\t\t\t$.messager.alert('提示','表单还未填写完成!');\r\n");
      out.write("\t\t\treturn ;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\torderEditEditor.sync();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$.post(\"order/update_all\",$(\"#orderEditForm\").serialize(), function(data){\r\n");
      out.write("\t\t\tif(data.status == 200){\r\n");
      out.write("\t\t\t\t$.messager.alert('提示','修改订单成功!','info',function(){\r\n");
      out.write("\t\t\t\t\t$(\"#orderEditWindow\").window('close');\r\n");
      out.write("\t\t\t\t\t$(\"#orderList\").datagrid(\"reload\");\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\t$.messager.alert('提示',data.msg);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
