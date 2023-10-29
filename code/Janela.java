package code;


import javax.swing.*;
import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;

public class Janela {
    private final JFrame frame;
    private final JPanel panel;
    private final GridBagConstraints container;

    private final JLabel nome;
    private final JTextField entradaNome;

    private final JLabel forca;
    private final JSlider forAtr;
    private final JLabel forcaGet;

    private final JLabel constituicao;
    private final JSlider constAtr;
    private final JLabel constGet;

    private final JLabel destreza;
    private final JSlider desAtr;
    private final JLabel desGet;

    private final JLabel agilidade;
    private final JSlider agiAtr;
    private final JLabel agiGet;

    private final JLabel inteligencia;
    private final JSlider intAtr;
    private final JLabel intGet;

    private final JLabel forVontade;
    private final JSlider forVontadeAtr;
    private final JLabel forVontadeGet;

    private final JLabel percepcao;
    private final JSlider perAtr;
    private final JLabel perGet;

    private final JLabel carisma;
    private final JSlider carAtr;
    private final JLabel carGet;

    private final JButton btn_concluir;

    public Janela(){
        frame = new JFrame("Perfil Jogador");
        panel = new JPanel(new GridBagLayout());
        container = new GridBagConstraints();

        nome = new JLabel("Nome:");
        entradaNome = new JTextField(18);

        forca = new JLabel("Força(FOR) :");
        forAtr = new JSlider(JSlider.HORIZONTAL,1,100,1);
        forcaGet = new JLabel(String.valueOf(forAtr.getValue()));

        constituicao = new JLabel("Contituição(CON) :");
        constAtr = new JSlider(JSlider.HORIZONTAL,1,100,1);
        constGet = new JLabel(String.valueOf(constAtr.getValue()));

        destreza = new JLabel("Destreza(DEX) :");
        desAtr = new JSlider(1,100,1);
        desGet = new JLabel(String.valueOf(desAtr.getValue()));

        agilidade = new JLabel("Agilidade(AGI) :");
        agiAtr = new JSlider(1,100,1);
        agiGet = new JLabel(String.valueOf(agiAtr.getValue()));

        inteligencia = new JLabel("Inteligência(INT) :");
        intAtr = new JSlider(1,100,1);
        intGet = new JLabel(String.valueOf(intAtr.getValue()));

        forVontade = new JLabel("Força De Vontade(WILL) :");
        forVontadeAtr = new JSlider(1,100,1);
        forVontadeGet = new JLabel(String.valueOf(forVontadeAtr.getValue()));

        percepcao = new JLabel("Percepcao(PER) :");
        perAtr = new JSlider(1,100,1);
        perGet = new JLabel(String.valueOf(perAtr.getValue()));

        carisma = new JLabel("Carisma(CAR) :");
        carAtr = new JSlider(1,100,1);
        carGet = new JLabel(String.valueOf(carAtr.getValue()));

        btn_concluir = new JButton("Salvar");

        logica();
    }

