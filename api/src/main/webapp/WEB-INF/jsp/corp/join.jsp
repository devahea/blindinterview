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
								기업회원 가입
							</p>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-6 col-sm-offset-3 form-box">
						<div class="form-bottom">
							 <form role="form" action="${pageContext.request.contextPath}/corp/join.do" method="post" class="login-form"> 
								<div class="form-group">
									 <input
										type="text" name="form-username" placeholder="email을 입력하세요"
										class="form-username form-control" id="form-username">
								</div>
								<div class="form-group">
									 <input
										type="password" name="form-password" placeholder="Password를 입력하세요"
										class="form-password form-control" id="form-password">
								</div>
								<div class="form-group">
									 <input
										type="password" name="form-password" placeholder="Name을 입력하세요"
										class="form-password form-control" id="form-password">
								</div>
								<div class="form-group">
									 <input
										type="password" name="form-password" placeholder="기업코드를 입력해주세요"
										class="form-password form-control" id="form-password">
								</div>
								<button type="submit" class="btn" id="signin_btn">register</button>
							 </form> 
						</div>
					</div>
				</div>
			</div>
		</div>

	</div>


	<!-- Javascript -->
	<script src="${pageContext.request.contextPath}/assets/js/jquery-1.11.1.min.js"></script>
	<script src="${pageContext.request.contextPath}/assets/bootstrap/js/bootstrap.min.js"></script>
	<script src="${pageContext.request.contextPath}/assets/js/jquery.backstretch.min.js"></script>
	<script src="${pageContext.request.contextPath}/assets/js/scripts.js"></script>

	<!--[if lt IE 10]>
            <script src="${pageContext.request.contextPath}/assets/js/placeholder.js"></script>
        <![endif]-->


</body>
</html>
