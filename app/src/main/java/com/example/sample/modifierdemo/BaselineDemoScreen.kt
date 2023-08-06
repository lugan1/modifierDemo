package com.example.sample.modifierdemo

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.paddingFrom
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.FirstBaseline
import androidx.compose.ui.layout.LastBaseline
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BaselineDemoScreen() {
    Row {
        Text(
            modifier = Modifier.alignBy(alignmentLine = LastBaseline),
            text = "Large\nMore",
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.width(10.dp))

        Text(
            modifier = Modifier.paddingFrom(
                alignmentLine = FirstBaseline,
                before = 80.dp,
                after = 0.dp
            ),
            text = "Small",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold
        )
    }
}

@Preview
@Composable
fun BaselineDemoScreenPreview() {
    BaselineDemoScreen()
}
