<?php

if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    include '../database/connection.php';

    if (!empty($_POST['title']) || !empty($_POST['content'])) {
        $title = !empty($_POST['title']) ? htmlspecialchars($_POST['title']) : 'No Title';
        $content = !empty($_POST['content']) ? htmlspecialchars($_POST['content']) : 'Empty content';
        $color = htmlspecialchars($_POST['color']);

        if ($sql = sqlsrv_query($conn, "INSERT INTO notes (title, content, color) VALUES (?, ?, ?)", [$title, $content, $color])) {
            // success
        } else {
            $errors = print_r(sqlsrv_errors(), true);
            echo "<script>alert('$errors');</script>";
        }

    } else {
        echo "Fill one element of the note first!";
    }
}
