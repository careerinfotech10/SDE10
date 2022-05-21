"use strict";
exports.__esModule = true;
var Student_1 = require("./Student");
var School = /** @class */ (function () {
    function School() {
    }
    School.prototype.showStudent = function () {
        var stud = new Student_1.Student(1, "santosh");
        stud.showData();
    };
    return School;
}());
var sc = new School();
sc.showStudent();
