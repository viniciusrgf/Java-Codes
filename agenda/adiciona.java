package school.cesar.poo.av2.agenda;

 import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFrame;

public class adiciona extends javax.swing.JFrame {

    private boolean formMode;
    public adiciona() {
        initComponents();       
    }
   

    public void MapTextBox(Contato c){
        if(c != null){
            JTextNome.setText(c.getNome());
            JTextTelefone.setText(c.getTelefone());
            jTextEmail.setText(c.getEmail()); 
            textField.setText(c.getEndereco());
        }
    }
    
     protected void CloseDialog()
     {
         this.dispose();
     }
    private void initComponents() {
        jLabel2 = new javax.swing.JLabel();
        JTextNome = new javax.swing.JTextField();
        JTextTelefone = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextEmail = new javax.swing.JTextField();
        textField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextStatus = new javax.swing.JTextField();

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);


        jLabel2.setText("Nome");


        JTextTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTextPhoneKeyPressed(evt);
            }
        });

        jLabel3.setText("Telefone");


        jLabel4.setText("E-mail");

        jButton1.setText("Confirmar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextStatus.setBackground(new java.awt.Color(153, 153, 153));
        jTextStatus.setForeground(new java.awt.Color(255, 255, 255));
        jTextStatus.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextStatus.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jTextStatus.setEnabled(false);
        
        JLabel enderec = new JLabel("Endere\u00E7o");
        
        textField = new JTextField();
        textField.setColumns(10);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jTextStatus, 313, 313, 313)
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(jLabel2)
        					.addGap(18)
        					.addComponent(JTextNome, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(59)
        					.addComponent(jButton1)
        					.addGap(87)
        					.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(jLabel4)
        					.addGap(18)
        					.addComponent(jTextEmail, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(enderec)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(textField))
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(jLabel3)
        					.addPreferredGap(ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
        					.addComponent(JTextTelefone, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(JTextNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel4)
        				.addComponent(jTextEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(enderec))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel3)
        				.addComponent(JTextTelefone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(15)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jButton1)
        				.addComponent(jButton2))
        			.addPreferredGap(ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
        			.addComponent(jTextStatus, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
        );
        getContentPane().setLayout(layout);

        pack();
        setLocationRelativeTo(null);
    }                 

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        CloseDialog();
    }                                       

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        String Nome = JTextNome.getText();
        String Telefone = JTextTelefone.getText();
        String Email = jTextEmail.getText();
        String Endereco = textField.getText();
        String buildContact = "";
       
        if(!Nome.isEmpty()){
            buildContact += Nome + ",";
        }else {
            buildContact += "NULL" + ",";
        }
       
        if(!Telefone.isEmpty()){
            buildContact += Telefone + ",";
        }else {
            buildContact += "NULL" + ",";
        }
       
        if(!Email.isEmpty()){
            buildContact += Email + ",";
        }else {
            buildContact += "NULL" + ",";
        }
        if(!Endereco.isEmpty()){
            buildContact += Endereco + ",";
        }else {
            buildContact += "NULL" + ",";
        }
       
        buildContact = buildContact.substring(0,buildContact.length() -1);
       
        if(formMode){
            if(Util.appendTextContact(buildContact + "\r\n")){
                JOptionPane.showMessageDialog(null,"adicionado: " + Nome);               
                Util.LER();
                Interface.Insere();
                CloseDialog();
            }
        }
       
    }                                       

    private void JTextPhoneKeyPressed(java.awt.event.KeyEvent evt) {                                     
        if(JTextTelefone.getText().length() == 12){
            JTextTelefone.setText(JTextTelefone.getText().substring(0,JTextTelefone.getText().length() -1));
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
            java.util.logging.Logger.getLogger(adiciona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adiciona().setVisible(true);
            }
        });
    }
                 
    private javax.swing.JTextField JTextNome;
    private javax.swing.JTextField JTextTelefone;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JTextField jTextStatus;
    private JTextField textField;
    public boolean isFormMode() {
        return formMode;
    }


    public void setFormMode(boolean formMode) {
        this.formMode = formMode;
    }

}
