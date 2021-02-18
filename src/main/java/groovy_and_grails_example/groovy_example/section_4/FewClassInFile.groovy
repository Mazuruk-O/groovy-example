package groovy_and_grails_example.groovy_example.section_4

class FirstPublicClass {
    def callSecond() {
        def second = new SecondPublicClass()
        second.print()
    }
}

class SecondPublicClass {
    def print() {
        'Second'
    }
}
