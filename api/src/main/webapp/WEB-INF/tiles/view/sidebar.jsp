<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
			<div id="sidebar" class="sidebar responsive ace-save-state" data-sidebar="true" data-sidebar-scroll="true" data-sidebar-hover="true">
				<script type="text/javascript">
					try{ace.settings.loadState('sidebar')}catch(e){}
				</script>


				<ul class="nav nav-list" style="top: 0px;">
				
				<!-- 단일 메뉴를 만들고 싶은 경우 -->
					<li class="">
						<a href="/api/home.do">
							<i class="menu-icon fa fa-tachometer"></i>
							<span class="menu-text">HOME </span>
						</a>

						<b class="arrow"></b>
					</li>
					<li class="">
						<a href="/user/index.do">
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