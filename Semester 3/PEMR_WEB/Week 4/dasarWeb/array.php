<?php
//part 1
$nilaiSiswa = [85, 92, 78, 64, 90, 55, 88, 79, 70, 96];
$nilaiLulus = [];

foreach ($nilaiSiswa as $nilai) {
    if ($nilai >= 70) {
        $nilaiLulus[] = $nilai;
    }
}

echo "Daftar nilai siswa yang lulus: " . implode(', ', $nilaiLulus);
echo "<br><br>";

$daftarKaryawan = [
    ['Alice', 7],
    ['Bob', 3],
    ['Charlie', 9],
    ['David', 5],
    ['Eva', 6]
];

$karyawanPengalamanLimaTahun = [];

foreach ($daftarKaryawan as $karyawan) {
    if ($karyawan[1] > 5) {
        $karyawanPengalamanLimaTahun[] = $karyawan[0];
    }
}

echo "Daftar karyawan dengan pengalaman kerja lebih dari 5 tahun: " . implode(', ', $karyawanPengalamanLimaTahun);
echo "<br><br>";

// part 2
$daftarNilai = [
    'Matematika' => [
        ['Alice', 85],
        ['Bob', 92],
        ['Charlie', 78],
    ],
    'Fisika' => [
        ['Alice', 90],
        ['Bob', 88],
        ['Charlie', 75],
    ],
    'Kimia' => [
        ['Alice', 92],
        ['Bob', 80],
        ['Charlie', 85],
    ],
];

$mataKuliah = 'Fisika';

echo "Daftar nilai mahasiswa dalam mata kuliah $mataKuliah : <br>";

foreach ($daftarNilai[$mataKuliah] as $nilai) {
    echo "Nama: {$nilai[0]}, Nilai : {$nilai[1]} <br>";
}
echo "<br>";

// soal cerita (haikal)
$daftarSiswa = [
    ['Alice', 85],
    ['Rob', 92],
    ['Charlie', 78],
    ['David', 64],
    ['Eva', 90]
];

$nilaiAvg = 0;
$nilaiTotal = 0;

// menghitung total nilai untuk nilai average
foreach ($daftarSiswa as $siswa) {
    $nilaiTotal += $siswa[1];
}

// menghitung nilai average total / jumlah nilai
$nilaiAvg = $nilaiTotal / count($daftarSiswa);

echo "Daftar siswa yang memiliki nilai diatas rata-rata ($nilaiAvg) : <br>";
foreach ($daftarSiswa as $siswa) {
    echo ($siswa[1] > $nilaiAvg) ? "Nama: {$siswa[0]}, Nilai: {$siswa[1]} <br>" : "";
}
?>