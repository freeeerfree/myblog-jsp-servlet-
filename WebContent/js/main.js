app=angular.module('app',["ngRoute"]);
app.config(['$routeProvider',function($routeProvider){
     $routeProvider
     .when('/',{controller:"sort"})
     .when('/qianduan',{})
     .when('/houdaun',{})
     .when('/database',{})
     .when('/suibi',{})
     .otherwise({redirectTo:'/'});
}]);
app.service('sort',function($scope,$http){
 
});
app.controller("sort",function($scope,$http){
       $http({
  		method:"post",
  		url:"SortServlet",
  		data:$.param({sort:"首页"}), 
  		headers: { 'Content-Type': 'application/x-www-form-urlencoded;charset:utf-8' }
  	}).then(function(request){
            $scope.navs=request.data;
  	});
});
