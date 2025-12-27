import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * Dies ist ein Programm macht irgendwas.
 *
 * @author Leon
 * @version 1.0 vom 07.03.2019
 */
public class KletterwandInfos extends JFrame {

    private CardLayout cards = new CardLayout();
    private JPanel jGrund = new JPanel(null, true);
    private JPanel jbearbeiten = new JPanel(null, true);
    private JButton bWanderstellen = new JButton();
    private JButton bInfos = new JButton();
    private JLabel jUeberschriftL = new JLabel();
    private JLabel jFrage = new JLabel();
    private JLabel jhoeheL = new JLabel();
    private JTextField nfHoehe = new JTextField();
    private JLabel jbreiteL = new JLabel();
    private JTextField nfBreite = new JTextField();
    private JLabel jneigungL = new JLabel();
    private JSpinner jneigung = new JSpinner();
    private SpinnerNumberModel jSpinner1Model = new SpinnerNumberModel(0, -90, 90, 1);//erste Oberfl?che bei dem die gr??e der Wand fesgelegt wird
    private JPanel jergebnisse = new JPanel(null, true);
    private JLabel jUeberschrift2 = new JLabel();
    private JButton b1 = new JButton();
    private JButton b2 = new JButton();
    private JButton b3 = new JButton();
    private JButton b4 = new JButton();
    private JButton b5 = new JButton();
    private JButton b6 = new JButton();
    private JButton b7 = new JButton();
    private JButton b8 = new JButton();
    private JButton b9 = new JButton();
    private JButton b10 = new JButton();
    private JButton bergebniss = new JButton();
    private JButton bzurueck = new JButton();
    private JPanel jInfos = new JPanel(null, true);
    private JLabel jUeberschrift1 = new JLabel();
    private JScrollPane jTextArea1ScrollPane = new JScrollPane();
    private JButton bzurueck2 = new JButton();
    private JPanel jFertig = new JPanel(null, true);
    private JLabel jUeberschrift3 = new JLabel();
    private JLabel jGriffeL = new JLabel();
    private JLabel jGriffe = new JLabel();
    private JLabel jHoeheL = new JLabel();
    private JLabel jHoehe = new JLabel();
    private JLabel jBreiteL = new JLabel();
    private JLabel jBreite = new JLabel();
    private JLabel jNeigungL = new JLabel();
    private JLabel jNeigung = new JLabel();
    private JLabel jSeilL = new JLabel();
    private JLabel jSeil = new JLabel();
    private JLabel jStuffeL = new JLabel();
    private JLabel jStuffe = new JLabel();
    private JButton bzurueck1 = new JButton();
    private JButton bschliessen = new JButton();


    // Ende Attribute

