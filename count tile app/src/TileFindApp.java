import java.util.Scanner;

public class TileFindApp {
    private static double Llength;
    private static double Lwidth;

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("To enter data in meters type 'm' or to enter data in feet type 'f' ");
            System.out.print("your choice : ");
            String choice =sc.next();
            if(choice.equals("f")) {
                System.out.print(" Enter width of land in feet :");
                 Lwidth = sc.nextInt();
                System.out.print(" Enter length of land in feet :");
                 Llength = sc.nextInt();
            }else if(choice.equals("m")){
                System.out.print(" Enter width of land in meters:");
                double width = sc.nextInt();
                 Lwidth =width*3.281;
                System.out.print(" Enter length of land in meters :");
                double length = sc.nextInt();
                 Llength =length*3.281;
            }else{
                System.out.println(" wrong input, try again ");
            }
            double Lareaft = Llength * Lwidth;
            double Larea = (Llength * 12) * (Lwidth * 12);
            System.out.println(" ");
            System.out.println("Area of land = " + Lareaft + "ft");
            System.out.println("Area of land in inches = " + Larea + "\"");
            double Twidth = 4; //in inches
            double Tlength = 4;
            double Tarea = Tlength * Twidth;
            double tileamount = Larea / Tarea;
            int Tamount = (int) tileamount;
            System.out.println("Area of one tile = " + Tarea + "\"");
            System.out.println(" ");
            System.out.println(tileamount);
            System.out.println(" Amount of tiles needed = "+ Tamount);
            System.out.println(" ");
            System.out.println(" we strongly recomend you to buy atleast 2 extra tiles.");
            double priceoftile =20;
            double tilekudu = 20;
            double cost =priceoftile*Tamount;
            double kuducost =(Larea/144)*tilekudu;
            System.out.println(kuducost);
            double labourcost =(Larea/144)*50;
            System.out.println(labourcost);
            double fullcost =cost+kuducost+labourcost;
            System.out.println("Total cost for tiles = Rs "+cost+".");
            System.out.println(" Estimated cost :"+fullcost);
        }catch (Exception e){
            System.out.println(" Something went wrong ,try again ");
        }
    }
}
