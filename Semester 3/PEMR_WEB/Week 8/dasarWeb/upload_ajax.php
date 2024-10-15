<?php

if (isset($_FILES['files'])) {
    $errors = array();

    // penambahan looping untuk multiupload
    if ($_FILES["files"]["name"][0]) {
        for ($i = 0; $i < count($_FILES["files"]["name"]); $i++) {
            $file_name = $_FILES['files']['name'][$i];
            $file_size = $_FILES['files']['size'][$i];
            $file_tmp = $_FILES['files']['tmp_name'][$i];
            $file_type = $_FILES['files']['type'][$i];
            @$file_ext = strtolower(end(explode('.', $_FILES['files']['name'][$i])));
            // $extensions = array("pdf", "doc", "docx", "txt");
            $extensions = array("png", "jpg", "jpeg", "gif");

            if (in_array($file_ext, $extensions) === false) {
                // $errors[] = "Ekstensi file yang diizinkan adalah PDF, DOC, DOCX, atau TXT.";
                $errors[] = "Ekstensi file yang diizinkan adalah PNG, JPG, JPEG, atau GIF. <br>";
            }

            if ($file_size > 2097152) {
                $errors[] = 'Ukuran file tidak boleh lebih dari 2 MB <br>';
            }

            if (empty($errors) == true) {
                move_uploaded_file($file_tmp, "documents/" . $file_name);
                echo "File berhasil diunggah. <br>";
            } else {
                echo implode("", $errors);
            }
        }
    } else {
        echo "Tidak ada file yang diunggah.";
    }
}
