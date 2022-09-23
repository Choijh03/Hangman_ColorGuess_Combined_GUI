/*************************************************************** 
* file: End.java 
* author: Jihun Choi
* assignment: Point and Click Game - v.1.1
* date last modified: 9/22/2022 
* 
* purpose: This class is jFrmae class that is used for End screen
* Once this class is constucted, It will display end screen to show total score
* 
****************************************************************/
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.hang_v1;
import java.io.File;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
/**
 *
 * @author PC
 */
public class End extends javax.swing.JFrame {
    private String scoreString = "";
    private String newName = "";
    private String name1 = ""; //name1 place holder
    private String name2 = ""; //name2 place holder
    private String name3 = ""; //name3 place holder    
    private String score1 = ""; //score1 place holder
    private String score2 = ""; //score2 place holder
    private String score3 = ""; //score3 place holder
    
    private int scoreint =0;
    private int score1int = 0;
    private int score2int = 0;
    private int score3int = 0;
    /**
     * Creates new form End
     */
    public End() {
        initComponents();       
        this.setBounds(0, 0, 610, 435); //setting the bound
        this.setLocationRelativeTo(null); //setting the screen to center
        read("current_score.txt");
        jLabel1.setText(scoreString);
        read4("score1.txt");        
        read5("score2.txt");       
        read6("score3.txt");      
        
        if(scoreint > score3int)
        {
            jLabel3.setVisible(true);
            jLabel4.setVisible(true);
            jTextField1.setVisible(true);
            jButton2.setVisible(true);
        }
            
                       
    }
    
