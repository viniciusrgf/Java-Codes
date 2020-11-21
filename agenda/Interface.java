package school.cesar.poo.av2.agenda;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Interface extends javax.swing.JFrame {
    public Interface() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(getWindowAdapter());
        Util.LER();
        Insere();
    }


    public static void Insere() {
        jTable1.removeAll();
        List<Contato> AllContacts = Util.getAllContacts();
        if (AllContacts != null) {           
            String colNames[] = {"Nome","Email", "Endereço", "Telefone"};
            DefaultTableModel dtm = new DefaultTableModel(null, colNames);

            for (int i = 0; i < AllContacts.size(); i++) {
                dtm.addRow(new String[4]);
            }
            jTable1.setModel(dtm);

            if (AllContacts.size() > 0) {
                int row = 0;
                for (Contato c : AllContacts) {
                    jTable1.setValueAt(c.getEndereco(), row, 2);                                       
                    jTable1.setValueAt(c.getNome(), row, 0);
                    jTable1.setValueAt(c.getTelefone(), row, 3);                   
                    jTable1.setValueAt(c.getEmail(), row, 1);
                    row++;
                }
                jTable1.getColumn("Endereço").setMaxWidth(130);
                jTable1.getColumn("Nome").setMaxWidth(130);
                jTable1.getColumn("Telefone").setMaxWidth(110);
                jTable1.getColumn("Email").setMaxWidth(110);
            }     
        }
    }

    private WindowAdapter getWindowAdapter() {
        return new WindowAdapter() {
          
        };
    }

    public void CloseApp() {
        this.dispose();
    }
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null,null},
                {null, null, null,null},
                {null, null, null,null},
                {null, null, null,null}
            },
            new String [] {
                "Nome", "Email", "Endereço","Telefone"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Adicionar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Deletar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 306, GroupLayout.PREFERRED_SIZE)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(33)
        					.addComponent(jButton1))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(48)
        					.addComponent(jButton3)))
        			.addGap(90))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        					.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(21)
        					.addComponent(jButton1)
        					.addGap(18)
        					.addComponent(jButton3)))
        			.addGap(219))
        );
        getContentPane().setLayout(layout);

        pack();
        setLocationRelativeTo(null);
    }                       
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable jTable1;
                
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        adiciona Form = new adiciona();
        Form.setFormMode(true);
        Form.setVisible(true);
    }                                       

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                        
         int row = jTable1.getSelectedRow(); 
        if(row != -1){
            String nome = (String)jTable1.getValueAt(row,0);
            String telefone = (String)jTable1.getValueAt(row,3);
            String email = (String)jTable1.getValueAt(row,1);
            String endereco = (String)jTable1.getValueAt(row,2);
           
            Contato C = new Contato();
            C.setEmail(email);
            C.setNome(nome);
            C.setTelefone(telefone);
            C.setEndereco(endereco);
           
            if (JOptionPane.showConfirmDialog(null, "Tem certeza? " + nome + "?",
                    "Confirmation Box", JOptionPane.OK_CANCEL_OPTION) == 0) { 
                Util.Deleta(C);
            }
        }
    }                                       
    public static void main(String args[]) {
  
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }
                

}