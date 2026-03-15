package com.pajasoft.mhernandezfinanceapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pajasoft.mhernandezfinanceapp.models.Transaction
import com.pajasoft.mhernandezfinanceapp.ui.theme.MHernandezFinanceAppTheme


@Composable
fun Transactionitem(transaction: Transaction) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp, vertical = 12.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(45.dp)
                    .clip(CircleShape)
                    .background(Color.Black),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Icons.Default.ShoppingCart,
                    contentDescription = "icon",
                    tint = Color.White
                )
            }
            Column(
                modifier = Modifier
                    .padding(start = 12.dp)
            ) {
                Text(
                    text = transaction.name,
                    fontWeight = FontWeight.Bold,
                    fontSize = 15.sp
                )
                Text(
                    text = transaction.category,
                    color = Color.Gray,
                    fontSize = 13.sp
                )

            }

        }
        Column(
            horizontalAlignment = Alignment.End
        ) {
            Text(
                text = "$${transaction.amount}",
                fontWeight = FontWeight.Bold
            )
            Text(
                text = transaction.time,
                color = Color.Gray,
                fontSize = 12.sp
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewTransacciones(){
    val transaction = Transaction(
        name = "Supermarket",
        category = "Groceries",
        amount = 45.99,
        time = "11:20 AM"
    )
    MHernandezFinanceAppTheme() {
        Transactionitem(transaction)
    }
}