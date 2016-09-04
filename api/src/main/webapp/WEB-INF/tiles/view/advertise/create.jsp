<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
								<form class="form-horizontal" role="form" action="create" method="post">
									<!-- #section:elements.form -->
									<div class="form-group">
										<label class="col-sm-3 control-label no-padding-right" for="form-field-1"> Title </label>

										<div class="col-sm-9">
											<input type="text" id="form-field-1" name="title" placeholder="제목을 입력해주세요" class="col-xs-10 col-sm-5" />
										</div>
									</div>

									<div class="form-group">
										<label class="col-sm-3 control-label no-padding-right" for="form-field-1-1">Content</label>

										<div class="col-sm-9">
											<textarea rows="5" cols="20" name="content" placeholder="내용을 입력해주세요"  class="form-control"></textarea> 
										</div>
									</div>

									<!-- /section:elements.form -->
									<div class="space-4"></div>

									<div class="form-group">
										<label class="col-sm-3 control-label no-padding-right" for="form-field-2"> Password Field </label>

										<div class="col-sm-9">
											<div class="form-group">
												<div class="col-xs-12">
													<input multiple="" type="file" id="id-input-file-3" />

													<!-- /section:custom/file-input -->
												</div>
											</div>

										</div>
									</div>
									<div class="space-4"></div>
									
									<div class="form-group">
										<label class="col-sm-3 control-label no-padding-right" for="member">모집인원</label>

										<div class="col-sm-9">
											<div class="form-group">
												<div class="col-xs-12">
													<input type="number" name="member" id="member"  />

													<!-- /section:custom/file-input -->
												</div>
											</div>

										</div>
									</div>
									<div class="space-4"></div>
									
									<div class="form-group">
										<label class="col-sm-3 control-label no-padding-right" for="member">모집기간</label>

										<div class="col-sm-4">
											<div class="form-group">
												<div class="col-xs-12">
													<input type="datetime-local" name="startDate" />
												</div>
											</div>

										</div>
										<div class="col-sm-1">
										~
										</div>
										<div class="col-sm-4">
											<div class="form-group">
												<div class="col-xs-12">
													<input type="datetime-local" name="endDate" />
												</div>
											</div>

										</div>
									</div>
									<div class="space-4"></div>
									


									<div class="clearfix form-actions">
										<div class="col-md-offset-3 col-md-9">
											<button class="btn btn-info" type="submit">
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