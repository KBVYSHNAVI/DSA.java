//printing the alternatives
/*import java.util.*;
public class Arrays{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(i % 2 == 0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}*/

//-->Iterative approach 
/*import java.util.*;
public class Arrays{
    static ArrayList<Integer>getAlternatives(int[] arr){
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<arr.length;i+=2){
            res.add(arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> res = getAlternatives(arr);
        for(int x : res){
            System.out.print(x+" ");
        }
    }
}*/

//leaders in an array
//input: arr[] = [16, 17, 4, 3, 5, 2]
//Output: [17 5 2]
//Explanation: 17 is greater than all the elements to its right i.e., [4, 3, 5, 2], therefore 17 is a leader. 5 is greater than all the elements to its right i.e., [2], therefore 5 is a leader. 2 has no element to its right, therefore 2 is a leader.
/*import java.util.*;
public class Arrays{
    static ArrayList<Integer> leaders(int[] arr){
        ArrayList<Integer>result = new ArrayList<>();
        int n = arr.length;
        for(int i=0;i<n;i++){
            int j;
            //check elements to the right
            for(j = i+1;j<n;j++){
                //if larger element is found
                if(arr[i]<arr[j]){
                    break;
                }
            }
                //if no larger element is found
                if(j==n)  {
                    result.add(arr[i]);
                }
        }
            return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer>result = leaders(arr);
        for(int res : result){
            System.out.print(res+" ");
        }
        System.out.println();

    }
}*/


//remove duplicates from sorted array
/*import java.util.*;
public class Arrays{
    static int removeduplicates(int[] arr){
        int n = arr.length;
        if(n<=1) return n;
        //start from the second index
        int idx = 1;
        for(int i=1;i<n;i++){
            if(arr[i] != arr[i-1]){
                arr[idx++] = arr[i];
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int ns = removeduplicates(arr);
        for(int i=0;i<ns;i++){
            System.out.println(arr[i]+" ");
        }
    }
}*/


//-->using hashset
/*import java.util.*;
public class Arrays{
    static int removeduplicates(int[] arr){
        //to track seen elements
        HashSet<Integer> s = new HashSet<>();
        //to maintain the new size of array
        int idx = 0;
        for(int i=0;i<arr.length;i++){
            if(!s.contains(arr[i])){
                s.add(arr[i]);
                arr[idx++] = arr[i];
            }
        }
        return idx;

    }
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int ns = removeduplicates(arr);
        for(int i=0;i<ns;i++){
            System.out.println(arr[i]+" ");
        }
    }
}*/

//Generate all sub arrays
/*import java.util.*;
public class Arrays{

 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++){ //i = starting point
            for(int j=i;j<n;j++){ //j = ending point
                for(int k=i;k<=j;k++){//k= process elements b/w i and j
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }
}*/

//reverse an array
/*import java.util.*;
public class Arrays{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]+" ");
        }

    }
}*/


//rotating an array
/*Rotations in the array is defined as the process of rearranging the elements in an array by shifting each element to a new position.
 This is mostly done by rotating the elements of the array clockwise or counterclockwise.*/
//left rotation 
/*import java.util.*;
public class Arrays{
    static void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static void leftrotate(int[] arr,int k){
        int n = arr.length;
        k = k % n;
        reverse(arr, 0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        leftrotate(arr,k);
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
}*/

//right rotation
/*import java.util.*;
public class Arrays{
    static void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static void rightrotate(int[] arr,int k){
        int n = arr.length;
        k = k % n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        } 
        int k = sc.nextInt();
        rightrotate(arr,k);
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}*/

//zeroes to end
/*import java.util.*;
public class Arrays{
    static void pushzerostoend(int[] arr){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0){
                arr[count++] = arr[i];
            }
        }
        while(count<arr.length){
            arr[count++] = 0;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        pushzerostoend(arr);
        for(int num : arr){
            System.out.println(num +" ");
        }
    }
}*/

//Minimum increment by k to make equal 
//you can increase any element by k. find the minimum no.of operations
//needed to make all elements equal 
/*import java.util.*;
public class Arrays{
    static int minoperations(int[] arr,int k){
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            max = Math.max(max,arr[i]);
        }
        int operations = 0;
        for(int i=0;i<arr.length;i++){
          // Cannot reach max using increments of k
            if ((max - arr[i]) % k != 0) {
                return -1;
            }
            operations+= (max-arr[i])/k;
        }
        return operations;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        System.out.println(minoperations(arr, k));
    }
}*/

//tribonacci 
/*import java.util.*;
public class Arrays{
    public static int tribonacci(int n){
        if(n==0) return 0;
        if(n==1 || n==2) return 1;
        return tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = tribonacci(n);
        System.out.println(res);
    }
}*/ //it shows tle

