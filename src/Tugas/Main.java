/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author Fara
 */
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[]args){
        ArrayList<Profile> profilee = new ArrayList<>();
        ArrayList<Circle> circless = new ArrayList<>();
        
        profilee.add(new Profile("Faradhanti Putri", "31 Desember 1997", "Perempuan", "Mahasiswi", "fara.dhanti@gmail.com"));
        profilee.add(new Profile("Mario Dwi Riadana", "17 February 1998", "Laki-Laki", "Mahasiswa", "mdr.delapan@gmail.com"));
        profilee.add(new Profile("Oka Akbar Putra", "14 April 1992", "Laki-Laki", "Mahasiswa", "death.note8@yahoo.com"));
        profilee.add(new Profile("Irijanti Kusumawati", "29 September 1971", "Perempuan", "Ibu Rumah Tangga", "irijantik@gmail.com"));
    }
}

