
/**
 * Write a description of class ClassworkDay2 here.
 *
 * @jimschenchen
 * @2017/10/17
 */
public class ClassworkDay2
{
    public static String randomMonth(){
        int ran = (int)(Math.random() * 13);
        if(ran == 1){
            return "January";
        }else if(ran == 2){
            return "February";
        }else if(ran == 3){
            return "March";
        }else if(ran == 4){
            return "April";
        }else if(ran == 5){
            return "May";
        }else if(ran == 6){
            return "June";
        }else if(ran == 7){
            return "July";
        }else if(ran == 8){
            return "August";
        }else if(ran == 9){
            return "September";
        }else if(ran == 10){
            return "October";
        }else if(ran == 11){
            return "November";
        }else if(ran == 12){
            return "December";
        }else{
            return "None";
        }
    }
    
    public static String capitalizeName(String str){
        int position = 0;
        for (int i = 0; i < str.length(); i ++){
            //System.out.println((int)str.charAt(i));
            if((int)str.charAt(i) == 32){
                position = i;
            }
        }
        //find the index of sapce
        char c =(char)((int)str.charAt(0) - 32);
        char c2 = (char)((int)str.charAt(position + 1) - 32);
        //str = c + str.substring(1, str.length());
        str = "" + c +str.substring(1, position + 1) + c2 + str.substring(position + 2, str.length());
        return str;
    }
    
    public static String getTenISBN (String digit){
        int ret = 0;
        for(int i = 0; i < 9; i ++){
            ret += ((int)digit.charAt(i) - 48) * (i + 1);
            System.out.println(ret);
        }
        ret = ret % 11;
        String retS = "";
        if(ret < 10){
            retS = "" + ret;
        }else{
            retS = "X";
        }
        return digit + retS;
    }
    
    public static int indexTest(String str){
        int ret = str.indexOf("ab");
        return ret;
        
    }
    
}
