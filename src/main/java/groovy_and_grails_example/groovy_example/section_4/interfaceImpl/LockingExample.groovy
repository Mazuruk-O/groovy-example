package groovy_and_grails_example.groovy_example.section_4.interfaceImpl

interface LockingExampleIntrfc {
    String callLocking();
}

class LockingExampleImpl {
    LockingExampleIntrfc lockingExample

    LockingExampleImpl(LockingExampleIntrfc lockingExample) {
        this.lockingExample = lockingExample
    }

    String callLocking() {
        lockingExample.callLocking()
    }
}

println(new LockingExampleImpl({'This is locking'} as LockingExampleIntrfc).callLocking())