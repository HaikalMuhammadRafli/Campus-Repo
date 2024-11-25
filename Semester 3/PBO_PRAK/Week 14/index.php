<?php

require_once 'classes/Parrot.php';

function main()
{
    echo "[DEBUG]: PROGRAM IS RUNNING <br>";

    $p = new Parrot();
    $p->fly();
    $p->land();
    $p->speak();
}

main();