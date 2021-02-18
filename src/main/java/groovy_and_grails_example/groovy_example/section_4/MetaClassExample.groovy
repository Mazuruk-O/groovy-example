package groovy_and_grails_example.groovy_example.section_4

// check Meta object programming in photo
println Object.metaClass.methods

a = [1,2]
println a.metaClass.methods

println File.metaClass.properties