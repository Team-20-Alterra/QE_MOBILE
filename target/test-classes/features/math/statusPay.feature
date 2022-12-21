@aksesInvoice
Feature: Bill page
  As a user
  I want see Bill
  So I can see Bill

  Scenario: See all Transaksi
    Given i haved login
    When click button bill
    And on the Transaksi page
    Then i see all transaksi

  Scenario: See transaksi status Gagal
    Given i haved login
    When click button bill
    And on the Transaksi page
    And filtered status Gagal
    Then see status Gagal

  Scenario: See transaksi status Dalam Proses
    Given i haved login
    When click button bill
    And on the Transaksi page
    And filtered status Dalam Proses
    Then see status Dalam Proses

  Scenario: See transaksi status Menunggu Konfirmasi
    Given i haved login
    When click button bill
    And on the Transaksi page
    And filtered status Menunggu Konfirmasi
    Then see status Menunggu Konfirmasi

  Scenario: See all Selesai
    Given i haved login
    When click button bill
    And on the Selesai page
    Then see all transaksi Berhasil

