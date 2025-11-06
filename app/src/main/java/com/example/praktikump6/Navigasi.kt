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

}