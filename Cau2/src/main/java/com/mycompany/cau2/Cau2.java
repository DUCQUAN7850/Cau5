/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cau2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.text.Document;
import org.jsoup.Jsoup;

/**
 *
 * @author DUC QUAN
 */
public class Cau2 {
    public static void main(String[] args) throws IOException {
        String t = Jsoup.connect("http://dantri.com.vn").get().data();
        System.out.println("Okee!");
        String ten=System.currentTimeMillis()+"";
        File a=new File(ten);
        FileWriter fw=new FileWriter(a);
        BufferedWriter bw=new BufferedWriter(fw);
        bw.write(t);
        bw.close();
        fw.close();
    }
}