<?php

if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    include '../database/connection.php';

    if (!empty($_POST['title']) || !empty($_POST['content'])) {
        $title = !empty($_POST['title']) ? htmlspecialchars($_POST['title']) : 'No Title';
        $content = !empty($_POST['content']) ? htmlspecialchars($_POST['content']) : 'Empty content';
        $color = !empty($_POST['color']) ? htmlspecialchars($_POST['color']) : 'F3C5C5';

        if ($sql = sqlsrv_query($conn, "INSERT INTO notes (title, content, color) VALUES (?, ?, ?)", [$title, $content, $color])) {
            // success
        } else {
            die( print_r( sqlsrv_errors(), true));
        }
        
    } else {
        echo "Fill one element of the note first!";
    }
}
