package com.example.teste

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.teste.ui.theme.TesteTheme

class MainActivity : ComponentActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}

@Composable
fun MainScreen(){
    TesteTheme {
        //Organizar os elementos em colunas:
        Column(modifier = Modifier.fillMaxSize().background(color = Color(0XFF6650A4))) {
            MinhaSaudacao(
                nome = "Sabadou",
                adjetivoNome = "A vida é boa",
                modificador = Modifier
                    .border(
                        border = BorderStroke(
                            width = 2.dp,
                            brush = Brush.horizontalGradient(
                                colors = listOf(Color.Red, Color.Blue)
                            )
                        ),
                    shape = MaterialTheme.shapes.medium
                )
                .padding(16.dp))


            MinhaSaudacao(
                nome = "Sabadou",
                adjetivoNome = "A vida é boa",
                modificador = Modifier
                    .border(
                        border = BorderStroke(
                            width = 6.dp,
                            brush = Brush.horizontalGradient(
                                colors = listOf(Color.Red, Color.Blue)
                            )
                        ),
                    shape = MaterialTheme.shapes.medium
                    )
                    .padding(16.dp))

            Greeting("Mariane")
        }
    }
}

@Composable
fun MinhaSaudacao(
    nome :String = "World",
    adjetivoNome :String,
    modificador : Modifier){
    Text(text = "$nome $adjetivoNome", modifier = modificador)
}

@Composable
fun Greeting(name: String, modificador: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modificador
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MainScreen()

}