var Calculator = /** @class */ (function () {
    function Calculator() {
        this.num1 = 10;
        this.num2 = 20;
    }
    Calculator.prototype.mult = function () {
        console.log("mult is :: " + this.num1 * this.num2);
    };
    Calculator.prototype.division = function () {
        var div = this.num1 / this.num2;
        console.log("division " + div);
    };
    Calculator.prototype.addition = function () {
        console.log("addition of two no is " + (this.num1 + this.num2));
    };
    Calculator.prototype.subtraction = function () {
        var sub = this.num1 - this.num2;
        console.log("substractin of two no is " + sub);
    };
    return Calculator;
}());
var obj = new Calculator();
var obj1 = new Calculator();
obj1.mult();
obj.addition();
obj.addition();
obj.addition();
