public class students {
    int idstudent;
    public students(){};
    public int getIdStudent() {
        return idstudent;
    }

    public void setIdStudent(int idStudent) {
        this.idstudent = idStudent;
    }
    public int[] sort(int []idNumber,int len){
        int tmp = 0;
        for (int i = 0 ; i < len; i++){
            for (int j = len -1;j >= (i+1);j--){
                if(idNumber[j]<idNumber[j-1]){
                    tmp = idNumber[j];
                    idNumber[j]= idNumber[j-1];
                    idNumber[j-1] = tmp;
                }

            }
        }
        return  idNumber;
    }
}