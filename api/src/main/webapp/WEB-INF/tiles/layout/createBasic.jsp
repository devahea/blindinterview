<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html lang="en">
	<head>
	
		
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
		<meta charset="utf-8" />
		<!--  		<title><tiles:getAsString name="title" /></title>-->
		<title>${tilesTitle }</title>

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
