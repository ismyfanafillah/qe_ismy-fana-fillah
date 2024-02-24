## Soal Prioritas 1 (80)
### 1. Sebutkan dan jelaskan berbagai automation testing tool yang dapat digunakan (minimal 3)\
Jawab : 
- #### [Katalon Studio](https://www.katalon.com/)
    
    Katalon Studio merupakan sebuah alat pengujian yang populer digunakan untuk menguji aplikasi mobile dan desktop browser. Salah satu fitur unggulannya adalah Katalon Recorder yang memungkinkan pengguna merekam langkah-langkah pengujian, menangkap elemen web, dan memainkan secara otomatis untuk test case yang sudah ada. Dengan demikian, pengguna dapat melakukan pengujian dengan lebih mudah dan dapat bersantai sambil menikmati kopi karena Katalon akan menjalankan pekerjaan pengujian. Alat ini cocok digunakan baik oleh pemula maupun ahli dalam bidang Quality Assurance (QA).

    Dalam Katalon, pengguna dapat menangkap objek/element seperti tombol, kolom teks, datepicker, tautan, checkbox, radio button, dan lainnya pada setiap halaman web browser atau aplikasi mobile yang sedang direkam untuk dijalankan dalam pengujian. Jika terjadi kesalahan saat memainkan rekaman yang sudah dibuat, pengguna dapat menambahkan skrip untuk melakukan pemeriksaan lebih lanjut.

    Fitur-fitur unggulan Katalon mencakup metode fleksibel untuk desain tes, metodologi pengujian yang didukung, uji coba kembali otomatis, objek tes yang dapat digunakan kembali, integrasi dengan alat CI/CD dan ALM populer, antarmuka pemecahan masalah UI, integrasi dengan alat kolaborasi, dokumentasi alat yang detail, dan tutorial video di Katalon Academy.

- #### [Cypress.io](https://www.cypress.io/)

    Cypress.io adalah alat pengujian gratis yang dapat dijalankan pada Command Line Interface (CLI) dan dapat digunakan pada sistem operasi seperti Mac, Linux, dan Windows. Saat ini, Cypress hanya dapat melakukan pengujian pada web dan belum mendukung pengujian pada aplikasi mobile native. Namun, kita dapat menantikan pembaruan di masa depan yang mungkin akan memungkinkan penggunaan Cypress.io untuk pengujian aplikasi mobile.

    Dengan arsitektur yang baru, Cypress dapat beroperasi langsung dalam browser dalam run-loop yang sama dengan aplikasi, memberikan akses langsung ke elemen-elemen dan eksekusi yang lebih cepat. Fitur utama Cypress meliputi dukungan untuk bahasa pemrograman JavaScript, snapshot eksekusi langkah tes dan kemampuan debugging dari alat pengembang yang akrab, kontrol atas perilaku fungsi, respons server, timer, dan lalu lintas jaringan, koneksi ke Cypress Cloud untuk kinerja dan optimasi tes, serta integrasi dengan alat CI/CD yang populer.

    Cypress.io mendukung penggunaan berbagai bahasa pemrograman seperti JavaScript, Ruby, Node, C#, dan PHP. Alat ini dapat melakukan pengujian terhadap semua yang berjalan dalam konteks browser. Untuk informasi lebih lanjut tentang scripting dan penanganan kesalahan dalam pembuatan skrip pengujian, pengguna dapat mengakses https://github.com/cypress-io atau bergabung dengan komunitas pengguna di https://gitter.im/cypress-io/cypress yang akan memberikan bantuan dari pengembang Cypress.io atau pengguna senior yang sudah berpengalaman dengan Cypress.io. 

- #### [Postman](https://www.postman.com/)

    Postman adalah alat otomatisasi pengujian API yang sangat populer. Alat ini memungkinkan pengguna untuk menulis berbagai jenis tes, mulai dari fungsional dan integrasi hingga tes regresi, dan menjalankannya secara otomatis dalam pipeline CI/CD melalui baris perintah.

    Fitur Unggulan Postman meliputi antarmuka yang ramah dan mudah digunakan yang dilengkapi dengan potongan kode, dukungan untuk berbagai metode HTTP, Swagger, dan format RAML, dukungan luas untuk skema API untuk menghasilkan koleksi dan elemen API, pembuatan paket tes, eksekusi dengan parameterisasi, dan debugging, serta integrasi dengan alat CI/CD populer. 


- #### [Selenium](https://www.selenium.dev/)

    Selenium, yang diluncurkan pada tahun 2004, merupakan salah satu kerangka kerja sumber terbuka yang paling populer untuk otomatisasi pengujian web. Suite perangkat lunak Selenium terdiri dari Selenium WebDriver, Selenium Grid, dan Selenium IDE. Selenium menonjol dengan dukungan untuk berbagai bahasa pemrograman seperti Java, C#, Python, JavaScript, Ruby, PHP, dan lainnya, serta mendukung berbagai browser seperti Chrome, Firefox, IE, Microsoft Edge, Opera, Safari. Alat ini memungkinkan pengguna untuk melakukan pengujian pada mesin lokal atau jarak jauh melalui server Selenium, serta melakukan eksekusi paralel dan lintas browser untuk mengurangi waktu eksekusi dan meningkatkan cakupan tes. Selain itu, Selenium juga dapat diintegrasikan dengan berbagai kerangka kerja pengujian lainnya seperti TestNG untuk pelaporan dan alat CI/CD.

    Selenium telah menjadi pilihan utama bagi para pengembang dan praktisi QA dalam mengotomatisasi pengujian web. Dengan kemampuan untuk mendukung berbagai bahasa pemrograman dan browser, Selenium memberikan fleksibilitas yang tinggi bagi pengguna dalam mengembangkan dan menjalankan skrip tes. Selain itu, fitur eksekusi paralel dan lintas browser Selenium membantu dalam meningkatkan efisiensi pengujian dengan mengurangi waktu eksekusi dan memperluas cakupan pengujian. Dengan integrasi yang kuat dengan berbagai alat pelaporan dan CI/CD, Selenium memungkinkan tim pengembangan untuk mengotomatisasi pengujian secara menyeluruh dan terintegrasi dengan alur kerja pengembangan perangkat lunak modern.