//another method
/*import java.util.*;

public class Arrays {

    public static int tribonacci(int n) {

        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;

        int a = 0;
        int b = 1;
        int c = 1;

        for (int i = 3; i <= n; i++) {

            int d = a + b + c;

            a = b;
            b = c;
            c = d;
        }

        return c;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(tribonacci(n));
    }
}*/

//minimum cost to make array size by 1 removing larger of pairs
/*Input: arr[]= [4 ,3 ,2 ]
Output: 4
Explanation: Choose (4, 2) so 4 is removed, 
new array = {2, 3}. Now choose (2, 3) so 3 is
 removed.  So total cost = 2 + 2 = 4.*/ 
 /*. Problem idea

You have an array.

You repeatedly:

Pick any two elements.
Compare them.
Remove the larger element.
Pay a cost equal to the larger element that you removed.
Continue until only one element remains. */

/*import java.util.*;
public class Arrays{
    public static int minimumcost(int[] arr){
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return sum - min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int res = minimumcost(arr);
        System.out.println(res);
    }
}*/


//Duplicate within k distance in an array
/*import java.util.*;
public class Arrays{
    static boolean checkduplicates(int[] arr,int k){
        int n = arr.length;
        for(int i=0;i<n;i++){//traverse every element
            //traverse k elements
            for(int c = 1;c<=k && (i+c)<n;c++){
                int j = i+c;

                //if we find one more occurence within k
                if(arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(checkduplicates(arr,k));
    }
}*/

/* Java program to Check if a given array contains duplicate 
   elements within k distance from each other 
import java.util.*;

class Main
{
    static boolean checkDuplicatesWithinK(int arr[], int k)
    {
        // Creates an empty hashset
        HashSet<Integer> set = new HashSet<>();

        // Traverse the input array
        for (int i=0; i<arr.length; i++)
        {
            // If already present n hash, then we found 
            // a duplicate within k distance
            if (set.contains(arr[i]))
               return true;

            // Add this item to hashset
            set.add(arr[i]);

            // Remove the k+1 distant item
            if (i >= k)
              set.remove(arr[i-k]);
        }
        return false;
    }

    // Driver method to test above method
    public static void main (String[] args)
    {
        int arr[] = {10, 5, 3, 4, 3, 5, 6};
        if (checkDuplicatesWithinK(arr, 3))
           System.out.println("Yes");
        else
           System.out.println("No");
    }
} */


//Rearrange array such that even positioned are greater 
//than odd
/*import java.util.*;
public class Array{
    static void rearrange(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(i %2 == 0){
                if(arr[i]<arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }else{
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        rearrange(arr);
        System.out.println(Arrays.toString(arr));
    }
}*/


//sum opf all subarrays
/*import java.util.*;
public class Array{
    static int sumofArrays(int[] arr){
        int total = 0;
        for(int i=0;i<arr.length;i++){
            int sum = 0;
            for(int j=i;j<arr.length;j++){
                sum += arr[j];
                total+=sum;
            }
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int res = sumofArrays(arr);
        System.out.println(res);

    }
}*/

//stock buy and sell - multiple transaction allowed
/*Input: prices[] = [100, 180, 260, 310, 40, 535, 695]
Output: 865
Explanation: Buy the stock on day 0 and sell it on day 3 = 310 - 100 = 210 and 
Buy the stock on day 4 and sell it on day 6 = 695 - 40 = 655 so the Maximum Profit  is = 210 + 655 = 865. */
/*import java.util.*;
public class Array{
    static int maxprofit(int[] arr){
        int res = 0;
        //keep on adding the difference between 
        //adjacent when prices a 
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                res+=arr[i] - arr[i-1];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int reso = maxprofit(arr);
        System.out.println(reso);
    }
}*/

//rotation count in a rotated sorted array
/*import java.util.*;
public class Arrays{
    static int findkrotation(int[] arr,int n){
        //we basically find index at minimum
        //element
        int min = arr[0],minIndex = 0;
        for(int i=0;i<n;i++){
            if(min>arr[i]){
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(findkrotation(arr,n));
    }
}*/

//another method
/*  
public class Arrays {

    static int findKRotation(int[] arr) {
        int low = 0, high = arr.length - 1 ;

        while (low <= high) {
            
            // If subarray is already sorted, 
            // smallest is at low
            if (arr[low] <= arr[high])
                return low ;

            int mid = (low + high) / 2 ;

            // Minimum is in the right half
            if (arr[mid] > arr[high])
                low = mid + 1 ;

            // Minimum is in the left half (could be mid)
            else
                high = mid ;
        }

        return low ;
    }

    public static void main(String[] args) {
        int[] arr = {15, 18, 2, 3, 6, 12};
        System.out.println(findKRotation(arr));
    }
}*/

//UNIQUE NUMBER
/*import java.util.*;
public class Arrays{
    static int findunique(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            int count = 0;
            for(int j=0;j<n;j++){
                //count the frequency of the element
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            //If the frequency of the elemnt is one 
            if(count == 1){
                return arr[i];
            } 
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();

        }
        System.out.println(findunique(arr));
    }
}*/

