<?php
if (isset($_POST["submit"])) {
    $targetDir = "uploads/";
    $targetFile = $targetDir . basename($_FILES["myfile"]["name"]);
    $fileType = strtolower(pathinfo($targetFile, PATHINFO_EXTENSION));

    // $allowedExtensions = array("jpg", "jpeg", "png", "gif");
    $allowedExtensions = array("txt", "pdf", "doc", "docx");
    // $maxSize = 5 * 1024 * 1024;
    $maxSize = 3 * 1024 * 1024;

    if (in_array($fileType, $allowedExtensions) && $_FILES["myfile"]["size"] <= $maxSize) {
        if (move_uploaded_file($_FILES["myfile"]["tmp_name"], $targetFile)) {
            echo "File berhasil diunggah! <br><br>";
            // echo "<img src='$targetFile' style='width: 200px; height: auto;'></img>";
        } else {
            echo "Gagal mengunggah file!";
        }
    } else {
        echo "File tidak valid atau melebihi ukuran maksimum yang diizinkan!";
    }
}
