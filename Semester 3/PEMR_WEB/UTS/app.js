$(document).ready(function () {
    let selectedPage = 'controllers/index.php'
    let selectedContent = 'controllers/edit.php'

    loadPage(selectedPage)
    loadView(selectedContent)

    $(document).on('click', '#create-btn', function () {
        selectedContent = 'components/create.php'
        loadView(selectedContent)
    });

    $(document).on('click', '.view-note', function () {
        const noteId = $(this).data('id')
        selectedContent = 'controllers/edit.php?id=' + noteId
        loadView(selectedContent)
    });

    $(document).on('click', '#delete-btn', function () {
        const noteId = $(this).data('id')

        $.ajax({
            url: 'controllers/delete.php',
            method: 'POST',
            data: { id: noteId },
            success: function () {
                selectedPage = 'controllers/index.php'
                loadPage(selectedPage)
                selectedContent = 'controllers/edit.php'
                loadView(selectedContent)
            }
        });
    });

    $(document).on('input', '#search', function (e) {
        e.preventDefault()
        let cooldownTimer

        clearTimeout(cooldownTimer)
        cooldownTimer = setTimeout(function () {
            const key = $('#search').val()
            selectedPage = 'controllers/search.php';
            loadPage(selectedPage, 'GET', { search: key })
        }, 500);
    })

    function loadPage(page = selectedPage, method = 'GET', data = {}) {
        $.ajax({
            url: page,
            method: method,
            data: data,
            success: function (response) {
                $('#content').html('')
                $('#content').html(response)
                setupFormHandlers()
            },
        });
    }

    function loadView(content = selectedContent, method = 'GET', data = {}) {
        $.ajax({
            url: content,
            method: method,
            data: data,
            success: function (response) {
                $('#note-view').html('')
                $('#note-view').html(response)
                setupFormHandlers()
            },
        });
    }

    function setupFormHandlers() {
        let cooldownTimer;

        $('#save-btn').on('click', function (e) {
            e.preventDefault()

            $.ajax({
                url: 'controllers/create.php',
                method: 'POST',
                data: $("#create-note").serialize(),
                success: function () {
                    selectedPage = 'controllers/index.php'
                    loadPage(selectedPage)
                    selectedContent = 'controllers/edit.php'
                    loadView(selectedContent)
                },
            })
        })

        $('#form-title-edit, #form-content-edit').on('input', function (e) {
            e.preventDefault()
            clearTimeout(cooldownTimer)

            cooldownTimer = setTimeout(function () {
                $.ajax({
                    url: 'controllers/update.php',
                    method: 'POST',
                    data: $('#edit-note').serialize(),
                    success: function () {
                        selectedPage = 'controllers/index.php'
                        loadPage(selectedPage)
                        $('#note-reload').load('controllers/editInfo.php?id=' + $('#edit-note input[name="id"]').val())
                    }
                })
            }, 500)
        })
    }

})