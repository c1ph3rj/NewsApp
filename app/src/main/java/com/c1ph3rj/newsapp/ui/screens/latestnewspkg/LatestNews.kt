package com.c1ph3rj.newsapp.ui.screens.latestnewspkg

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.c1ph3rj.newsapp.ui.screens.latestnewspkg.model.Articles
import com.c1ph3rj.newsapp.ui.screens.latestnewspkg.model.LatestNewsModel
import com.c1ph3rj.newsapp.ui.screens.latestnewspkg.model.MockData.LatestNewsData
import com.google.gson.Gson
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter




@Composable
fun LatestNews(navController: NavController) {
    Scaffold(
        backgroundColor = Color.White
    ) {
        LazyColumn(modifier = Modifier.fillMaxSize()) {
            item {
                Text(
                    text = "Latest News",
                    fontSize = 35.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(
                        0xFF3F51B5
                    ),
                    modifier = Modifier.padding(
                        start = 15.dp,
                        end = 15.dp,
                        top = 15.dp,
                        bottom = 8.dp
                    )
                )
            }
            items(count = LatestNewsData.articles.size) { index ->
                val currentArticle = LatestNewsData.articles[index]
                ArticleUi(currentArticle = currentArticle, onClickNews = {
                    navController.navigate("DetailedNews/${index}")
                })
            }
        }
    }
}

@Composable
fun ArticleUi(currentArticle: Articles, onClickNews: () -> Unit = {}) {
    Box(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
            .height(250.dp)
            .clickable { onClickNews() }
            .clip(RoundedCornerShape(10.dp))
    ) {
        AsyncImage(
            model = currentArticle.urlToImage,
            contentDescription = currentArticle.description,
            contentScale = ContentScale.Crop
        )
        Box(
            modifier = Modifier
                .align(Alignment.BottomStart)
                .background(
                    Brush.verticalGradient(
                        listOf(Color.Transparent, Color.Black),
                        0f,  // TODO: set start
                        500f,  // TODO: set end
                    )
                )
                .fillMaxSize()
                .clip(
                    RoundedCornerShape(
                        10.dp
                    )
                )
        ) {
            Text(
                text = currentArticle.title.toString(),
                fontSize = 20.sp,
                modifier = Modifier
                    .padding(8.dp)
                    .align(Alignment.BottomStart)
            )
        }
        Box(
            modifier = Modifier
                .align(Alignment.TopEnd)
                .background(
                    Brush.horizontalGradient(
                        listOf(Color(0x666B6A6A), Color.Black),
                        0f,
                        150f,
                    )
                )
        ) {
            Text(
                text = convertDateTime(currentArticle.publishedAt.toString()),
                fontSize = 14.sp,
                modifier = Modifier.padding(8.dp),
                color = Color.White
            )
        }
    }
}

fun convertDateTime(dateTime: String): String {
    val localDateTime = LocalDateTime.parse(dateTime, DateTimeFormatter.ISO_OFFSET_DATE_TIME)
    val formatter = DateTimeFormatter.ofPattern("MMM d, yyyy h:mm a")
    return localDateTime.format(formatter)
}

