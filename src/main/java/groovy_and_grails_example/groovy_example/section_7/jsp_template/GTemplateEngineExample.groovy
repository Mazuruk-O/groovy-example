package groovy_and_grails_example.groovy_example.section_7.jsp_template

import groovy.text.GStringTemplateEngine

def text = '''
From: $fromEmail
To: $toEmail
Dear $name, please click on the following URL to activate your account:
${link}
Thanks.
'''

def binding = ["fromEmail":"Groovy registration",
               "toEmail":"mazuruk.o@example.net",
               "name":"Oleg",
               "link":"https://www.jetbrains.com/help/idea/getting-started-with-groovy.html#test_groovy"]

def engine = new GStringTemplateEngine()
template =  engine.createTemplate(text).make(binding)
println template