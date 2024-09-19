/**
The items that we need
Book Title
Book Authors
Thumbnail Image Link
Description
*/

data class Item(val bookTitle:String, 
val bookAuthors:mutableListOf<String>, val imageLink:String,
val Description:String)

fun main(){
    val jsonObject = JsonObject(response)
    val array = jsonObject.getJsonArray("items")
    for(i in 0..items.length-1){
        val item = items.getJsonObject(i)
        val volinfo = item.getJsonObject("volumeInfo")
        val bookTitle = volinfo.getString("title")
        val authors = volinfo.getJsonArray("authors")
        val auths = mutableListOf<String>()
        for(i in 0..authors.length-1)
        {
            auths.add(authors[i]) 
        }

        val imageLinks = volinfo.getJsonObject("imageLinks")
        val smallthumbnail = imageLinks.getString("smallThumbnail")
        val Description = volinfo.getString("description")

        val i = Item(bookTitle,auths,smallThumbnail,Description)

    }
}