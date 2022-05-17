/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PhillipeSilva
 */
public class modelotabela extends DefaultTableModel{
    
        public modelotabela(){
        this.addColumn("ID");
        this.addColumn("NOME");
        this.addColumn("SIGLA");
        this.addColumn("ESTADO");
     
        
        }
    
}
