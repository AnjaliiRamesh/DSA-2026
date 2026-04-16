/*
age = 100;
console.log("value of age ",age);
let age = 30;
console.log("value of age is ",age)
*/
// for (let i=0; i<10; i++){
//     setTimeout(() => console.log(i),0)
// }
/* let creates a new variable i for every iteration
   Each iteration gets its own separate i

*/
// for (var i=0; i<10; i++){
//     setTimeout(() => console.log(i),0)
// }
/*
var i is attached to the function/global scope, not the loop.
All callbacks reference the same i
 */

console.log(a);

function a() {
    console.log("Hello");
}

var a = 10;

console.log(a);
