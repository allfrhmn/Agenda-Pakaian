package id.ac.unpas.ppm.pertemuan6.studikasus.agendapakaian.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import com.benasher44.uuid.uuid4
import id.ac.unpas.ppm.pertemuan6.studikasus.agendapakaian.models.Pakaian
import id.ac.unpas.ppm.pertemuan6.studikasus.agendapakaian.persistences.PakaianDao
import kotlinx.coroutines.launch

// Allfiandi Rahman
// 213040052
// Praktikum Pemrograman Mobile [Kelas A]
// Pertemuan 6 = Studi Kasus: Agenda Pakaian
// 15 Maret 2024

@Composable
fun FormPakaianScreen(pakaianDao: PakaianDao) {

    val scope = rememberCoroutineScope()

    val jenis = remember { mutableStateOf(TextFieldValue("")) }
    val ukuran = remember { mutableStateOf(TextFieldValue("")) }
    val warna = remember { mutableStateOf(TextFieldValue("")) }
    val tanggal = remember { mutableStateOf(TextFieldValue("")) }

    Column(modifier = Modifier
        .padding(10.dp)
        .fillMaxWidth()) {
        OutlinedTextField(
            label = {Text(text = "Jenis")},
            modifier = Modifier.fillMaxWidth(),
            value = jenis.value,
            onValueChange = {
                jenis.value = it
            }
        )

        OutlinedTextField(
            label = {Text(text = "Ukuran")},
            modifier = Modifier.fillMaxWidth(),
            value = ukuran.value,
            onValueChange = {
                ukuran.value = it
            }
        )

        OutlinedTextField(
            label = {Text(text = "Warna")},
            modifier = Modifier.fillMaxWidth(),
            value = warna.value,
            onValueChange = {
                warna.value = it
            }
        )

        OutlinedTextField(
            label = {Text(text = "Tanggal")},
            modifier = Modifier.fillMaxWidth(),
            value = tanggal.value,
            onValueChange = {
                tanggal.value = it
            }
        )

        Row {
            Button(modifier = Modifier.weight(5f), onClick = {
                // simpan ke database
                val item = Pakaian(uuid4().toString(), jenis.value.text, ukuran.value.text, warna.value.text, tanggal.value.text)
                scope.launch {
                    pakaianDao.upsert(item)
                }
                jenis.value = TextFieldValue("")
                ukuran.value = TextFieldValue("")
                warna.value = TextFieldValue("")
                tanggal.value = TextFieldValue("")
            }) {
                Text(text = "Simpan")
            }

            Button(modifier = Modifier.weight(5f), onClick = {
                // kembali ke halaman sebelumnya
                jenis.value = TextFieldValue("")
                ukuran.value = TextFieldValue("")
                warna.value = TextFieldValue("")
                tanggal.value = TextFieldValue("")
            }) {
                Text(text = "Batal")
            }
        }
    }
}