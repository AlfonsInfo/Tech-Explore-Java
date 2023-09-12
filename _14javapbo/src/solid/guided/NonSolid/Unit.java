package solid.guided.NonSolid;

public class Unit {
    private String namaProdi;
    private String namaKaprodi;
    private DosenTetap dosenTetap;
    private String namaKepalaTu;
    private String jamLayananTu;


    public Unit(String namaProdi, String namaKaprodi, String namaKepalaTu, String jamLayananTu) {
        this.namaProdi = namaProdi;
        this.namaKaprodi = namaKaprodi;
        this.namaKepalaTu = namaKepalaTu;
        this.jamLayananTu = jamLayananTu;
    }


    public void showProdi()
    {
        System.out.println("Nama Prodi: " + namaProdi);
        System.out.println("Nama Kaprodi: " + namaKaprodi);
        dosenTetap.showDesanTetap();
    }

    public void setDosenTetap(DosenTetap dosenTetap) {
        this.dosenTetap = dosenTetap;
    }

    public void showTU()
    {
        System.out.println("Nama Kepala TU: "+ namaKepalaTu);
        System.out.println("Jam Layanan TU: "+ jamLayananTu);
    }


    public void ubahJamLayananTU(String jamLayananTu)
    {
        this.jamLayananTu = jamLayananTu;
    }
}
