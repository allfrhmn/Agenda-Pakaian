package id.ac.unpas.ppm.pertemuan6.studikasus.agendapakaian.persistences

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import id.ac.unpas.ppm.pertemuan6.studikasus.agendapakaian.models.Pakaian

// Allfiandi Rahman
// 213040052
// Praktikum Pemrograman Mobile [Kelas A]
// Pertemuan 6 = Studi Kasus: Agenda Pakaian
// 15 Maret 2024

@Dao
interface PakaianDao {
    @Query("select * from pakaian")
    fun loadAll(): LiveData<List<Pakaian>>

    @Query("select * from pakaian where id = :id")
    fun load(id: String): LiveData<Pakaian>

    @Query("select * from pakaian where id = :id")
    suspend fun getById(id: String): Pakaian

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(vararg items: Pakaian)

    @Query("delete from pakaian where id = :id")
    suspend fun delete(id: String)

    @Delete
    suspend fun delete(item: Pakaian)
}