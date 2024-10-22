<section class="d-flex">
    <div id="home-btn" class="my-auto"><i class="fa-solid fa-angle-left fs-4"></i></div>
    <div class="mx-1"></div>
    <h3>Add New Note</h3>
</section>
<div class="my-3"></div>
<section>
    <form id="create-note" action="controllers/create.php" method="POST">
        <div class="form-group">
            <div class="input-group">
                <input id="form-title" name="title" type="text" class="form-control border-0 bg-white rounded-0" placeholder="Input title" aria-label="title">
            </div>
            <span style="font-size: 8pt; font-weight: semibold; color: gray;">26 October 2024 | 1000 characters</span>
            <div class="input-group mb-3">
                <textarea id="form-content" name="content" class="form-control border-0 rounded-0" placeholder="Start typing..." rows="20"></textarea>
            </div>
        </div>
        <input type="submit" class="form-control btn btn-primary" value="Add">
    </form>
</section>