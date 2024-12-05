<?php

namespace src;

use Model;

class Controller
{

    private $_model;

    public function __construct()
    {
        $this->_model = new Model();
    }

    public function index()
    {
        $data = $_POST;

        if (isset($_POST['submit'])) {
            $this->_model->store(
                $data['nama'],
                $data['nomor_telepon'],
                $data['email'],
                $data['alamat']
            );
        }

        $daftarKontak = $this->_model->get();

        $view = new View('template/index_template.php');
        $view->setData(['daftarKontak' => $daftarKontak]);
        $view->render();
    }
}
