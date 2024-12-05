<?php

namespace src;

class App
{
    public function __construct()
    {
        // Kalau class ini cmn begini saja, kenapa dibuat?
    }

    public function run()
    {
        $controller = new Controller();
        $controller->index();
    }
}