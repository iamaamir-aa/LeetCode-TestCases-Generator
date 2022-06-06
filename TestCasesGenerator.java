// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("No. of Values: ");
        int numberOfTestCase=s.nextInt();
        System.out.print("\n");
        System.out.print("Minimum Value: ");
        int min=s.nextInt();
        System.out.print("\n");
        System.out.print("Maximum Value: ");
        int max=s.nextInt();
        System.out.print("Distinct Values? 1 for yes / 0 for No: ");
         int distinct_flag=s.nextInt();
         System.out.print("Sorted Values? 0 for No / 1 for Ascending / 2 for Descending: ");
         int sorted_flag=s.nextInt();
        System.out.println("\n\n");
                     solution(numberOfTestCase,min,max,distinct_flag,sorted_flag);
    }
 public static void solution(int numberOfTestCase,int min,int max,int distinct_flag,int sorted_flag){
        if(distinct_flag==1){
            Set<Integer> hash_Set = new HashSet<Integer>();
            for(int i=0;i<numberOfTestCase;i++){
                if(hash_Set.contains((int)(Math.random()*(max-min+1)+min))){
                    --i;
                    continue;
                }else{
                    hash_Set.add((int)(Math.random()*(max-min+1)+min));
                }
            }List<Integer> list = new ArrayList<Integer>(hash_Set);
            if(sorted_flag==1){
                 Collections.sort(list);
            }else if(sorted_flag==2){
                Collections.sort(list,Collections.reverseOrder());
            }
             System.out.println("Input is: "+list);
        }else{
            
            ArrayList<Integer> list=new ArrayList<>();
            for(int i=0;i<numberOfTestCase;i++){
                         list.add((int)(Math.random()*(max-min+1)+min));
            }
            
            if(sorted_flag==1){
                 Collections.sort(list);
            }else if(sorted_flag==2){
                Collections.sort(list,Collections.reverseOrder());
            }
             System.out.println("Input is: "+list);
        }
        
    }
    
    
}
   