<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <!-- 页面meta -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <title>在线考试系统</title>
    <meta name="description" content="AdminLTE2定制版">
    <meta name="keywords" content="AdminLTE2定制版">

    <!-- Tell the browser to be responsive to screen width -->
    <meta
            content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no"
            name="viewport">
    <!-- Bootstrap 3.3.6 -->
    <!-- Font Awesome -->
    <!-- Ionicons -->
    <!-- iCheck -->
    <!-- Morris chart -->
    <!-- jvectormap -->
    <!-- Date Picker -->
    <!-- Daterange picker -->
    <!-- Bootstrap time Picker -->
    <!--<link rel="stylesheet" href="${pageContext.request.contextPath}/${pageContext.request.contextPath}/${pageContext.request.contextPath}/plugins/timepicker/bootstrap-timepicker.min.css">-->
    <!-- bootstrap wysihtml5 - text editor -->
    <!--数据表格-->
    <!-- 表格树 -->
    <!-- select2 -->
    <!-- Bootstrap Color Picker -->
    <!-- bootstrap wysihtml5 - text editor -->
    <!--bootstrap-markdown-->
    <!-- Theme style -->
    <!-- AdminLTE Skins. Choose a skin from the css/skins
           folder instead of downloading all of them to reduce the load. -->
    <!-- Ion Slider -->
    <!-- ion slider Nice -->
    <!-- bootstrap slider -->
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

    <!-- jQuery 2.2.3 -->
    <!-- jQuery UI 1.11.4 -->
    <!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
    <!-- Bootstrap 3.3.6 -->
    <!-- Morris.js charts -->
    <!-- Sparkline -->
    <!-- jvectormap -->
    <!-- jQuery Knob Chart -->
    <!-- daterangepicker -->
    <!-- datepicker -->
    <!-- Bootstrap WYSIHTML5 -->
    <!-- Slimscroll -->
    <!-- FastClick -->
    <!-- iCheck -->
    <!-- AdminLTE App -->
    <!-- 表格树 -->
    <!-- select2 -->
    <!-- bootstrap color picker -->
    <!-- bootstrap time picker -->
    <!--<script src="${pageContext.request.contextPath}/${pageContext.request.contextPath}/${pageContext.request.contextPath}/plugins/timepicker/bootstrap-timepicker.min.js"></script>-->
    <!-- Bootstrap WYSIHTML5 -->
    <!--bootstrap-markdown-->
    <!-- CK Editor -->
    <!-- InputMask -->
    <!-- DataTables -->
    <!-- ChartJS 1.0.1 -->
    <!-- FLOT CHARTS -->
    <!-- FLOT RESIZE PLUGIN - allows the chart to redraw when the window is resized -->
    <!-- FLOT PIE PLUGIN - also used to draw donut charts -->
    <!-- FLOT CATEGORIES PLUGIN - Used to draw bar charts -->
    <!-- jQuery Knob -->
    <!-- Sparkline -->
    <!-- Morris.js charts -->
    <!-- Ion Slider -->
    <!-- Bootstrap slider -->
    <!-- 页面meta /-->

    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/ionicons/css/ionicons.min.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/iCheck/square/blue.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/morris/morris.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/jvectormap/jquery-jvectormap-1.2.2.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/datepicker/datepicker3.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/daterangepicker/daterangepicker.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/datatables/dataTables.bootstrap.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/treeTable/jquery.treetable.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/treeTable/jquery.treetable.theme.default.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/select2/select2.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/colorpicker/bootstrap-colorpicker.min.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/bootstrap-markdown/css/bootstrap-markdown.min.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/adminLTE/css/AdminLTE.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/adminLTE/css/skins/_all-skins.min.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/css/style.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/ionslider/ion.rangeSlider.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/ionslider/ion.rangeSlider.skinNice.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/bootstrap-slider/slider.css">
    <script  src="/js/jquery.min.js"></script>
    <script>
        $(function(){
            //利用jQuery AJAX加载部门数据
            $.ajax({
                url:'/zy/load_data',//请求URL
                type:'POST',//请求方式
                dataType:'json', //将从服务器获取的数据处理成JSON格式
                success:function(data){
                    //请求成功,data表示从服务获取的数据
                    console.info(data)
                    var length=data.length;
                    if(0==length){
                        alert("未加载到课程数据");
                        return ;
                    }
                    var zylists=data;
                    for(var index=0;index<length;index++){
                        var zylist=zylists[index];
                        var zyid=zylist.zyid;
                        var zyname=zylist.zyname;
                        var optionHTML='<option value="'+zyid+'">'+zyname+'</option>';
                        $("#zyid-select1").append(optionHTML);
                    }
                },
                error: function (XMLHttpRequest, textStatus, errorThrown) {
                    // 请求失败
                    console.error(errorThrown);
                }
            });
        });
        $(function(){
            //利用jQuery AJAX加载部门数据
            $.ajax({
                url:'/shijuan/load_data',//请求URL
                type:'POST',//请求方式
                dataType:'json', //将从服务器获取的数据处理成JSON格式
                success:function(data){
                    //请求成功,data表示从服务获取的数据
                    console.info(data)
                    var length=data.length;
                    if(0==length){
                        alert("未加载到试卷数据");
                        return ;
                    }
                    var shijuans=data;
                    for(var index=0;index<length;index++){
                        var shijuan=shijuans[index];
                        var sjid=shijuan.sjid;
                        var sjname=shijuan.sjname;
                        var optionHTML='<option value="'+sjid+'">'+sjname+'</option>';
                        $("#sjid-select1").append(optionHTML);
                    }
                },
                error: function (XMLHttpRequest, textStatus, errorThrown) {
                    // 请求失败
                    console.error(errorThrown);
                }
            });
        });
    </script>
