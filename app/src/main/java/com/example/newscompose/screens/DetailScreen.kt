package com.example.newscompose.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.newscompose.R
import com.example.newscompose.models.NewsModel
import com.example.newscompose.ui.theme.NewsComposeTheme

@Composable
fun DetailScreen(
    navController: NavController,
    newsItem: NewsModel
) {
    NewsComposeTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            Scaffold(topBar = { DetailTolBar(navController) }, modifier = Modifier.padding(horizontal = 10.dp)) {
                DetailItem(newsItem = newsItem)
            }
        }
    }
}


@Composable
fun DetailTolBar(navController: NavController) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        IconButton(
            onClick = {
                  navController.popBackStack()
            }, Modifier
                .background(
                    color = MaterialTheme.colors.secondary,
                    shape = RoundedCornerShape(40.dp)
                )
        ) {
            Icon(
                Icons.Default.ArrowBack,
                contentDescription = stringResource(R.string.icon_back_desc),
                tint = MaterialTheme.colors.primaryVariant
            )
        }
    }
}

@Composable
fun DetailItem(newsItem: NewsModel) {
    LazyColumn {
        item {
            Spacer(modifier = Modifier.padding(vertical = 6.dp))
            Text(
                text = newsItem.title, style = MaterialTheme.typography.subtitle1.copy(
                    fontWeight = FontWeight.ExtraBold, fontFamily = FontFamily.Default
                )
            )
            Spacer(modifier = Modifier.padding(vertical = 2.dp))
            Text(
                text = newsItem.date, color = MaterialTheme.colors.primary,
                style = MaterialTheme.typography.subtitle2.copy(
                    fontWeight = FontWeight.Light, fontFamily = FontFamily.Default
                )
            )
            Spacer(modifier = Modifier.padding(vertical = 6.dp))
            Text(
                text = newsItem.description, color = MaterialTheme.colors.primaryVariant,
                style = MaterialTheme.typography.subtitle1.copy(
                    fontWeight = FontWeight.Medium, fontFamily = FontFamily.Default
                )
            )
        }
    }
}
