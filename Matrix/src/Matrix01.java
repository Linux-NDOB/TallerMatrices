import javax.swing.*;

public class Matrix01 {

    public int code[][];
    public String candyName[][];
    public double price[][];
    public int amount[][];

    public int amCandies;
    public int amCandies2;
    public int amCandies3;
    public int amCandies4;
    public int amCandies5;
    public int amCandies6;
    public int amCandies7;
    public int amCandies8;
    public int amCandies9;
    public int amCandies10;
    public int amCandies11;
    public int amCandies12;
    public int amCandies13;
    public int amCandies14;
    public int amCandies15;
    public int amCandies16;

    public double gain;
    public double gain1;
    public double gain2;
    public double gain3;
    public double gain4;
    public double gain5;
    public double gain6;
    public double gain7;
    public double gain8;
    public double gain9;
    public double gain10;
    public double gain11;
    public double gain12;
    public double gain13;
    public double gain14;
    public double gain15;

    public int cont1;
    public int cont2;
    public int cont3;
    public int cont4;
    public int cont5;
    public int cont6;
    public int cont7;
    public int cont8;
    public int cont9;
    public int cont10;
    public int cont11;
    public int cont12;
    public int cont13;
    public int cont14;
    public int cont15;
    public int cont16;

    public Matrix01() {


        
        code = new int[4][4];

        code[0][0] = 1111;
        code[0][1] = 1112;
        code[0][2] = 1113;
        code[0][3] = 1114;

        code[1][0] = 1115;
        code[1][1] = 1116;
        code[1][2] = 1117;
        code[1][3] = 1118;

        code[2][0] = 1119;
        code[2][1] = 1110;
        code[2][2] = 1112;
        code[2][3] = 1113;

        code[3][0] = 1114;
        code[3][1] = 1115;
        code[3][2] = 1116;
        code[3][3] = 1117;


        candyName = new String[4][4];

        candyName[0][0] = "KitKat";
        candyName[0][1] = "Chicles de fresa";
        candyName[0][2] = "Lacasitos";
        candyName[0][3] = "Palotes";

        candyName[1][0] = "Kinder Bueno";
        candyName[1][1] = "Bolsa variada Haribo";
        candyName[1][2] = "Chetoos";
        candyName[1][3] = "Twix";

        candyName[2][0] = "Kinder Bueno";
        candyName[2][1] = "M&M'S";
        candyName[2][2] = "Papa Delta";
        candyName[2][3] = "Chicles de menta";

        candyName[3][0] = "Lacasitos";
        candyName[3][1] = "Crunch";
        candyName[3][2] = "Milkybar";
        candyName[3][3] = "KitKat";


        price = new double[4][4];

        price[0][0] = 1000;
        price[0][1] = 200;
        price[0][2] = 500;
        price[0][3] = 950;

        price[1][0] = 1800;
        price[1][1] = 100;
        price[1][2] = 120;
        price[1][3] = 100;

        price[2][0] = 1750;
        price[2][1] = 130;
        price[2][2] = 120;
        price[2][3] = 800;

        price[3][0] = 1500;
        price[3][1] = 110;
        price[3][2] = 720;
        price[3][3] = 350;

        amount = new int[4][4];

        amount[0][0] = 5;
        amount[0][1] = 5;
        amount[0][2] = 5;
        amount[0][3] = 5;

        amount[1][0] = 5;
        amount[1][1] = 5;
        amount[1][2] = 5;
        amount[1][3] = 5;

        amount[2][0] = 5;
        amount[2][1] = 5;
        amount[2][2] = 5;
        amount[2][3] = 5;

        amount[3][0] = 5;
        amount[3][1] = 5;
        amount[3][2] = 5;
        amount[3][3] = 5;

    }

    public void askCandy(){

          do {

              amCandies = amount[0][0];

              String data = "The candies information is: \n";

              data += "Candy code : " + code[0][0] + "\n";

              data += "Candy name : " + candyName[0][0] + "\n";

              data += "Candy price :." + price[0][0] + "\n";

              data += "Candy amount : " + amCandies+ "\n";

              JOptionPane.showMessageDialog(null, data);
              int yes = Integer.parseInt(JOptionPane.showInputDialog(null,
                      "Pulse Zero to buy it",JOptionPane.YES_NO_OPTION));

              if(yes == JOptionPane.YES_OPTION) {

                  amount[0][0]--;

                  amCandies--;

                  gain = price[0][0];

                  cont1++;

                 int i = cont1;

                 for ( yes = JOptionPane.YES_OPTION ; i<cont1; i++) {
                     
                    gain+=i*gain;
                 }
                  

                  

                  JOptionPane.showMessageDialog(null,"successfully buyed");

                  String Final = "The candies information is: \n";

                  Final += "Candy code : " + code[0][0] + "\n";

                  Final += "Candy name : " + candyName[0][0] + "\n";

                  Final += "Candy price :." + price[0][0] + "\n";

                  Final += "Candy amount : " + amCandies+ "\n";

                  JOptionPane.showMessageDialog(null, Final);

                  break;

              } else if(yes == JOptionPane.CANCEL_OPTION){

                  break;

              }

          }while(amCandies >= 0);

    }