    public KletterwandInfos() {
        // Frame-Initialisierung
        super();
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        int frameWidth = 1100;
        int frameHeight = 600;
        setSize(frameWidth, frameHeight);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (d.width - getSize().width) / 2;
        int y = (d.height - getSize().height) / 2;
        setLocation(x, y);
        setTitle("Kletterwand Infos");
        setResizable(false);
        Container cp = getContentPane();
        cp.setLayout(null);
        // Anfang Komponenten

        jGrund.setBounds(0, 0, 1100, 600);
        jGrund.setBackground(Color.YELLOW);
        jGrund.setOpaque(true);
        cp.add(jGrund);
        jbearbeiten.setBounds(0, 0, 1100, 600);
        jbearbeiten.setBackground(Color.DARK_GRAY);
        cp.add(jbearbeiten);
        jergebnisse.setBounds(0, 0, 1100, 600);
        jergebnisse.setBackground(Color.GRAY);
        cp.add(jergebnisse);
        jInfos.setBounds(0, 0, 1100, 600);
        jInfos.setBackground(Color.ORANGE);
        cp.add(jInfos);
        jFertig.setBounds(0, 0, 1100, 600);
        jFertig.setBackground(Color.LIGHT_GRAY);
        cp.add(jFertig);

        jGrund.setLayout(this.cards);
        jGrund.add(jbearbeiten, "Wand bearbeiten");
        this.cards.show(jGrund, "Wand bearbeiten");


        //Start Seite
        jUeberschriftL.setBounds(380, 20, 300, 40);
        jUeberschriftL.setText("Allgemeine Angaben");
        jUeberschriftL.setFont(new Font("Dialog", Font.BOLD, 30));
        jUeberschriftL.setForeground(Color.WHITE);
        jUeberschriftL.setHorizontalAlignment(SwingConstants.CENTER);
        cp.add(jUeberschriftL);
        jbearbeiten.add(jUeberschriftL, "Überschrift");

        jFrage.setBounds(380, 300, 400, 30);
        jFrage.setText("Wie soll deine Wand Aussehen?");
        jFrage.setFont(new Font("Dialog", Font.BOLD, 26));
        jFrage.setForeground(Color.WHITE);
        jFrage.setHorizontalAlignment(SwingConstants.CENTER);
        cp.add(jFrage);
        jbearbeiten.add(jFrage, "Überschrift");

        jhoeheL.setBounds(50, 100, 200, 30);
        jhoeheL.setText("Höhe (in m): ");
        jhoeheL.setFont(new Font("Dialog", Font.BOLD, 18));
        jhoeheL.setForeground(Color.WHITE);
        cp.add(jhoeheL);
        jbearbeiten.add(jhoeheL, "Text höhe");

        nfHoehe.setBounds(50, 150, 200, 30);
        nfHoehe.setText("");
        nfHoehe.setFont(new Font("Dialog", Font.BOLD, 18));
        cp.add(nfHoehe);
        jbearbeiten.add(nfHoehe, "Höhe");

        jbreiteL.setBounds(50, 250, 200, 30);
        jbreiteL.setText("Breite (in m): ");
        jbreiteL.setFont(new Font("Dialog", Font.BOLD, 18));
        jbreiteL.setForeground(Color.WHITE);
        cp.add(jbreiteL);
        jbearbeiten.add(jbreiteL, "Text breite");

        nfBreite.setBounds(50, 300, 200, 30);
        nfBreite.setText("");
        nfBreite.setFont(new Font("Dialog", Font.BOLD, 18));
        cp.add(nfBreite);
        jbearbeiten.add(nfBreite, "Höhe");

        jneigungL.setBounds(900, 100, 150, 30);
        jneigungL.setText("Neigung: (in °)");
        jneigungL.setFont(new Font("Dialog", Font.BOLD, 18));
        jneigungL.setForeground(Color.WHITE);
        cp.add(jneigungL);
        jbearbeiten.add(jneigungL, "Text breite");

        jneigung.setBounds(900, 150, 70, 30);
        jneigung.setValue(0);
        jneigung.setFont(new Font("Dialog", Font.BOLD, 18));
        jneigung.setForeground(Color.WHITE);
        jneigung.setModel(jSpinner1Model);
        cp.add(jneigung);
        jbearbeiten.add(jneigung, "neigung");


        //Info Seite
        jUeberschrift1.setBounds(380, 20, 300, 40);
        jUeberschrift1.setText("Infos zum Programm");
        jUeberschrift1.setFont(new Font("Dialog", Font.BOLD, 30));
        jUeberschrift1.setForeground(Color.WHITE);
        jUeberschrift1.setHorizontalAlignment(SwingConstants.CENTER);
        cp.add(jUeberschrift1);
        jInfos.add(jUeberschrift1, "Überschrift");

        jTextArea1ScrollPane.setBounds(150, 100, 800, 400);
        cp.add(jTextArea1ScrollPane);
        jInfos.add(jTextArea1ScrollPane, "Infos zum Programm");


        //Beareiten der Wand Seite
        jUeberschrift2.setBounds(600, 20, 300, 40);
        jUeberschrift2.setText("Wand Bearbeiten");
        jUeberschrift2.setFont(new Font("Dialog", Font.BOLD, 30));
        jUeberschrift2.setForeground(Color.WHITE);
        jUeberschrift2.setHorizontalAlignment(SwingConstants.LEFT);
        cp.add(jUeberschrift2);
        jergebnisse.add(jUeberschrift2, "Überschrift");

        //Griffe
        b1.setBounds(600, 100, 50, 50);
        b1.setText(" 1 ");
        b1.setMargin(new Insets(2, 2, 2, 2));
        b1.addActionListener(this::b1_ActionPerformed);
        b1.setFont(new Font("Dialog", Font.BOLD, 18));
        cp.add(b1);
        jergebnisse.add(b1, "Griff 1");

        b2.setBounds(700, 100, 50, 50);
        b2.setText(" 2 ");
        b2.setMargin(new Insets(2, 2, 2, 2));
        b2.addActionListener(this::b2_ActionPerformed);
        b2.setFont(new Font("Dialog", Font.BOLD, 18));
        cp.add(b2);
        jergebnisse.add(b2, "Griff 2");

        b3.setBounds(800, 100, 50, 50);
        b3.setText(" 3 ");
        b3.setMargin(new Insets(2, 2, 2, 2));
        b3.addActionListener(this::b3_ActionPerformed);
        b3.setFont(new Font("Dialog", Font.BOLD, 18));
        cp.add(b3);
        jergebnisse.add(b3, "Griff 3");

        b4.setBounds(900, 100, 50, 50);
        b4.setText(" 4 ");
        b4.setMargin(new Insets(2, 2, 2, 2));
        b4.addActionListener(this::b4_ActionPerformed);
        b4.setFont(new Font("Dialog", Font.BOLD, 18));
        cp.add(b4);
        jergebnisse.add(b4, "Griff 4");

        b5.setBounds(1000, 100, 50, 50);
        b5.setText(" 5 ");
        b5.setMargin(new Insets(2, 2, 2, 2));
        b5.addActionListener(this::b5_ActionPerformed);
        b5.setFont(new Font("Dialog", Font.BOLD, 18));
        cp.add(b5);
        jergebnisse.add(b5, "Griff 5");

        b6.setBounds(600, 200, 50, 50);
        b6.setText(" 6 ");
        b6.setMargin(new Insets(2, 2, 2, 2));
        b6.addActionListener(this::b6_ActionPerformed);
        b6.setFont(new Font("Dialog", Font.BOLD, 18));
        cp.add(b6);
        jergebnisse.add(b6, "Griff 6");

        b7.setBounds(700, 200, 50, 50);
        b7.setText(" 7 ");
        b7.setMargin(new Insets(2, 2, 2, 2));
        b7.addActionListener(this::b7_ActionPerformed);
        b7.setFont(new Font("Dialog", Font.BOLD, 18));
        cp.add(b7);
        jergebnisse.add(b7, "Griff 7");

        b8.setBounds(800, 200, 50, 50);
        b8.setText(" 8 ");
        b8.setMargin(new Insets(2, 2, 2, 2));
        b8.addActionListener(this::b8_ActionPerformed);
        b8.setFont(new Font("Dialog", Font.BOLD, 18));
        cp.add(b8);
        jergebnisse.add(b8, "Griff 8");

        b9.setBounds(900, 200, 50, 50);
        b9.setText(" 9 ");
        b9.setMargin(new Insets(2, 2, 2, 2));
        b9.addActionListener(this::b9_ActionPerformed);
        b9.setFont(new Font("Dialog", Font.BOLD, 18));
        cp.add(b9);
        jergebnisse.add(b9, "Griff 9");

        b10.setBounds(1000, 200, 50, 50);
        b10.setText(" 10 ");
        b10.setMargin(new Insets(2, 2, 2, 2));
        b10.addActionListener(this::b10_ActionPerformed);
        b10.setFont(new Font("Dialog", Font.BOLD, 18));
        cp.add(b10);
        jergebnisse.add(b10, "Griff 9");


        //Ergbniss Seite
        jUeberschrift3.setBounds(400, 20, 300, 40);
        jUeberschrift3.setText("Ergebnisse");
        jUeberschrift3.setFont(new Font("Dialog", Font.BOLD, 30));
        jUeberschrift3.setForeground(Color.WHITE);
        jUeberschrift3.setHorizontalAlignment(SwingConstants.CENTER);
        cp.add(jUeberschrift3);
        jFertig.add(jUeberschrift3, "Überschrift");

        jGriffeL.setBounds(50, 100, 200, 30);
        jGriffeL.setText("Anzahl der Griffe: ");
        jGriffeL.setFont(new Font("Dialog", Font.BOLD, 20));
        jGriffeL.setForeground(Color.WHITE);
        cp.add(jGriffeL);
        jFertig.add(jGriffeL, "Text Griffe");

        jGriffe.setBounds(50, 135, 200, 30);
        jGriffe.setText("0 Griffe");
        jGriffe.setFont(new Font("Dialog", Font.BOLD, 20));
        jGriffe.setForeground(Color.WHITE);
        cp.add(jGriffe);
        jFertig.add(jGriffe, "Text Griffe");

        jHoeheL.setBounds(50, 200, 200, 30);
        jHoeheL.setText("Höhe: ");
        jHoeheL.setFont(new Font("Dialog", Font.BOLD, 20));
        jHoeheL.setForeground(Color.WHITE);
        cp.add(jHoeheL);
        jFertig.add(jHoeheL, "Text Hoehe");

        jHoehe.setBounds(50, 235, 200, 30);
        jHoehe.setText("0 m");
        jHoehe.setFont(new Font("Dialog", Font.BOLD, 20));
        jHoehe.setForeground(Color.WHITE);
        cp.add(jHoehe);
        jFertig.add(jHoehe, "Text Hoehe");

        jBreiteL.setBounds(50, 300, 200, 30);
        jBreiteL.setText("Breite: ");
        jBreiteL.setFont(new Font("Dialog", Font.BOLD, 20));
        jBreiteL.setForeground(Color.WHITE);
        cp.add(jBreiteL);
        jFertig.add(jBreiteL, "Text Breite");

        jBreite.setBounds(50, 335, 200, 30);
        jBreite.setText("0 m");
        jBreite.setFont(new Font("Dialog", Font.BOLD, 20));
        jBreite.setForeground(Color.WHITE);
        cp.add(jBreite);
        jFertig.add(jBreite, "Text Breite");

        jNeigungL.setBounds(50, 400, 200, 30);
        jNeigungL.setText("Neigung: ");
        jNeigungL.setFont(new Font("Dialog", Font.BOLD, 20));
        jNeigungL.setForeground(Color.WHITE);
        cp.add(jNeigungL);
        jFertig.add(jNeigungL, "Text Neigung");

        jNeigung.setBounds(50, 435, 200, 30);
        jNeigung.setText("0°");
        jNeigung.setFont(new Font("Dialog", Font.BOLD, 20));
        jNeigung.setForeground(Color.WHITE);
        cp.add(jNeigung);
        jFertig.add(jNeigung, "Text Neigung");

        jSeilL.setBounds(600, 100, 200, 30);
        jSeilL.setText("Seil länge: ");
        jSeilL.setFont(new Font("Dialog", Font.BOLD, 20));
        jSeilL.setForeground(Color.WHITE);
        cp.add(jSeilL);
        jFertig.add(jSeilL, "Text Seil");

        jSeil.setBounds(600, 135, 200, 30);
        jSeil.setText("0 m");
        jSeil.setFont(new Font("Dialog", Font.BOLD, 20));
        jSeil.setForeground(Color.WHITE);
        cp.add(jSeil);
        jFertig.add(jSeil, "Text Seil");

        jStuffeL.setBounds(600, 250, 400, 50);
        jStuffeL.setText("Schwierigkeitsgrad: ");
        jStuffeL.setFont(new Font("Dialog", Font.BOLD, 26));
        jStuffeL.setForeground(Color.WHITE);
        cp.add(jStuffeL);
        jFertig.add(jStuffeL, "Text Griffe");

        jStuffe.setBounds(600, 285, 400, 50);
        jStuffe.setText("?");
        jStuffe.setFont(new Font("Dialog", Font.BOLD, 26));
        jStuffe.setForeground(Color.WHITE);
        cp.add(jStuffe);
        jFertig.add(jStuffe, "Text Griffe");


        //Button zu hin und her wechseln der Seiten
        bWanderstellen.setBounds(900, 490, 150, 50);
        bWanderstellen.setText("Wand erstellen");
        bWanderstellen.setMargin(new Insets(2, 2, 2, 2));
        bWanderstellen.addActionListener(this::bWanderstellen_ActionPerformed);
        bWanderstellen.setFont(new Font("Dialog", Font.BOLD, 18));
        cp.add(bWanderstellen);
        jbearbeiten.add(bWanderstellen, "Wand erstellen");

        bInfos.setBounds(50, 490, 150, 50);
        bInfos.setText("Infos");
        bInfos.setMargin(new Insets(2, 2, 2, 2));
        bInfos.addActionListener(this::bInfos_ActionPerformed);
        bInfos.setFont(new Font("Dialog", Font.BOLD, 18));
        cp.add(bInfos);
        jbearbeiten.add(bInfos, "Infos");

        bergebniss.setBounds(900, 490, 150, 50);
        bergebniss.setText("Ergebnisse");
        bergebniss.setMargin(new Insets(2, 2, 2, 2));
        bergebniss.addActionListener(this::bergebniss_ActionPerformed);
        bergebniss.setFont(new Font("Dialog", Font.BOLD, 18));
        cp.add(bergebniss);
        jergebnisse.add(bergebniss, "erbebniss");

        bzurueck.setBounds(550, 490, 150, 50);
        bzurueck.setText("zurück");
        bzurueck.setMargin(new Insets(2, 2, 2, 2));
        bzurueck.addActionListener(this::bzurueck_ActionPerformed);
        bzurueck.setFont(new Font("Dialog", Font.BOLD, 18));
        cp.add(bzurueck);
        jergebnisse.add(bzurueck, "zurück");

        bzurueck1.setBounds(50, 490, 150, 50);
        bzurueck1.setText("zurück");
        bzurueck1.setMargin(new Insets(2, 2, 2, 2));
        bzurueck1.addActionListener(this::bzurueck1_ActionPerformed);
        bzurueck1.setFont(new Font("Dialog", Font.BOLD, 18));
        cp.add(bzurueck1);
        jFertig.add(bzurueck1, "zurück");

        bzurueck2.setBounds(50, 490, 150, 50);
        bzurueck2.setText("zurück");
        bzurueck2.setMargin(new Insets(2, 2, 2, 2));
        bzurueck2.addActionListener(this::bzurueck2_ActionPerformed);
        bzurueck2.setFont(new Font("Dialog", Font.BOLD, 18));
        cp.add(bzurueck2);
        jInfos.add(bzurueck2, "zurück");

        bschliessen.setBounds(900, 490, 150, 50);
        bschliessen.setText("Schließen");
        bschliessen.setMargin(new Insets(2, 2, 2, 2));
        bschliessen.addActionListener(this::bschliessen_ActionPerformed);
        bschliessen.setFont(new Font("Dialog", Font.BOLD, 18));
        cp.add(bschliessen);
        jFertig.add(bschliessen, "zurück");


        // Ende Komponenten

        setVisible(true);
    } // end of public KletterwandInfos

