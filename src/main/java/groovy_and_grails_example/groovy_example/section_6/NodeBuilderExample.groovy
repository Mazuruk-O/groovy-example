package groovy_and_grails_example.groovy_example.section_6

// NodeBuilder using when entities are defined dynamically
def builder = new NodeBuilder()

def company = builder.company {
    dept(name:'IT') {
        employee(name:'Alan')
        employee(name:'Bob')
    }
    dept(name:'Sales') {
        employee(name:'Rene')
        employee(name:'Tanos')
    }
}

// bypass the tree object based on GPaths
company.dept.each {
    println it.'@name'
}

// ObjectGraphBuilder using when entities are defined static
class Company {
    List dept = []
}

class Dept {
    def name
    List employees = []
}

class Employee {
    def name
}

def objectGraphBuilder = new ObjectGraphBuilder(classLoader: getClass().classLoader)
def company2 = builder.company {
    dept(name:'IT') {
        employee(name:'Alan')
        employee(name:'Bob')
    }
    dept(name:'Sales') {
        employee(name:'Rene')
        employee(name:'Tanos')
    }
}

// bypass the tree object based on GPaths
company2.dept.each {
    println it.'@name'
}