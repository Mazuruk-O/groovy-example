package groovy_and_grails_example.groovy_example.section_4

class MOP {
    def list

    def getProperty() {
        println "This list is $list"
    }

    // catch dynamic call method
    def invokeMethod(String name, args) {
        if(name.startsWith("findAllStartWith")) {
            String startWith = name[-1]
            return list.findAll{it.startsWith(startWith)}
        }
    }
}

def mop = new MOP(list: ['Groovy','is','great','test','world'])
assert mop.findAllStartWithG() == ['Groovy']
assert mop.findAllStartWithi() == ['is']
assert mop.findAllStartWithz() == []

class MopMissing {
    // catch missing method call
    def methodMissing(String name, args) {
        "method $name missing"
    }
}

def mop2 = new MopMissing()
assert mop2.none() == "method none missing"