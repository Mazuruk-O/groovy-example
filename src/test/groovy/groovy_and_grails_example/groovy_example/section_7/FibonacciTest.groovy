package groovy_and_grails_example.groovy_example.section_7

class FibonacciTest extends GroovyTestCase {

    void testFibonacci() {
        assert 2*2 == 4
    }

    void testException() {
        shouldFail(IndexOutOfBoundsException) {
            def list = new LinkedList()
            list.get(2)
        }
    }
}
