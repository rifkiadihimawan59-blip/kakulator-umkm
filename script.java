function hitungKeuntungan() {
    const modal = parseFloat(document.getElementById('modal').value) || 0;
    const operasional = parseFloat(document.getElementById('operasional').value) || 0;
    const jumlah = parseFloat(document.getElementById('jumlah').value) || 0;
    const margin = parseFloat(document.getElementById('margin').value) || 0;

    if (jumlah <= 0) {
        alert("Jumlah produk harus lebih besar dari 0!");
        return;
    }

    const totalModal = modal + operasional;
    const hppPerUnit = totalModal / jumlah;
    const keuntunganPerUnit = hppPerUnit * (margin / 100);
    const hargaJual = hppPerUnit + keuntunganPerUnit;

    document.getElementById('resTotal').innerText = "Rp " + totalModal.toLocaleString('id-ID');
    document.getElementById('resHPP').innerText = "Rp " + Math.round(hppPerUnit).toLocaleString('id-ID');
    document.getElementById('resHargaJual').innerText = "Rp " + Math.ceil(hargaJual).toLocaleString('id-ID');

    document.getElementById('hasil').classList.remove('hidden');
}
}