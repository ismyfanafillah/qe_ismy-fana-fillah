# (16) RESTful API Testing with REST Assured

1. Fundamental API Integration : Dalam pengembangan perangkat lunak, seringkali kita menggunakan integrasi API (Application Programming Interface) untuk berkomunikasi antara berbagai bagian dari sistem, seperti aplikasi mobile, server API, proses eksternal, dan pengujian API.\
Fundamental API Test Process :
   1. Record define API information : Langkah pertama yaitu mendokumentasikan informasi tentang API yang akan diuji, seperti URL endpoint, metode HTTP (GET, POST, dll), dan struktur data yang digunakan.
   2. Parsing, Filter or Recording API Data and then extract : Setelah API diakses, data yang diperoleh perlu diproses. Ini bisa melibatkan pemilihan data spesifik atau transformasi data.
   3. Reconstruction API calls, and sent them from a simulate client : Langkah ini melibatkan membuat ulang panggilan API dari klien yang mensimulasikan untuk meniru penggunaan API sebenarnya.
   4. Test Validation : Tahap terakhir adalah memeriksa apakah respons API sesuai dengan yang diharapkan, meliputi fungsi dan performa.

2. The Practical Test Pyramid
   - Unit : Test the smallest testable part of an application through methods
     - Tingkat paling bawah dari piramida.
     - Mengujikan bagian terkecil dari aplikasi, seperti fungsi atau metode, secara terisolasi dari sisanya.
     - Sangat detail dan spesifik.
     - Jumlah pengujian unit biasanya paling banyak karena ini ad
   - Component : Test a spesific modules or sub-system through the API
     - Terletak di tengah piramida.
     - Mengujikan modul atau komponen aplikasi secara individual, tetapi dalam konteks sistem yang lebih luas.
     - Ini mungkin termasuk pengujian modul dalam kaitannya dengan database atau layanan lain yang mereka gunakan.
     - Komponen diuji dalam isolasi dari sistem lain menggunakan teknik seperti mocking atau stubbing.
   - Integration : Test the interactions between two modules or sub-system through API contract
     - Terletak di tengah piramida.
     - Mengujikan interaksi antara modul atau komponen aplikasi untuk memastikan mereka bekerja dengan baik bersama.
     - Lebih sedikit jumlahnya dibandingkan pengujian unit, tapi cakupannya lebih luas.
   - UI : (End to End) Test the interaction between the overall through the user interface
     - Puncak dari piramida.
     - Mengujikan alur kerja aplikasi secara keseluruhan, dari awal hingga akhir, seringkali melalui antarmuka pengguna.
     - Termasuk pengujian skenario pengguna sebenarnya.
     - Paling mahal dan rumit untuk dijalankan, sehingga jumlahnya paling sedikit dibandingkan dua jenis pengujian lainnya.

3. Rest Assured -- Features and writing test
    - Support for HTTP methods : Memungkinkan pengujian GET, POST, PUT, DELETE, dan lainnya.
    - Suports for BDD/Dherkin (Given, When, Then) : Mengikuti pendekatan BDD (Behavior-Driven Development) untuk pengujian dengan format Given-When-Then.
    - User of Hamcrest matches for checks (equalTo) : Untuk melakukan pengecekan atau asersi, REST Assured menggunakan matcher Hamcrest (seperti equalTo) yang mempermudah pengecekan kondisi.
    - User of Gpath for selecting element from JSON response : Gpath digunakan untuk memilih elemen dari respons JSON, membantu dalam memverifikasi data spesifik dalam respons.
