package com.example.sample.modifierdemo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun AlignmentDemoScreen() {
    ColumnComposable()
}

@Composable
fun ColumnComposable() {
    val modifier = Modifier.background(Color.LightGray)

    Column(modifier = Modifier.height(200.dp).width(200.dp)) {
        Text(modifier = modifier.align(alignment = Alignment.CenterHorizontally), text = "Hello")
        Text(modifier = modifier.align(alignment = Alignment.Start), text = "Hello")
        Text(modifier = modifier.align(alignment = Alignment.End), text = "Hello")
    }
}

@Composable
fun RowComposable() {
    val modifier = Modifier.background(Color.LightGray)

    Row(modifier = Modifier.height(200.dp).width(200.dp)) {
        Text(modifier = modifier.align(alignment = Alignment.CenterVertically), text = "Hello")
        Text(modifier = modifier.align(alignment = Alignment.Top), text = "Hello")
        Text(modifier = modifier.align(alignment = Alignment.Bottom), text = "Hello")
    }
}

@Composable
fun BoxComposable() {
    val modifier = Modifier.background(Color.LightGray)

    Box(modifier = Modifier.height(200.dp).width(200.dp)) {
        Text(modifier = modifier.align(alignment = Alignment.Center), text = "Hello")
        Text(modifier = modifier.align(alignment = Alignment.TopCenter), text = "Hello")
        Text(modifier = modifier.align(alignment = Alignment.BottomEnd), text = "Hello")
    }
}

@Preview
@Composable
fun ColumnComposablePreview() {
    ColumnComposable()
}

@Preview
@Composable
fun RowComposablePreview() {
    RowComposable()
}


@Preview
@Composable
fun BoxComposablePreview() {
    BoxComposable()
}
