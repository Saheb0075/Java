

import java.io.*;
class FileHandeled
{
	public void createFile()throws FileNotFoundException,IOException
	{
		File f1 = new File("C:\\FileHandling\\Niit.txt");
		
		if(f1.createNewFile())
		{
			System.out.println("File created sucessfully...");
		}
		else
		{
			System.out.println("File already exists...");
		}
	}
	public void fileInfo()throws FileNotFoundException,IOException
	{
		File f1 = new File("C:\\File Handling\\Niit.txt");
		if(f1.exists())
		{
			System.out.println("File Name:"+f1.getName());
			System.out.println("File Path:"+f1.getAbsolutePath());
			System.out.println("File Size:"+f1.length());
			System.out.println("File Readble:"+f1.canRead());
			System.out.println("File Writtble:"+f1.canWrite());
		}
		else
		{
			System.out.println("File Not Found...");
		}
	}
	public void fileWrite()throws FileNotFoundException,IOException
	{
		FileWriter fw1 = new FileWriter("C:\\File Handling\\Text.txt");
		fw1.write("NIIT Limated is an Indian multinational skills and talent development corporation headquarted in Gurgoan,India..");
		//fw1.write("Jay Mata Di...");
		fw1.flush();
		fw1.close();
		System.out.println("File Write Sucessfully");

	} 
	 public void fileRead()throws FileNotFoundException,IOException
	 {
		 FileReader fd1 = new FileReader("C:\\File Handling\\Niit.txt");
		 int i;
		 while((i= fd1.read())!=-1)
		 {
			 System.out.println((char)i);
		 }
		 fd1.close();
		 System.out.println("\nFile read sucessfully...");
	 }
	 public void bufferedFileWrite()throws FileNotFoundException,IOException
	 {
		 FileWriter fw1 = new FileWriter("C:\\File Handling\\Niit.txt");
		 BufferedWriter bw = new BufferedWriter(fw1);
		 bw.write("NIIT was established in 1981 by Rajendra S.Pawar and Vijay K.Thadani,gradutes from IIT DElhi,with one millions rupees.");
		 bw.flush();
		 bw.close();
		 System.out.println("File write sucessfully...");
	 }
	 public void bufferedFileRead()throws FileNotFoundException,IOException
	 {
		 FileReader fd1 = new FileReader("C:\\File Handling\\Niit.txt");
		 BufferedReader br = new BufferedReader(fd1);
		 String i;
		 while((i = br.readLine())!= null)
		 {
			 System.out.println(i);
		 }
		 br.close();
		 System.out.println("\nFile read sucessfully...");
	 }
	 public void renameFile()throws FileNotFoundException,IOException
	 {
		 File f1 = new File("C:\\File Handling\\Niit.txt");
		 File f2 = new File("C:\\File Handling\\super.txt");
		 System.out.println("f1.rename to(f2)");
		 System.out.println("File rename sucessfully...");
	 }
	 public void copyFile()throws FileNotFoundException,IOException
	 {
		 FileInputStream fis = new FileInputStream("C:\\File Handling\\Super.txt");
		 FileOutputStream fos = new FileOutputStream("C:\\File Handling\\fun.txt");
		 int i;
		 while((i=fis.read())!=-1)
		 {
			 fos.write((char)i);
		 }
		 fis.close();
		 fos.close();
		 System.out.println("File copy sucessfully...");
	 }
	 public void appenedFile()throws FileNotFoundException,IOException
	 {
		 FileWriter fw1 = new FileWriter("C:\\File Handling\\Text.txt,true");
		 fw1.write("\nIn 2004,NIIT sectioned off its software business into an independent organization called NIIT Technologies LTD.(Source:NASSCOM's 2013-14 Ranking of top 20 IT services companies).");
		 fw1.flush();
		 fw1.close();
		 System.out.println("File Write(appened)sucessfully...");
	 }
	 public void byteFileWrite()throws FileNotFoundException,IOException
	 {
		 FileOutputStream fos = new FileOutputStream("C:\\File Handling\\Super.txt");
		 String data=("The 2022 Indian Premier League,also known as IPL 15 or,for sponsporship reasons Tata IPL 2022 is the fifteenth season of the Indian Premier League,a professional Twenty20 cricket league established by the Board of Control for Cricket in India(BCCI)in 2007");
		 byte a[] =data.getBytes();
		 fos.write(a);
		 fos.close();
		 System.out.println("File Write sucessfully...");
	 }
	 public void byteFileRead()throws FileNotFoundException,IOException
	 {
		 FileInputStream fis = new FileInputStream("C:\\File Handling\\Super.txt");
		 int i;
		 while((i=fis.read())!=-1)
		 {
			 System.out.println((char)i);
		 }
		 fis.close();
		 System.out.println("\nFile read sucessfully...");
	 }
	 public void deleteFile()throws FileNotFoundException,IOException
	 {
		 File f1 = new File("C:\\File Handling\\Fun.txt");
		 f1.delete();
		 System.out.println("File delete sucessfully...");
	 }
}
class FileHandling6
{
	public static void main(String[]args)throws ArithmeticException
	{
		FileHandeled f1 = new FileHandeled();
		f1.createFile();
		//f1.fileInfo();
		//f1.fileWrite();
		//f1.fileRead();
		//f1.bufferedFileWrite();
		//f1.bufferedFileRead();
		//f1.renameFile();
		//f1.copyFile();
		//f1.appenedFile();
		//f1.byteFileWrite();
		//f1.bytefileRead();
		//f1.deleteFile();
	}
	
}