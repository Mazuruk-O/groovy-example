package groovy_and_grails_example.groovy_example.section_6

import groovy.xml.MarkupBuilder

// write in xml
def file = new File('books.xml')

if(!file.exists()) {
    file.createNewFile()
}

def writer = new FileWriter(file)

def builder = new MarkupBuilder(writer)

builder.books {
    book(title:'Learn Java') {
        author(name:'G. Shild', count: 1500)
    }
    book(title:'Learn C++') {
        author(name:'G. Shild', count: 750)
    }
}

