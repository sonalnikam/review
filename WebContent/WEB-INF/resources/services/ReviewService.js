app.factory('ReviewService',
				function($http,$state) {
					return {
					
						getCategory : function() {
							return $http({
								url : 'http://rv-sonal.44fs.preview.openshiftapps.com/getCategory',
								method : 'POST',
								header : {
									accept : 'application/json'
								}
							});
						},
					
						addReview : function( reviewFormObject) {
							return $http({
								url : 'http://rv-sonal.44fs.preview.openshiftapps.com/addReview',
							//	url : 'http://localhost:8080/ReviewBox/addReview',
								method : 'POST',
								header : {
									accept : 'application/json'
								},
								data: reviewFormObject								
								
							});
						},
						
						
						
						addCategory : function(addCatObj) {
							return $http({
								url : 'http://rv-sonal.44fs.preview.openshiftapps.com/addCategory',
								method : 'POST',
								header : {
									accept : 'application/json'
								},
								data: addCatObj								
								
							});
						},
						
						readReview : function(catid) {
							return $http({
								url : 'http://rv-sonal.44fs.preview.openshiftapps.com/readReview'
							//	url:'http://localhost:8080/ReviewBox/home.jsp#/readReview'
								,
								method : 'POST',
								header : {
									accept : 'application/json'
								},
								data: catid								
							});
						},
						categoryList : function() {
							return $http({
								url : 'http://rv-sonal.44fs.preview.openshiftapps.com/listcat',
								method : 'POST',
								header : {
									accept : 'application/json'
								}
							});
						}

					}
				});



/*http://localhost:9090/ReviewBox1.1*/
