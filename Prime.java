
public class Prime 
{
public boolean validate(final Integer primeNumber)
{
	for(int i=1;i<(primeNumber/2);i++)
	{
		if(primeNumber%i==0)
		{
			return false;
		}
}
return true;
}
}