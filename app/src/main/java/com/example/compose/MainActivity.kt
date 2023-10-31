package com.example.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainPage()
        }
    }
}

//@Preview(showSystemUi = true)
//@Composable
//fun Task3(){
//    Column(
//        modifier = Modifier
//            .fillMaxSize(),
//        verticalArrangement = Arrangement.SpaceBetween
//    ){
//        Row(
//            modifier = Modifier
//                .fillMaxWidth(),
//            horizontalArrangement = Arrangement.End
//        ){
//            LetterText("A")
//            LetterText("B")
//            LetterText("C")
//        }
//        Row(
//            modifier = Modifier
//                .fillMaxWidth(),
//            horizontalArrangement = Arrangement.SpaceEvenly
//        ){
//            LetterText("C")
//            LetterText("A")
//            LetterText("B")
//        }
//        Row(
//            modifier = Modifier
//                .fillMaxWidth(),
//            horizontalArrangement = Arrangement.SpaceBetween,
//        ){
//            LetterText("A")
//            LetterText("B")
//            LetterText("C")
//        }
//    }
//}
//@Composable
//fun LetterText(letter:String){
//    Text(
//        letter,
//        style = TextStyle(
//            fontSize=30 sp,
//            fontWeight = FontWeight.Bold
//        )
//    )
//}

//@Preview(showBackground = true)
//@Composable
//fun Preview(){
//    Text(
//        text="Hello",
//        fontFamily = FontFamily(Font(R.font.dancing)),
//        fontSize=30.sp
//    )
//}

//@Preview
//@Composable
//fun DefaultPreview(){
//    Text(
//        buildAnnotatedString {
//            withStyle(
//                SpanStyle(
//                    color= Color.Green,
//                    fontFamily= FontFamily((Font(R.font.dancing)))
//                )
//            ){
//                append("H")
//            }
//            withStyle(
//                SpanStyle(
//                    color= Color.Yellow,
//                    fontSize = 30.sp
//                )
//            ){
//                append("ello")
//            }
//        }
//    )
//}






