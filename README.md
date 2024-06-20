# Soal test maggang Backend engineer dengan Springboot

Berikut adalah soal/pertanyaan yang perlu dijawab oleh peserta maggang

## knowledge base

1. Apa yang anda ketahui tentang Rest API?
2. Apa yang anda ketahui tentang Server side and Client side processing?
3. Apa yang anda ketahui tentang Monolith dan Microservices, berikan contohnya?
4. Apa yang anda ketahui tentang Design pattern inversion of Control serta Dependency Injection?
5. Apa yang anda ketahui tentang Java programming dan Spring framework khususnya spring-boot?

## Design modules

Dalam suatu schenario ada requirement membuat aplikasi e-commerse seperti Tokopedia seperti berikut:

1. Catalog, pelanggan mencari product di toko
    ![catalog](imgs/catalog.png)
2. Item, bisa melihat detail informasi produk
    ![items](imgs/item.png)
3. Cart, pelanggan bisa menambahkan produk yang ingin di beli ke keranjang
    ![cart](imgs/cart.png)
4. Setelah di checkout, masuk ke list transaction
    ![list-transaction](imgs/list-transaction.png)
5. Kita juga bisa liat detail transactionya
    ![detail-transaction](imgs/detail-transaction.png)

Kemudian temen-temen buat design database, module (monolith/microservices) berdasarkan gambar atau schenario tersebut. Serta jelakan mengapa menggunakan design tersebut.

## Praktek

Berdasarkan analisa tersebut, buat project monorepo (pada repository ini) dengan menggunakan framework springboot seperti berikut specifikasinya:

- Database: `PostgreSQL 15`
- JDK version: `Oracle JDK 17 or later`
- Springboot version: `3.0.x`

terkait design system Toko, Barang, Pembelian pada ecommerse tersebut.

## Jawaban Knowledge base
1.	Rest sendiri kepanjangan dari Representational state transfer yang merupakan standar arsitektur basis web dengan protocol HTTP agar berkomunikasi data. Istilah nya REST merupakan salah satu Janis desain arditektur dalam pembuatan API. API sendiri merupakan kepanjangan dari Application Programming Interface, program penghubung antar aplikasi agar bisa terjadi penerimaan atau pengiriman data supaya pertukaran informasi dapat berhasil dilakukan. Sedangkan fungsi dari Rest API yakni untuk menyediakan standart cara untuk klien seperti aplikasi seluler, browser web, sistem perangkat lunak dan yang lainnya untuk meminta informasi data, serta memungkinkan sistem pada perangkat lunak berbeda dapat bertukar data atau berkomunikasi melalui web.
2.	Server side sendiri merupakan program yang berjalan di server yang menangani pembuatan konten halaman website server side juga biasa diartikan sebagai backend scripting. Sedangkan client side terjadi di browser pengguna dan melibatkaan pemrosesan dan manipulasi data pada sisi klien. Server side dan juga client side sama-sama dibutuhkan dalam pengembangan website, meskipun kode yang digunakan berbeda namun kedua program tersebut perlu dijalankan agar website dapat berfungsi dengan optimal.
3.	Monolith merupakan arsitektur Dimana keseluruhan kode akan dikompilasi menjadi satu aplikasi biasanya menjadi satu binary ataupun artifact Dimana aplikasi tersebut menjalankan seluruh proses yang dibutuhkan contoh seperti sistem operasi unix, linux. Sedangkan microservices sendiri merupakan arsitektur yang menekankan kepada banyak service atau aplikasi yang tidak terikat erat satu dengan lainnya, yang bertujuan sangat terfokus dan memiliki metode komunikasi antar service yang tidak berat contohnya seperti spotify, Netflix.
4.	Design pattern inversion of Control serta dependency injection merupakan konsep penting dalam desain perangkat lunak modern yang mendukung pengembangan aplikasi yang lebih modular, fleksibel, dan mudah diuji. Inversion of control mengalihkan control alur program dari komponen ke kerangka kerja, sedangkan dependency injection digunakan untuk menerapkan ioc dengan menginjeksi dependensi ke dalam komponen alih-alih membuat komponen yang akan mengelolahnya sendiri.
5.	Java dan spring framework khususnya sping boot merupakan suatu kombinasi yang sangat kuat dalam pengembangan sebuah aplikasi web modern. Java menyediakan fondasi Bahasa pemrograman yang solid dan platform independent sementara spring boot menyederhanakan pengelolaan dependensi, konfigurasi dan juga pengembangan aplikasi dengan menyediakan alat fitur yang efisien dan mudah digunakan.

