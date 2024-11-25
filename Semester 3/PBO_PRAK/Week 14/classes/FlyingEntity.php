<?php

// this file is in a 'classes' folder
// so we should add the 'classes' namespace as well
namespace classes;

abstract class FlyingEntity
{

    protected $name;

    protected $wings;

    public function __construct($name = '', $wings = 0)
    {
        $this->name = $name;
        $this->wings = $wings;
    }

    public abstract function fly();

    public abstract function land();

    public function getName()
    {
        return $this->name;
    }

    public function setName($name)
    {
        $this->name = $name;
    }

    public function getWings()
    {
        return $this->wings;
    }

    public function setWings($wings)
    {
        $this->wings = $wings;
    }
}