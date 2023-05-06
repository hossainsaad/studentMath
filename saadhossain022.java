// persentage>=90 A-Excellent
// 90>persentage>=80 B very good
// 80>persentage>=70 C good
// 70>persentage>=60 D Satisfactory
// 60>persentage>=50 E Work Hard
// 50>persentage>=40 F Just passed
// persentage<40 Failed









import java.util.Scanner;
class saadhossain022{
  public void info (String name,String_fathers_name,int roll_no)
  {
      System.out.println("Name : " +name+ "Roll no :"+roll_no+"Fathers name:" +father_name);
  }
}
        class Marks extends saadhossain022{
            double persentage=0.0,total;
            public void getPer(double subject1,double subject2,double subject3,double subject4,double subject5)
             {
                 total=subject1+subject2+subject3+subject4+subject5;
                 persentage=(total/500)*100;
             }
        }
        class grade extends Marks{
            public void grade()
            {
                System.out.println("your persentage is :"+persentage);
                if (persentage>=90)
                {
                    System.out.println("Excellent : grade A");
                }
                        else if (persentage<90 && persentage>=80){
                            System.out.println("very good : grade B");
                        }
                            else if (persentage<80 && persentage >=70);
                            {
                            System.out.println("Good grade : C");
                            }
                            else if (persentage<70 && persentage>=60);
                            {
                            System.out.println("Satisfactory : grade D");
                            }
                            else if (persentage<60 && persentage>=50);
                            {
                            System.out.println("Hard work : grade E");
                            }
            }
                            else if (persentage<50 && persentage>=40);
                            {
                            System.out.println("just passed : grade F");
                        }
                        else {
                        System.out.println("You have failed");
                }
            }
                public class saadhossain022{
                    public static void main (String[] args) {
                        double subject1,subject2,subject3,subject4,subject5;
                        int roll_no;
                        String name ,father_name;
                        Scanner scan =new Scanner(System.in);
                        System.out.println("your name is here");
                        name = scan.nextLine();
                        System.out.println("roll no is here");
                        roll_no =scan.nextInt();
                        System.out.println("Fathers name is here");
                        scan.nextLine();
                        father_name= scan.nextLine();
                        
                        System.out.println("marks of subject 1");
                        subject1 = scan.nextDouble();
                        System.out.println("marks of subject 2");
                        subject2 = scan.nextDouble();
                        System.out.println("marks of subject 3");
                        subject3 = scan.nextDouble();
                        System.out.println("marks of subject 4");
                        subject4 = scan.nextDouble();
                        System.out.println("marks of subject 5");
                        subject5 = scan.nextDouble();
                        
                        grade g =newGrade();
                        g.info(name,father_name,roll_no);
                        
                        g.getPer(ubject1,subject2,subject3,subject4,subject5);
                        g.grade();
                    }
                        
                    }
                }
                            
                        
            

      
      
      
  
        
        
        
        

