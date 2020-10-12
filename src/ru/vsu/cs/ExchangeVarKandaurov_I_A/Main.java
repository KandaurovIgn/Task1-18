package ExchangeVarKandaurov;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int aVar;
	int bVar;
	int cVar;
//Получение значений
	aVar = getVar();
	bVar = getVar();
	cVar = getVar();
//Вывод значений
    showAllVar(aVar, bVar, cVar);
//Обмен значениями
        //Exchange aVar with bVar (a -> b)
        aVar = aVar * bVar;
        bVar = aVar / bVar;
        aVar = aVar / bVar;
        //------------------------------------

        //Exchange bVar with cVar (b -> c)
        bVar = bVar * cVar;
        cVar = bVar / cVar;
        bVar = bVar / cVar;
        //------------------------------------

        //Exchange cVar with aVar (c -> a)
        cVar = cVar * aVar;
        aVar = cVar / aVar;
        cVar = cVar / aVar;
        //------------------------------------
        //Вывод значений
     showAllVar(aVar, bVar, cVar);
    }

    static int getVar()
    {
        Scanner s1 = new Scanner (System.in);
        int tempVar;

        System.out.print("Введите значение переменной:");
        tempVar = s1.nextInt();
        return tempVar;
    }

    static void showAllVar(int a, int b, int c)
    {
        System.out.print("Значения всех переменных: Avar=" + a);
        System.out.print(" Bvar=" + b);
        System.out.println(" Cvar=" + c);
    }

}
