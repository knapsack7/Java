import java.io.*;
class Words2
{
	int w;
	BufferedReader br;
	String text,text1="";
	public static void main(String args[])throwsIOException
	{
		Words2 ob=new Words2();
		ob.accept();
		ob.result();
	}
	Words2()
	{
		br=new BufferedReader(new InputStreamReader(System.in));
		text="";
		w=0;
	}
	public void accept()throwsIOException
	{
		System.out.println("enter the coded value");
		text=br.readLine().trim();
	}
	public void result()
	{
		int i,len;
		String ch;
		System.out.println("the encoded text="+text);
		do
		{
			if(text.length()<3)
				ch=text.substring(0,2);
			else
				ch=text.substring(0,3);
			System.out.println(ch);
			if(Integer.parseInt(ch)<=122 && Integer.parseInt(ch)>=97)
			{
				text1=text1+(char)(Integer.parseInt(ch));
				text=text.substring(3);
			}
			else
			{
				ch=text.substring(0,2);
				if(Integer.parseInt(ch)<=90 && Integer.parseInt(ch)>=65)
				{
					text1=text1+(char)(Integer.parseInt(ch));
					text=text.substring(2);
				}
				elseif(Integer.parseInt(ch)==32)
				{
					text1=text1+" ";
					text=text.substring(2);
				}
				else
					text=text.substring(2);
			}
		}while(text.length()>=2);
		text1=removeSpace(text1);
		System.out.println("SPACE removed="+text1);
		text1=changeCase(text1);
		System.out.println("coded value="+text1);
	}
	String removeSpace(String s)
	{
		int j,len,flag=0;
		String str="";
		s=s.trim();
		len=s.length();
		for(j=0;j<len;j++)
		{
			if(s.charAt(j)==' ' && flag==1)
			{
				str=str+s.charAt(j);
				flag=0;
			}
			elseif(s.charAt(j)!=' ')
			{
				flag=1;
				str=str+s.charAt(j)
			}}
		return str;
	}
	String changeCase(String s)
	{
		int j,len,flag=0;
		String str="";
		s=s.trim();
		len=s.length();
		for(j=0;j<len;j++)
		{
			if(s.charAt>=97 && j==0)
				str=str+(char)(s.charAt(j)-32);
			elseif(s.charAt(j)==48)
			{
				str=str+" ";
				flag=1;
			}
			elseif(s.charAt(j)<=90 && flag==0)
			str=str+(char)(s.charAt(j)+32);
			elseif(s.charAt(j)>=97 && flag==1)
			{
				str=str+(char)(s.charAt(j)-32);
				flag=0;
			}
			else
			{
				str=str+s.charAt(j);
			}}}
	return str;
}}
			