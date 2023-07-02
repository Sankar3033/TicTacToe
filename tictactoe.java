package hclqn;
import java.util.*;
public class Appranixqntictactoe {
			
			private static boolean gameEnds(int arr[][]) {
				if((arr[0][0]==arr[1][1] && arr[0][0]==arr[2][2]) || (arr[0][2]==arr[1][1] && arr[0][2]==arr[2][0])) return false;
				for(int i=0;i<3;i++) {
					if(arr[i][0]==arr[i][1] && arr[i][0]==arr[i][2]) return false;
				}
				for(int i=0;i<3;i++) {
					if(arr[0][i]==arr[1][i] && arr[0][i]==arr[2][i]) return false;
				}
				return true;
			}
			
			public static void main(String args[]) {
			Scanner s=new Scanner(System.in);
			boolean condition = true;char input;int player1=1,player2=0,turn=1;
			int checkArr[][]= {{1,2,3},{4,5,6},{7,8,9}};
			System.out.println("\t\t\t\tG A M E   S T A R T S ");
			char arr[] ="|---|---|---|| 1 | 2 | 3 || 4 | 5 | 6 || 7 | 8 | 9 ||---|---|---|".toCharArray();
			while(condition) {
				System.out.print("\n\t\t\t\t");
				for(int i=0;i<arr.length;i++) {
					System.out.print(arr[i]);
					if(i+1 <arr.length && arr[i]== '|' && arr[i+1]=='|') {
						System.out.println();System.out.print("\t\t\t\t");
					}
				}turn=(player1==1)?1:2;
				System.out.print("\n\t\t\t\tEnter Player"+turn+" input to inserted in : ");
				input=s.nextLine().charAt(0);
				if(player1==1) {for(int i=0;i<arr.length;i++) {if(arr[i]==input) {arr[i] = 'x';player1=0;player2=1;}}}
				if(player2==1)for(int i=0;i<arr.length;i++) {if(arr[i]==input) {arr[i] = 'o';player2=0;player1=1;}}
				for(int i=0;i<3;i++) {
					for(int j=0;j<3;j++) {
						if(checkArr[i][j]==Character.getNumericValue(input)) {checkArr[i][j]=(player1==0)?0:1;}
					}
				}
				condition=gameEnds(checkArr);
			}
			System.out.println("\n\t\t\t\tPlayer"+turn+" is Winner !!");
		}
}
