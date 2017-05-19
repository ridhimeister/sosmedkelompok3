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
public class Circle{
    private Profile HanyaSaya, Keluarga, Teman;
    
    public Circle(Profile HanyaSaya, Profile Keluarga, Profile Teman){
        this.HanyaSaya = HanyaSaya;
        this.Keluarga = Keluarga;
        this.Teman = Teman;
    }
    
    public Circle(Profile HanyaSaya, Profile Keluarga){
        this.HanyaSaya = HanyaSaya;
        this.Keluarga = Keluarga;
    }
    
    public Circle(Profile Teman){
        this.Teman = Teman;
    }
    
    public void setProfile(Profile HanyaSaya){
        this.HanyaSaya = HanyaSaya;
    }
    
    public Profile getHanyaSaya(){
        return HanyaSaya;
    }
    
    public void setKeluarga(Profile Keluarga){
        this.Keluarga = Keluarga;
    }
    
    public Profile getKeluarga(){
        return Keluarga;
    }
    
    public void setTeman(Profile Teman){
        this.Teman = Teman;
    }
    
    public Profile getTeman(){
        return Teman;
    }
}
