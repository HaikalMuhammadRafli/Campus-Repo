<?php

namespace classes;

require_once 'classes/FlyingEntity.php';

use classes\FlyingEntity;

abstract class Bird extends FlyingEntity
{
    protected $beakLength;

    public function __construct($beakLength = 0)
    {
        // has to call parent constructor
        parent::__construct("Birdie", 2);
        $this->beakLength = $beakLength;
    }

    public function fly()
    { // method overidding
        echo "Bird named {$this->name}, is flying: Wushh! <br>";
    }

    public function land()
    { // method overidding
        echo "Bird named {$this->name}, is landing: Duarr! <br>";
    }

    public abstract function speak();

    public function getBeakLength()
    {
        return $this->beakLength;
    }

    public function setBeakLength($beakLength)
    {
        $this->beakLength = $beakLength;
    }
}