<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
		<meta charset="utf-8" />
		<title>Welcome - Ace Admin</title>

		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />

		<!--[if !IE]> -->

		<!-- <link rel="stylesheet" href="<%=request.getContextPath()%>/assets/css/pace.css" />
		<script data-pace-options='{ "ajax": true, "document": true, "eventLag": false, "elements": false }' src="<%=request.getContextPath()%>/components/PACE/pace.js"></script> -->

		<!-- <![endif]-->

		<!-- bootstrap & fontawesome -->
		<link rel="stylesheet" href="<%=request.getContextPath()%>/assets/css/bootstrap.css" />
		<link rel="stylesheet" href="<%=request.getContextPath()%>/components/font-awesome/css/font-awesome.css" />

		<!-- text fonts -->
		<link rel="stylesheet" href="<%=request.getContextPath()%>/assets/css/ace-fonts.css" />

		<!-- ace styles -->
		<link rel="stylesheet" href="<%=request.getContextPath()%>/assets/css/ace.css" class="ace-main-stylesheet" id="main-ace-style" />

		<!--[if lte IE 9]>
			<link rel="stylesheet" href="<%=request.getContextPath()%>/assets/css/ace-part2.css" class="ace-main-stylesheet" />
		<![endif]-->
		<link rel="stylesheet" href="<%=request.getContextPath()%>/assets/css/ace-skins.css" />
		<link rel="stylesheet" href="<%=request.getContextPath()%>/assets/css/ace-rtl.css" />

		<!--[if lte IE 9]>
		  <link rel="stylesheet" href="<%=request.getContextPath()%>/assets/css/ace-ie.css" />
		<![endif]-->

		<!-- ace settings handler -->
		<script src="<%=request.getContextPath()%>/assets/js/ace-extra.js"></script>

		<!-- HTML5shiv and Respond.js for IE8 to support HTML5 elements and media queries -->

		<!--[if lte IE 8]>
		<script src="<%=request.getContextPath()%>/components/html5shiv/dist/html5shiv.min.js"></script>
		<script src="<%=request.getContextPath()%>/components/respond/dest/respond.min.js"></script>
		<![endif]-->
	</head>

	<body class="no-skin">
		<!-- #section:basics/navbar.layout -->
		<div id="navbar" class="navbar navbar-default          ace-save-state">
			<div class="navbar-container ace-save-state" id="navbar-container">
				<!-- #section:basics/sidebar.mobile.toggle -->
				<button type="button" class="navbar-toggle menu-toggler pull-left" id="menu-toggler" data-target="#sidebar">
					<span class="sr-only">Toggle sidebar</span>

					<span class="icon-bar"></span>

					<span class="icon-bar"></span>

					<span class="icon-bar"></span>
				</button>

				<!-- /section:basics/sidebar.mobile.toggle -->
				<div class="navbar-header pull-left">
					<!-- #section:basics/navbar.layout.brand -->
					<a href="#" class="navbar-brand">
						<small>
							<i class="fa fa-leaf"></i>
							Blind Interview
						</small>
					</a>

					<!-- /section:basics/navbar.layout.brand -->

					<!-- #section:basics/navbar.toggle -->

					<!-- /section:basics/navbar.toggle -->
				</div>

				<!-- #section:basics/navbar.dropdown -->
				<div class="navbar-buttons navbar-header pull-right" role="navigation">
					<ul class="nav ace-nav">

						<!-- #section:basics/navbar.user_menu -->
						<li class="light-blue dropdown-modal">
							<a data-toggle="dropdown" href="#" class="dropdown-toggle">
								<img class="nav-user-photo" src="<%=request.getContextPath()%>/assets/avatars/user.jpg" alt="Jason's Photo" />
								<span class="user-info">
									<small>Welcome,</small>
									Jason
								</span>

								<i class="ace-icon fa fa-caret-down"></i>
							</a>

							<ul class="user-menu dropdown-menu-right dropdown-menu dropdown-yellow dropdown-caret dropdown-close">
								<li>
									<a href="#">
										<i class="ace-icon fa fa-cog"></i>
										Settings
									</a>
								</li>

								<li>
									<a href="#page/profile">
										<i class="ace-icon fa fa-user"></i>
										Profile
									</a>
								</li>

								<li class="divider"></li>

								<li>
									<a href="#">
										<i class="ace-icon fa fa-power-off"></i>
										Logout
									</a>
								</li>
							</ul>
						</li>

						<!-- /section:basics/navbar.user_menu -->
					</ul>
				</div>

				<!-- /section:basics/navbar.dropdown -->
			</div><!-- /.navbar-container -->
		</div>

		<!-- /section:basics/navbar.layout -->
		<div class="main-container" id="main-container">
			<script type="text/javascript">
				try{ace.settings.check('main-container' , 'fixed')}catch(e){}
			</script>

			<!-- #section:basics/sidebar -->
			<div id="sidebar" class="sidebar                  responsive                    ace-save-state">
				<script type="text/javascript">
					try{ace.settings.loadState('sidebar')}catch(e){}
				</script>


				<ul class="nav nav-list">
				
				<!-- 단일 메뉴를 만들고 싶은 경우 -->
					<li class="">
						<a  href="/user/index.do">
							<i class="menu-icon fa fa-tachometer"></i>
							<span class="menu-text">Home </span>
						</a>

						<b class="arrow"></b>
					</li>

				<!-- 하위 메뉴를 만들고 싶은 경우 -->
					<li class="">
						<a href="#" class="dropdown-toggle">
							<i class="menu-icon fa fa-list"></i>
							<span class="menu-text"> 하위메뉴 </span>

							<b class="arrow fa fa-angle-down"></b>
						</a>

						<b class="arrow"></b>

						<ul class="submenu">
							<li class="">
								<a href="#page/drop1">
									<i class="menu-icon fa fa-caret-right"></i>
									하위1
								</a>

								<b class="arrow"></b>
							</li>

							<li class="">
								<a href="#page/drop2">
									<i class="menu-icon fa fa-caret-right"></i>
									하위2
								</a>

								<b class="arrow"></b>
							</li>
						</ul>
					</li>


				</ul><!-- /.nav-list -->

				<!-- #section:basics/sidebar.layout.minimize -->
				<div class="sidebar-toggle sidebar-collapse" id="sidebar-collapse">
					<i id="sidebar-toggle-icon" class="ace-icon fa fa-angle-double-left ace-save-state" data-icon1="ace-icon fa fa-angle-double-left" data-icon2="ace-icon fa fa-angle-double-right"></i>
				</div>

				<!-- /section:basics/sidebar.layout.minimize -->
			</div>

			<!-- /section:basics/sidebar -->
			<div class="main-content">
				<div class="main-content-inner">
					<!-- #section:basics/content.breadcrumbs -->
					<div class="breadcrumbs" id="breadcrumbs">
						<script type="text/javascript">
							try{ace.settings.check('breadcrumbs' , 'fixed')}catch(e){}
						</script>

						<ul class="breadcrumb">
							<li>
								<i class="ace-icon fa fa-home home-icon"></i>
								<a href="#">Home</a>
							</li>
						</ul><!-- /.breadcrumb -->

						<!-- #section:basics/content.searchbox -->
						<div class="nav-search" id="nav-search">
							<form class="form-search">
								<span class="input-icon">
									<input type="text" placeholder="Search ..." class="nav-search-input" id="nav-search-input" autocomplete="off" />
									<i class="ace-icon fa fa-search nav-search-icon"></i>
								</span>
							</form>
						</div><!-- /.nav-search -->

						<!-- /section:basics/content.searchbox -->
					</div>

					<!-- /section:basics/content.breadcrumbs -->
					<div class="page-content">
						</div><!-- /.ace-settings-container -->

						<!-- /section:settings.box -->
						<div class="page-content-area" data-ajax-content="true">
							<!-- ajax content goes here -->
						</div><!-- /.page-content-area -->
					</div><!-- /.page-content -->
				</div>
			</div><!-- /.main-content -->

			<div class="footer">
				<div class="footer-inner">
					<!-- #section:basics/footer -->
					<div class="footer-content">
						<span class="bigger-120">
							<span class="blue bolder">Ace</span>
							Application &copy; 2013-2014
						</span>

						&nbsp; &nbsp;
						<span class="action-buttons">
							<a href="#">
								<i class="ace-icon fa fa-twitter-square light-blue bigger-150"></i>
							</a>

							<a href="#">
								<i class="ace-icon fa fa-facebook-square text-primary bigger-150"></i>
							</a>

							<a href="#">
								<i class="ace-icon fa fa-rss-square orange bigger-150"></i>
							</a>
						</span>
					</div>

					<!-- /section:basics/footer -->
				</div>
			</div>

			<a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse">
				<i class="ace-icon fa fa-angle-double-up icon-only bigger-110"></i>
			</a>
		</div><!-- /.main-container -->

		<!-- basic scripts -->

		<!--[if !IE]> -->
		<script src="<%=request.getContextPath()%>/components/jquery/dist/jquery.js"></script>

		<!-- <![endif]-->

		<!--[if IE]>
