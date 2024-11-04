package com.nareshtech.favmoviesjuc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nareshtech.favmoviesjuc.ui.theme.FavMoviesJUCTheme

class MainActivity : ComponentActivity() {

    // TODO 1: Preparing data
    data class Movies(val images:Int,val title:String,val actors:MutableList<String>, val url:String)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FavMoviesJUCTheme {
                MoviesList(movies = prepareData())
            }
        }
    }
    
    // TODO 3: works like an adapter
    @Composable
    fun MoviesList(movies: List<Movies>){
        // You can also use LazyRow, LazyVerticalGrid, ŌLazyHorizontalGrid
        LazyColumn {
            items(movies){ movie ->
                MovieItem(movie = movie)
                
            }
        }
    }

    // TODO 2: Preparing the design for one item.
    @Composable
    fun MovieItem(movie:Movies){
        Row(modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically) {

            // Image
            Image(painter = painterResource(id = movie.images),
                contentDescription = "a aa",
                modifier = Modifier
                    .height(200.dp)
                    .width(100.dp)
                    .clip(RoundedCornerShape(8.dp)),
                contentScale = ContentScale.Crop)

            Column(modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = movie.title,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    color = colorResource(id = R.color.blue))

                Spacer(modifier = Modifier.height(8.dp))

                Text(text = movie.actors.joinToString(","),
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium,
                    textAlign = TextAlign.Center,
                    color = colorResource(id = R.color.black))
            }
        }
    }

    // TODO 1 (contd): Preparing data
    private fun prepareData():MutableList<Movies> {
        val movieItems = mutableListOf<Movies>()
        movieItems.add(Movies(R.drawable.a,"A Aa", mutableListOf("Nithin","Samantha"), "https://en.wikipedia.org/wiki/A_Aa"))
        movieItems.add(Movies(R.drawable.b,"Bahubali", mutableListOf("Prabhas","Anushka","Tamannah"), "https://en.wikipedia.org/wiki/Baahubali:_The_Beginning"))
        movieItems.add(Movies(R.drawable.c,"Cindrella", mutableListOf("Lilly James"),"https://en.wikipedia.org/wiki/Cinderella_(2015_American_film)"))
        movieItems.add(Movies(R.drawable.d,"Dangal", mutableListOf("Aamir Khan"), "https://en.wikipedia.org/wiki/Dangal_(2016_film)"))
        movieItems.add(Movies(R.drawable.e,"Eega", mutableListOf("Nani","Samantha"), "https://en.wikipedia.org/wiki/Eega"))
        movieItems.add(Movies(R.drawable.f,"F2", mutableListOf("Venkatesh","Varun Tej"), "https://en.wikipedia.org/wiki/F2:_Fun_and_Frustration"))
        movieItems.add(Movies(R.drawable.g,"Godavari", mutableListOf("Sumanth","Kamilni"),"https://en.wikipedia.org/wiki/Godavari_(2006_film)"))
        movieItems.add(Movies(R.drawable.h,"Housefull", mutableListOf("Akshay Kumar","Deepika"),"https://en.wikipedia.org/wiki/Housefull_(2010_film)"))
        movieItems.add(Movies(R.drawable.i,"Iron Man", mutableListOf("Robert Downy jr"),"https://en.wikipedia.org/wiki/Iron_Man_(2008_film)"))
        movieItems.add(Movies(R.drawable.j,"The Jungle Book", mutableListOf("Neel Sethi"), "https://en.wikipedia.org/wiki/The_Jungle_Book_(2016_film)"))
        return movieItems
    }
}