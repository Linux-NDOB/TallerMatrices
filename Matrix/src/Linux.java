import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import java.awt.*;

public class Linux {




    public static  void main(String args[]) {


     Matrix01 distro = new Matrix01();

        try{
            int Option,Exit,identification;


            do {

                UIManager.put("OptionPane.messageFont", new Font("Fira Code", Font.BOLD, 14));

                UIManager.put("OptionPane.buttonFont", new Font("Fira Code", Font.PLAIN, 12));

                UIManager UI=new UIManager();

                UI.put("OptionPane.background",new ColorUIResource(225,225,225));

                UI.put("Panel.background",new ColorUIResource(225,225,225));

                Option=Integer.parseInt(JOptionPane.showInputDialog(

                        "     ----------------Main Menu----------------\n"+"\n"+

                                "1. Ask a Candy \n"+"\n"+

                                "2. Show Candies  \n"+"\n"+

                                "3. Fill Candies.  \n"+"\n"+

                                "4. Machine statistics  \n"+"\n"+

                                "5. Exit \n   " + " \n" +


                                " Please enter an option : "));


                switch(Option){
                    case 1:

                        try{

                            ImageIcon icon = new ImageIcon("CandyStore.jpg");

                            JOptionPane.showMessageDialog(
                                    null,"","WelcomeMessage",
                                    JOptionPane.INFORMATION_MESSAGE,icon);

                            String type;

                            Object TypePerson[] = new Object[]{
                                    "KitKat",
                                    "Chicles de fresa",
                                    "Lacasitos",
                                    "Palotes",
                                    "Kinder Bueno",
                                    "Bolsa variada Haribo",
                                    "Chetoos",
                                    "Twix",
                                    "Bolsa variada HaribO",
                                    "M&M'S",
                                    "Papa Delta",
                                    "Chicles de menta",
                                    "LacasitoS",
                                    "Crunch",
                                    "Milkybar",
                                    "KitKaT"};

                            Object People = JOptionPane.showInputDialog(null,"" +
                                            "¿wich type of? \n"
                                            +"candy you want register?","Candies list",
                                    JOptionPane.QUESTION_MESSAGE,null,TypePerson, TypePerson[0]);
                            type = People.toString();

                            if(People.equals("KitKat")){

                             distro.askCandy();
                             break;

                            }else if(People.equals("Chicles de fresa")){

                            distro.askCandy2();


                            }else if(People.equals("Lacasitos")){

                                distro.askCandy3();

                                break;

                            }else if(People.equals("Palotes")){

                                distro.askCandy4();

                                break;

                            }else if(People.equals("Kinder Bueno")){

                                distro.askCandy5();

                                break;

                            }else if(People.equals("Bolsa variada Haribo")){

                                distro.askCandy6();

                                break;

                            }else if(People.equals("Chetoos")){

                                distro.askCandy7();

                                break;

                            }else if(People.equals("Twix")){

                                distro.askCandy8();

                                break;

                            }else if(People.equals("Bolsa variada HaribO")){

                                distro.askCandy9();

                                break;

                            }else if(People.equals("M&M'S")){

                                distro.askCandy10();

                                break;

                            }else if(People.equals("Papa Delta")){

                                distro.askCandy11();

                                break;

                            }else if(People.equals("Chicles de menta")){

                                distro.askCandy12();

                                break;

                            }else if(People.equals("LacasitoS")){

                                distro.askCandy13();

                                break;

                       
                          }else if(People.equals("Crunch")){

                                distro.askCandy14();

                                break;

                            }else if(People.equals("Milkybar")){

                                distro.askCandy15();

                                break;

                            }else if(People.equals("KitKaT")){

                                distro.askCandy16();

                                break;

                            }

                        }catch(NumberFormatException b){

                            JOptionPane.showMessageDialog(
                                    null, "Please do not use \n"
                                            +"letters or much numbers ");
                        }catch(NullPointerException d){

                            JOptionPane.showMessageDialog(
                                    null, "Something has gone wrong ");

                        }

                        break;

                    case 2:
                        distro.ShowAll();
                        break;

                    case 3:

                        distro.FillCandy();



                        break;

                    case 4:

                    distro.MachineStatistics();

                        break;

                    case 5:


                        Exit=JOptionPane.showConfirmDialog(null, "¿Do you want to exit from the Menu?");

                        if (Exit==0) {

                            JOptionPane.showMessageDialog(null,"Come back soon");

                        }
                        break;

                    default:

                        JOptionPane.showMessageDialog(null, "Please use a valid option ");

                        break;

                }


            }while (Option != 5


            );


            System.exit(0);


        } catch(NumberFormatException a){

            JOptionPane.showMessageDialog(null, "Operation cancelled by user");

        }



    }

}