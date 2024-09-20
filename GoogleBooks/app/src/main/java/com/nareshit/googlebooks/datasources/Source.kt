package com.nareshit.googlebooks.datasources

import com.google.gson.annotations.SerializedName


data class Source (

  @SerializedName("kind"       ) var kind       : String?          = null,
  @SerializedName("totalItems" ) var totalItems : Int?             = null,
  @SerializedName("items"      ) var items      : ArrayList<Items> = arrayListOf()

)