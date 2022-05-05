package ifClause;

public class SwitchCase {
    public static void main(String[] args){
       int mon = 7;
        String monthString = "";

        switch(mon){
            case 1 : monthString="Hi I'm Jan";
            break;
            case 2 : monthString="Hi I'm Feb";
            break;
            case 3 : monthString="Hi I'm mar";
            break;
            case 4 : monthString="Hi I'm aprl";
            break;
            case 5 : monthString="Hi I'm May";
            break;
            case 6 : monthString="Hi I'm June";
            break;
            case 7 : monthString="Hi I'm July";
            break;
            case 8 : monthString="Hi I'm Aug";
            break;
            case 9 : monthString="Hi I'm Sep";
            break;
            case 10 : monthString="Hi I'm Oct";
            break;
            case 11: monthString="Hi I'm Nov";
            break;
            case 12 : monthString="Hi I'm Dec";
            break;
        }
        System.out.println(monthString);
    }
}
