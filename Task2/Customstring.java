package com.Task2;



class Customstring{
    String str;
    Customstring(String myString){
        this.str=myString;

    }


    public String concat(String FirstString) {
        return this.str + FirstString + "";
    }

    public char charAt( int index)
    {

        if(str.length() == 0){
            str = this.str;
        }

        char[]arr = str.toCharArray();
        if(index<arr.length) {
            return arr[index];

        }
        return '\0';

    }


    public boolean equals(String oldstring , String newstring ) {

        if(oldstring.length() == 0){
            oldstring = this.str;
        }

        char[]arr = oldstring.toCharArray();
        char[]arr2=newstring.toCharArray();

        if ( arr.length!=arr2.length){
            return false;
        }
        for(int i=0;i<arr.length;i++) {
            if(arr[i]!=arr2[i]) {
                return false;
            }

        }
        return true;



    }
    public boolean endswith(String value)
    {

        if(value.length() == 0){
            value = this.str;
        }


        char[] arr = value.toCharArray();
        char[] arrY = this.str.toCharArray();
        String testX = "";
        for(int i=arr.length-arr.length;i<arrY.length;i++) {
            testX = testX + arrY[i];
        }


        boolean test = equals(testX,this.str);

        return test;

    }

    public int indexof(String value)
    {

        if(value.length() == 0){
            value = this.str;
        }



        char[] arr = value.toCharArray();
        char[] arrX = this.str.toCharArray();
        boolean test = false;
        int valueX = -1;
        for(int i=0;i<arr.length;i++) {
            if(test == true){
                return valueX;
            }
            if(arr[i] == arrX[0]){
                valueX = i;
                for(int j=0;j<arrX.length;j++){
                    if(arr[i+j] == arrX[j]){
                        test = true;
                    }
                    else{
                        test = false;
                        valueX = -1;
                        break;
                    }
                }

            }
        }
        return valueX;
    }


    public boolean isEmpty() {
        if(this.str.length()==0) {
            return true;
        }
        return false;
    }
    public String replace(char oldChar ,char newChar) {
        char[] arr = this.str.toCharArray();
        String test = "";
        for(int i=0;i<this.str.length();i++){

            if(arr[i] == oldChar){
                test = test + this.str;
            }
            else{
                test = test + arr[i];
            }

        }
        return test;
    }



