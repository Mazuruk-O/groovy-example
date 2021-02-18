package groovy_and_grails_example.groovy_example.section_5

// parentheses are optional in Groovy
[1,2,3].each({print it + ' '})
[1,2,3].each {print it + ' '} // equivalent to the method above

// automatic closing and try/catch of files
// closure example in file
println()
File file = new File('test.txt')
file.eachLine {println it}

// example calling closure
def print = {String arg -> println arg}
def print2 = {println it} // equivalent to the method above

print('JVM 1.0')
print2('JVM 1.0')

print.call('JVM 2.0')
print2.call('JVM 2.0')

print.doCall('JVM 3.0')
print2.doCall('JVM 3.0')

// return value from closure
def sumList = {list -> list.sum()}
assert sumList([1,2,3]) == 6

sumList = {list -> return  list.sum()} // equivalent to the method above
assert sumList([1,2,3]) == 6

// use methods like closure
class MethodAsClosure {
    def toLowerCase(String text) {
        text.toLowerCase()
    }
}

def methodAsClosure = new MethodAsClosure()
def toLowerCase = methodAsClosure.&toLowerCase // method reference
assert toLowerCase("ABC") == "abc"
assert toLowerCase("ABC") == methodAsClosure.toLowerCase("ABC")

// closure scope
class ClosureScope {
    private classVar = 'private var'

    private privateMethod() {
        'private method'
    }

    def publicMethod(String args) {
        def localeVar = 'locale var'
        return {"$classVar,${privateMethod()},$args,$localeVar"} // return closure
    }
}

def closureScope = new ClosureScope()
def closure = closureScope.publicMethod("args") // return closure
assert closure() == "private var,private method,args,locale var" // using returned closure

println()
[1,2,3,4,5].each {
    if(it == 2) return // in closure it is similar 'continue'
    print it + ' '
}

// caring closure
def closureExample = {x,y,z -> return x - y * z}
def fixationFirstParam = closureExample.curry(2) // 2 - y*z
assert fixationFirstParam(1,2) == 0

def fixationFirstAndSecondParam = closureExample.curry(2,2) // 2 - 2 * z
assert fixationFirstAndSecondParam(1) == 0

// closure in switch
def odd = {
    switch (it) {
        case {it % 2 == 1} : return true; break
        default: return false
    }
}

assert odd(3)
assert !odd(4)

// info about closure
def clsr = {int a, b -> a + b}
c = clsr
assert c.getMaximumNumberOfParameters() == 2
def params = clsr.getParameterTypes()
assert params[0] in int
assert params[1] as Object