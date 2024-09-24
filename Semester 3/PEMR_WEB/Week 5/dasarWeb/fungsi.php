<?php
// part 1
function Perkenalan($nama, $salam = "Assalamu'alaikum")
{
    echo $salam . ", ";
    echo "Perkenalkan, nama saya " . $nama . " <br>";
    echo "Senang berkenalan dengan Anda <br>";
}

Perkenalan("Hamdana", "Hallo");

echo "<hr>";

$saya = "Elok";
$ucapanSalam = "Selamat Pagi";

Perkenalan($saya);

echo "<br><br><hr>";
// part 2
function hitungUmur($thn_lahir, $thn_sekarang)
{
    $umur = $thn_sekarang - $thn_lahir;
    return $umur;
}

function Perkenalan2($nama, $salam = "Assalamu'alaikum")
{
    echo $salam . ", ";
    echo "Perkenalkan, nama saya " . $nama . " <br>";

    echo "Saya berusia " . hitungUmur(2005, 2024) . " tahun <br>";
    echo "Senang berkenalan dengan Anda <br>";
}

Perkenalan2("Elok");
