public class Minimum{
 public static void main(String[]args){
    int min=Integer.MAX_VALUE;
    int[]a={10,2,5,1,67};
int size=a.length;
    for(int i=0; i<a.length; i++){
    if(a[i]<min){
        min=a[i];
    }
}
    System.out.println("Minimum number is :" +min);
 } 
}
