<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
		<meta charset="utf-8" />
		<title><tiles:getAsString name="title" /></title>

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
		<tiles:insertAttribute name="header" />
		<!-- /section:basics/navbar.layout -->
		<div class="main-container" id="main-container">
			<script type="text/javascript">
				try{ace.settings.check('main-container' , 'fixed')}catch(e){}
			</script>

			<!-- #section:basics/sidebar -->
			<tiles:insertAttribute name="sidebar" />
			<!-- /section:basics/sidebar -->
			<div class="main-content">
			<tiles:insertAttribute name="body" />
			</div><!-- /.main-content -->

			<div class="footer">
			<tiles:insertAttribute name="footer" />
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
