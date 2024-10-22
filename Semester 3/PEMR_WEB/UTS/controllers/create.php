<?php

if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    include '../database/connection.php';

    global $conn;

    $title = mysqli_real_escape_string($conn, $_POST['title'] ?? '');
    $content = mysqli_real_escape_string($conn, $_POST['content'] ?? '');

    if ($title && $content) {
        $sql = "INSERT INTO notes (title, content) VALUES ('$title', '$content')";

        if (mysqli_query($conn, $sql)) {
            echo 'Note created successfully!';
        } else {
            die('Query Failed: ' . mysqli_error($conn));
        }
    } else {
        echo 'Both title and content are required.';
    }

    include '../views/create.php';
}
