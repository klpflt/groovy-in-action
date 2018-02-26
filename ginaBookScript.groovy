// Using the book class

Book gina = new Book("Groovy, So Groovy") // instantiating gina from Book

assert gina.getTitle() == "Groovy, So Groovy"
assert getTitleBackwards(gina) == "yvoorG oS ,yvoorG"

String getTitleBackwards(book) {
  String title = book.getTitle()
  return title.reverse()
}

println (gina.getTitle())
println (getTitleBackwards(gina))
