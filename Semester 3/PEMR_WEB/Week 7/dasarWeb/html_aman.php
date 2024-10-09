<?php

$_POST = array("input" => "<script>alert('Hiya kena inject!')</script>", "email" => "haihai@gmail.com");

// part 1
$input = $_POST['input'];
$input = htmlspecialchars($input, ENT_QUOTES, 'UTF-8');
echo $input;
echo "<br><br>";

// part 2
$email = $_POST['email'];
if (filter_var($email, FILTER_VALIDATE_EMAIL)) {
    echo "Email valid {$email}";
} else {
    echo "Email tidak valid";
}
