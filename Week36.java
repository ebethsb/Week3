package wk3;

public class Week36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		double[] newArray = { 3, 9, 23, 64, 2, 8, 28, 93, 13 };
		

		double length = newArray.length;
		double sum = 0;
		for (int i = 0; i < newArray.length; i++) {
			sum += newArray[i];

		}
		double ave = sum / length;
		System.out.println(ave);
	}

	

public static void compareArrays


        (double[] array1, double[] array2) {
        boolean b = true;
        if (array1 != null && array2 != null){
      if (array1.length != array2.length)
          b = false;
      else
          for (int i = 0; i < array2.length; i++) {
              if (array2[i] != array1[i]) {
                  b = false;    
              }                 
        }
    }else{
      b = false;
    }
    System.out.println(b);
}
}
