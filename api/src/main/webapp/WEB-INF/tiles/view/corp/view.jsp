<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
						<div class="page-content-area" style="margin-left: 30px;">
						
						
						
						<div>
								<!-- <button type="button" class="btn btn-success">edit</button> -->
								<button type="button" class="btn btn-link" id="deleteButton">delete</button>
								<form action="/api/resume/delete" method="post" id="deleteForm">
									<input type="hidden" name="resumeId" value="<c:out value="${resume.id }"/>"/>
								</form>
							</div>
						
							<div class="main-content form-inline">
										<h2><c:out value="${corpteam}"/></h2>
							</div>
						
						
						</div><!-- /.page-content-area -->
					</div><!-- /.page-content -->
