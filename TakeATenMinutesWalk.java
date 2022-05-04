package mypackage;

public class TakeATenMinutesWalk {

	public static boolean isValid(char[] walk) {
	    int ns=0,ew=0;
	    for(char dir : walk){
	      if(dir == 'n') ns++;
	      if(dir == 's') ns--;
	      if(dir == 'e') ew++;
	      if(dir == 'w') ew--;
	    }
	    if(ns==0 & ew==0 & walk.length==10) return true;
	    else return false;
	}

}