    public void askCandy2(){

        do {

            amCandies2 = amount[0][1];

            String data = "The candies information is: \n";

            data += "Candy code : " + code[0][1] + "\n";

            data += "Candy name : " + candyName[0][1] + "\n";

            data += "Candy price :." + price[0][1] + "\n";

            data += "Candy amount : " + amCandies2+ "\n";

            JOptionPane.showMessageDialog(null, data);

            int yes = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Pulse Zero to buy it",JOptionPane.YES_NO_OPTION));

            if(yes == JOptionPane.YES_OPTION) {

                amount[0][1]--;

                amCandies2--;

                

                cont2++;

                gain1 = price[0][1];

               int i = cont2;

               for ( yes = JOptionPane.YES_OPTION ; i<cont2; i++) {
                   
                  gain+=i*gain1;
               }
                

                JOptionPane.showMessageDialog(null,"successfully buyed");

                String Final = "The candies information is: \n";

                Final += "Candy code : " + code[0][1] + "\n";

                Final += "Candy name : " + candyName[0][1] + "\n";

                Final += "Candy price :." + price[0][1] + "\n";

                Final += "Candy amount : " + amCandies2+ "\n";

                JOptionPane.showMessageDialog(null, Final);

                break;

            } else if(yes == JOptionPane.CANCEL_OPTION){

                break;

            }

        }while(amCandies2 >= 0);

    }
    public void askCandy3(){
        do {

            amCandies3 = amount[0][2];

            String data = "The candies information is: \n";

            data += "Candy code : " + code[0][2] + "\n";

            data += "Candy name : " + candyName[0][2] + "\n";

            data += "Candy price :." + price[0][2] + "\n";

            data += "Candy amount : " + amCandies3+ "\n";

            JOptionPane.showMessageDialog(null, data);
            int yes = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Pulse Zero to buy it",JOptionPane.YES_NO_OPTION));

            if(yes == JOptionPane.YES_OPTION) {

                amount[0][2]--;

                amCandies3--;

                price[0][2] = gain2;

                cont3++;

                gain2 = price[0][2];

                

               int i = cont3;

               for ( yes = JOptionPane.YES_OPTION ; i<cont3; i++) {
                   
                  gain2+=i*gain2;
               }
                

                JOptionPane.showMessageDialog(null,"successfully buyed");

                String Final = "The candies information is: \n";

                Final += "Candy code : " + code[0][2] + "\n";

                Final += "Candy name : " + candyName[0][2] + "\n";

                Final += "Candy price :." + price[0][2] + "\n";

                Final += "Candy amount : " + amCandies3+ "\n";

                JOptionPane.showMessageDialog(null, Final);

                break;

            } else if(yes == JOptionPane.CANCEL_OPTION){

                break;

            }

        }while(amCandies3 >= 0);


    }
    public void askCandy4(){

        do {

            amCandies4 = amount[0][3];

            String data = "The candies information is: \n";

            data += "Candy code : " + code[0][3] + "\n";

            data += "Candy name : " + candyName[0][3] + "\n";

            data += "Candy price :." + price[0][3] + "\n";

            data += "Candy amount : " + amCandies4+ "\n";

            JOptionPane.showMessageDialog(null, data);
            int yes = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Pulse Zero to buy it",JOptionPane.YES_NO_OPTION));

            if(yes == JOptionPane.YES_OPTION) {

                amount[0][03]--;

                amCandies4--;

                price[0][3] = gain3;

                cont4++;

                gain3 = price[0][3];

                

               int i = cont4;

               for ( yes = JOptionPane.YES_OPTION ; i<cont4; i++) {
                   
                  gain3+=i*gain3;
               }
                

                JOptionPane.showMessageDialog(null,"successfully buyed");

                String Final = "The candies information is: \n";

                Final += "Candy code : " + code[0][3] + "\n";

                Final += "Candy name : " + candyName[0][3] + "\n";

                Final += "Candy price :." + price[0][3] + "\n";

                Final += "Candy amount : " + amCandies4+ "\n";

                JOptionPane.showMessageDialog(null, Final);

                break;

            } else if(yes == JOptionPane.CANCEL_OPTION){

                break;

            }

        }while(amCandies4 >= 0);

    }
    public void askCandy5(){

        do {

            amCandies5 = amount[1][0];

            String data = "The candies information is: \n";

            data += "Candy code : " + code[1][0] + "\n";

            data += "Candy name : " + candyName[1][0] + "\n";

            data += "Candy price :." + price[1][0] + "\n";

            data += "Candy amount : " + amCandies5+ "\n";

            JOptionPane.showMessageDialog(null, data);
            int yes = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Pulse Zero to buy it",JOptionPane.YES_NO_OPTION));

            if(yes == JOptionPane.YES_OPTION) {

                amount[1][0]--;

                amCandies5--;

                price[1][0] = gain4;

                cont5++;

                gain4 = price[1][0];

                

               int i = cont5;

               for ( yes = JOptionPane.YES_OPTION ; i<cont5; i++) {
                   
                  gain4+=i*gain4;
               }
                

                JOptionPane.showMessageDialog(null,"successfully buyed");

                String Final = "The candies information is: \n";

                Final += "Candy code : " + code[1][0] + "\n";

                Final += "Candy name : " + candyName[1][0] + "\n";

                Final += "Candy price :." + price[1][0] + "\n";

                Final += "Candy amount : " + amCandies5+ "\n";

                JOptionPane.showMessageDialog(null, Final);

                break;

            } else if(yes == JOptionPane.CANCEL_OPTION){

                break;

            }

        }while(amCandies5 >= 0);

    }
    public void askCandy6(){

        do {

            amCandies6 = amount[1][1];

            String data = "The candies information is: \n";

            data += "Candy code : " + code[1][1] + "\n";

            data += "Candy name : " + candyName[1][1] + "\n";

            data += "Candy price :." + price[1][1] + "\n";

            data += "Candy amount : " + amCandies6+ "\n";

            JOptionPane.showMessageDialog(null, data);
            int yes = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Pulse Zero to buy it",JOptionPane.YES_NO_OPTION));

            if(yes == JOptionPane.YES_OPTION) {

                amount[1][1]--; 

                amCandies6--;

                

                cont6++;

                gain5 = price[1][1];

                

               int i = cont6;

               for ( yes = JOptionPane.YES_OPTION ; i<cont6; i++) {
                   
                  gain5+=i*gain5;
               }
                

                JOptionPane.showMessageDialog(null,"successfully buyed");

                String Final = "The candies information is: \n";

                Final += "Candy code : " + code[1][1] + "\n";

                Final += "Candy name : " + candyName[1][1] + "\n";

                Final += "Candy price :." + price[1][1] + "\n";

                Final += "Candy amount : " + amCandies6 + "\n";

                JOptionPane.showMessageDialog(null, Final);

                break;

            } else if(yes == JOptionPane.CANCEL_OPTION){

                break;

            }

        }while(amCandies6 >= 0);
    }


