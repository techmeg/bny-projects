var s = "****************##*****#*******###******##*#***##*****####****#**##*****";
/* find 4 together, stop/break you have found 4, if 4 not found, print 0 */

var counter = 0;

for(var i=0; i<s.length; i++){
    if(s[i] == "#"){
        while (i<s.length){
        if (s[i] =="#"){
            counter++;
            i++;
            if ((s[i+1] == "*") && (counter<4)){
                console.log("number is 0");
            }else 
                console.log("number is " + counter);
                break;
        }counter=0;
        i++;
        }
    }
}
//fix this pleaes!!