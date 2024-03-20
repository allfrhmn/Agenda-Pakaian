package id.ac.unpas.ppm.pertemuan6.studikasus.agendapakaian.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.lifecycle.LiveData
import id.ac.unpas.ppm.pertemuan6.studikasus.agendapakaian.models.Pakaian
import id.ac.unpas.ppm.pertemuan6.studikasus.agendapakaian.persistences.PakaianDao

// Allfiandi Rahman
// 213040052
// Praktikum Pemrograman Mobile [Kelas A]
// Pertemuan 6 = Studi Kasus: Agenda Pakaian
// 15 Maret 2024

@Composable
fun ListPakaianScreen(pakaianDao: PakaianDao) {

    val _list: LiveData<List<Pakaian>> = pakaianDao.loadAll()
    val list: List<Pakaian> by _list.observeAsState(listOf())

    Column(modifier = Modifier.fillMaxWidth()) {
        LazyColumn(modifier = Modifier.fillMaxWidth()) {
            items(list.size) { index ->
                val item = list[index]
                PakaianItem(item)
            }
        }
    }
}