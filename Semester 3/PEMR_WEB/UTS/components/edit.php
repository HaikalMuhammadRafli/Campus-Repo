<?php if (isset($note)) { ?>
    <form id="edit-note" action="controllers/update.php" method="POST">
        <section class="d-flex justify-content-between mx-3 mt-3">
            <button id="cancel-btn" class="btn color-prim"><i class="fa-solid fa-angles-left"></i></button>
            <div class="d-flex justify-content-around align-items-center w-25">
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="color" id="red-radio" value="F3C5C5" checked>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="color" id="yellow-radio" value="FAE0C1">
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="color" id="purple-radio" value="D5D2FE">
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="color" id="green-radio" value="BFF0DB">
                </div>
            </div>
            <button id="delete-btn" class="btn color-danger" data-id="<?= $note['id']; ?>"><i
                    class="fa-solid fa-trash-can"></i></button>
        </section>
        <section class="mx-5">
            <input type="hidden" name="id" value="<?= $note['id'] ?>">
            <div class="form-group">
                <div class="input-group">
                    <input id="form-title-edit" type="text" name="title" class="form-title form-control border-0 rounded-0"
                        value="<?= $note['title'] ?>" placeholder="Input title" aria-label="title">
                </div>
                <span id="note-reload" style="font-size: 8pt; font-weight: semibold">
                    <?= $note['created_at']->format('d F Y') . " | " . strlen($note['content']) . " characters"; ?>
                </span>
                <div class="input-group mb-3">
                    <textarea id="form-content-edit" name="content" class="form-content form-control border-0 rounded-0"
                        placeholder="Start typing..." rows="32"><?= $note['content'] ?></textarea>
                </div>
            </div>
        </section>
    </form>
    <?php
} else {
    ?>
    <section class="d-flex justify-content-center h-100 align-items-center">
        <div class="d-flex flex-column justify-content-center">
            <i class="fa-solid fa-file mx-auto mb-5 color-unselected" style="font-size: 80pt;"></i>
            <h5 class="mx-auto mb-1 color-unselected">No Note Selected</h5>
            <p class="mx-auto color-unselected" style="font-size: 8pt;">Please select a note to view!</p>
        </div>
    </section>
    <?php
}