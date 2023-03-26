class PFormatString
{
	public static void main(String[] args)
	{
		String[] s = new String[3];
		s[0] = "Harshal";
		s[1] = "Nalkar";
		s[2] = "pune";

		System.out.println(s[0]+" "+s[1]+", "+ s[2]);
		
		// second way
		String[] s2 = {"Harshal","Nalkar","pune"};
		System.out.println(s2[0]+" "+s2[1]+", "+ s2[2]);

		//third way
		String[] s3 = {"Harshal","Nalkar",",","Kasoda"};
		for (int i = 0; i < s3.length; i++)
		{
			System.out.print(s3[i]+" ");
		}
	}
}