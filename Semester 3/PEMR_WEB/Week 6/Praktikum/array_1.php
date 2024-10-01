<!DOCTYPE html>
<html>

<head></head>

<body>
    <h2>Array Terindeks</h2>
    <?php
    $listDosen = ["Elok Nur Hamdana", "Unggul Pamenang", "Bagas Nugraha"];
    echo $listDosen[2] . "<br>";
    echo $listDosen[0] . "<br>";
    echo $listDosen[1] . "<br>";

    echo "<br> <b>Menggunakan Perulangan :</b> <br>";
    foreach ($listDosen as $dosen) {
        echo $dosen . "<br>";
    }
    ?>
</body>

</html>