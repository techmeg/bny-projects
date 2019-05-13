/**
 * This is my first js script comment
 */

 // Operators
console.log(4+40);
console.log(4*5);
console.log (50/25);
//++ Operator

var myNumber=9

console.log(myNumber++);//9
console.log(myNumber);//10
console.log(++myNumber);//11
console.log(--myNumber);//10
//-- operator
console.log(myNumber -=2);//8
console.log(myNumber/=2);//4
console.log(myNumber*=2);//8
console.log(myNumber%=2);//0
var newNumber=5, currentNumber=0;
console.log(newNumber, currentNumber);
console.log("This is " + ((currentNumber =+5)>10));//false, 5>10 is false

//boolean operators
var myEmpty=null;
var myString="word";
var myFlag="true";
console.log("This is myString: " + myString);
console.log("This is myEmpty: " + myEmpty);
console.log("This is myFlag " + myFlag);
console.log("this is ?? : " + ("true"==myFlag));
var myFlag="true"
console.log("this is ??: " + (true===myFlag));

//if/else control statements slide 26
if (myNumber=="A") {
    console.log(myNumber + " is a number");
}
else {
    console.log (myNumber + " is not a number")

}

//situation to test if/else and switch
/** ATM sample
 * 1 deposit ==> welcome to deposits
 * 2 balance ==> account balance is $1.00
 * 3 services ==> welcome to the ARM services
 * 4 exit ==> bye bye
 * Entr option (1-4) : [  ]
 * 
 * */


 //if / else slide 28
var myOption = "A";

if (myOption===1) {
    console.log ("Welcome to deposits");
}
else if (myOption===2) {
    console.log ("account balance is $1.00");
}
else if (myOption===3) {
    console.log ("welcome to the ARM services")
}
else if (myOption ===4) {
    console.log ("bye-bye");
}
else {
    console.log ("Error Message: Invalid option. Valid options are 1-4");
}
//switch case slide 30
option=5
console.log("option = " + option);
switch (option) {
    case 1:     console.log ("Welcome to deposits");
    break;

    case 2:    console.log ("account balance is $1.00");
    break;

    case 3:    console.log ("welcome to the ARM services")
    break;

    case 4:    console.log ("bye-bye");
    break;

    default:    console.log ("Error Message: Invalid option. Valid options are 1-4");
    break;
}

//calculate # of years to acheive investment rate -- slide 33
investment=10000;
year=0;
intRate=.05;

while (investment<20000) { //stop when investment is over $20,000
    investment*=(1+intRate); //earn 5% interest
    year=++year; //increment year
}
console.log("years to acheive target = " + year);

for (var i=0; i<=10; ++i) {
    console.log(i);
}

