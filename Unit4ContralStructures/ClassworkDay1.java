
/**
 * Write a description of class ClassworkDay1 here.
 *
 * @jismchenchen
 * @2017/10/17
 */
public class ClassworkDay1
{   
    public static void main(String[] args){
        System.out.println(howOld("Jim", 19));
    }
    
    
    
    public static String howOld(String name, int age){
        String temp = "";
        if(age < 16){
            temp += "You cannot drive, " + name + ". ";
        }if(age < 18){
            temp += "You cannot vote, " + name + ". ";
        }if(age < 25){
            temp += "You cannot rent a car, " + name + ". ";
        }else{
            temp += "You can do anything that is legal, " + name + "!";
        }
        return temp;
    }
    
    public static String weekdayName(int date){
        if(date == 1){
            return "Sunday";
        }else if(date == 2){
            return "Monday";
        }else if(date == 3){
            return "Tuesday";
        }else if(date == 4){
            return "Wednesday";
        }else if(date == 5){
            return "Thursday";
        }else if(date == 6 ){
            return "Friday";
        }else if(date == 7){
            return "Saturday";
        }else if(date ==0){
            return "Saturday";
        }else{
            return "error";
        }
    }
    
    public static String spaceBoxingWeight(int weight, int planetNum){
	double weightR = 0.0;
        switch(planetNum){
	case 1:
		weightR = weight * 0.78;
		break;
	case 2:
		weightR = weight * 0.39;
		break;
	case 3:
		weightR = weight * 2.65;
		break;
	case 4:
		weightR = weight * 1.17;
		break;
	case 5:
		weightR = weight * 1.05;
		break;
	case 6:
		weightR = weight * 1.23;
		break;
	default:
		weightR = 0.0;
		break;
	}
        return "our weight would be  " + weightR + "pounds on that planet. ";
    }
}




