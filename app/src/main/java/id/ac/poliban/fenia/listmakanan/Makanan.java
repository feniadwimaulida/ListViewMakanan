package id.ac.poliban.fenia.listmakanan;

public class Makanan {
    private String flag;
    private String namaMakanan;
    private String deskripsiMakanan;

    public Makanan(String flag, String namaMakanan, String deskripsiMakanan) {
        this.flag = flag;
        this.namaMakanan = namaMakanan;
        this.deskripsiMakanan = deskripsiMakanan;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getNamaMakanan() {
        return namaMakanan;
    }

    public void setNamaMakanan(String namaMakanan) {
        this.namaMakanan = namaMakanan;
    }

    public String getDeskripsiMakanan() {
        return deskripsiMakanan;
    }

    public void setDeskripsiMakanan(String deskripsiMakanan) {
        this.deskripsiMakanan = deskripsiMakanan;
    }

    @Override
    public String toString() {
        return String.format("%30s", getNamaMakanan());
    }
}
