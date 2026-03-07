class Solution {
    public int romanToInt(String s) {

        char arr[] = s.toCharArray();
        int len = s.length(), sum = 0;
       // System.out.println(len);
        for (int i = 0; i < len; i++) {
            if (arr[i] == 'I') {
                
                    if (i + 1 < len && arr[i + 1] == 'V')
                       { sum = sum + 4;
                       i++;}
                    else if (i + 1 < len && arr[i + 1] == 'X')
                        {sum = sum + 9;
                        i++;
                        }

               else
               sum++;
            } 
            else if (arr[i] == 'V')
                sum = sum + 5;
            else if (arr[i] == 'X') {
                if (i + 1 < len && arr[i + 1] == 'L')
                  {  sum = sum + 40;
                  i++;
                  }
                else if (i + 1 < len && arr[i + 1] == 'C')
                   { sum = sum + 90;
                   i++;
                   }
                else
                    sum = sum + 10;
            } else if (arr[i] == 'L')
                sum = sum + 50;
            else if (arr[i] == 'C') {
                if (i + 1 < len && arr[i + 1] == 'D')
                   { sum = sum + 400;
                   i++;
                   }
                else if (i + 1 < len && arr[i + 1] == 'M')
                   { sum = sum + 900;
                   i++;}
                else
                    sum = sum + 100;
            }
             else if (arr[i] == 'D')
                sum = sum + 500;
            else if (arr[i] == 'M')
                sum = sum + 1000;
        }
        return sum;
    }
}