    public String toLowerCase() {
        char strArr[] = this.str.toCharArray();
        String test = "";
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i] >= 'A' && strArr[i] <= 'Z') {
                strArr[i] = (char) ((int) strArr[i] +32);
            }
        }


        for (int i = 0; i < strArr.length; i++) {
            test = test + strArr[i];
        }

        return test;

    }



    public String toUppercase() {
        char strArr[] = this.str.toCharArray();
        String test = "";
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i] >= 'a' && strArr[i] <= 'z') {
                strArr[i] = (char) ((int) strArr[i] -32);
            }
        }

        for (int i = 0; i < strArr.length; i++) {
            test = test + strArr[i];
        }

        return test;

    }
    public String substring(int StartXTest, int StartYTest ) {
        char[] strArr = this.str.toCharArray();
        String test = "";
        for (int i = StartXTest; i <= StartYTest
                ; i++) {
            test = test + strArr[i];

        }

        return test;


    }
    public boolean contains(String str)
    {
        char[] arr = this.str.toCharArray();
        char[] arrX = str.toCharArray();
        boolean test = false;
        if(arrX.length > arr.length) {
            return false;
        }
        for(int i=0;i<arr.length;i++) {
            if(test == true){
                return true;
            }
            if(arr[i] == arrX[0]) {
                for(int j = 0; j<arrX.length;j++){
                    if(arr[i+j] == arrX[j]){
                        test = true;
                    }
                    else{
                        test = false;
                        break;
                    }
                }
            }


        }

        return test;

    }
    public String trim(String str)
    {
        char[] arr = str.toCharArray();
        String test = "";
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == ' '){
                arr[i] = '*';
            }
            else{
                break;
            }

        }

        for(int i = arr.length-1; i >= 0; i--){
            if(arr[i] == ' '){
                arr[i] = '*';
            }
            else{
                break;
            }

        }


        for(int i = 0; i < arr.length; i++){
            if(arr[i] != '*'){
                test = test + arr[i];
            }
            else{
                continue;
            }

        }


        return test;

    }



    public int lastindex(char StartXTest) {
        char[] arr = this.str.toCharArray();
        int test = 0;
        for (int i = 0; i < arr.length; i++) {
            if (StartXTest == arr[i]){
                test = i;
            }

        }

        return test;


    }


    public int indexOf(String str)
    {
        char[] arr = this.str.toCharArray();
        char[] arrX = str.toCharArray();
        boolean test = false;
        int value = -1;
        for(int i=0;i<arr.length;i++) {
            if(test == true){
                return value;
            }
            if(arr[i] == arrX[0]){
                value = i;
                for(int j=0;j<arrX.length;j++){
                    if(arr[i+j] == arrX[j]){
                        test = true;
                    }
                    else{
                        test = false;
                        value = -1;
                        break;
                    }
                }
            }
        }
        return value;
    }







    public String replaceAll(String str)
    {
        char[] arr = this.str.toCharArray();
        char[] arrX = str.toCharArray();
        char[] arrY = this.str.toCharArray();
        boolean test = false;
        int value = 0;
        String ValueReI = "";
        for(int i=0;i<arr.length;i++) {
            if(test == true){
                for(int item=0; item<arrX.length;item++){
                    arr[item+value] = arrY[item] ;
                }
                test = false;
            }
            if(arr[i] == arrX[0]){
                value = i;
                for(int j=0;j<arrX.length;j++){
                    if(arr[i+j] == arrX[j]){
                        test = true;

                    }
                    else{
                        value = 0;
                        test = false;
                        break;
                    }
                }
            }


        }


        for(int x=0; x<arr.length;x++){
            ValueReI = ValueReI+ arr[x];
        }
        return ValueReI;
    }



    public boolean startsWith(String str)
    {
        char[] arr = this.str.toCharArray();
        char[] arrX = str.toCharArray();
        boolean test = false;
        if(arrX.length >= arr.length) {
            return false;
        }
        for(int i=0;i<arr.length;i++) {
            if(test == true){
                return true;
            }
            if(arr[i] == arrX[0]) {
                for(int j = 0; j<arrX.length;j++){
                    if(arr[i] == arrX[j]){
                        test = true;
                    }
                    else{
                        test = false;
                        break;
                    }
                }
            }


        }

        return test;

    }



    public String[] split(String Text) {


        boolean test = false;
        int testXX = -1;
        String ValueX = "";


        char[] arr = Text.toCharArray();
        char[] arrX = this.str.toCharArray();
        int count = 0;
        String[] arrY = new String[arr.length];

        for(int i=0;i<arr.length;i++) {



            if(arr[i] == arrX[0]) {
                testXX = i;
                for(int j = 0; j<arrX.length;j++){
                    if(arr[i+j] == arrX[j]){
                        test = true;
                    }
                    else{
                        test = false;
                        ValueX = ValueX + arr[i];
                        break;
                    }
                }
            }


            if(arr[i] != arrX[0]){
                ValueX = ValueX + arr[i];
            }

            if(test == true){
                //  ValueX = ValueX + strX;
                arrY[i] = ValueX;
                ValueX = "";
                i = i + (ValueX.length()-1);
                test = false;
            }


        }


        for(String w:arrY){
            if(w != null){
                count = count + 1;
            }
        }

        String ArrXY[] = new String[count+1];


        count = 0;

        for(String x:arrY){
            if(x != null){
                ArrXY[count] = x;
                count = count + 1;
            }
        }

        ArrXY[count] = ValueX;

        return ArrXY;


    }








    public int compareTo(String str ) {
        char[] arr = str.toCharArray();
        char[] arrX = this.str.toCharArray();

        for(int i=0; i<arr.length;i++){
            if((int)arr[i] == (int)arrX[i]){
                continue;
            }
            else{
                return ((int)arr[i] - (int)arrX[i]);
            }
        }

        return 0;
    }

    public int compareToIgnorance( String strX) {

        String testX = this.str.toLowerCase();
        String testY =  strX.toUpperCase();

        char[] arr = testX.toCharArray();
        char[] arrX = testY.toCharArray();

        for(int i=0; i<arr.length;i++){
            if((int)arr[i] == (int)arrX[i]){
                continue;
            }
            else{
                return ((int)arr[i] - (int)arrX[i]);
            }
        }

        return 0;
    }









}




