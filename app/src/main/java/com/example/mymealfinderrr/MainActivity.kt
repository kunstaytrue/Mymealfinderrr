package com.example.mymealfinderrr

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mymealfinderrr.ui.theme.MymealfinderrrTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var time_of_day by remember {
                mutableStateOf("morning ")
            }
            
            var your_meal by remember {
                mutableStateOf("eggs")
            }
            
            Column {
                Text(text = "MyMealFinderr")

                OutlinedTextField(
                    value = time_of_day, 
                    onValueChange ={text->
                         time_of_day = text  
                    },
                    placeholder = {
                        Text(text = "Enter the time of day")
                    }
                )

                Row {
                    Button(onClick = {
                        time_of_day =""
                        your_meal =""
                    }) {
                        Text(text = "Look for my meal")
                    }
                    Button(onClick = { /*TODO*/ }) {
                        Text(text = "Refresh")
                    }
                }

                Text(text = "Meal of the day for $time_of_day is:")
                Text(text = your_meal)
            }
        }
    }
}

