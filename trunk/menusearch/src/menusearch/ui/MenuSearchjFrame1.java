/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menusearch.ui;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author matthewshields
 */
public class MenuSearchjFrame1 extends javax.swing.JFrame {


    public void displayMenuResults()
    {
 
        CardLayout cl = (CardLayout)(jPanel1.getLayout());
        cl.show(jPanel1, "MenuResults");
    }
    /**
     * Creates new form MenuSearchjFrame1
     */
    public MenuSearchjFrame1() {
        initComponents();
        
        searchMenusPanel1.searchBtnAddActionListener(new ActionListener() {
      
       
      @Override
      public void actionPerformed(ActionEvent arg0) {
      CardLayout cl = (CardLayout)(jPanel1.getLayout());
        cl.show(jPanel1, "MenuResults");
      }
    });
        
        
    searchRecipePanel1.searchBtnAddActionListener(new ActionListener() {
      
       
      @Override
      public void actionPerformed(ActionEvent arg0) {
      CardLayout cl = (CardLayout)(jPanel1.getLayout());
        cl.show(jPanel1, "searchRecipeResult");
      }
    });
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        searchMenusPanel1 = new menusearch.ui.SearchMenusPanel();
        try {
            menuResultsPage1 = new menusearch.ui.MenuResultsPage();
        } catch (java.lang.ClassNotFoundException e1) {
            e1.printStackTrace();
        } catch (java.sql.SQLException e2) {
            e2.printStackTrace();
        }
        searchRecipePanel1 = new menusearch.ui.SearchRecipePanel();
        recipeSearchGetResults2 = new menusearch.ui.RecipeSearchGetResults();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Search Menus");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Search Recipes");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel1.setLayout(new java.awt.CardLayout());

        jLabel1.setText("Welcome");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(0, 504, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, "card2");

        searchMenusPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMenusPanel1MouseClicked(evt);
            }
        });
        jPanel1.add(searchMenusPanel1, "searchMenu");
        jPanel1.add(menuResultsPage1, "MenuResults");
        jPanel1.add(searchRecipePanel1, "searchRecipe");
        jPanel1.add(recipeSearchGetResults2, "searchRecipeResult");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CardLayout cl = (CardLayout)(jPanel1.getLayout());
    cl.show(jPanel1, "searchMenu");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void searchMenusPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMenusPanel1MouseClicked
   
    }//GEN-LAST:event_searchMenusPanel1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     CardLayout cl = (CardLayout)(jPanel1.getLayout());
    cl.show(jPanel1, "searchRecipe");
        
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuSearchjFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuSearchjFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuSearchjFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuSearchjFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuSearchjFrame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private menusearch.ui.MenuResultsPage menuResultsPage1;
    private menusearch.ui.RecipeSearchGetResults recipeSearchGetResults2;
    private menusearch.ui.SearchMenusPanel searchMenusPanel1;
    private menusearch.ui.SearchRecipePanel searchRecipePanel1;
    // End of variables declaration//GEN-END:variables

    
}