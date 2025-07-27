# Aplikasi Cuaca Desktop (Weather Info)

<img width="707" height="727" alt="image" src="https://github.com/user-attachments/assets/b9f06122-633b-4dc6-8dfb-1edebe98af50" />

Aplikasi Cuaca Desktop adalah sebuah aplikasi Java Swing sederhana yang dibuat menggunakan NetBeans IDE. Aplikasi ini memungkinkan pengguna untuk mencari informasi cuaca terkini dan prakiraan cuaca untuk 5 hari ke depan di berbagai kota di seluruh dunia. Aplikasi ini mengambil data secara *real-time* dari API [OpenWeatherMap](https://openweathermap.org/api).

---
## 🚀 Fitur Utama

- **Cuaca Terkini:** Menampilkan informasi cuaca saat ini, termasuk:
  - Suhu utama (°C)
  - Suhu minimum dan maksimum harian
  - Deskripsi kondisi cuaca (misalnya, "scattered clouds")
  - Kecepatan angin (km/j)
  - Kelembaban (%)
  - Tekanan udara (hPa)
  - Ikon cuaca dinamis yang sesuai dengan kondisi (siang/malam).

- **Prakiraan 5 Hari:** Menampilkan prakiraan cuaca untuk lima hari ke depan, lengkap dengan ikon, deskripsi, serta suhu minimum dan maksimum harian.

- **Manajemen Kota Favorit :**
  - **Tambah (Create):** Pengguna dapat menyimpan kota yang sering dicari ke dalam daftar favorit.
  - **Baca (Read):** Daftar kota favorit ditampilkan dalam sebuah dropdown untuk akses cepat.
  - **Hapus (Delete):** Pengguna dapat menghapus kota dari daftar favorit.
  - Data favorit disimpan secara lokal dalam file `favorites.txt` sehingga tidak hilang saat aplikasi ditutup.

- **Pencarian Kota:** Pengguna dapat mencari cuaca untuk kota mana pun di dunia.

### Untuk menggunakan jangan lupa Add Gson.jar dilibraries nya
