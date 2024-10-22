<?php

if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    include '../database/connection.php';

    global $conn;

    $title = htmlspecialchars(isset($_POST['title']) ? $_POST['title'] : "No Title");
    $content = htmlspecialchars(isset($_POST['content']) ? $_POST['content'] : "Empty content");

    if ($title || $content) {
        $sql = "INSERT INTO notes (title, content) VALUES ('$title', '$content')";

        if (mysqli_query($conn, $sql)) {
            echo "Note successfully added!";
        } else {
            die('Query Failed: ' . mysqli_error($conn));
        }
    } else {
        echo "Fill one element of the note first!";
    }

    include '../views/create.php';
}
