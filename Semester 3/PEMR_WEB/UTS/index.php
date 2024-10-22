<!DOCTYPE html>
<html>

<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.1/jquery.min.js" integrity="sha512-v2CJ7UaYy4JwqLDIrZUI/4hqeoQieOmAZNXBeQyjo21dadnwR+8ZaIJVT8EE2iyI61OV8e6M8PP2/4hpQINQ/g==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js" integrity="sha384-0pUGZvbkm6XF6gxjEnlmuGrJXVbNuzT9qBBavbLwCsOGabYfZo0T0to5eqruptLy" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.6.0/css/all.min.css" integrity="sha512-Kc323vGBEqzTmouAECnVceyQqyqdsSiqLQISBL29aUW4U/M7pSPA/gEUZQqv1cwx4OnYxTxve5UMg5GT6L4JJg==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="stylesheet" href="style.css">
    <title>MemoKeeper</title>
</head>

<body class="d-flex" style="height: 100vh;">
    <section id="sidebar" class="bg-primary h-100 d-flex flex-column justify-content-start align-items-center fixed-top pt-2">
        <i class="fa-brands fa-42-group text-white fs-4 mt-2"></i>
        <div class="mt-4"></div>
        <div id="create-btn" class="btn-add mt-2 rounded-circle"><i class="fa-solid fa-plus text-primary"></i></div>
    </section>

    <section id="container" class="w-100">
        <section class="d-flex w-100">
            <div id="brand">
                <h1 class="brand-name brand-name-1 m-0">memo</h1>
                <h1 class="brand-name brand-name-2 m-0">keeper</h1>
            </div>
            <div class="mx-3"></div>
            <form class="d-flex w-100" role="search">
                <input id="search" class="form-control w-100" type="search" placeholder="search" aria-label="search">
                <button id="search-btn" class="btn btn-primary" type="submit">Search</button>
            </form>
        </section>

        <section id="content" class="w-100 mt-4"></section>

    </section>
    <script src="app.js"></script>
</body>

</html>