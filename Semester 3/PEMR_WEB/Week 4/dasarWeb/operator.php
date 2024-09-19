<?php
// part 1
$a = 10;
$b = 5;

echo "Variabel a : $a <br>";
echo "Variabel b : $b <br>";
echo "<br>";

$hasilTambah = $a + $b;
$hasilKurang = $a - $b;
$hasilKali = $a * $b;
$hasilBagi = $a / $b;
$sisaBagi = $a % $b;
$pangkat = $a ** $b;

echo 'Hasil Tambah : ' . $hasilTambah . '<br>';
echo 'Hasil Kurang : ' . $hasilKurang . '<br>';
echo 'Hasil Kali   : ' . $hasilKali . '<br>';
echo 'Hasil Bagi   : ' . $hasilBagi . '<br>';
echo 'Sisa Bagi    : ' . $sisaBagi . '<br>';
echo 'Pangkat      : ' . $pangkat . '<br>';
echo "<br>";

// part 2
$hasilSama = $a == $b;
$hasilTidakSama = $a != $b;
$hasilLebihKecil = $a < $b;
$hasilLebihBesar = $a > $b;
$hasilLebihKecilSama = $a <= $b;
$hasilLebihBesarSama = $a >= $b;

echo 'Hasil Sama             : ' . $hasilSama . '<br>';
echo 'Hasil Tidak Sama       : ' . $hasilTidakSama . '<br>';
echo 'Hasil Lebih Kecil      : ' . $hasilLebihKecil . '<br>';
echo 'Hasil Lebih Besar      : ' . $hasilLebihBesar . '<br>';
echo 'Hasil Lebih Kecil Sama : ' . $hasilLebihKecilSama . '<br>';
echo 'Hasil Lebih Besar Sama : ' . $hasilLebihBesarSama . '<br>';
echo "<br>";

// part 3
$hasilAnd = $a && $b;
$hasilOr = $a || $b;
$hasilNotA = !$a;
$hasilNotB = !$b;

echo 'Hasil AND : ' . $hasilAnd . '<br>';
echo 'Hasil OR : ' . $hasilOr . '<br>';
echo 'Hasil NOT A : ' . $hasilNotA . '<br>';
echo 'Hasil NOT B : ' . $hasilNotB . '<br>';
echo "<br>";

// part 4
$a += $b;
echo 'Hasil $a += $b : ' . $a . '<br>';
$a -= $b;
echo 'Hasil $a -= $b : ' . $a . '<br>';
$a *= $b;
echo 'Hasil $a *= $b : ' . $a . '<br>';
$a /= $b;
echo 'Hasil $a /= $b : ' . $a . '<br>';
$a %= $b;
echo 'Hasil $a %= $b : ' . $a . '<br>';
echo "<br>";

// part 5
$hasilIdentik = $a === $b;
echo 'Hasil $a === $b : ' . $hasilIdentik . '<br>';
$hasilTidakIdentik = $a !== $b;
echo 'Hasil $a !== $b : ' . $hasilTidakIdentik . '<br>';
echo "<br>";

// soal cerita (haikal)
$kursi = 45;
$kursiTerpakai = 28;
$persentaseKursiKosong = (($kursi - $kursiTerpakai) / $kursi) * 100;

echo 'Persentase Kursi Kosong : ' . $persentaseKursiKosong . '% <br>';
?>