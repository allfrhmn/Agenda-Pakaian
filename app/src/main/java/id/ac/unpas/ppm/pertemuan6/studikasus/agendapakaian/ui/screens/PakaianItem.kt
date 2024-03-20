package id.ac.unpas.ppm.pertemuan6.studikasus.agendapakaian.ui.screens

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import id.ac.unpas.ppm.pertemuan6.studikasus.agendapakaian.models.Pakaian

// Allfiandi Rahman
// 213040052
// Praktikum Pemrograman Mobile [Kelas A]
// Pertemuan 6 = Studi Kasus: Agenda Pakaian
// 15 Maret 2024

@Composable
fun PakaianItem(item: Pakaian) {
    Row {
        Text(modifier = Modifier.weight(3f), text = item.jenis)
        Text(modifier = Modifier.weight(3f), text = item.ukuran)
        Text(modifier = Modifier.weight(3f), text = item.warna)
        Text(modifier = Modifier.weight(3f), text = item.tanggal)
    }
}