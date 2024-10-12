package com.project.furnitureapplication.navigations

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.project.furnitureapplication.screens.CheckOutScreen
import com.project.furnitureapplication.screens.HomeScreen
import com.project.furnitureapplication.screens.LoginScreen
import com.project.furnitureapplication.screens.ProductDetailScreen


@Composable
fun FurnitureNavigation( navController: NavHostController) {

    val navHostController = rememberNavController()

    NavHost(navController = navHostController, startDestination = "Login"){
        composable("login") {
            LoginScreen (onLoginSuccess = {
                navController.navigate(Home)
            })
        }
        composable(Home){
            HomeScreen(navHostController)
        }

        composable(ProductDetail){
            ProductDetailScreen(navHostController)
        }

        composable(Checkout){
            CheckOutScreen(navHostController)
        }

    }

}

const val Home = "home_screen"
const val ProductDetail = "product_detail_screen"
const val Checkout = "check_out_screen"