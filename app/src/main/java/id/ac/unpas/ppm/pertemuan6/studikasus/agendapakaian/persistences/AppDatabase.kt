package id.ac.unpas.ppm.pertemuan6.studikasus.agendapakaian.persistences

import androidx.room.Database
import androidx.room.RoomDatabase
import id.ac.unpas.ppm.pertemuan6.studikasus.agendapakaian.models.Pakaian

// Allfiandi Rahman
// 213040052
// Praktikum Pemrograman Mobile [Kelas A]
// Pertemuan 6 = Studi Kasus: Agenda Pakaian
// 15 Maret 2024

@Database(entities = [Pakaian::class], version = 1, exportSchema = false)
abstract class AppDatabase: RoomDatabase() {
    abstract fun pakaianDao(): PakaianDao

    companion object {
        const val DATABASE_NAME = "pakaian-database"
    }
}