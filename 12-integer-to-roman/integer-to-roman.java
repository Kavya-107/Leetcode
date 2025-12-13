class Solution {
    public String intToRoman(int num) {
        String s  = Integer.toString(num);
        StringBuilder sb= new StringBuilder();
        while(num>=1000)
        {
            sb=sb.append("M");
            num-=1000;
        }
        if( num>=900)
        {
            sb = sb.append("CM");
            num-=900;
        }
        while(num>=500){
            sb.append("D");
            num-=500;
        }
        if(num>=400)
        {
            sb = sb.append("CD");
            num-=400;
        }
        while(num>=100){
            sb=sb.append("C");
            num-=100;
        }
        if( num>=90)
        {
            sb = sb.append("XC");
            num-=90;
        }
        while(num>=50){
            sb.append("L");
            num-=50;
        }
        if(num>=40)
        {
            sb = sb.append("XL");
            num-=40;
        }
        while(num>=10){
            sb=sb.append("X");
            num-=10;
        }
        if( num==9)
        {
            sb = sb.append("IX");
            num-=9;
        }
        while(num>=5){
            sb.append("V");
            num-=5;
        }
        if(num==4)
        {
            sb = sb.append("IV");
            num-=4;
        }
        while(num>=1)
        {
            sb=sb.append("I");
            num-=1;
        }
        return sb.toString();
    }
}