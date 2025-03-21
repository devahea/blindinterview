<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="main-content-inner">
	<!-- #section:basics/content.breadcrumbs -->
	<div class="breadcrumbs" id="breadcrumbs">
		<script type="text/javascript">
			try {
				ace.settings.check('breadcrumbs', 'fixed')
			} catch (e) {
			}
		</script>

		<ul class="breadcrumb">
			<li><i class="ace-icon fa fa-home home-icon"></i> <a href="#">Home</a>
			</li>
		</ul>
		<!-- /.breadcrumb -->

		<!-- #section:basics/content.searchbox -->
		<div class="nav-search" id="nav-search">
			<form class="form-search">
				<span class="input-icon"> <input type="text"
					placeholder="Search ..." class="nav-search-input"
					id="nav-search-input" autocomplete="off" /> <i
					class="ace-icon fa fa-search nav-search-icon"></i>
				</span>
			</form>
		</div>
		<!-- /.nav-search -->

		<!-- /section:basics/content.searchbox -->
	</div>

	<!-- /section:basics/content.breadcrumbs -->
	<div class="page-content"></div>
	<!-- /.ace-settings-container -->
	<!-- /section:settings.box -->
	<div class="page-content-area" style="margin-left: 30px;">
<div class="main-content form-inline">

								<div class="content-list">
								
								
									<c:forEach items="${corpteams }" var="item">
									
											<div class="content-list-item">
											
												<div class="content-list-item-article" style="margin-left: 20px;  float: left;">
												
													<h2><a  href="${pageContext.request.contextPath}/corp/view?corpteamId=${item.id}"><c:out value="${item.id }"/></a></h2>
													<h2><c:out value="${item.teamName }"/></h2>
													<h2><c:out value="${item.teamSerialNo }"/></h2>
													
													<div class="content-list-item-article-content">
														<c:out value="${item.teamDesc }"/>
														
													</div>
												</div>
												
											</div>
										</a>
										<hr style="clear: both;">
									</c:forEach>
								</div>								
							
							</div>
	</div>
	<!-- /.page-content-area -->
</div>
<!-- /.page-content -->
