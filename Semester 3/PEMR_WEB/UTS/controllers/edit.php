<?php

include '../database/connection.php';

$id = $_GET['id'] ?? NULL;

if ($id) {
    $sql = mysqli_query($conn, "SELECT * FROM notes WHERE id = ?", [$id]);

    if (!$sql) {
        die( print_r( sqlsrv_errors(), true));
    } else {
        $note = sqlsrv_fetch_array($sql, SQLSRV_FETCH_ASSOC);
    }
}

include '../components/edit.php';
