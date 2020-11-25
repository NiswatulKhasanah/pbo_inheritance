/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author niswa
 */
public class subpakaian extends pakaian {
    
    
    String jenis;

    public subpakaian(String bahan, String ukuran,String jenis,int harga) 
    {
        super(bahan, ukuran);
        this.jenis = jenis;
        this.harga = harga;
    }
     public String getjenis()
    {
         return jenis ;
    }

}
