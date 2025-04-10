package com.ggmaina.sokomart.ui.screens.splash

import android.annotation.SuppressLint
import android.graphics.fonts.Font
import android.graphics.fonts.FontFamily
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.ggmaina.sokomart.R
import com.ggmaina.sokomart.navigation.ROUT_DASHBOARD
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun SplashScreen(navController: NavController){

    val coroutine = rememberCoroutineScope()
    coroutine.launch{
        delay(3000)
        navController.navigate(ROUT_DASHBOARD)
    }

    Column(
        modifier = Modifier.fillMaxSize().background(Color.Magenta),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(R.drawable.img_19),
            contentDescription = "",
            modifier= Modifier.size(300.dp)
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "SokoMart",
            fontSize = 40.sp,
            fontFamily = androidx.compose.ui.text.font.FontFamily.Cursive,
            fontWeight = FontWeight.ExtraBold
        )
        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Your best online shop",
            fontSize = 20.sp,
        )


    }
}

@Preview(showBackground = true)
@Composable
fun SplahScreenPreview(){
    SplashScreen(navController= rememberNavController())
}