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