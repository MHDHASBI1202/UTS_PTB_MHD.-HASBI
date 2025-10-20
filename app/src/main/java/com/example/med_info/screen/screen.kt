package com.example.med_info.screen

import androidx.compose.animation.core.animateFloatAsState // Tambah Import
import androidx.compose.foundation.LocalIndication
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource // Tambah Import
import androidx.compose.foundation.interaction.collectIsPressedAsState // Tambah Import
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale // Tambah Import
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.med_info.data.Keluhan
import com.example.med_info.data.Obat
import com.example.med_info.data.daftarKeluhan
import com.example.med_info.data.daftarObat
import androidx.compose.material.icons.filled.Info
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.remember
import kotlinx.coroutines.launch

@Composable
fun KeluhanItem(keluhan: Keluhan, onClick: () -> Unit) {
    // Implementasi Animasi Press (Scale Animation)
    val interactionSource = remember { MutableInteractionSource() }
    val isPressed = interactionSource.collectIsPressedAsState().value
    val scale = animateFloatAsState(if (isPressed) 0.96f else 1f, label = "scale_animation").value

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp)
            .scale(scale) // Terapkan Scale Animation saat ditekan
            .clickable(
                onClick = onClick,
                interactionSource = interactionSource,
                indication = LocalIndication.current // Biarkan ripple bawaan tetap ada
            ),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
    ) {
        Row(
            modifier = Modifier.padding(20.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = keluhan.ikon,
                contentDescription = keluhan.nama,
                tint = MaterialTheme.colorScheme.primary,
                modifier = Modifier.size(32.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Text(
                text = keluhan.nama,
                style = MaterialTheme.typography.titleMedium,
                color = MaterialTheme.colorScheme.onSurface
            )
        }
    }
}

@Composable
fun ObatItem(obat: Obat) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 6.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
    ) {
        Column(modifier = Modifier.padding(20.dp)) {
            // NAMA PRODUK (Mudah dipahami pasien)
            Text(
                text = obat.namaProduk,
                style = MaterialTheme.typography.titleLarge,
                color = MaterialTheme.colorScheme.primary
            )
            Spacer(modifier = Modifier.height(4.dp))

            // KANDUNGAN UTAMA (Informasi Apoteker)
            Text(
                text = "Kandungan: ${obat.kandunganUtama}",
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
            HorizontalDivider(
                modifier = Modifier.padding(vertical = 8.dp),
                thickness = DividerDefaults.Thickness,
                color = DividerDefaults.color
            )

            // FAKTA MENARIK
            Text(
                text = "💡 Fakta: ${obat.faktaMenarik}",
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.secondary
            )
            Spacer(modifier = Modifier.height(8.dp))

            // DESKRIPSI SINGKAT
            Text(
                text = "Aturan Pakai: ${obat.deskripsiSingkat}",
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(navController: NavController) {
    // 1. Deklarasi State untuk Snackbar
    val scope = rememberCoroutineScope()
    val snackbarHostState = remember { SnackbarHostState() }

    // ... data dummy bisa diletakkan di sini atau di Data.kt

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        text = "Med-Info", // Judul Aplikasi
                        style = MaterialTheme.typography.headlineSmall,
                        color = MaterialTheme.colorScheme.onPrimary // Warna teks sesuai tema
                    )
                },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary // Warna background Top Bar
                )
            )
        },
        // 2. Tambahkan Snackbar Host
        snackbarHost = { SnackbarHost(snackbarHostState) },

        // 3. Tambahkan Floating Action Button (FAB)
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    // Tampilkan Snackbar saat FAB diklik
                    scope.launch {
                        snackbarHostState.showSnackbar(
                            message = "Aplikasi Med-Info v1.0, Dibuat dengan Jetpack Compose.",
                            actionLabel = "Tutup",
                            duration = SnackbarDuration.Short
                        )
                    }
                },
                containerColor = MaterialTheme.colorScheme.secondary,
                contentColor = MaterialTheme.colorScheme.onSecondary
            ) {
                Icon(Icons.Filled.Info, contentDescription = "Info Aplikasi")
            }
        }
    ) { padding ->
        LazyColumn( // <<< Menampilkan Daftar Data menggunakan LazyColumn
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .background(MaterialTheme.colorScheme.background)
        ) {
            item {
                // Banner/Header Fakta Medis
                Text(
                    text = "Fakta Medis Hari Ini: Ibuprofen lebih baik untuk nyeri otot daripada Paracetamol!",
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                        .background(MaterialTheme.colorScheme.secondary.copy(alpha = 0.1f), shape = MaterialTheme.shapes.small)
                        .padding(8.dp)
                )
            }
            items(daftarKeluhan) { keluhan ->
                KeluhanItem(keluhan = keluhan) {
                    // <<< Navigasi Antar Layar & Pengiriman Data
                    navController.navigate("detail/${keluhan.id}")
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailScreen(navController: NavController, keluhanId: Int) {
    // 1. Filter Data Berdasarkan ID yang Diterima
    val keluhan = daftarKeluhan.find { it.id == keluhanId }
    val obatList = daftarObat.filter { it.keluhanId == keluhanId }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(keluhan?.nama ?: "Detail", color = MaterialTheme.colorScheme.onPrimary) },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) { // Tombol Kembali
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Kembali", tint = MaterialTheme.colorScheme.onPrimary)
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = MaterialTheme.colorScheme.primary)
            )
        }
    ) { padding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .background(MaterialTheme.colorScheme.background)
        ) {
            item {
                Text(
                    text = "Rekomendasi Obat untuk ${keluhan?.nama ?: ""}:",
                    style = MaterialTheme.typography.headlineSmall,
                    modifier = Modifier.padding(16.dp)
                )
            }
            items(obatList) { obat ->
                ObatItem(obat)
            }
        }
    }
}