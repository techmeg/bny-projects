    var myApp = angular.module('myApp', []);
      myApp.controller('studentController', function($scope, $http) {

        //Buttons Settings
        $scope.submit=true;
        $scope.update=false;
        $scope.cancel=false;
 

    //Getting User List
       
    $http.get('https://jsonplaceholder.typicode.com/users')
    .then(function successCallback(response) {
        $scope.users = response.data;
    }, function errorCallback(response)  {  
        alert("Error. Try Again!");
    });

    //Create New User
    $scope.createUser = function() {
    //$http POST function
    $http.post('https://jsonplaceholder.typicode.com/users', $scope.user)
    .then(function successCallback(response) {
    $scope.users.push(response.data);
    $('#successModal').modal('show');
      //alert("User has been created Successfully. See User List.")
    }, function errorCallback(response) {
    $('#errorModal').modal('show');
  //  alert("Error. while created user Try Again!");
    });
    };
    //Update User
    $scope.updateUser = function(){
        //$http PUT function
        $http.put('https://jsonplaceholder.typicode.com/users/' +$scope.user.id)
            .then(function successCallback(response){
        $('#successModal').modal('show');
          //  alert("User has been updated successfully")
        }, function errorCallback(response){
            alert("Error while updating user, try again");
        });
    };
    
    


    //Delete User
    $scope.deleteUser = function(user) {
        //$http DELETE function
        $http.delete('https://jsonplaceholder.typicode.com/users/' +$scope.user.id)
        .then(function successCallback(response) {
        $('#successModal').modal('show');
        //    alert("User has been deleted successfully");
            var index = $scope.users.indexOf(user);
            $scope.users.splice(index,1); 
        } , function errorCallback(response) {
            alert("Error while deleting user, try again");
        });
    };

    //Set $scope on Edit button click
    $scope.editUser = function(user) {
        $scope.user = user;
        $scope.submit=false;
        $scope.update=true;
        $scope.cancel=true;       
    };

    //cancel Update
       $scope.cancelUpdate = function() {
        $scope.user = null;
        $scope.submit=true;
        $scope.update=false;
        $scope.cancel=false;       
    };
    });


