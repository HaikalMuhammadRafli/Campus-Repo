<?php

include '../database/connection.php';

$id = $_GET['id'] ?? NULL;

if ($id) {
    $sql = sqlsrv_query($conn, "SELECT * FROM notes WHERE id = ?", [$id]);

    if (!$sql) {
        $errors = print_r(sqlsrv_errors(), true);
        echo "<script>alert('$errors');</script>";
    } else {
        $note = sqlsrv_fetch_array($sql, SQLSRV_FETCH_ASSOC);
    }
}

include '../components/edit.php';
