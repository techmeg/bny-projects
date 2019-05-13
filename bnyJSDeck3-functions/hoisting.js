//function prints all properties and their values in a given object
//
 person = {
    firstName: "Luke",
    lastName: "Lance",
    age: 23
};

function myjoin(object){
    if (object){
        for (var property in object)
        console.log(property + ": " + object[property]);
    }else {
            console.log("there is no object to be called \n")
    }
}
console.log("trying to print: ==> person \n")
myjoin(person); 
var person; // this works, but if declared as var person = {}; it will fail
myjoin(person);
