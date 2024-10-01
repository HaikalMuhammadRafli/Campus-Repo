<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Array 2</title>

    <style>
        table {
            font-family: Arial, Helvetica, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        th,
        td {
            border: 1px solid black;
            text-align: left;
            padding: 10px;
        }

        .table-head {
            background-color: lightgrey;
        }
    </style>
</head>

<body>
    <?php
    $dosen = [
        'nama' => 'Elok Nur Hamdana',
        'domisili' => 'Malang',
        'jenis_kelamin' => 'Perempuan'
    ];
    echo "<table>";
    echo "<tr>";
    echo '<th colspan="2" class="table-head">IDENTITAS DOSEN</th>';
    echo "</tr>";
    echo "<tr>";
    echo "<th>NAMA</th>";
    echo "<td>{$dosen['nama']}</td>";
    echo "</tr>";
    echo "<tr>";
    echo "<th>DOMISILI</th>";
    echo "<td>{$dosen['domisili']}</td>";
    echo "</tr>";
    echo "<tr>";
    echo "<th>JENIS KELAMIN</th>";
    echo "<td>{$dosen['jenis_kelamin']}</td>";
    echo "</tr>";
    echo "</table>";
    ?>
</body>

</html>