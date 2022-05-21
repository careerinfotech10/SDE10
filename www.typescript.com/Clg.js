"use strict";
exports.__esModule = true;
var Teacher_1 = require("./Teacher");
var Clg = /** @class */ (function () {
    function Clg() {
    }
    Clg.prototype.showClg = function () {
        var t1 = new Teacher_1.Teacher();
        t1.welcome();
    };
    return Clg;
}());
var cl1 = new Clg();
cl1.showClg();
