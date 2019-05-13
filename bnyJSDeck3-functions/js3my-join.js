//function prints all properties and their values in a given object
//

function myjoin(object){
    if (object){
        for (var property in object)
        console.log(property + ": " + object[property]);
    }else {
            console.log("there is no object to be called \n")
    }
}
console.log("trying to print: ==> person \n")
myjoin(person); //this call will fail as it precedes the declaration of the object, person


var person = {
    firstName: "Luke",
    lastName: "Lance",
    age: 23
};
var book = {
    title: "Qultmaker's Gift",
    author: "John Doe",
    published: "1990",
    pages: "25",
    price: "10.95"
};
var sum_of_square = {
    first: 0,
    second: 0,
    //"this" is a keyword that substitutes for the name of hte object -- it's an alias
    //here "this" is an alias for "sum_of_square"
    square: function(){
        this.result = ((this.first*this.first) + (this.second*this.second));
        return this.result;
    }
}
console.log("printing sum_of_square ==> \n")
myjoin(sum_of_square);
console.log("printing book ==>\n")
myjoin(book);
//myjoin(person);