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
				<p>xxx</p>
				<a href="#"><i class="fa fa-circle text-success"></i> 在线</a>
			</div>
		</div>

		<!-- sidebar menu: : style can be found in sidebar.less -->
		<ul class="sidebar-menu">
			<li class="header">菜单</li>
			<li id="admin-index"><a
				href="${pageContext.request.contextPath}../admin/adminmain.jsp"><i
					class="fa fa-dashboard"></i> <span>首页</span></a></li>

			<li class="treeview"><a href="#"> <i class="fa fa-cube"></i>
				<span>专业管理</span> <span class="pull-right-container"> <i
						class="fa fa-angle-left pull-right"></i>
				</span>
			</a>
				<ul class="treeview-menu">

					<li id="system-setting">
						<a href="${pageContext.request.contextPath}/course/course-add.jsp">
							<i class="fa fa-circle-o"></i> 添加专业
						</a></li>
					<li id="system-setting"><a
							href="${pageContext.request.contextPath}/orders/findAll.do?page=1&pageSize=3"> <i
							class="fa fa-circle-o"></i> 查询专业
					</a></li>
					<li id="system-setting"><a
							href="${pageContext.request.contextPath}/orders/findAll.do?page=1&pageSize=3"> <i
							class="fa fa-circle-o"></i> 删除专业
					</a></li>

				</ul></li>
			<li class="treeview"><a href="#"> <i class="fa fa-cube"></i>
				<span>课程管理</span> <span class="pull-right-container"> <i
						class="fa fa-angle-left pull-right"></i>
				</span>
			</a>
				<ul class="treeview-menu">

					<li id="system-setting">
						<a href="${pageContext.request.contextPath}/course/course-add.jsp">
							<i class="fa fa-circle-o"></i> 添加课程
						</a></li>
					<li id="system-setting">
						<a href="${pageContext.request.contextPath}/course/query">
						<i class="fa fa-circle-o"></i> 查看课程
					</a></li>
					<li id="system-setting">
						<a href="${pageContext.request.contextPath}/course/query">
						<i class="fa fa-circle-o"></i> 删除课程
					</a></li>

				</ul></li>
			<li class="treeview"><a href="#"> <i class="fa fa-cogs"></i>
					<span>用户管理</span> <span class="pull-right-container"> <i
						class="fa fa-angle-left pull-right"></i>
				</span>
			</a>
				<ul class="treeview-menu">

					<li id="system-setting"><a
						href="${pageContext.request.contextPath}/admin/teacher.jsp"> <i
							class="fa fa-circle-o"></i> 教师管理
					</a></li>
					<li id="system-setting"><a
						href="${pageContext.request.contextPath}/admin/student.jsp"> <i
							class="fa fa-circle-o"></i>学生管理
					</a></li>
					<li id="system-setting"><a
						href="${pageContext.request.contextPath}/permission/findAll.do">
							<i class="fa fa-circle-o"></i> 监考员管理
					</a></li>
				</ul></li>
			<li class="treeview"><a href="#"> <i class="fa fa-cube"></i>
					<span>套题管理</span> <span class="pull-right-container"> <i
						class="fa fa-angle-left pull-right"></i>
				</span>
			</a>
				<ul class="treeview-menu">

					<li id="system-setting">
						<a href="${pageContext.request.contextPath}/course/course-add.jsp">
							<i class="fa fa-circle-o"></i> 查询套题
					</a></li>
					<li id="system-setting">
						<a href="${pageContext.request.contextPath}/course/query">
							<i class="fa fa-circle-o"></i> 查看课程
						</a></li>
					<li id="system-setting"><a
						href="${pageContext.request.contextPath}/orders/findAll.do?page=1&pageSize=3"> <i
							class="fa fa-circle-o"></i> 删除套题
					</a></li>

				</ul></li>

		</ul>
	</section>
	<!-- /.sidebar -->
</aside>