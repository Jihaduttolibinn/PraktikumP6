package com.example.navigationp6

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.navigationp6.view.FormIsian
import com.example.navigationp6.view.TampilData

enum class Navigation{
    FormulirKu,

    Detail
}

@Composable
fun DataApp(
    nayController: NavHostController = rememberNavController(),
    modifier: Modifier
){
    Scaffold { isiRuang->
        NavHost(
            navController = navController,
            startDestination = Navigasi.FormulirKu.name,

            modifier = Modifier.padding(paddingValues = isiRuang)){
            composable(route = Navigasi.Formulirku.name){
                FormIsian (
                    OnSubmitBtnClick = {
                        nayController.navigate(route = Navigasi.Detail.name)
                    }
                )
            }
            composable(route = Navigasi.Detail.name){
                TampilData (
                    onBackBtnClick = {
                        cancelAndBackToFormulirKu(navController)
                    }
                )
            }
        }
    }
}
private fun cancelAndBackToFormulirKu(
    navController: NavHostController
){
    navController.popBackStack(route = Navigasi.Formulirku.name,
        inclusive = false)
}

