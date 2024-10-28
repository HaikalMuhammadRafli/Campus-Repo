<?php

if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    include '../database/connection.php';

    $id = htmlspecialchars($_POST['id']);
    $title = !empty($_POST['title']) ? htmlspecialchars($_POST['title']) : 'No Title';
    $content = !empty($_POST['content']) ? htmlspecialchars($_POST['content']) : 'Empty content';
    $color = htmlspecialchars($_POST['color']);

    if ($title || $content) {
        $sql = sqlsrv_query($conn, "UPDATE notes SET title = ?, content = ?, color = ? WHERE id = ?", [$title, $content, $color, $id]);

        if (!$sql) {
            $errors = print_r(sqlsrv_errors(), true);
            echo "<script>alert('$errors');</script>";
        }
    }
}
