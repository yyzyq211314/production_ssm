/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-10-23 02:35:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class custom_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      out.write("\r\n");
      out.write("<link href=\"js/kindeditor-4.1.10/themes/default/default.css\" type=\"text/css\" rel=\"stylesheet\">\r\n");
      out.write("<script type=\"text/javascript\" charset=\"utf-8\" src=\"js/kindeditor-4.1.10/kindeditor-all-min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" charset=\"utf-8\" src=\"js/kindeditor-4.1.10/lang/zh_CN.js\"></script>\r\n");
      out.write("<table class=\"easyui-datagrid\" id=\"customList\" title=\"客户列表\" data-options=\"singleSelect:false,collapsible:true,\r\n");
      out.write("\t\tpagination:true,rownumbers:true,url:'custom/list', method:'get',pageSize:30, fitColumns:true,\r\n");
      out.write("\t\ttoolbar:toolbar_custom\">\r\n");
      out.write("    <thead>\r\n");
      out.write("        <tr>\r\n");
      out.write("        \t<th data-options=\"field:'ck',checkbox:true\"></th>\r\n");
      out.write("        \t<th data-options=\"field:'customId',width:100,align:'center'\">客户编号</th>\r\n");
      out.write("            <th data-options=\"field:'customName',width:100,align:'center'\">客户名称</th>\r\n");
      out.write("            <th data-options=\"field:'fullName',width:200,align:'center'\">客户全称</th>\r\n");
      out.write("            <th data-options=\"field:'address',width:200,align:'center'\">地址</th>\r\n");
      out.write("            <th data-options=\"field:'fax',width:100,align:'center'\">传真</th>\r\n");
      out.write("            <th data-options=\"field:'email',width:100,align:'center'\">邮箱</th>\r\n");
      out.write("            <th data-options=\"field:'ownerName',width:60,align:'center'\">经理姓名</th>\r\n");
      out.write("            <th data-options=\"field:'ownerTel',width:100,align:'center'\">联系电话</th>\r\n");
      out.write("            <th data-options=\"field:'status',width:60,align:'center',formatter:TAOTAO.formatCustomStatus\">客户状态</th>\r\n");
      out.write("            <th data-options=\"field:'note',width:130,align:'center', formatter:formatCustomNote\">备注</th>\r\n");
      out.write("        </tr>\r\n");
      out.write("    </thead>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<div  id=\"toolbar_custom\" style=\" height: 22px; padding: 3px 11px; background: #fafafa;\">  \r\n");
      out.write("\t\r\n");
      out.write("\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"datagrid-btn-separator\"></div>  \r\n");
      out.write("\t\r\n");
      out.write("\t<div style=\"float: left;\">  \r\n");
      out.write("\t\t<a href=\"#\" class=\"easyui-linkbutton\" plain=\"true\" icon=\"icon-reload\" onclick=\"custom_reload()\">刷新</a>  \r\n");
      out.write("\t</div>  \r\n");
      out.write("\t\r\n");
      out.write("    <div id=\"search_custom\" style=\"float: right;\">\r\n");
      out.write("        <input id=\"search_text_custom\" class=\"easyui-searchbox\"  \r\n");
      out.write("            data-options=\"searcher:doSearch_custom,prompt:'请输入...',menu:'#menu_custom'\"  \r\n");
      out.write("            style=\"width:250px;vertical-align: middle;\">\r\n");
      out.write("        </input>\r\n");
      out.write("        <div id=\"menu_custom\" style=\"width:120px\"> \r\n");
      out.write("\t\t\t<div data-options=\"name:'customId'\">客户编号</div> \r\n");
      out.write("\t\t\t<div data-options=\"name:'customName'\">客户名称</div>\r\n");
      out.write("\t\t</div>     \r\n");
      out.write("    </div>  \r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"customEditWindow\" class=\"easyui-window\" title=\"编辑客户\" \r\n");
      out.write("\tdata-options=\"modal:true,closed:true,resizable:true,iconCls:'icon-save',href:'custom/edit'\" \r\n");
      out.write("\tstyle=\"width:65%;height:80%;padding:10px;\">\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"customAddWindow\" class=\"easyui-window\" title=\"添加客户\" \r\n");
      out.write("\tdata-options=\"modal:true,closed:true,resizable:true,iconCls:'icon-save',href:'custom/add'\" \r\n");
      out.write("\tstyle=\"width:65%;height:80%;padding:10px;\">\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"customNoteDialog\" class=\"easyui-dialog\" title=\"备注\" \r\n");
      out.write("\tdata-options=\"modal:true,closed:true,resizable:true,iconCls:'icon-save'\" \r\n");
      out.write("\tstyle=\"width:55%;height:65%;padding:10px;\">\r\n");
      out.write("\t<form id=\"customNoteForm\" class=\"itemForm\" method=\"post\">\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"customId\"/>\r\n");
      out.write("\t    <table cellpadding=\"5\" >\r\n");
      out.write("\t        <tr>\r\n");
      out.write("\t            <td>备注:</td>\r\n");
      out.write("\t            <td>\r\n");
      out.write("\t                <textarea style=\"width:800px;height:450px;visibility:hidden;\" name=\"note\"></textarea>\r\n");
      out.write("\t            </td>\r\n");
      out.write("\t        </tr>\r\n");
      out.write("\t    </table>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t<div style=\"padding:5px\">\r\n");
      out.write("\t    <a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" onclick=\"updateCustomNote()\">保存</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("function doSearch_custom(value,name){ //用户输入用户名,点击搜素,触发此函数  \r\n");
      out.write("\tif(value == null || value == ''){\r\n");
      out.write("\t\t$(\"#customList\").datagrid({\r\n");
      out.write("\t        title:'客户列表', singleSelect:false, collapsible:true, pagination:true, rownumbers:true, \r\n");
      out.write("\t        \tmethod:'get', nowrap:true,  \r\n");
      out.write("\t        toolbar:\"toolbar_custom\", url:'custom/list', method:'get', loadMsg:'数据加载中......',  \r\n");
      out.write("\t        \tfitColumns:true,//允许表格自动缩放,以适应父容器  \r\n");
      out.write("\t        columns : [ [ \r\n");
      out.write("\t             \t{field : 'ck', checkbox:true }, \r\n");
      out.write("\t             \t{field : 'customId', width : 100, title : '客户编号', align:'center'},\r\n");
      out.write("\t             \t{field : 'customName', width : 100, align : 'center', title : '客户名称'},\r\n");
      out.write("\t             \t{field : 'fullName', width : 200, align : 'center', title : '客户全称'}, \r\n");
      out.write("\t             \t{field : 'address', width : 200, title : '地址', align:'center'}, \r\n");
      out.write("\t             \t{field : 'fax', width : 100, title : '传真', align:'center'}, \r\n");
      out.write("\t            \t{field : 'email', width : 70, title : '邮箱', align:'center'}, \r\n");
      out.write("\t             \t{field : 'ownerName', width : 60, title : '经理姓名', align:'center'}, \r\n");
      out.write("\t             \t{field : 'ownerTel', width : 100, title : '联系电话', align:'center'}, \r\n");
      out.write("\t             \t{field : 'status', width : 60, title : '客户状态', align:'center', \r\n");
      out.write("\t             \t\t\tformatter:TAOTAO.formatCustomStatus}, \r\n");
      out.write("\t             \t{field : 'note', width : 100, title : '备注', align:'center', formatter:formatCustomNote}, \r\n");
      out.write("\t        ] ],  \r\n");
      out.write("\t    });\r\n");
      out.write("\t}else{\r\n");
      out.write("\t\t$(\"#customList\").datagrid({  \r\n");
      out.write("\t        title:'客户列表', singleSelect:false, collapsible:true, pagination:true, rownumbers:true, \r\n");
      out.write("\t        \tmethod:'get', nowrap:true,  \r\n");
      out.write("\t        toolbar:\"toolbar_custom\", url:'custom/search_custom_by_'+name+'?searchValue='+value, \r\n");
      out.write("\t        \tloadMsg:'数据加载中......',  fitColumns:true,//允许表格自动缩放,以适应父容器  \r\n");
      out.write("\t        columns : [ [ \r\n");
      out.write("\t\t\t\t\t{field : 'ck', checkbox:true }, \r\n");
      out.write("\t\t\t\t\t{field : 'customId', width : 100, title : '客户编号', align:'center'},\r\n");
      out.write("\t\t\t\t\t{field : 'customName', width : 100, align : 'center', title : '客户名称'},\r\n");
      out.write("\t\t\t\t\t{field : 'fullName', width : 200, align : 'center', title : '客户全称'}, \r\n");
      out.write("\t\t\t\t\t{field : 'address', width : 200, title : '地址', align:'center'}, \r\n");
      out.write("\t\t\t\t\t{field : 'fax', width : 100, title : '传真', align:'center'}, \r\n");
      out.write("\t\t\t\t\t{field : 'email', width : 70, title : '邮箱', align:'center'}, \r\n");
      out.write("\t\t\t\t\t{field : 'ownerName', width : 60, title : '经理姓名', align:'center'}, \r\n");
      out.write("\t\t\t\t\t{field : 'ownerTel', width : 100, title : '联系电话', align:'center'}, \r\n");
      out.write("\t\t\t\t\t{field : 'status', width : 60, title : '客户状态', align:'center', \r\n");
      out.write("\t\t\t\t\t\t\tformatter:TAOTAO.formatCustomStatus}, \r\n");
      out.write("\t\t\t\t\t{field : 'note', width : 100, title : '备注', align:'center', formatter:formatCustomNote}, \r\n");
      out.write("\t        ] ],  \r\n");
      out.write("\t    });\r\n");
      out.write("\t}\r\n");
      out.write("}\t\r\n");
      out.write("\tvar customNoteEditor ;\r\n");
      out.write("\t\r\n");
      out.write("\t//根据index拿到该行值\r\n");
      out.write("\tfunction onCustomClickRow(index) {\r\n");
      out.write("\t\tvar rows = $('#customList').datagrid('getRows');\r\n");
      out.write("\t\treturn rows[index];\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t//格式化客户介绍\r\n");
      out.write("\tfunction formatCustomNote(value, row, index){ \r\n");
      out.write("\t\tif(value !=null && value != ''){\r\n");
      out.write("\t\t\treturn \"<a href=javascript:openCustomNote(\"+index+\")>\"+\"客户介绍\"+\"</a>\";\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\treturn \"无\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction  openCustomNote(index){ \r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar row = onCustomClickRow(index);\r\n");
      out.write("\t\t$(\"#customNoteDialog\").dialog({\r\n");
      out.write("\t\t\tonOpen :function(){\r\n");
      out.write("\t\t\t\t$(\"#customNoteForm [name=customId]\").val(row.customId);\r\n");
      out.write("\t\t\t\tcustomNoteEditor = TAOTAO.createEditor(\"#customNoteForm [name=note]\");\r\n");
      out.write("\t\t\t\tcustomNoteEditor.html(row.note);\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\tonBeforeClose: function (event, ui) {\r\n");
      out.write("\t\t\t\t// 关闭Dialog前移除编辑器\r\n");
      out.write("\t\t\t   \tKindEditor.remove(\"#customNoteForm [name=note]\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}).dialog(\"open\");\r\n");
      out.write("\t};\r\n");
      out.write("\t\r\n");
      out.write("\tfunction updateCustomNote(){\r\n");
      out.write("\t\t$.get(\"custom/edit_judge\",'',function(data){\r\n");
      out.write("    \t\tif(data.msg != null){\r\n");
      out.write("    \t\t\t$.messager.alert('提示', data.msg);\r\n");
      out.write("    \t\t}else{\r\n");
      out.write("    \t\t\tcustomNoteEditor.sync();\r\n");
      out.write("    \t\t\t$.post(\"custom/update_note\",$(\"#customNoteForm\").serialize(), function(data){\r\n");
      out.write("    \t\t\t\tif(data.status == 200){\r\n");
      out.write("    \t\t\t\t\t$(\"#customNoteDialog\").dialog(\"close\");\r\n");
      out.write("    \t\t\t\t\t$(\"#customList\").datagrid(\"reload\");\r\n");
      out.write("    \t\t\t\t\t$.messager.alert(\"操作提示\", \"更新客户介绍成功！\");\r\n");
      out.write("    \t\t\t\t}else{\r\n");
      out.write("    \t\t\t\t\t$.messager.alert(\"操作提示\", \"更新客户介绍失败！\",\"error\");\r\n");
      out.write("    \t\t\t\t}\r\n");
      out.write("    \t\t\t});\r\n");
      out.write("    \t\t}\r\n");
      out.write("    \t});\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction getCustomSelectionsIds(){\r\n");
      out.write("\t\tvar customList = $(\"#customList\");\r\n");
      out.write("\t\tvar sels = customList.datagrid(\"getSelections\");\r\n");
      out.write("\t\tvar ids = [];\r\n");
      out.write("\t\tfor(var i in sels){\r\n");
      out.write("\t\t\tids.push(sels[i].customId);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tids = ids.join(\",\"); \r\n");
      out.write("\t\t\r\n");
      out.write("\t\treturn ids;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction custom_add(){\r\n");
      out.write("    \t$.get(\"custom/add_judge\",'',function(data){\r\n");
      out.write("       \t\tif(data.msg != null){\r\n");
      out.write("       \t\t\t$.messager.alert('提示', data.msg);\r\n");
      out.write("       \t\t}else{\r\n");
      out.write("       \t\t\t$(\"#customAddWindow\").window(\"open\");\r\n");
      out.write("       \t\t}\r\n");
      out.write("       \t});\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function custom_edit(){\r\n");
      out.write("    \t$.get(\"custom/edit_judge\",'',function(data){\r\n");
      out.write("       \t\tif(data.msg != null){\r\n");
      out.write("       \t\t\t$.messager.alert('提示', data.msg);\r\n");
      out.write("       \t\t}else{\r\n");
      out.write("       \t\t\tvar ids = getCustomSelectionsIds();\r\n");
      out.write("    \t    \t\r\n");
      out.write("    \t    \tif(ids.length == 0){\r\n");
      out.write("    \t    \t\t$.messager.alert('提示','必须选择一个客户才能编辑!');\r\n");
      out.write("    \t    \t\treturn ;\r\n");
      out.write("    \t    \t}\r\n");
      out.write("    \t    \tif(ids.indexOf(',') > 0){\r\n");
      out.write("    \t    \t\t$.messager.alert('提示','只能选择一个客户!');\r\n");
      out.write("    \t    \t\treturn ;\r\n");
      out.write("    \t    \t}\r\n");
      out.write("    \t    \t\r\n");
      out.write("    \t    \t$(\"#customEditWindow\").window({\r\n");
      out.write("    \t    \t\tonLoad :function(){\r\n");
      out.write("    \t    \t\t\t//回显数据\r\n");
      out.write("    \t    \t\t\tvar data = $(\"#customList\").datagrid(\"getSelections\")[0];\r\n");
      out.write("    \t    \t\t\t$(\"#customEditForm\").form(\"load\", data);\r\n");
      out.write("    \t    \t\t\tcustomEditEditor.html(data.note);\r\n");
      out.write("    \t    \t\t}\r\n");
      out.write("    \t    \t}).window(\"open\");\r\n");
      out.write("       \t\t}\r\n");
      out.write("       \t});\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function custom_delete(){\r\n");
      out.write("    \t$.get(\"custom/delete_judge\",'',function(data){\r\n");
      out.write("       \t\tif(data.msg != null){\r\n");
      out.write("       \t\t\t$.messager.alert('提示', data.msg);\r\n");
      out.write("       \t\t}else{\r\n");
      out.write("       \t\t\tvar ids = getCustomSelectionsIds();\r\n");
      out.write("    \t    \tif(ids.length == 0){\r\n");
      out.write("    \t    \t\t$.messager.alert('提示','未选中客户!');\r\n");
      out.write("    \t    \t\treturn ;\r\n");
      out.write("    \t    \t}\r\n");
      out.write("    \t    \t$.messager.confirm('确认','确定删除ID为 '+ids+' 的客户吗？',function(r){\r\n");
      out.write("    \t    \t    if (r){\r\n");
      out.write("    \t    \t    \tvar params = {\"ids\":ids};\r\n");
      out.write("    \t            \t$.post(\"custom/delete_batch\",params, function(data){\r\n");
      out.write("    \t        \t\t\tif(data.status == 200){\r\n");
      out.write("    \t        \t\t\t\t$.messager.alert('提示','删除客户成功!',undefined,function(){\r\n");
      out.write("    \t        \t\t\t\t\t$(\"#customList\").datagrid(\"reload\");\r\n");
      out.write("    \t        \t\t\t\t});\r\n");
      out.write("    \t        \t\t\t}\r\n");
      out.write("    \t        \t\t});\r\n");
      out.write("    \t    \t    }\r\n");
      out.write("    \t    \t});\r\n");
      out.write("       \t\t}\r\n");
      out.write("       \t});\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function custom_reload(){\r\n");
      out.write("    \t$(\"#customList\").datagrid(\"reload\");\r\n");
      out.write("    }\r\n");
      out.write("</script>");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/jsp/custom_list.jsp(28,1) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/custom_list.jsp(28,1) '${sessionScope.sysPermissionList}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${sessionScope.sysPermissionList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/custom_list.jsp(28,1) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("per");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t");
          if (_jspx_meth_c_005fif_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\r\n");
          out.write("\t\t");
          if (_jspx_meth_c_005fif_005f1(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\r\n");
          out.write("\t\t");
          if (_jspx_meth_c_005fif_005f2(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write('\r');
          out.write('\n');
          out.write('	');
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /WEB-INF/jsp/custom_list.jsp(29,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${per=='custom:add' }", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t    <div style=\"float: left;\">  \r\n");
        out.write("\t\t        <a href=\"#\" class=\"easyui-linkbutton\" plain=\"true\" icon=\"icon-add\" onclick=\"custom_add()\">新增</a>  \r\n");
        out.write("\t\t    </div>  \r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /WEB-INF/jsp/custom_list.jsp(34,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${per=='custom:edit' }", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t    <div style=\"float: left;\">  \r\n");
        out.write("\t\t        <a href=\"#\" class=\"easyui-linkbutton\" plain=\"true\" icon=\"icon-edit\" onclick=\"custom_edit()\">编辑</a>  \r\n");
        out.write("\t\t    </div>  \r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /WEB-INF/jsp/custom_list.jsp(39,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${per=='custom:delete' }", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
    if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t    <div style=\"float: left;\">  \r\n");
        out.write("\t\t        <a href=\"#\" class=\"easyui-linkbutton\" plain=\"true\" icon=\"icon-cancel\"\r\n");
        out.write("\t\t        \t onclick=\"custom_delete()\">删除</a>  \r\n");
        out.write("\t\t    </div>  \r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
    return false;
  }
}