    public void askCandy7(){

        do {

            amCandies7 = amount[1][2];

            String data = "The candies information is: \n";

            data += "Candy code : " + code[1][2] + "\n";

            data += "Candy name : " + candyName[1][2] + "\n";

            data += "Candy price :." + price[1][2] + "\n";

            data += "Candy amount : " + amCandies7+ "\n";

            JOptionPane.showMessageDialog(null, data);
            int yes = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Pulse Zero to buy it",JOptionPane.YES_NO_OPTION));

            if(yes == JOptionPane.YES_OPTION) {

                amount[1][2]--;

                amCandies7--;

                

                cont7++;

                gain6 = price[1][2];

                

               int i = cont7;

               for ( yes = JOptionPane.YES_OPTION ; i<cont7; i++) {
                   
                  gain6+=i*gain6;
               }
                

                JOptionPane.showMessageDialog(null,"successfully buyed");

                String Final = "The candies information is: \n";

                Final += "Candy code : " + code[1][2] + "\n";

                Final += "Candy name : " + candyName[1][2] + "\n";

                Final += "Candy price :." + price[1][2] + "\n";

                Final += "Candy amount : " + amCandies7+ "\n";

                JOptionPane.showMessageDialog(null, Final);

                break;

            } else if(yes == JOptionPane.CANCEL_OPTION){

                break;

            }

        }while(amCandies7 >= 0);

    }

    public void askCandy8(){

        do {

            amCandies8 = amount[1][3];

            String data = "The candies information is: \n";

            data += "Candy code : " + code[1][3] + "\n";

            data += "Candy name : " + candyName[1][3] + "\n";

            data += "Candy price :." + price[1][3] + "\n";

            data += "Candy amount : " + amCandies8+ "\n";

            JOptionPane.showMessageDialog(null, data);

            int yes = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Pulse Zero to buy it",JOptionPane.YES_NO_OPTION));

            if(yes == JOptionPane.YES_OPTION) {

                amount[1][3]--;

                amCandies8--;

                gain7 = price[1][3] ;

                cont8++;

                int i = cont8;



               for ( yes = JOptionPane.YES_OPTION ; i<cont8; i++) {
                   
                  gain8+=i*gain8;
               }
                

                JOptionPane.showMessageDialog(null,"successfully buyed");

                String Final = "The candies information is: \n";

                Final += "Candy code : " + code[1][3] + "\n";

                Final += "Candy name : " + candyName[1][3] + "\n";

                Final += "Candy price :." + price[1][3] + "\n";

                Final += "Candy amount : " + amCandies8+ "\n";

                JOptionPane.showMessageDialog(null, Final);

                break;

            } else if(yes == JOptionPane.CANCEL_OPTION){

                gain8 =price[1][3] ;

                cont9++;

                int i = cont8;

               for ( yes = JOptionPane.YES_OPTION ; i<cont7; i++) {
                   
                  gain7+=i*gain7;
               }

                break;

            }

        }while(amCandies8 >= 0);

    }
    public void askCandy9(){

        do {

            amCandies9 = amount[2][0];

            String data = "The candies information is: \n";

            data += "Candy code : " + code[2][0] + "\n";

            data += "Candy name : " + candyName[2][0] + "\n";

            data += "Candy price :." + price[2][0] + "\n";

            data += "Candy amount : " + amCandies9+ "\n";

            JOptionPane.showMessageDialog(null, data);

            int yes = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Pulse Zero to buy it",JOptionPane.YES_NO_OPTION));

            if(yes == JOptionPane.YES_OPTION) {

                amount[2][0]--;

                amCandies9--;

                price[2][0] = gain8;

                cont9++;

                gain9 =price[2][0] ;

            

                int i = cont9;

               for ( yes = JOptionPane.YES_OPTION ; i<cont9; i++) {
                   
                  gain9+=i*gain9;
               }

                JOptionPane.showMessageDialog(null,"successfully buyed");

                String Final = "The candies information is: \n";

                Final += "Candy code : " + code[2][0] + "\n";

                Final += "Candy name : " + candyName[2][0] + "\n";

                Final += "Candy price :." + price[2][0] + "\n";

                Final += "Candy amount : " + amCandies9+ "\n";

                JOptionPane.showMessageDialog(null, Final);

                break;

            } else if(yes == JOptionPane.CANCEL_OPTION){

                break;

            }

        }while(amCandies9 >= 0);

    }

