Feature: Pay Transaksi with Rek Bank
  As a user
  I want pay the transaksi
  So I can pay transaksi

  Scenario: Pay transaksi status Menunggu Konfirmasi with Rek BNI
    Given i haved login
    And click button bill
    And on the Transaksi page
    And see status Menunggu Konfirmasi
    When filtered status Menunggu Konfirmasi
    And click status Menunggu Konfirmasi
    And click button pay now
    And click button Yakin
    And click button Rekening Bank
    And click opsi BNI
    And click button lanjutkan
    And click kirim bukti bayar
    And click button kirim
    Then see Pembayaran Berhasil
    And click download invoice

  Scenario: Pay transaksi status Menunggu Konfirmasi with Rek BRI
    Given i haved login
    And click button bill
    And on the Transaksi page
    And see status Menunggu Konfirmasi
    When filtered status Menunggu Konfirmasi
    And click status Menunggu Konfirmasi
    And click button pay now
    And click button Yakin
    And click button Rekening Bank
    And click opsi BRI
    And click button lanjutkan
    And click kirim bukti bayar
    And click button kirim
    Then see Pembayaran Berhasil
    And click download invoice

  Scenario: Pay transaksi status Menunggu Konfirmasi with Rek BCA
    Given i haved login
    And click button bill
    And on the Transaksi page
    And see status Menunggu Konfirmasi
    When filtered status Menunggu Konfirmasi
    And click status Menunggu Konfirmasi
    And click button pay now
    And click button Yakin
    And click button Rekening Bank
    And click opsi BCA
    And click button lanjutkan
    And click kirim bukti bayar
    And click button kirim
    Then see Pembayaran Berhasil
    And click download invoice

  Scenario: Pay transaksi status Menunggu Konfirmasi with Rek Mandiri
    Given i haved login
    And click button bill
    And on the Transaksi page
    And see status Menunggu Konfirmasi
    When filtered status Menunggu Konfirmasi
    And click status Menunggu Konfirmasi
    And click button pay now
    And click button Yakin
    And click button Rekening Bank
    And click opsi Mandiri
    And click button lanjutkan
    And click kirim bukti bayar
    And click button kirim
    Then see Pembayaran Berhasil
    And click download invoice

  Scenario: Pay transaksi status Menunggu Konfirmasi with Rek BSI
    Given i haved login
    And click button bill
    And on the Transaksi page
    And see status Menunggu Konfirmasi
    When filtered status Menunggu Konfirmasi
    And click status Menunggu Konfirmasi
    And click button pay now
    And click button Yakin
    And click button Rekening Bank
    And click opsi BSI
    And click button lanjutkan
    And click kirim bukti bayar
    And click button kirim
    Then see Pembayaran Berhasil
    And click download invoice

  Scenario: Pay transaksi status Menunggu Konfirmasi with Rek Jenius
    Given i haved login
    And click button bill
    And on the Transaksi page
    And see status Menunggu Konfirmasi
    When filtered status Menunggu Konfirmasi
    And click status Menunggu Konfirmasi
    And click button pay now
    And click button Yakin
    And click button Rekening Bank
    And click opsi Jenius
    And click button lanjutkan
    And click kirim bukti bayar
    And click button kirim
    Then see Pembayaran Berhasil
    And click download invoice

  Scenario: Pay transaksi status Menunggu Konfirmasi with Rek CIMB
    Given i haved login
    And click button bill
    And on the Transaksi page
    And see status Menunggu Konfirmasi
    When filtered status Menunggu Konfirmasi
    And click status Menunggu Konfirmasi
    And click button pay now
    And click button Yakin
    And click button Rekening Bank
    And click opsi CIMB
    And click button lanjutkan
    And click kirim bukti bayar
    And click button kirim
    Then see Pembayaran Berhasil
    And click download invoice