</head>

<body class="hold-transition skin-blue sidebar-mini">

<div class="wrapper">

    <!-- 页面头部 -->
    <jsp:include page="../pages/userheader.jsp"></jsp:include>
    <!-- 页面头部 /-->

    <!-- 导航侧栏 -->
    <jsp:include page="../pages/teacheraside.jsp"></jsp:include>
    <!-- 导航侧栏 /-->

    <!-- 内容区域 -->
    <div class="content-wrapper" style="height: 1850px">
        <div class="col-md-2 title"></div>
        <div class="col-md-4 data">
            <form action="/ks/addks" method="post">
                <div>
                    考场名称<input type="text" class="form-control" name="kcname"
                                       placeholder="考场名称" >
                    选择需要考试的学生专业<select type="text" class="form-control" name="zyid" id="zyid-select1"
                                placeholder="选择需要考试的学生专业" ></select>
                    选择试卷<select type="text" class="form-control" name="sjid" id="sjid-select1"
                                placeholder="选择试卷" ></select>
                </div>
                <div style="margin-top: 10px">
                    <input type="submit" value="发布考试">
                </div>
            </form>
            <%--  </br>
              <c:if test="${requestScope.shiTiList!=null}">
              <c:choose>
              <c:when test="${empty requestScope.shiTiList}">
                  <span>未查询到数据</span>
              </c:when>
              <c:otherwise>
              <form action="/shijuan/zuzhi_shijuan">

                  <table width="600" border="1" cellspacing="0" align="center">
                      <tr>
                          <th hidden="">试题ID</th>
                          <th>题目</th>
                          <th>操作</th>
                      </tr>
                      <c:forEach items="${requestScope.shiTiList}" var="test">
                          <tr>
                              <input hidden="" value="${test.stid}" name="">
                              <td>${test.contain}</td>
                              <td align="center">
                                  <a href="#" target="_parent">刷新题库</a>
                              </td>
                          </tr>
                      </c:forEach>
                  </table>
                  </c:otherwise>
                  </c:choose>
                  共查询到:<span style="color: #1f33ff">${fn:length(requestScope.shiTiList)}</span>条记录
                  </c:if>
              </form>--%>

            <!-- 内容区域 /-->

            <!-- 底部导航 -->
            <%--<footer class="main-footer">--%>
            <%--<div class="pull-right hidden-xs">--%>
            <%--<b>Version</b> 1.0.8--%>
            <%--</div>--%>
            <%--<strong>Copyright &copy; 2014-2017 <a--%>
            <%--href="http://www.itcast.cn">研究院研发部</a>.--%>
            <%--</strong> All rights reserved. </footer>--%>
            <!-- 底部导航 /-->
        </div>
    </div>

    <script
            src="${pageContext.request.contextPath}/plugins/jQuery/jquery-2.2.3.min.js"></script>
    <script
            src="${pageContext.request.contextPath}/plugins/jQueryUI/jquery-ui.min.js"></script>
    <script>
        $.widget.bridge('uibutton', $.ui.button);
    </script>
    <script
            src="${pageContext.request.contextPath}/plugins/bootstrap/js/bootstrap.min.js"></script>
    <script
            src="${pageContext.request.contextPath}/plugins/raphael/raphael-min.js"></script>
    <script
            src="${pageContext.request.contextPath}/plugins/morris/morris.min.js"></script>
    <script
            src="${pageContext.request.contextPath}/plugins/sparkline/jquery.sparkline.min.js"></script>
    <script
            src="${pageContext.request.contextPath}/plugins/jvectormap/jquery-jvectormap-1.2.2.min.js"></script>
    <script
            src="${pageContext.request.contextPath}/plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
    <script
            src="${pageContext.request.contextPath}/plugins/knob/jquery.knob.js"></script>
    <script
            src="${pageContext.request.contextPath}/plugins/daterangepicker/moment.min.js"></script>
    <script
            src="${pageContext.request.contextPath}/plugins/daterangepicker/daterangepicker.js"></script>
    <script
            src="${pageContext.request.contextPath}/plugins/daterangepicker/daterangepicker.zh-CN.js"></script>
    <script
            src="${pageContext.request.contextPath}/plugins/datepicker/bootstrap-datepicker.js"></script>
    <script
            src="${pageContext.request.contextPath}/plugins/datepicker/locales/bootstrap-datepicker.zh-CN.js"></script>
    <script
            src="${pageContext.request.contextPath}/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
    <script
            src="${pageContext.request.contextPath}/plugins/slimScroll/jquery.slimscroll.min.js"></script>
    <script
            src="${pageContext.request.contextPath}/plugins/fastclick/fastclick.js"></script>
    <script
            src="${pageContext.request.contextPath}/plugins/iCheck/icheck.min.js"></script>
    <script
            src="${pageContext.request.contextPath}/plugins/adminLTE/js/app.min.js"></script>
    <script
            src="${pageContext.request.contextPath}/plugins/treeTable/jquery.treetable.js"></script>
    <script
            src="${pageContext.request.contextPath}/plugins/select2/select2.full.min.js"></script>
    <script
            src="${pageContext.request.contextPath}/plugins/colorpicker/bootstrap-colorpicker.min.js"></script>
    <script
            src="${pageContext.request.contextPath}/plugins/bootstrap-wysihtml5/bootstrap-wysihtml5.zh-CN.js"></script>
    <script
            src="${pageContext.request.contextPath}/plugins/bootstrap-markdown/js/bootstrap-markdown.js"></script>
    <script
            src="${pageContext.request.contextPath}/plugins/bootstrap-markdown/locale/bootstrap-markdown.zh.js"></script>
    <script
            src="${pageContext.request.contextPath}/plugins/bootstrap-markdown/js/markdown.js"></script>
    <script
            src="${pageContext.request.contextPath}/plugins/bootstrap-markdown/js/to-markdown.js"></script>
    <script
            src="${pageContext.request.contextPath}/plugins/ckeditor/ckeditor.js"></script>
    <script
            src="${pageContext.request.contextPath}/plugins/input-mask/jquery.inputmask.js"></script>
    <script
            src="${pageContext.request.contextPath}/plugins/input-mask/jquery.inputmask.date.extensions.js"></script>
    <script
            src="${pageContext.request.contextPath}/plugins/input-mask/jquery.inputmask.extensions.js"></script>
    <script
            src="${pageContext.request.contextPath}/plugins/datatables/jquery.dataTables.min.js"></script>
    <script
            src="${pageContext.request.contextPath}/plugins/datatables/dataTables.bootstrap.min.js"></script>
    <script
            src="${pageContext.request.contextPath}/plugins/chartjs/Chart.min.js"></script>
    <script
            src="${pageContext.request.contextPath}/plugins/flot/jquery.flot.min.js"></script>
    <script
            src="${pageContext.request.contextPath}/plugins/flot/jquery.flot.resize.min.js"></script>
    <script
            src="${pageContext.request.contextPath}/plugins/flot/jquery.flot.pie.min.js"></script>
    <script
            src="${pageContext.request.contextPath}/plugins/flot/jquery.flot.categories.min.js"></script>
    <script
            src="${pageContext.request.contextPath}/plugins/ionslider/ion.rangeSlider.min.js"></script>
    <script
            src="${pageContext.request.contextPath}/plugins/bootstrap-slider/bootstrap-slider.js"></script>
    <script>
        $(document).ready(function() {
            // 选择框
            $(".select2").select2();

            // WYSIHTML5编辑器
            $(".textarea").wysihtml5({
                locale : 'zh-CN'
            });
        });

        // 设置激活菜单
        function setSidebarActive(tagUri) {
            var liObj = $("#" + tagUri);
            if (liObj.length > 0) {
                liObj.parent().parent().addClass("active");
                liObj.addClass("active");
            }
        }

        $(document).ready(function() {
            // 激活导航位置
            setSidebarActive("admin-index");
        });
    </script>
</body>

</html>