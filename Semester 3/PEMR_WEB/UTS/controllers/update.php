<?php

if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    include '../database/connection.php';

    global $conn;

    $id = htmlspecialchars($_POST['id']);
    $title = htmlspecialchars($_POST['title']);
    $content = htmlspecialchars($_POST['content']);

    if ($title && $content) {
        $sql = mysqli_query($conn, "UPDATE notes SET title = '$title', content = '$content' WHERE id = '$id'");

        if (!$sql) {
            die('Query Failed: ' . mysqli_error($conn));
        }
    }
}
