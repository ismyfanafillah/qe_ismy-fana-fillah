# (19) Fundamental Performance Test

1. Performance Test adalah teknik non-functional testing yang digunakan untuk menentukan parameter sistem dalam hal responsif dan stabilitas di bawah berbagai beban kerja. Tujuannya adalah untuk mengukur kualitas atribut dari sistem seperti stabilitas ketahanan (reliability) dan penggunaan sumber daya. Performance Testing mengukur performa suatu aplikasi hingga batas tertentu, bukan merupakan functional-test. Ini bisa berupa berbagai macam bentuk untuk memahami reliability, stability, dan availability pada environment sistem. Contoh pengukuran termasuk observasi response time saat menjalankan request dalam jumlah besar dan interaksi sistem dengan jumlah data yang besar. Performance Testing sering kali cukup mahal untuk diaplikasikan dan dijalankan. Ini dapat menjadi tolak ukur apakah sistem mampu mengakomodasi trafik yang ada. Performance testing memerlukan persiapan khusus, dan dalam beberapa kasus, harus membuat environment terpisah dari production untuk menghindari pencampuran data test dengan data production.
2. Saat melakukan performance test, perhatian utama biasanya pada throughput dan response data sistem yang diuji. Hal ini berguna untuk mengetahui bagaimana sistem berperforma dalam kondisi yang telah ditentukan. Sebagai contoh, sebuah sistem baru yang akan diluncurkan ke production membutuhkan performance test untuk mengetahui throughput dan response time dari sistem tersebut. Ini termasuk menentukan endpoint yang akan diuji dan kebutuhan masing-masing endpoint. Berikut metode yang dilakukan dalam performance test :
    1. Membuat test plan : Saat membuat test plan, hal yang perlu dilakukan adalah mengenali yang dibutuhkan.
        - Endpoint yang akan ditest :
            - /login
            - /beli_pulsa
            - /cek_out 
        - Kebutuhan masing - masing endpoint : 
            - Username dan password untuk endpoint /login
            - Produk, denom dan nomor untuk pengetesan untuk endpoint /beli_pulsa
            - Metode pembayaran yang dipilih untuk endpoint /cek_out
    2. Menentukan metode test : 
        - Pilih berdasarkan kondisi sistem, apakah belum pernah dites atau sudah
            - Selalu awali dengan load test untuk tahu kondisi awal sistem
        - Pilih berdasarkan situasi yang akan dihadapi
3. Terdapat beberapa tipe dari performance testing
    - Smoke Testing : Dilakukan untuk verify script yang sudah dibuat, apakah sistem  tersebut dapat handle minimal load, tanpa masalah sama sekali. Biasanya hanya  1-2 VUs.
    - Load Testing : Pengujian yang paling sederhana yang dilakukan untuk memahami perilaku sistem dalam keadaan beban tertentu untuk menentukan kelakuan sistem pada saat kondisi normal dan puncak. Hasil dari load test digunakan untuk mengukur kepentingan bisnis saat transaksi yang kritis dengan memonitor dampak terhadap database, application server atau pendukung lainnya. 
    - Stress Testing : Dilakukan untuk mengamati  kemampuan dan kestabilan sistem pada saat kondisi ekstrem. Testing ini dilakukab bertahap  menuju load normal, puncak, dan melebihinya, lalu turun untuk melihat proses  recovery.
    -  Spike Testing : Seperti stress test, namun kenaikan langsung menuju melebihi puncak  dilakukan dalam waktu singkat. Jika stress test memberikan waktu untuk  scale-out, disini tidak. Salah satu contoh adalah pada saat flash sale di suatu e-commerce, yang  dimana banyaknya kunjungan pengguna yang langsung memuncak saat  mengakses halaman flash sale.
    - Soak Testing : Untuk mengetahui reliability ketika dalam tekanan di bawah puncak dalam  jangka panjang (>=1 jam). Dapat mengetahui apakah terdapat bug pada race  condition, memory leaks, db connection dsb. Testing ini bisa dilakukan pada jam-jam sepi tidak ada transaksi pada sistem  jika test dilakukan di production.
