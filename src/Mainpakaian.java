/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author niswa
 */
public class Mainpakaian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        subpakaian PakaianDewasa = new subpakaian ("Katun","XL","Baju Pesta", (int)350000);
        System.out.println ("Bahan Pakaian = "+PakaianDewasa.getbahan());
        System.out.println ("Ukuran Pakaian = "+PakaianDewasa.getukuran());
        System.out.println ("Jenis Pakaian = "+PakaianDewasa.getjenis());
        System.out.println ("Harga Pakaian = "+PakaianDewasa.getharga());
        
        
    }
    
}
