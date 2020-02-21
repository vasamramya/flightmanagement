package com.capgi;

public class CharacterArray {

	public static void characterCount() {
		String str="RAMYA";
		
		int arr[]=new int[256];
		int n=str.length();
		for(int i=0;i<n;i++)
		{
			arr[str.charAt(i)]++;
			
		}
		char ch[]= new char[n];
		for(int i=0;i<n;i++)
		{
			ch[i]=str.charAt(i);
			int count=0;
		for(int j=0;j<=i;j++)
		{
			if(str.charAt(i)==ch[j])
			{
				count++;
			}
			
		}
		if(count==1)
			System.out.println(str.charAt(i)+" "+arr[str.charAt(i)]);
			
		}
		
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 CharacterArray.characterCount();

	}

}
