var Employee = /** @class */ (function () {
    function Employee() {
    }
    Employee.prototype.setEmployeeData = function (name, empId, email) {
        this.name = name;
        this.empId = empId;
        this.email = email;
    };
    Employee.prototype.showEmployeeData = function () {
        console.log("name : " + this.name + " empId " + this.empId + "email : " + this.email);
    };
    return Employee;
}());
var emp1 = new Employee();
emp1.setEmployeeData("Aditi", 123, "aditi@gmail.com");
emp1.showEmployeeData();
var emp2 = new Employee();
emp2.setEmployeeData("rahul", 7891, "rahul@gmail.com");
emp2.showEmployeeData();
