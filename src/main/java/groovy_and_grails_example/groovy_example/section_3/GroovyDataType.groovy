package groovy_and_grails_example.groovy_example.section_3

// String
def javaStr = 'this is sample java string' // java.lang.String
def numberForExample = 0
def groovyStr = "this is sample groovy string with features $numberForExample" // groovy.lang.GString
assert groovyStr == "this is sample groovy string with features 0"
def multiString = """this
is
multistring"""

assert multiString == "this\nis\nmultistring"

// to String
assert String.valueOf(true) == true.toString()
assert String.valueOf(1) == 1.toString()
assert String.valueOf('a') == 'a'.toString()
assert String.valueOf([1,2]) == [1,2].toString()

// length String
s = "Hello World"
assert s.size() == 11
assert s.size() == s.length()

// filling String
assert 'Hello'.padRight(7,'#') == 'Hello##'
assert 'Hello'.padLeft(7,'#') == '##Hello'
assert 'Hello'.center(9,'#') == '##Hello##'

// breaking String
s = "Java the best"
assert s.tokenize() == ["Java", "the", "best"]
s1 = "Java,*the*best"
assert s1.tokenize(",*") == s.tokenize()

// search String
alphabets = new String('a'..'z' as char[])
assert alphabets.find{it > 'f'} == 'g' // search for the first occurrence
assert alphabets.findAll{it > 'f'} == 'g'..'z' // search for all occurrences
assert alphabets.findIndexOf{it > 'f'} == alphabets.indexOf('g') // search first index element
assert alphabets.every {it > 'A'} // check that all elements are larger than the symbol 'A'
assert alphabets.any{it < 'o'}
assert alphabets.startsWith('abc')
assert alphabets.endsWith('xyz')
assert alphabets.contains('def')
assert alphabets.indexOf('c') == 2
assert alphabets.indexOf('d') == alphabets.lastIndexOf('d')
assert alphabets.count('a') == 1

// replacement in String
s = "Hello"
assert s.replace('H','Y') == 'Yello'
assert s.replace('l','p') == 'Heppo'

// reverse String
s = 'avaj'
assert s.reverse() == 'java'

// operator overload
assert 'hello' + ' world' - 'l' == 'helo world'
assert ('Java is better' - 'better').trim() == 'Java is'
assert 'nokia' * 2 == 'nokianokia'

def empty = []
assert 'abc'.each {empty << it} == 'abc'
assert 'abc'.next() == 'abd'
assert 'abc'.previous() == 'abb'

// use of the index operator
assert 'abcd'[1] == 'b'
assert 'abcd'[2..'abcd'.size()-1] == 'cd'
assert 'abcd'[0,1,3] == 'abd'
assert 'abcd'[-4, -2] == 'ac'

// search max element in String
assert Collections.max('abcdeF'.toList()) == 'e'
assert Collections.max('abcdeF'.toList(), String.CASE_INSENSITIVE_ORDER) == 'F'
assert Collections.min(['abd','abc','abe']) == 'abc'
assert Collections.min(['aBd','abC','ABE'], String.CASE_INSENSITIVE_ORDER) == 'abC'

/*
*   StringBuilder and StringBuffer are similar in Java
*/

// Numbers
assert 1.class == Integer
assert 10000000000.class == Long

assert 1.class == Integer
assert 1l.class == Long
assert 1g.class == BigInteger

assert 1f.class == Float
assert 1d.class == Double
assert 5.0.class == BigDecimal

assert 1/2 == 0.5 // integer division returns a decimal number
n = 10/5
assert n.class == BigDecimal

n = 1.intdiv(2)
assert n.class == Integer
assert n == 0

assert 3.abs() == 3
assert (-3).abs() == 3

def total = 0
5.downto(0) {
    total += it
}
assert total == 15

0.upto(5) {
    total -= it
}
assert total == 0

// secure access operator

a = null
// assert a + 3 == 3 -> NullPointerException
// assert a.plus(3) == null -> NullPointerException
assert a?.plus(3) == null