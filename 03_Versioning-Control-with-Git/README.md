# (03) Versioning Control with Git

1. Versioning merupakan sebuah aktivitas untuk mengatur versi dari code program ketika mengambangkan program atau aplikasi kompeks. Versioning digunakan untuk mempertahankan versi sebelumny adari suatu program sebelum dilakukan revisi dengan harus buat file baru. Sehingga jika tidak menggunakan versioning maka untuk mengelola versi sebelumnya akan rumit. Tools yang digunakan untuk mengelola code progrma diantaranya VCS (Versioning control system), SCM (Source Code  Manager), RCS (Reversion Control System). VCS merupakan salah satu tools yang bisa digunakan untuk versioning, contoh yang termasuk VCS yaitu single user (hanya bisa digunakan oleh satu pengguna), centralized (terpusat), dan distributed (terdistribusi). Terdapat berbagai VCD yang bisa dimanfaatkan salah satunya git yang merupakan VCS populer yang digunakn para developer untuk megembangkan software bersama (berkolaborasi) dan sifatnya terdistribusi. Sistemnya terdistibusi maksudnya setiap pengguna atau user harus memiliki perubahan yang tersinkron. Untuk melalukan sinkronisasi perubahan bisa menggunakan git. Dalam sebuah git terdapat git repository yaitu sebuah projek untuk melakukan versioning yang mana dalam satu repository bisa terdiri dari folder dan file, serta histori commit yang telah dilakukan. Git juga melakukan tracking setiap perubahan sendiri maupun orang lain terhadap perubahan pada file dan digunakan commit untuk menyimpan perubahan tersebut. Terdapat banyak Git commands yang dapat digunakan seperti `git init`, `git clone`, `git config`, `git add`, `git commit`, `git message`, `git diff`, `git stash`, `git log`, `git checkout`, `git push`, `git fetch`, `git pull`, `git branch`, `git merge`, dan lainnya.
2. Gitflow dapat diterapkan dalam mengembangkan sebuah aplikasi yaitu digunakan untuk memisahkan versi yang masih dikembangkan, versi yang siap dikembangkan, dan versi untuk pengembangan sistem fitur tertentu. Jika tidak mengggunakan gitflow maka aliran alurnya hanya satu arah dan pengembangan akan dicommit langsung di branch utama. Jika aplikasi kompleks, maka untk branch managementnya sulit karena terpusat pada satu branch saja sehingga ketika ingin melakukan rollback akan sulit dan penyelesaian saat mengembangkan versi maka pemecahan atau pemisahan dilakukan dibranch utama dan dibuat branch baru berdasarkan fiturnya. Solusi dari hal tersebut yang lebih baik yaitu dengan melakukan pemecahan atau pemisahan branch untuk aplikasi yang siap digunaknan dan splikasi yang sedang di develop. Jadi dari branch utama, dbuat branch baru yaitu branch develop, ketika ada pengembangan baru maka dilakukan pemecahan lagi branchnya untuk mengembangkan fitur tersebut dari branch develop,kemudian hasil akhirnya akan digabungkan ke branch develop dan hasilnya digabungkan ke branch main atau master.
3. Pull request merupakan fitur yang dapat dimanfaatkan untuk menggabungkan perubahan yang terdapat pada branch develop ke branch main dalam sebuah repository. Proses penggunaan pull request dimulai dengan langkah pertama yaitu melakukan pengecekan lokasi branch dengan perintah `git branch` dan melakukan push perubahan ke branch develop di repository dengan perintah `git push origin develop`. Selanjutnya, disarankan untuk membuat pull request dengan membuka halaman GitHub terkait. Pada halaman tersebut, pengguna dapat membuka pull request dan melakukan perbandingan antara branch yang akan digabungkan (base) dan branch yang akan digunakan untuk penggabungan (compare), misalnya branch develop ke branch main. Selain itu, pengguna juga diminta untuk menambahkan judul yang jelas pada pull request, mengisi review dan assignee sesuai dengan kebutuhan, serta menetapkan label yang sesuai. Deskripsi singkat juga perlu ditambahkan untuk menjelaskan perubahan yang dilakukan, seperti menambahkan file favorit. Setelah semua langkah tersebut selesai, pull request dapat dibuat dengan menekan tombol "Create Pull Request" dan statusnya akan tetap terbuka (open). Selanjutnya, pengguna perlu melakukan review terhadap perubahan yang diajukan. Apabila perubahan dianggap sudah memadai, pengguna dapat langsung melakukan penggabungan (merge). Namun, jika terdapat hal yang perlu direview lebih lanjut, pengguna dapat melakukan review lebih lanjut dengan mengklik opsi review. Setelah pull request berhasil digabungkan, langkah terakhir adalah melakukan sinkronisasi perubahan ke repository lokal dengan perintah `git pull origin main`. Dengan demikian, proses penggunaan pull request untuk menggabungkan branch develop ke main dapat dilakukan dengan langkah-langkah yang terstruktur dan sesuai dengan prosedur yang berlaku.