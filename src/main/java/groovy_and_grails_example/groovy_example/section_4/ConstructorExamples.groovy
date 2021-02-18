package groovy_and_grails_example.groovy_example.section_4

class Employee {
    String firstname, lastname

    Employee(String firstname, String lastname) {
        this.firstname = firstname
        this.lastname = lastname
    }
}

def employee1 = new Employee('name','name')
def employee2 = ['name','name'] as Employee
Employee employee3 = ['name','name']
Employee employee4
employee4 = ['name','name']

class EmployeeNoConstruct {
    String firstname, lastname
}

new EmployeeNoConstruct()
new EmployeeNoConstruct(firstname: "name")
new EmployeeNoConstruct(lastname: "name")
new EmployeeNoConstruct(firstname: "name", lastname: "name")
