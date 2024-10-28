<?php
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    include '../database/connection.php';

    $id = $_POST['id'];

    if ($id) {
        $sql = sqlsrv_query($conn, "DELETE FROM notes WHERE id = ?", [$id]);

        if ($sql) {
            // success
        } else {
            die( print_r( sqlsrv_errors(), true));
        }
    } else {
        echo "Note not found!";
    }
}
