    <section class="d-flex">
    <div id="home-btn" class="my-auto"><i class="fa-solid fa-angle-left fs-4"></i></div>
    <div class="mx-1"></div>
    <h3>Edit Note</h3>
</section>
<div class="my-3"></div>
<section>
    <form id="edit-note" action="controllers/update.php" method="POST">
        <input type="hidden" name="id" value="<?= $note['id'] ?>">
        <div class="form-group">
            <div class="input-group">
                <input id="form-title" type="text" name="title" class="form-control border-0 bg-white rounded-0" value="<?= $note['title'] ?>" placeholder="Input title" aria-label="title">
            </div>
            <span style="font-size: 8pt; font-weight: semibold; color: gray;">
                <?= date('d F Y', strtotime($note['created_at'])) ?> | <?= strlen($note['content']) ?> characters
            </span>
            <div class="input-group mb-3">
                <textarea id="form-content" name="content" class="form-control border-0 rounded-0" placeholder="Start typing..." rows="20"><?= $note['content'] ?></textarea>
            </div>
        </div>
        <input type="submit" class="form-control btn btn-primary" value="Update">
    </form>
</section>