    private void logica(){
        container.insets = new Insets(5,1,5,1);



        container.gridx = 0;
        container.gridy = 0;
        container.gridwidth = 1;
        panel.add(nome,container);

        container.gridx = 1;
        container.gridy = 0;
        container.gridwidth = 2;
        panel.add(entradaNome,container);


        container.gridx = 0;
        container.gridy = 1;
        container.gridwidth = 1;
        panel.add(forca,container);

        container.gridx = 1;
        container.gridy = 1;
        container.gridwidth = 1;
        panel.add(forAtr,container);

        container.gridx = 2;
        container.gridy = 1;
        container.gridwidth = 1;
        panel.add(forcaGet,container);

        container.gridx = 0;
        container.gridy = 2;
        container.gridwidth = 1;
        panel.add(constituicao,container);

        container.gridx = 1;
        container.gridy = 2;
        container.gridwidth = 1;
        panel.add(constAtr,container);

        container.gridx = 2;
        container.gridy = 2;
        container.gridwidth = 1;
        panel.add(constGet,container);

        container.gridx = 0;
        container.gridy = 3;
        container.gridwidth = 1;
        panel.add(destreza,container);

        container.gridx = 1;
        container.gridy = 3;
        container.gridwidth = 1;
        panel.add(desAtr,container);

        container.gridx = 2;
        container.gridy = 3;
        container.gridwidth = 1;
        panel.add(desGet,container);

        container.gridx = 0;
        container.gridy = 4;
        container.gridwidth = 1;
        panel.add(agilidade,container);

        container.gridx = 1;
        container.gridy = 4;
        container.gridwidth = 1;
        panel.add(agiAtr,container);

        container.gridx = 2;
        container.gridy = 4;
        container.gridwidth = 1;
        panel.add(agiGet,container);

        container.gridx = 0;
        container.gridy = 5;
        container.gridwidth = 1;
        panel.add(inteligencia,container);

        container.gridx = 1;
        container.gridy = 5;
        container.gridwidth = 1;
        panel.add(intAtr,container);

        container.gridx = 2;
        container.gridy = 5;
        container.gridwidth = 1;
        panel.add(intGet,container);

        container.gridx = 0;
        container.gridy = 6;
        container.gridwidth = 1;
        panel.add(forVontade,container);

        container.gridx = 1;
        container.gridy = 6;
        container.gridwidth = 1;
        panel.add(forVontadeAtr,container);

        container.gridx = 2;
        container.gridy = 6;
        container.gridwidth = 1;
        panel.add(forVontadeGet,container);

        container.gridx = 0;
        container.gridy = 7;
        container.gridwidth = 1;
        panel.add(percepcao,container);

        container.gridx = 1;
        container.gridy = 7;
        container.gridwidth = 1;
        panel.add(perAtr,container);

        container.gridx = 2;
        container.gridy = 7;
        container.gridwidth = 1;
        panel.add(perGet,container);

        container.gridx = 0;
        container.gridy = 8;
        container.gridwidth = 1;
        panel.add(carisma,container);

        container.gridx = 1;
        container.gridy = 8;
        container.gridwidth = 1;
        panel.add(carAtr,container);

        container.gridx = 2;
        container.gridy = 8;
        container.gridwidth = 1;
        panel.add(carGet,container);

        container.gridx = 1;
        container.gridy = 9;
        container.gridwidth = 2;
        panel.add(btn_concluir,container);

        forAtr.addChangeListener(e -> forcaGet.setText(String.valueOf(forAtr.getValue())));

        constAtr.addChangeListener(e -> constGet.setText(String.valueOf(constAtr.getValue())));

        desAtr.addChangeListener(e -> desGet.setText(String.valueOf(desAtr.getValue())));

        agiAtr.addChangeListener(e -> agiGet.setText(String.valueOf(agiAtr.getValue())));

        intAtr.addChangeListener(e -> intGet.setText(String.valueOf(intAtr.getValue())));

        forVontadeAtr.addChangeListener(e -> forVontadeGet.setText(String.valueOf(forVontadeAtr.getValue())));

        perAtr.addChangeListener(e -> perGet.setText(String.valueOf(perAtr.getValue())));

        carAtr.addChangeListener(e -> carGet.setText(String.valueOf(carAtr.getValue())));

        btn_concluir.addActionListener(e -> salvar());
        panel.setBackground(Color.BLACK);
        panel.setForeground(Color.BLUE);

        for(Component component: panel.getComponents()){
            if (component instanceof JComponent jComponent) {
                jComponent.setOpaque(false);
                jComponent.setForeground(panel.getForeground());
            }
        }


        frame.add(panel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(400,400));

        frame.setAlwaysOnTop(true);
        frame.setResizable(false);
        frame.setVisible(true);

    }
    private void salvar(){
        String atributos = getString();
        if(atributos != null) {

            int resp = JOptionPane.showConfirmDialog(frame, atributos, "Atributos Jogador", JOptionPane.YES_NO_OPTION);
            if (resp == JOptionPane.YES_OPTION) {
                try {
                    FileWriter writer = new FileWriter("Jogador_Status.txt");
                    writer.write(atributos);
                    writer.close();
                    JOptionPane.showMessageDialog(frame, "Atributos Do Jogador Salvos: jogador_status.txt");
                    limpar();
                } catch (IOException ioe) {
                    JOptionPane.showMessageDialog(frame, "Nao Foi Possivel Salvar os Atributos Do Jogador: " + ioe.getCause());
                }
            }
        }else {
            JOptionPane.showMessageDialog(frame,"É Necessario o Nome para Poder Salvar");
        }
    }

    private String getString() {
        String NM = entradaNome.getText();
        String FOR = forcaGet.getText();
        String CON = constGet.getText();
        String DEX = desGet.getText();
        String AGI = agiGet.getText();
        String INT = intGet.getText();
        String WILL = forVontadeGet.getText();
        String PER = perGet.getText();
        String CAR = carGet.getText();

        if(!NM.isEmpty()) {
            return "NOME: " + NM + '\n' +
                    "FOR: " + FOR + '\n' +
                    "CON: " + CON + '\n' +
                    "DEX: " + DEX + '\n' +
                    "AGI: " + AGI + '\n' +
                    "INT: " + INT + '\n' +
                    "WILL: " + WILL + '\n' +
                    "PER: " + PER + '\n' +
                    "CAR: " + CAR + '\n';
        }else {
            return null;
        }
    }
    private void limpar(){
        nome.setText(null);
        entradaNome.setText(null);
        forAtr.setValue(1);
        forcaGet.setText("1");
        constAtr.setValue(1);
        constGet.setText("1");
        desAtr.setValue(1);
        desGet.setText("1");
        agiAtr.setValue(1);
        agiGet.setText("1");
        intAtr.setValue(1);
        intGet.setText("1");
        forVontadeAtr.setValue(1);
        forVontadeGet.setText("1");
        perAtr.setValue(1);
        perGet.setText("1");
        carAtr.setValue(1);
        carGet.setText("1");
    }
}