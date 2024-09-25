package myfirstpackage;
public class MySecondClass {
        private int firstField;
	private int secondField;
	public int getFirstField() {
            return firstField;
        }
        public void setFirstField(int firstField) {
            this.firstField = firstField;
        }
        public int getSecondField() {
            return secondField;
        }
        public void setSecondField(int secondField) {
            this.secondField = secondField;
        }

	public MySecondClass(int firstField, int secondField) {
            this.firstField = firstField;
            this.secondField = secondField;
        }
        public int min(int firstField, int secondField) {
        if (firstField > secondField) {
            return secondField;
        }
         
        else {
            return firstField;
        }
        
        }
        
      }
