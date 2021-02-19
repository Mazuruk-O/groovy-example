package groovy_and_grails_example.groovy_example.section_7

import org.junit.Test

class Calculator {
    def calc(a,b) {
       a+b
    }
}

class GroovyWithJUnit {

    def calc = new Calculator()

    @Test
    void testCalc() {
        assert calc.calc(1,1) == 2
    }

    @Test
    void testCalc2() {
        assert calc.calc(1,2) == 3
    }
}
