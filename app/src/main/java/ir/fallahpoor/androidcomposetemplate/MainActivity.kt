package ir.fallahpoor.androidcomposetemplate

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import ir.fallahpoor.androidcomposetemplate.theme.AndroidComposeTemplateTheme

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Content()
        }
    }

}

@Composable
private fun Content() {
    AndroidComposeTemplateTheme {
        TextField(value = "Hi there!", onValueChange = {})
    }
}

@Composable
@Preview
fun Preview() {
    Content()
}