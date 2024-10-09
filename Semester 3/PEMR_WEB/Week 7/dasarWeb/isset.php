<?php
// part 1
$umur;

if (isset($umur) && $umur >= 18) {
    echo "Anda sudah dewasa.";
} else {
    echo "Anda belum dewasa atau variable 'umur' tidak ditemukan.";
}
echo "<br><br>";

//part 2
$data = array("nama" => "Jane", "usia" => 25);

if (isset($data["nama"])) {
    echo "Nama : " . $data["nama"];
} else {
    echo "Variable 'nama' tidak ditemukan dalam array.";
}
