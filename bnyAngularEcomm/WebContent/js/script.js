var booksArr = [{title: "Crash", author: "Tim Hallinan", image: "../images/crashed.jpg", price: 10.95}, 
{title: "Little Elvises", author: "Tim Hallinan", image: "../images/little-elvis.jpg", price: 11.95}, 
{title: "Fields Where They Lay", author: "Tim Hallinon", image: "./images/fields.jpg", price: 9.99}, 
{title: "Herbie's Game", author: "Tim Hallinan", image: "./images/herbies-game", price: 9.99}];

var app = angular.module ("bookQty.App", []);
app.controller ("qtyCtrl", function($scope) {
    $scope.count = 0;
    $scope.subtractQty() = function() {
        if (count == 0) {
            continue;
        }else count=count-1;
    }
});