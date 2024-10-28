<h3 class="color-prim">notes</h3>
<div class="my-3"></div>
<section class="px-1 h-100">
    <div class="row row-cols-sm-1 row-cols-md-2 row-cols-lg-3 h-100">
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
            <section class="d-flex justify-content-center h-100 w-100 align-items-center">
                <div class="d-flex flex-column justify-content-center">
                    <i class="fa-solid fa-file-pen mx-auto mb-5 color-unselected" style="font-size: 80pt;"></i>
                    <h5 class="mx-auto mb-1 color-unselected">No Note Found</h5>
                    <p class="mx-auto color-unselected" style="font-size: 8pt;">Please make a note first!</p>
                </div>
            </section>
        <?php } ?>
    </div>
</section>