    public void askCandy10(){

        do {

            amCandies10 = amount[2][1];

            String data = "The candies information is: \n";

            data += "Candy code : " + code[2][1] + "\n";

            data += "Candy name : " + candyName[2][1] + "\n";

            data += "Candy price :." + price[2][1] + "\n";

            data += "Candy amount : " + amCandies7+ "\n";

            JOptionPane.showMessageDialog(null, data);
            int yes = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Pulse Zero to buy it",JOptionPane.YES_NO_OPTION));

            if(yes == JOptionPane.YES_OPTION) {

                amount[2][1]--;

                amCandies10--;

                price[2][1] = gain9;

                cont10++;

                JOptionPane.showMessageDialog(null,"successfully buyed");

                String Final = "The candies information is: \n";

                Final += "Candy code : " + code[2][1] + "\n";

                Final += "Candy name : " + candyName[2][1] + "\n";

                Final += "Candy price :." + price[2][1] + "\n";

                Final += "Candy amount : " + amCandies10+ "\n";

                JOptionPane.showMessageDialog(null, Final);

                break;

            } else if(yes == JOptionPane.CANCEL_OPTION){

                break;

            }

        }while(amCandies10 >= 0);

    }
    public void askCandy11(){

        do {

            amCandies11 = amount[2][2];

            String data = "The candies information is: \n";

            data += "Candy code : " + code[2][2] + "\n";

            data += "Candy name : " + candyName[2][2] + "\n";

            data += "Candy price :." + price[2][2] + "\n";

            data += "Candy amount : " + amCandies11+ "\n";

            JOptionPane.showMessageDialog(null, data);
            int yes = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Pulse Zero to buy it",JOptionPane.YES_NO_OPTION));

            if(yes == JOptionPane.YES_OPTION) {

                amount[2][2]--;

                amCandies7--;

                price[2][2] = gain10;

                cont11++;

                JOptionPane.showMessageDialog(null,"successfully buyed");

                String Final = "The candies information is: \n";

                Final += "Candy code : " + code[2][2] + "\n";

                Final += "Candy name : " + candyName[2][2] + "\n";

                Final += "Candy price :." + price[2][2] + "\n";

                Final += "Candy amount : " + amCandies11+ "\n";

                JOptionPane.showMessageDialog(null, Final);

                break;

            } else if(yes == JOptionPane.CANCEL_OPTION){

                break;

            }

        }while(amCandies11 >= 0);

    }

    public void askCandy12(){

        do {

            amCandies12 = amount[2][3];

            String data = "The candies information is: \n";

            data += "Candy code : " + code[2][3] + "\n";

            data += "Candy name : " + candyName[2][3] + "\n";

            data += "Candy price :." + price[2][3] + "\n";

            data += "Candy amount : " + amCandies12+ "\n";

            JOptionPane.showMessageDialog(null, data);
            int yes = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Pulse Zero to buy it",JOptionPane.YES_NO_OPTION));

            if(yes == JOptionPane.YES_OPTION) {

                amount[2][3]--;

                amCandies12--;

                price[2][3] = gain11;

                cont12++;

                JOptionPane.showMessageDialog(null,"successfully buyed");

                String Final = "The candies information is: \n";

                Final += "Candy code : " + code[2][3] + "\n";

                Final += "Candy name : " + candyName[2][3] + "\n";

                Final += "Candy price :." + price[2][3] + "\n";

                Final += "Candy amount : " + amCandies12+ "\n";

                JOptionPane.showMessageDialog(null, Final);

                break;

            } else if(yes == JOptionPane.CANCEL_OPTION){

                break;

            }

        }while(amCandies12 >= 0);

    }
    public void askCandy13(){

        do {

            amCandies13 = amount[3][0];

            String data = "The candies information is: \n";

            data += "Candy code : " + code[3][0] + "\n";

            data += "Candy name : " + candyName[3][0] + "\n";

            data += "Candy price :." + price[3][0] + "\n";

            data += "Candy amount : " + amCandies13+ "\n";

            JOptionPane.showMessageDialog(null, data);

            int yes = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Pulse Zero to buy it",JOptionPane.YES_NO_OPTION));

            if(yes == JOptionPane.YES_OPTION) {

                amount[3][0]--;

                amCandies13--;

                price[3][0] = gain12;

                cont13++;

                JOptionPane.showMessageDialog(null,"successfully buyed");

                String Final = "The candies information is: \n";

                Final += "Candy code : " + code[3][0] + "\n";

                Final += "Candy name : " + candyName[3][0] + "\n";

                Final += "Candy price :." + price[3][0] + "\n";

                Final += "Candy amount : " + amCandies13+ "\n";

                JOptionPane.showMessageDialog(null, Final);

                break;

            } else if(yes == JOptionPane.CANCEL_OPTION){

                break;

            }

        }while(amCandies13 >= 0);

    }

