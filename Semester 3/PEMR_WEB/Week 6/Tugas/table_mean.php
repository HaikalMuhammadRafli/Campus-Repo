<!DOCTYPE html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="jquery-3.7.1.js"></script>
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

        button {
            width: 100%;
            padding: 10px;
            font-size: 12pt;
            border: 0;
            border-radius: 15px;
            background-color: #FFDE4D;
        }

        button:hover {
            background-color: #FFB22C;
        }

        div.divider {
            margin: 10px auto;
        }
    </style>

    <script>
        let isExpanded = false

        $(document).ready(() => {
            $('#toggle').click(() => {
                if (!isExpanded) {
                    $('#toggle').text("Click to hide!")
                    isExpanded = true
                } else {
                    $('#toggle').text("Click to show!")
                    isExpanded = false
                }

                $('#table-box').slideToggle('slow')
            })
        })
    </script>
</head>

<body>
    <h1>DATA SISWA</h1>
    <button type="button" id="toggle">Click to show!</button>
    <div class="divider"></div>
    <div id="table-box" style="display: none;">
        <table>
            <tr>
                <th>NAMA</th>
                <th>UMUR</th>
                <th>KELAS</th>
                <th>ALAMAT</th>
            </tr>
            <?php
            $daftarSiswa = [
                ["Andi", "15", "10A", "Malang"],
                ["Haikal", "16", "10B", "Surabaya"],
                ["Joko", "15", "10A", "Pandaan"],
                ["Dafa", "25", "15A", "Sidoarjo"]
            ];

            foreach ($daftarSiswa as $siswa) {
                echo "<tr>";
                echo "<td>{$siswa[0]}</td>";
                echo "<td>{$siswa[1]}</td>";
                echo "<td>{$siswa[2]}</td>";
                echo "<td>{$siswa[3]}</td>";
                echo "</tr>";
            }
            ?>
        </table>
        <?php
        $totalUmur = 0;

        foreach ($daftarSiswa as $siswa) {
            // menghitung total umur semua siswa
            $totalUmur += $siswa[1];
        }

        $mean = $totalUmur / count($daftarSiswa);
        echo "<h2>RATA-RATA UMUR SISWA : {$mean} tahun</h2>"
        ?>
    </div>
    <hr>
    <h2 style="text-align: center;">^</h2>

    <script></script>
</body>

</html>