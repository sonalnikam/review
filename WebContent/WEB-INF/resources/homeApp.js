'use strict';
var app=angular.module("homeApp",['ui.router']);

app.config(function($stateProvider,$urlRouterProvider,$locationProvider){
	$stateProvider.state('add_review',{
		url:'/addReview',
		templateUrl:'resources/partials/homePartials/add_reviews.html',
		//templateUrl:'partials/homePartials/add_reviews.html',
		controller:'mainAppController'
	}).state('read_review',{
		url:'/readReview',
		templateUrl:'resources/partials/homePartials/read_review.html',
		controller:'mainAppController'
	});
	$urlRouterProvider.otherwise('/home');
	//$locationProvider.html5Mode(true);
});