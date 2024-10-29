<form id="create-note">
    <section class="d-flex justify-content-between mx-3 mt-3">
        <button id="cancel-btn" type="button" class="btn color-prim"><i class="fa-solid fa-angles-left"></i></button>
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
        <button id="save-btn" class="btn color-prim"><i class="fa-solid fa-check"></i></button>
    </section>
    <section class="mx-5">
        <div class="form-group">
            <div class="input-group">
                <input id="form-title-create" name="title" type="text"
                    class="form-title form-control border-0 bg-white rounded-0" placeholder="Input title"
                    aria-label="title">
            </div>
            <span style="font-size: 8pt; font-weight: semibold; color: gray;">26 October 2024 | 1000 characters</span>
            <div class="input-group mb-3">
                <textarea id="form-content-create" name="content" class="form-content form-control border-0 rounded-0"
                    placeholder="Start typing..." rows="32"></textarea>
            </div>
        </div>
    </section>
</form>