package com.example.sample.modifierdemo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.FirstBaseline
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
        Text(modifier = modifier.align(alignment = Alignment.CenterHorizontally).weight(weight = 0.5f, fill = true), text = "Hello")
        Text(modifier = modifier.align(alignment = Alignment.Start).weight(weight = 0.3f, fill = false), text = "Hello")
        Text(modifier = modifier.align(alignment = Alignment.End).weight(0.2f, fill = true), text = "Hello")
    }
}

@Composable
fun RowComposable() {
    val modifier = Modifier.background(Color.LightGray)

    Row(modifier = Modifier.height(200.dp).width(200.dp)) {
        Text(modifier = modifier.align(alignment = Alignment.CenterVertically).weight(0.5f), text = "Hello")
        Text(modifier = modifier.align(alignment = Alignment.Top).weight(0.3f), text = "Hello")
        Text(modifier = modifier.align(alignment = Alignment.Bottom).weight(0.2f), text = "Hello")
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
