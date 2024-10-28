<?php

include '../database/connection.php';

$notes = sqlsrv_query($conn, 'SELECT * FROM notes ORDER BY created_at DESC');
$data = array();

if (!$notes) {
    $errors = print_r(sqlsrv_errors(), true);
    echo "<script>alert('$errors');</script>";
}

if (!empty($notes)) {
    while ($row = sqlsrv_fetch_array($notes, SQLSRV_FETCH_ASSOC)) {
        $data[] = $row;
    }
}

include '../views/index.php';
