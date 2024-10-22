$(document).ready(function () {
    let selectedPage = 'controllers/index.php';

    loadPage(selectedPage);
    console.log("Loading page: " + selectedPage);

    $(document).on('click', '#home-btn', function () {
        selectedPage = 'controllers/index.php';
        loadPage(selectedPage);
    });

    $(document).on('click', '#create-btn', function () {
        console.log("Create button clicked");
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

    function loadPage(page = selectedPage, method = 'GET', data = {}) {
        $.ajax({
            url: page,
            method: method,
            data: data,
            success: function (response) {
                $('#content').html('');
                $('#content').html(response);
                console.log("Page loaded successfully.");
                setupFormHandlers();
            },
            error: function (xhr, textStatus, errorThrown) {
                console.error('Error: ', xhr.responseText);
                $('#content').html(`<p>Error loading page: ${textStatus} - ${errorThrown}</p>`);
            }
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
                    $('#formResponse').html('<p>' + response + '</p>');
                    selectedPage = 'controllers/index.php';
                    loadPage(selectedPage);
                },
                error: function () {
                    $('#formResponse').html('<p>Error submitting form.</p>');
                }
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
});