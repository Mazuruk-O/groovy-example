package groovy_and_grails_example.groovy_example.section_6

import groovy.xml.MarkupBuilder

def file = new File('index.html')

if(!file.exists()) {
    file.createNewFile()
}

def writer = new FileWriter(file)

def builder = new MarkupBuilder(writer)

builder.html {
    head {
        title 'MarkupBuilder for html'
    }
    body {
        h1 'Generate by MarkupBuilder'
        form(name:'input', action:'', method:'get') {
            'span' 'Male:'
            input (type:'radio',name:'Sex',value:'Male', checked:'checked')
            br()
            'span' 'Female:'
            input (type:'radio',name:'Sex',value:'Female', checked:'checked')
            br()
            input(type:'submit',value:'Submit')
        }
    }
}