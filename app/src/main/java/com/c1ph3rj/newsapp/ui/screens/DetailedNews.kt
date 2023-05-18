package com.c1ph3rj.newsapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.c1ph3rj.newsapp.ui.screens.latestnewspkg.model.Articles
import okhttp3.internal.wait

@Composable
fun DetailedNews(navController: NavController, selectedArticle: Articles) {
    Scaffold (backgroundColor = Color.White){
        Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
            Row (verticalAlignment = Alignment.CenterVertically) {
                IconButton(onClick = { navController.popBackStack() }) {
                    Icon(imageVector = Icons.Outlined.ArrowBack, contentDescription = "Back", tint = Color(
                        0xFF3F51B5
                    ), modifier = Modifier
                        .height(35.dp)
                        .width(35.dp))
                }
                Text(text = selectedArticle.source?.name.toString(),
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(
                        0xFF3F51B5
                    ),
                    overflow = TextOverflow.Ellipsis,
                    maxLines = 1,
                    modifier = Modifier.weight(1f)
                        .padding(start = 5.dp)
                )
            }
            AsyncImage(
                model = selectedArticle.urlToImage,
                contentDescription = selectedArticle.description,
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(.5f)
            )
            Text(
                text = selectedArticle.title.toString(),
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                color = Color.DarkGray,
                modifier = Modifier.padding(
                    all = 8.dp
                )
            )
            Text(
                text = selectedArticle.content.toString(),
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color.DarkGray,
                modifier = Modifier.padding(
                    all = 8.dp
                )
            )

        }
    }
}