    public void askCandy14(){

        do {

            amCandies14 = amount[3][1];

            String data = "The candies information is: \n";

            data += "Candy code : " + code[3][1] + "\n";

            data += "Candy name : " + candyName[3][1] + "\n";

            data += "Candy price :." + price[3][1] + "\n";

            data += "Candy amount : " + amCandies7+ "\n";

            JOptionPane.showMessageDialog(null, data);
            int yes = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Pulse Zero to buy it",JOptionPane.YES_NO_OPTION));

            if(yes == JOptionPane.YES_OPTION) {

                amount[3][1]--;

                amCandies14--;

                price[3][1] = gain13;

                cont14++;

                JOptionPane.showMessageDialog(null,"successfully buyed");

                String Final = "The candies information is: \n";

                Final += "Candy code : " + code[3][1] + "\n";

                Final += "Candy name : " + candyName[3][1] + "\n";

                Final += "Candy price :." + price[3][1] + "\n";

                Final += "Candy amount : " + amCandies14+ "\n";

                JOptionPane.showMessageDialog(null, Final);

                break;

            } else if(yes == JOptionPane.CANCEL_OPTION){

                break;

            }

        }while(amCandies14 >= 0);

    }
    public void askCandy15(){

        do {

            amCandies15 = amount[3][2];

            String data = "The candies information is: \n";

            data += "Candy code : " + code[3][2] + "\n";

            data += "Candy name : " + candyName[3][2] + "\n";

            data += "Candy price :." + price[3][2] + "\n";

            data += "Candy amount : " + amCandies15+ "\n";

            JOptionPane.showMessageDialog(null, data);

            int yes = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Pulse Zero to buy it",JOptionPane.YES_NO_OPTION));

            if(yes == JOptionPane.YES_OPTION) {

                amount[3][2]--;

                amCandies15--;

                price[3][2] = gain14;

                cont15++;

                JOptionPane.showMessageDialog(null,"successfully buyed");

                String Final = "The candies information is: \n";

                Final += "Candy code : " + code[3][2] + "\n";

                Final += "Candy name : " + candyName[3][2] + "\n";

                Final += "Candy price :." + price[3][2] + "\n";

                Final += "Candy amount : " + amCandies15+ "\n";

                JOptionPane.showMessageDialog(null, Final);

                break;

            } else if(yes == JOptionPane.CANCEL_OPTION){

                break;

            }

        }while(amCandies15 >= 0);

    }

    public void askCandy16(){

        do {

            amCandies16 = amount[3][3];

            String data = "The candies information is: \n";

            data += "Candy code : " + code[3][3] + "\n";

            data += "Candy name : " + candyName[3][3] + "\n";

            data += "Candy price :." + price[3][3] + "\n";

            data += "Candy amount : " + amCandies16+ "\n";

            JOptionPane.showMessageDialog(null, data);

            int yes = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Pulse Zero to buy it",JOptionPane.YES_NO_OPTION));

            if(yes == JOptionPane.YES_OPTION) {

                amount[3][3]--;

                amCandies16--;

                price[3][3] = gain15;

                cont16++;

                JOptionPane.showMessageDialog(null,"successfully buyed");

                String Final = "The candies information is: \n";

                Final += "Candy code : " + code[3][3] + "\n";

                Final += "Candy name : " + candyName[3][3] + "\n";

                Final += "Candy price :." + price[3][3] + "\n";

                Final += "Candy amount : " + amCandies16+ "\n";

                JOptionPane.showMessageDialog(null, Final);

                break;

            } else if(yes == JOptionPane.CANCEL_OPTION){

                break;

            }

        }while(amCandies16 >= 0);

    }

