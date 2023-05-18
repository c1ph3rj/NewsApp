package com.c1ph3rj.newsapp.ui.screens.latestnewspkg.model

import com.google.gson.annotations.SerializedName


data class LatestNewsModel (

  @SerializedName("status"       ) var status       : String?             = null,
  @SerializedName("totalResults" ) var totalResults : Int?                = null,
  @SerializedName("articles"     ) var articles     : ArrayList<Articles> = arrayListOf()

)