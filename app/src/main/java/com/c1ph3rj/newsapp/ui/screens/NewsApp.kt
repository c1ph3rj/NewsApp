package com.c1ph3rj.newsapp.ui.screens

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NewsApp() {

}

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "LatestNews") {
        composable("LatestNews"){

        }
        composable("DetailedNews"){

        }
    }
}