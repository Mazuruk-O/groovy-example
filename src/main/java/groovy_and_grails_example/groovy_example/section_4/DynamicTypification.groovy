package groovy_and_grails_example.groovy_example.section_4

class Outputter {
    def forOutput

    Outputter(forOutput) {
        this.forOutput = forOutput
    }

    String output() {
        forOutput.say()
    }
}

println(new Outputter([say:{"Dynamic typification. Replacement interface."}]).output()) // check 'interfaceImpl/LockingExample.groovy'
