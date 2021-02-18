package groovy_and_grails_example.groovy_example.section_3

// Cycle
for (int i = 0; i < 10; i++) {
    print 'Java is better :-D '
}

println()
for(i in 0..10) {
    print 'Range iteration '
}

println()
for (i in [1,2,77,4,5]) {
    print i
}

println()
arr = new Integer[4]
arr[0] = 0; arr[1] = 99; arr[2] = 2; arr[3] = 3;
for(i in arr) {
    print i
}

println()
map = [name:'Java', age:30, id:1200, country:'USA', state:'AZ']
for(entry in map) {
    print entry.getKey() + ' ' + entry.getValue() + ' '
}

println()
for(c in 'Hello') {
    print c + ' '
}

println()
a = [1..10].flatten()
a.each {
    print it + ' '
}