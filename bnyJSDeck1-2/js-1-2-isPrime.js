for (i=0; i<=100; i+=2 ){
    console.log(i);

}
/*var vNumber=0;
while (vNumber<100){
    console.log (vNumber);
    vNumber+=2;
}
for (i=1; i<=100; i +=2){
       console.log(i);

}
for (vnumber=1; vnumber<100; vnumber++) {
    var vprime=true;
    var vdivisor = 2;

    for (vdivisor=2; ((vdivisor<vnumber) && vprime); vdivisor++) {
        
        if (vnumber%vdivisor==0) {
            console.log(vdivisor);
            vprime==false;
        } 
    }
    if (vprime) {
        console.log( vnumber + "is a prime number");
    }
}*/
console.log("using while")
var vprime=true;
var vdivisor = 2;

for (vnumber = 1; vnumber<=100; vnumber++){
    while((vdivisor<vnumber)&&vprime){
        if(vnumber%vdivisor==0){
            vprime=false;
            vdivisor++;
        }
    }
        if (vprime) {
            console.log( vnumber + "is a prime number");
        }
    }
