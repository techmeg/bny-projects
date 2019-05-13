inputstring="**********\n**********\n**********\n***#####*****\n**********";
console.log(inputstring);

//counter --> use to count #'s
//i is increment from beginning to end of string;

var counter=0;
for (i=0; i<inputstring.length; i++){
    if (inputstring[i] == "#") {
        counter++;
        if (inputstring[i+1] == "*"){
        break;
    }
}
}
console.log("number of #'s = " + counter);