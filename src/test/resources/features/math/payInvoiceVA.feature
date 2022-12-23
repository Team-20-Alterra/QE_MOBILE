Feature: Pay Transaksi with Virtual Akun
  As a user
  I want pay the transaksi
  So I can pay transaksi

  Scenario: Pay transaksi status Menunggu Konfirmasi with BNI VA
    Given i open app
    And i haved login
    And click button bill
    And on the Transaksi page
    And see status Menunggu Konfirmasi
    When click status Menunggu Konfirmasi
    And click button pay now
    And click button Yakin
    And click button Virtual Akun
    And click opsi BNI VA
    And click button lanjutkan
    And click kirim bukti bayar
    And click button kirim
    Then see Pembayaran Berhasil
    And click download invoice

  Scenario: Pay transaksi status Menunggu Konfirmasi with BCA VA
    Given i open app
    And i haved login
    And click button bill
    And on the Transaksi page
    And see status Menunggu Konfirmasi
    When click status Menunggu Konfirmasi
    And click button pay now
    And click button Yakin
    And click button Virtual Akun
    And click opsi BCA VA
    And click button lanjutkan
    And click kirim bukti bayar
    And click button kirim
    Then see Pembayaran Berhasil
    And click download invoice

  Scenario: Pay transaksi status Menunggu Konfirmasi with BRI VA
    Given i open app
    And i haved login
    And click button bill
    And on the Transaksi page
    And see status Menunggu Konfirmasi
    When click status Menunggu Konfirmasi
    And click button pay now
    And click button Yakin
    And click button Virtual Akun
    And click opsi BRI VA
    And click button lanjutkan
    And click kirim bukti bayar
    And click button kirim
    Then see Pembayaran Berhasil
    And click download invoice

  Scenario: Pay transaksi status Menunggu Konfirmasi with Mandiri VA
    Given i open app
    And i haved login
    And click button bill
    And on the Transaksi page
    And see status Menunggu Konfirmasi
    When click status Menunggu Konfirmasi
    And click button pay now
    And click button Yakin
    And click button Virtual Akun
    And click opsi Mandiri VA
    And click button lanjutkan
    And click kirim bukti bayar
    And click button kirim
    Then see Pembayaran Berhasil
    And click download invoice

  Scenario: Pay transaksi status Menunggu Konfirmasi with CIMB VA
    Given i open app
    And i haved login
    And click button bill
    And on the Transaksi page
    And see status Menunggu Konfirmasi
    When click status Menunggu Konfirmasi
    And click button pay now
    And click button Yakin
    And click button Virtual Akun
    And click opsi CIMB VA
    And click button lanjutkan
    And click kirim bukti bayar
    And click button kirim
    Then see Pembayaran Berhasil
    And click download invoice