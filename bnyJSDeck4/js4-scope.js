/*var scope = "global";
function checkscope(){
    var scope = "local";
    return scope;
}
var result = checkscope();
console.log(result);

var scope = "global scope";
function checkscope(){
    var scope = "local scope";
    function nested() {
        var scope = "nested scope";
        return scope;
    }
    return nested();
}

var result = checkscope();
console.log(result);

var scope = "global"; //slide 16
function checkscope(){
    var scope = "local";
    function f(){return scope;}
    return f();
}
var result = checkscope();
console.log(result);

var scope = "global";
function checkscope(){
    var scope = "local";
    function f(){return scope;}
    return f;
}
var result = checkscope()();
console.log(result);*/

var uniqueInteger = function() { //slide 19; making uniqueInteger a function; () are at the end
    var counter = 0;
    return function() {return counter++;};
}();//<== here!
console.log(uniqueInteger());
console.log(uniqueInteger());
console.log(uniqueInteger());


