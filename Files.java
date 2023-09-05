
        import java.io.*;
        import java.util.*;
class Files{     
        

   public static void main(String args[])throws IOException,FileNotFoundException
   {     
        try{
            Scanner sc = new Scanner(System.in);
            String str,username,pass,email,fname,skills="",expr;
        username=sc.next();
        email=sc.next();
        fname=sc.next();
        expr=sc.next();
        pass=sc.next();
        // if(chkJava.isSelected())skills+="JAVA#";
        // if(chkCpp.isSelected())skills+="C++#";
        // if(chkPy.isSelected())skills+="PYTHON#";
            
            File myfile=new File("D:\\FileStructures\\fs1\\users.txt");
            FileReader fr=new FileReader(myfile);
            BufferedReader br=new BufferedReader(fr);
            File temp=new File("temp.txt");
            FileOutputStream fos=new FileOutputStream(temp,true);
            PrintWriter fw=new PrintWriter(fos);
            
            
            
     

            
            while((str=br.readLine())!=null)
            {
                
                String[] result = str.split("\\|");
                String uname=result[0];
                if(uname.equals(username)){
                String str1=username+"|"+pass+"|"+fname+"|"+email+"|"+skills+"|"+expr+"|";
                fw.println(str1);
                }
                else
                fw.println(str);

             }
            fw.close();
//             pw.close();
        br.close();
//        myfile.close();
fos.close();
fr.close();
        myfile.delete();
        temp.renameTo(myfile);
        System.out.println("File Modified");
            }
            finally{
                System.out.println();
            }
        }
}