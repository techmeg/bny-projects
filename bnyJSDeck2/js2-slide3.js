var isPrime = true;
var num = prompt("Enter a Prime number: ")
for(var i=2; i<num; i++){
    if(num%1===0){
        isPrime=false;
        break;
    }
}
if(isPrime) {
    console.log(num, " is a prime number");
}else{
    console.log(num, " is not a prime number");
}
