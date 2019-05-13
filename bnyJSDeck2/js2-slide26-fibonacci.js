let array = [0,1];
var newFib;

for (i=1; i<60; i++) {
    array[i+1] = array[i]+array[i-1];
    console.log("Fibonacci number " + i + ": " + array[i-1]);
}
