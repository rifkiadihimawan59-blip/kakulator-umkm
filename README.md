# 🧮 Kalkulator Keuangan UKM

Aplikasi web sederhana berbasis **HTML**, **Tailwind CSS**, dan **JavaScript** yang dirancang untuk membantu pemilik Usaha Kecil Menengah (UKM) menghitung Harga Pokok Penjualan (HPP) dan menentukan rekomendasi harga jual produk secara cepat dan akurat.

![License](https://img.shields.io/badge/license-MIT-blue.svg)
![HTML5](https://img.shields.io/badge/HTML5-E34F26?style=flat&logo=html5&logoColor=white)
![TailwindCSS](https://img.shields.io/badge/Tailwind_CSS-38B2AC?style=flat&logo=tail-wind-css&logoColor=white)
![JavaScript](https://img.shields.io/badge/JavaScript-F7DF1E?style=flat&logo=javascript&logoColor=black)

---

## 📌 Fitur Utama

* **Kalkulasi HPP otomatis**: Menghitung total biaya bahan baku dan biaya operasional per unit.
* **Rekomendasi Harga Jual**: Menghitung target harga jual berdasarkan persentase margin keuntungan yang diinginkan.
* **Format Mata Uang Rupiah**: Hasil akhir otomatis diformat ke dalam Rupiah (Rp) yang mudah dibaca.
* **Desain Responsif**: Tampilan bersih dan modern menggunakan Tailwind CSS, nyaman diakses dari perangkat mobile maupun desktop.
* **Validasi Input**: Mencegah kesalahan pembagian dengan nol (*division by zero*) pada jumlah produk.

---

## 📐 Rumus Perhitungan

1. **Total Modal**  
   $$\text{Total Modal} = \text{Biaya Bahan} + \text{Biaya Operasional}$$

2. **HPP per Unit**  
   $$\text{HPP per Unit} = \frac{\text{Total Modal}}{\text{Jumlah Produk}}$$

3. **Harga Jual Minimal per Unit**  
   $$\text{Harga Jual} = \text{HPP per Unit} + \left( \text{HPP per Unit} \times \frac{\text{Margin (\%)}}{100} \right)$$

---

## 🛠️ Teknologi yang Digunakan

* **HTML5** – Struktur halaman web.
* **Tailwind CSS (via CDN)** – Styling UI yang responsif dan fleksibel.
* **Font Awesome (via CDN)** – Ikon grafis.
* **JavaScript (Vanilla JS)** – Logika manipulasi DOM dan kalkulasi keuangan.

---

## 📁 Struktur Berkas Proyek

```text
.
├── index.html   # Halaman utama (struktur & form kalkulator)
├── script.js    # Logika JavaScript perhitungan HPP dan harga jual
└── README.md    # Dokumentasi proyek