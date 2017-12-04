package view;
import controller.ClienteController;
import javax.swing.JOptionPane;
import model.Cliente;

public class CadastroCliente extends javax.swing.JFrame {
    private Cliente cliente = new Cliente();
   

    public CadastroCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jNome = new javax.swing.JLabel();
        jNome1 = new javax.swing.JLabel();
        jNome2 = new javax.swing.JLabel();
        jNome3 = new javax.swing.JLabel();
        jNome4 = new javax.swing.JLabel();
        jNome5 = new javax.swing.JLabel();
        jNome6 = new javax.swing.JLabel();
        jNome7 = new javax.swing.JLabel();
        jNome8 = new javax.swing.JLabel();
        jNome9 = new javax.swing.JLabel();
        jTextNome = new javax.swing.JTextField();
        jTextEndereco = new javax.swing.JTextField();
        jTextBairro = new javax.swing.JTextField();
        jTextCidade = new javax.swing.JTextField();
        jTextEmail = new javax.swing.JTextField();
        jTextDataNasc = new javax.swing.JFormattedTextField();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jTextCpf = new javax.swing.JFormattedTextField();
        jTextRg = new javax.swing.JFormattedTextField();
        jTextTelefone = new javax.swing.JFormattedTextField();
        jTextCelular = new javax.swing.JFormattedTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        jLabel2.setText("Cadastro de Cliente");

        jNome.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jNome.setText("Nome");

        jNome1.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jNome1.setText("Cpf");

        jNome2.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jNome2.setText("RG");

        jNome3.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jNome3.setText("E-mail");

        jNome4.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jNome4.setText("Endereço");

        jNome5.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jNome5.setText("Bairro");

        jNome6.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jNome6.setText("Cidade");

        jNome7.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jNome7.setText("Data Nasc.");

        jNome8.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jNome8.setText("Telefone");

        jNome9.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jNome9.setText("Celular");

        jTextNome.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N

        jTextEndereco.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jTextEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextEnderecoActionPerformed(evt);
            }
        });

        jTextBairro.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N

        jTextCidade.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N

        jTextEmail.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N

        try {
            jTextDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jButtonCadastrar.setBackground(new java.awt.Color(0, 102, 204));
        jButtonCadastrar.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        jButtonCancelar.setBackground(new java.awt.Color(255, 51, 51));
        jButtonCancelar.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jButtonCancelar.setText("Voltar");
        jButtonCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCancelarMouseClicked(evt);
            }
        });

        try {
            jTextCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jTextRg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##.###.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jTextTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jTextCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(325, 325, 325)
                .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(287, 287, 287))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(333, 333, 333))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jNome, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jNome2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextRg))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jNome8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jNome5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextBairro)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jNome7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextDataNasc)
                            .addComponent(jTextCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jNome4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextEndereco))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jNome6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jNome9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jNome3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(444, 444, 444)))))
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jNome1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNome2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jNome7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextRg, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jNome4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jNome5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(32, 32, 32)
                                .addComponent(jNome8, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jNome6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(24, 24, 24)
                                .addComponent(jTextCelular))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jNome9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jNome3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jMenu1.setText("Menu");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextEnderecoActionPerformed

    private void jButtonCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCancelarMouseClicked
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarMouseClicked

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        if(!this.jTextNome.getText().isEmpty()){
        this.getCliente().setNome(this.jTextNome.getText());
        this.getCliente().setBairro(this.jTextBairro.getText());
        this.getCliente().setCelular(this.jTextCelular.getText());
        this.getCliente().setCidade(this.jTextCidade.getText());
        this.getCliente().setCpf(this.jTextCpf.getText());
        if(this.jTextDataNasc.getText().equals("  /  /    ")){
            this.getCliente().setDataNasc("11/11/1111");
        }
        else{
            this.getCliente().setDataNasc(this.jTextDataNasc.getText());
        }
        
        this.getCliente().setEmail(this.jTextEmail.getText());
        this.getCliente().setEndereco(this.jTextEndereco.getText());
        this.getCliente().setRg(this.jTextRg.getText());
        this.getCliente().setTelefone(this.jTextTelefone.getText());
                
        ClienteController clienteController = new ClienteController();
        clienteController.cadastrarCliente(cliente);
        this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(null, "Necessário informar um nome!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel jNome;
    private javax.swing.JLabel jNome1;
    private javax.swing.JLabel jNome2;
    private javax.swing.JLabel jNome3;
    private javax.swing.JLabel jNome4;
    private javax.swing.JLabel jNome5;
    private javax.swing.JLabel jNome6;
    private javax.swing.JLabel jNome7;
    private javax.swing.JLabel jNome8;
    private javax.swing.JLabel jNome9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextBairro;
    private javax.swing.JFormattedTextField jTextCelular;
    private javax.swing.JTextField jTextCidade;
    private javax.swing.JFormattedTextField jTextCpf;
    private javax.swing.JFormattedTextField jTextDataNasc;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JTextField jTextEndereco;
    private javax.swing.JTextField jTextNome;
    private javax.swing.JFormattedTextField jTextRg;
    private javax.swing.JFormattedTextField jTextTelefone;
    // End of variables declaration//GEN-END:variables

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
}