    //Variablen

    public int Hoehe, Breite, Neigung;

    // Anfang Methoden

    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {

        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        new KletterwandInfos();

    } // end of main


    //Griffe
    public void b1_ActionPerformed(ActionEvent evt) {


    } // end of Griff

    public void b2_ActionPerformed(ActionEvent evt) {
        // TODO hier Quelltext einf?gen

    } // end of Griff

    public void b3_ActionPerformed(ActionEvent evt) {
        // TODO hier Quelltext einf?gen

    } // end of Griff

    public void b4_ActionPerformed(ActionEvent evt) {
        // TODO hier Quelltext einf?gen

    } // end of Griff

    public void b5_ActionPerformed(ActionEvent evt) {
        // TODO hier Quelltext einf?gen

    } // end of Griff

    public void b6_ActionPerformed(ActionEvent evt) {
        // TODO hier Quelltext einf?gen

    } // end of Griff

    public void b7_ActionPerformed(ActionEvent evt) {
        // TODO hier Quelltext einf?gen

    } // end of Griff

    public void b8_ActionPerformed(ActionEvent evt) {
        // TODO hier Quelltext einf?gen

    } // end of Griff

    public void b9_ActionPerformed(ActionEvent evt) {
        // TODO hier Quelltext einf?gen

    } // end of Griff

