<?php

if ($_SERVER['REQUEST_METHOD'] === 'POST') {

    $id = htmlspecialchars($_POST['id']);
    $title = !empty($_POST['title']) ? htmlspecialchars($_POST['title']) : 'No Title';
    $content = !empty($_POST['content']) ? htmlspecialchars($_POST['content']) : 'Empty content';
    $color = !empty($_POST['color']) ? htmlspecialchars($_POST['color']) : 'F3C5C5';

    if ($title || $content) {
        $sql = sqlsrv_query($conn, "UPDATE notes SET title = ?, content = ?, color = ? WHERE id = ?", [$title, $content, $color, $id]);

        if (!$sql) {
            die( print_r( sqlsrv_errors(), true));
        }
    }
}
