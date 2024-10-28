<?php

include '../database/connection.php';

$searchInput = !empty($_GET['search']) ? htmlspecialchars($_GET['search']) : '';
$notes = sqlsrv_query($conn, "SELECT * FROM notes WHERE title LIKE ? ORDER BY created_at DESC", ["%{$searchInput}%"]);
$data = array();

if (!$notes) {
    die( print_r( sqlsrv_errors(), true));
}

if (!empty($notes)) {
    while ($row = sqlsrv_fetch_array($notes, SQLSRV_FETCH_ASSOC)) {
        $data[] = $row;
    }
}

include '../views/index.php';
