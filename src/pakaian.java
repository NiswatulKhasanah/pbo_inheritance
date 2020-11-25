/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author niswa
 */
public class pakaian {
     String bahan;
     String ukuran ;
     int harga;
     
        public pakaian (String bahan,String ukuran)
        {
        this.bahan=bahan;
        this.ukuran = ukuran;
        }
        public String getbahan()
        {
        return bahan ;
        }
        public String getukuran()
        {
        return ukuran;  
        }
        public int getharga()
        {
        return harga;
        }
}
