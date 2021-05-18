package com.example.composelogin

import android.content.res.Resources
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material.icons.twotone.Email
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composelogin.ui.theme.ComposeLoginTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeLoginTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Composable
fun LoginScreen() {
    Column(modifier = Modifier.background(color = colorResource(id = R.color.white))) {


        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(fraction = .5f)
                .clip(shape = RoundedCornerShape(bottomEnd = 100.dp))
                .background(color = colorResource(id = R.color.grey))
        ) {

            Image(
                painterResource(id = R.drawable.bg),
                contentDescription = "Top Login Image",
                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth()
            )

        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .background(color = colorResource(id = R.color.grey))
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .clip(shape = RoundedCornerShape(topStart = 100.dp))
                    .background(color = colorResource(id = R.color.white))
            ) {


                Column()
                {
                            Text("Please Login in",modifier = Modifier
                                .fillMaxWidth()
                                .padding(10.dp),textAlign = TextAlign.Center,
                            style =  TextStyle(fontSize = 24.sp,fontWeight = FontWeight.Bold))


                            OutlinedTextField(value = "",
                                onValueChange = {   }
                            ,label = {Text("Email")}
                            ,modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(10.dp))

                            OutlinedTextField(value = "",
                                onValueChange = {   }
                            ,label = {Text("Password")}
                            ,modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(10.dp))



                    Text("? forgot password",modifier = Modifier
                        .fillMaxWidth()
                        .padding(4.dp),textAlign = TextAlign.Center,
                        style =  TextStyle(fontSize = 14.sp))


                    Button(
                        modifier =  Modifier.padding(14.dp).fillMaxWidth().clip(shape=  RoundedCornerShape(20.dp)),
                        onClick = { }) {

                        Text("Login")


                    }





                }


            }

        }

    }


}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeLoginTheme {
        LoginScreen()
    }
}


@Composable
fun buildDivider(height: Dp) {
    Box(
        Modifier
            .fillMaxWidth()
            .background(color = Color.White)
            .height(height)
            .background(color = Color.White)

    )
}

//Column (Modifier.background(color = Color.White)){
//    Box(
//        modifier = Modifier
//            .fillMaxWidth()
//            .fillMaxHeight(.4f)
//            .clip(shape = RoundedCornerShape(bottomEnd = 100.dp))
//            .background(color = colorResource(id = R.color.grey))
//
//
//    ) {
//
//        Column(verticalArrangement = Arrangement.Center,
//            horizontalAlignment = Alignment.CenterHorizontally){
//            Image(painterResource(id = R.drawable.bg),contentDescription = "sdsd",modifier = Modifier
//                .fillMaxWidth()
//                .fillMaxHeight())
//        }
//
//    }
//
//    Box(
//        modifier = Modifier
//            .fillMaxWidth()
//            .fillMaxHeight()
//            .background(color = colorResource(id = R.color.grey))
//
//    ){
//        Box(
//            modifier = Modifier
//                .fillMaxWidth()
//                .fillMaxHeight()
//                .clip(shape = RoundedCornerShape(topStart = 100.dp))
//                .background(color = Color.White)
//
//        ){
//            Column(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .fillMaxHeight().padding(20.dp),
//                verticalArrangement = Arrangement.Top,
//                horizontalAlignment = Alignment.CenterHorizontally
//
//            ){
//
//
//
//                buildDivider(height = 8.dp)
//                Text("Please Sign in",style = TextStyle(color = Color.Black,fontSize = 24.sp,fontWeight = FontWeight.Bold),textAlign = TextAlign.Center,modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(start = 4.dp))
//
//
//                buildDivider(height = 30.dp)
//
//
//                OutlinedTextField(
//
//                    modifier = Modifier.fillMaxWidth().clip(shape = RoundedCornerShape( 10.dp)),
//
//                    value = "", onValueChange = {  },label = {Text("Email")},trailingIcon = {
//                        Icon(Icons.Outlined.Email, contentDescription = "Localized description")
//                    })
//
//                buildDivider(height = 8.dp)
//                OutlinedTextField(
//
//                    modifier = Modifier.fillMaxWidth().clip(shape = RoundedCornerShape( 10.dp)),
//
//
//
//                    value = "", onValueChange = {  },label = {Text("Password")},trailingIcon = {
//                        Icon(Icons.Default.Face, contentDescription = "Localized description")
//                    })
//                buildDivider(height = 16.dp)
//
//                Text("Forgot Password?",modifier = Modifier.fillMaxWidth(),textAlign = TextAlign.Center)
//
//
//                buildDivider(height = 16.dp)
//
//                Button(modifier = Modifier
//                    .fillMaxWidth()
//                    .height(40.dp)
//                    .clip(shape = RoundedCornerShape(20.dp))
//                    .background(color = Color.Cyan),
//                    onClick = {}
//
//                ){
//
//                    Text("Login",modifier = Modifier.fillMaxWidth().fillMaxHeight(),textAlign = TextAlign.Center)
//
//                }
//
//            }
//        }
//    }
//
//}
