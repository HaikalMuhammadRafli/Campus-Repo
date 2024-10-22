<?php

include '../database/connection.php';

global $conn;

$id = $_GET['id'] ?? NULL;

if ($id) {
    $sql = mysqli_query($conn, "SELECT * FROM notes WHERE id = '$id'");

    if (!$sql) {
        die('Query Failed: ' . mysqli_error($conn));
    }

    if (!empty($sql)) {
        $note = $sql->fetch_assoc();
        include '../views/edit.php';
    } else {
        // notifikasi
    }
} else {
    // notifikasi
}
