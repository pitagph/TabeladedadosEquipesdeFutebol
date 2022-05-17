/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inicial;

import Classe.CampeonatoBrasileiro;
import Classe.Equipe;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

/**
 *
 * @author PhillipeSilva
 */
public class Index extends JFrame{
    
  private CampeonatoBrasileiro CBrasil = new CampeonatoBrasileiro();
    
  private JTable table;
  private JScrollPane scroller;
       
    public void Menu() {
        System.out.println("Campeonato Brasileiro 2022");
        System.out.println("");
        System.out.println("");
            this.CBrasil.AdicionarTimes(new Equipe(01,"Corinthians", "COR", "São Paulo"));
            this.CBrasil.AdicionarTimes(new Equipe(02,"Fluminense", "FLU", "Rio de Janeiro"));
            this.CBrasil.AdicionarTimes(new Equipe(03,"Ceará","CE","Ceará"));
            
          System.out.println("====== Lista Equipes Campeonato Brasileiro 2022 =====");
          this.CBrasil.listatabela();    

            // Inicializando a Tabela e guardando as informações da Lista.
            this.table = new JTable(this.CBrasil);
   
            // só permite selecionar 1 linha por vez
            table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

         // coloca table num scroll
         scroller = new JScrollPane(this.table);
         
         setLayout(new BorderLayout());
         
         getContentPane().add(scroller, BorderLayout.CENTER);
         
         setSize(550,450);
         
         setVisible(true);
         
         setTitle("Lista das Equipes do Campeonato Brasileiro de Futebol 2022");
         
         
         //Botão novo
        JButton btAdd = new JButton("Add");

        btAdd.addActionListener((ActionListener) new btnovaEquipeListener());

        JPanel panel = new JPanel();

        panel.add(btAdd);
        
        getContentPane().add(panel, BorderLayout.SOUTH) ;
                        
      }
    
    
    public class btnovaEquipeListener implements ActionListener {
    
        @Override
        public void actionPerformed(ActionEvent e) {
          
                       String entradanome = JOptionPane.showInputDialog("Digite nome:");
                       String entradasigla = JOptionPane.showInputDialog("Digite sigla:");
                       String entradaestado = JOptionPane.showInputDialog("Digite Estado:");
            
                       if(!entradanome.equals("") && !entradasigla.equals("") && !entradaestado.equals("")) {
                      
                           CBrasil.add(new Equipe(table.getRowCount() +1, entradanome, entradasigla, entradaestado));
                           table.setRowSelectionInterval(table.getRowCount()-1, table.getRowCount()-1);
                       
                         }
                           
                           
        }
    
    }
    
}
