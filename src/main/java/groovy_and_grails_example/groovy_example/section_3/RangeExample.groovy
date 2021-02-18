package groovy_and_grails_example.groovy_example.section_3

// Ranges
assert 1..4 == [1,2,3,4]
assert 'a'..'c' == ['a','b','c']

assert 1..<4 == [1,2,3]

assert [1..3] == [[1,2,3]]
assert [*1..3] == [1,2,3] // * it's flatten range

a = [5,6,7,8,9,10,11]
assert a[1..3] == [6,7,8]

def list = []
('a'..'z').each {
    list += it
}

assert list == ('a'..'z').toList()