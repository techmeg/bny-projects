var str = "23"
var num = Number(str);
    console.log(" -------------- type of --------------");
console.log(typeof num);

var first = new Date("January 1, 2019 04:30:00");
var second = new Date("2019-01-01T04:30:00");

    console.log(" -------------- var first Date --------------");
console.log(first);

console.log(first === second); //false -- why? due to format?

console.log(second.getHours());

    console.log(" -------------- get Dates --------------");

var today  = new Date();
console.log( "Today is: " + today);

var yesterday = new Date();
    yesterday.setDate(today.getDate()-1);
    console.log("Yesterday " + yesterday);

var tomorrow = new Date();
    tomorrow.setDate(tomorrow.getDate()+1);
    console.log("Tomorrow " + tomorrow);

    //what is today's year
console.log(today.getFullYear());
//what is today's Month
console.log(today.getMonth()); // returns Month as number; Jan=0
//what is today's day
console.log(today.getDate());
//what is month with name
console.log(today.get???);