    public void FillCandy(){

        String password =JOptionPane.showInputDialog(
                null,"Please insert the code");

        if(password.equals("Machine2020")){

          int position;

          position = Integer.parseInt(
                  JOptionPane.showInputDialog(null,"PLease enter thm position"));

          if(position == 00){

              int newbie;

              newbie = Integer.parseInt(
                      JOptionPane.showInputDialog(null,"Please give a new amount"));

              amCandies = newbie;

          }else if(position == 01){

                int newbie;

                newbie = Integer.parseInt(
                        JOptionPane.showInputDialog(null,"Please give a new amount"));

                amount [0][1] = newbie;

            }else if(position == 02){

              int newbie;

              newbie = Integer.parseInt(
                      JOptionPane.showInputDialog(null,"Please give a new amount"));

              amount [0][2] = newbie;

          }else if(position == 03){

              int newbie;

              newbie = Integer.parseInt(
                      JOptionPane.showInputDialog(null,"Please give a new amount"));

              amount [0][3] = newbie;

          }else if(position == 10){

              int newbie;

              newbie = Integer.parseInt(
                      JOptionPane.showInputDialog(null,"Please give a new amount"));

              amount [1][0] = newbie;

          }else if(position == 11){

              int newbie;

              newbie = Integer.parseInt(
                      JOptionPane.showInputDialog(null,"Please give a new amount"));

              amount [1][1] = newbie;

          }else if(position == 12){

              int newbie;

              newbie = Integer.parseInt(
                      JOptionPane.showInputDialog(null,"Please give a new amount"));

              amount [1][2] = newbie;

          }else if(position == 13){

              int newbie;

              newbie = Integer.parseInt(
                      JOptionPane.showInputDialog(null,"Please give a new amount"));

              amount [1][3] = newbie;

          }else if(position == 20){

              int newbie;

              newbie = Integer.parseInt(
                      JOptionPane.showInputDialog(null,"Please give a new amount"));

              amount [2][0] = newbie;

          }else if(position == 21){

              int newbie;

              newbie = Integer.parseInt(
                      JOptionPane.showInputDialog(null,"Please give a new amount"));

              amount [2][1] = newbie;

          }else if(position == 22){

              int newbie;

              newbie = Integer.parseInt(
                      JOptionPane.showInputDialog(null,"Please give a new amount"));

              amount [2][2] = newbie;

          }else if(position == 23){

              int newbie;

              newbie = Integer.parseInt(
                      JOptionPane.showInputDialog(null,"Please give a new amount"));

              amount [2][3] = newbie;

          }else if(position == 30){

              int newbie;

              newbie = Integer.parseInt(
                      JOptionPane.showInputDialog(null,"Please give a new amount"));

              amount [3][0] = newbie;

          }else if(position == 31){

              int newbie;

              newbie = Integer.parseInt(
                      JOptionPane.showInputDialog(null,"Please give a new amount"));

              amount [3][1] = newbie;

          }else if(position == 32){

              int newbie;

              newbie = Integer.parseInt(
                      JOptionPane.showInputDialog(null,"Please give a new amount"));

              amount [3][2] = newbie;

          }else if(position == 33){

              int newbie;
              newbie = Integer.parseInt(
                      JOptionPane.showInputDialog(null,"Please give a new amount"));

              amount [3][3] = newbie;

          }else if(position != 00 || position != 01 || position != 02 || position != 03
                   || position != 10 || position != 11 || position != 12 || position != 12
                    || position !=20 || position != 21 || position !=22 || position !=23
                     || position !=30 || position != 31 || position != 32 || position != 33){


                      JOptionPane.showMessageDialog(null,"Position Non-Existent");

          }

        }else{

            JOptionPane.showMessageDialog(
                    null,"Wrong Password");

        }

    }

