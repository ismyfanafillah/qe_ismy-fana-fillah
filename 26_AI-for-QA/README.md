# (26) AI for QA

1. Pemanfaatan AI Tools dalam QA memberikan beberapa keuntungan seperti proses software QA dapat berjaan lebih efektif dan efisien, potensi bug/defect dapat ditemukan dengan lebih cepat, serta akurasi dalam proses software QA dapat meningkt. Contoh tools yang menggunakan AI untuk QA yaitu :
- Pembuata Test Cse dan Test Sccenario (OpenAI)
- Web Testing (Testim, Applitools, Functionize)
- Mobile Testing (Testim, Applitools, Functionize)
- API Testing (Functionize, Pulse)
2. Contoh penggunaan OpenAI dalam QA untuk membuat test case dan test scenario : 
        - Kunjungi OpenAI Playground
        - Membuat Test Case dengan OpenAI, plih preset Q&A
        - Mengubah nilai temperature menjadi 1
        - Mengosongkan untuk parameter Stop sequences
        - Menulis perintah untuk membuat test case maupun test scenario. Pastikan diakhiri dengan tanda titik. Kemudian klik submit
        - Hasil pembuatan test case dapat dilihat yang ditandai warna hijau
3. Dalam kasus membuat Web UI Testing tools yang dapat digunakan untuk melakukan UI testing adalah Applitols. Applitools merupakan sebuah tools yang memanfaatkan teknologi AI dalam proses UI testing. Persiapan untuk UI testing ini diantaranya : Selenium IDE (extension), Akun Applitools, dan Applitools Chrome Extensions. Berikut langkah dasar yang dapat dilakukan dalam Web UI testing dengan Applitools :
        - Memasukkan API Keys Applitools : klik ikon Applitools, isi API Key yang dikirimkan melalui email untuk registrasi, kemudian klik apply.
        - Membuat prject baru di Selenium IDE : buka aplikasi Selenium IDE, buat project baru dengan klik create a new projecr, beri nama project, kemudian klik OK.
        - Membuat test case di Selenium IDE : Ganti nama test case.
        - Merekam test case : klik tombol 'REC' untuk memulai merekam test case, tentukan base URL, membuka Applitools Extensions saat proses perekaman test, klik check element untuk mengecek elemen pada halaman web, klik field username, lakukan klik cek elemen kembali dan klik field password, lakukan hal yang sama untuk klik tombol login, lakukan login dengan username dan password yang valid, klik check element untuk mengecek elemen pada halaman web, klik bagian swag labs, lakukan hal yang sama untuk klik bagian products, kemudian klik tombol stop untuk menghentikan perekaman test case.
        - Menjalankan test case : klik tombol Run current test untuk menjalankan test case, proses testing yang dijalankan oleh Applitools dapat dilihat di bagian Log.
        - Melihat test report : laporan hasil testing dapat dilihat di dashboard Applitools.
        - Meembuat test case baru : pilih Add new test case untuk menambahkan test case baru
        - Ulangi tahapan yang sama seperti sebelumnya.