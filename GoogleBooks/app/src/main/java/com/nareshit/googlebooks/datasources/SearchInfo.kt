package com.nareshit.googlebooks.datasources

import com.google.gson.annotations.SerializedName


data class SearchInfo (

  @SerializedName("textSnippet" ) var textSnippet : String? = null

)