//missing number
/*import java.util.*;
public class Array{
    static int missingnum(int[] arr){
        int n = arr.length+1;
        //iterate from 1 to n
        //if the current number is present
        for(int i=1;i<=n;i++){
            boolean found = false;
            for(int j=0;j<n-1;j++){
                if(arr[j]==i){
                    found = true;
                    break;
                }
            }
                //if the current number is not present
            if(!found) return i;
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(missingnum(arr));
    }
}*/

//same missing number using formula 
/*import java.util.*;
public class Arrays{
    public static int missingnum(int[] arr){
        int n = arr.length +1;
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int expsum = n*(n+1)/2;
        return (int)(expsum - sum);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
    }
}*/

//missing and repeating here in output for given unsorted array
//we need to find both duplicate number and missing number
/*import java.util.*;
public class Array{
    static ArrayList<Integer>findtwoelements(int[] arr){
        int n = arr.length;
        //frequency array to count occurences
        int[] freq = new int[n+1];
        int repeating = -1;
        int missing = -1;

        //count frequency of each element
        for(int i=0;i<n;i++){
            freq[arr[i]]++;
        }
        //identify missing and repeating numbers
        for(int i=1;i<=n;i++){
            if(freq[i] == 0)missing = i;
            else if (freq[i] ==2)repeating = i;
        }
        ArrayList<Integer>result = new ArrayList<>();
        result.add(repeating);
        result.add(missing);
        return result;
    }
    public static void main(String[] args){
        Scanner  sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> ans = findtwoelements(arr);
        System.out.println(ans.get(0)+" "+ans.get(1));
    }
}*/

//using formula
/*import java.util.*;
public class Arrays{
    static ArrayList<Integer>findtwoelements(int[] arr){
        int n = arr.length;
        int s = (n*(n+1))/2;
        int ssq = (n*(n+1)*(2*n+1))/6;
        int missing = 0,repeating = 0;
        //substract actual values from expected sums
        for(int i=0;i<n;i++){
            s-=arr[i];
            ssq-=arr[i]*arr[i];
        }
        missing = (s+ssq/s)/2;
        repeating = missing - s;
        ArrayList<Integer>res = new ArrayList<>();
        res.add(repeating);
        res.add(missing);
        return res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> ans = findtwoelements(arr);
        System.out.println(ans.get(0) +" "+ans.get(1));//It prints the first and second elements of the ArrayList with a space between them.
    }
}*/

//only repeating from 1 to n-1

/*import java.util.*;
public class Arrays{
    static ArrayList<Integer>repetition(int[] arr){
        int n = arr.length;
        int[] freq = new int[n+1];
        int repeating = -1;
        for(int i=0;i<n;i++){
            freq[arr[i]]++;
        }
        for(int i=1;i<=n;i++){
            if(freq[i] == 2){
                repeating = i;
            }
        }
        ArrayList<Integer>result = new ArrayList<>();
        result.add(repeating);
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer>ans = repetition(arr);
        System.out.println(ans.get(0));//gets the element at index 0 from ans = ans.get(0)
    }
}*/


//sorted subsequence of size 3
//here they should appear in the same sequence of array
/*import java.util.*;
public class Array{
    static ArrayList<Integer>subsequence3(int[] arr){
        int n = arr.length;
        ArrayList<Integer>result = new ArrayList<>();
        if(n<3){
            return result;
        }
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        int prevfirst= Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int x = arr[i];
            //find the smallest element
            if(x<=first){
                first = x;
            }
            else if(x<=second){
                second = x;
                prevfirst = first;
            }
            //x is greater than both first and second
            else{
                result.add(prevfirst);
                result.add(second);
                result.add(x);

                return result;

            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer>ans = subsequence3(arr);
        System.out.println(ans.get(0)+" "+ans.get(1)+" "+ans.get(2));
    }
}*/


//Maximum subarray sum using kadanes algorithm 
/*import java.util.*;
public class Arrays{
    static int maxsubarraysum(int[] arr){
        int res = arr[0];
        //outer loop for starting point for subarray
        for(int i=0;i<arr.length;i++){
            int currsum = 0;
            for(int j=i;j<arr.length;j++){
                currsum = currsum +arr[j];
                //update res if currsum is greater than res
                res = Math.max(res,currsum);
            }
        }
        return res;
    }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    System.out.println(maxsubarraysum(arr));
  }  
} */

//Equillibrium index means it is :an array is an index such that
//sum of all elements at lower indices equal to sum of all elements 
//at higher indices 

