#!/bin/sh

# Configuration
LOG_FILE="var/logs/app_log.log"
SCRIPT_PATH="var/scripts/"
status=true

log_message() {
	if [ ! -f "$LOG_FILE" ]; then
		touch "$LOG_FILE"
		chmod 644 "$LOG_FILE"
	fi
	
	echo "[$(date)] $1" >> $LOG_FILE
}

ask_confirmation() {
	echo ""
	read -p "> Tekan enter untuk lanjut..." input
}

check_path() {
	read -p "> Masukkan Path Direktori : " path
	echo "===================================================="
	log_message "Mengecek path"
	if [ -n "$path" ] && [ -d "$path" ]; then
		echo "Direktori tersedia!"
		log_message "Direktori tersedia!"
		ls "$path"
	else 
		echo "Direktori tidak tersedia!"
		log_message "Direktori tidak tersedia!"
	fi
	echo "===================================================="
}

create_path() {
	echo ""
	read -p "> Masukkan Path Untuk Direktori Baru : " path
	
	if [ -d "$path" ]; then
		read -p "> Masukkan Nama Direktori : " name
		echo "Membuat direktori baru"
		log_message "Membuat direktori baru"
		mkdir -p "$path/$name"
		echo "Direktori berhasil dibuat!"
		log_message "Direktori berhasil dibuat!"
	else
		echo "Direktori tidak ditemukan!"
		log_message "Direktori tidak ditemukan!"
	fi
	
	echo "===================================================="
}

rename_path() {
	echo ""
	read -p "> Masukkan Path File / Direktori : " path
	
	if [ -e "$path" ]; then
		read -p "> Masukkan Nama Baru : " name
    	new_path="$(dirname "$path")/$name"
    	echo "Merename file / direktori"
    	log_message "Merename file / direktori"
    	mv "$path" "$new_path"
    	echo "File / Direktori berhasil di Rename"
    	log_message "File / Direktori berhasil di Rename"
	else
		echo "Error: File / direktori tidak ditemukan!"
		log_message "Error: File / direktori tidak ditemukan!"
	fi
}

copy_path() {
	OLD_IFS=$IFS
	IFS=' '
	read -p "> Masukkan Path yang ingin dicopy : " source_input
	read -r -a sources <<< "$source_input"
	IFS=$OLD_IFS
	read -p "> Masukkan Path tujuan : " dest
	echo "===================================================="
	
	echo ""
	for source in "${sources[@]}"; do
		echo "Menyalin..."
		log_message "Memulai menyalin"
		sleep 1
		
		if [ ! -d "$dest" ]; then
		 	echo "Direktori destinasi '$dest' tidak ditemukan. Sedang dibuat..."
		 	log_message "Membuat direktori destinasi '$dest'"
			mkdir -p "$dest"
		fi
	
		if [[ -d "$source" || -f "$source" ]] && [ -d "$dest" ]; then
			if [ -d "$source" ]; then
		  		cp -r "$source" "$dest"
		  	else
		  		cp "$source" "$dest"
		  	fi
		  	
		  	if [ $? -eq 0 ]; then
				echo "Sukses menyalin file / direktori dari '$source' ke '$dest'."
				log_message "Sukses menyalin file / direktori dari '$source' ke '$dest'."
			else
				echo "Error: Gagal untuk menyalin file / direktori."
				log_message "Error: Gagal untuk menyalin file / direktori."
			fi
		else
			if [ ! -d "$source" ]; then
				echo "Error: Sumber direktori '$source' tidak ditemukan."
				log_message "Error: Sumber direktori '$source' tidak ditemukan."
			else
				echo "Error: Gagal untuk menyalin file / direktori."
				log_message "Error: Gagal untuk menyalin file / direktori."
			fi
		fi
		echo "===================================================="
	done
}

update_system() {
echo "Memulai system update"
log_message "Memulai system update"

if sudo apt-get update && sudo apt-get upgrade -y; then
	echo "System update berhasil dan selesai"
	log_message "System update berhasil dan selesai"
else
	echo "Error: System update gagal"
	log_message "Error: System update gagal"
fi
}

view_log() {
	echo "Melihat log aplikasi"
	log_message "Melihat log aplikasi"
	cat -n "$LOG_FILE"
}

view_scripts() {
	echo "Melihat daftar scripts"
	log_message "Melihat daftar scripts"
	echo "===================================================="
	if [ -z "$(ls -A "$SCRIPT_PATH")" ]; then
		echo "Belum ada script..."
	else
		ls "$SCRIPT_PATH"
	fi
	echo "===================================================="
}

