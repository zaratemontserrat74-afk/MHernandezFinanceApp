package com.pajasoft.mhernandezfinanceapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.key.Key.Companion.Home
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pajasoft.mhernandezfinanceapp.components.Homescreen
import com.pajasoft.mhernandezfinanceapp.ui.theme.MHernandezFinanceAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MHernandezFinanceAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Homescreen(innerPadding)
                }
            }
        }
    }
}

@Composable
fun Homescreen(innerPadding: PaddingValues) {
    Box(
        modifier = Modifier
        .padding(innerPadding)){
            Homescreen()
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MHernandezFinanceAppTheme {
        Homescreen(innerPadding = PaddingValues(top = 0.dp))
    }
}
