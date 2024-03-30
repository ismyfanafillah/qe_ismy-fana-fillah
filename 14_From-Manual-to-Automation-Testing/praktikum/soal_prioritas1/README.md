## Soal Prioritas 1

### Jenis-jenis dari performance testing
#### 1. Load testing
Menguji kinerja aplikasi dengan peningkatan beban kerja dalam waktu tertentu. Beban kerja ini bisa berupa pengguna bersamaan, jumlah transaksi, perilaku aplikasi , dan lain-lain. Tujuannya adalah untuk mengamati waktu respon, tingkat throughput, penggunaan sumber daya, dan lain-lain. Dengan mengidentifikasi hambatan kinerja pada atribut-atribut ini, Anda dapat memperbaikinya sebelum meluncurkan aplikasi untuk memastikan pengalaman pengguna yang lebih baik. Load testing juga membantu Anda memahami berapa banyak pengguna bersamaan yang dapat ditangani oleh aplikasi pada satu waktu.
#### 2. Stress testing
Menguji kinerja aplikasi di luar parameter kerja normal. Artinya, aplikasi diberi beban kerja yang lebih tinggi dari yang dapat ditangani, seperti lalu lintas pengguna atau data yang ekstrim. Tujuannya adalah untuk mengetahui stabilitas aplikasi. Pada titik mana aplikasi gagal, dan bagaimana aplikasi pulih dari kegagalan tersebut.
#### 3. Spike testing
Menguji kinerja aplikasi saat beban kerja meningkat secara tiba-tiba dan berulang. Beban kerja ini melebihi ekspektasi normal untuk waktu yang singkat. Spike testing adalah jenis stress testing yang digunakan untuk menguji reaksi aplikasi terhadap lonjakan beban yang tidak terduga.
#### 4. Endurance testing
Menguji kinerja aplikasi selama periode yang lama dengan beban kerja yang normal dan tetap. Dengan kata lain, mengetahui seberapa lama aplikasi dapat bertahan dengan beban kerja yang konstan untuk memberikan keberlanjutan jangka panjang. Selama pengujian ini, tim pengujian memantau KPI seperti kebocoran memori, penggunaan memori, kekurangan memori, dan lain-lain. Endurance testing juga menganalisis waktu respon dan throughput setelah penggunaan yang lama untuk menampilkan apakah metrik ini konsisten atau tidak.
#### 5. Scalability testing
Menguji kinerja aplikasi dengan meningkatkan beban kerja secara bertahap. Tujuannya adalah untuk menentukan efektivitas aplikasi dalam "meningkatkan skala" untuk mendukung peningkatan beban pengguna. Scalability testing membantu Anda memahami batas kapasitas aplikasi dan sumber daya yang dibutuhkan untuk menangani beban yang lebih besar.
#### 6. Volume testing
Menguji kinerja aplikasi dengan menambahkan volume data yang besar dalam basis data. Tujuannya adalah untuk mengetahui dampak volume data terhadap kinerja aplikasi, seperti waktu respon, throughput, dan penggunaan sumber daya.

### Tools yang dapat digunakan untuk melakukan performance testing
#### 1. Apache JMeter
Aplikasi open source berbasis Java yang dapat dipergunakan untuk performance test. Bagi seorang QA Engineer jMeter bisa digunakan untuk melakukan load/stress testing Web Application, FTP Application dan Database server test. JMeter bisa dijalankan dengan 2 cara, dengan GUI atau non-GUI (Command line).
#### 2. LoadRunner
Sebuah Tools pengujian software dari OpenText. Digunakan untuk menguji aplikasi yang sedang kita bangun untuk mengukur kinerja sistem di bawah beban.
#### 3. Gatling
Tools powerful open-source load testing tools untuk uji kinerja atau uji beban pada aplikasi yang kita bangun. tools ini dirancang untuk mengukur sejauh mana suatu sistem atau aplikasi dapat menangani beban kerja tertentu dan bagaimana kinerjanya saat menghadapi situasi pengguna yang bersamaan. Gatling termasuk web recorder and colorful reports. Gatling jugam merupakan tools open-source performance testing, yang menggunakan  Scala, Akka dan Netty yang akan membantu membuat dan menjalankan high performance dan mudah maintain pada saat lokal dan server test.
#### 4. Locust
Tools open source load testing yang memungkinkan ada mendefinisikan perilaku pengguna menggunakan Python code. Locust mendukung proses testing yang dijalankan atau didistribusikan melalui beberapa mesin sekaligus. oleh karena itu dapat digunakan untuk mensimulasikan jutaan pengguna secara bersamaan.
#### 5. Httperf
Tools yang digunakan untuk mengukur kinerja sebuah web server. httperf juga menyediakan fasilitas yang flexible untuk menghasilkan berbagai HTTP Workloads untuk mengukur kinerja server. Tiga hal yang membedakan httperf dengan tools lain adalah ketangguhannya yang mencakup kemampuan untuk menghasilkan dan mempertahankan overload server, support HTTP/1.1 and SSL protocols, dan extensibility pada workload baru

### Referensi :
- [Apa itu Performance Testing? Dan Apa Saja Toolsnya?](https://icreativelabs.com/blog/apa-itu-performance-testing-dan-apa-saja-toolsnya)
- [Mengenal Apa itu Performance Testing Beserta dengan Toolsnya](https://sis.binus.ac.id/2021/09/15/mengenal-apa-itu-performance-testing-beserta-dengan-toolsnya/)
