package com.c1ph3rj.newsapp.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.c1ph3rj.newsapp.ui.screens.latestnewspkg.model.Articles

@Composable
fun DetailedNews(navController: NavController, selectedArticle: Articles) {
    Scaffold {
        Box(modifier = Modifier.fillMaxSize()) {
            Button(onClick = {
                navController.popBackStack()
            }, modifier = Modifier.align(Alignment.Center)) {
                Text(
                    text = selectedArticle.title.toString(),
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
        }
    }
}