- #### [Appium](http://appium.io/)

    Appium merupakan alat otomatisasi untuk aplikasi mobile web, dan aplikasi hybrid untuk platform iOS dan Android. Penulisan aplikasi native menggunakan iOS dan Android SDKs. Appium dapat dijalankan baik pada simulator maupun perangkat nyata dan merupakan perangkat lunak sumber terbuka (open source).

    Seperti Selenium, Appium juga merupakan alat otomatisasi pengujian sumber terbuka, namun untuk aplikasi mobile. Dengan menggunakan protokol mobile JSON wire, Appium memungkinkan pengguna menulis tes UI otomatis untuk aplikasi mobile native, berbasis web, dan hybrid pada kedua platform Android dan iOS.

    Appium mendukung beberapa bahasa pemrograman dari Selenium WebDriver API dan pustaka klien berbasis bahasa tertentu seperti Java, Objective-C, JavaScript dengan Node.js,PHP, Python, Ruby, C#, Clojure, Perl. Selain itu yang menjadi keunggulan dari Appium adalah pengujian lintas platform dengan skrip tes yang dapat digunakan kembali dan API yang sama, eksekusi pada perangkat nyata, simulator, dan emulator, serta integrasi dengan kerangka pengujian lainnya dan alat CI/CD. Namun, kelemahan Appium meliputi tidak mendukung untuk Android API di bawah level 17, sedikit lambat pada iOS, dan tidak dapat menangani pop-up atau pesan toast.

### 2. Sebutkan dan jelaskan urgensi / pentingnya proses pengujian pada perangkat lunak (minimal 3 poin)
Jawab :
- #### Save Money
    Proses pengujian perangkat lunak penting untuk menghemat biaya. Dengan melakukan pengujian secara menyeluruh, dapat mencegah kerugian finansial akibat bug atau kesalahan yang terlewatkan dan menyababkan kegagalan produk. Hal ini dikarenakan produk yang gagal tentunya harus melakukan pengujian atau perbaikan kembali (jika sudah diluncurkan ke pasar). Hal tersebut tentunya cukup fatal jika produk yang sudah diluncurkan memiliki banyak bug, dikarenakan melakukan pengujian saat produk sudah diluncurkan akan lebih rumit dibandingkan melakukan pengujian dengan memperhakilan level of testing. Selain, akan menyita waktu yang lebih banyak, hal tersebut juga tentunya akan menyita biaya lagi untuk produksi atau perbaikan kembali.

- #### Product Quality
    Pengujian yang baik dapat menjamin kualitas produk. Dengan melakukan proses pengujian yang teliti dan detail menyeluruh, dapat memastikan bahwa produk yang dihasilkan kualitas yang lebih optimal sebelum diluncurkan ke pasar atau klient. Dengan dihasilkannya produk yang berkualitas, maka dapat dikatakan produk berhasil melewati berbagai pengujian yang sesuai dan minim atau bahkan tidak ada bug dan tidak dikatakan sebagai produk gagal sehingga dapat meningkatkan kepercayaan konsumen atau klien.

- #### Security
    Keamanan data dan informasi dalam perangkat lunak sangat penting. Dengan melakukan pengujian yang komprehensif, tim developer maupun perusahaan terkait dapat mengidentifikasi dan menutup celah keamanan yang dapat dieksploitasi oleh pihak yang tidak bertanggung jawab. Keamanan sebagai salah satu hal yang menunjukan bahwa bahwa produk yang dibuat atau didevelop merupakan produk yang berkualitas dan aman tentunya bagi perusahaan yang menyimpan database atau data penting maupun konsumen (klien) yang nantinya akan menggunakan produk perangkat lunak tersebut, hal tersebut tentunya juga akan meningkatkan kepercayaan konsumen terhadap produk dan perusahaan terkait.

- #### Customer Satisfaction
    Untuk memastikan kepuasan pelanggan, proses pengujian perangkat lunak tidak boleh diabaikan. Dengan melakukan pengujian yang detail menyeluruh dan melakukan berbagai kemungkinan dengan membuat user flow dan test case yang membantu memperkirakan apa yang akan dilakukan pengguna jika menggunakan produk tersebut, dapat memastikan apakah dalam produk perangkat lunak yang dibuat terdapat bug atau tidak dan sesuai dengan yang diharapkan konsumen/kebutuhan pasar atau tidak. Jika produk sesuai dengan apa yang diharapkan atau sesuai dengan pasar (klien) menunjukan bahwa produk yang disajikan kepada pelanggan memiliki kualitas yang memuaskan. Seperti halnya urgensi lainnya yaitu Product Quality dan Security, dengan memastikan kedua hal tersebut melalui pengujian akan meningkatkan rasa kepercayaan dan kepuasan konsumen/pasar (klien) terhadap produk perangkat lunak tersebut.

### Referensi : 
- LMS dan Live Session
- [Medium 'Automation Testing tools yang wajib untuk di coba'](https://medium.com/skyshidigital/automation-testing-tools-yang-wajib-untuk-di-coba-36430ddddda9)
- [Katalon 'Top 15 Automation Testing Tools'](https://katalon.com/resources-center/blog/automation-testing-tools#h10)