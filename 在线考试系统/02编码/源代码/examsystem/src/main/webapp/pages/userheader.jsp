<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!-- 页面头部 -->
<header class="main-header">
    <!-- Logo -->
    <a href="all-admin-index.html" class="logo"> <!-- mini logo for sidebar mini 50x50 pixels -->
        <span class="logo-mini"><b>在线</b></span> <!-- logo for regular state and mobile devices -->
        <span class="logo-lg"><b>在线</b>考试系统</span>
    </a>
    <!-- Header Navbar: style can be found in header.less -->
    <nav class="navbar navbar-static-top">
        <!-- Sidebar toggle button-->
        <a href="#" class="sidebar-toggle" data-toggle="offcanvas"
           role="button"> <span class="sr-only">Toggle navigation</span>
        </a>

        <div class="navbar-custom-menu">
            <ul class="nav navbar-nav">

                <li class="dropdown user user-menu"><a href="#"
                                                       class="dropdown-toggle" data-toggle="dropdown"> <img
                        src="${pageContext.request.contextPath}/img/user2-160x160.jpg"
                        class="user-image" alt="User Image"> <span class="hidden-xs">
                        个人中心
					</span>

                </a>
                    <ul class="dropdown-menu">
                        <!-- User image -->
                        <li class="user-header"><img
                                src="${pageContext.request.contextPath}/img/user2-160x160.jpg"
                                class="img-circle" alt="User Image"></li>
                        <!-- Menu Footer-->
                        <li class="user-footer">
                            <div class="pull-right">
                                <a href="${pageContext.request.contextPath}/index.jsp"
                                   class="btn btn-default btn-flat">注销</a>
                            </div>
                        </li>
                    </ul></li>

            </ul>
        </div>
    </nav>
</header>
<!-- 页面头部 /-->