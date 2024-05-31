package com.soyaeeb.myapplication

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun MainRoute(){
   Column(
       modifier = Modifier.fillMaxSize(),
       horizontalAlignment = Alignment.CenterHorizontally,
   ) {
       Text(text = "Let's Play with compose")
   }
}