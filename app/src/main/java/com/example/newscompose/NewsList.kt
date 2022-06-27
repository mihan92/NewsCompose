package com.example.newscompose

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController


@Composable
fun NewsList(newsViewModel: NewsViewModel = viewModel(), navController: NavController) {

    val viewModel by newsViewModel.newsViewModel.observeAsState(emptyList())

    LazyColumn {
        itemsIndexed(viewModel) { _, item ->
            NewsItem(
                title = item.title,
                date = item.date,
                description = item.description,
                onClick = {
                    navController.currentBackStackEntry?.savedStateHandle?.set("key", item)
                    navController.navigate("detailScreen")
                }
            )
        }
    }
}
