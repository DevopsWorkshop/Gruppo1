package mypackage;

public class Factor {
	
	public static int factor( int valore )   
    {
        int tot=1;
    	for ( int i=1;i < valore+1 ;i++)
    	{
    		tot=tot *i;
    	}
    	return tot;
    }

}
