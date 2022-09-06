
package lib;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;

public class IssueBook extends javax.swing.JFrame {

  
    public IssueBook() {
        super("Issue Book ");
        initComponents();
        setLocation(640,250);
        setResizable(false);
        setSize(719,688);
        
        
        try{
            ConnectionClass obj1 = new ConnectionClass();
            String q = "select Bid from lms_books";
            ResultSet rs = obj1.s.executeQuery(q);
            while(rs.next())
            {
                choice1.add(rs.getString("Bid"));
            }
        }
        
        catch(Exception ee)
        {
            ee.printStackTrace();
        }
        
        
        choice1.addMouseListener(new MouseAdapter()
       {
           @Override
           public void mouseClicked(MouseEvent clk0)
           {
                try{
                    ConnectionClass obj2 = new ConnectionClass();
                    int id = Integer.parseInt(choice1.getSelectedItem());
                    String q0="select * from lms_books where Bid='"+id+"'";
                     ResultSet rs1 = obj2.s.executeQuery(q0);
                    
                     while(rs1.next())
                     {
                        jTextField1.setText(rs1.getString("ISBN"));
                        jTextField2.setText(rs1.getString("bookname"));
                        jTextField6.setText(rs1.getString("quantity"));
                       }
                     }
               
                catch(Exception ex){
                   
                    ex.printStackTrace();;
                   }
           }
       });
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        choice1 = new java.awt.Choice();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Issue Book ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 220, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1359, 57));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("ID");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 125, -1, -1));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("ISBN");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 167, -1, -1));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("Book Name");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 211, -1, -1));

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setText("Member ID");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 255, -1, -1));

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setText("Member Name");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 296, -1, -1));

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 102));
        jLabel7.setText("Member Contact");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 340, -1, -1));

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 102));
        jLabel8.setText("Quantity");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 392, -1, -1));

        jTextField1.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(638, 166, 200, -1));

        jTextField2.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(638, 210, 200, -1));

        jTextField3.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(638, 254, 200, -1));

        jTextField4.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(638, 295, 200, -1));

        jTextField5.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jPanel2.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(638, 339, 200, -1));

        jTextField6.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jPanel2.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(638, 391, 200, -1));
        jPanel2.add(choice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(638, 125, 200, -1));

        jButton1.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 102));
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 440, -1, -1));

        jButton2.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 102));
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 440, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lib/images/books.png"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 120, 80));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-210, 60, 1010, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            int qty =0;
          int id = Integer.parseInt(choice1.getSelectedItem());
          String bookid = jTextField1.getText();
          String bookname = jTextField2.getText();
          int memid =Integer.parseInt(jTextField3.getText());
          String membname = jTextField4.getText();
          String membcont = jTextField5.getText();
          java.util.Date dt = new java.util.Date();
          
          SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
          String strDate= formatter.format(dt);
          
          try{
              ConnectionClass obj3 = new ConnectionClass();
              String q1= "select quantity from lms_books where Bid='"+id+"'"; 
              ResultSet res2 = obj3.s.executeQuery(q1);
              
            
              while(res2.next())
              {
                  qty = Integer.parseInt(res2.getString("quantity"));
              }
              
              if(qty<=0)
              {
                  JOptionPane.showMessageDialog(null,"Book Unavailable");
                  this.setVisible(false);
              }
              
              else{
                  String q2="insert into lms_issuebook(id,bookid, bookname, memid,membname ,membcont,date) value('"+id+"','"+bookid+"','"+bookname+"','"+memid+"','"+membname+"','"+membcont+"','"+strDate+"')";
                  String q3="update lms_books set issued = issued+1 where Bid='"+id+"'";
                  String q4="update lms_books set quantity=quantity-1 where Bid='"+id+"'";
                   
                  int n1 = obj3.s.executeUpdate(q2);
                  int n2 = obj3.s.executeUpdate(q3);
                  int n3 = obj3.s.executeUpdate(q4);
                  
                  if(n1==1)
                  {
                      if(n2==1)
                      {
                          if(n3==1)
                          {
                              JOptionPane.showMessageDialog(null,"Successfully updated");
                              this.setVisible(false);
                              new IssueBook().setVisible(true);
                          }
                          
                          else
                          {
                              JOptionPane.showMessageDialog(null,"Please try again");
                          }
                      }
                      else
                      {
                          JOptionPane.showMessageDialog(null,"Please try again");
                      }
                  }
                     else
                      {
                          JOptionPane.showMessageDialog(null,"Please try again");
                      }
              }
             
              
          }
          catch(Exception ex){
              ex.printStackTrace();
          }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        new LibrarianSection().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed


    public static void main(String args[]) {
    
                new IssueBook().setVisible(true);
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Choice choice1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
