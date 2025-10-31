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