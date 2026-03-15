package com.pajasoft.mhernandezfinanceapp.components

import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pajasoft.mhernandezfinanceapp.models.Cards
import com.pajasoft.mhernandezfinanceapp.models.Transaction
import com.pajasoft.mhernandezfinanceapp.models.User
import com.pajasoft.mhernandezfinanceapp.ui.theme.BackgroundColor
import com.pajasoft.mhernandezfinanceapp.ui.theme.Beige
import com.pajasoft.mhernandezfinanceapp.ui.theme.Blue
import com.pajasoft.mhernandezfinanceapp.ui.theme.Green

@Composable
fun Homescreen(){
    val user = User(nombre = "Montserrat", saldo = 3500.00)
    val tarjetas = listOf(
        Cards(
            title = "Actividad",
            amount = 0.0,
            bgcolor = Green,
        ),
        Cards(
            title = "Ventas",
            amount = 280.99,
            bgcolor = Beige,
        ),
        Cards(
            title = "Ganancias",
            amount = 280.99,
            bgcolor = Blue,
        )
    )
    val transaccion = listOf(
        Transaction(
            name = "Supermarket",
            category = "Groceries",
            amount = 45.99,
            time = "10:30 AM"
        ),
        Transaction(
            name = "Gas Station",
            category =  "Fuel",
            amount = -30.50,
            time = "12:15 PM"
        ),
        Transaction(
            name = "Coffee Shop",
            category = "Food and Drinks",
            amount = 5.75,
            time = "8:00 AM"
        ),
        Transaction(
            name = "Electronics Store",
            category = "Electronics",
            amount = -120.00,
            time = "3:45 PM"
        ),
        Transaction(
            name = "Bookstore",
            category = "Books",
            amount = 22.50,
            time = "11:00 AM"
        ),
        Transaction(
            name = "Restaurant",
            category = "Dining",
            amount = 68.30,
            time = "7:30 PM"
        ),
        Transaction(
            name = "Supermarket",
            category = "Groceries",
            amount = 45.99,
            time = "10:30 AM"
        ),
        Transaction(
            name = "Gas Station",
            category =  "Fuel",
            amount = -30.50,
            time = "12:15 PM"
        ),
        Transaction(
            name = "Coffee Shop",
            category = "Food and Drinks",
            amount = 5.75,
            time = "8:00 AM"
        ),
        Transaction(
            name = "Electronics Store",
            category = "Electronics",
            amount = -120.00,
            time = "3:45 PM"
        ),
        Transaction(
            name = "Bookstore",
            category = "Books",
            amount = 22.50,
            time = "11:00 AM"
        ),
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(BackgroundColor)
    ) {
        Encabezado(user)
        Spacer(
            modifier = Modifier
                .height(8.dp)
        )
        CardsSection(
            card = tarjetas
        )
        Spacer(
            modifier = Modifier
                .height(24.dp)
        )
        Column(
            modifier = Modifier
                .weight(1f)
        ){
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Transactions",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "See All",
                    color = Color.Gray
                )
            }
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize(),
                contentPadding = PaddingValues(bottom = 16.dp)
            ) {
                items(transaccion) { item ->
                    Transactionitem(item)
                }
            }
        }
    }
}