function add(a,b){
    var c=a+b;
    return c;
}
var result=add(3,5);
    console.log("-------result of add function-------------");
console.log(result);


function customMessage(custom, times){
    for (var i=0; i<times; i++){
        console.log(custom, i);
    }
}
    console.log("-------print custom message-------------");

customMessage("useful message >.>", 5);
    console.log("--------------------");

var list = [34,4,56,67,12,43];

//callback funcations
list.forEach(function(item, index, arr) {
    console.log(item, arr[index]);
});
    console.log("--------------------");

list.forEach(function(item){console.log(item);});
    console.log("--------------------");

//function assigned to a variable
var sum_of_square = function(a,b){
    return (a*a) + (b*b);
}
var result = sum_of_square(2,3);
console.log("Sum of square(variable as function): " + result);
    console.log("--------------------");

//callback assigned to an object
var sum_of_square = {
    first: 0,
    second: 0,
    //"this" is a keyword that substitutes for the name of hte object -- it's an alias
    //here "this" is an alias for "sum_of_square"
    square: function(){
        this.result = ((this.first*this.first) + (this.second*this.second));
        return this.result;
    }
}
sum_of_square.first=2; //inserting value
sum_of_square.second=3; // inserting value
var FR = sum_of_square.square();
console.log("Sum of square(in method of object): " + FR);
    console.log("--------------------");
console.log(sum_of_square); //see slide 20
    console.log("--------------------");
//printing objects; both examples below will print the value in object's property "first"

console.log(sum_of_square.first);
    console.log("--------------------");
console.log(sum_of_square["first"]);
