package groovy_and_grails_example.groovy_example.section_4

def author = new Expando()
assert author.books == null
author.books = ['Book 1']
assert author.books == ['Book 1']
author.writeBook = { -> return author.books += 'Book ' + (author.books.size() + 1)}
author.writeBook()
assert author.books == ['Book 1', 'Book 2']
println author.books
