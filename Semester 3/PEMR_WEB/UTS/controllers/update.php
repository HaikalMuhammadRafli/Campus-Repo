<?php

if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    include '../database/connection.php';

    global $conn;

    $id = htmlspecialchars($_POST['id']);
    $title = !empty($_POST['title']) ? htmlspecialchars($_POST['title']) : 'No Title';
    $content = !empty($_POST['content']) ? htmlspecialchars($_POST['content']) : 'Empty content';

    if ($title || $content) {
        $sql = mysqli_query($conn, "UPDATE notes SET title = '$title', content = '$content' WHERE id = '$id'");

        if (!$sql) {
            die('Query Failed: ' . mysqli_error($conn));
        }
    }
}