##Design modules

Berikut merupakan desain database:
Tabel ‘toko’
•	‘id_toko’ (PK): Primary key toko
•	‘nama_toko’ : Nama toko
•	‘lokasi’ : Lokasi toko
	Tabel ‘produk’
•	‘id_produk’ (PK): Primary key produk
•	‘nama_produk’: Nama produk
•	‘Deskripsi’: Deskripsi produk
•	‘Harga’: Harga produk
•	‘id_toko (FK)’: Foreign key menghubungkan ke ‘toko’, menunjukkan toko mana yang menjual produk ini
	Tabel ‘keranjang’
•	‘id_keranjang ‘(PK): Primary key keranjang
•	‘id_pelanggan’ (FK): Foreign key menghubungkan ke ‘Pelanggan’, menunjukkan pelanggan mana yang memiliki keranjang ini
	Tabel ‘itemkeranjang’
•	‘id_item ‘(PK): Primary key item keranjang
•	‘id_keranjang’ (FK): Foreign key menghubungkan ke ‘Keranjang’, menunjukkan keranjang mana yang berisi item ini
•	‘id_produk’ (FK): Foreign key menghubungkan ke ‘Produk’, menunjukkan produk yang ada di dalam keranjang
•	‘Jumlah’: Jumlah produk yang ada di dalam keranjang
	Tabel ‘transaksi’
•	‘id_transaksi ‘(PK): Primary key transaksi
•	‘tanggal_transaksi’: Tanggal transaksi
•	‘id_pelanggan’ (FK): Foreign key menghubungkan ke ‘Pelanggan’, menunjukkan pelanggan yang melakukan transaksi ini
•	‘total_pembayaran’: Total pembayaran transaksi
	Tabel ‘DetailTransaksi’
•	‘id_detail_transaksi’ (PK): Primary key detail transaksi
•	‘id_transaksi’ (FK): Foreign key menghubungkan ke ‘Transaksi’, menunjukkan transaksi mana yang memiliki detail ini
•	‘id_produk’ (FK): Foreign key menghubungkan ke ‘Produk’, menunjukkan produk yang dibeli
•	‘Jumlah’: Jumlah produk yang dibeli pada transaksi ini
•	‘harga_satuan’: Harga satuan produk pada saat transaksi
Desain modul dalam konteks aplikasi e-commerce ini menggunakan desain mikroservices dengan modul-modul sebagai berikut:
1.	Catalog service
•	Bertanggung jawab atas operasi-operasi yang terkait katalog produk.
•	Menyediakan endpoint untuk mencari produk berdasarkan nama, kategori, dan lainnya.
•	Terhubung ke ‘produk’ untuk mengambil informasi detail produk.
2.	Item service
•	Menyediakan endpoint untuk melihat detail informasi produk.
•	Berkomunikasi dengan ‘produk’ untuk mendapatkan detail spesifik tentang produk.
3.	Cart service
•	Memungkinkan pengguna menambahkan produk ke dalam keranjang belanja.
•	Melibatkan ‘keranjang’ dan ‘itemkeranjang’ untuk mengelola keranjang belanja.
4.	Transaction service
•	Menangani operasi chekout dan proses pembelian.
•	Mengelola ‘transaksi’ dan ‘detailtransaksi’ untuk mencatat transaksi yang berhasil.
Alasan menggunakan desain microservice yakni skalabilitas dan pengembangan independen, jadi setiap layanan dapat dikelola secara terpisah. Hal ini memungkinkan untuk meningkatkan skalabilitas aplikasi dengan menambahkan instance layanan yang diperlukan. Dan juga setiap layanan memiliki tanggung jawab yang terdefinisi dengan baik, memudahkan pengembangan dan pemeliharaan. Setiap layanan nya juga dapat menggunakan teknologi yang paling sesuai dengan kebutuhannya, memungkinkan tim untuk memilih teknologi yang tepat tanpa membatasi keseluruhan aplikasi.

