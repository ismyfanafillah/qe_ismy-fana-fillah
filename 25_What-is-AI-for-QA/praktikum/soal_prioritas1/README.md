## Soal Prioritas 1

### Manual Test and AI tools
Proses testing secara manual tetap perlu dilakukan meskipun sudah ada tools yang memanfaatkan artificial intelligence (AI) untuk beberapa alasan penting:
1. **Validasi Hasil AI**\
Meskipun AI dapat membantu mengotomatisasi beberapa aspek testing, hasil yang dihasilkan oleh AI sering kali perlu divalidasi secara manual. Hal ini penting untuk memastikan bahwa hasil testing sesuai dengan kebutuhan dan ekspektasi pengguna yang sebenarnya.
2. **Kompleksitas Kasus Pengujian**\
Tools AI biasanya efektif untuk kasus pengujian yang umum dan repetitif. Namun, untuk kasus yang lebih kompleks dan unik, kemampuan manusia untuk berpikir secara kreatif dan adaptif seringkali diperlukan. Manusia mampu mengidentifikasi masalah yang mungkin tidak terdeteksi oleh AI, seperti masalah usability, interpretasi yang salah, dan nuansa kecil yang tidak diantisipasi oleh algoritma AI.
3. **Interaksi Antarmuka Manusia**\
Pengujian manual sangat penting untuk aplikasi yang memerlukan interaksi intensif dengan pengguna. Aspek seperti kejelasan visual, kemudahan navigasi, dan responsifitas dari aplikasi sering kali membutuhkan penilaian manusia untuk menentukan apakah aplikasi tersebut sudah user-friendly.
4. **Adaptasi terhadap Perubahan**\
Lingkungan dan persyaratan aplikasi dapat berubah dengan cepat, dan AI mungkin tidak selalu cepat beradaptasi dengan perubahan tersebut. Tester manusia dapat lebih fleksibel dalam menyesuaikan strategi testing mereka berdasarkan perubahan tersebut.
5. **Biaya dan Efisiensi**\
Meskipun  penggunaan AI dalam testing bisa menghemat waktu dan biaya untuk beberapa aspek, biaya pengembangan dan pelatihan AI yang efektif bisa menjadi sangat tinggi. Di sisi lain, tester manusia bisa lebih murah dan efektif untuk proyek dengan skala atau durasi yang terbatas.
6. **Eksplorasi dan Pemecahan Masalah**\ 
Dalam banyak kasus, tester manusia mampu melakukan eksplorasi dan pemecahan masalah yang lebih dalam berdasarkan pengalaman dan intuisi mereka. AI mungkin tidak dapat menangani skenario yang tidak terduga atau yang belum pernah terlihat sebelumnya dengan baik.

Oleh karena itu, meskipun teknologi AI dalam testing memberikan banyak manfaat, integrasi antara testing manual dan otomatisasi AI seringkali dianggap sebagai pendekatan terbaik. Pendekatan hibrid ini memungkinkan untuk memaksimalkan keunggulan kedua metode tersebut, memastikan kualitas software yang lebih tinggi.

