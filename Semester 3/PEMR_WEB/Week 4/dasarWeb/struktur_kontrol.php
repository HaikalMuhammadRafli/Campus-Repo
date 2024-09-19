<?php
// part 1
$nilaiNumerik = 92;

if ($nilaiNumerik >= 90 && $nilaiNumerik <= 100) {
    echo "Nilai huruf: A";
} else if ($nilaiNumerik >= 80 && $nilaiNumerik < 90) {
    echo "Nilai huruf: B";
} else if ($nilaiNumerik >= 70 && $nilaiNumerik < 80) {
    echo "Nilai huruf: C";
} else if ($nilaiNumerik < 80) {
    echo "Nilai huruf: D";
}

echo "<br><br>";

// part 2
$jarakSaatIni = 0;
$jarakTarget = 500;
$peningkatanHarian = 30;
$hari = 0;

while ($jarakSaatIni < $jarakTarget) {
    $jarakSaatIni += $peningkatanHarian;
    $hari++;
}

echo "Atlet tersebut memerlukan $hari hari untuk mencapai jarak 500 kilometer.";

echo "<br><br>";

// part 3
$jumlahLahan = 10;
$tanamanPerLahan = 5;
$buahPerTanaman = 10;
$jumlahBuah = 0;

for ($i = 1; $i <= $jumlahLahan; $i++) {
    $jumlahBuah += ($tanamanPerLahan * $buahPerTanaman);
}

echo "Jumlah buah yang akan dipanen adalah : $jumlahBuah";

echo "<br><br>";

// part 4
$skorUjian = [85, 92, 78, 96, 88];
$totalSkor = 0;

foreach ($skorUjian as $skor) {
    $totalSkor += $skor;
}

echo "Total skor ujian adalah : $totalSkor";

echo "<br><br>";

// part 5
$nilaiSiswa = [85, 92, 58, 64, 90, 55, 88, 79, 70, 96];

foreach ($nilaiSiswa as $nilai) {
    if ($nilai < 60) {
        echo "Nilai : $nilai (Tidak lulus) <br>";
        continue;
    }

    echo "Nilai : $nilai (Lulus) <br>";
}

echo "<br><br>";

// soal cerita 1 (haikal)
$nilaiUjianMtk = [85, 92, 78, 64, 90, 75, 88, 79, 70, 96];
$total = 0;

echo "Nilai Ujian Matematika : <br>";
foreach ($nilaiUjianMtk as $nilai) {
    echo "$nilai ";
}
echo "<br><br>";

sort($nilaiUjianMtk);

for ($i = 0; $i < count($nilaiUjianMtk); $i++) {
    if ($i > 2 && $i < (count($nilaiUjianMtk) - 2)) {
        $total += $nilaiUjianMtk[$i];
    }
}

$nilaiAvg = $total / (count($nilaiUjianMtk) - 4);
echo "Nilai rata-rata : $nilaiAvg";
echo "<br><br>";

// soal cerita 2 (haikal)
$diskon = 0.2;
$hargaProduk = 120000;

if ($hargaProduk > 100000) {
    $hargaDiskon = $hargaProduk * $diskon;
    $totalBeli = $hargaProduk - $hargaDiskon;
}

echo "Harga Produk  : $hargaProduk <br>";
echo "Harga diskon  : $hargaDiskon <br>";
echo "Total Beli    : $totalBeli <br>";
echo "<br>";

// soal cerita 3 (haikal)
$poin = 888;
echo "Total skor pemain : $poin <br>";
echo "Apakah pemain mendapatkan hadiah tambahan?";
echo ($poin > 500) ? " Iyaa" : " Tidak";
echo "<br><br>";
?>