create_script() {
	echo "Membuat script"
	read -p "> Masukkan nama script : " name
	
	if [ ! -e "$SCRIPT_PATH/$name.sh" ]; then
		echo "Membuat file script $name"
		log_message "Membuat file script $name"
		gedit "$SCRIPT_PATH/$name.sh"
		echo "Script $name berhasil dibuat"
		log_message "Script $name berhasil dibuat"
	else
		echo "Error: Nama script $name sudah digunakan"
		log_message "Error: Nama script $name sudah digunakan"
	fi
}

run_script() {
	echo "Menjalankan script"
	read -p "> Masukkan nama script : " name
	
	if [ -e "$SCRIPT_PATH/$name.sh" ]; then
		echo "Menjalankan script $name"
		log_message "Menjalankan script $name"
		echo "===================================================="
		echo "Output : "
		. "$SCRIPT_PATH/$name.sh"
		echo "===================================================="
		echo "Script $name berhasil dijalankan"
		log_message "Script $name berhasil dijalankan"
	else
		echo "Error: Script $name tidak ditemukan"
		log_message "Error: Script $name ditemukan"
	fi
}

update_script() {
	echo "Mengupdate script"
	read -p "> Masukkan nama script : " name
	
	if [ -e "$SCRIPT_PATH/$name.sh" ]; then
		echo "Membuka file script $name"
		log_message "Membuka file script $name"
		gedit "$SCRIPT_PATH/$name.sh"
		echo "Script $name berhasil diupdate"
		log_message "Script $name berhasil diupdate"
	else
		echo "Error: Nama script $name tidak ditemukan"
		log_message "Error: Nama script $name tidak ditemukan"
	fi
}

delete_script() {
echo "Menghapus script"
	read -p "> Masukkan nama script : " name
	
	if [ -e "$SCRIPT_PATH/$name.sh" ]; then
		read -p "Apakah anda yakin menghapus script $name (y/n) : " choice
		
		if [ "$choice" == "y" ] || [ "$choice" == "Y" ]; then
			echo "Menghapus script $name"
			log_message "Menghapus script $name"
			rm "$SCRIPT_PATH/$name.sh"
			echo "Script $name berhasil dihapus"
			log_message "Script $name berhasil dihapus"
		else
			echo "Proses meghapus script $name dibatalkan"
			log_message "Proses meghapus script $name dibatalkan"
		fi
	else
		echo "Error: Nama script $name tidak ditemukan"
		log_message "Error: Nama script $name tidak ditemukan"
	fi
}

menu() {
	clear
	echo "===================================================="
	echo "              >>> MoeraFiles Menu <<<               "
	echo "===================================================="
	echo "--- Manajemen File"
	echo "[1] Cek direktori"
	echo "[2] Buat direktori baru"
	echo "[3] Rename file / direktori"
	echo "[4] Copy file / direktori"
	echo "--- Manajemen Sistem"
	echo "[5] Update sistem"
	echo "[6] Lihat log program"
	echo "--- Manajemen Script"
	echo "[7] Lihat daftar script"
	echo "[8] Buat script baru"
	echo "[9] Jalankan script"
	echo "[10] Update script"
	echo "[11] Hapus script"
	echo "--- Lainnya"
	echo "[12] Keluar"
	echo "===================================================="
	read -p "> Input pilihan : " pilihan
	
	case "$pilihan" in
	    1) 
	        check_path
	        ;;
	    2)
	    	create_path
	    	;;
	    3)
	    	rename_path
	    	;;
	    4)
	        copy_path
	        ;;
	    5)
	    	update_system
	    	;;
	    6)
	    	view_log
	    	;;
	    7)
	    	view_scripts
	    	;;
	    8)
	    	view_scripts
	    	create_script
	    	;;
	    9)
	    	view_scripts
	    	run_script
	    	;;
	    10)
	    	view_scripts
	    	update_script
	    	;;
	    11)
	    	view_scripts
	    	delete_script
	    	;;
	    12)
	    	status=false
	    	echo "Logging out dari program"
	    	log_message "Logging out dari program"
	    	;;
	    *)
	        echo "========== Pilihan tidak ditemukan! =========="
	        ;;
	esac
	
	ask_confirmation
}

log_message "Memulai program MoeraFiles"

while [ "$status" == true ]; do

menu

done

echo "Goodbye! :)"