public class testmahasiswa {
    public static void main(String[] args) {
        mahasiswa mhs = new mahasiswa("Ilda Putri Nahar",20);
        mhs.tampilkanbiodata();

        System.out.println();

        mhs.setUmr (25);
        mhs.tampilkanbiodata();
    }
}
