<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Bootstrap Login Form Template</title>

        <!-- CSS -->
        <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/font-awesome/css/font-awesome.min.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/form-elements.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/style.css">
        
        <!-- ace styles -->
		<link rel="stylesheet" href="<%=request.getContextPath()%>/assets/css/ace.css" class="ace-main-stylesheet" id="main-ace-style" />

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->

        <!-- Favicon and touch icons -->
        <link rel="shortcut icon" href="assets/ico/favicon.png">
        <link rel="apple-touch-icon-precomposed" sizes="144x144" href="${pageContext.request.contextPath}/assets/ico/apple-touch-icon-144-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="114x114" href="${pageContext.request.contextPath}/assets/ico/apple-touch-icon-114-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="72x72" href="${pageContext.request.contextPath}/assets/ico/apple-touch-icon-72-precomposed.png">
        <link rel="apple-touch-icon-precomposed" href="${pageContext.request.contextPath}/assets/ico/apple-touch-icon-57-precomposed.png">


<title>Blind Interview</title>
</head>
<body>

	<!-- Top content -->
	<div class="top-content">

		<div class="inner-bg">
			<div class="container">
				<div class="row">
					<div class="col-sm-8 col-sm-offset-2 text">
						<h1>
							<strong>Blind Interview</strong> 
						</h1>
						<div class="description">
							<p>
								일반회원 가입
							</p>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-7 col-sm-offset-3 form-box">
						<div class="form-bottom">
							 <form enctype="multipart/form-data" role="form" action="${pageContext.request.contextPath}/user/join.do" method="post" class="join-form" id="join-form">
							 
								 <div style="float: left;" >
									<div class="form-group">
										 <input
											type="text" name="email" placeholder="email을 입력하세요"
											class="form-username form-control" id="form-username" >
									</div>
									<div class="form-group">
										 <input
											type="password" name="password" placeholder="Password를 입력하세요"
											class="form-password form-control" id="form-password">
									</div>
									<div class="form-group">
										 <input
											type="text" name="name" placeholder="Name을 입력하세요"
											class="form-password form-control" id="form-password">
									</div>
								</div>
								
								<div  style="float: left;">
									<div class="form-group">
	
											<div class="col-sm-9">
												<div class="form-group">
													<div class="col-xs-12">
														<input multiple="" type="file" id="id-input-file-3" name="file"/>
	
														<!-- /section:custom/file-input -->
													</div>
												</div>
	
											</div>
										</div>
								</div>
								
								<button type="submit" class="btn" id="signin_btn">register</button>
							 </form> 
						</div>
					</div>
				</div>
			</div>
		</div>

	</div>
<!-- ace settings handler -->
		<script src="<%=request.getContextPath()%>/assets/js/ace-extra.js"></script>

	<!-- Javascript -->
	<script src="${pageContext.request.contextPath}/assets/js/jquery-1.11.1.min.js"></script>
	<script src="${pageContext.request.contextPath}/assets/bootstrap/js/bootstrap.min.js"></script>
	<script src="${pageContext.request.contextPath}/assets/js/jquery.backstretch.min.js"></script>
	<script src="${pageContext.request.contextPath}/assets/js/scripts.js"></script>

	<!--[if lt IE 10]>
            <script src="${pageContext.request.contextPath}/assets/js/placeholder.js"></script>
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

</body>

	<script type="text/javascript">
			jQuery(function($) {
				
				
				$("#signin_btn").click(function(){
					$("#join-form").submit();
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
					});
					
					
				
				});
			
			
			});
		</script>

</html>
