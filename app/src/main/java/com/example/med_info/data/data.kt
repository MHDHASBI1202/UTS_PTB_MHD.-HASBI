package com.example.med_info.data

import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*

data class Keluhan(
    val id: Int,
    val nama: String,
    val ikon: ImageVector
)

data class Obat(
    val namaProduk: String,
    val keluhanId: Int,
    val kandunganUtama: String,
    val deskripsiSingkat: String,
    val faktaMenarik: String
)

val daftarKeluhan = listOf(
    Keluhan(1, "Demam & Nyeri", Icons.Default.Sick),
    Keluhan(2, "Batuk & Pilek", Icons.Default.LocalHospital),
    Keluhan(3, "Maag & Asam Lambung", Icons.Default.LocalDrink),
    Keluhan(4, "Alergi Gatal", Icons.Default.CrisisAlert)
)

val daftarObat = listOf(
    // KELUHAN ID 1: Demam & Nyeri
    Obat("Paracetamol (Generik)", 1, "Paracetamol 500mg", "Obat demam dan nyeri paling aman. Dosis dewasa: 1 tab setiap 4-6 jam.", "Paracetamol bekerja langsung di pusat pengatur suhu otak."),
    Obat("Ibuprofen", 1, "Ibuprofen", "Pereda nyeri yang juga memiliki efek anti-inflamasi. Minum sesudah makan.", "Ibuprofen termasuk Non-Steroidal Anti-Inflammatory Drugs (NSAID)."),

    // KELUHAN ID 2: Batuk & Pilek
    Obat("Bodrex Flu & Batuk", 2, "Paracetamol, Dextromethorphan, dsb.", "Mengatasi gejala flu dan batuk tidak berdahak. Hati-hati mengantuk.", "Obat kombinasi sering mengandung antihistamin yang menyebabkan kantuk."),
    Obat("Actifed Kuning", 2, "Pseudoephedrine, Triprolidine", "Spesialis hidung tersumbat. Efektif meredakan pilek.", "Pseudoephedrine adalah dekongestan yang mengecilkan pembuluh darah di hidung."),

    // KELUHAN ID 3: Maag & Asam Lambung
    Obat("Promag/Mylanta", 3, "Hydrotalcite, Mg(OH)2", "Antasida, menetralkan asam lambung. Kunyah saat nyeri.", "Obat maag jenis antasida bekerja cepat tapi efeknya singkat."),
    Obat("Omeprazole (Generik)", 3, "Omeprazole", "Penghambat Pompa Proton (PPI). Mengurangi produksi asam jangka panjang.", "PPI direkomendasikan untuk nyeri maag yang berulang dan kronis."),

    // KELUHAN ID 4: Alergi Gatal
    Obat("CTM", 4, "Chlorphenamine Maleate (CTM)", "Antihistamin generasi pertama. Sangat efektif untuk gatal, menyebabkan kantuk kuat.", "CTM adalah salah satu obat alergi tertua yang masih sering digunakan."),
    Obat("Loratadine (Generik)", 4, "Loratadine", "Antihistamin non-sedatif. Tidak menyebabkan kantuk. 1 tab sehari.", "Generasi kedua antihistamin minim efek samping mengantuk.")
)