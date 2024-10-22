<?php

$servername = "localhost";
$username = "root";
$password = "";
$database = "memokeeper";

$conn = new mysqli($servername, $username, $password, $database) or die("Error connecting to MySQL Server");
