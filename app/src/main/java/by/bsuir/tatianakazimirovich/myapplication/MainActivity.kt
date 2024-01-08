package by.bsuir.tatianakazimirovich.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import by.bsuir.tatianakazimirovich.myapplication.ui.theme.MyApplicationTheme


class MainActivity : ComponentActivity() {
    val aboutAppScreen = AboutScreen()
    val homeAppScreen = HomeScreen()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()

            MyApplicationTheme {
                NavHost(
                    navController = navController,
                    startDestination = getString(R.string.home_screen)
                ) {
                    composable(getString(R.string.home_screen)) {
                        homeAppScreen.HomeScreen {
                            navController.navigate(
                                getString(R.string.about_screen)
                            )
                        }
                    }
                    composable(getString(R.string.about_screen)) {
                        aboutAppScreen.AboutScreenFun()
                    }
                }
            }
        }
    }
}









