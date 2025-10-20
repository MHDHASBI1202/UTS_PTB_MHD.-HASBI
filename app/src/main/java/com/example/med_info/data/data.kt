package com.example.med_info.data

import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.VolumeUp
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

val daftarFaktaMedis = listOf(
    "Fakta Medis: Ibuprofen lebih baik untuk nyeri otot daripada Paracetamol.",
    "Fakta Medis: Minum 8 gelas air putih per hari dapat meningkatkan konsentrasi.",
    "Fakta Medis: Gejala flu biasanya disebabkan oleh virus, jadi antibiotik tidak diperlukan.",
    "Fakta Medis: Tidur yang cukup (7-9 jam) sangat penting untuk sistem kekebalan tubuh.",
    "Fakta Medis: Berjemur di pagi hari membantu tubuh memproduksi Vitamin D.",
    "Fakta Medis: Olahraga teratur adalah anti-depresan alami terbaik.",
    "Fakta Medis: Mencuci tangan adalah cara paling efektif mencegah penyebaran infeksi.",
    "Fakta Medis: Stres kronis dapat melemahkan daya tahan tubuh Anda.",
    "Fakta Medis: Mengonsumsi makanan tinggi serat membantu menjaga kesehatan usus.",
    "Fakta Medis: Tekanan darah normal idealnya di bawah 120/80 mmHg.",
    "Fakta Medis: Kurangnya asupan zat besi dapat menyebabkan anemia dan kelelahan.",
    "Fakta Medis: Madu memiliki sifat antibakteri alami dan dapat meredakan batuk.",
    "Fakta Medis: Minyak ikan kaya akan Omega-3 yang baik untuk kesehatan jantung dan otak.",
    "Fakta Medis: Kuning telur adalah salah satu sumber terbaik Vitamin D alami.",
    "Fakta Medis: Diet tinggi garam dapat meningkatkan risiko tekanan darah tinggi.",
    "Fakta Medis: Tertawa dapat meningkatkan aliran darah dan meningkatkan fungsi kekebalan tubuh.",
    "Fakta Medis: Sakit punggung bawah seringkali dapat diobati dengan latihan ringan dan peregangan.",
    "Fakta Medis: Penggunaan ponsel sebelum tidur dapat mengganggu produksi melatonin.",
    "Fakta Medis: Vitamin C tidak secara langsung menyembuhkan pilek, tetapi membantu mempersingkat durasi.",
    "Fakta Medis: Minyak zaitun (extra virgin) memiliki sifat anti-inflamasi yang kuat.",
)

val daftarKeluhan = listOf(
    Keluhan(1, "Demam & Nyeri", Icons.Default.Sick),
    Keluhan(2, "Batuk & Pilek", Icons.Default.LocalHospital),
    Keluhan(3, "Maag & Asam Lambung", Icons.Default.LocalDrink),
    Keluhan(4, "Alergi Gatal", Icons.Default.CrisisAlert),
    Keluhan(5, "Sakit Gigi", Icons.Default.Healing),
    Keluhan(6, "Luka Luar", Icons.Default.LocalPharmacy),
    Keluhan(7, "Sakit Kepala Tegang", Icons.Default.Headset),
    Keluhan(8, "Diare", Icons.Default.BugReport),
    Keluhan(9, "Sembelit", Icons.Default.CloudQueue),
    Keluhan(10, "Keseleo/Memar", Icons.Default.Accessibility),
    Keluhan(11, "Mata Merah/Iritasi", Icons.Default.Visibility),
    Keluhan(12, "Jerawat", Icons.Default.Person),
    Keluhan(13, "Nyeri Haid", Icons.Default.Female),
    Keluhan(14, "Sakit Tenggorokan", Icons.AutoMirrored.Filled.VolumeUp),
    Keluhan(15, "Insomnia (Sulit Tidur)", Icons.Default.Bed),
    Keluhan(16, "Gatal Kulit (Non-Alergi)", Icons.Default.WbSunny),
    Keluhan(17, "Mual & Muntah", Icons.Default.Restaurant),
    Keluhan(18, "Tekanan Darah Tinggi", Icons.Default.MonitorHeart),
    Keluhan(19, "Kelelahan Kronis", Icons.Default.Timer),
    Keluhan(20, "Bau Badan", Icons.Default.Air)
)

