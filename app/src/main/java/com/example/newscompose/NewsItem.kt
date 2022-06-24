package com.example.newscompose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.NavigateNext
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp


@Composable
fun NewsItem(title: String, date: String, description: String, onClick: () -> Unit) {

    Column(modifier = Modifier
        .background(MaterialTheme.colors.background)
    ) {
        Row(modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(Modifier.weight(0.7f)
            ) {
                Spacer(modifier = Modifier.padding(vertical = 6.dp))
                Text(text = title, style = MaterialTheme.typography.subtitle1.copy(
                    fontWeight = FontWeight.ExtraBold, fontFamily = FontFamily.Default),
                    maxLines = 2
                )
                Spacer(modifier = Modifier.padding(vertical = 2.dp))
                Text(text = date, color = MaterialTheme.colors.primary,
                    style = MaterialTheme.typography.subtitle2.copy(
                    fontWeight = FontWeight.Light, fontFamily = FontFamily.Default)
                )
                Spacer(modifier = Modifier.padding(vertical = 6.dp))
                Text(text = description, color = MaterialTheme.colors.primaryVariant,
                    style = MaterialTheme.typography.subtitle1.copy(
                    fontWeight = FontWeight.Medium, fontFamily = FontFamily.Default),
                    maxLines = 2
                )
                Spacer(modifier = Modifier.padding(vertical = 6.dp))
            }
            IconButton(onClick = onClick) {
                Icon(
                    Icons.Outlined.NavigateNext,
                    contentDescription = stringResource(R.string.icon_back_desc),
                    tint = MaterialTheme.colors.primaryVariant
                )
            }
        }
        Divider(color = MaterialTheme.colors.primary, thickness = 1.dp)
    }
}