var Person = function(fName, lName){
    this.firstName = fName;
    this.lastName = lName;
    this.info = function(){
        console.log("Inside Info")
        console.log(this.firstName,
            this.lastName,
            this.classesTeaching,
            this.employer)
    };
}
var Instructor = function(fName, lName, cT = []){
    this.classesTeaching = cT,
    this.employer = "Platform",
    Person.call(this, fName, lName)
}
var shah = new Instructor("A H M", "Shaparan", ["Full-Stack", "DE"]);
console.log(shah);
shah.info();
shah.firstName = "George";
shah.info();