import javax.swing.*;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.border.Border;
import java.awt.BorderLayout;
import java.awt.*;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) {

            double vers;
            vers = 1.2;
            boolean operating = true;

            String eingabeauff = "\nWarte auf Eingabe. Befehlsliste mit -list.";
            String befehlsliste = "\nBefehlsliste B.OS " + vers + ":\n\n-list = Befehlsliste \n-insindat = gespeicherten Text in .txt-Datei speichern \n-destr = ACHTUNG! Nur für Entwickler! Dies ist der Entwicklermodus \n-exit = Herunterfahren \n-settings = Einstellungen \n-sysinfo = Systeminformationen \n-progs = integrierte Programme \n-wthr = workthrough \n-save = Öffnet eine Texteingabe und speichert den Text \n-ins = Gibt gespeicherten Text wieder \n-del = Löscht Text\n-vers2 = Öffnet B.OS 2.0.0";
            //String hilfeanfrage = "\nHilfe: \n\nWobei benötigen sie Hilfe?";
            String error1 = "Fehlerhafte Eingabe";
            String systeminfo = "Systeminformationen \n\nBaltic Operating System Version " + vers + "\n\nCopyrighted 2022 and distributed by B.Lörcher \nWorkthrough Version 1.0.0";
            String einst = "Systemeinstellungen \n\nFolgende Befehle können sie ausführen um Einstellungen zu ändern:\n\n-language = Spracheinstellungen \n-bosversset = B.OS Versionseinstellungen ";
            String textwert = "Kein Text angegeben";

            System.out.println("B.OS " + vers + ".0 startet...");
            System.out.println("Versionscheck... Version: " +  vers + "Ihre B.OS Verssion ist schon sehr alt. Überlegen Sie, auf ein neueres B.OS zu upgraden.");
            System.out.println("...\n...\n...\nHerzlich Willkommen!");
            System.out.println(eingabeauff);


            while (operating == true) {
                Scanner eingabe1 = new Scanner(System.in);
                String eingabes1 = eingabe1.nextLine();


                if (eingabes1.equals("-list")) {
                    System.out.println(befehlsliste);

                } else {
                    if (eingabes1.equals("-settings")) {
                        System.out.println(einst);

                    }
                    else {
                        if (eingabes1.equals("-sysinfo")) {
                            System.out.println(systeminfo);
                        }
                        else {
                            if (eingabes1.equals("-exit")) {
                                System.out.println("B.OS fährt herunter...");
                                System.exit(0);
                            }
                            else {
                                if (eingabes1.equals("-save")) {
                                    System.out.println("Bitte Text eingeben und ENTER drücken");
                                    Scanner texteingabe1 = new Scanner(System.in);
                                    textwert = texteingabe1.nextLine();
                                    System.out.println("Text wurde gespeichert.");

                                }
                                else {
                                    if (eingabes1.equals("-ins")) {
                                        System.out.println("Ihr gespeicherter Text:\n\n" + textwert );
                                    }
                                    else {
                                        if (eingabes1.equals("-del")) {
                                            textwert = null;
                                            System.out.println("Text wurde gelöscht");
                                        }
                                        else {
                                            if (eingabes1.equals("-progs")) {
                                                System.out.println("Derzeit integrierte Programme: \n\nWorkthrough mit -wthr");
                                            }
                                            else {
                                                if (eingabes1.equals("-wthr")) {
                                                    JFrame workthroughf = new JFrame("Workthrough ALT");
                                                    workthroughf.setSize(900, 500);
                                                    workthroughf.setResizable(false);

                                                    JPanel panelwt1 = new JPanel();
                                                    JLabel neugikeitenwt1 = new JLabel("Mein Feed:");
                                                    panelwt1.add(neugikeitenwt1);

                                                    //Es folgt die Menübar
                                                    JMenuBar menubarwt1 = new JMenuBar();
                                                    //Es folgt das Menü
                                                    JMenu menuwt1 = new JMenu("Menü");
                                                    JMenu menuwt2 = new JMenu("Mein Workspace");
                                                    //Menüpunkte erzeugen
                                                    JMenuItem optionen = new JMenuItem("Optionen");
                                                    JMenuItem schliessen = new JMenuItem("Schließen");
                                                    JMenuItem auswahl = new JMenuItem("Auswahl");
                                                    JMenuItem anpassung = new JMenuItem("Anpassung");
                                                    JMenuItem infos = new JMenuItem("Infos");
                                                    //Hinzufügen der Punkte zum Menü
                                                    menuwt1.add(optionen);
                                                    menuwt1.add(schliessen);
                                                    menuwt1.add(auswahl);
                                                    menuwt2.add(anpassung);
                                                    menuwt2.add(infos);
                                                    //Untermenü wird zur Leiste hinzugefügt
                                                    menubarwt1.add(menuwt1);
                                                    menubarwt1.add(menuwt2);
                                                    //Menüleiste wird zum Fenster zugefügt
                                                    workthroughf.add(menubarwt1, BorderLayout.NORTH);


                                                    JTextField wtText1 = new JTextField("Herzlich Willkommen bei Workthrough 1.0.0 in ihrem B.OS System!\nDiese Version von Workthrough wird leider nicht mehr unterstützt, da B.OS 1.2 seit 2022 nicht mehr unterhalten wird.\nUpgraden Sie auf das neue B.OS 2.0 für ein  benutzerfreundliccheres und intuitiveres Arbeitsumfeld!", 15);
                                                    wtText1.setForeground(Color.DARK_GRAY);
                                                    wtText1.setEditable(false);

                                                    workthroughf.add(panelwt1);


                                                    workthroughf.setVisible(true);
                                                    workthroughf.toFront();
                                                }
                                                else {
                                                    if (eingabes1.equals("-destr")) {
                                                        System.out.println("WARNUNG, dieses System schaltet nun in den Entwicklermodus, es wird unter Umständen ein Neustart erforderlich sein");
                                                        operating = false;
                                                    }
                                                    else {
                                                        if(eingabes1.equals("-vers2")) {
                                                            JFrame guibos = new JFrame("D-B.OS ALT");
                                                            guibos.setSize(1280, 720);
                                                            guibos.setExtendedState(guibos.MAXIMIZED_BOTH);
                                                            guibos.setResizable(false);

                                                            JPanel panelbos1 = new JPanel();
                                                            JLabel labelbos1 = new JLabel("Mein Feed:");
                                                            panelbos1.add(labelbos1);

                                                            //Es folgt die Menübar
                                                            JMenuBar menubarbos = new JMenuBar();
                                                            //Es folgt das Menü
                                                            JMenu menubos = new JMenu("Startmenü");
                                                            //Menüpunkte erzeugen
                                                            JMenuItem start1 = new JMenuItem("Einstellungen");
                                                            //Hinzufügen der Punkte zum Menü
                                                            menubos.add(start1);
                                                            //Untermenü wird zur Leiste hinzugefügt
                                                            menubarbos.add(menubos);
                                                            //Menüleiste wird zum Fenster zugefügt
                                                            guibos.add(menubarbos, BorderLayout.SOUTH);

                                                            guibos.setVisible(true);
                                                        }
                                                        else {
                                                            if (eingabes1.equals("-linusisthebest")) {
                                                                System.out.println("Das ist wahr... misterls.de");
                                                            }
                                                            else {
                                                                if (eingabes1.equals("-insindat")) {
                                                                    System.out.println("Text wird als \"Textwert.txt\" im Verzeichnis von B.OS gespeichert.");
                                                                    try{
                                                                        Files.write(Paths.get("Textspeicher.txt"), textwert.getBytes());
                                                                    } catch (IOException e) {
                                                                        e.printStackTrace();
                                                                    }

                                                                }
                                                                else {
                                                                    System.out.println(error1);
                                                                }
                                                            }
                                                        }
                                                    }


                                                }
                                            }

                                        }

                                    }

                                }


                            }

                        }

                    }
                }
                if(operating == true) {
                    System.out.println(eingabeauff);
                }
            }
            System.out.println("\n\nWillkommen im Entwicklermodus");
            System.out.println("\n\nWas ist der Entwicklermodus? \nSie sind nun außerhalb der Systemschleife und haben so nur auf einige wenige Befehle Zugriff.");
            System.out.println("\n\nWie komme ich wieder ins Hauptsystem?\nDies ist nun leider nicht mehr möglich, da B.OS 1.2 diese Funktion nicht unterstützt. Zum Abschalten -exit.\n");

            while(operating == false) {
                System.out.println("\nGeben sie einen Befehl ein. Liste mit -devlist.");
                Scanner eingabe2 = new Scanner(System.in);
                String eingabes2 = eingabe2.nextLine();

                if (eingabes2.equals("-freeme")) {
                    System.out.println("Sie sind nun in der freien Eingabe");
                    operating = true;

                }
                else {
                    if (eingabes2.equals("-wthr")) {
                        System.out.println("Workthrough kann im Entwicklermodus leider nicht ausgeführt werden.");
                    }
                    else {
                        if (eingabes2.equals("-exit")) {
                            System.out.println("Das System wird nun heruntergefahren.");
                            System.exit(0);
                        }
                        else {
                            if(eingabes2.equals("-devlist")) {
                                System.out.println("Entwicklermodus Befehlsoptionen:\n\n-freeme = Freier Modus ACHTUNG! Neustart kann erforderlich sein!\n-exit = Herunterfahren\n-ins = Eingegebenen Text wiedergeben\n");
                            }
                            else {
                                if (eingabes2.equals("-ins")) {
                                    System.out.println("Ihr im B.OS gespeicherter Text: \n" + textwert);
                                }
                            }
                        }

                    }




                }
            }







        }
    }


