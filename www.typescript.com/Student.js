"use strict";
exports.__esModule = true;
exports.Student = void 0;
var Student = /** @class */ (function () {
    function Student(id, name) {
        this.studentId = id;
        this.studentName = name;
    }
    Student.prototype.showData = function () {
        console.log("hi i am data !!!");
    };
    return Student;
}());
exports.Student = Student;