/*import java.util.*;
public class Arrays{
    static int findequillibrium(int[] arr){
        //check for indexes one by one until 
        ////an equillibrium index is found
        for(int i=0;i<arr.length;++i){
            int leftsum = 0;
            for(int j = 0;j<i;j++){
                leftsum += arr[j];
            }
            //right sum 
            int rightsum = 0;
            for(int j=i+1;j<arr.length;j++){
                rightsum+=arr[j];
            }
            //check condition 
            if(leftsum == rightsum) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(findequillibrium(arr));
    }
}*/

//split array into three equal sum segments 
//we need to find whether an array can be divided into 3
//contiguous parts,where all 3 parts have same sum
/*import java.util.*;
public class Arrays{
    static boolean splitthreeparts(int[] arr){
        int totalsum = 0;
        for(int x : arr){
            totalsum+=x;
        }
        if(totalsum %3 != 0){
            return false;
        }
        int target = totalsum/3;
        int sum = 0;
        int parts = 0;
        for(int x: arr){
            sum+=x;
            if(sum == target){
                parts++;
                sum = 0;
            }
        }
        return parts == 3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(splitthreeparts(arr));
    }
}*/

//binary search
/*import java.util.*;
public class Arrays{
    static int binarysearch(int[] arr,int x){
        int low = 0,high = arr.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            //check if x is present at mid
            if(arr[mid]==x){
                return mid;
            }

            //if x is greater,ignore left half
            if(arr[mid]<x){
                low = mid+1;
            }
            //if x is smaller ignore right half
            else{
                high = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int result = binarysearch(arr,x);
        if(result == -1){
            System.out.println("Element is not present in array");
        }else{
            System.out.println("Element is present at "+" index "+result);
        }
    }
}
*/


//square root of an integer
/*import java.util.*;
public class Array{
    static int floorsqrt(int n){
        //start iteration from 1 until the 
        //square of a number exceeds n 
        int res = -1;
        while(res * res <=n){
            res++;
        }
        //return the largest number whose square is less than 
        //or equal to n
        return res-1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println(floorsqrt(n));
    }
}*/

//first and last occurences  in sorted
/*import java.util.*;
public class Arrays{
    static ArrayList<Integer>find(int[] arr,int x){
        int n = arr.length;
        //Intialize first and last index
        int first = -1,last = -1;
        for(int i=0;i<n;i++){
            //if x is different,continue
            if(x != arr[i]) continue;

            //if first occurence found
            if(first == -1) first = i;

            //update the last occurence
            last = i;
        }
        ArrayList<Integer>res = new ArrayList<>();
        res.add(first);
        res.add(last);
        return res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        ArrayList<Integer>res = find(arr,x);
        System.out.println(res.get(0)+" "+res.get(1));
    }
} 
*/


//count 1's in a binary sorted array
/*import java.util.*;
public class Arrays{
    static int countones(int[] arr){
        int n = arr.length;
        int count = 0;
        for(int i=0;i<n;i++){
            if(arr[i]==1)count++;
            else break;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(countones(arr));

    }
}
*/

//unbounded binary search : but sometimes we dont know the size
// or range of the search space 
//Minimum in a sorted array
/*import java.util.*;
public class Arrays{
    static int findmin(int[] arr){
        int res = arr[0];
        //traverse over arr[] to find minimum element
        for(int i=1;i<arr.length;i++){
            res = Math.min(res,arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(findmin(arr));
    }
}
*/
//search in a rotated sorted array
/*import java.util.*;
public class Arrays{
    static int search(int[] arr,int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        int res = search(arr,key);
        System.out.println(res);
    }
}
*/

//upper bound and lower bound
//Lower Bound = first index where arr[index]>=k
//Upper Bound = first index where arr[index]>k

/*import java.util.*;
public class Arrays{
    static int lowerbound(int[] arr,int k){
        int low = 0;
        int high = arr.length;
        while(low<high){
            int mid = low+(high-low)/2;
            if(arr[mid]>=k){
                high = mid;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
    static int upperbound(int[] arr,int k){
        int low = 0;
        int high = arr.length-1;
        while(low<high){
            int mid = low+(high-low)/2;
            if(arr[mid]>k){
                high = mid;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int lower = lowerbound(arr,k);
        int higher = upperbound(arr,k);
        System.out.println("Lower Bound : "+lower);
        System.out.println("Upper Bound : "+higher);

    }
}
*/

//peak element
/*import java.util.*;
public class Arrays{
    static int findpeak(int[] arr){
        int low = 0;
        int high = arr.length-1;
        while(low<high){
            int mid = low+(high-low)/2;
            if(arr[mid]<arr[mid+1]){
                //peak is on right
                low = mid+1;
            }else{
                //peak is at mid or on the left
                high = mid;
            }
        }
        return low;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int peak = findpeak(arr);
        System.out.println("Peak Index: "+peak);
        System.out.println("Peak Element: "+arr[peak]);

    }
}
*/


