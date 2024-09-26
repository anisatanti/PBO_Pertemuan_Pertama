# **TUGAS TM 1 PBO (INHERITANCE)**
___
## **Daftar Isi**

- [Utama](https://github.com/anisatanti/PBO_Pertemuan_Pertama/blob/main/Utama.java)
- [MakhlukHidup](https://github.com/anisatanti/PBO_Pertemuan_Pertama/blob/main/MakhlukHidup.java)
- [Hewan](https://github.com/anisatanti/PBO_Pertemuan_Pertama/blob/main/Hewan.java)
- [Tumbuhan](https://github.com/anisatanti/PBO_Pertemuan_Pertama/blob/main/Tumbuhan.java)
- [Aves](https://github.com/anisatanti/PBO_Pertemuan_Pertama/blob/main/Aves.java)
- [Amphibi](https://github.com/anisatanti/PBO_Pertemuan_Pertama/blob/main/Amphibi.java)
- [Pisces](https://github.com/anisatanti/PBO_Pertemuan_Pertama/blob/main/Pisces.java)
- [Reptil](https://github.com/anisatanti/PBO_Pertemuan_Pertama/blob/main/Reptil.java)
- [Mamalia](https://github.com/anisatanti/PBO_Pertemuan_Pertama/blob/main/Mamalia.java)
- [Dikotil](https://github.com/anisatanti/PBO_Pertemuan_Pertama/blob/main/Dikotil.java)
- [Monokotil](https://github.com/anisatanti/PBO_Pertemuan_Pertama/blob/main/Monokotil.java)

##  **_Deskripsi_**
Proyek ini adalah tugas dari mata kuliah Pemrograman Berorientasi Objek (PBO) yang membahas konsep pewarisan sifat dalam pemrograman berorientasi objek. Proyek ini mengimplementasikan studi kasus makhluk hidup, termasuk hewan dan tumbuhan, serta menunjukkan bagaimana memanggil metode dari kelas induk dan kelas turunan.
___
## **Informasi Tambahan**
**Inheritance** (pewarisan) merupakan salah satu konsep dasar dalam pemrograman berorientasi objek (OOP) yang memungkinkan sebuah kelas (subclass atau kelas anak) untuk mewarisi atribut dan metode dari kelas lain (superclass atau kelas induk). Dengan pewarisan, kita dapat memperluas atau memodifikasi perilaku (method) kelas induk tanpa harus menulis ulang kode.
___
## **Spesifikasi Proyek**
- **Menampilkan informasi dasar** tentang berbagai makhluk hidup seperti hewan dan tumbuhan.
- **Memanggil metode** dari kelas induk, seperti bernafas() dan tumbuh() dalam kelas turunan atau kelas anak.
- **Menggunakan setter dan getter** untuk mengelola atribut spesifik setiap jenis makhluk hidup.

## **Struktur Kelas**
- **Utama**: Kelas utama yang menjalankan aplikasi dan menampilkan informasi tentang makhluk hidup.
- **MakhlukHidup**: Kelas dasar yang mendefinisikan metode umum untuk semua makhluk hidup.
- **Hewan**: Kelas turunan dari MakhlukHidup yang menambahkan atribut dan metode spesifik untuk hewan.
- **Tumbuhan**: Kelas turunan dari MakhlukHidup yang menambahkan atribut dan metode spesifik untuk tumbuhan.
- **Aves, Amphibi, Pisces, Reptil, Mamalia**: Kelas turunan dari Hewan yang mendefinisikan karakteristik spesifik untuk jenis hewan tertentu.
- **Dikotil, Monokotil**: Kelas turunan dari Tumbuhan yang mendefinisikan karakteristik spesifik untuk jenis tumbuhan tertentu.
