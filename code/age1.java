public class Age1
{
 public static void main (String args [])
 {
	 int day=8;
	 switch(day)
	 {
		    case 1:
		    case 2:
		    case 3:
		    case 4:
			case 5:
			System.out.println("working days");
			break;
			 case 6:
		     case 7:
			 System.out.println("weekand");
  			 break;
			 default :
			 System.out.println("invalid days ");
	 }
 }
}


class month
{
	public static void main(String args [])
	{
	 char ch= 'd';
     switch(ch)
	 {
		case 'J':
		case 'j':
		System.out.println(" january or june or july");
		break;
		
		case 'F':
		case 'f':
		System.out.println(" Feb");
		break;
		
		case 'M':
		case 'm':
		System.out.println(" march or may");
		break;
		
		case 'A':
		case 'a':
		System.out.println(" April or august");
		break;
		
		case 'S':
		case 's':
		System.out.println(" Sept");
		break;
		
		case 'O':
		case 'o':
		System.out.println("Oct");
		break;
		
		case 'N':
		case 'n':
		System.out.println(" Nov ");
		break;
		
		case 'D':
		case 'd':
		System.out.println(" Dec ");
		break;
		 
		 default :
		 System.out.println(" invalid month");
		 
	 }	 
    }
}