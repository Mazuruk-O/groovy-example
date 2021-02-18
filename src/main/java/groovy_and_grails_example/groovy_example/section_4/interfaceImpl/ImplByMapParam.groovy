package groovy_and_grails_example.groovy_example.section_4.interfaceImpl

interface SampleInterface
{ void method1(); void method2(int a); String method3(int a, int b);}

x = [
        method1: {println 'method1'},
        method2: {a -> println 'method2 ' + a},
        method3: {a, b -> println "method3 with $a and $b";
            return "return from 3 method"}
] as SampleInterface

x.method1()
x.method2(314159265)
println x.method3(4,5)