//find peak element 2d array/matrix
/*import java.util.*;

public class Main {

    static int[] findPeak(int[][] mat) {

        int rows = mat.length;
        int cols = mat[0].length;

        int low = 0;
        int high = cols - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            // Find maximum element in middle column
            int maxRow = 0;

            for (int i = 1; i < rows; i++) {
                if (mat[i][mid] > mat[maxRow][mid]) {
                    maxRow = i;
                }
            }

            int left = (mid - 1 >= 0)
                    ? mat[maxRow][mid - 1]
                    : -1;

            int right = (mid + 1 < cols)
                    ? mat[maxRow][mid + 1]
                    : -1;

            // Check if current element is a peak
            if (mat[maxRow][mid] > left &&
                mat[maxRow][mid] > right) {

                return new int[]{maxRow, mid};
            }

            // Move right
            if (right > mat[maxRow][mid]) {
                low = mid + 1;
            }

            // Move left
            else {
                high = mid - 1;
            }
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] mat = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int[] ans = findPeak(mat);

        System.out.println("Peak Row: " + ans[0]);
        System.out.println("Peak Column: " + ans[1]);
        System.out.println("Peak Element: " + mat[ans[0]][ans[1]]);

        sc.close();
    }
}*/


//basic binary search 
/*class GFG {
  
    static int binarySearch(int arr[], int x) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if x is present at mid
            if (arr[mid] == x)
                return mid;

            // If x greater, ignore left half
            if (arr[mid] < x)
                low = mid + 1;

            // If x is smaller, ignore right half
            else
                high = mid - 1;
        }

        // If we reach here, then element was
        // not present
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = { 2, 3, 4, 10, 40 };
        int x = 10;
        int result = binarySearch(arr, x);
        if (result == -1)
            System.out.println(
                "Element is not present in array");
        else
            System.out.println("Element is present at "
                           + "index " + result);
    }
} */

//sorting
/*import java.util.*;
public class Array{
    static void selectionsort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            //assume current position holds the minimum element
            int min_index = i;
            //iterate throught the unsorted position 
            //to find the acual one
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_index]){
                    //update min indes if a smaller
                    //is found
                    min_index = j;
                }
            }
            //move  minimum element to its correct position 
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }
    static void printArray(int[] arr){
        for(int val:arr){
            System.out.println(val+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array: ");
        printArray(arr);
        selectionsort(arr);
        System.out.println("Sorted Array: ");
        printArray(arr);

    }
}*/

/*import java.util.*;

public class Main {

    static void selectionSort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;

            // Find minimum element
            for (int j = i + 1; j < n; j++) {

                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        selectionSort(arr);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
} */


//insertion sort 
/*import java.util.*;
public class Arrays{
    static void insertionsort(int[] arr){
        int n = arr.length;
        for(int i=1;i<n;++i){
            int key = arr[i];
            int j = i-1;
            //move elements of arr[0 to i-1] that are greater than 
            //key,to one position ahead of their current position 
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        insertionsort(arr);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
}*/


//quicksort
/*import java.util.*;
public class Arrays{
    static int partition(int[] arr,int low,int high){
        //choose the pivot
        int pivot = arr[high];
        //index of smaller element and indicates
        //the right position of pivot found so far
        int i = low-1;
        //traverse arr[low...high] and move all smaller
        //elements to the left side.Elements from low to 
        //i are smaller after every iteration

        for(int j = low;j<=high-1;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        //move pivot after smaller elements and 
        //return its position
        swap(arr,i+1,high);
        return i+1;
    }
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void quicksort(int[] arr,int low,int high){
        if(low<high){
            //pi is the partition return indes of pivot
            int pi = partition(arr,low,high);
            //recursion calls for smaller elements
            //and greater or equal elements
            quicksort(arr,low,pi-1);
            quicksort(arr,pi+1,high);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        quicksort(arr,0,n-1);
        for(int val : arr){
            System.out.println(val+" ");
        }
    }
}*/

//Two-pointer technique
//two sum 
/* 
import java.util.*;
public class Arrays{
    static boolean twosum(int[] arr,int target){
        //sort the array
        int left = 0,right = arr.length-1;
        while(left<right){//iterate while left pointer is less than right
            int sum = arr[left]+arr[right];
            //check if sum matches the target
            if(sum == target)return true;
            else if(sum<target) left++;//move left to the pointer
            else right--;//move right pointer to the left
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        if(twosum(arr,target)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}*/

//find whether two numbers in a sorted array add up to a target
/*import java.util.*;
public class Arrays{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int left = 0;
        int right = arr.length-1;
        while (left < right) {

            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.println("Pair found: "
                        + arr[left] + " + " + arr[right]);
                return;
            }

            else if (sum < target) {
                left++;
            }

            else {
                right--;
            }
        }

        System.out.println("Pair not found");
    }
}*/


