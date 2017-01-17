<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en" ng-app="homeApp">

<head>

				<!-- AngularJS scripts -->
				<script src="resources/js/common/angular.js"></script>
				<script src="resources/js/common/angular-ui-router.min.js"></script>
				<script src="resources/homeApp.js"></script>
			
				<script src="resources/services/ReviewService.js"></script>
				<script src="resources/controllers/mainController.js"></script>
				<script src="resources/controllers/mainAppController.js"></script>
				
  <link href="resources/css/common/umarCustom.css" rel="stylesheet">


		
</head>




<body ng-controller="mainController" >
<div class="container">

<header>
   <h1>ReviewBox</h1>
   <div align="right" >
   	<a href="index.jsp"><font color="white" >Log Out</font> </a>
  </div >
  
   	<div align="left">
   	<button style="height:50px; width:100px;"  ng-click="goTo()">Add Review</button>
	<button style="height:50px; width:100px" ng-click="go()">Read Review</button>
	</div>
</header>


						
					
							
							
							
				
							
							<div ui-view ></div>
							<footer>Copyright © ReviewBox.com</footer>
							</div>
</body>				

</html>