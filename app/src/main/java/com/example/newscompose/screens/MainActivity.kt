package com.example.newscompose.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.newscompose.models.NewsModel


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            NavHost(navController, startDestination = "homeScreen") {
                composable(route = "homeScreen") { HomeScreen(navController = navController) }
                composable(route = "detailScreen") {
                    val newsItem =
                        navController.previousBackStackEntry?.savedStateHandle?.get<NewsModel>("key")
                    newsItem?.let {
                        DetailScreen(navController = navController, newsItem =  newsItem)
                    }

                }
            }
        }
    }
}
