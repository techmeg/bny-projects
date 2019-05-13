var expression="23+2-5^6";
var numbers="";
var operands="";

    for(i=0; i<expression.length; i++){
        //test if index character is an operand
        if ((expression[i]=="+") || (expression[i]=="-") || 
        (expression[i]=="^")) { 
            //if it is, add to operands and add a separator to the previous number 
        operands=operands + expression[i] + "|"; 
        numbers += "|";
        }else {
            //or add to numbers
        numbers += expression[i];
        }

    }
    //add a separator to the last number
    if(numbers[numbers.length-1]!="|") {
    numbers += "|";
}
    console.log(expression);
    console.log("operands: " + operands)
    console.log("numbers: " + numbers)
console.log("-----------------------------------------------------------------");
  var  numberA="-2";
  var  numberB=3;
 // var result=numberB+Number(numberA); cast the string to a number OR parse to Integer
  var result=numberB+parseInt(numberA);

  console.log(numberA, numberB, result);

  console.log(expression.charCodeAt(0));
  console.log(parseInt(expression));