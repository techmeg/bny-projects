//create a model/prototype for a book

var Book = function(title, authorFullName, yearPublication){
    this.title = title;
    this.authorFullName = authorFullName;
    this.yearPublication = yearPublication;
    this.type = "",
    this.description = "";
    this.edition = 0;
    this.printBookObj = function(){
        console.log(this);
    }
    this.printBookKim = function(){
        for(var prop in this){
            console.log(prop, " = ", this[prop]);
    }
    }   
    this.printLabel = function(num) {
        var i=0;
        while (i<=num){
        console.log(" --------------------------------------------------\n", 
                    "**", "       Title: ", this.title,"\n",
                    "**", "      Author: ", this.authorFullName, "\n",
                    "**", "        Year: ", this.yearPublication, "\n" ,
                    "**", " Description: ", this.description, "\n",
        "--------------------------------------------------")
        i++;
    }}
}
var odyssey = new Book("The Odyssey", "Homer" ,  1985, "classic", "An epic Greek poem about the Trojan War", 25);
var bible = new Book ("The Bible", "various", 1980, "religious", "Scipture of the Christian Church", 23);

//odyssey.printBookObj();
//odyssey.printBookKim();
console.log("--------------------------------------\n");
//for(label=1; label<=10; label++){
 //   console.log(label);
    odyssey.printLabel(10);
//}