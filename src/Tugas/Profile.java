package Tugas;

/**
 *
 * @author Fara
 */
public class Profile{
    private String Nama;
    private String TanggalLahir;
    private String JenisKelamin;
    private String Pekerjaan;
    private String Email;
    
    public Profile(){
        this.Nama = " ";
        this.TanggalLahir = " ";
        this.JenisKelamin = " ";
        this.Pekerjaan = " ";
        this.Email = " ";
    }
    
    public Profile (String Nama, String TanggalLahir, String JenisKelamin, String Pekerjaan, String Email){
        this.Nama = Nama;
        this.TanggalLahir = TanggalLahir;
        this.JenisKelamin = JenisKelamin;
        this.Pekerjaan = Pekerjaan;
        this.Email = Email;
    }
    
    public void setNama(String Nama){
        this.Nama = Nama;
    }
    
    public String getNama(){
        return Nama;
    }
    
    public void setTanggalLahir(String TanggalLahir){
        this.TanggalLahir = TanggalLahir;
    }
    
    public String getTanggalLahir(){
        return TanggalLahir;
    }
    
    public void setJenisKelamin(String JenisKelamin){
        this.JenisKelamin = JenisKelamin;
    }
    
    public String getJenisKelamin(){
        return JenisKelamin;
    }
    
    public void setPekerjaan (String Pekerjaan){
        this.Pekerjaan = Pekerjaan;
    }
    
    public String getPekerjaan(){
        return Pekerjaan;
    }
    
     public void setEmail(String Email){
        this.Email = Email;
    }
    
    public String getEmail(){
        return Email;
    }
}
