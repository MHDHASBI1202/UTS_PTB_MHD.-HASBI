package com.example.med_info

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.med_info.screen.DetailScreen
import com.example.med_info.screen.MainScreen
import com.example.med_info.ui.theme.MedInfoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MedInfoTheme {

                AppNavHost()
            }
        }
    }
}

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun AppNavHost() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "home",
        // Terapkan Animasi Transisi
        modifier = Modifier.fillMaxSize(),
        enterTransition = { slideInHorizontally(initialOffsetX = { 1000 }) }, // Layar baru masuk dari kanan
        exitTransition = { slideOutHorizontally(targetOffsetX = { -1000 }) } // Layar lama keluar ke kiri
    ) {
        // Rute "home" memanggil MainScreen
        composable("home") {
            MainScreen(navController = navController)
        }

        // Rute "detail/{keluhanId}" memanggil DetailScreen
        composable(
            route = "detail/{keluhanId}",
            arguments = listOf(navArgument("keluhanId") { type = NavType.IntType })
        ) { backStackEntry ->
            // Mengambil ID yang dikirim dari layar sebelumnya
            val keluhanId = backStackEntry.arguments?.getInt("keluhanId") ?: -1
            DetailScreen(
                navController = navController,
                keluhanId = keluhanId
            )
        }
    }
}