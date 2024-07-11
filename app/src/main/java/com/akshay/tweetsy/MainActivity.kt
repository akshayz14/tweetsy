package com.akshay.tweetsy

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.akshay.tweetsy.api.TweetsyAPI
import com.akshay.tweetsy.screens.CategoryScreen
import com.akshay.tweetsy.screens.DetailScreen
import com.akshay.tweetsy.ui.theme.TweetsyTheme
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var tweetsyAPI: TweetsyAPI

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TweetsyTheme {
                // A surface container using the 'background' color from the theme

                App()
            }
        }
    }
}


@Composable
fun App() {

    val navHostController = rememberNavController()

    NavHost(
        navController = navHostController,
        startDestination = "category"
    ) {
        composable(route = "category") {
            CategoryScreen {
                navHostController.navigate("detail/$it")
            }
        }
        composable(
            route = "detail/{category}",
            arguments = listOf(navArgument("category") {
                type = NavType.StringType
            })
        ) {
            DetailScreen()
        }
    }


}
