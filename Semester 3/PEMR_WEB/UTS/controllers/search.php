<?php

include '../database/connection.php';

global $conn;

$searchInput = !empty($_GET['search']) ? htmlspecialchars($_GET['search']) : '';
$notes = mysqli_query($conn, "SELECT * FROM notes WHERE title LIKE '%$searchInput%' ORDER BY created_at DESC");
$data = array();

if (!$notes) {
    die('Query Failed: ' . mysqli_error($conn));
}

if (!empty($notes)) {
    while ($row = mysqli_fetch_assoc($notes)) {
        $data[] = $row;
    }
}

include '../views/index.php';
