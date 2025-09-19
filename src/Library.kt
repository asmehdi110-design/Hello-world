data class Book(
    val isbn: String,
    val title: String,
    val author: String,
    var isAvailable: Boolean = true
)

class Library {
    private val books = mutableListOf<Book>()

    fun addBook(book: Book) {
        books.add(book)
        println("Added: ${book.title}")
    }

    fun borrowBook(isbn: String): Boolean {
        val book = books.find { it.isbn == isbn && it.isAvailable }
        return if (book != null) {
            book.isAvailable = false
            println("Borrowed: ${book.title}")
            true
        } else {
            println("Book not available")
            false
        }
    }

    fun returnBook(isbn: String): Boolean {
        val book = books.find { it.isbn == isbn && !it.isAvailable }
        return if (book != null) {
            book.isAvailable = true
            println("Returned: ${book.title}")
            true
        } else {
            println("Book not found in borrowed list")
            false
        }
    }

    fun listAvailableBooks() {
        val available = books.filter { it.isAvailable }
        println("Available books:")
        available.forEach { println("- ${it.title} by ${it.author}") }
    }
}

fun main() {
    val library = Library()

    val b1 = Book("101", "Kotlin Basics", "JetBrains")
    val b2 = Book("102", "Clean Code", "Robert C. Martin")

    library.addBook(b1)
    library.addBook(b2)

    library.listAvailableBooks()

    library.borrowBook("101")
    library.listAvailableBooks()

    library.returnBook("101")
    library.listAvailableBooks()
}