    public void b10_ActionPerformed(ActionEvent evt) {
        // TODO hier Quelltext einf?gen

    } // end of Griff


    //Button
    public void bWanderstellen_ActionPerformed(ActionEvent evt) {
        // TODO hier Quelltext einf?gen
        jGrund.add(jergebnisse, "seite3");
        this.cards.show(jGrund, "seite3");
        try {
            Hoehe = Integer.parseInt(nfHoehe.getText());
            Breite = Integer.parseInt(nfBreite.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Die Zahl ist zu groß!", "Fehler!", 1);
        }
        if (Hoehe <= 12 && Breite <= 11) {
            Hoehe = Hoehe * 5;
            Breite = Breite * 5;

            int xWand = 0;
            int yWand = 0;

            JButton[][] Wand = new JButton[Hoehe][Breite];

            for (int x = 0; x < Hoehe; x++) {
                
                for (int y = 0; y < Breite; y++) {
                    //cp.add(Wand[x][y]);
                    Wand[x][y] = new JButton();
                    Wand[x][y].setBounds(xWand, yWand, 20, 20);
                    Wand[x][y].addActionListener(System.out::println);
                    jergebnisse.add(Wand[x][y]);
                    jergebnisse.setVisible(true);
                    yWand = yWand + 10;
                } // end of for
                yWand = 0; 
                xWand = xWand + 10;
            } // end of for
        } // end of if
        else {}
    } // end of bWanderstellen_ActionPerformed

    public void bInfos_ActionPerformed(ActionEvent evt) {
        // TODO hier Quelltext einf?gen
        jGrund.add(jInfos, "seite3");
        this.cards.show(jGrund, "seite3");
    } // end of bWanderstellen_ActionPerformed

    public void bergebniss_ActionPerformed(ActionEvent evt) {
        // TODO hier Quelltext einf?gen
        jGrund.add(jFertig, "seite3");
        this.cards.show(jGrund, "seite3");
    } // end of jButton1_ActionPerformed

    public void bzurueck_ActionPerformed(ActionEvent evt) {
        // TODO hier Quelltext einf?gen
        jGrund.add(jbearbeiten, "seite3");
        this.cards.show(jGrund, "seite3");
    }

    public void bzurueck1_ActionPerformed(ActionEvent evt) {
        // TODO hier Quelltext einf?gen
        jGrund.add(jergebnisse, "seite3");
        this.cards.show(jGrund, "seite3");
    }

    public void bzurueck2_ActionPerformed(ActionEvent evt) {
        // TODO hier Quelltext einf?gen
        jGrund.add(jbearbeiten, "seite3");
        this.cards.show(jGrund, "seite3");
    }

    public void bschliessen_ActionPerformed(ActionEvent evt) {
        // TODO hier Quelltext einf?gen
        System.exit(0);
    }

    // Ende Methoden
} // end of class KletterwandInfos

