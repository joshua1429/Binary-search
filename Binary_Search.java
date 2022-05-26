import java.util.Scanner; import java.util.Arrays;


public class Binary_Search {
public static void main(String args[]) { 
Scanner sc = new Scanner(System.in);
int arr_val[] = {11,12,13,14,15,16,17,18,19,20};
System.out.println("The Array ->"+Arrays.toString(arr_val)); 
System.out.println("Key:");
int key = sc.nextInt(); 
int first = 0;
int last = arr_val.length - 1; int mid_val = (first + last) / 2;

while (first <= last) {
if (arr_val[mid_val] < key) { first = mid_val + 1;
} 
else if (arr_val[mid_val] == key) { 
System.out.println("Element is found at index: " + mid_val); break;
}
else {
last = mid_val - 1;
}
mid_val = (first + last) / 2;

}
if (first > last) {System.out.println("Element is not found!");
}
}
}
