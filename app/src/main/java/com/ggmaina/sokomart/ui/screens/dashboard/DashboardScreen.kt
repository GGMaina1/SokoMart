package com.ggmaina.sokomart.ui.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.ggmaina.sokomart.R
import com.ggmaina.sokomart.navigation.ROUT_MORE
import com.ggmaina.sokomart.navigation.ROUT_START

@Composable
fun DashboardScreen(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        //Card
        Card(
            modifier = Modifier.fillMaxWidth().height(300.dp),
            shape = RoundedCornerShape(bottomEnd = 60.dp, bottomStart = 60.dp),
            colors = CardDefaults.cardColors(Color.Magenta)
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(R.drawable.img_9),
                    contentDescription = "home",
                    modifier = Modifier.width(150.dp).height(150.dp).clip(shape = RoundedCornerShape(20.dp)),
                    contentScale = ContentScale.FillBounds
                )
                Text(
                    text = "SokoMart",
                    fontSize = 60.sp,
                    color = Color.Black,
                    fontFamily = FontFamily.Cursive,
                    fontWeight = FontWeight.ExtraBold
                )


            }

        }
    //End of card
        Spacer(modifier = Modifier.height( 40.dp))

        //Row
        Row(modifier = Modifier.padding(start = 27.dp)) {
            //Card
            Card(
                modifier = Modifier.width(150.dp).height(180.dp),
                elevation = CardDefaults.cardElevation(10.dp)

            ) {
                Column(modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(R.drawable.img_10),
                        contentDescription = "home",
                        modifier = Modifier.width(100.dp).height(100.dp).clip(shape = RoundedCornerShape(20.dp)),
                        contentScale = ContentScale.FillBounds
                    )
                    Text(
                        text = "Home",
                        fontSize = 15.sp
                    )

                }

            }

            //End of card
            Spacer(modifier = Modifier.width( 40.dp))
            //Card
            Card(
                modifier = Modifier.width(150.dp).height(180.dp),
                elevation = CardDefaults.cardElevation(10.dp)

            ) {
                Column(modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(R.drawable.img_10),
                        contentDescription = "home",
                        modifier = Modifier.width(100.dp).height(100.dp).clip(shape = RoundedCornerShape(20.dp)),
                        contentScale = ContentScale.FillBounds
                    )
                    Text(
                        text = "Home",
                        fontSize = 15.sp
                    )

                }

            }

            //End of card

        }
        //End of row
        Spacer(modifier = Modifier.height( 20.dp))
        //Row
        Row(modifier = Modifier.padding(start = 27.dp)) {
            //Card
            Card(
                modifier = Modifier.width(150.dp).height(180.dp),
                elevation = CardDefaults.cardElevation(10.dp)

            ) {
                Column(modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(R.drawable.img_10),
                        contentDescription = "home",
                        modifier = Modifier.width(100.dp).height(100.dp).clip(shape = RoundedCornerShape(20.dp)),
                        contentScale = ContentScale.FillBounds
                    )
                    Text(
                        text = "Home",
                        fontSize = 15.sp
                    )

                }

            }

            //End of card
            Spacer(modifier = Modifier.width( 40.dp))
            //Card
            Card(
                modifier = Modifier.width(150.dp).height(180.dp),
                elevation = CardDefaults.cardElevation(10.dp)

            ) {
                Column(modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(R.drawable.img_10),
                        contentDescription = "home",
                        modifier = Modifier.width(100.dp).height(100.dp).clip(shape = RoundedCornerShape(20.dp)),
                        contentScale = ContentScale.FillBounds
                    )
                    Text(
                        text = "Home",
                        fontSize = 15.sp
                    )

                }

            }

            //End of card

        }
        //End of row
        IconButton(onClick = {
            navController.navigate(ROUT_START)

        }) {
            Icon(imageVector = Icons.Default.ArrowForward, contentDescription = "")
        }


    }

}

@Preview(showBackground = true)
@Composable
fun DashboardScreenPreview(){
    DashboardScreen(navController= rememberNavController())
}