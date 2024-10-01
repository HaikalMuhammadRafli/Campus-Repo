<!DOCTYPE html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Multidimensional Array</title>

    <style>
        li {
            font-size: 14pt;
        }
    </style>
</head>

<body>
    <h1>DATA MAHASISWA ARRAY MULTIDIMENSI</h1>

    <?php
    $mahasiswa = [
        ["nama" => "Dina", "nim" => "123456", "jurusan" => "Teknik Kimia", "email" => "dina@gmail.com"],
        ["nama" => "Din0", "nim" => "9123124", "jurusan" => "Teknik Listrik", "email" => "dino@gmail.com"],
    ];
    foreach ($mahasiswa as $x) {
        echo "<ul>";
        echo "<li>Nama : {$x["nama"]}</li>";
        echo "<li>NIM : {$x["nim"]}</li>";
        echo "<li>Jurusan : {$x["jurusan"]}</li>";
        echo "<li>Email : {$x["email"]}</li>";
        echo "</ul>";
        echo "<br>";
    }
    ?>
</body>

</html>