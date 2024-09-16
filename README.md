# **TUGAS TM 1 PBO (INHERITANCE)**
___
##  **_Deskripsi_**
Proyek ini adalah tugas dari mata kuliah Pemrograman Berorientasi Objek (PBO) yang membahas konsep pewarisan sifat dalam pemrograman berorientasi objek. Proyek ini mengimplementasikan studi kasus makhluk hidup, termasuk hewan dan tumbuhan, serta menunjukkan bagaimana memanggil metode dari kelas induk dan kelas turunan.
___
## **Informasi Tambahan**
**Inheritance** (pewarisan) merupakan salah satu konsep dasar dalam pemrograman berorientasi objek (OOP) yang memungkinkan sebuah kelas (subclass atau kelas anak) untuk mewarisi atribut dan metode dari kelas lain (superclass atau kelas induk). Dengan inheritance, kita dapat menciptakan hierarki kelas yang dapat memperluas atau memodifikasi perilaku kelas induk tanpa harus menulis ulang kode.
___
## **Tujuan Pembelajaran**
- Memahami konsep pewarisan sifat dalam OOP.
- Mengimplementasikan metode dari kelas induk dalam kelas turunan.
- Menggunakan atribut dan metode yang berbeda untuk menggambarkan spesifikasi makhluk hidup.

## **Spesifikasi Project**
- **Menampilkan informasi dasar** tentang berbagai makhluk hidup seperti hewan dan tumbuhan.
- **Memanggil metode** dari kelas induk, seperti `bernafas()` dan `tumbuh()`, dari kelas turunan.
- **Menggunakan setter dan getter** untuk mengelola atribut spesifik setiap jenis makhluk hidup.

## **Struktur Kelas**
- **Utama**: Kelas utama yang menjalankan aplikasi dan menampilkan informasi tentang makhluk hidup.
- **MakhlukHidup**: Kelas dasar yang mendefinisikan metode umum untuk semua makhluk hidup.
- **Hewan**: Kelas turunan dari `MakhlukHidup` yang menambahkan atribut dan metode spesifik untuk hewan.
- **Tumbuhan**: Kelas turunan dari `MakhlukHidup` yang menambahkan atribut dan metode spesifik untuk tumbuhan.
- **Aves, Amphibi, Pisces, Reptil, Mamalia**: Kelas turunan dari `Hewan` yang mendefinisikan karakteristik spesifik untuk jenis hewan tertentu.
- **Dikotil, Monokotil**: Kelas turunan dari `Tumbuhan` yang mendefinisikan karakteristik spesifik untuk jenis tumbuhan tertentu.
