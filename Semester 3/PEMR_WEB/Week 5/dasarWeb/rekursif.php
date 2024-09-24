<?php
// part 1
function tampilkanHaloDunia()
{
    echo "Halo dunia! <br>";

    // tampilkanHaloDunia();
}

tampilkanHaloDunia();
echo "<br><br><hr>";

// part 2
for ($i = 1; $i <= 25; $i++) {
    echo "Perulangan ke-{$i} <br>";
}

function tampilkanAngka(int $jumlah, int $indeks = 1)
{
    echo "Perulangan ke-{$indeks} <br>";

    if ($indeks < $jumlah) {
        tampilkanAngka($jumlah, $indeks + 1);
    }
}

tampilkanAngka(20);

// part 3
$menu = [
    [
        "nama" => "Beranda"
    ],
    [
        "nama" => "Berita",
        "subMenu" => [
            [
                "nama" => "Wisata",
                "subMenu" => [
                    [
                        "nama" => "Pantai"
                    ],
                    [
                        "nama" => "Gunung"
                    ]
                ]
            ],
            [
                "nama" => "Kuliner"
            ],
            [
                "nama" => "Hiburan"
            ]
        ]
    ],
    [
        "nama" => "Tentang"
    ],
    [
        "nama" => "Kontak"

    ]
];

// tugas (haikal)
function tampilkanMenuBertingkat(array $menu)
{
    echo "<ul>";
    foreach ($menu as $item) {
        echo "<li>{$item['nama']}</li>";

        if (!empty($item['subMenu'])) {
            echo "<ul>";
            foreach ($item['subMenu'] as $sub) {
                echo "<li>{$sub['nama']}</li>";

                if (!empty($sub['subMenu'])) {
                    echo "<ul>";
                    foreach ($sub['subMenu'] as $sub2) {
                        echo "<li>{$sub2['nama']}</li>";
                    }
                    echo "</ul>";
                }
            }
            echo "</ul>";
        }
    }
    echo "</ul>";
}

tampilkanMenuBertingkat($menu);
