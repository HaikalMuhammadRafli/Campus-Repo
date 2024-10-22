<?php

if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    include '../database/connection.php';

    global $conn;

    if (!empty($_POST['title']) || !empty($_POST['content'])) {
        $title = !empty($_POST['title']) ? htmlspecialchars($_POST['title']) : 'No Title';
        $content = !empty($_POST['content']) ? htmlspecialchars($_POST['content']) : 'Empty content';

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
