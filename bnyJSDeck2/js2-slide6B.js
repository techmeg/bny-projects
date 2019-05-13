inputstring="*****##*****\n****#******\n**********\n***#####*****\n**********";


console.log(inputstring);

//counter --> use to count #'s
//i is increment from beginning to end of string;

var counter1=0;
var counter2=0;
for (i=0; i<inputstring.length; i++){
    if (inputstring[i] == "#") {                       //look for #'s
        counter1++;  //count #;s
        if (inputstring[i+1] == "*"){                  //look for *'s after #'s
                 if (counter<4){                       // if there are fewer than 4 #'s
                    console.log("number is 0");        //print 0
                }else 
                console.log("number is " + counter);   //print number of #'s
                break;                                   //and stop
            }counter=0;                                  //look for next group
        }
    }
//this is not working...ack!!

