var a = [1,1,1,1,1,,,1,1,1];
    var sum = 0;

for (let i=0; i<a.length; i++){
    if(a[i] === undefined) {
        continue;
    }
    sum += a[i];
        
}
    console.log("The sum of all elements in the array is: " + sum);
