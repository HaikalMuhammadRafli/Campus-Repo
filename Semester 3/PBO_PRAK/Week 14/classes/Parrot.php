<?php

require_once 'classes/Bird.php';

use classes\Bird;

class Parrot extends Bird
{
    public function __construct()
    {
        parent::__construct(3);
    }

    public function fly()
    { // method overidding11111
        echo "Parrot named {$this->name}, is flying: Wushh! <br>";
    }

    public function land()
    { // method overidding
        echo "Parrot named {$this->name}, is landing: Duarr! <br>";
    }

    public function speak()
    {
        echo "Parrot named {$this->name} says: PHP Supremacy <br>";
    }
}