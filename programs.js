var word="Hi Cloud Vandana";
function result(word){
    return word.split(" ").map(s=>{return s.split("").reverse().join("")}).join(" ");
}

console.log(result(word));
// output="iH duolC anadnaV"

let array=[1,4,3,6,5];
let array1=array.sort();
console.log(array1);