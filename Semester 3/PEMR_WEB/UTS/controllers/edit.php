<?php

include '../database/connection.php';

global $conn;

$id = $_GET['id'] ?? NULL;

if ($id) {
    $sql = mysqli_query($conn, "SELECT * FROM notes WHERE id = '$id'");

    if (!$sql) {
        die('Query Failed: ' . mysqli_error($conn));
    } else {
        $note = $sql->fetch_assoc();
    }
}

include '../components/edit.php';
