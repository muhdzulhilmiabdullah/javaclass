public class ClassOne {
public static void main(String[] args) {
int a = 30 / 3; //apple
int b = (18 - a ) / 8  ; // pisang = 1 batang = 1
int c = (b * 4) - 2;
int d = (c - 1 + a) + b * 3;
int n = d;

if (n < 5) {
System.out.println("A");
}
else if (n > 20) {
System.out.println("B");
}
else if (n == 7 || n == 10) {
System.out.println("C");
}
else if (n >= 14 && n <= 18) {
System.out.println("D");
}
else {
System.out.println("E");
}

}
}