package com.nareshit.jokes

import android.os.AsyncTask
import android.view.View
import android.widget.ProgressBar
import android.widget.TextView
import java.net.URL
import java.util.Scanner
import javax.net.ssl.HttpsURLConnection

// To perform networking
/**for AsyncTask you are supposed to provide three Generic arguments
 * <DataType1> -> The i/p of doInbackground()
 * <DataType2> -> Progress update
 * <DataType3> -> the return of doInBackground(..) [I/p of onPostExecute(...)]*/
class FetchJoke(val textView: TextView, val progressBar:ProgressBar):AsyncTask<Void, Void,String>(){

    val link = "https://api.chucknorris.io/jokes/random"

    override fun doInBackground(vararg params: Void?): String {
        // You can perfrom networking here
        val url = URL(link)
        // Open the connection
        val urlConnection = url.openConnection() as HttpsURLConnection
        // read the inputstream from the url
        val ip = urlConnection.inputStream
        // Use scanner to scrape the data from ip
        val s = Scanner(ip)
        val sb:StringBuilder = StringBuilder()
        do{
            sb.append(s.nextLine())
        }while(s.hasNextLine())
        return sb.toString()
    }

    // This method runs on the main thread
    override fun onPostExecute(result: String?) {
        super.onPostExecute(result)
        progressBar.visibility = View.INVISIBLE
        textView.text = result
    }
}