    public void ShowAll() {

        

        String data = "The candies information is: \n";

        data += "Candy code : " + code[0][0] + "\n";

        data += "Candy name : " + candyName[0][0] + "\n";

        data += "Candy price :" + price[0][0] + "\n";

         if (amCandies == 0) {

            data += "Candy amount : " + amount[0][0] + "\n";

        } else if (amCandies == amCandies) {

             data += "Candy available amount :" + amCandies + "\n";
        }



        JOptionPane.showMessageDialog(null, data);



        String data1 = "The candies information is: \n";

        data1 += "Candy code : " + code [0][1]+"\n";

        data1+= "Candy name : " + candyName[0][1]+"\n";

        data1 += "Candy price :." + price[0][1]+"\n";

        if (amCandies2 == 0) {

            data += "Candy amount : " + amount[0][1] + "\n";

        } else if (amCandies2 == amCandies2) {

            data += "Candy available amount :" + amCandies2 + "\n";
        }

        JOptionPane.showMessageDialog(null, data1);



        String data2 = "The candies information is: \n";

        data2 += "Candy code : " + code [0][2]+"\n";

        data2+= "Candy name : " + candyName[0][2]+"\n";

        data2 += "Candy price :." + price[0][2]+"\n";

         if (amCandies3 == 0) {

            data += "Candy amount : " + amount[0][2] + "\n";

        } else if (amCandies3 == amCandies3) {

            data += "Candy available amount :" + amCandies3 + "\n";
        }


        JOptionPane.showMessageDialog(null, data2);



        String data3 = "The candies information is: \n";

        data3 += "Candy code : " + code [0][3]+"\n";

        data3+= "Candy name : " + candyName[0][3]+"\n";

        data3 += "Candy price :." + price[0][3]+"\n";

         if (amCandies4 == 0) {

            data += "Candy amount : " + amount[0][3] + "\n";

        } else if (amCandies4 == amCandies4) {

            data += "Candy available amount :" + amCandies4 + "\n";
        }


        JOptionPane.showMessageDialog(null, data3);


        String data0 = "The candies information is: \n";

        data0 += "Candy code : " + code [1][0]+"\n";

        data0+= "Candy name : " + candyName[1][0]+"\n";

        data0 += "Candy price :." + price[1][0]+"\n";

         if (amCandies5 == 0) {

            data += "Candy amount : " + amount[1][0] + "\n";

        } else if (amCandies5 == amCandies5) {

            data += "Candy available amount :" + amCandies5 + "\n";
        }


        JOptionPane.showMessageDialog(null, data0);


        String data01 = "The candies information is: \n";

        data01 += "Candy code : " + code [1][1]+"\n";

        data01 += "Candy name : " + candyName[1][1]+"\n";

        data01 += "Candy price :." + price[1][1]+"\n";

        if (amCandies6 == 0) {

            data += "Candy amount : " + amount[1][1] + "\n";

        } else if (amCandies6 == amCandies6) {

            data += "Candy available amount :" + amCandies6 + "\n";
        }


        JOptionPane.showMessageDialog(null, data01);


        String data02 = "The candies information is: \n";

        data02 += "Candy code : " + code [1][2]+"\n";

        data02+= "Candy name : " + candyName[1][2]+"\n";

        data02 += "Candy price :." + price[1][2]+"\n";

         if (amCandies7 == 0) {

            data += "Candy amount : " + amount[1][2] + "\n";

        } else if (amCandies7 == amCandies7) {

            data += "Candy available amount :" + amCandies7 + "\n";
        }


        JOptionPane.showMessageDialog(null, data02);


        String data03 = "The candies information is: \n";

        data03 += "Candy code : " + code [1][3]+"\n";

        data03  += "Candy name : " + candyName[1][3]+"\n";

        data03 += "Candy price :." + price[1][3]+"\n";

         if (amCandies8 == 0) {

            data += "Candy amount : " + amount[1][3] + "\n";

        } else if (amCandies8 == amCandies8) {

            data += "Candy available amount :" + amCandies8 + "\n";
        }


        JOptionPane.showMessageDialog(null, data03);


        String data00 = "The candies information is: \n";

        data00 += "Candy code : " + code [2][0]+"\n";

        data00 += "Candy name : " + candyName[2][0]+"\n";

        data00 += "Candy price :." + price[2][0]+"\n";

         if (amCandies9 == 0) {

            data += "Candy amount : " + amount[2][0] + "\n";

        } else if (amCandies9 == amCandies9) {

            data += "Candy available amount :" + amCandies9 + "\n";
        }


        JOptionPane.showMessageDialog(null, data00);


        String data001 = "The candies information is: \n";

        data001 += "Candy code : " + code [2][1]+"\n";

        data001+= "Candy name : " + candyName[2][1]+"\n";

        data001 += "Candy price :." + price[2][1]+"\n";

         if (amCandies10 == 0) {

            data += "Candy amount : " + amount[2][1] + "\n";

        } else if (amCandies10 == amCandies10) {

            data += "Candy available amount :" + amCandies10 + "\n";
        }


        JOptionPane.showMessageDialog(null, data001);



        String data002 = "The candies information is: \n";

        data002 += "Candy code : " + code [2][2]+"\n";

        data002 += "Candy name : " + candyName[2][2]+"\n";

        data002 += "Candy price :." + price[2][2]+"\n";

         if (amCandies11 == 0) {

            data += "Candy amount : " + amount[2][2] + "\n";

        } else if (amCandies11 == amCandies11) {

            data += "Candy available amount :" + amCandies11 + "\n";
        }


        JOptionPane.showMessageDialog(null, data002);



        String data003 = "The candies information is: \n";

        data003 += "Candy code : " + code [2][3]+"\n";

        data003 += "Candy name : " + candyName[2][3]+"\n";

        data003 += "Candy price :." + price[2][3]+"\n";

        if (amCandies12 == 0) {

            data += "Candy amount : " + amount[2][3] + "\n";

        } else if (amCandies12 == amCandies12) {

            data += "Candy available amount :" + amCandies12 + "\n";
        }


        JOptionPane.showMessageDialog(null, data003);



        String lan = "The candies information is: \n";

        lan += "Candy code : " + code [3][0]+"\n";

        lan+= "Candy name : " + candyName[3][0]+"\n";

        lan += "Candy price :." + price[3][0]+"\n";

        if (amCandies13 == 0) {

            data += "Candy amount : " + amount[3][0] + "\n";

        } else if (amCandies13 == amCandies13) {

            data += "Candy available amount :" + amCandies13 + "\n";
        }


        JOptionPane.showMessageDialog(null, lan);



        String lan1 = "The candies information is: \n";

        lan1 += "Candy code : " + code [3][1]+"\n";

        lan1+= "Candy name : " + candyName[3][1]+"\n";

        lan1 += "Candy price :." + price[3][1]+"\n";

         if (amCandies14 == 0) {

            data += "Candy amount : " + amount[3][1] + "\n";

        } else if (amCandies14 == amCandies14) {

            data += "Candy available amount :" + amCandies14 + "\n";
        }


        JOptionPane.showMessageDialog(null, lan1);


        String lan2 = "The candies information is: \n";

        lan2 += "Candy code : " + code [3][2]+"\n";

        lan2+= "Candy name : " + candyName[3][2]+"\n";

        lan2 += "Candy price :." + price[3][2]+"\n";

         if (amCandies15 == 0) {

            data += "Candy amount : " + amount[3][2] + "\n";

        } else if (amCandies15 == amCandies15) {

            data += "Candy available amount :" + amCandies15 + "\n";
        }


        JOptionPane.showMessageDialog(null, lan2);


        String lan3 = "The candies information is: \n";

        lan3 += "Candy code : " + code [3][3]+"\n";

        lan3+= "Candy name : " + candyName[3][3]+"\n";

        lan3 += "Candy price :." + price[3][3]+"\n";

         if (amCandies16 == 0) {

            data += "Candy amount : " + amount[3][3] + "\n";

        } else if (amCandies16 == amCandies16) {

            data += "Candy available amount :" + amCandies16 + "\n";
        }


        JOptionPane.showMessageDialog(null, lan3);

    }


