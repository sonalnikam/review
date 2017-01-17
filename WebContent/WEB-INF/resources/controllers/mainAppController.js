app.controller('mainAppController',function($scope, ReviewService,$state) {

				
					$scope.review = [];
					$scope.catname = "";
					$scope.category = []
					
			/*		$scope.newReview = {
							
							catid:0,
							title: "" ,
							description : "" ,
							rating : ""
							
					};
				*/

				/*	$scope.review = {};
					$scope.getCategory = function(){
						console.log("cat list method");
						
						ReviewService.getCategory().then(
								function(data){
									$scope.category = data;
									console.log("All cate "+ $scope.category);
								}
							)
					};
*/
				
			
					// Add review
					$scope.addReview = function(gtitle, gdescription,grating,gcatid) {
						
						$scope.newReview = {
								title: gtitle ,
								description : gdescription ,
								rating : grating,
								catid: gcatid
								
						};
					
						ReviewService.addReview($scope.newReview).then(function(data) {
							
							console.log(title);
							console.log(data);
							$state.go('home',{},{reload:true});
						})
					};
					
					
					
					// Add category
					$scope.addCategory = function(gaddcatname) {
						
						$scope.newReview = {
								
								catname: gaddcatname
								
						};
					
						ReviewService.addCategory($scope.newReview).then(function(data) {
							
							console.log(catname);
							console.log(data);
							$state.go('home',{},{reload:true});
						})
					};
		
					//Get Category List
					$scope.categoryList = function(){
						console.log("cat list method");
						
						ReviewService.categoryList().then(
								function(data){
									$scope.category = data;
									console.log("All category "+ $scope.category);
								}
							)
					};
					
					// Read All  Reviews
					$scope.readReview = function(gcatid){
						
						$scope.newReview={
								catid: gcatid
						};
						
						ReviewService.readReview($scope.newReview.catid).then(function(data) {
							
							$scope.review = data;
							console.log(data);
						})
					};
				});