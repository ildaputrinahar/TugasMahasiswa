public class mahasiswa {
    private String n;
    private int umr;

    public mahasiswa(String n, int umr) {
        this.n = n;
        this.umr = umr;
    }

    public void tampilkanbiodata(){
        System.out.println("-----biodata mahasiswa-----");
        System.out.println("n mahasiswa="+n);
        System.out.println("umr mahasiswa="+umr);
    }


    public String getN() {
        return n;
    }

    public void setNama(String n) {
        this.n = n;
    }

    public int getUmr(int umr) {
        return umr;
    }
      public void setUmr(int umr) {
        this.umr = umr;
    }

}


