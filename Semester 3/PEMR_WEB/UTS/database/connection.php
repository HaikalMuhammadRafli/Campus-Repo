<?php

$serverName = "LAPTOP-EB30BL56\SQLEXPRESS";
$connectionInfo = [
    "Database" => "memokeeper"
];

$conn =  sqlsrv_connect($serverName, $connectionInfo) or die(print_r( sqlsrv_errors(), true));
