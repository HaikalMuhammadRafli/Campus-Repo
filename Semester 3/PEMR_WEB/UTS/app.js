$(document).ready(function () {
    let selectedPage = 'controllers/index.php';

    loadPage(selectedPage);

    $(document).on('click', '#home-btn', function () {
        selectedPage = 'controllers/index.php';
        loadPage(selectedPage);
    });

    $(document).on('click', '#create-btn', function () {
        selectedPage = 'views/create.php';
        loadPage(selectedPage);
    });

    $(document).on('click', '.edit-btn', function () {
        const noteId = $(this).data('id');
        selectedPage = 'controllers/edit.php?id=' + noteId;
        loadPage(selectedPage);
    });

    $(document).on('click', '.delete-btn', function () {
        const noteId = $(this).data('id');
        $.ajax({
            url: 'controllers/delete.php',
            method: 'POST',
            data: { id: noteId },
            success: function (response) {
                loadPage(selectedPage);
            }
        });
    });

    $(document).on('click', '#search-btn', function (e) {
        e.preventDefault();
        const searchInput = $('#search').val();
        search(searchInput);
    });

    function search(query) {
        $.ajax({
            url: 'controllers/search.php',
            method: 'GET',
            data: { search: query },
            success: function (response) {
                console.log(response)
                $('#content').html(response);
            },
        });
    }

    function loadPage(page = selectedPage, method = 'GET', data = {}) {
        $.ajax({
            url: page,
            method: method,
            data: data,
            success: function (response) {
                $('#content').html('');
                $('#content').html(response);
                setupFormHandlers();
            },
        });
    }

    function setupFormHandlers() {
        $('#create-note').on('submit', function (e) {
            e.preventDefault();

            $.ajax({
                url: 'controllers/create.php',
                method: 'POST',
                data: $(this).serialize(),
                success: function (response) {
                    selectedPage = 'controllers/index.php';
                    loadPage(selectedPage);
                },
            });
        });

        $('#edit-note').on('submit', function (e) {
            e.preventDefault();

            $.ajax({
                url: 'controllers/update.php',
                method: 'POST',
                data: $(this).serialize(),
                success: function (response) {
                    selectedPage = 'controllers/index.php';
                    loadPage(selectedPage);
                }
            });
        });
    }
})