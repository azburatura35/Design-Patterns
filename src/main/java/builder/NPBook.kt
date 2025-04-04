package builder

import java.time.Year

fun main(args: Array<String>) {

    val book = NPBook(isbn = "isbn...")

    println(book)

    val book2 = NPBook(title = "Shogun", genre = "Adventure")

    println(book2)

    val book3 = NPBook(author = "Marin")

    println(book3)

}

class NPBook(val isbn: String = "", val title: String = "", val genre: String = "", val author: String = "",
             val published: Year? = null, val description: String = "") {

    override fun toString(): String {
        return "NPBook(isbn='$isbn', title='$title', genre='$genre', author='$author', published=$published, description='$description')"
    }
}