<h3>notes</h3>
<div class="my-3"></div>
<section class="px-1">
    <div class="row row-cols-1 row-cols-sm-2 row-cols-md-4">
        <?php if (!empty($data)) { ?>
            <?php foreach ($data as $note) { ?>
                <div class="col px-2 pb-3">
                    <div class="card rounded-4">
                        <div class="card-body">
                            <div class="h-75 overflow-hidden">
                                <h5 class="card-title"><?= $note['title'] ?></h5>
                                <p class="card-text"><?= $note['content'] ?></p>
                            </div>
                            <div class="my-2"></div>
                            <div class="d-flex justify-content-end w-100">
                                <button class="edit-btn btn btn-primary rounded-circle" data-id="<?= $note['id']; ?>"><i class="fa-solid fa-pen fs-6"></i></button>
                            </div>
                        </div>
                    </div>
                </div>
            <?php } ?>
        <?php } else { ?>
            <h3>notes is empty</h3>
        <?php } ?>
    </div>
</section>