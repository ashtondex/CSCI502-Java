import java.util.Scanner; // To take user Input


class Polling
{
  public static void main(String[] args)
  {
    int k=0;
    int y=0;
    int l=0; // Various variable to count lowest and highest
    
    int x = 0;
    
    String topics[]={"Global Warming","Deforestation","Overpopulation","Water Scarcity","Air Pollution"}; // My string array for storing topics
    
    for (int i = 0; i< 5;i++)
    {
    System.out.println(topics[i]);
    }
    
    int survey[][] = new int[5][10]; // Array to store the answers
    
    Scanner sc = new Scanner(System.in);
   // for(k =0;k<10;k++){
    
    for (int i = 0; i <10;i++)
    {
      System.out.println(" User Number "+ (i+1));
      
      
      for (int j =0; j<5;j++)
      {
        System.out.println(" PLease enter the rating for "+topics[j]+"\t");
      
        survey[j][i] = sc.nextInt();  
    }
      
    }
    for (int i = 0; i <5;i++) // Loop through topics
    { 
      int count=0;
      System.out.print("/t "+topics[i]+" ");
      for (int j =0; j<10;j++) // Loop through ratings
      {
        count = count + survey[i][j]; // point total counter
        System.out.printf(survey[i][j]+" ");  
        
      }
      if(count>x){ // to get highest point total
       k = i;
       x =count;
      }
      if(count<x){ // to get lowest point total
        y = count;
        l = i;
      }
      
      System.out.print("Avg = "+ (count/10.00)); // Average of ratings33324
      System.out.println();
      sc.close();
    }
    System.out.println("The Highest rated topic is "+topics[k] + " and the point total is " +x);
    System.out.println("The Lowest rated topic is "+topics[l] + " and the point total is " +y);
}
}
