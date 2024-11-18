package org.example
import org.jsoup.Jsoup
fun main() {
    val url = "https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/"
    try {
        val doc = Jsoup.connect(url).get()

        val citations = doc.select(".sc-2aegk7-2.bzpNIu")
        for (i in citations) {
            println(i.text())
        }
    } catch (e: Exception) {
        println("Ошибка при получении данных: ${e.message}")
    }
}
