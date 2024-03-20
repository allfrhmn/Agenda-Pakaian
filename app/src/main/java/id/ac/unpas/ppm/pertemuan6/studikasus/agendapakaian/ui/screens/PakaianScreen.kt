package id.ac.unpas.ppm.pertemuan6.studikasus.agendapakaian.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.room.Room
import id.ac.unpas.ppm.pertemuan6.studikasus.agendapakaian.persistences.AppDatabase


@Composable
fun PakaianScreen() {
    val context = LocalContext.current

    val db = Room.databaseBuilder(context, AppDatabase::class.java, AppDatabase.DATABASE_NAME).build()
    val pakaianDao = db.pakaianDao()

    Column(modifier = Modifier.padding(10.dp).fillMaxWidth()) {
        FormPakaianScreen(pakaianDao)

        ListPakaianScreen(pakaianDao)
    }
}