//JS Deck 2, slide 5
//count number of continuously printed #'s

var s = "************" +
        "**##*****#**" +
        "*****###****" +
        "**##*#***##" +
        "*****####**" 
        "**#**##*****";
var counter = 0;
for(var i=0; i<s.length; i++){
    if(s[i] == "#"){
        while (i<s.length && s[i] =="#"){
            counter++;
            }
            i++;
        }
 //       i-- <- in cases we need to continue looking
            if (counter==4){
            break;
    } else if(s[i]<s.length){
        counter=0;
    }
}
console.log(counter);