<!--  -->

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Buku Kontak OOP</title>
    <!-- <script src="https://cdn.tailwindcss.com"></script> -->
</head>

<body>
    <!-- <h1><=$data['0']?></h1> -->

    <h1 style="color: cadetblue;">Buku Kontak Online v1.0 (Beta)</h1>
    <form action="index.php" method="post">
        <table>
            <tr>
                <td>
                    <label for="nama">Nama : </label>
                </td>
                <td>
                    <input type="text" name="nama">
                </td>
            </tr>
            <tr>
                <td>
                    <label for="nomor_telepon">Nomor Telepon : </label>
                </td>
                <td>
                    <input type="text" name="nomor_telepon">
                </td>
            </tr>
            <tr>
                <td>
                    <label for="email">email : </label>
                </td>
                <td>
                    <input type="email" name="email">
                </td>
            </tr>
            <tr>
                <td>
                    <label for="alamat">Alamat : </label>
                </td>
                <td>
                    <textarea name="alamat"></textarea>
                </td>
            </tr>
            <tr>
                <td>
                    <input type="submit" name="submit" value="Simpan">
                </td>
            </tr>
        </table>
    </form>

    <table>
        <thead>
            <tr>
                <th>NO</th>
                <th>NAMA</th>
                <th>NO TELEPON</th>
                <th>EMAIL</th>
                <th>ALAMAT</th>
            </tr>
        </thead>
        <tbody>
            <?php
            foreach ($daftarKontak as $kontak) { ?>
                <tr>
                    <td><?= $index ?></td>
                    <td><?= $kontak['nama'] ?></td>
                    <td><?= $kontak['nomor_telepon'] ?></td>
                    <td><?= $kontak['email'] ?></td>
                    <td><?= $kontak['alamat'] ?></td>
                </tr>
            <?php } ?>
        </tbody>
    </table>

</body>

</html>