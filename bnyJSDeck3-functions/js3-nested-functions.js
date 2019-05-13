function sum_of_square(a, b){
    function square(x){return x*x}
    return(square(a) + square(b));
}
var result = sum_of_square(2,3);
console.log("result of s-o-s: " + result);

square(3); // this function call fails becuase variable is out of scope