val daftarObat = listOf(
    // KELUHAN ID 1: Demam & Nyeri
    Obat("Paracetamol (Generik)", 1, "Paracetamol 500mg", "Dosis dewasa: 1 tab setiap 4-6 jam.", "Paracetamol bekerja langsung di pusat pengatur suhu otak."),
    Obat("Ibuprofen", 1, "Ibuprofen", "Minum sesudah makan, untuk meredakan nyeri dan anti-inflamasi.", "Ibuprofen termasuk Non-Steroidal Anti-Inflammatory Drugs (NSAID)."),

    // KELUHAN ID 2: Batuk & Pilek
    Obat("Bodrex Flu & Batuk", 2, "Paracetamol, Dextromethorphan, dsb.", "Minum sesuai dosis, hati-hati mengantuk.", "Obat kombinasi sering mengandung antihistamin yang menyebabkan kantuk."),
    Obat("Actifed Kuning", 2, "Pseudoephedrine, Triprolidine", "Minum sesuai dosis untuk meredakan pilek.", "Pseudoephedrine adalah dekongestan yang mengecilkan pembuluh darah di hidung."),

    // KELUHAN ID 3: Maag & Asam Lambung
    Obat("Promag/Mylanta", 3, "Hydrotalcite, Mg(OH)2", "Kunyah 1-2 tablet saat nyeri muncul.", "Obat maag jenis antasida bekerja cepat tapi efeknya singkat."),
    Obat("Omeprazole (Generik)", 3, "Omeprazole", "Minum 1x sehari, 30 menit sebelum makan.", "PPI direkomendasikan untuk nyeri maag yang berulang dan kronis."),

    // KELUHAN ID 4: Alergi Gatal
    Obat("CTM", 4, "Chlorphenamine Maleate (CTM)", "Minum 1x sehari, hati-hati kantuk kuat.", "CTM adalah salah satu obat alergi tertua yang masih sering digunakan."),
    Obat("Loratadine (Generik)", 4, "Loratadine", "Minum 1 tablet sehari.", "Generasi kedua antihistamin minim efek samping mengantuk."),

    // KELUHAN ID 5: Sakit Gigi
    Obat("Asam Mefenamat", 5, "Asam Mefenamat", "Minum 1 tablet 3x sehari setelah makan.", "Obat ini termasuk NSAID dan harus digunakan dengan hati-hati pada pasien maag."),
    Obat("Eugenia Oil (Clove Oil)", 5, "Minyak Cengkeh", "Oleskan pada kapas, tempelkan pada gigi yang sakit.", "Minyak cengkeh mengandung eugenol, antiseptik dan anestesi alami."),

    // KELUHAN ID 6: Luka Luar
    Obat("Povidone-Iodine", 6, "Povidone-Iodine 10%", "Bersihkan luka dan oleskan antiseptik ini 2-3 kali sehari.", "Antiseptik ini efektif membunuh bakteri, jamur, dan virus pada luka."),
    Obat("Salep Bioplacenton", 6, "Ekstrak Plasenta, Neomycin Sulfate", "Dioleskan pada luka bakar ringan untuk membantu regenerasi kulit.", "Ekstrak plasenta berfungsi mempercepat penyembuhan dan mengurangi bekas luka."),

    // KELUHAN ID 7: Sakit Kepala Tegang
    Obat("Ibuprofen", 7, "Ibuprofen", "Minum sesuai dosis (1 tab), sesudah makan.", "NSAID sangat efektif untuk nyeri kepala yang disebabkan oleh ketegangan otot."),
    Obat("Paracetamol", 7, "Paracetamol 500mg", "Minum sesuai dosis (1 tab) saat sakit kepala.", "Tidak menyebabkan iritasi lambung, aman untuk sebagian besar orang."),

    // KELUHAN ID 8: Diare
    Obat("Oralit", 8, "Natrium Klorida, Kalium Klorida, Glukosa", "Larutkan, minum sesering mungkin setelah buang air besar cair.", "Dehidrasi adalah komplikasi utama diare, Oralit mencegahnya."),
    Obat("Loperamide", 8, "Loperamide", "Minum 2 tab diawal, lalu 1 tab setiap BAB. Max 6 tab/hari.", "Hanya untuk diare non-infeksi (bukan karena bakteri/kuman)."),

    // KELUHAN ID 9: Sembelit
    Obat("Dulcolax (Bisakodil)", 9, "Bisakodil", "Minum 1-2 tablet sebelum tidur.", "Jangan gunakan obat pencahar setiap hari, ubah pola makan tinggi serat."),
    Obat("Lactulosa Sirup", 9, "Lactulosa", "Minum sesuai dosis, biasanya 15-30ml per hari.", "Bekerja dengan melunakkan feses, bukan memaksa usus bergerak."),

    // KELUHAN ID 10: Keseleo/Memar
    Obat("Counterpain Cream", 10, "Methyl Salicylate, Eugenol", "Oleskan tipis-tipis pada area yang sakit, ulangi 3-4 kali sehari.", "Krim pereda nyeri bekerja lokal di kulit dan otot."),
    Obat("Kompres Dingin", 10, "Es/Air Dingin", "Kompres area yang memar segera selama 15-20 menit.", "Dingin membantu mengurangi pembengkakan dan mematikan rasa sakit awal."),

    // KELUHAN ID 11: Mata Merah/Iritasi
    Obat("Obat Tetes Mata Visine", 11, "Tetrahydrozoline HCl", "Teteskan 1-2 tetes pada mata yang sakit, 3-4 kali sehari.", "Obat tetes mata dekongestan menyempitkan pembuluh darah di mata."),
    Obat("Air Mata Buatan", 11, "CMC atau Hyaluronic Acid", "Teteskan 1-2 tetes sesuai kebutuhan untuk melembabkan.", "Produk ini menggantikan fungsi air mata alami tanpa efek samping kimia."),

    // KELUHAN ID 12: Jerawat
    Obat("Salep Benzoyl Peroxide", 12, "Benzoyl Peroxide 5%", "Oleskan tipis-tipis pada area jerawat, 1-2 kali sehari.", "Zat ini bekerja sebagai agen keratolitik dan antibakteri."),
    Obat("Salep Tretinoin (Resep)", 12, "Tretinoin", "Oleskan tipis-tipis saat malam hari, konsultasikan dengan dokter.", "Tretinoin adalah retinoid, turunan Vitamin A yang sangat kuat."),

    // KELUHAN ID 13: Nyeri Haid
    Obat("Ibuprofen", 13, "Ibuprofen", "Minum 1 tablet saat nyeri muncul, ulangi 3x sehari jika perlu.", "Seringkali lebih efektif daripada Paracetamol untuk nyeri yang berhubungan dengan kram."),
    Obat("Mefinal (Asam Mefenamat)", 13, "Asam Mefenamat", "Minum 1 tablet saat nyeri muncul, 3x sehari setelah makan.", "Hanya boleh diminum saat diperlukan dan tidak lebih dari 7 hari."),

    // KELUHAN ID 14: Sakit Tenggorokan
    Obat("Degirol Lozenges", 14, "Dequalinium Chloride", "Hisap 1 lozenges perlahan, ulangi setiap 3 jam.", "Antiseptik lokal membantu membunuh kuman di area tenggorokan."),
    Obat("Paracetamol", 14, "Paracetamol 500mg", "Minum 1 tablet setiap 4-6 jam jika nyeri terasa.", "Membantu mengurangi rasa sakit agar lebih nyaman menelan."),

    // KELUHAN ID 15: Insomnia (Sulit Tidur)
    Obat("Diphenhydramine (Antihistamin)", 15, "Diphenhydramine", "Minum 30 menit sebelum waktu tidur yang diinginkan.", "Obat tidur bebas yang memanfaatkan efek samping kantuk antihistamin."),
    Obat("Melatonin Supplement", 15, "Melatonin", "Minum 30-60 menit sebelum tidur, sesuai dosis anjuran.", "Paling efektif untuk jet lag atau kesulitan tidur karena pergeseran jam kerja."),

    // KELUHAN ID 16: Gatal Kulit (Non-Alergi)
    Obat("Salep Hydrocortisone", 16, "Hydrocortisone 1%", "Oleskan tipis-tipis 2-3 kali sehari di area gatal.", "Tidak boleh digunakan pada area luka terbuka atau jangka panjang."),
    Obat("Calamine Lotion", 16, "Calamine", "Oleskan pada kulit yang gatal atau terkena gigitan serangga.", "Calamine bekerja dengan memberikan sensasi dingin dan menenangkan kulit."),

    // KELUHAN ID 17: Mual & Muntah
    Obat("Antimo/Dramamine", 17, "Dimenhydrinate", "Minum 30 menit sebelum perjalanan, atau saat mual.", "Hati-hati, obat ini menyebabkan kantuk yang sangat kuat."),
    Obat("Air Jahe Hangat", 17, "Ekstrak Jahe", "Seduh 1 bungkus jahe instan dengan air hangat, minum perlahan.", "Jahe (Ginger) telah terbukti efektif mengurangi mual akibat kehamilan atau mabuk."),

    // KELUHAN ID 18: Tekanan Darah Tinggi
    Obat("Amlodipine (Resep)", 18, "Amlodipine 5mg", "Minum 1 tablet 1 kali sehari, sesuai resep dokter.", "Obat golongan Calcium Channel Blocker (CCB) untuk menurunkan tekanan darah."),
    Obat("Hidroklorotiazida (HCT) (Resep)", 18, "HCT", "Minum 1 tablet 1 kali sehari di pagi hari, sesuai resep dokter.", "Obat diuretik, membantu tubuh membuang kelebihan garam dan air."),

    // KELUHAN ID 19: Kelelahan Kronis
    Obat("Multivitamin B Complex", 19, "Vitamin B1, B6, B12", "Minum 1 tablet sehari setelah makan.", "Vitamin B sangat penting dalam konversi makanan menjadi energi."),
    Obat("Iron Supplement (Ferrous Sulfate)", 19, "Zat Besi", "Minum 1 tablet sehari saat perut kosong untuk penyerapan terbaik.", "Hanya minum setelah cek darah dan konsultasi dengan tenaga medis."),

    // KELUHAN ID 20: Bau Badan
    Obat("Antiperspirant (Deodoran)", 20, "Aluminium Chloride", "Oleskan tipis-tipis di ketiak setelah mandi.", "Antiperspirant bekerja dengan menyumbat kelenjar keringat sementara."),
    Obat("Sabun Antiseptik", 20, "Chlorhexidine", "Gunakan sebagai sabun mandi harian di seluruh tubuh.", "Bau badan disebabkan oleh bakteri yang memakan keringat.")
)