//remove occurences 
//the extra elements should be removed
/*Input: arr[] = [3, 2, 2, 3], ele = 3
Output: 2
Explanation: The answer is 2 because there are 2 
elements which are not equal to 3 and arr[] will
 be modified such that the first 2 elements contain the elements 
 which are not equal to 3 and remaining elements can contain any element. So, modified arr[] = [2, 2, _, _] */

/*import java.util.*;
public class Arrays{
    static int removeelement(int[] arr,int val){
        int slow = 0;
        for(int fast = 0;fast<arr.length;fast++){
            if(arr[fast] != val ){
                arr[slow] = arr[fast];
                slow++;
            }
        }
        return slow;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int val = sc.nextInt();
        int k = removeelement(arr,val);
        for(int i=0;i<k;i++){
            System.out.println(arr[i]+" ");
        }
    }
}*/

//Reverse a string preserving spaces 

//giving a string s reverse the string without alternating 
//the position of the spaces 
/*import java.util.*;
public class Arrays{
    static String reverse(String s){
        char[] arr = s.toCharArray();

        int left = 0;
        int right = arr.length - 1;
        while(left<right){
            //if left has a space,skip it
            if(arr[left] == ' '){
                left++;
            }
            //if right has a space,skip it
            if(arr[right]==' '){
                right--;
            }
            //both are characters
            else{
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;

            }
        }
        return new String(arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reverse(s));
    }
}
*/

//sort 0's 1's and 2's
/*import java.util.Arrays;

class GFG {
    static void sort012(int[] arr) {
        // standard sorting function
        Arrays.sort(arr);
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 1, 2};
        sort012(arr);

        for (int num : arr)
            System.out.print(num + " ");
    }
} */

//two-sum
/*import java.util.*;

public class Main {

    static boolean twosum(int[] arr, int target) {

        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int sum = arr[left] + arr[right];

            if (sum == target) {
                return true;
            }
            else if (sum < target) {
                left++;
            }
            else {
                right--;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        if (twosum(arr, target)) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}*/


//pair sum in a sorted and rotated array 
/*import java.util.*;
public class Arrays{
    static boolean pairsum(int[] arr,int target){
        int n = arr.length;
        int i;
        for(i=0;i<n;i++){
            if(arr[i]>arr[i+1]){
                break;
            }
        }
        //i= index of largest element
        int right = i;
        //Smallest element is next to largest
        int left = (i+1)%n;
        while(left != right){
            int sum = arr[left]+arr[right];
            if(sum == target){
                return true;
            }
            else if(sum<target){
                left = (left+1)%n;
            }else{
                right = (right-1+n)%n;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]  = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(pairsum(arr,target));
    }
}*/

/*Sum Pair closest to target
Given an array arr[] and a number target, find a pair of elements (a, b) in arr[], where a ≤ b whose sum is closest to target.

Note: Return the pair in sorted order and if there are multiple such pairs return the pair with maximum absolute difference. If no such pair exists return an empty array.

Examples:

Input: arr[] = [10, 30, 20, 5], target = 25
Output: [5, 20]
Explanation: The pair (5, 20) has sum 25, which is exactly equal to the target. Since its sum is closest to the target, the answer is [5, 20]. */
/*import java.util.*;
public class Array{
    static int[] closestpair(int[] arr,int target){
        if(arr.length<2){
            return new int[0];//if the given array is less than 2 it returns empty array
        }
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length-1;
        int besta = 0;
        int bestb = 0;
        int minDiff = Integer.MAX_VALUE;
        while(left<right){
            int sum = arr[left]+arr[right];
            int diff = Math.abs(sum - target);
            //found closer pair
            if(diff<minDiff){
                minDiff = diff;
                besta = arr[left];
                bestb = arr[right];
            }
            //same closeness :choose minimum absolute difference
            else if(diff == minDiff){
                int cd = Math.abs(arr[left]-arr[right]);
                int bd = Math.abs(besta-bestb);
                if(cd>bd){
                    besta = arr[left];
                    bestb = arr[right];
                }
            }
            if(sum == target){
                break;
            }
            //Need bigger sum 
            if(sum<target ){
                left++;
            }else{
                right--;
            }
        }
        return new int[]{besta,bestb};
    }
    public static void main(String[] args) {
        int[] arr = {10, 30, 20, 5};

        int target = 25;

        int[] result = closestpair(arr, target);

        System.out.println(Arrays.toString(result));
    }
}*/


//closest pair form 2 sorted arrays 
/*class GfG {

    // Function to find the closest pair
    static int[] findClosestPair(int[] a, int[] b, int x) {
        int l = 0, r = b.length - 1;
        int diff = Integer.MAX_VALUE;
        int[] result = new int[2];

        // Two pointer traversal
        while (l < a.length && r >= 0) {
            int sum = a[l] + b[r];
            int currDiff = Math.abs(sum - x);

            // Update result if better pair found
            if (currDiff < diff) {
                diff = currDiff;
                result[0] = a[l];
                result[1] = b[r];
            }

            // Move pointers
            if (sum > x)
                r--;
            else
                l++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 4, 5, 7};
        int[] b = {10, 20, 30, 40};
        int x = 38;

        int[] ans = findClosestPair(a, b, x);
        System.out.println("[" + ans[0] + ", " + ans[1] + "]");
    }
} */


