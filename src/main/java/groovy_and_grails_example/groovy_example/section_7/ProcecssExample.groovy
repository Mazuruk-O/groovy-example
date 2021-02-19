package groovy_and_grails_example.groovy_example.section_7

def process = "cmd.exe path".execute()
println "${process.text}"
