app.controller('mainController',function($scope,$state) {
					$scope.goTo = function() {
						 $state.transitionTo("add_review");
					}
					
					$scope.go = function(){
						$state.transitionTo("read_review");
					}
				});/**
 * 
 */