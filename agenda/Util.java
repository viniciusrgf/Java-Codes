package school.cesar.poo.av2.agenda;

 import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Util {

    private static List<Contato> AllContacts;
    private static String MessageStatus;
    public static final String ContactFileName = "Contacts.txt";
    public static String getMessageStatus() {
        return MessageStatus;
    }
    public static void setMessageStatus(String aMessageStatus) {
        MessageStatus = aMessageStatus;
    }

    public Util() {
        AllContacts = new ArrayList<Contato>();
    }

    public static void Deleta(Contato C) {
        BufferedReader br = null;
        String ReWrite = "";
        try {
            if (new File(ContactFileName).exists()) {
                br = new BufferedReader(new FileReader(ContactFileName));
                String line = "";
                while ((line = br.readLine()) != null) {
                    String[] _temp = line.split(",");
                    if (_temp[0].equalsIgnoreCase(C.getNome()) && _temp[1].equalsIgnoreCase(C.getTelefone())
                            && _temp[2].equalsIgnoreCase(C.getEmail())) {
                        //ignore line to delete this contact
                    } else {
                        ReWrite += line + "\r\n";
                    }
                }
                br.close();

                if (writeFile(ReWrite)) {
                    JOptionPane.showMessageDialog(null, "Successfully delete contact " + C.getNome());
                } else {
                    JOptionPane.showMessageDialog(null, "Failed to delete contact " + C.getNome());
                }

                Util.LER();
                Interface.Insere();

            } else {
                new File(ContactFileName).createNewFile();
                LER();
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    
    protected static boolean writeFile(String TextToWrite) {
        FileWriter writer = null;
        boolean successfulWrite = false;
        try {
            writer = new FileWriter(ContactFileName);
            writer.write(TextToWrite);
            writer.close();
            successfulWrite = true;
        } catch (IOException ex) {
            successfulWrite = false;
            MessageStatus = ex.getMessage();
        } finally {
            try {
                writer.close();
            } catch (IOException ex) {
                MessageStatus = ex.getMessage();
            }
        }
        return successfulWrite;
    }
    


    public static boolean appendTextContact(String appendValue) {
        boolean success = false;
        try {
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(ContactFileName, true)));
            out.println(appendValue);
            out.close();
            success = true;
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return success;
    }
    public static void LER() {
        BufferedReader br = null;
        try {
            if (new File(ContactFileName).exists()) {

                if (AllContacts == null) {
                    AllContacts = new ArrayList<>();
                } else {
                    AllContacts.clear();
                }
                br = new BufferedReader(new FileReader(ContactFileName));
                StringBuilder sb = new StringBuilder();
                String line = "";
                Contato ContactClass = null;
                while ((line = br.readLine()) != null) {
                    if (!line.equalsIgnoreCase("")) {
                        ContactClass = new Contato();
                        String[] _temp = line.split(",");
                        String _tempValue = _temp[0];
                        if (_tempValue.equalsIgnoreCase("NULL")) {
                            _tempValue = "";
                        }
                        ContactClass.setNome(_tempValue);

                        _tempValue = _temp[1];
                        if (_tempValue.equalsIgnoreCase("NULL")) {
                            _tempValue = "";
                        }
                        ContactClass.setTelefone(_tempValue);

                        _tempValue = _temp[2];
                        if (_tempValue.equalsIgnoreCase("NULL")) {
                            _tempValue = "";
                        }
                        ContactClass.setEmail(_tempValue);
                        
                        AllContacts.add(ContactClass);
                    }
                }
            } else {
                new File(ContactFileName).createNewFile();
                LER();
            }

        } catch (NullPointerException | IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException ex) {
                    Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }
    public static List<Contato> getAllContacts() {
        return AllContacts;
    }
    public static void setAllContacts(List<Contato> aAllContacts) {
        AllContacts = aAllContacts;
    }

}
