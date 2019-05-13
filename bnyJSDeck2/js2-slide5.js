var s = "************" +
        "************" +
        "***#####****" +
        "************" + 
        "************";
var counter = 0;
for(var i=0; i<s.length; i++){
    if(s[i] == "#"){
        while (i<s.length && s[i] =="#"){
            counter++;
            i++;
        }
 //       i-- <- in cases we need to continue looking
        break;
    }
}
console.log(counter);