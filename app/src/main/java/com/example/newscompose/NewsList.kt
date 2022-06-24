package com.example.newscompose

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController


@Composable
fun NewsList(newsViewModel: NewsViewModel = viewModel(), navController: NavController) {

    val title by newsViewModel.title.observeAsState()
    val date by newsViewModel.date.observeAsState()
    val description by newsViewModel.description.observeAsState()

    LazyColumn {
        items(10) {
            NewsItem(
                title = "$title",
                date = "$date",
                description = "$description",
                onClick = { navController.navigate("detailScreen") }
            )
        }
    }
}