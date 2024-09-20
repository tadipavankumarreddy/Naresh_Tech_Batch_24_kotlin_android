package com.nareshit.googlebooks.datasources

import com.google.gson.annotations.SerializedName


data class Epub (

  @SerializedName("isAvailable"  ) var isAvailable  : Boolean? = null,
  @SerializedName("acsTokenLink" ) var acsTokenLink : String?  = null

)