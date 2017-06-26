import java.util.*;
public class Arre2D{

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.entrada);
        int mayor = 9;
        int suma = 0;
        int arr[][] = new int[6][6];
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = entrada.nextInt();
            }
        }
        for(int i=0;i<4;i++){
           for(int j=0;j<4;j++){
            suma = arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
            if(suma > mayor){
                mayor=suma;
            }   
           }
        }
        System.out.println(mayor);
    }
}

