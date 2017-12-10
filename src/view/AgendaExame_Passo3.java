package view;
import controller.ClienteController;
import controller.ConsultaController;
import model.Cliente;
import model.Exame;
import model.Atendimento;
import model.Medico;

public class AgendaExame_Passo3 extends javax.swing.JFrame {
    private Exame exame;
    private Atendimento consulta = new Atendimento();
    

    public AgendaExame_Passo3() {
        super("Agendamento de Exame");
        initComponents();
     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jNome = new javax.swing.JLabel();
        jTextNome = new javax.swing.JTextField();
        jNome1 = new javax.swing.JLabel();
        jTextCpf = new javax.swing.JFormattedTextField();
        jNome2 = new javax.swing.JLabel();
        jComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        jLabel2.setText("Agendar um Exame");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(120, 30, 228, 34);

        jButtonCadastrar.setBackground(new java.awt.Color(0, 102, 204));
        jButtonCadastrar.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jButtonCadastrar.setText("Agendar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadastrar);
        jButtonCadastrar.setBounds(93, 274, 121, 43);

        jButtonCancelar.setBackground(new java.awt.Color(255, 51, 51));
        jButtonCancelar.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jButtonCancelar.setText("Voltar");
        jButtonCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCancelarMouseClicked(evt);
            }
        });
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar);
        jButtonCancelar.setBounds(267, 274, 127, 43);

        jNome.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jNome.setText("Nome do Cliente");
        getContentPane().add(jNome);
        jNome.setBounds(28, 88, 106, 16);

        jTextNome.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        getContentPane().add(jTextNome);
        jTextNome.setBounds(142, 80, 279, 33);

        jNome1.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jNome1.setText("Cpf");
        getContentPane().add(jNome1);
        jNome1.setBounds(24, 139, 64, 16);

        try {
            jTextCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jTextCpf);
        jTextCpf.setBounds(142, 131, 279, 33);

        jNome2.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jNome2.setText("Tipo de Atendimento");
        getContentPane().add(jNome2);
        jNome2.setBounds(24, 186, 114, 26);

        jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione um tipo>", "Cortesia", "Cartão","Dinheiro","Cheque", "Convênio" }));
        getContentPane().add(jComboBox);
        jComboBox.setBounds(142, 182, 279, 34);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/teste.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 450, 350);

        jMenu1.setText("Menu");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(462, 406));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCancelarMouseClicked
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarMouseClicked

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        ClienteController clienteController = new ClienteController();
        Cliente cliente = clienteController.pesquisarCliente(jTextNome.getText(), jTextCpf.getText());
        if(cliente == null){
            CadastroCliente cadastro = new CadastroCliente();
            String texto = (String)this.jTextNome.getText();
            cadastro.jTextNome.setText(texto);
            cadastro.jTextCpf.setText(this.jTextCpf.getText());
            cadastro.setVisible(true);
        }
        
        this.getConsulta().setId_medico(null);
        this.getConsulta().setEspecialidade(null);
        this.getConsulta().setExame(this.getExame().getNome());
        this.getConsulta().setId_cliente(cliente.getId());
        this.getConsulta().setNomeCliente(cliente.getNome());
        this.getConsulta().setNomeMedico(null);
        this.getConsulta().setTipo((String) this.jComboBox.getSelectedItem());
        
        ConsultaController consult = new ConsultaController();
        consult.cadastrarConsulta(this.getConsulta());
        this.dispose();
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        AgendaExame agenda = new AgendaExame();
        agenda.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgendaExame_Passo3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JComboBox<String> jComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel jNome;
    private javax.swing.JLabel jNome1;
    private javax.swing.JLabel jNome2;
    private javax.swing.JFormattedTextField jTextCpf;
    private javax.swing.JTextField jTextNome;
    // End of variables declaration//GEN-END:variables

    public Exame getExame() {
        return exame;
    }

    public void setExame(Exame exame) {
        this.exame = exame;
    }

    public Atendimento getConsulta() {
        return consulta;
    }

    public void setConsulta(Atendimento consulta) {
        this.consulta = consulta;
    }
    
    
    
}
