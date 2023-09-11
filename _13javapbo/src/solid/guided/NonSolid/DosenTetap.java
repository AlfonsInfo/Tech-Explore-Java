package solid.guided.NonSolid;

public class DosenTetap implements IMengajar{
    private String namaDosen;
    private double gajipokok;
    private double tunjangan;


    public DosenTetap(String namaDosen, double gajipokok, double tunjangan) {
        this.namaDosen = namaDosen;
        this.gajipokok = gajipokok;
        this.tunjangan = tunjangan;
    }

    public void showDesanTetap()
    {
        System.out.println("Dosen : "+namaDosen+" - "+gajipokok+" - "+tunjangan);
        mengajarTeori();
        mengajarPraktikum();
    }

    @Override
    public void mengajarTeori() {
        System.out.println("Dosen "+namaDosen+" mengajar teori");
    }

    @Override
    public void mengajarPraktikum() {
        System.out.println("Dosen "+namaDosen+" mengajar praktikum");
    }
}

