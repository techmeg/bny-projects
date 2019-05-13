function counter(n) {
    return {
        get count() {return n++},
        set count(m) {
            if (m >=n) n=m;
            else throw Error;
        }
    };
}
try {
var c = counter(1000);
console.log(c.count);
console.log(c.count);
c.count = 2000;
console.log(c.count);
c.count = 2000; //this throws an error as the above line moved the counter to 2001
c.count=2001;
console.log(c.count);
} catch (Error){
console.log(Error);
}