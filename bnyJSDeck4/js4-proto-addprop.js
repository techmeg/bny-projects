var simpleObj = function(c){
    this.city = c;
}
var live1 = new simpleObj("Brooklyn");
var live2 = new simpleObj ("Bronx");
live2.state = "New York";
console.log(live1);
console.log(live2);
console.log(live2.prototype === live1.prototype);
console.log(live1.state);