    public void MachineStatistics(){

         JOptionPane.showMessageDialog(null,"Now the machine statistics will be showed");
        

         /* 
         {"KitKat", "Chicles de fresa", "Lacasitos", "Palotes"},
 
            {"Kinder Bueno", "Bolsa variada Haribo", "Chetoos", "Twix"},
 
            {"Kinder Bueno", "M&M'S", "Papa Delta", "Chicles de menta"},
 
            {"Lacasitos", "Crunch", "Milkybar", "KitKat"}
         */

         String Stack ="Sales information\n";

         Stack+="KitKat sold :"+ cont1+ " Times\n ";

         Stack+="Chicles de fresa sold :"+ cont2 +" Times\n";

         Stack+="Lacasitos sold :"+ cont3+ " Times \n";

         Stack+="Palotes sold : "+cont4+" Times\n";

         Stack+="Kinder Bueno sold :" +cont5+ " Times\n";

         Stack+="Bolsa variada Haribo :"+cont6+" Times \n";

         Stack+="Chetoos sold :"+cont7+" Times\n";

         Stack+="Twix sold :"+cont8+" Times\n";

         JOptionPane.showMessageDialog( null,Stack);

          

         String StackOver = "Sales information\n";

         StackOver+="Kinder BuenO sold : "+cont9+" Times\n";

         StackOver+="M&M'S sold : "+cont10+" Times\n";

         StackOver+="Papa Delta sold : "+cont11+" Times\n";

         StackOver+="Chicles de menta sold : "+cont12+" Times\n";

         StackOver+="LacasitoS sold : "+cont13+" Times \n";

         StackOver+="Crunch sold : "+cont14+" Times\n";

         StackOver+="Milkybar sold : "+cont15+" Times\n";

         StackOver+="KitKaT sold : "+cont16+" Times\n";
         
         JOptionPane.showMessageDialog( null,StackOver);


         String StackOverflow = "The  Cumulative total is\n";

         StackOverflow +="Acumulated fo sale KitKat: " + gain +"\n";

         StackOverflow +="Acumulated fo sale Chicles de fresa: "+ gain1 +"\n";

         StackOverflow +="Acumulated fo sale KitKat"+ gain2 +"\n";

         StackOverflow +="Acumulated fo sale KitKat"+ gain3 +"\n";

         StackOverflow +="Acumulated fo sale KitKat"+ gain4 +"\n";

         StackOverflow +="Acumulated fo sale KitKat"+ gain5 +"\n";

         StackOverflow +="Acumulated fo sale KitKat"+ gain6 +"\n";

         StackOverflow +="Acumulated fo sale KitKat"+ gain7 +"\n";

         JOptionPane.showMessageDialog( null,StackOverflow);


         String Oracle = "The  Cumulative total is\n";

         Oracle +="Acumulated fo sale KitKat"+ gain8 +"\n";

         Oracle +="Acumulated fo sale KitKat"+ gain9 +"\n";

         Oracle +="Acumulated fo sale KitKat"+ gain10 +"\n";

         Oracle +="Acumulated fo sale KitKat"+ gain11 +"\n";

         Oracle +="Acumulated fo sale KitKat"+ gain12 +"\n";

         Oracle +="Acumulated fo sale KitKat"+ gain13 +"\n";

         Oracle +="Acumulated fo sale KitKat"+ gain14 +"\n";

         Oracle +="Acumulated fo sale KitKat"+ gain15 +"\n";

        JOptionPane.showMessageDialog( null,Oracle);

        String Total = "The   total is\n";

        Total+="Total:" + gain+gain1+gain2+gain3+gain4+gain5+gain6+gain7+
        gain8+gain9+gain10+gain11+gain12+gain13+gain14+gain15;

        JOptionPane.showMessageDialog( null,Total);
        
        }
}

