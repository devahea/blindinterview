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
						</div><!-- /.ace-settings-container -->
						<!-- /section:settings.box -->
						<div class="page-content-area" style="margin-left: 30px;">
						
						
						
							<div class="main-content form-inline">


								<h2>${advertise.title}</h2>							
							
								<img src="/api/dummy/dummy1.jpg" class="img-rounded" style="width:500px">

								<ul>
									<li>x</li>
									<li>기간 : ${advertise.startDate} ~ ${advertise.endDate}(진행중)</li>
									<li>현재 지원자 : ${advertise.member }</li>
								</ul>							

								<div class="textarea-content">
								${advertise.content}
								</div>
							
								<a href="/offer/create?advertiseId=${advertise.id}"/><button type="submit" class="btn" id="offer_btn">지원하기</button>
							
							</div>
						
						
						</div><!-- /.page-content-area -->
					</div><!-- /.page-content -->
				</div>