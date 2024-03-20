package id.ac.unpas.ppm.pertemuan6.studikasus.agendapakaian

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import id.ac.unpas.ppm.pertemuan6.studikasus.agendapakaian.ui.screens.PakaianScreen
import id.ac.unpas.ppm.pertemuan6.studikasus.agendapakaian.ui.theme.AgendaPakaianTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AgendaPakaianTheme {
                // A surface container using the 'background' color from the theme
                PakaianScreen()
            }
        }
    }
}