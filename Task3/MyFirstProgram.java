class MyFirstClass {
 	public static void main(String[] s) {
        MySecondClass o = new MySecondClass(0, 0); // Необходимо перед компиляцией передавать любые два целых значения, так как мы написали конструктор, иначе ошибка компиляции
        System.out.println(o.min()); // Необходимо передавать два целых значения перед компиляцией, этого требует метод min, иначе ошибка компиляции
        for (int i = 1; i <= 8; i++) {
        	for(int j = 1; j <= 8; j++) {
                o.setFirstField(i);
                o.setSecondField(j);
                System.out.print(o.min(i, j));
                System.out.print(" ");
                }
                System.out.println(); 
     	
        }
   }

}

class MySecondClass {
        private int firstField;
	private int secondField;
	int getFirstField() {
            return firstField;
        }
        void setFirstField(int firstField) {
            this.firstField = firstField;
        }
        int getSecondField() {
            return secondField;
        }
        void setSecondField(int secondField) {
            this.secondField = secondField;
        }

	MySecondClass(int firstField, int secondField) {
            this.firstField = firstField;
            this.secondField = secondField;
        }
        int min(int firstField, int secondField) {
        if (firstField > secondField) {
            return secondField;
        }
         
        else {
            return firstField;
        }
        
        }
        
      }

