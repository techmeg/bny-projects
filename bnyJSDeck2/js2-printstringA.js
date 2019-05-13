inputstring="*****##*****\n****#******\n**********\n***#####*****\n**********";


console.log(inputstring);

//counter --> use to count #'s
//i is increment from beginning to end of string;

var counter1=0;
var counter2=0;
for (i=0; i<inputstring.length; i++){
    if (inputstring[i] == "#") {
        counter1++;

        if (inputstring[i+1] == "*"){
            counter2++;
                console.log("number of #'s = " + counter1);
                console.log("sequences number " + counter2);
                counter=0;
            }
        }
    }


