# daspro-jobsheet8

Pertanyaan percobaan 1
1. Jika pada perulangan for, inisialisasi i=1 diubah menjadi i=0, apa yang akibatnya? Mengapa bisa demikian?
Jawab : mengubah inisialisasi i=1 menjadi i=0 akan berakibat pada perubahan dalam urutan data yang diproses atau mengakses data yang salah jika program bergantung pada indeks tertentu. hal ini dapat terjadi karena inisialisasi i=0 membuat perulangan menghitung dari titik awal (indeks ke-0) dalam sebuah koleksi data, seperti array atau String, sedangan i=1 memulai dari elemen kedua.
setelah inisialisasi, perulangan memeriksa kondisi. jika kondisi benar, blok kode di dalam perulangan akan dieksekusi, dan variabel i akan diperbarui (misalnya, i++). perbedaan dalam inisialisasi akan terus berlanjut melalui setiap iterasi, karena nilai awal i yang berbeda akan mempengaruhi setiap langkah berikutnya.
2. Jika pada perulangan for, kondisi i<=N diubah menjadi i>N, apa akibatnya? Mengapa bisa demikian?
Jawab : jika pada perulangan for, kondisi i<=N diubah menjadi i>N akan mengakibatkan perulangan tersebut tidak akan dieksekusi sama sekali (atau dilewati) pada iterasi pertamanya. hal ini dapat terjadi karena cara kerja perulangan for pada umumnya yang melakukan evaluasi kondisi sebelum mengeksekusi badan perulangan pada setiap iterasinya. jadi ada 3 proses dalam perulangan for untuk kondisi seperti ini, yaitu:
  (1) evaluasi kondisi awal. ketika perulangan for dimulai, kondisi (i>N) segera dievaluasi.
  (2) Kondisi langsung salah (false). biasanya nilai i tidak lebih besar dari N.
  (3) penghentian perulangan. perulangan for akan terus bejalan jika kondisinya true, namun jika kondisinya false akan berhenti.
3. Jika pada perulangan for, kondisi step i++ diubah menjadi i-- apa akibatnya? Mengapa bisa demikian?
Jawab : mengubah kondisi step i++ menjadi i-- di perulangan for akan mengakibatkan 2 hal berdasarkan kondisinya, yaitu:
a. perulangan tak terbatas (infinite loop) untuk nenambah nilai i. hal ini dikarenakan arah yang berlawanan, kondisi yang selalu benar (true), dan tidak pernah mencapai kondisi henti.
b. perulangan yang segera berhenti/tidak berjalan untuk mengurangi nilai i. hal ini dapat terjadi karena kondisi yang tepat dan kondisi langsung salah.
jadi, mengubah i++ menjadi i-- tanpa mengubah kondisi perulangan yang sesuai akan menyebabkan nilai variabel kontrol (i) bergerak ke arah yang salah, sehingga kondisi penghentian perulangan tidak akan pernah tercapai, memicu perulangan tak terbatas. 

Pertanyaan percobaan 2
1. Perhatikan perulangan luar. Jika pada sintaks for, inisialisasi iOuter=1 diubah menjadi iOuter=0, apa yang akibatnya? Mengapa bisa demikian?
Jawab : jika inisialisasi iOuter=1 diubah menjadi iOuter=0, maka jumlah baris bintang yang dicetak akan bertambah satu. Hal ini terjadi karena perulangan luar akan berjalan sebanyak N+1 kali (dimulai dari 0 hingga N), bukan N kali seperti semula (1 hingga N). jadi, perubahan nilai awal iOuter mempengaruhi jumlah baris (tinggi) persegi bintang yang dicetak karena iOuter mengendalikan perulangan luar.
2. Kembalikan program semula dimana inisialisasi iOuter=1. Kemudian perhatikan perulangan dalam, Jika pada sintaks for, inisialisasi i=1 diubah menjadi i=0, apa yang akibatnya? Mengapa bisa demikian?
Jawab : jika inisialisasi i diubah menjadi 0, maka jumlah bintang per baris akan bertambah satu. perulangan dalam akan berjalan N+1 kali (dimulai dari 0 hingga N), bukan N kali (1 hingga N).
3. Jadi, apakah perbedaan kegunaan antara perulangan luar dengan perulangan yang berada di dalamnya?
Jawab : berikut perbedaan kegunaan antara perulangan luar dan perulangan di dalamnya:
- perulangan luar (iOuter) berfungsi untuk mengatur jumlah baris yang akan di cetak. setiap kali perulangan luar berjalan satu kali, program mencetak satu baris penuh bintang.
- perulangan dalam (i) berfungsi untuk mengatur jumlah bintang dalam satu baris (jumlah kolom). setiap kali perulangan dalam selesai, barulah program pindah ke baris berikutnya.
jadi, perulangan luar untuk baris dan perulangan dalam untuk kolom (isi baris).
4. Mengapa perlu ditambahkan sintaks System.out.println(); di bawah perulangan dalam? Apa akibatnya jika sintaks tersebut dihilangkan?
Jawab : sintaks System.out.println(); perlu ditambahkan di bawah perulangan dalam karena berfungsi untuk memindahkan kursor ke baris baru setelah satu baris bintang selesai dicetak. jika perintah ini dihapus, maka seluruh bintang akan dicetak dalam satu baris panjang tanpa pindah ke baris berikutnya.
5. Silakan commit dan push ke repository Anda.

Pertanyaan percobaan 3
1. Perhatikan, apakah output yang dihasilkan dengan nilai N=5 sesuai dengan tampilan berikut?
*
**
***
****
*****
Jawab : program tersebut tidak menghasilkan pola segitiga seperti yang diinginkan. semua bintang dicetak dalam satu baris panjang, tanpa berpindah ke baris berikutnya.