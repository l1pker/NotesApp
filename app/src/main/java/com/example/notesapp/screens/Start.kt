package com.example.notesapp.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.notesapp.navigation.NavRoute
import com.example.notesapp.ui.theme.NotesAppTheme

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun StartScreen(navController: NavHostController) {
    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ){
            Text("What you want use?")
            Button(
                onClick = {
                    navController.navigate(route = NavRoute.Main.route)
                },
                modifier = Modifier
                    .width(200.dp)
                    .padding(8.dp)
            ){
                Text("Room database")
            }
            Button(
                onClick = {
                    navController.navigate(route = NavRoute.Main.route)
                },
                modifier = Modifier
                    .width(200.dp)
                    .padding(8.dp)
            ){
                Text("Firebase")
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun prevStartScreen(){
    NotesAppTheme {
        StartScreen(navController = rememberNavController())
    }
}