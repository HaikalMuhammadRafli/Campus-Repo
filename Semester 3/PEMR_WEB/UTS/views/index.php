<h3 class="color-prim">notes</h3>
<div class="my-3"></div>
<section class="px-1">
    <div class="row row-cols-sm-1 row-cols-md-2 row-cols-lg-3">
        <?php if (($data)) { ?>
            <?php foreach ($data as $note) { ?>
                <div class="view-note col px-2 pb-3" data-id="<?= $note['id']; ?>">
                    <div class="card rounded-4">
                        <div class="card-body">
                            <div class="h-100 overflow-hidden">
                                <h5 class="card-title"><?= $note['title'] ?></h5>
                                <p class="card-text"><?= $note['content'] ?></p>
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