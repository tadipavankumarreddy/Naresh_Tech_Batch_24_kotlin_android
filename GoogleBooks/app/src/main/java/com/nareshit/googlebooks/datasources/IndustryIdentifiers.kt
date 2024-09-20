package com.nareshit.googlebooks.datasources

import com.google.gson.annotations.SerializedName


data class IndustryIdentifiers (

  @SerializedName("type"       ) var type       : String? = null,
  @SerializedName("identifier" ) var identifier : String? = null

)