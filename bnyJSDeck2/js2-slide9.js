var s = "****************##*****#*******###******##*#***##*****####****#**##*****";
var counter = 0;
for(var i=0; i<s.length; i++){
    if(s[i] == "#"){
        while (i<s.length && s[i] =="#"){
            counter++;
            i++;
        }if (s[i]=="*"){
        continue;
        i++;
        }
 //       i-- <- in cases we need to continue looking
    }
}
console.log(counter);