    // method: write1
    // purpose: this method is to write to the score information to file named "current_socre.txt
    public void write1(String new_score)
    {
        try  
    {         
        File f= new File("score1.txt");  //file to be delete  
        if(f.delete())                      //returns Boolean value  
        {  
            System.out.println(f.getName() + " deleted");   //getting and printing the file name  
        }  
        else  
        {  
            System.out.println("failed");  
        }  
    }  
    catch(Exception e)  
    {  
        e.printStackTrace();  
    }  
        
    try {
            FileWriter writer = new FileWriter("score1.txt", true);
            writer.write(new_score);           
            writer.close();
        } 
    catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
    
    // method: write2
    // purpose: this method is to write to the score information to file named "current_socre.txt
    public void write2(String new_score)
    {
        try  
    {         
        File f= new File("score2.txt");  //file to be delete  
        if(f.delete())                      //returns Boolean value  
        {  
            System.out.println(f.getName() + " deleted");   //getting and printing the file name  
        }  
        else  
        {  
            System.out.println("failed");  
        }  
    }  
    catch(Exception e)  
    {  
        e.printStackTrace();  
    }  
        
    try {
            FileWriter writer = new FileWriter("score2.txt", true);
            writer.write(new_score);           
            writer.close();
        } 
    catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
    
    // method: write3
    // purpose: this method is to write to the score information to file named "current_socre.txt
    public void write3(String new_score)
    {
        try  
    {         
        File f= new File("score3.txt");  //file to be delete  
        if(f.delete())                      //returns Boolean value  
        {  
            System.out.println(f.getName() + " deleted");   //getting and printing the file name  
        }  
        else  
        {  
            System.out.println("failed");  
        }  
    }  
    catch(Exception e)  
    {  
        e.printStackTrace();  
    }  
        
    try {
            FileWriter writer = new FileWriter("score3.txt", true);
            writer.write(new_score);           
            writer.close();
        } 
    catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
    
    // method: write4
    // purpose: this method is to write to the score information to file named "current_socre.txt
    public void write4(String new_name)
    {
        try  
    {         
        File f= new File("name1.txt");  //file to be delete  
        if(f.delete())                      //returns Boolean value  
        {  
            System.out.println(f.getName() + " deleted");   //getting and printing the file name  
        }  
        else  
        {  
            System.out.println("failed");  
        }  
    }  
    catch(Exception e)  
    {  
        e.printStackTrace();  
    }  
        
    try {
            FileWriter writer = new FileWriter("name1.txt", true);
            writer.write(new_name);           
            writer.close();
        } 
    catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
    
    // method: write4
    // purpose: this method is to write to the score information to file named "current_socre.txt
    public void write5(String new_name)
    {
        try  
    {         
        File f= new File("name2.txt");  //file to be delete  
        if(f.delete())                      //returns Boolean value  
        {  
            System.out.println(f.getName() + " deleted");   //getting and printing the file name  
        }  
        else  
        {  
            System.out.println("failed");  
        }  
    }  
    catch(Exception e)  
    {  
        e.printStackTrace();  
    }  
        
    try {
            FileWriter writer = new FileWriter("name2.txt", true);
            writer.write(new_name);           
            writer.close();
        } 
    catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
    
    // method: write4
    // purpose: this method is to write to the score information to file named "current_socre.txt
    public void write6(String new_name)
    {
        try  
    {         
        File f= new File("name3.txt");  //file to be delete  
        if(f.delete())                      //returns Boolean value  
        {  
            System.out.println(f.getName() + " deleted");   //getting and printing the file name  
        }  
        else  
        {  
            System.out.println("failed");  
        }  
    }  
    catch(Exception e)  
    {  
        e.printStackTrace();  
    }  
        
    try {
            FileWriter writer = new FileWriter("name3.txt", true);
            writer.write(new_name);           
            writer.close();
        } 
    catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
    
    public void read4(String filename)
    {
       try {
            FileReader reader = new FileReader(filename);
            int character;
 
            while ((character = reader.read()) != -1) {                   
                score1 += (char)character;
            }
            score1int = Integer.parseInt(score1); 
            reader.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void read5(String filename)
    {
       try {
            FileReader reader = new FileReader(filename);
            int character;
 
            while ((character = reader.read()) != -1) {                   
                score2 += (char)character;
            }
            score2int = Integer.parseInt(score2); 
            reader.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void read6(String filename)
    {
       try {
            FileReader reader = new FileReader(filename);
            int character;
 
            while ((character = reader.read()) != -1) {                   
                score3 += (char)character;
            }
             score3int = Integer.parseInt(score3); 
            reader.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

     public void read(String filename)
    {
       try {
            FileReader reader = new FileReader(filename);
            int character;
 
            while ((character = reader.read()) != -1) {                   
                scoreString += (char)character;
            }           
            scoreint = Integer.parseInt(scoreString); 
            reader.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("굴림", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(303, 58, 215, 65);

        jLabel2.setFont(new java.awt.Font("굴림", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Score:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(114, 63, 146, 55);

        jButton1.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jButton1.setText("End");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(510, 340, 80, 40);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(154, 301, 215, 50);
        jTextField1.setVisible(false);

        jButton2.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.setVisible(false);
        jPanel1.add(jButton2);
        jButton2.setBounds(410, 340, 90, 40);

        jLabel3.setFont(new java.awt.Font("굴림", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("If you like to save your Initials (3 letters) and score to socre board, ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(24, 212, 562, 36);
        jLabel3.setVisible(false);

        jLabel4.setFont(new java.awt.Font("굴림", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Please enter 3 letter initials in text field and clik save button");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(51, 255, 465, 39);
        jLabel4.setVisible(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

 
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jButton2.setEnabled(false);
        newName = jTextField1.getText();
        //socre1 500
        //score2 300
        //score3 150
        if(scoreint > score1int)
        {
            //write to score1 file
            write1(scoreString);
            write4(newName);
        }
        else if(scoreint > score2int)
        {
            //write to score2 file
            write2(scoreString);
            write5(newName);
        }   
        else if(scoreint > score3int)
        {
            //write to score3 file
            write3(scoreString);
            write6(newName);
        }
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
            java.util.logging.Logger.getLogger(End.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(End.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(End.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(End.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new End().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