<script src="<%=request.getContextPath()%>/components/jquery.1x/dist/jquery.js"></script>
<![endif]-->
		<script type="text/javascript">
			if('ontouchstart' in document.documentElement) document.write("<script src='<%=request.getContextPath()%>/components/_mod/jquery.mobile.custom/jquery.mobile.custom.js'>"+"<"+"/script>");
		</script>
		<script src="<%=request.getContextPath()%>/components/bootstrap/dist/js/bootstrap.js"></script>

		<!-- ace scripts -->
		<script src="<%=request.getContextPath()%>/assets/js/src/elements.scroller.js"></script>
		<script src="<%=request.getContextPath()%>/assets/js/src/elements.colorpicker.js"></script>
		<script src="<%=request.getContextPath()%>/assets/js/src/elements.fileinput.js"></script>
		<script src="<%=request.getContextPath()%>/assets/js/src/elements.typeahead.js"></script>
		<script src="<%=request.getContextPath()%>/assets/js/src/elements.wysiwyg.js"></script>
		<script src="<%=request.getContextPath()%>/assets/js/src/elements.spinner.js"></script>
		<script src="<%=request.getContextPath()%>/assets/js/src/elements.treeview.js"></script>
		<script src="<%=request.getContextPath()%>/assets/js/src/elements.wizard.js"></script>
		<script src="<%=request.getContextPath()%>/assets/js/src/elements.aside.js"></script>
		<script src="<%=request.getContextPath()%>/assets/js/src/ace.js"></script>
		<script src="<%=request.getContextPath()%>/assets/js/src/ace.basics.js"></script>
		<script src="<%=request.getContextPath()%>/assets/js/src/ace.scrolltop.js"></script>
		<script src="<%=request.getContextPath()%>/assets/js/src/ace.ajax-content.js"></script>
		<script src="<%=request.getContextPath()%>/assets/js/src/ace.touch-drag.js"></script>
		<script src="<%=request.getContextPath()%>/assets/js/src/ace.sidebar.js"></script>
		<script src="<%=request.getContextPath()%>/assets/js/src/ace.sidebar-scroll-1.js"></script>
		<script src="<%=request.getContextPath()%>/assets/js/src/ace.submenu-hover.js"></script>
		<script src="<%=request.getContextPath()%>/assets/js/src/ace.widget-box.js"></script>
		<script src="<%=request.getContextPath()%>/assets/js/src/ace.settings.js"></script>
		<script src="<%=request.getContextPath()%>/assets/js/src/ace.settings-rtl.js"></script>
		<script src="<%=request.getContextPath()%>/assets/js/src/ace.settings-skin.js"></script>
		<script src="<%=request.getContextPath()%>/assets/js/src/ace.widget-on-reload.js"></script>
		<script src="<%=request.getContextPath()%>/assets/js/src/ace.searchbox-autocomplete.js"></script>
		
	</body>
</html>
