import java.util.Scanner;
public class Healthy {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
      
        System.out.print("请输入你的性别：");
        char gender=sc.next().charAt(0);
      

        System.out.print("请输入你的身高 (cm)：");
        double tall=sc.nextDouble();

        System.out.print("请输入你的体重(kg) ：");
        double weight=sc.nextDouble();

        System.out.print("请输入你的年龄：");
        byte age=sc.nextByte();

        double bmi=BMIcalculator(tall,weight);
        double bmr=BMRcalculator(weight,age,gender);
        System.out.println("你的BMI指数是："+bmi);

        if(bmi<18.5){
            System.out.println("杂鱼~细狗~");
        }else if(bmi>=18.5 && bmi<25){
            System.out.println("软弱无力~一看就不行~");
        }else if(bmi>=25 && bmi<30){
            System.out.println("也就这点水平了大叔~不太行啊~");
        }else if(bmi>=30){
            System.out.println("有点...超纲了吧...臭杂鱼~");
        }
        
        System.out.println("你的基础代谢率是："+bmr);
        sc.close();
    }
    public static double BMIcalculator(double tall,double weight){
        return weight/(tall/100*tall/100);
    }
    public static double BMRcalculator(double weight,double age,char gender){
        if(gender=='男'){
            return 10*weight+6.25*age-5*age;
        }else{
            return 10*weight+6.25*age-5*age-161;
        }
    }
}