### Manual vs AI tools
Test case dan test scenario untuk fitur sign up dan pembelian barang pada aplikasi [demoblaze](https://www.demoblaze.com/index.html).
#### 1. [Test case dan test scenario secara manual](https://docs.google.com/spreadsheets/d/1cjYRmX2O4uk0ul1qcqwSQQgSw2mDgRRMH49Fzf_GXNU/edit?usp=sharing)
#### 2. [Test case dan test scenario dengan menggunakan tools yang menggunakan artificial intelligence](https://docs.google.com/spreadsheets/d/1qGUJ4MmcnxhaWK43HPtm1WIW7VMVty4iAisFwZwMaxA/edit?usp=sharing)
#### 3. Perbedaan antara pembuatan test case dan scenario secara manual dan menggunakan tools
**Pembuatan Secara Manual**
- Interaksi Langsung: Tester memiliki kemampuan untuk berinteraksi langsung dengan produk atau software, yang memungkinkan mereka untuk mendapatkan pemahaman yang lebih mendalam tentang fungsionalitas dan perilaku sistem.
- Intuisi Manusia: Tester dapat menggunakan pengetahuan dan pengalaman mereka untuk membuat keputusan tentang apa yang perlu diuji dan bagaimana cara mengujinya. Hal ini sering kali mencakup pengujian aspek-aspek yang tidak terduga atau tidak terdokumentasi dengan baik.
- Fleksibilitas: Tester dapat dengan cepat menyesuaikan pendekatan mereka berdasarkan hasil yang diperoleh selama pengujian, yang sangat berguna dalam menanggapi bug atau perilaku yang tidak terduga.
- Biaya: Biaya tenaga kerja untuk tester manual bisa menjadi signifikan, terutama untuk proyek besar yang membutuhkan banyak pengujian dan iterasi.
- Waktu: Proses manual bisa memakan waktu lebih lama, terutama jika banyak test case yang perlu diulang dan banyak fitur yang harus diuji.
- Proses: Prosesnya sangat bergantung pada keterampilan dan pengalaman tester, serta metodologi pengujian yang diikuti, yang bisa bervariasi antar tim atau proyek.
- Kesalahan: Ada risiko lebih tinggi terjadinya human error dalam proses manual, yang bisa menyebabkan inkonsistensi dalam pengujian atau pengabaian bug penting.

**Pembuatan Menggunakan AI Tools**
- Keterbatasan Interaksi: AI, seperti OpenAI, tidak dapat berinteraksi secara langsung dengan produk atau software. Sebagai gantinya, AI bergantung pada data dan prompt yang diberikan oleh pengguna untuk menghasilkan test case dan scenario.otomatis merekam tindakan serta menghasilkan script pengujian.
- Automasi dan Konsistensi: Tools AI dapat menghasilkan test case secara konsisten dan dengan cepat berdasarkan parameter yang diberikan. Ini membantu dalam mengurangi kesalahan manusia dan meningkatkan efisiensi pengujian.
- Skalabilitas: AI dapat menghandle volume test case yang besar dalam waktu yang singkat, yang sangat membantu dalam proyek besar dengan banyak kasus pengujian.
- Biaya: Biaya awal mungkin tinggi untuk pengadaan atau pengembangan tool AI, tetapi dalam jangka panjang, bisa mengurangi biaya tenaga kerja dan meningkatkan efisiensi.
- Waktu: Tools AI dapat menghasilkan dan mengeksekusi test case dengan lebih cepat daripada manusia, menghemat waktu, terutama dalam proyek dengan banyak kasus pengujian.
- Proses: Prosesnya lebih konsisten karena AI mengikuti parameter yang ditetapkan tanpa pengaruh subjektivitas manusia. Namun, ini juga membutuhkan pemeliharaan dan pengawasan untuk memastikan bahwa AI menghasilkan output yang relevan.
- Kesalahan: Meskipun mengurangi kesalahan manusia, AI mungkin memperkenalkan kesalahan sendiri jika tidak diprogram atau dilatih dengan baik, atau jika data yang digunakan untuk pembelajaran tidak representatif atau bias.

**Kesimpulan**\
Pilihan antara menggunakan metode manual atau tools otomatisasi tergantung pada beberapa faktor, termasuk kompleksitas proyek, sumber daya yang tersedia, keahlian tim, dan waktu yang diizinkan untuk siklus pengujian. Proyek kecil mungkin lebih cocok dengan pengujian manual, sementara proyek besar dengan kebutuhan pengujian yang berulang-ulang mungkin akan lebih diuntungkan dengan penggunaan tools otomatisasi. Dalam membandingkan pembuatan test case dan scenario secara manual dengan menggunakan tools AI, kita melihat perbedaan signifikan dalam biaya, waktu, proses, dan potensi kesalahan. Metode manual menawarkan fleksibilitas dan adaptasi langsung yang tinggi tetapi seringkali lebih lambat dan lebih mahal karena ketergantungan pada tenaga kerja manusia. Sebaliknya, penggunaan tools AI dapat meningkatkan kecepatan dan konsistensi dalam pengujian, meskipun dengan investasi awal yang mungkin tinggi dan keterbatasan dalam mengatasi nuansa kontekstual. Menggabungkan kedua pendekatan ini bisa menjadi strategi optimal, memanfaatkan efisiensi dan cakupan AI untuk pengujian dasar dan keahlian manusia untuk aspek yang lebih kompleks dan mendalam. Saran yang baik adalah untuk menyesuaikan pendekatan pengujian dengan kebutuhan spesifik proyek, menggunakan teknologi untuk menangani volume dan kompleksitas, sambil menjaga intervensi manusia untuk memastikan kualitas dan relevansi hasil pengujian.
