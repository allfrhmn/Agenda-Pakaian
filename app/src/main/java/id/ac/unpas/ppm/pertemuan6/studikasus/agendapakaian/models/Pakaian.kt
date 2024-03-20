package id.ac.unpas.ppm.pertemuan6.studikasus.agendapakaian.models

import androidx.room.Entity
import androidx.room.PrimaryKey

// Allfiandi Rahman
// 213040052
// Praktikum Pemrograman Mobile [Kelas A]
// Pertemuan 6 = Studi Kasus: Agenda Pakaian
// 15 Maret 2024

@Entity
data class Pakaian(
    @PrimaryKey
    val id: String,
    val jenis: String,
    val ukuran: String,
    val warna: String,
    val tanggal: String
)
