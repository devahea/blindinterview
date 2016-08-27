<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
	<head>
	
		
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
		<meta charset="utf-8" />
		<title>Form Elements - Ace Admin</title>

		<meta name="description" content="Common form elements and layouts" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />

		<!-- bootstrap & fontawesome -->
		<link rel="stylesheet" href="<%=request.getContextPath()%>/assets/css/bootstrap.css" />
		<link rel="stylesheet" href="<%=request.getContextPath()%>/components/font-awesome/css/font-awesome.css" />

		<!-- page specific plugin styles -->
		<link rel="stylesheet" href="<%=request.getContextPath()%>/components/_mod/jquery-ui.custom/jquery-ui.custom.css" />
		<link rel="stylesheet" href="<%=request.getContextPath()%>/components/chosen/chosen.css" />
		<link rel="stylesheet" href="<%=request.getContextPath()%>/components/bootstrap-datepicker/dist/css/bootstrap-datepicker3.css" />
		<link rel="stylesheet" href="<%=request.getContextPath()%>/components/bootstrap-timepicker/css/bootstrap-timepicker.css" />
		<link rel="stylesheet" href="<%=request.getContextPath()%>/components/bootstrap-daterangepicker/daterangepicker.css" />
		<link rel="stylesheet" href="<%=request.getContextPath()%>/components/eonasdan-bootstrap-datetimepicker/build/css/bootstrap-datetimepicker.css" />
		<link rel="stylesheet" href="<%=request.getContextPath()%>/components/mjolnic-bootstrap-colorpicker/dist/css/bootstrap-colorpicker.css" />

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

		<!-- inline styles related to this page -->

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
						<a  href="/api/home.do">
							<i class="menu-icon fa fa-tachometer"></i>
							<span class="menu-text">HOME </span>
						</a>

						<b class="arrow"></b>
					</li>
					<li class="">
						<a  href="/user/index.do">
							<i class="menu-icon fa fa-tachometer"></i>
							<span class="menu-text">ADVERTISE </span>
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
						<!-- /section:settings.box -->
						<div class="page-content-area">
						
						

							
						<div class="row">
							<div class="col-xs-12">
								<!-- PAGE CONTENT BEGINS -->
								<form id="insertForm" enctype="multipart/form-data" action="${pageContext.request.contextPath}/resume/create" class="form-horizontal" role="form" method="post">
									<!-- #section:elements.form -->
									<div class="form-group">
										<label class="col-sm-3 control-label no-padding-right" for="form-field-1"> Title </label>

										<div class="col-sm-9">
											<input type="text" id="form-field-1" placeholder="제목을 입력해주세요" class="col-xs-10 col-sm-5" name="title"/>
										</div>
									</div>

									<div class="form-group">
										<label class="col-sm-3 control-label no-padding-right" for="form-field-1-1">Content</label>

										<div class="col-sm-9">
											<textarea rows="5" cols="20" placeholder="내용을 입력해주세요"  class="form-control" name="content"></textarea> 
										</div>
									</div>

									<!-- /section:elements.form -->
									<div class="space-4"></div>

									<div class="form-group">
										<label class="col-sm-3 control-label no-padding-right" for="form-field-2"> Password Field </label>

										<div class="col-sm-9">
											<div class="form-group">
												<div class="col-xs-12">
													<input multiple="" type="file" id="id-input-file-3" name="file"/>

													<!-- /section:custom/file-input -->
												</div>
											</div>

										</div>
									</div>

									<div class="space-4"></div>


									<div class="clearfix form-actions">
										<div class="col-md-offset-3 col-md-9">
											<button class="btn btn-info" type="button" id="saveBtn">
												<i class="ace-icon fa fa-check bigger-110"></i>
												Save
											</button>

											&nbsp; &nbsp; &nbsp;
											<button class="btn" type="reset">
												<i class="ace-icon fa fa-undo bigger-110"></i>
												Reset
											</button>
										</div>
									</div>

								</form>
									<div class="hr hr-24"></div>
							</div><!-- /.col -->
						</div><!-- /.row -->

							
							</div>
						
						
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
		
		
		
		<!-- page specific plugin scripts -->

		<!--[if lte IE 8]>
		  <script src="../components/ExplorerCanvas/excanvas.js"></script>
		<![endif]-->
		<script src="<%=request.getContextPath()%>/components/_mod/jquery-ui.custom/jquery-ui.custom.js"></script>
		<script src="<%=request.getContextPath()%>/components/jqueryui-touch-punch/jquery.ui.touch-punch.js"></script>
		<script src="<%=request.getContextPath()%>/components/chosen/chosen.jquery.js"></script>
		<script src="<%=request.getContextPath()%>/components/fuelux/js/spinbox.js"></script>
		<script src="<%=request.getContextPath()%>/components/bootstrap-datepicker/dist/js/bootstrap-datepicker.js"></script>
		<script src="<%=request.getContextPath()%>/components/bootstrap-timepicker/js/bootstrap-timepicker.js"></script>
		<script src="<%=request.getContextPath()%>/components/moment/moment.js"></script>
		<script src="<%=request.getContextPath()%>/components/bootstrap-daterangepicker/daterangepicker.js"></script>
		<script src="<%=request.getContextPath()%>/components/eonasdan-bootstrap-datetimepicker/src/js/bootstrap-datetimepicker.js"></script>
		<script src="<%=request.getContextPath()%>/components/mjolnic-bootstrap-colorpicker/dist/js/bootstrap-colorpicker.js"></script>
		<script src="<%=request.getContextPath()%>/components/jquery-knob/js/jquery.knob.js"></script>
		<script src="<%=request.getContextPath()%>/components/autosize/dist/autosize.js"></script>
		<script src="<%=request.getContextPath()%>/components/jquery-inputlimiter/jquery.inputlimiter.js"></script>
		<script src="<%=request.getContextPath()%>/components/jquery.maskedinput/dist/jquery.maskedinput.js"></script>
		<script src="<%=request.getContextPath()%>/components/_mod/bootstrap-tag/bootstrap-tag.js"></script>

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
		
		
		<script type="text/javascript">
			jQuery(function($) {
				
				
				$("#saveBtn").click(function(){
					$("#insertForm").submit();
				});
				
				
				$('#id-disable-check').on('click', function() {
					var inp = $('#form-input-readonly').get(0);
					if(inp.hasAttribute('disabled')) {
						inp.setAttribute('readonly' , 'true');
						inp.removeAttribute('disabled');
						inp.value="This text field is readonly!";
					}
					else {
						inp.setAttribute('disabled' , 'disabled');
						inp.removeAttribute('readonly');
						inp.value="This text field is disabled!";
					}
				});
			
				
				$('#id-input-file-1 , #id-input-file-2').ace_file_input({
					no_file:'No File ...',
					btn_choose:'Choose',
					btn_change:'Change',
					droppable:false,
					onchange:null,
					thumbnail:false //| true | large
					//whitelist:'gif|png|jpg|jpeg'
					//blacklist:'exe|php'
					//onchange:''
					//
				});
				//pre-show a file name, for example a previously selected file
				//$('#id-input-file-1').ace_file_input('show_file_list', ['myfile.txt'])
			
			
				$('#id-input-file-3').ace_file_input({
					style: 'well',
					btn_choose: 'Drop files here or click to choose',
					btn_change: null,
					no_icon: 'ace-icon fa fa-cloud-upload',
					droppable: true,
					thumbnail: 'small'//large | fit
					//,icon_remove:null//set null, to hide remove/reset button
					/**,before_change:function(files, dropped) {
						//Check an example below
						//or examples/file-upload.html
						return true;
					}*/
					/**,before_remove : function() {
						return true;
					}*/
					,
					preview_error : function(filename, error_code) {
						//name of the file that failed
						//error_code values
						//1 = 'FILE_LOAD_FAILED',
						//2 = 'IMAGE_LOAD_FAILED',
						//3 = 'THUMBNAIL_FAILED'
						//alert(error_code);
					}
			
				}).on('change', function(){
					//console.log($(this).data('ace_input_files'));
					//console.log($(this).data('ace_input_method'));
				});
				
				
				//$('#id-input-file-3')
				//.ace_file_input('show_file_list', [
					//{type: 'image', name: 'name of image', path: 'http://path/to/image/for/preview'},
					//{type: 'file', name: 'hello.txt'}
				//]);
			
				
				
			
				//dynamically change allowed formats by changing allowExt && allowMime function
				$('#id-file-format').removeAttr('checked').on('change', function() {
					var whitelist_ext, whitelist_mime;
					var btn_choose
					var no_icon
					if(this.checked) {
						btn_choose = "Drop images here or click to choose";
						no_icon = "ace-icon fa fa-picture-o";
			
						whitelist_ext = ["jpeg", "jpg", "png", "gif" , "bmp"];
						whitelist_mime = ["image/jpg", "image/jpeg", "image/png", "image/gif", "image/bmp"];
					}
					else {
						btn_choose = "Drop files here or click to choose";
						no_icon = "ace-icon fa fa-cloud-upload";
						
						whitelist_ext = null;//all extensions are acceptable
						whitelist_mime = null;//all mimes are acceptable
					}
					var file_input = $('#id-input-file-3');
					file_input
					.ace_file_input('update_settings',
					{
						'btn_choose': btn_choose,
						'no_icon': no_icon,
						'allowExt': whitelist_ext,
						'allowMime': whitelist_mime
					})
					file_input.ace_file_input('reset_input');
					
					file_input
					.off('file.error.ace')
					.on('file.error.ace', function(e, info) {
						//console.log(info.file_count);//number of selected files
						//console.log(info.invalid_count);//number of invalid files
						//console.log(info.error_list);//a list of errors in the following format
						
						//info.error_count['ext']
						//info.error_count['mime']
						//info.error_count['size']
						
						//info.error_list['ext']  = [list of file names with invalid extension]
						//info.error_list['mime'] = [list of file names with invalid mimetype]
						//info.error_list['size'] = [list of file names with invalid size]
						
						
						/**
						if( !info.dropped ) {
							//perhapse reset file field if files have been selected, and there are invalid files among them
							//when files are dropped, only valid files will be added to our file array
							e.preventDefault();//it will rest input
						}
						*/
						
						
						//if files have been selected (not dropped), you can choose to reset input
						//because browser keeps all selected files anyway and this cannot be changed
						//we can only reset file field to become empty again
						//on any case you still should check files with your server side script
						//because any arbitrary file can be uploaded by user and it's not safe to rely on browser-side measures
					});
					
					
					/**
					file_input
					.off('file.preview.ace')
					.on('file.preview.ace', function(e, info) {
						console.log(info.file.width);
						console.log(info.file.height);
						e.preventDefault();//to prevent preview
					});
					*/
				
				});
			
				$(document).one('ajaxloadstart.page', function(e) {
					autosize.destroy('textarea[class*=autosize]')
					
					$('.limiterBox,.autosizejs').remove();
					$('.daterangepicker.dropdown-menu,.colorpicker.dropdown-menu,.bootstrap-datetimepicker-widget.dropdown-menu').remove();
				});
			
			});
		</script>
		
		
		<!-- the following scripts are used in demo only for onpage help and you don't need them -->
		<link rel="stylesheet" href="<%=request.getContextPath()%>/assets/css/ace.onpage-help.css" />
		<link rel="stylesheet" href="<%=request.getContextPath()%>/docs/assets/js/themes/sunburst.css" />

		<script type="text/javascript"> ace.vars['base'] = '<%=request.getContextPath()%>'; </script>
		<script src="<%=request.getContextPath()%>/assets/js/src/elements.onpage-help.js"></script>
		<script src="<%=request.getContextPath()%>/assets/js/src/ace.onpage-help.js"></script>
		<script src="<%=request.getContextPath()%>/docs/assets/js/rainbow.js"></script>
		<script src="<%=request.getContextPath()%>/docs/assets/js/language/generic.js"></script>
		<script src="<%=request.getContextPath()%>/docs/assets/js/language/html.js"></script>
		<script src="<%=request.getContextPath()%>/docs/assets/js/language/css.js"></script>
		<script src="<%=request.getContextPath()%>/docs/assets/js/language/javascript.js"></script>
		
		
	</body>
</html>
