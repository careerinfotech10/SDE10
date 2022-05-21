//1 Returnd functin
//caller function
function calculator() {
    var res;
    res = mult(3, 7);
    console.log("mult i s " + res);
}
function mult(num, num2) {
    return num * num2;
}
calculator();
