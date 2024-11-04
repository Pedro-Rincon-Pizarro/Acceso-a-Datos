package boxeo2;

import boxeo.*;

public class Ring 
{
	private int ringgolpes;
	
	public Ring() 
        {
		ringgolpes = 0;
	}
	
	public int getRingGolpes()
        {
		return ringgolpes;
	}
	
	public synchronized void pegar() 
        {
		ringgolpes++;
		System.out.println("Ring golpes: "+ ringgolpes);
	}
}
