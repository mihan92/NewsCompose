package com.example.newscompose

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.newscompose.ui.theme.NewsComposeTheme

@Composable
fun DetailScreen(newsViewModel: NewsViewModel = viewModel()) {

    val title by newsViewModel.title.observeAsState()
    val date by newsViewModel.date.observeAsState()
    val description by newsViewModel.description.observeAsState()

    NewsComposeTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            LazyColumn(Modifier.padding(15.dp)) {
                item {
                    Spacer(modifier = Modifier.padding(vertical = 6.dp))
                    Text(
                        text = title.orEmpty(), style = MaterialTheme.typography.subtitle1.copy(
                            fontWeight = FontWeight.ExtraBold, fontFamily = FontFamily.Default
                        )
                    )
                    Spacer(modifier = Modifier.padding(vertical = 2.dp))
                    Text(
                        text = date.orEmpty(), color = MaterialTheme.colors.primary,
                        style = MaterialTheme.typography.subtitle2.copy(
                            fontWeight = FontWeight.Light, fontFamily = FontFamily.Default
                        )
                    )
                    Spacer(modifier = Modifier.padding(vertical = 6.dp))
                    Text(
                        text = description.orEmpty(), color = MaterialTheme.colors.primaryVariant,
                        style = MaterialTheme.typography.subtitle1.copy(
                            fontWeight = FontWeight.Medium, fontFamily = FontFamily.Default
                        )
                    )
                }
            }
        }
    }
}
