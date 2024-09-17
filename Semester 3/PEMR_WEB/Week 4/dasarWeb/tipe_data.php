<?php
// part 1
$a = 10;
$b = 5;
$c = $a + 5;
$d = $b + (10 * 5);
$e = $d -$c;

echo "Variable a : {$a} <br>";
echo "Variable b : {$b} <br>";
echo "Variable c : {$c} <br>";
echo "Variable d : {$d} <br>";
echo "Variable e : {$e} <br>";

var_dump($e);

// part 2
$nilaiMatematika = 5.1;
$nilaiIPA = 6.7;
$nilaiBahasaIndonesia = 9.3;

$rata_rata = ($nilaiMatematika + $nilaiIPA + $nilaiBahasaIndonesia) / 3;

echo "Matematika            : {$nilaiMatematika} <br>";
echo "IPA                   : {$nilaiIPA} <br>";
echo "Bahasa Indonesia      : {$nilaiBahasaIndonesia} <br>";
echo "Rata-rata             : {$rata_rata} <br>";

var_dump($rata_rata);

// part 3
$apakahSiswaLulus = true;
$apakahSiswaSudahUjian = false;

var_dump($apakahSiswaLulus);
echo "<br>";
var_dump($apakahSiswaSudahUjian);

// part 4
$namaDepan = "Ibnu";
$namaBelakang = 'Jakaria';

$namaLengkap = "{$namaDepan} {$namaBelakang}";
$namaLengkap2 = $namaDepan . ' ' . $namaBelakang;

echo "Nama Depan : {$namaDepan} <br>";
echo 'Nama Belakang : ' . $namaBelakang > '<br>';

echo $namaLengkap;

// part 5
$listMahasiswa = ["Wahid Abdullah", "Elmo Bachtiar", "Lendis Fabri"];
echo $listMahasiswa[0];
?>