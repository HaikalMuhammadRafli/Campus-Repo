<!DOCTYPE html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Table Data Siswa</title>

    <style>
        table {
            border-collapse: collapse;
            width: 100%;
        }

        th,
        td {
            text-align: left;
            border: 1px solid #ddd;
            padding: 10px;
        }
    </style>
</head>

<body>
    <h1>DATA SISWA</h1>
    <?php
    $daftarSiswa = [
        ["Andi", "15", "10A", "Malang"],
        ["Haikal", "16", "10B", "Surabaya"],
        ["Joko", "15", "10A", "Pandaan"],
        ["Dafa", "25", "15A", "Sidoarjo"]
    ];

    $totalUmur = 0;

    echo "<table>";
    echo "<tr>";
    echo "<th>NAMA</th>";
    echo "<th>UMUR</th>";
    echo "<th>KELAS</th>";
    echo "<th>ALAMAT</th>";
    echo "</tr>";

    foreach ($daftarSiswa as $siswa) {
        echo "<tr>";
        echo "<td>{$siswa[0]}</td>";
        echo "<td>{$siswa[1]}</td>";
        echo "<td>{$siswa[2]}</td>";
        echo "<td>{$siswa[3]}</td>";
        echo "</tr>";

        // menghitung total umur semua siswa
        $totalUmur += $siswa[1];
    }

    echo "</table>";

    $mean = $totalUmur / count($daftarSiswa);

    echo "<h2>RATA-RATA UMUR SISWA : {$mean} tahun</h2>"
    ?>
</body>

</html>