//smallest subarray with sum greater than a given value 
/*public class Array{
    static void smallestsubarray(int[] arr,int x){
        int n = arr.length;
        int left = 0;
        int sum = 0;

        int minlength = Integer.MAX_VALUE;
        int start = -1;
        int end = -1;

        for(int right = 0;right<n;right++){
            sum += arr[right];//add current elemnt
            //shrink window while sum is greater than x
            while(sum>x){
                int currlength = right-left+1;
                if(currlength<minlength){
                    minlength = currlength;
                    start = left;
                    end = right;
                }
                sum-=arr[left];
                left++;
            }
        }
        //no valid subarray
        if(minlength == Integer.MAX_VALUE){
            System.out.println("Length = 0");
            System.out.println("Subarray = []");
        }else{
            System.out.println("Length = "+minlength);
            System.out.println("Subarray = [");
            for(int i=start;i<=end;i++){
                System.out.println(arr[i]);
                if(i<end){
                    System.out.println(",");
                }
            }
            System.out.println("]");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 0, 19};
        int x = 51;
        smallestsubarray(arr,x);
    }
}*/

//palindrome sentence
/*import java.util.*;
public class Array{
static boolean ispalinsent(String s){
    //create a only string taht consists only alphanumeric strings
    StringBuilder s1 = new StringBuilder();
    for(char ch : s.toCharArray()){
        if(Character.isLetterOrDigit(ch)){
            s1.append(Character.toLowerCase(ch));
        }
    }
    //find reverse of this new string
    StringBuilder rev = new StringBuilder(s1.toString());
    rev.reverse();
    //compare string and its reverse
    return s1.toString().equals(rev.toString());
}
public static void main(String[] args) {
    String s = "Too hot to hoot";
    System.out.print(ispalinsent(s) ? "true" :"false");
}
}*/


//intersection of two arrays
/*import java.util.ArrayList;
public class Array{
    static ArrayList<Integer>intersection(int[] a,int[] b){
        ArrayList<Integer>res = new ArrayList<>();
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i] == b[j]){
                    res.add(a[i]);
                    break;
                }
            }
        }
        return res;
    }
    public static void main(String[] args){
        int[] a= {5,6,2,1,4};
        int[] b = {7,9,4,2};
        ArrayList<Integer>res = intersection(a,b);
        for(int num:res){
            System.out.print(num+" ");
        }
    }
}*/


//count pairs with absolute difference equal to k and i want to print
//the list also 
/*import java.util.*;
public class Array{
    static int countpairs(int[] arr,int k){
        int count = 0;
        System.out.println("Pairs: ");
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int diff = Math.abs(arr[i]-arr[j]);
                if(diff == k){
                    System.out.println("["+arr[i]+","+arr[j]+"]");
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] arr = {1,5,3,4,2};
        int k = 2;
        int count = countpairs(arr,k);
        System.out.println("Count = "+count);
    }
}*/

//Tiplet sum in an array 
/*import java.util.*;
public class Array{
    static void triplesum(int[] arr,int target){
        Arrays.sort(arr);
        int count = 0;
        System.out.println("Triples: ");
        for(int i=0;i<arr.length-2;i++){
            int left  = i+1;
            int right = arr.length-1;
            while(left<right){
                int sum = arr[i]+arr[left]+arr[right];
                if(sum == target){
                    System.out.println("["+arr[i]+","+arr[left]+","+arr[right]+"]");
                count++;
                left++;
                right--;
                }
                else if(sum<target){
                    left++;
                }else{
                    right--;
                }
            }
        }
        System.out.println("Count = "+count);
    }
    public static void main(String[] args) {
        int[] arr = {1,4,45,6,10,8};
        int target = 22;
        triplesum(arr,target);
    }
}
*/


//kth of two sorted arrays 
/*import java.util.*;

public class Main {

    static int kthElement(int[] a, int[] b, int k) {

        int i = 0;
        int j = 0;
        int count = 0;

        while (i < a.length && j < b.length) {

            if (a[i] < b[j]) {
                count++;

                if (count == k)
                    return a[i];

                i++;
            } 
            else {
                count++;

                if (count == k)
                    return b[j];

                j++;
            }
        }

        // If array a still has elements
        while (i < a.length) {
            count++;

            if (count == k)
                return a[i];

            i++;
        }

        // If array b still has elements
        while (j < b.length) {
            count++;

            if (count == k)
                return b[j];

            j++;
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] a = {2, 3, 6, 7, 9};
        int[] b = {1, 4, 8, 10};

        int k = 5;

        System.out.println(kthElement(a, b, k));
    }
}*/


