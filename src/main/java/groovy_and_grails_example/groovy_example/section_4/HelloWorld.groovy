package groovy_and_grails_example.groovy_example.section_4

class HelloThere {
    def sayHello() {
        'Hello'
    }
}

def hello = new HelloThere()
println hello.sayHello()
