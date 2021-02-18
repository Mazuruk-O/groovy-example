package groovy_and_grails_example.groovy_example.section_3

// List in Groovy
// by default all list in groovy is ArrayList
a = [1,2,3]
assert a.class == ArrayList
b = new LinkedList([1,2,3])
assert b.class == LinkedList

// example with different entity type
a = ['Hello',1,2,[12,23]]
assert a[3] == [12,23]

// get element
a = [1,2,3,4]
assert a[0] == a.get(0) && a.get(0) == a.getAt(0)
assert a[-4] == 1
assert a[-1] == 4

// add element
a = [1,2]
a += 3
a -= 1
a << 4
a.add(5)
assert a == [2,3,4,5]

assert ![]
assert [1]

a = [1,2] + [3]
a += [4,5]
a.add([6,7,8])
a.addAll([9,10,11,12])
assert a == [1,2,3,4,5,[6,7,8],9,10,11,12]

// flatten list
a = [1,2,[3]]
b = [1,2,3]
assert a.flatten() == b

// remove element
c = ['a','b','c']
assert c.remove('b')
assert !c.remove('x')

// iteration
a = [1,2,3]
total = 0
a.each {
    total += it
}
assert total == 6
a.eachWithIndex { it, index -> b[index] = a[index]}
assert a == b

a = [4,5,6]
b = a.collect{it * 5}
c = [4,5,9,'a']
d = ["Java","Groovy"]
assert b == [20,25,30]
assert a.sum() == 15
assert a.sum(10) == 25
assert c.sum() == '18a'
assert d.sum() == 'JavaGroovy'

a = ('a'..'z').toList()
assert a.find{it > 'x'} == 'y'
assert a.findAll{it > 'x'} == ['y','z']
assert a.every{it > 'A'}
assert a.any{it > 'c'}

a = [1,2,3]
assert a.reverse() == [3,2,1]
assert a.join("*") == '1*2*3'
assert a.join("e") == '1e2e3'

a = [1,2,3,15,10]
assert a.max() == 15
assert Collections.max(a) == 15
assert a.min() == 1
assert Collections.min(a) == 1

a = ['a','b','c','Hello']
assert a.min() == 'Hello'// ASCII compare
assert a.max() == 'c'

def customMinExample = ['Jun', 'Feb', 'Mar', 'Apr']
assert customMinExample.min{
    switch (it){
        case 'Jun': return 1
            break
        case 'Feb': return 2
            break
        case 'Mar': return 3
            break
        case 'Apr': return 4
            break
        default: return 1
    }
} == 'Jun'

def customSortExample = ['Mar', 'Apr', 'Jun', 'Feb']
assert customSortExample.sort{
    switch (it){
        case 'Jun': return 1
            break
        case 'Feb': return 2
            break
        case 'Mar': return 3
            break
        case 'Apr': return 4
            break
        default: return 1
    }
} == ['Jun', 'Feb', 'Mar', 'Apr']