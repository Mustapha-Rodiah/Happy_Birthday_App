package com.example.haooybirthday.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.haooybirthday.R

@Composable
fun Greetings(value: String, sender: String, image: Painter, content: String){

  Box(modifier = Modifier
        .fillMaxSize(),
      contentAlignment = Alignment.Center
){
      Image(painter = image, contentDescription = content,
          modifier = Modifier.fillMaxSize(),
          contentScale = ContentScale.Crop,
          alpha = 0.5f)
       Text(text = value,
           textAlign = TextAlign.Center, style = TextStyle(color = colorResource(id = R.color.black),
           fontStyle = FontStyle.Italic,
           fontSize = 90.sp,
           fontWeight = FontWeight.Bold),
           lineHeight = 116.sp)
 Spacer(modifier = Modifier.height(30.dp))
        Text(text = sender,
            modifier = Modifier.align(Alignment.TopCenter).offset(x = 50.dp, y = 620.dp),
            style = TextStyle(color = colorResource(id = R.color.black),

            fontSize = 34.sp,
            fontWeight = FontWeight.Bold),
            lineHeight = 110.sp)
    }
    
}
@Preview
@Composable
fun GreetingsPreview(){
    Greetings(stringResource(id = R.string.celebrant), stringResource(id = R.string.sender),
        painterResource(
        id = R.drawable.birthday_image), stringResource(id = R.string.content)
    )
}