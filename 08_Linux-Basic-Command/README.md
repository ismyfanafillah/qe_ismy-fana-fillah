# (08) Linux Basic Commands

1. Command line adalah sebuah perinth yang dituliskan dalam bentuk text-based. Command line sangat useful karena command line lebih cepat daripada menggunakan GUI. Dengan menggunakan command line akan menggunakan resources yang lebih sedikit sehingga lebih efisien, commnad line lebih cocok untuk tugas yang sifatnya berulang, dan penggunaan command line sangat powerful.
2. Struktur dalam menuliskan command adalah
    command [options] [parameters]
Berbagai command yang bisa digunakan di linux


--- direktori ---
buat folder baru : mkdir (nama folder)
bisa digunakan untuk membuat 1 2 3 folder atau lebih
conottoh : mkdir (nama folder) (nama folder) 

nampilin daftar direktori : ls saat ini
klo mau cek/liat daftar konten folder tertentu : ls (nama folder)

tampilkan lokasi kita : pwd

bersihin history command : clear

berpindah ke folder yang sudah dibuat : cd (nama folder)

buat file baru : touch (nama file)
touch bisa digunakan  untuk membuat bbrp file langsung
misal : touch drinks.txt snacks.txt

nambahkan konte dalam file :
1. buka vscode, tambahin konten
2. echo "(konten)" = ini fugsinya mirip print (keluarinoutput)
kalau mau buat isi konten ke file yang dituju :
echo "(konten)" > (nama file)

liat isi konten di file : cat (nama file)

mau pindah ke folder sebelumnya/parent : cd .. 

nama file/folder yang mengandung spasi pakai petik satu atau dua : mkdir "(nama file/folder)"

pindah ke home : cd .. atau cd atau cd home

--- operasi ---
mengopi file ke folder tertentu : cp (nama file) ./(nama folder)

pindahkan file : mv (nama file) ./(nama folder)/
command mv bisa untuk rename file
ganti nama : mv (nama file) ./(nama file baru)

isi atau edit file : nano (nama file)
nano spt notepad tp bisa diakses di terminal
klo save : ctrl x, ctrl y, enter

hapus file : rm (nama file)

hapus folder : rmdir (nama)
cek dulu foldernya kosong engga, klo ga kosong ga bisa
- hapus folder yang ada konten/file di dalamnya : rm -fr (nama folder)

menyalin direktori beserta isinya : cp -r (nama folder yang disalin) ./(nama folder yang dijadikan tempat salinan)
-r artinya rekursif (beserta file didalamnya)

tambahkan konten ke file tertentu : echo "(isi konten)" > (nama file tertentu)
tambahkan konten baru dan ingin konten sebelumnya masih ada ke file tertentu : echo "konten" >> (nama file tertentu)
kalau cuma > itu untuk file yang kosong trs mau isi konten baru atau untuk ganti isi konten lama dengan konten baru 

melihat info lengkap : ls -al
yang diawali d : direktori atau folder
yang diawali - : file 

rwx : jenis akses yang bisa dilakukan
r read, w write, x bisa dieksekusi
contoh :
-(rw-)(rw-)(r--) : jenis file atau folder (user/owner dan aksesnya)(group dan aksesnya)(others dan aksesnya) klo aksesnya - berarti gaada akses/gabisa akses

mengubah akses suatu file : 
notasi bisa pakai angka atau huruf abjad
- misal pake abjad :
chmod (akses untuk siapa)(+/-)(bisa akses apa) (nama file apa) : 
chmod o+w food.txt
chmod g-w,o-w food.txt
- misal pakai angka :
chmod (angka usr-anga group-angka others) (nama file)
r w x
0 0 0
0 0 1
0 1 0
0 1 1
1 0 0
1 0 1
1 1 0
1 1 1


menampilkan list file tertentu lengkap di folder pakai grep : ls -al | grep (nama file)


chmod -H untuk folder cocoknya (dan isi filenya berubah juga aksesnya) 
contoh : 
chmod -H g-w copied.txt

date utk tanggal

cal utk kelender 

ps utk proses

curl kirim sebuah req
curls -X(GET) '(urlnya)

tree itu untuk liat tree folder


bisa gabungin rangkaian command dengan shell script 
ada dua cara buat shell script buat di text editor atau langsung
- bua vscode, buka dengan code .
- buat file nya dulu, *.sh misal task.sh
- tentuin jenis shell nya 
#!/bin/sh
tambahin komentar pakai #
- tampilkan pesan terbuka
- buat rangkaian commandnya
-- buat folder
-- buat file
-- pisahkan file ke folder
- tampilkan pesan komplit
- sebelum dijalankan itu tambahkan dulu hak akses untuk eksekusinya (penting untuk shell script)
chmod +x task.sh
- eksekusi
./task.sh

misal :
#!/bin/sh

#

#create two folder
mkdir first_folder
mkdir second_folder

# create two files
touch first_file.txt
touch second_file.txt

# move two files 
mv first_file.txt ./first_folder
mv second_file.txt ./second_folder

#
echo "task complete 


cara kedua selain pakai text editor vscode, pakai text editor yang ada di situ
-buat file baru dan langsung buka
nano automation.sh
- isi konten dengan yang tadi juga isinya (rangkaian command pokoknya)
misal yang beda #assgin some contents to file
echo "my .." > courses.txt
sblm move
trs ending message
- ctrl x, ctrl y, enter
- chmmod +x automation.sh



