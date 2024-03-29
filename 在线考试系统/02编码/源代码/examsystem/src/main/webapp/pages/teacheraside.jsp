<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<aside class="main-sidebar">
    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar">
        <!-- Sidebar user panel -->
        <div class="user-panel">
            <div class="pull-left image">
                <img src="${pageContext.request.contextPath}/img/user2-160x160.jpg"
                     class="img-circle" alt="User Image">
            </div>
            <div class="pull-left info">
                <p>${sessionScope.teacher.tname}</p>
                <a href="#"><i class="fa fa-circle text-success"></i> 在线</a>
            </div>
        </div>

        <!-- sidebar menu: : style can be found in sidebar.less -->
        <ul class="sidebar-menu">
            <li class="header">菜单</li>
            <li id="admin-index"><a
                    href="${pageContext.request.contextPath}../teacher/teachermain.jsp"><i
                    class="fa fa-dashboard"></i> <span>首页</span></a></li>

            <li class="treeview"><a href="#"> <i class="fa fa-cube"></i>
                <span>个人信息管理</span> <span class="pull-right-container"> <i
                        class="fa fa-angle-left pull-right"></i>
				</span>
            </a>
                <ul class="treeview-menu">

                    <li id="system-setting">
                        <a href="${pageContext.request.contextPath}/Teacher/getteacherInfo">
                            <i class="fa fa-circle-o"></i> 查看个人信息
                        </a></li>
                    <li id="system-setting">
                        <a href="${pageContext.request.contextPath}/teacher/updateTpw.jsp">
                            <i class="fa fa-circle-o"></i> 修改密码
                        </a></li>
                </ul></li>
            <li class="treeview"><a href="#"> <i class="fa fa-cogs"></i>
                <span>试题题库管理</span> <span class="pull-right-container"> <i
                        class="fa fa-angle-left pull-right"></i>
				</span>


            </a>
                <ul class="treeview-menu">

                    <li id="system-setting"><a
                            href="${pageContext.request.contextPath}/teacher/queryQuestion.jsp"> <i
                            class="fa fa-circle-o"></i> 查找试题
                    </a></li>
                    <li id="system-setting"><a
                            href="${pageContext.request.contextPath}/teacher/addQuestion.jsp"> <i
                            class="fa fa-circle-o"></i> 添加试题
                    </a></li>
                </ul></li>
            <li class="treeview"><a href="#"> <i class="fa fa-cube"></i>
                <span>试卷管理</span> <span class="pull-right-container"> <i
                        class="fa fa-angle-left pull-right"></i>
				</span>
            </a>
                <ul class="treeview-menu">
                    <li id="system-setting">
                        <a href="${pageContext.request.contextPath}/shijuan/query">
                            <i class="fa fa-circle-o"></i> 查看试卷
                        </a></li>
                    <li id="system-setting"><a
                            href="${pageContext.request.contextPath}../teacher/ShengchengSJname.jsp"> <i
                            class="fa fa-circle-o"></i> 组织试卷
                    </a></li>
                </ul></li>
            <li class="treeview"><a href="#"> <i class="fa fa-cube"></i>
                <span>考试管理</span> <span class="pull-right-container"> <i
                        class="fa fa-angle-left pull-right"></i>
				</span>
            </a>
                <ul class="treeview-menu">
                    <li id="system-setting"><a
                            href="${pageContext.request.contextPath}/teacher/fabukaoshi.jsp"> <i
                            class="fa fa-circle-o"></i> 发布考试
                    </a></li>
                    <li id="system-setting">
                        <a href="${pageContext.request.contextPath}/teacher/kcxx.jsp">
                            <i class="fa fa-circle-o"></i> 考场信息
                        </a></li>
                </ul></li>
            <li class="treeview"><a href="#"> <i class="fa fa-cogs"></i>
                <span>成绩管理</span> <span class="pull-right-container"> <i
                        class="fa fa-angle-left pull-right"></i>
				</span>
            </a>
                <ul class="treeview-menu">

                    <li id="system-setting"><a
                            href="${pageContext.request.contextPath}/teacher/select_all_score.jsp"> <i
                            class="fa fa-circle-o"></i> 查看考生成绩
                    </a></li>
                    <li id="system-setting"><a
                            href="${pageContext.request.contextPath}/teacher/select_analysis_degree.jsp"> <i
                            class="fa fa-circle-o"></i> 成绩分析
                    </a></li>
                </ul></li>
        </ul>
    </section>
    <!-- /.sidebar -->
</aside>