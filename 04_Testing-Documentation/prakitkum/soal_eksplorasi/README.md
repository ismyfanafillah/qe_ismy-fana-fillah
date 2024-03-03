## Soal Eksplorasi

1. Lakukan pengujian non fungsional untuk aplikasi [web berikut](https://petstore.octoperf.com/actions/Catalog.action) dengan menggunakan Lighthouse. Referensi mengenai Lighthouse dapat dicek di link [berikut](https://developer.chrome.com/docs/lighthouse/overview/). Kriteria untuk pengujian non fungsional adalah sebagai berikut:
    1. Terdapat pengujian non fungsional untuk tampilan di web dan mobile.
    2. Terdapat screenshot hasil pengujian untuk 2 platform (web dan mobile) beserta penjelasan dari hasil pengujian yang telah dilakukan.
    3. Hasil pengujian ditulis dalam google docs.
    4. Contoh hasil pengujian dengan menggunakan Lighthouse adalah seperti pada notion.

### Hasil Pengujian non fungsional 
[Pengujian dalam tampilan mobile](https://pagespeed.web.dev/analysis/https-petstore-octoperf-com-actions-Catalog-action/6mcms95njw?hl=id&form_factor=mobile)\
[Pengujian dalam tampilan dekstop/web](https://pagespeed.web.dev/analysis/https-petstore-octoperf-com-actions-Catalog-action/6mcms95njw?hl=id&form_factor=desktop)

#### 1. Pengujian dalam tampilan mobile :
Berdasarkan hasil pengujian nonfungsional dalam tampilan mobile yang dilakukan terhadap aplikasi JPet Store membahas dua sub utama yaitu penilaian data web inti dan performa.
##### a. Penilaian data Web inti
Pada penilaian data web inti dihasilkan pengujian nonfungsional dalam tampilan mobile ini: Gagal. Gagalnya "Penilaian Data Web Inti" mungkin menunjukkan bahwa ada masalah dengan server atau proses pengujian itu sendiri yang tidak dapat mengakses halaman dengan benar untuk mengumpulkan metrik tertentu. Terdapat poin-poin metrik hasil pengujian terkait penilaian data web inti sebagai berikut.
###### - Largest Contentful Paint (LCP)
LCP mengukur waktu yang diperlukan untuk merender konten terbesar yang terlihat dalam viewport. Dari data yang diberikan, LCP berkisar antara 0,6 detik hingga 1 detik, yang menunjukkan performa yang baik karena di bawah ambang batas yang direkomendasikan yaitu 2,5 detik.
###### - First Input Delay (FID)
FID mengukur waktu dari interaksi pertama pengguna dengan halaman hingga waktu ketika browser mampu merespons interaksi tersebut. Nilai yang diperoleh berkisar dari 1 milidetik hingga 254 milidetik, yang mengindikasikan responsivitas yang sangat baik.
###### - Cumulative Layout Shift (CLS)
CLS mengukur stabilitas visual halaman dengan menghitung jumlah pergeseran layout yang tak terduga. Nilai CLS adalah 0, yang berarti tidak ada pergeseran layout yang terjadi dan menyediakan pengalaman pengguna yang stabil.
###### - First Contentful Paint (FCP)
FCP mengukur waktu yang dibutuhkan untuk memuat konten pertama halaman. Hasil menunjukkan waktu 0,9 detik, yang termasuk kategori baik.
###### - Interaction to Next Paint (INP)
INP merupakan metrik yang tertunda yang akan menggantikan FID, dan mengukur waktu hingga interaksi berikutnya. Nilai yang tercatat adalah 313 milidetik, yang menunjukkan ruang untuk peningkatan.

##### b. Peforma
Skor keseluruhan untuk performa sangat sempurna pada 100 yang berarti halaman pada aplikasi dalam tampilan moibile memiliki performa pemuatan sepat dan interaktif yang sangat baik. Skor ini merupakan skor agregat yang dibuat berdasarkan metrik-metrik lainnya. Pada pengujian performa ini juga menujukkan hasil dari pengujian nonfungsional lainnya seperti aksesbilitas, praktik terbaik, dan SEO.
###### - Performa
Performa dipengaruhi hasil dari metrik-metrik seperti First Contentful Paint (FCP) pada 1,2 detik, yang jauh lebih cepat dari batas 2,5 detik yang direkomendasikan. Total Blocking Time (TBT) sangat rendah pada 20 milidetik, menandakan bahwa halaman tetap responsif selama pemuatan konten. Largest Contentful Paint (LCP) juga baik, tercatat pada 1,4 detik. Ini bersama dengan Speed Index yang baik pada 2,7 detik, menunjukkan bahwa halaman ini memuat dengan cepat dan mempertahankan interaktivitas yang baik. Cumulative Layout Shift (CLS) skor sangat rendah pada 0,001, menunjukkan tidak ada pergeseran yang signifikan yang dapat mengganggu pengalaman pengguna sehingga stabil. 
###### - Aksesibilitas
Aksesbilitas mengukur seberapa mudah halaman dalam tampilan mobile dapat diakses dan digunakan oleh orang dengan berbagai kebutuhan, termasuk mereka yang menggunakan teknologi assistive seperti screen readers. Skor aksesibilitas yang tertera dari hasil pengujian adalah 42, yang menunjukkan bahwa masih belum maksimal dan mungkin banyak ruang untuk perbaikan. Nilai ini merepresentasikan dari beberapa faktor seperti eberapa elemen gambar tidak memiliki atribut [alt], yang penting untuk pengguna teknologi asistif seperti pembaca layar​​; elemen formulir tidak memiliki label terkait dan link tidak memiliki nama yang dapat dikenali, yang mengurangi kemudahan navigasi untuk pengguna dengan kebutuhan khusus​​; masalah dengan kontras warna yang tidak cukup juga ditemukan, yang bisa mempersulit pengguna dengan penglihatan terbatas untuk membaca dan memahami konten​​; halaman juga tidak memiliki atribut [lang] pada elemen <html>, yang membantu dalam interpretasi konten oleh pengguna dalam berbagai lokasi, dan sebagainya​​.
###### - Praktik Terbaik
Praktik terbaik menunjukan adopsi praktik terbaik halaman dalam tampilan mobile, termasuk keamanan, penggunaan modern API, dan standar pengkodean. Skor praktik terbaik yang didapat adalah 89, yang cukup tinggi tetapi belum maksimal juga. Salah satu faktor dari nilai praktik terbaik yang kurang maksimal yaitu ditemukan masalah dengan gambar yang menampilkan rasio tinggi-lebar yang salah, yang menunjukkan pentingnya memastikan bahwa dimensi tampilan gambar cocok dengan rasio aspek alaminya untuk memberikan pengalaman pengguna yang lebih baik​.
###### - SEO (Search Engine Optimization)
SEO menilai seberapa baik halaman dioptimalkan untuk mesin pencari, yang dapat mempengaruhi visibilitasnya dalam hasil pencarian. Skor SEO adalah 54, yang relatif rendah dan menunjukkan bahwa ada beberapa aspek penting yang bisa ditingkatkan. Faktor-faktor yang mempengaruhi seperti tidak memiliki tag, dokumen tidak menggunakan ukuran font yang terbaca, target ketuk tidak memiliki ukuran yang tepat, dokumen tidak memiliki deskripsi meta, halaman diblokir dari pengindeksan, dan sebagainya.

#### 2. Pengujian dalam tampilan dekstop/web :
Berdasarkan hasil pengujian nonfungsional dalam tampilan mobile yang dilakukan terhadap aplikasi JPet Store membahas dua sub utama yaitu penilaian data web inti dan performa.
##### a. Penilaian data web inti
Pada penilaian data web inti dihasilkan pengujian nonfungsional dalam tampilan dekstop/web ini : Lulus. Lulusnya "Penilaian Data Web Inti" menunjukkan bahwa aplikasi web telah berhasil memenuhi standar tertentu untuk metrik-metrik kinerja web yang dianggap penting oleh Google dalam konteks Core Web Vital. Terdapat poin-poin metrik hasil pengujian terkait penilaian data web inti sebagai berikut.
- Largest Contentful Paint (LCP)
    Waktu yang tercatat adalah 0,6 detik, yang menunjukkan bahwa konten terbesar dalam viewport dimuat dengan sangat cepat. Ini jauh lebih baik dari ambang batas 2,5 detik yang direkomendasikan oleh Google, sehingga halaman tersebut lulus pada penilaian ini​​.
- First Input Delay (FID)
    FID tercatat sangat rendah pada 1 milidetik, yang berarti halaman tersebut sangat responsif terhadap input pengguna pertama. Ini menunjukkan bahwa JavaScript yang menghalangi tidak mempengaruhi kemampuan halaman untuk merespons interaksi pengguna​​.
###### - Cumulative Layout Shift (CLS)
CLS mendapatkan skor sempurna 0, yang menandakan tidak ada pergeseran tata letak yang tidak diinginkan selama pemuatan halaman. Ini berarti pengguna tidak akan mengalami perubahan posisi elemen secara tiba-tiba yang dapat menyebabkan interaksi yang tidak diinginkan​​.
###### - First Contentful Paint (FCP)
FCP juga tercatat pada 0,6 detik, menunjukkan bahwa halaman mampu menampilkan konten pertama dalam waktu yang sangat singkat setelah diminta​​.
###### - Interaction to Next Paint (INP)
INP adalah 12 milidetik, yang mencerminkan waktu yang dibutuhkan untuk halaman menjadi interaktif setelah melakukan tindakan. Nilai ini menunjukkan bahwa halaman cepat merespons interaksi pengguna setelah konten pertama muncul​​.
###### - Time to First Byte (TTFB)
TTFB tercatat pada 0,4 detik, yang menandakan bahwa server merespons dengan cepat terhadap permintaan awal. Ini adalah indikator penting dari waktu respon server yang baik​​.

##### b. Performa
Skor keseluruhan untuk performa sangat tinggi pada 99, menunjukkan bahwa halaman tersebut memiliki performa yang hampir sempurna. Ini mencerminkan waktu muat yang sangat cepat dan kinerja yang responsif yang memberikan pengalaman pengguna yang sangat baik​. Skor ini merupakan skor agregat yang dibuat berdasarkan metrik-metrik lainnya. Pada pengujian performa ini juga menujukkan hasil dari pengujian nonfungsional lainnya seperti aksesbilitas, praktik terbaik, dan SEO.
###### - Performa 
Pada tampilan desktop, aplikasi web menunjukkan performa yang luar biasa dengan First Contentful Paint (FCP) pada 0,5 detik, menandakan kecepatan halaman dalam menampilkan konten pertama kali. Total Blocking Time (TBT) nol milidetik menunjukkan tidak adanya penundaan yang diakibatkan oleh skrip yang memblokir, yang menjaga halaman tetap responsif. Speed Index yang baik pada 0,9 detik menggambarkan kecepatan di mana konten halaman terlihat terisi selama pemuatan, sedangkan Largest Contentful Paint (LCP) pada 0,6 detik merefleksikan waktu yang dibutuhkan untuk konten terbesar menjadi terlihat. Akhirnya, Cumulative Layout Shift (CLS) yang rendah pada 0.043 menunjukkan bahwa tidak banyak pergeseran tata letak yang tak terduga, sehingga pengalaman pengguna tetap stabil.
###### - Aksesbilitas
Skor aksesibilitas pada tampilan dekstop web adalah 42, yang menunjukkan bahwa meskipun halaman tersebut telah memenuhi beberapa kriteria aksesibilitas, masih ada peluang yang signifikan untuk peningkatan. Faktor masalah-masalah seperti elemen gambar tanpa atribut [alt]; elemen formulir tanpa label terkait; link tanpa nama yang dapat dikenali; warna latar belakang dan depan tidak memiliki rasio kontras yang cukup; ​halaman juga tidak memiliki atribut [lang] pada elemen <html>, yang membantu dalam interpretasi konten oleh pengguna dalam berbagai lokasi, dan sebagainya​​.
###### - Praktik terbaik
Skor untuk praktik terbaik pada tampilan dekstop web yaitu 93, menunjukkan bahwa halaman tersebut secara umum mengikuti rekomendasi untuk praktik-praktik terbaik dalam pembuatan web. Namun, masih ada ruang untuk perbaikan, mungkin dalam hal menampilkan gambar dengan rasio aspek yang benar maupun hmasalah halman yang tidak memiliki doctypr HTML sehingga memicu quirks mode; serta memastikan efektivitas Content Security Policy (CSP) terhadap serangan seperti Cross-Site Scripting (XSS)​
###### - SEO (Search Engine Optimization)
Skor SEO yang dihasilkan dalam pengujian nonfungsional tampilan dekstop web yaitu 64, yang menunjukkan bahwa sementara beberapa aspek SEO dasar telah diterapkan, ada ruang yang signifikan untuk peningkatan, terutama dalam hal mobile-friendliness, deskripsi meta, dan aksesibilitas oleh crawler untuk pengindeksan.
        

