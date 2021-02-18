package groovy_and_grails_example.groovy_example.section_4

// example extend final class
// extension methods must have 'static'
class StringExtender {
    static String getFirstHalf(String str) {
        return str.substring(0, (int)(str.size()/2))
    }
}

use(StringExtender) {
    String s = new String("123456")
    assert s.getFirstHalf() == "123"
}