#!/bin/sh

status=true

ask_confirmation() {
echo ""
read -p "> Tekan enter untuk lanjut..." input
}

check_path() {
	read -p "> Masukkan Path Direktori : " path
	echo "==========================="
	if [ -n "$path" ] && [ -d "$path" ]; then
		echo "Direktori Tersedia!"
		ls "$path"
	else 
		echo "Direktori Tidak Tersedia!"
	fi
	echo "==========================="
}

create_path() {
	echo ""
	read -p "> Masukkan Path Untuk Direktori Baru : " path
	
	if [ -d "$path" ]; then
		read -p "> Masukkan Nama Direktori : " name
		mkdir -p "$path/$name"
		echo "Direktori Berhasil Dibuat!"
	else
		echo "Direktori tidak ditemukan!"
	fi
	
	echo "========================================="
}

rename_path() {
	echo ""
	read -p "> Masukkan Path File / Direktori : " path
	
	if [ -e "$path" ]; then
		read -p "> Masukkan Nama Baru : " name    	
    	new_path="$(dirname "$path")/$name"
    	mv "$path" "$new_path"
	else
		echo "Error: File / direktori tidak ditemukan!"
	fi
}

copy_path() {
	OLD_IFS=$IFS
	IFS=' '
	read -p "> Masukkan Path yang ingin dicopy : " source_input
	read -r -a sources <<< "$source_input"
	IFS=$OLD_IFS
	read -p "> Masukkan Path tujuan : " dest
	echo "==================================="
	
	echo ""
	for source in "${sources[@]}"; do
		echo "Menyalin..."
		sleep 1
		
		if [ ! -d "$dest" ]; then
		 	echo "Direktori destinasi '$dest' tidak ditemukan. Sedang dibuat..."
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
			else
				echo "Error: Gagal untuk menyalin file / direktori."
			fi
		else
			if [ ! -d "$source" ]; then
				echo "Error: Sumber direktori '$source' tidak ditemukan."
			else
				echo "Error: Gagal untuk menyalin file / direktori."
			fi
		fi
		echo "===================================================="
	done
}

menu() {
	clear
	echo "============================="
	echo ">>> MoeraFiles Menu <<<"
	echo "============================="
	echo "[1] Check Directory"
	echo "[2] Create New Directory"
	echo "[3] Rename File / Directory"
	echo "[4] Copy Files / Directories"
	echo "============================="
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
	    *)
	        echo "========== Pilihan tidak ditemukan! =========="
	        ;;
	esac
	
	ask_confirmation
}

while [ "$status" == true ]; do

menu

done

echo "Goodbye! :)"