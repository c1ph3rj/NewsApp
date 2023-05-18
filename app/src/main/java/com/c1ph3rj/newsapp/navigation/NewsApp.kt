package com.c1ph3rj.newsapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.c1ph3rj.newsapp.ui.screens.DetailedNews
import com.c1ph3rj.newsapp.ui.screens.latestnewspkg.LatestNews
import com.c1ph3rj.newsapp.ui.screens.latestnewspkg.model.MockData

@Composable
fun NewsApp() {
    Navigation()
}

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "LatestNews") {
        composable("LatestNews"){
            LatestNews(navController)
        }
        composable("DetailedNews/{index}", arguments = listOf(navArgument("index"){type = NavType.IntType})){
            navBackStackEntry ->
            val newsPos = navBackStackEntry.arguments?.getInt("index")
            DetailedNews(navController, MockData.getNewsByPos(newsPos!!))
        }
    }
}