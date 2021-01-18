<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hawk Eye : Intelligent Security System</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/lib/bootstrap-4/css/bootstrap.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>
	<div class="container-fluid">
	<h2 class="text-center py-3">Monitoring Api Link</h2>
		<div class="row">
			<div class="col col-md-3">
				<div class="nav flex-column nav-pills" id="v-pills-tab"
					role="tablist" aria-orientation="vertical">
					<a class="nav-link " id="v-pills-home-tab" data-toggle="pill"
						href="${pageContext.request.contextPath}/" role="tab" aria-controls="v-pills-home"
						aria-selected="true">Organization</a> 
					<a class="nav-link "
						id="v-pills-profile-tab" data-toggle="pill"
						href="${pageContext.request.contextPath}/api/permitted" role="tab" aria-controls="v-pills-profile"
						aria-selected="false">Permitted</a> 
					<a class="nav-link"
						id="v-pills-messages-tab" data-toggle="pill"
						href="${pageContext.request.contextPath}/api/security" role="tab"
						aria-controls="v-pills-messages" aria-selected="false">Security</a>
					<a class="nav-link active" id="v-pills-settings-tab" data-toggle="pill"
						href="${pageContext.request.contextPath}/api/monitoring" role="tab"
						aria-controls="v-pills-settings" aria-selected="false">Monitoring</a>
					<a class="nav-link" id="v-pills-settings-tab" data-toggle="pill"
						href="${pageContext.request.contextPath}/api/stranger" role="tab"
						aria-controls="v-pills-settings" aria-selected="false">Stranger</a>
				</div>
			</div>
			<div class="col col-md-9">
				<div class="jumbotron myWidth">
					<div class="wraper">
						<div class="leftSide">
							<p class="lead">Get all Monitoring data</p>
							<p>
								<input type="text" name="demo" class="myInput"
									value="http://localhost:8080/api/monitoring/all">
							</p>
						</div>
						<div class="rightSide">
							<a href="http://localhost:8080/api/monitoring/all" target="_blank">
								<button style="margin-top: 46px; padding: 8px;">Open</button>
							</a>
						</div>
						<div style="clear: both;"></div>
					</div>
				</div>
				
				<div class="jumbotron myWidth">
					<div class="wraper">
						<div class="leftSide">
							<p class="lead">Get Today access</p>
							<p>
								<input type="text" name="demo" class="myInput"
									value="http://localhost:8080/api/monitoring/today">
							</p>
						</div>
						<div class="rightSide">
							<a href="http://localhost:8080/api/monitoring/today" target="_blank">
								<button style="margin-top: 46px; padding: 8px;">Open</button>
							</a>
						</div>
						<div style="clear: both;"></div>
					</div>
				</div>
				
				<div class="jumbotron myWidth">
					<div class="wraper">
						<div class="leftSide">
							<p class="lead">Get Today access of a employee by his/her if</p>
							<p>
								<input type="text" name="demo" class="myInput"
									value="http://localhost:8080/api/monitoring/person/access/today/{id}">
							</p>
						</div>
						<div class="rightSide">
							<a href="http://localhost:8080/api/monitoring/person/access/today/4001" target="_blank">
								<button style="margin-top: 46px; padding: 8px;">Open</button>
							</a>
						</div>
						<div style="clear: both;"></div>
					</div>
				</div>
				
				
				<div class="jumbotron myWidth">
					<div class="wraper">
						<div class="leftSide">
							<p class="lead">Get Yesterday access</p>
							<p>
								<input type="text" name="demo" class="myInput"
									value="http://localhost:8080/api/monitoring/yesterday">
							</p>
						</div>
						<div class="rightSide">
							<a href="http://localhost:8080/api/monitoring/yesterday" target="_blank">
								<button style="margin-top: 46px; padding: 8px;">Open</button>
							</a>
						</div>
						<div style="clear: both;"></div>
					</div>
				</div>
				
				<div class="jumbotron myWidth">
					<div class="wraper">
						<div class="leftSide">
							<p class="lead">Get Yesterday access of a employee by his/her id</p>
							<p>
								<input type="text" name="demo" class="myInput"
									value="http://localhost:8080/api/monitoring/person/access/yesterday/{id}">
							</p>
						</div>
						<div class="rightSide">
							<a href="http://localhost:8080/api/monitoring/person/access/yesterday/4001" target="_blank">
								<button style="margin-top: 46px; padding: 8px;">Open</button>
							</a>
						</div>
						<div style="clear: both;"></div>
					</div>
				</div>
				
				<div class="jumbotron myWidth">
					<div class="wraper">
						<div class="leftSide">
							<p class="lead">Get Authorized Access Person</p>
							<p>
								<input type="text" name="demo" class="myInput"
									value="http://localhost:8080/api/monitoring/access/authorized">
							</p>
						</div>
						<div class="rightSide">
							<a href="http://localhost:8080/api/monitoring/access/authorized" target="_blank">
								<button style="margin-top: 46px; padding: 8px;">Open</button>
							</a>
						</div>
						<div style="clear: both;"></div>
					</div>
				</div>
				
				
				<div class="jumbotron myWidth">
					<div class="wraper">
						<div class="leftSide">
							<p class="lead">Get Unauthorized Access Person</p>
							<p>
								<input type="text" name="demo" class="myInput"
									value="http://localhost:8080/api/monitoring/access/unauthorized">
							</p>
						</div>
						<div class="rightSide">
							<a href="http://localhost:8080/api/monitoring/access/unauthorized" target="_blank">
								<button style="margin-top: 46px; padding: 8px;">Open</button>
							</a>
						</div>
						<div style="clear: both;"></div>
					</div>
				</div>
				
				<div class="jumbotron myWidth">
					<div class="wraper">
						<div class="leftSide">
							<p class="lead">Get all Monitoring data by Person ID</p>
							<p>
								<input type="text" name="demo" class="myInput"
									value="http://localhost:8080/api/monitoring/person/{id}">
							</p>
						</div>
						<div class="rightSide">
							<a href="http://localhost:8080/api/monitoring/person/4001" target="_blank">
								<button style="margin-top: 46px; padding: 8px;">Open</button>
							</a>
						</div>
						<div style="clear: both;"></div>
					</div>
				</div>
				
				<div class="jumbotron myWidth">
					<div class="wraper">
						<div class="leftSide">
							<p class="lead">Get all Authorized access of a person by Person Id</p>
							<p>
								<input type="text" name="demo" class="myInput"
									value="http://localhost:8080/api/monitoring/person/access/auth/{id}">
							</p>
						</div>
						<div class="rightSide">
							<a href="http://localhost:8080/api/monitoring/person/access/auth/4001" target="_blank">
								<button style="margin-top: 46px; padding: 8px;">Open</button>
							</a>
						</div>
						<div style="clear: both;"></div>
					</div>
				</div>
				
				<div class="jumbotron myWidth">
					<div class="wraper">
						<div class="leftSide">
							<p class="lead">Get all Unauthorized access of a person by Person Id</p>
							<p>
								<input type="text" name="demo" class="myInput"
									value="http://localhost:8080/api/monitoring/person/access/unauth/{id}">
							</p>
						</div>
						<div class="rightSide">
							<a href="http://localhost:8080/api/monitoring/person/access/unauth/4001" target="_blank">
								<button style="margin-top: 46px; padding: 8px;">Open</button>
							</a>
						</div>
						<div style="clear: both;"></div>
					</div>
				</div>
				
				<div class="jumbotron myWidth">
					<div class="wraper">
						<div class="leftSide">
							<p class="lead">Get all Monitoring data</p>
							<p>
								<input type="text" name="demo" class="myInput"
									value="http://localhost:8080/api/monitoring">
							</p>
						</div>
						<div class="rightSide">
							<a href="http://localhost:8080/api/organizations" target="_blank">
								<button style="margin-top: 46px; padding: 8px;">Open</button>
							</a>
						</div>
						<div style="clear: both;"></div>
					</div>
				</div>
				
				
				
			</div>
		</div>
	</div>

	<script src="js/jquery.js"></script>
	<script src="js/bootstrap.js"></script>

</body>
</html>