package com.example.newscompose.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class NewsModel(val title: String, val date: String, val description: String): Parcelable
