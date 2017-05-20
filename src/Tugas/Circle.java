/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

public class Circle{
    private Profile HanyaSaya, Keluarga, Teman, LingkaranAnda;
    
    public Circle(Profile HanyaSaya, Profile Keluarga, Profile Teman, Profile LingkaranAnda){
        this.HanyaSaya = HanyaSaya;
        this.Keluarga = Keluarga;
        this.Teman = Teman;
        this.LingkaranAnda = LingkaranAnda;
    }
    
    public Circle(Profile HanyaSaya, Profile Keluarga, Profile Teman){
        this.HanyaSaya = HanyaSaya;
        this.Keluarga = Keluarga;
        this.Teman = Teman;
    }
    
    public Circle(Profile Teman, Profile LingkaranAnda){
        this.Teman = Teman;
        this.LingkaranAnda = LingkaranAnda;
    }
    
    public Circle(Profile LingkaranAnda){
        this.LingkaranAnda = LingkaranAnda;
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
    
    public void setLingkaranAnda(Profile LingkaranAnda){
        this.LingkaranAnda = LingkaranAnda;
    }
    
    public Profile getLingkaranAnda(){
        return LingkaranAnda;
    }
}
