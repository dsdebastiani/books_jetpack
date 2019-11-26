package dominando.android.presentation.data

import dominando.android.data.model.Book
import dominando.android.data.model.MediaType
import dominando.android.data.model.Publisher
import java.util.UUID

object DataFactory {
    fun dummyBookList() = listOf(
            Book().apply {
                id = UUID.randomUUID().toString()
                title = "Dominando o Android"
                author = "Nelson Glauber"
                available = true
                coverUrl = ""
                pages = 954
                publisher = Publisher(UUID.randomUUID().toString(), "Novatec")
                year = 2018
                mediaType = MediaType.PAPER
                rating = 5f
            },
            Book().apply {
                id = UUID.randomUUID().toString()
                title = "Clean Code"
                author = "Uncle Bob"
                available = true
                coverUrl = ""
                pages = 465
                publisher = Publisher(UUID.randomUUID().toString(), "Outro")
                year = 2009
                mediaType = MediaType.EBOOK
                rating = 5f
            }
    )

    fun dummyBook() = Book().apply {
        id = UUID.randomUUID().toString()
        title = "Dominando o Android"
        author = "Nelson Glauber"
        available = true
        coverUrl = ""
        pages = 954
        publisher = Publisher(UUID.randomUUID().toString(), "Novatec")
        year = 2018
        mediaType = MediaType.EBOOK
        rating = 5f
    }
}
