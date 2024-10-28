<section class="d-flex justify-content-between mx-3 mt-3">
    <button id="cancel-btn" class="btn color-prim"><i class="fa-solid fa-angles-left"></i></button>
    <button id="save-btn" class="btn color-prim"><i class="fa-solid fa-check"></i></button>
</section>
<section class="mx-5">
    <form id="create-note" action="controllers/create.php" method="POST">
        <div class="form-group">
            <div class="input-group">
                <input id="form-title-create" name="title" type="text" class="form-title form-control border-0 bg-white rounded-0" placeholder="Input title" aria-label="title">
            </div>
            <span style="font-size: 8pt; font-weight: semibold; color: gray;">26 October 2024 | 1000 characters</span>
            <div class="input-group mb-3">
                <textarea id="form-content-create" name="content" class="form-content form-control border-0 rounded-0" placeholder="Start typing..." rows="32"></textarea>
            </div>
        </div>
    </form>
</section>