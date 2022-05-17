/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classe;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author PhillipeSilva
 */
public class CampeonatoBrasileiro extends AbstractTableModel{
    
 public static final int COL_CODIGO = 0;

 public static final int COL_NOME = 1;
 
 public static final int COL_SIGLA = 2;
 
 public static final int COL_ESTADO = 3;

 private static final int TOTAL_COLUNAS = 4;
  
 private String[] colunas = {"Código","Nome","Sigla","Estado"};
      
 public ArrayList<Equipe> Equipes;

    public CampeonatoBrasileiro() {
        super();
        this.Equipes = new ArrayList<Equipe>();
    }
    
    public void AdicionarTimes(Equipe equipe){
        this.Equipes.add(equipe);
    }
    
    public void add (Equipe equip){
        this.Equipes.add(equip);
        
        // Atualizando tabela
        fireTableRowsInserted(Equipes.size()-1, Equipes.size()-1);
        
    }
    
    public List<Equipe> mostrarnatabela() throws SQLException{
        
             
  return Equipes;
    
    }
 
    public double listatabela (){     
        for (Equipe equipe : this.Equipes){
        System.out.printf("\n<==================>\n"+ equipe);
        }
        return Equipes.hashCode();
    }
    
    public void Limpatabela() {
        this.Equipes.clear();
    }
 
    public void removerProduto(int numeroProduto) {
		if(numeroProduto < 0 ) {
			System.out.println("\n Produto invalido para remocao");
		}
		else {
			if(numeroProduto > this.Equipes.size()) {
				System.out.println("\n Produto maior do que tamanho da colecao. Produto invalido para remocao");
			}
			else {
				this.Equipes.remove(numeroProduto);		
			}
		}		
	}

    @Override
    public int getRowCount() {
      return Equipes.size();
    }

    @Override
    public int getColumnCount() {
      return TOTAL_COLUNAS;   
    }
    
    public String getColumnName(int col){
        return colunas[col];
    }

    @Override
    public Object getValueAt(int row, int col) {
        
              
                switch(col) {

         case COL_CODIGO: return String.valueOf(Equipes.get(row).getId());

         case COL_NOME  : return Equipes.get(row).getNome();
         
         case COL_SIGLA : return Equipes.get(row).getSigla();
             
         case COL_ESTADO : return Equipes.get(row).getEstado();

         default: return null;

         }  
    
    }
    
       public Class getColumnClass(int c) {

         return Equipes.isEmpty() ? Object.class : String.class; // todas as colunas retornam String

 }
 

 // retorna um cliente

 public Equipe getCliente(int row) {

         return Equipes.get(row);

 }

 // retorna true para colunas editáveis

 public boolean isCellEditable(int row, int col) {

         return false;

 }
    
}
