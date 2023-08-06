package com.example.sample.modifierdemo

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sample.modifierdemo.ui.theme.ModifierDemoTheme

@Composable
fun ModifierOrderDemoScreen() {
    Column(modifier = Modifier.scrollable(state = rememberScrollState(), orientation = Orientation.Horizontal,enabled = true)) {
        val modifier = Modifier.background(Color.Red)
        // 배경 빨간색 지정

        // size -> padding -> background(배경 파란색 설정) -> border(테두리 초록색 설정)
        Box(modifier = modifier
            .size(200.dp)
            .padding(50.dp)
            .background(Color.Blue) //패딩이 적용된 부분의 배경을 파란색으로 변경
            .border(10.dp, Color.Green)
        )

        Spacer(modifier = Modifier.height(20.dp))

        // border(테두리 초록색 설정) -> padding -> background(배경 파란색 설정) -> size
        Box(modifier = modifier
            .border(10.dp, Color.Green)
            .padding(50.dp)
            .background(Color.Blue) // 패딩이 적용된 부분의 배경을 파란색으로 변경
            .size(200.dp)
        )

        Spacer(modifier = Modifier.height(50.dp))

        val firstModifier = Modifier.height(100.dp)
        val secondModifier = Modifier.padding(20.dp)
        val thirdModifier = Modifier.background(Color.Blue)

        // firstModifier + secondModifier + thirdModifier
        val combinedModifier = firstModifier
            .then(secondModifier)
            .then(thirdModifier)

        Text(
            text = "Hello",
            color = Color.White,
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            modifier = combinedModifier
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DemoScreenPreview() {
    ModifierDemoTheme {
        ModifierOrderDemoScreen()
    }
}