//count subarrays with max values in given range
/*Input: arr[] = [1, 2, 3, 4, 5], l = 2, r = 5
Output: 11
Explanation: Valid subarrays are: [2], [3], [4], [5], [1,2], [2,3], [3,4], [4,5], [1,2,3], [2,3,4], [3,4,5], [1,2,3,4], [2,3,4,5], [1,2,3,4,5]. */
/*// Java program to count subarrays where  
// the maximum element is at least l and  
// at most r using Two Pointer
import java.util.*;

class GfG {
    
    static int countSubarrays(int[] arr, int l, int r) {
        
        int n = arr.length;
        int count = 0;
        int lastInvalid = -1, lastValid = -1;

        // Traverse the array once
        for (int i = 0; i < n; i++) {
            
            // If arr[i] is out of range,  
            // reset lastValid
            if (arr[i] > r) {
                lastInvalid = i;
                lastValid = -1;
            }

            // If arr[i] is within range,  
            // update lastValid
            if (arr[i] >= l && arr[i] <= r) {
                lastValid = i;
            }

            // Add valid subarrays ending at index i
            if (lastValid != -1) {
                count += lastValid - lastInvalid;
            }
        }

        return count;
    }

    // Driver Code
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 5};
        int l = 2, r = 5;

        System.out.println(countSubarrays(arr, l, r));
    }
} */

//long substring with k unique characters
/*public class Main {

    static int longestSubstring(String s, int k) {

        int left = 0;
        int maxLength = 0;
        String unique = "";

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            // Add character if it is not already present
            if (unique.indexOf(ch) == -1) {
                unique += ch;
            }

            // If unique characters are more than k
            while (unique.length() > k) {

                char leftChar = s.charAt(left);

                // Move left
                left++;

                // Rebuild unique characters
                unique = "";

                for (int i = left; i <= right; i++) {

                    if (unique.indexOf(s.charAt(i)) == -1) {
                        unique += s.charAt(i);
                    }
                }
            }

            // Exactly k unique characters
            if (unique.length() == k) {

                int length = right - left + 1;

                maxLength = Math.max(maxLength, length);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {

        String s = "aabacbebebe";
        int k = 3;

        System.out.println(longestSubstring(s, k));
    }
} */


//remove repeating chars and reverse string until no repetition
/*import java.util.*;
public class Array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String result = "";
        //remove repeating characters
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(result.indexOf(ch) == -1){
                result+=ch;
            }
        }
        String reverse = "";
        for(int i=result.length()-1;i>=0;i--){
            reverse+=result.charAt(i);
        }
        System.out.println(reverse);
    }
}*/

//prefix sum
/*import java.util.*;
public class Array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] prefix = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        //prefix sum 
        prefix[0] = arr[0];
        for(int i=1;i<n;i++){
            prefix[i] = prefix[i-1]+arr[i];
        }
        System.out.println("prefix sum array");
        for(int i=0;i<n;i++){
            System.out.print(prefix[i]+" ");
        }
    }
} */


//sliding window :
//max sum in an array
/*import java.util.*;
public class Array{
    static int maxsum(int[] arr,int k){
        //calculate first window
        int windowsum = 0;//stores the sum of current window
        for(int i=0;i<k;i++){
            windowsum+=arr[i];
        }
        int maxsum = windowsum;
        //slide the window
        for(int i=k;i<arr.length;i++){
            //remove old element
            //add new element
            windowsum+=arr[i]-arr[i-k];//adds the new element and remove the old element
            //update maximum
            maxsum = Math.max(maxsum,windowsum);
        }
        return maxsum;
    }
    public static void main(String[] args){
        int[] arr = {5,2,-1,0,3};
        int k = 3;
        System.out.println(maxsum(arr,k));
    }
}
*/

/*import java.util.*;
public class Array{
    static int maxsum(int[] arr,int k){
        int windowsum = 0;
        for(int i=0;i<k;i++){
            windowsum+=arr[i];
        }
        int maxsum = windowsum;
        //starting index of maximum number
        int maxstart = 0;
        //slide the window
        for(int i=k;i<arr.length;i++){
            windowsum+=arr[i]-arr[i-k];
            if(windowsum>maxsum){
                maxsum = windowsum;
                maxstart = i-k+1;
            }
        }
        System.out.println("Maximum sun = "+maxsum);
        // Print maximum-sum subarray
        System.out.print("Maximum Subarray = [");

        for (int i = maxstart; i < maxstart + k; i++) {
            System.out.print(arr[i]);

            if (i < maxstart + k - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        return maxsum;
    }
    public static void main(String[] args) {
        int[] arr = {5,2,-1,0,3};
        int k = 3;
        maxsum(arr,k);
    }
}*/


