<?php

class Model
{

    private $_dbConnection;

    public function __construct()
    {
        $dsn = 'mysql:host=localhost;dbname=buku_kontak';
        $this->_dbConnection = new PDO($dsn, 'root', '');
    }

    public function get()
    {
        $sql = "SELECT * FROM kontak";

        $stmt = $this->_dbConnection->prepare($sql);
        $success = $stmt->execute();

        if ($success) {
            return $stmt->fetchAll(PDO::FETCH_ASSOC);
        }

        return [];
    }

    public function store($nama, $nomorTelepon, $email, $alamat)
    {
        $sql = "INSERT INTO kontak (nama, nomor_telpon, email, alamat) VALUES ('$nama', '$nomorTelepon', '$email', '$alamat',)";
        $this->_dbConnection->exec($sql);
    }
}