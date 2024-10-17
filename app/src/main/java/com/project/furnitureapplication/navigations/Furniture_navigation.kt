package com.project.furnitureapplication.navigations

import androidx.compose.runtime.Composable
import androidx.compose.ui.input.key.Key.Companion.Home
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.rememberNavController
import com.project.furnitureapplication.screens.CheckOutScreen
import com.project.furnitureapplication.screens.HomeScreen
import com.project.furnitureapplication.screens.LoginScreen
import com.project.furnitureapplication.screens.ProductDetailScreen


@Composable
fun FurnitureNavigation() {

    val navHostController = rememberNavController()

    NavHost(navController = navHostController, startDestination = Routes.LoginScreen){
        composable(Routes.LoginScreen){
            LoginScreen(
                onLoginSuccess = {
                    navHostController.navigate(Routes.home_screens) {
                        popUpTo(0)
                    }
                }
            )
        }
        composable(Routes.home_screens){
            HomeScreen(navHostController)
        }

        composable(Routes.product_detail_screen){
            ProductDetailScreen(navHostController)
        }

        composable(Routes.check_out_screen){
            CheckOutScreen(navHostController)
        }

    }
}
