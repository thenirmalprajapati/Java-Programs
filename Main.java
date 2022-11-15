public class Main {
  
  public static int remove(int a[], int n){

    int[] temp = new int[n];
    int j = 0;
  
    for(int i = 0; i < n - 1; i++){
      if(a[i] != a[i + 1]){
        temp[j++] = a[i];
      }
    }
  
    temp[j++] = a[n - 1];

    for(int i = 0; i < j; i++){
      a[i] = temp[i];
    }
  
    return j;
  
  }
  
  public static void main(String[] args){

    int a[] = {1, 1, 2, 3, 3, 4, 4};
    int n = a.length;
  
    n = remove(a, n);

    for(int i = 0; i < n; i++){
      System.out.print(a[i] + " ");
    }

  }

}
