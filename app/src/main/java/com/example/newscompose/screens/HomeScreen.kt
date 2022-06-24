package com.example.newscompose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.outlined.FilterAlt
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.newscompose.ui.theme.NewsComposeTheme

@Composable
fun HomeScreen(navController: NavController) {
    NewsComposeTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            Scaffold(topBar = { ToolBar() }, modifier = Modifier.padding(horizontal = 10.dp)) {
                NewsList(navController = navController)
            }
        }
    }
}

@Composable
fun ToolBar() {
    val checked = rememberSaveable { mutableStateOf(false) }

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        IconButton(
            onClick = {}, Modifier
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
        Text(
            stringResource(R.string.title_news), style = MaterialTheme.typography.h5.copy(
                fontWeight = FontWeight.ExtraBold, fontFamily = FontFamily.Default
            )
        )
        IconButton(
            onClick = {}, Modifier
                .background(
                    color = MaterialTheme.colors.secondary,
                    shape = RoundedCornerShape(40.dp)
                )
        ) {
            IconToggleButton(checked = checked.value, onCheckedChange = { checked.value = it }) {
                Icon(
                    Icons.Outlined.FilterAlt,
                    contentDescription = stringResource(R.string.icon_filter_desc),
                    tint = if (checked.value) MaterialTheme.colors.primary else MaterialTheme.colors.primaryVariant
                )
            }
        }
    }
}