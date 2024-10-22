<?php
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    include '../database/connection.php';

    global $conn;

    $id = $_POST['id'];

    if ($id) {
        $sql = mysqli_query($conn, "DELETE FROM notes WHERE id = '$id'");

        if ($sql) {
            echo "Note successfully deleted!";
        } else {
            die('Query Failed: ' . mysqli_error($conn));
        }
    } else {
        echo "Note not found!";
    }
}
