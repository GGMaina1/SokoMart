package com.ggmaina.sokomart.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ggmaina.sokomart.ui.screens.about.AboutScreen
import com.ggmaina.sokomart.ui.screens.contact.ContactScreen
import com.ggmaina.sokomart.ui.screens.crypto.CryptoScreen
import com.ggmaina.sokomart.ui.screens.dashboard.DashboardScreen
import com.ggmaina.sokomart.ui.screens.home.HomeScreen
import com.ggmaina.sokomart.ui.screens.hwprojects.ProjectsScreen
import com.ggmaina.sokomart.ui.screens.intent.IntentScreen
import com.ggmaina.sokomart.ui.screens.item.ItemScreen
import com.ggmaina.sokomart.ui.screens.more.MoreScreen
import com.ggmaina.sokomart.ui.screens.service.ServiceScreen
import com.ggmaina.sokomart.ui.screens.splash.SplashScreen
import com.ggmaina.sokomart.ui.screens.start.StartScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_SPLASH
) {

    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(ROUT_HOME) {
            HomeScreen(navController)
        }
        composable(ROUT_ABOUT) {
            AboutScreen(navController)
        }
        composable(ROUT_ITEM) {
            ItemScreen(navController)
        }
        composable(ROUT_START) {
            StartScreen(navController)
        }
        composable(ROUT_CONTACT) {
            ContactScreen(navController)
        }
        composable(ROUT_INTENT) {
            IntentScreen(navController)
        }
        composable(ROUT_MORE) {
            MoreScreen(navController)
        }
        composable(ROUT_DASHBOARD) {
            DashboardScreen(navController)
        }
        composable(ROUT_SERVICE) {
            ServiceScreen(navController)
        }
        composable(ROUT_SPLASH) {
            SplashScreen(navController)
        }
        composable(ROUT_PROJECTS) {
            ProjectsScreen(navController)
        }
        composable(ROUT_CRYPTO) {
            CryptoScreen(navController)
        }


    }
}