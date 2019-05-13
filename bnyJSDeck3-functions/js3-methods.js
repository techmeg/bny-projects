var text = "Javascript";
    console.log("search position in string Javascript of \"script\"");
console.log(text.search(/script/i));

var text1 = "Javascipt"
    console.log("search position in string Javascipt of \"script\" not found, returns -1");
console.log(text1.search(/script/i));

    console.log("-----------------replace----------------");

text = "I love Javascript, I love Javascript, I love Javascript, I love Javascript";
var replres = text.replace(/love/gi, "LOVE");//replace all matches
console.log(replres);

var replres = text.replace(/love/i, "LOVE"); // without "g" replaces only the first match
console.log(replres);

var replres = text.replace(/Love/g, "LOVE");//without "i", nothing happens -- case does not matcch
console.log(replres);

    console.log("-----------------match not global---------------");
 text = "I love Javascript, I love Javascript, I love Javascript, I love Javascript";
var resultA=text.match(/love/);
console.log(resultA);   
debugger;
    console.log("-----------------match  global---------------");
 text = "I love Javascript, I love Javascript, I love Javascript, I love Javascript";
var resultA=text.match(/love/g);
console.log(resultA.length); 

console.log("-----------------match not global to 'script'---------------");

var resultB = text.match(/script(,)/);
console.log(resultB);

var string = "1, 2, 3, 4, 5"
var arr = string.split(/\s*,\s*/);
console.log(arr);


